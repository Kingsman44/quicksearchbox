package com.google.android.libraries.search.silk.p3162a.p3164b;

import com.google.android.libraries.search.p2904c.C37406bk;
import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.C37419bx;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c.C37765h;
import com.google.android.libraries.search.p2904c.p2976v.C38120a;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4283bv.p4412k.p4413a.C57836d;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.silk.a.b.f */
/* compiled from: PG */
public final /* synthetic */ class C40556f implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C40562l f106437a;

    /* renamed from: b */
    public final /* synthetic */ C57836d f106438b;

    public /* synthetic */ C40556f(C40562l lVar, C57836d dVar) {
        this.f106437a = lVar;
        this.f106438b = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C40562l lVar = this.f106437a;
        C57836d dVar = this.f106438b;
        int i = lVar.f106462r;
        if (i == 0) {
            throw null;
        } else if (i != 1) {
            return C60856cj.m92899h(new C41742a(C40562l.f106447c));
        } else {
            if (!C38120a.m67298b(lVar.f106450f, "android.permission.RECORD_AUDIO")) {
                return C60856cj.m92899h(new C41742a(C40562l.f106445a));
            }
            C37419bx bxVar = lVar.f106451g;
            C37406bk bkVar = (C37406bk) C37407bl.f99325c.createBuilder();
            C37705a aVar = (C37705a) C37773c.f100243c.createBuilder();
            C37765h hVar = C37765h.f100198a;
            aVar.copyOnWrite();
            C37773c cVar = (C37773c) aVar.instance;
            hVar.getClass();
            cVar.f100246b = hVar;
            cVar.f100245a = 18;
            bkVar.copyOnWrite();
            C37407bl blVar = (C37407bl) bkVar.instance;
            C37773c cVar2 = (C37773c) aVar.build();
            cVar2.getClass();
            blVar.f99328b = cVar2;
            blVar.f99327a = 1 | blVar.f99327a;
            lVar.f106455k = bxVar.mo40942a((C37407bl) bkVar.build());
            lVar.f106456l = lVar.f106452h.mo29164d(new C40558h(lVar), 10000, TimeUnit.MILLISECONDS);
            lVar.f106460p = dVar;
            lVar.f106462r = 2;
            return C60866ct.f164955a;
        }
    }
}
