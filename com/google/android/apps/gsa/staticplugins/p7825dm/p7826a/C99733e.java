package com.google.android.apps.gsa.staticplugins.p7825dm.p7826a;

import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.search.p2904c.C37406bk;
import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.C37419bx;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2935a.C37722p;
import com.google.common.base.C58833ax;
import com.google.p4283bv.p4412k.p4413a.C57836d;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.a.e */
/* compiled from: PG */
public final /* synthetic */ class C99733e implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C99747s f279076a;

    /* renamed from: b */
    public final /* synthetic */ C57836d f279077b;

    public /* synthetic */ C99733e(C99747s sVar, C57836d dVar) {
        this.f279076a = sVar;
        this.f279077b = dVar;
    }

    public final void run() {
        C99747s sVar = this.f279076a;
        C57836d dVar = this.f279077b;
        int i = sVar.f279101j;
        if (i == 0) {
            throw null;
        } else if (i != 1) {
            throw new C99743o();
        } else if (sVar.f279092a.f254356c.mo85346a("android.permission.RECORD_AUDIO")) {
            C58833ax axVar = sVar.f279093b;
            if (axVar.mo56113h()) {
                C37406bk bkVar = (C37406bk) C37407bl.f99325c.createBuilder();
                C37705a aVar = (C37705a) C37773c.f100243c.createBuilder();
                C37722p pVar = C37722p.f100150a;
                aVar.copyOnWrite();
                C37773c cVar = (C37773c) aVar.instance;
                pVar.getClass();
                cVar.f100246b = pVar;
                cVar.f100245a = 6;
                bkVar.copyOnWrite();
                C37407bl blVar = (C37407bl) bkVar.instance;
                C37773c cVar2 = (C37773c) aVar.build();
                cVar2.getClass();
                blVar.f99328b = cVar2;
                blVar.f99327a = 1 | blVar.f99327a;
                sVar.f279095d = ((C37419bx) axVar.mo56107c()).mo40942a((C37407bl) bkVar.build());
                sVar.f279096e = sVar.f279094c.mo28208h("preparationTimeout", 10000, new C99732d(sVar));
                sVar.f279099h = dVar;
                sVar.f279101j = 2;
                return;
            }
            throw new C99744p();
        } else {
            throw new C99746r();
        }
    }
}
