pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package'
        script {
          docker.build('user-service', '.')
        }
      }
    }

    stage('Publish') {
      steps {
        // Push the Docker image to a Docker registry
        docker.withRegistry('https://hub.docker.com/', 'Docker') {
          dockerImage.push()
        }
      }
    }
  }

  post {
    always {
        script {
        dockerImage.remove()
      }
    }
  }
}
