package com.chen.libnavcompiler

import com.google.auto.service.AutoService
import javax.annotation.processing.*
import javax.lang.model.SourceVersion
import javax.lang.model.element.TypeElement


@AutoService(Process::class)
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@SupportedAnnotationTypes(
    "com.chen.libnavannotation.ActivityDestination",
    "com.chen.libnavannotation.FragmentDestination"
)
class NavProcessor : AbstractProcessor() {
    override fun process(p0: MutableSet<out TypeElement>?, p1: RoundEnvironment?): Boolean {
        return false
    }

    override fun init(processingEnv: ProcessingEnvironment?) {
        super.init(processingEnv)

    }
}