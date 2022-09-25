package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.aq */
/* compiled from: PG */
final class C109099aq extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final View f303732a;

    /* renamed from: b */
    private final C109100ar f303733b;

    public C109099aq(View view, C109100ar arVar) {
        this.f303732a = view;
        this.f303733b = arVar;
    }

    public final void onAnimationCancel(Animator animator) {
        C114034q.m188816l(this.f303732a);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f303732a.setVisibility(8);
        C109100ar arVar = this.f303733b;
        if (arVar.f303770c.getVisibility() == 8 && arVar.f303771d.getVisibility() == 8) {
            this.f303733b.mo97605v();
        }
    }
}
