package org.jellyfin.androidtv.preference.constant

import org.jellyfin.androidtv.R
import org.jellyfin.preference.PreferenceEnum

enum class AssBehavior(
	override val nameRes: Int,
) : PreferenceEnum {

	/**
	 * Use SubtitleView to render the subtitle.
	 */
	LEGACY(R.string.prefer_exoplayer_ass_mode_legacy),

	/**
	 * Use Canvas effect to render the subtitle.
	 */
	CANVAS(R.string.prefer_exoplayer_ass_mode_canvas),

	/**
	 * Use GL effect to render the subtitle.
	 */
	OPEN_GL(R.string.prefer_exoplayer_ass_mode_open_gl),
}
