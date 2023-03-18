pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/MaruthamSatishReddy/user.git']])
        sh 'mvn clean package'

        // Build the Docker image using the Dockerfi
      }
    }

stage('Build and Push Docker Image') {
   steps {
      script {
         docker.withRegistry(credentialsId: 'Docker', url: 'https://hub.docker.com/') {
            docker.build('user-service')
            docker.withPush()
         }
      }
   }
}

  post {
    always {
      // Clean up the Docker image after the build
      script {
        dockerImage.remove()
      }
    }
  }
}
}
