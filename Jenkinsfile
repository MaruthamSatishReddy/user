pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/MaruthamSatishReddy/user.git']])
        sh 'mvn clean package'

        // Build the Docker image using the Dockerfile
        script {
          docker.build('user-service', '.')
        }
      }
    }

    stage('Publish') {
      steps {
        // Push the Docker image to a Docker registry
      docker.withRegistry(credentialsId: 'Docker', url: 'https://hub.docker.com/') {
          dockerImage.push()
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
