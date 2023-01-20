pipeline {
    agent any
    tools {
    maven 'Maven 3.8.1'
    }
    stages {
        stage('Maven Build') {
           steps{
               checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/MaruthamSatishReddy/user.git']])
               sh 'mvn clean install'
           
         }
       }
    }
  }
