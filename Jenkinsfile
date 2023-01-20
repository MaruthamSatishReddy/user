pipeline {
    agent any
    tools {
    maven 'Maven 3.6.3'
    }
    stages {
        stage('Maven Build') {
           steps{
               withMaven(maven: 'Maven 3.6.3') {
               sh 'mvn clean install'
           }
         }
       }
    }
  }
