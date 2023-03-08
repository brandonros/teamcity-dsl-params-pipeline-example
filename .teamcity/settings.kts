// documentation: https://build.bitcoinabc.org/app/dsl-documentation/jetbrains.build-server.configs.kotlin.v2019_2/-build-steps/index.html

package _Self

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

version = "2019.2"

project {
    params {
        param("teamcity.ui.settings.readOnly", "true")
    }

    vcsRoot(_Self.VcsRoot)
    buildType(_Self.Pipeline)
    sequential {
        buildType(_Self.Pipeline)
    }
}
