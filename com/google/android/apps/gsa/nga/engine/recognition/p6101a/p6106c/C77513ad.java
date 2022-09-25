package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6106c;

import com.google.android.libraries.search.p2904c.C37404bi;
import com.google.android.libraries.search.p2904c.C37406bk;
import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.C37419bx;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2936b.C37737f;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.c.ad */
/* compiled from: PG */
public final class C77513ad {

    /* renamed from: a */
    private final C37419bx f213581a;

    /* renamed from: b */
    private C37404bi f213582b;

    public C77513ad(C37419bx bxVar) {
        this.f213581a = bxVar;
    }

    /* renamed from: a */
    public final synchronized C37404bi mo72595a() {
        C37404bi biVar = this.f213582b;
        if (biVar == null || biVar.mo40939e().isDone()) {
            C37419bx bxVar = this.f213581a;
            C37406bk bkVar = (C37406bk) C37407bl.f99325c.createBuilder();
            C37705a aVar = (C37705a) C37773c.f100243c.createBuilder();
            C37737f fVar = C37737f.f100170a;
            aVar.copyOnWrite();
            C37773c cVar = (C37773c) aVar.instance;
            fVar.getClass();
            cVar.f100246b = fVar;
            cVar.f100245a = 14;
            bkVar.copyOnWrite();
            C37407bl blVar = (C37407bl) bkVar.instance;
            C37773c cVar2 = (C37773c) aVar.build();
            cVar2.getClass();
            blVar.f99328b = cVar2;
            blVar.f99327a |= 1;
            this.f213582b = bxVar.mo40942a((C37407bl) bkVar.build());
        }
        return this.f213582b;
    }
}
