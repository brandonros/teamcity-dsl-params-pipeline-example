package _Self

import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object VcsRoot : GitVcsRoot({
    name = "VcsRoot"
    url = DslContext.getParameter("repoUrl")
})
