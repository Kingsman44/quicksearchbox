package com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.a.l */
/* compiled from: PG */
public final /* synthetic */ class C83970l implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ C83973o f228756a;

    public /* synthetic */ C83970l(C83973o oVar) {
        this.f228756a = oVar;
    }

    public final void onGlobalLayout() {
        C83973o oVar = this.f228756a;
        float a = oVar.mo77400a(oVar.f228758a);
        if (a >= 0.0f) {
            C83966h hVar = oVar.f228759b;
            if (hVar != null) {
                hVar.f228750a.mo9705o(a);
            } else {
                oVar.mo77401b(a);
            }
        }
    }
}
