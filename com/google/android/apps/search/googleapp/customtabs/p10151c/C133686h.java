package com.google.android.apps.search.googleapp.customtabs.p10151c;

import com.google.android.apps.search.googleapp.customtabs.p10152d.C133746g;
import com.google.android.libraries.p1703d.C20665u;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.c.h */
/* compiled from: PG */
public final /* synthetic */ class C133686h implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C133691m f364136a;

    /* renamed from: b */
    public final /* synthetic */ C133746g f364137b;

    public /* synthetic */ C133686h(C133691m mVar, C133746g gVar) {
        this.f364136a = mVar;
        this.f364137b = gVar;
    }

    public final Object call() {
        C133691m mVar = this.f364136a;
        C20665u uVar = this.f364137b.f364285c;
        Integer iG = uVar.mo25584iG();
        C133692n nVar = (C133692n) C133693o.f364157f.createBuilder();
        int intValue = iG != null ? iG.intValue() : 0;
        nVar.copyOnWrite();
        C133693o oVar = (C133693o) nVar.instance;
        oVar.f364159a |= 1;
        oVar.f364160b = intValue;
        long b = mVar.f364153f.mo26870b();
        nVar.copyOnWrite();
        C133693o oVar2 = (C133693o) nVar.instance;
        oVar2.f364159a |= 4;
        oVar2.f364162d = b;
        String str = uVar.f57932a;
        nVar.copyOnWrite();
        C133693o oVar3 = (C133693o) nVar.instance;
        str.getClass();
        oVar3.f364159a |= 8;
        oVar3.f364163e = str;
        boolean f = uVar.mo25583f();
        nVar.copyOnWrite();
        C133693o oVar4 = (C133693o) nVar.instance;
        oVar4.f364159a |= 2;
        oVar4.f364161c = f;
        return (C133693o) nVar.build();
    }
}
