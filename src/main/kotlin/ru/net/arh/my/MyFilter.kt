package ru.net.arh.my

import javax.servlet.*

open class MyFilter : Filter {
    override fun destroy() {
    }

    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain?) {
        chain?.doFilter(request, response)
    }

    override fun init(p0: FilterConfig?) {
    }
}