package com.siuzannasmolianinova.hw36.data.networking

import com.squareup.moshi.Json
import retrofit2.Converter
import retrofit2.Retrofit
import java.lang.reflect.Type

class EnumConverterFactory : Converter.Factory() {
    override fun stringConverter(
        type: Type,
        annotations: Array<out Annotation>,
        retrofit: Retrofit
    ): Converter<Enum<*>, String>? =
        if (type is Class<*> && type.isEnum) {
            Converter { enum ->
                try {
                    enum.javaClass.getField(enum.name)
                        .getAnnotation(Json::class.java)?.name
                } catch (e: Exception) {
                    null
                } ?: enum.toString()
            }
        } else null
}
