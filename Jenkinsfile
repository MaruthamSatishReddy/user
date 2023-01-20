pipeline {
    agent any
    tools {
    maven 'Maven'
    }
    stages {
        stage('Maven Build') {
           steps{
               withMaven(maven: 'Maven') {
               sh 'mvn clean install'
           }
         }
       }
    }
  }
