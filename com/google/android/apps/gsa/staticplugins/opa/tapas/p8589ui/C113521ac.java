package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.animation.AnimatorListenerAdapter;
import android.view.ViewTreeObserver;
import com.google.android.apps.gsa.shared.p7066m.C90063do;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.ac */
/* compiled from: PG */
final class C113521ac implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final int f314298a;

    /* renamed from: b */
    final /* synthetic */ AnimatorListenerAdapter f314299b;

    /* renamed from: c */
    final /* synthetic */ C113522ad f314300c;

    /* renamed from: d */
    private final int f314301d;

    public C113521ac(C113522ad adVar, AnimatorListenerAdapter animatorListenerAdapter) {
        this.f314300c = adVar;
        this.f314299b = animatorListenerAdapter;
        this.f314298a = adVar.f314302a.getHeight();
        this.f314301d = (int) adVar.f314303b.mo79743a(C90063do.f249519f);
    }

    public final boolean onPreDraw() {
        this.f314300c.f314302a.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = this.f314300c.f314302a.getHeight();
        this.f314300c.f314302a.getLayoutParams().height = this.f314298a;
        this.f314300c.f314302a.requestLayout();
        this.f314300c.f314304c.mo28213m("start animation", (long) this.f314301d, new C113520ab(this, height));
        return false;
    }
}
