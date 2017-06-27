pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                checkout scm
                sh 'ant run'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            /*when {
                expression { BRANCH_NAME ==~ /(production|staging)/ }
                anyOf {
                    environment name: 'DEPLOY_TO', value: 'production'
                    environment name: 'DEPLOY_TO', value: 'staging'
                }
            }*/
            steps {
                echo 'Deploying....'
            }
        }
    }
    post {
       always {
                echo 'This will always run..'
        }
       success {
                echo 'This will run only if successful..'
                mail to: "satyapriya.das@cognizant.com", subject:"SUCCESS: ${currentBuild.fullDisplayName}", body: "Yay,our Jenkins build passed."
       }
       failure {
                echo 'This will run only if failed..'
                mail to: "satyapriya.das@cognizant.com", subject:"SUCCESS: ${currentBuild.fullDisplayName}", body: "Ohh no,our Jenkins build failed."
       }
       unstable {
                echo 'This will run only if the run was marked as unstable..'
       }
       changed {
                echo 'This will run only if the state of the Pipeline has changed..'
                echo 'For example, if the Pipeline was previously failing but is now successful..'
       }
    }
}
