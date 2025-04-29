package org.jellyfin.playback.media3.exoplayer

import io.github.peerless2012.ass.media.type.AssRenderType
import kotlin.time.Duration

data class ExoPlayerOptions(
	val httpConnectTimeout: Duration? = null,
	val httpReadTimeout: Duration? = null,
	val preferFfmpeg: Boolean = false,
	val assRenderType: AssRenderType? = null,
	val enableDebugLogging: Boolean = false,
)
