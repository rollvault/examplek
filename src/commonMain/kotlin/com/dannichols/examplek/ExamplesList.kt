package com.dannichols.examplek

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class ExamplesList(val itemTemplate: String = "%s")
