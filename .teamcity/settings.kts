// documentation: https://build.bitcoinabc.org/app/dsl-documentation/jetbrains.build-server.configs.kotlin.v2019_2/-build-steps/index.html

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2019.2"

project {
    vcsRoot(Sources)

    buildType(Build)

    sequential {
        buildType(Build)
    }
}

object Sources : GitVcsRoot({
    name = "Sources"
    url = DslContext.getParameter("repoUrl")
})

object Build : BuildType({
    name = "Build"

    artifactRules = DslContext.getParameter("artifactPath")

    vcs {
        root(Sources)
    }

    steps {
        script {
            name = "001-dotnet clean"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "002-dotnet build"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "003-dotnet unit test"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "004-remove read-only attribute from web.config prior to dotnet publish"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "005-dotnet publish (to artifactory)"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "006-resharper inspections"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "007-run tests"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "008-fortify scan"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "009-octo pack"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "010-octopus create release and deploy"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "011-sonarqube scan"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }
    }
})
