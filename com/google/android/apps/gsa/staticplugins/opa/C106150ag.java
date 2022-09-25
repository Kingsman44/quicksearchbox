package com.google.android.apps.gsa.staticplugins.opa;

import android.view.ViewTreeObserver;
import com.google.android.apps.gsa.shared.p6983ah.C89150g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ag */
/* compiled from: PG */
public final /* synthetic */ class C106150ag implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ C109040fj f296256a;

    /* renamed from: b */
    public final /* synthetic */ C89150g f296257b;

    public /* synthetic */ C106150ag(C109040fj fjVar, C89150g gVar) {
        this.f296256a = fjVar;
        this.f296257b = gVar;
    }

    public final void onGlobalLayout() {
        C109040fj fjVar = this.f296256a;
        C89150g gVar = this.f296257b;
        boolean z = false;
        if (fjVar.f303449n.isLaidOut() && fjVar.f303226L != null && fjVar.f303296bC) {
            fjVar.mo97512bd(false);
            fjVar.f303296bC = false;
        }
        if (fjVar.f303449n.getVisibility() == 0) {
            z = true;
        }
        gVar.f241686b = z;
        gVar.mo83144r();
    }
}
