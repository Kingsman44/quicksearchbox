package com.google.android.apps.gsa.voiceime.view;

import android.animation.TimeAnimator;

/* renamed from: com.google.android.apps.gsa.voiceime.view.a */
/* compiled from: PG */
final class C118698a implements TimeAnimator.TimeListener {

    /* renamed from: a */
    final /* synthetic */ DrawSoundLevelsView f331109a;

    public C118698a(DrawSoundLevelsView drawSoundLevelsView) {
        this.f331109a = drawSoundLevelsView;
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        int i = this.f331109a.f331102c.f253832a.get();
        DrawSoundLevelsView drawSoundLevelsView = this.f331109a;
        int i2 = drawSoundLevelsView.f331100a;
        if (i > i2) {
            drawSoundLevelsView.f331100a = Math.min(i, i2 + 10);
        } else {
            drawSoundLevelsView.f331100a = Math.max(i, i2 - 10);
        }
        this.f331109a.invalidate();
    }
}
