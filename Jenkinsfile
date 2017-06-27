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
            steps {
                echo 'Deploying....'
            }
        }
        post {
            always {
                echo 'This will always run..'
            }
            success {
                echo 'This will run only if successful..'
                // Output it to the console:
                echo "STARTED BY USER = ${STARTED_BY}"
                // refine this to just the user name:
                //export JUST_NAME="`echo "${STARTED_BY}" | sed "s@Started by user@@"`"
                echo "Hello ${BUILD_USER},Build Successfull..for more info check $BUILD_URL"
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
}
