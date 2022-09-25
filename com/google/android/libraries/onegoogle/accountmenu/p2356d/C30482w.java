package com.google.android.libraries.onegoogle.accountmenu.p2356d;

import com.google.android.libraries.onegoogle.account.p2347c.C30170d;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.d.w */
/* compiled from: PG */
public final class C30482w extends C30465f {

    /* renamed from: c */
    private final C30306o f82334c;

    /* renamed from: d */
    private final C30282k f82335d;

    public C30482w(C30306o oVar, C30170d dVar) {
        this.f82334c = oVar;
        this.f82335d = new C30481v(this, dVar);
    }

    /* renamed from: a */
    public final void mo36075a() {
        C19559g.m37304c();
        C30306o oVar = this.f82334c;
        oVar.f81934a.f81880a.add(this.f82335d);
        this.f82335d.mo18106c(C30281j.m56319c(this.f82334c.f81934a.f81883d));
    }

    /* renamed from: b */
    public final void mo36076b() {
        C19559g.m37304c();
        C30306o oVar = this.f82334c;
        oVar.f81934a.f81880a.remove(this.f82335d);
    }
}
