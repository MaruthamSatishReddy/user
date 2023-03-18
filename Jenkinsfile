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

  }
}
