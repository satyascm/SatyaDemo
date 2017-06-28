pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                 echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                checkout scm
                sh 'ant run'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy - Staging') {
            steps {
                 echo 'Deploying....to staging'
            }
        }

        stage('Sanity check') {
            steps {
                input "Does the staging environment look ok?"
            }
        }

        stage('Deploy - Production') {
            steps {
              echo 'Deploying....to staging'
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
