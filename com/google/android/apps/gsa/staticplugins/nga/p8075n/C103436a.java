package com.google.android.apps.gsa.staticplugins.nga.p8075n;

import com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj;
import com.google.android.apps.gsa.shared.p6983ah.C89155l;
import com.google.android.apps.gsa.shared.p6983ah.C89156m;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.n.a */
/* compiled from: PG */
public final /* synthetic */ class C103436a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C103454s f288294a;

    /* renamed from: b */
    public final /* synthetic */ C88079oj f288295b;

    public /* synthetic */ C103436a(C103454s sVar, C88079oj ojVar) {
        this.f288294a = sVar;
        this.f288295b = ojVar;
    }

    public final void run() {
        C103454s sVar = this.f288294a;
        C88079oj ojVar = this.f288295b;
        C89155l lVar = (C89155l) C89156m.f241706i.createBuilder();
        boolean equals = C88079oj.RESUMED.equals(ojVar);
        lVar.copyOnWrite();
        C89156m mVar = (C89156m) lVar.instance;
        mVar.f241708a |= 1;
        mVar.f241709b = equals;
        lVar.copyOnWrite();
        C89156m mVar2 = (C89156m) lVar.instance;
        mVar2.f241714g = ojVar.f238145e;
        mVar2.f241708a |= 32;
        sVar.mo93788a((C89156m) lVar.build());
    }
}
