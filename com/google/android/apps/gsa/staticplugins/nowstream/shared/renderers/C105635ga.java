package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.p489g.p494d.C9251ef;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ga */
/* compiled from: PG */
final class C105635ga extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f294713a;

    /* renamed from: b */
    final /* synthetic */ C9251ef f294714b;

    /* renamed from: c */
    final /* synthetic */ C105638gd f294715c;

    public C105635ga(C105638gd gdVar, int i, C9251ef efVar) {
        this.f294715c = gdVar;
        this.f294713a = i;
        this.f294714b = efVar;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f294715c.f294728i.getVisibility() != 0) {
            this.f294715c.f294728i.setVisibility(0);
            C105638gd gdVar = this.f294715c;
            gdVar.f294728i.setY((float) ((this.f294713a + gdVar.f294733n) - gdVar.f294724e.getResources().getDimensionPixelSize(R.dimen.tooltip_negative_margin)));
            ViewPropertyAnimator viewPropertyAnimator = this.f294715c.f294731l;
            viewPropertyAnimator.getClass();
            viewPropertyAnimator.alpha(true != this.f294714b.f31994e ? 1.0f : 0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(300).setInterpolator(C105638gd.f294720b).setListener(this.f294715c.f294730k).yBy((float) (-this.f294715c.f294733n));
        }
    }
}
