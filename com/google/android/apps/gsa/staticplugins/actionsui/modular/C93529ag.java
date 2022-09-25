package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.TimeAnimator;
import android.text.format.Time;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ag */
/* compiled from: PG */
public final class C93529ag implements TimeAnimator.TimeListener {

    /* renamed from: a */
    final /* synthetic */ AudioArgumentView f261165a;

    public C93529ag(AudioArgumentView audioArgumentView) {
        this.f261165a = audioArgumentView;
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        Time time = new Time();
        time.set(j);
        this.f261165a.f261003b.setText(time.format("%M:%S"));
    }
}
