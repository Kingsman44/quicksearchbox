package com.google.android.apps.gsa.searchplate.widget;

import android.animation.TimeAnimator;

/* renamed from: com.google.android.apps.gsa.searchplate.widget.a */
/* compiled from: PG */
final class C88980a implements TimeAnimator.TimeListener {

    /* renamed from: a */
    final /* synthetic */ AudioProgressRenderer f241139a;

    public C88980a(AudioProgressRenderer audioProgressRenderer) {
        this.f241139a = audioProgressRenderer;
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        this.f241139a.invalidate();
    }
}
