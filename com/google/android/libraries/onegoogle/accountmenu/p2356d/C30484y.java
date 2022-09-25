package com.google.android.libraries.onegoogle.accountmenu.p2356d;

import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.d.y */
/* compiled from: PG */
public final class C30484y extends C30465f {

    /* renamed from: c */
    public boolean f82337c;

    /* renamed from: d */
    private final C30306o f82338d;

    /* renamed from: e */
    private final C30282k f82339e = new C30483x(this);

    public C30484y(C30306o oVar) {
        this.f82338d = oVar;
        this.f82337c = true;
        mo36105d();
    }

    /* renamed from: a */
    public final void mo36075a() {
        C19559g.m37304c();
        C30306o oVar = this.f82338d;
        oVar.f81934a.f81880a.add(this.f82339e);
        mo36105d();
    }

    /* renamed from: b */
    public final void mo36076b() {
        C19559g.m37304c();
        C30306o oVar = this.f82338d;
        oVar.f81934a.f81880a.remove(this.f82339e);
    }

    /* renamed from: d */
    public final void mo36105d() {
        boolean z = false;
        if (this.f82337c && C30281j.m56319c(this.f82338d.f81934a.f81883d) != null) {
            z = true;
        }
        mo36077c(z);
    }
}
