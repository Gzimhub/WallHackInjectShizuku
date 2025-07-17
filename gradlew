#!/bin/sh
##############################################################################
## Gradle start up script for UN*X                                         ##
##############################################################################

# Attempt to set APP_HOME
APP_HOME=$(dirname "$0")

# Use the gradle wrapper jar
exec java -Xmx64m -Xms64m -cp "${APP_HOME}/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"