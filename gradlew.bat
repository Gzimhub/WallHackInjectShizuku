@ECHO OFF
@rem ##########################################################################
@rem Gradle start up script for Windows                                       #
@rem ##########################################################################

SET APP_HOME=%~dp0

SET JAVA_EXE=java
"%JAVA_EXE%" -Xmx64m -Xms64m -cp "%APP_HOME%\gradle\wrapper\gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain %*