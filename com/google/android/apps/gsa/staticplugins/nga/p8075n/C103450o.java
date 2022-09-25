package com.google.android.apps.gsa.staticplugins.nga.p8075n;

import com.google.android.apps.gsa.shared.p6983ah.C89155l;
import com.google.android.apps.gsa.shared.p6983ah.C89156m;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.n.o */
/* compiled from: PG */
public final /* synthetic */ class C103450o implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C103454s f288312a;

    /* renamed from: b */
    public final /* synthetic */ Boolean f288313b;

    public /* synthetic */ C103450o(C103454s sVar, Boolean bool) {
        this.f288312a = sVar;
        this.f288313b = bool;
    }

    public final void run() {
        C103454s sVar = this.f288312a;
        boolean booleanValue = this.f288313b.booleanValue();
        C89155l lVar = (C89155l) C89156m.f241706i.createBuilder();
        lVar.copyOnWrite();
        C89156m mVar = (C89156m) lVar.instance;
        mVar.f241708a |= 2;
        mVar.f241710c = booleanValue;
        if (!booleanValue) {
            lVar.copyOnWrite();
            C89156m mVar2 = (C89156m) lVar.instance;
            mVar2.f241708a |= 4;
            mVar2.f241711d = false;
        } else {
            boolean b = sVar.mo93789b();
            lVar.copyOnWrite();
            C89156m mVar3 = (C89156m) lVar.instance;
            mVar3.f241708a |= 4;
            mVar3.f241711d = b;
        }
        sVar.mo93788a((C89156m) lVar.build());
    }
}
