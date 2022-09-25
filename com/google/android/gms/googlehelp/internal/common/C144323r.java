package com.google.android.gms.googlehelp.internal.common;

import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.SupportRequestHelp;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21597i;

/* renamed from: com.google.android.gms.googlehelp.internal.common.r */
/* compiled from: PG */
public final class C144323r extends C144295aa {

    /* renamed from: a */
    final /* synthetic */ SupportRequestHelp f390875a;

    /* renamed from: d */
    final /* synthetic */ C21597i f390876d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144323r(C143851w wVar, C21597i iVar, SupportRequestHelp supportRequestHelp) {
        super(wVar);
        this.f390876d = iVar;
        this.f390875a = supportRequestHelp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo119854j(C144302ah ahVar) {
        C144322q qVar = new C144322q(this);
        SupportRequestHelp supportRequestHelp = this.f390875a;
        GoogleHelp googleHelp = supportRequestHelp.f390789a;
        C144304aj.m234566b(googleHelp.f390749L, new C144321p(this, supportRequestHelp, ahVar, qVar, this.f390876d), googleHelp);
    }
}
