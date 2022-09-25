package com.google.android.apps.gsa.staticplugins.opa.soundsearch;

import android.animation.TimeAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.soundsearch.a */
/* compiled from: PG */
final class C110935a implements TimeAnimator.TimeListener {

    /* renamed from: a */
    final /* synthetic */ AudioVisualizerView f309058a;

    public C110935a(AudioVisualizerView audioVisualizerView) {
        this.f309058a = audioVisualizerView;
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        this.f309058a.invalidate();
    }
}
