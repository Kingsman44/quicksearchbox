package com.google.android.apps.gsa.staticplugins.opa.soundsearch;

import android.animation.TimeAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.soundsearch.b */
/* compiled from: PG */
final class C110936b implements TimeAnimator.TimeListener {

    /* renamed from: a */
    final /* synthetic */ AudioWaveformView f309059a;

    public C110936b(AudioWaveformView audioWaveformView) {
        this.f309059a = audioWaveformView;
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        this.f309059a.invalidate();
    }
}
