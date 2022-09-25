package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9875d;

import android.animation.Animator;
import android.widget.TextView;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.d.i */
/* compiled from: PG */
final class C130242i implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ TextView f357060a;

    /* renamed from: b */
    final /* synthetic */ C130244k f357061b;

    public C130242i(C130244k kVar, TextView textView) {
        this.f357061b = kVar;
        this.f357060a = textView;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f357060a.setText(this.f357061b.f357067c);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
