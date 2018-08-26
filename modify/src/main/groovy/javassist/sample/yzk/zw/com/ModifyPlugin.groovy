package javassist.sample.yzk.zw.com

import org.gradle.api.Plugin
import org.gradle.api.Project


class ModifyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println "this is my custom plugin ModifyPlugin"

        project.android.registerTransform(new ModifyTransform(project))
    }

}