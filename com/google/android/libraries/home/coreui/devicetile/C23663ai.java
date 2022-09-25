package com.google.android.libraries.home.coreui.devicetile;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.ai */
/* compiled from: PG */
public final class C23663ai extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C23674at f64726a;

    public C23663ai(C23674at atVar) {
        this.f64726a = atVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C69664n.m101061g(animator, "animation");
        TextView textView = this.f64726a.f64769t;
        if (textView != null) {
            textView.setAlpha(1.0f);
        }
        this.f64726a.f64744H = null;
    }
}
