package com.google.android.apps.search.soundsearch.homescreen;

import android.animation.TimeAnimator;

/* renamed from: com.google.android.apps.search.soundsearch.homescreen.a */
/* compiled from: PG */
public final /* synthetic */ class C141718a implements TimeAnimator.TimeListener {

    /* renamed from: a */
    public final /* synthetic */ AudioVisualizerView f384667a;

    public /* synthetic */ C141718a(AudioVisualizerView audioVisualizerView) {
        this.f384667a = audioVisualizerView;
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        this.f384667a.invalidate();
    }
}
