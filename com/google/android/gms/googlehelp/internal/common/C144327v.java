package com.google.android.gms.googlehelp.internal.common;

import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.googlehelp.C144280a;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.googlehelp.internal.common.v */
/* compiled from: PG */
public final class C144327v extends C144295aa {

    /* renamed from: a */
    final /* synthetic */ InProductHelp f390889a;

    /* renamed from: d */
    final /* synthetic */ WeakReference f390890d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144327v(C143851w wVar, InProductHelp inProductHelp, WeakReference weakReference) {
        super(wVar);
        this.f390889a = inProductHelp;
        this.f390890d = weakReference;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo119854j(C144302ah ahVar) {
        GoogleHelp googleHelp = this.f390889a.f390777a;
        C144280a aVar = googleHelp.f390749L;
        C144304aj.m234566b(aVar, new C144326u(this, ahVar, this, aVar, googleHelp.f390750M), googleHelp);
    }
}
