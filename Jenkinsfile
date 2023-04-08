@Library('easyToBuy-Jenkins_SharedLib') _

pipeline {
   agent any
   stages {
      stage('Git Checkout') {
         steps {
            gitCheckout(
            branch: "master",
            url: "https://github.com/MaruthamSatishReddy/user.git"
            )
         }
      }
      stage('Maven Build') {
               steps {
                  mavenBuild()
               }
            }
      stage('Maven Unit Test')  {
            steps{
            mvnTest()
            }
      }
      stage('Maven Integration Test')  {
                  steps{
                  mavenIntegrationTest()
                  }
            }
         }
   }

