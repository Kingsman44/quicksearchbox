package com.google.android.apps.gsa.nga.engine.p5964av.p5967c.p5969b;

import com.google.android.apps.gsa.nga.api.a.bu;
import com.google.android.apps.gsa.nga.api.a.bw;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.search.p2904c.C37672hs;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.av.c.b.t */
/* compiled from: PG */
public final /* synthetic */ class C75141t implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C75142u f209543a;

    public /* synthetic */ C75141t(C75142u uVar) {
        this.f209543a = uVar;
    }

    public final void run() {
        C75142u uVar = this.f209543a;
        Optional d = uVar.f209547d.mo74378d(uVar.f209546c.mo71417a().mo71465k());
        if (d.isPresent()) {
            d.get();
            bu createBuilder = bw.c.createBuilder();
            createBuilder.copyOnWrite();
            createBuilder.instance.b = 4;
            C37672hs hsVar = (C37672hs) d.get();
            createBuilder.copyOnWrite();
            hsVar.getClass();
            createBuilder.instance.a = hsVar;
            uVar.f209544a.mo71653i(createBuilder.build());
        }
    }
}
