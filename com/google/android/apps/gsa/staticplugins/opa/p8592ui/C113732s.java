package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C114006cp;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.s */
/* compiled from: PG */
public final class C113732s implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final View f314965a;

    /* renamed from: b */
    private final C114006cp f314966b;

    public C113732s(View view, C114006cp cpVar) {
        this.f314965a = view;
        this.f314966b = cpVar;
    }

    public final void onGlobalLayout() {
        int visibility = this.f314965a.getVisibility();
        Object tag = this.f314965a.getTag();
        if (tag == null || ((Integer) tag).intValue() != visibility) {
            this.f314965a.setTag(Integer.valueOf(visibility));
            if (visibility == 0) {
                this.f314966b.f315649a.f315853ak.mo100786j(true);
                return;
            }
            C114006cp cpVar = this.f314966b;
            if (cpVar.f315649a.f315856an.mo101172s() == 3 && cpVar.f315649a.f315853ak.mo100800x()) {
                C114071eg egVar = cpVar.f315649a;
                if (!egVar.f315845ac) {
                    egVar.f315853ak.mo100796t(true);
                }
            }
        }
    }
}
