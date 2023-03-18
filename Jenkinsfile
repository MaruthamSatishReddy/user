pipeline {
  agent any

  stages {
    stage('Build') {
      steps {

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
        docker.withRegistry('https://hub.docker.com/', 'Docker') {
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
