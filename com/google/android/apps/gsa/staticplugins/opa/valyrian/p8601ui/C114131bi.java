package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bi */
/* compiled from: PG */
final class C114131bi extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C114132bj f316337a;

    /* renamed from: b */
    final /* synthetic */ int f316338b;

    /* renamed from: c */
    final /* synthetic */ int f316339c;

    public C114131bi(C114132bj bjVar, int i, int i2) {
        this.f316337a = bjVar;
        this.f316338b = i;
        this.f316339c = i2;
    }

    public final void onAnimationEnd(Animator animator) {
        C114132bj bjVar = this.f316337a;
        bjVar.f316345g.f316319a = true;
        bjVar.f316354p = null;
        int i = this.f316339c;
        if (i == 4) {
            ViewGroup viewGroup = bjVar.f316353o;
            if (viewGroup != null) {
                C114132bj.m189293p(viewGroup);
            }
        } else if (i == 3) {
            C114132bj.m189293p(bjVar.f316350l);
        } else {
            C114132bj.m189293p(bjVar.f316352n);
        }
    }

    public final void onAnimationStart(Animator animator) {
        C114132bj bjVar = this.f316337a;
        bjVar.f316345g.f316319a = false;
        if (this.f316338b == 4) {
            ViewGroup viewGroup = bjVar.f316353o;
            if (viewGroup != null) {
                viewGroup.setAlpha(0.0f);
                return;
            }
            return;
        }
        bjVar.f316350l.setAlpha(0.0f);
    }
}
