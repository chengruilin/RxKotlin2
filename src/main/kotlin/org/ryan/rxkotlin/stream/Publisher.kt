package org.ryan.rxkotlin.stream

/**
 * @author ryan
 * @Hangzhou Youzan Technology Co.Ltd
 * @date 2018/4/27
 */
interface Publisher<out T> {
    fun subscribe(subscriber: Subscriber<in T>)
}