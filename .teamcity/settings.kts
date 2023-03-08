// documentation: https://build.bitcoinabc.org/app/dsl-documentation/jetbrains.build-server.configs.kotlin.v2019_2/-build-steps/index.html

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot
import _Self.VcsRoot
import _Self.Pipeline

version = "2019.2"

project {
    params {
        param("teamcity.ui.settings.readOnly", "true")
    }

    vcsRoot(VcsRoot)
    buildType(Pipeline)
    sequential {
        buildType(Pipeline)
    }
}
