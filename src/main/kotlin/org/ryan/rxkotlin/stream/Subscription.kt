package org.ryan.rxkotlin.stream

/**
 * @author ryan
 * @Hangzhou Youzan Technology Co.Ltd
 * @date 2018/4/27
 */
interface Subscription {
    fun request(num: Long)
    fun cancel()
}