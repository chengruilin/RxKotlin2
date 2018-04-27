package org.ryan.rxkotlin.stream

/**
 * @author ryan
 * @Hangzhou Youzan Technology Co.Ltd
 * @date 2018/4/27
 */
interface Subscriber<in T> {
    fun onSubscribe(subscription: Subscription)
    fun onNext(element: T)
    fun onError(throwable: Throwable)
    fun onComplete()
}