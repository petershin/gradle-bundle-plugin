package org.dm.gradle.plugins.bundle

import org.gradle.api.Project
import org.gradle.api.tasks.bundling.Jar
import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

class JarBuilderFactoryDecoratorSpec extends Specification {
    Project project
    Jar jarTask

    def setup() {
        GroovyMock(BundleUtils, global: true)
        project = ProjectBuilder.builder().build()
        jarTask = project.task('jar', type: Jar) as Jar
    }

//    def "creates jarBuilder only once"() {
//        setup:
//        BundleUtils.getResources(jarTask) >> []
//        BundleUtils.getVersion(project) >> ''
//
//        when:
//        def jarBuilder1 = factoryDecorator.create()
//        def jarBuilder2 = factoryDecorator.create()
//
//        then:
//        1 * factory.create() >> new JarBuilder()
//        jarBuilder1.is jarBuilder2
//    }
}
