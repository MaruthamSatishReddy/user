pipeline {
   agent any

   stages {
      stage('Checkout') {
         steps {
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/MaruthamSatishReddy/user.git']]])
         }
      }

      stage('Build') {
         steps {
            sh 'mvn clean package'
         }
      }

      stage('Archive') {
         steps {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
         }
      }

      // Add additional stages as needed for testing and deployment
   }
}

