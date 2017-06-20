package com.gong.kotlin.chapter03

/**
 * Created by gong on 2017/6/20.
 */
class PlayerKt {
    enum class State {
        IDLE, BUFFERING, PLAYING, PAUSED
    }

    private var state = PlayerKt.State.IDLE

    fun pause() {
        when (state) {
            PlayerKt.State.BUFFERING, PlayerKt.State.PLAYING -> doPause()
            else -> { //什么都不做
                println("什么都不做")
            }
        }
    }

    fun resume() {
        when (state) {
            PlayerKt.State.PAUSED -> doResume()
            else -> { //什么都不做
                println("什么都不做")
            }
        }
    }

    private fun doResume() {
        state = State.PLAYING
        //处理真正的继续播放逻辑
    }

    private fun doPause() {
        state = State.PAUSED
        //处理真正的暂停逻辑
    }
}