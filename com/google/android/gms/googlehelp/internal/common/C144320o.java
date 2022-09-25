package com.google.android.gms.googlehelp.internal.common;

import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.SupportRequestHelp;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21598j;

/* renamed from: com.google.android.gms.googlehelp.internal.common.o */
/* compiled from: PG */
public final class C144320o extends C144295aa {

    /* renamed from: a */
    final /* synthetic */ SupportRequestHelp f390867a;

    /* renamed from: d */
    final /* synthetic */ C21598j f390868d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144320o(C143851w wVar, C21598j jVar, SupportRequestHelp supportRequestHelp) {
        super(wVar);
        this.f390868d = jVar;
        this.f390867a = supportRequestHelp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo119854j(C144302ah ahVar) {
        C144319n nVar = new C144319n(this);
        SupportRequestHelp supportRequestHelp = this.f390867a;
        GoogleHelp googleHelp = supportRequestHelp.f390789a;
        C144304aj.m234566b(googleHelp.f390749L, new C144318m(this, supportRequestHelp, ahVar, nVar, this.f390868d), googleHelp);
    }
}
