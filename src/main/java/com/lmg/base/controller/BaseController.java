package com.lmg.base.controller;

import org.springframework.context.annotation.Import;

import com.lmg.base.controller.interceptor.ResponseExceptionInterceptor;
import com.lmg.base.controller.interceptor.ResponseInterceptor;

@Import( {ResponseInterceptor.class, ResponseExceptionInterceptor.class} )
public abstract class BaseController {
}
