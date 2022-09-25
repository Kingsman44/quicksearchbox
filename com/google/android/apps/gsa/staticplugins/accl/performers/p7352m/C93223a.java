package com.google.android.apps.gsa.staticplugins.accl.performers.p7352m;

import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89129a;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89134f;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89135g;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89142n;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89143o;
import com.google.android.libraries.gsa.conversation.clientop.C22407c;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.m.a */
/* compiled from: PG */
public final class C93223a {
    /* renamed from: a */
    public static Optional m153295a(C22434e eVar) {
        C22407c cVar = (C22407c) eVar;
        if (!cVar.f61902d.mo56113h()) {
            return Optional.empty();
        }
        C58833ax axVar = ((C22585l) cVar.f61902d.mo56107c()).f62228b;
        if (axVar.mo56113h()) {
            return Optional.m71637of(C39191a.m68623b(((C84349ah) axVar.mo56107c()).f229566a.f252749G));
        }
        return Optional.empty();
    }

    /* renamed from: b */
    public static void m153296b(C89143o oVar, C22434e eVar, String str, String str2) {
        C89135g gVar = (C89135g) C89142n.f241658n.createBuilder();
        C89134f fVar = C89134f.CLIENT_OP_EXECUTED;
        gVar.copyOnWrite();
        C89142n nVar = (C89142n) gVar.instance;
        nVar.f241661b = fVar.f241638y;
        nVar.f241660a |= 1;
        gVar.copyOnWrite();
        C89142n nVar2 = (C89142n) gVar.instance;
        str.getClass();
        nVar2.f241660a |= 2;
        nVar2.f241663d = str;
        gVar.copyOnWrite();
        C89142n nVar3 = (C89142n) gVar.instance;
        nVar3.f241660a |= 4;
        nVar3.f241664e = str2;
        C89129a aVar = new C89129a();
        aVar.mo83116c((C89142n) gVar.build());
        aVar.mo83115b(m153295a(eVar));
        oVar.mo27606c(aVar.mo83114a());
    }
}
