package com.google.android.apps.gsa.shared.p6993ao;

import com.google.android.apps.gsa.shared.p6975af.C89103b;
import com.google.common.base.C58830au;

/* renamed from: com.google.android.apps.gsa.shared.ao.q */
/* compiled from: PG */
public final class C89252q {

    /* renamed from: a */
    public final C89103b f242008a = new C89103b("SearchPlateHeight");

    /* renamed from: b */
    public boolean f242009b = true;

    /* renamed from: c */
    public float f242010c;

    /* renamed from: d */
    public float f242011d;

    /* renamed from: e */
    public float f242012e;

    /* renamed from: f */
    public C89250o f242013f;

    /* renamed from: a */
    public final void mo83206a(boolean z) {
        this.f242009b = z;
        C89250o oVar = this.f242013f;
        if (oVar != null) {
            oVar.f242006a.mo83196g(z);
        }
    }

    /* renamed from: b */
    public final void mo83207b(float f) {
        this.f242010c = f;
        C89250o oVar = this.f242013f;
        if (oVar != null) {
            oVar.f242006a.mo83195f(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo83208c(C89250o oVar) {
        this.f242013f = oVar;
        oVar.f242006a.mo83195f(this.f242010c);
        oVar.f242006a.mo83194e(this.f242011d);
        oVar.mo83204a();
        oVar.f242006a.f241980e.mo82835i(this.f242012e);
        oVar.f242006a.mo83196g(this.f242009b);
    }

    public final String toString() {
        C58830au auVar = new C58830au("SearchPlateUi");
        auVar.mo56103c("translationY", String.valueOf(this.f242010c));
        auVar.mo56103c("googleLogoAlpha", String.valueOf(this.f242011d));
        auVar.mo56102b("textSearchPlateHeightPx", this.f242008a);
        auVar.mo56103c("show", String.valueOf(this.f242009b));
        return auVar.toString();
    }
}
