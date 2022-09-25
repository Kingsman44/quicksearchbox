package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9302c;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.C122872ec;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a.C122801af;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122964p;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62971cq;
import com.google.protos.p4850an.p4851a.p4852a.C63325i;
import com.google.protos.p4850an.p4851a.p4852a.C63327k;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.c.k */
/* compiled from: PG */
public final /* synthetic */ class C123156k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123163r f340827a;

    public /* synthetic */ C123156k(C123163r rVar) {
        this.f340827a = rVar;
    }

    public final C60870cx apply(Object obj) {
        long j;
        C60870cx cxVar;
        int i;
        C123163r rVar = this.f340827a;
        C29690f fVar = (C29690f) obj;
        if ((fVar.f80410a & 8) == 0 || (i = fVar.f80414e) == 0) {
            j = fVar.f80417h;
        } else {
            j = (long) i;
            if (rVar.f340840e && j > 0 && j < 427712047) {
                return C60856cj.m92899h(new C122872ec("PopResourceServiceImpl", String.format(Locale.US, "Unsupported POP group %s version %d", new Object[]{fVar.f80411b, Long.valueOf(j)})));
            }
        }
        ((C59052c) rVar.f340841f.mo105764c().mo56372aa(35091)).mo56353F("Using group %s version %d", fVar.f80411b, j);
        C122964p pVar = rVar.f340844i;
        String str = fVar.f80411b;
        pVar.mo105804a(Optional.m71637of(str + "," + j));
        C122801af afVar = rVar.f340845j;
        int i2 = rVar.f340843h + 1;
        rVar.f340843h = i2;
        afVar.mo105746b("pop_group_load_count", Integer.toString(i2));
        C62971cq<C28595b> cqVar = fVar.f80416g;
        Optional findFirst = Collection.EL.stream(cqVar).filter(C123151f.f340821a).findFirst();
        if (findFirst.isPresent()) {
            C123162q qVar = new C123162q(rVar, cqVar, ((C28595b) findFirst.get()).f77799c);
            cxVar = C60856cj.m92905n(C47810es.m84965e(qVar), rVar.f340838c);
        } else {
            C63325i iVar = (C63325i) C63327k.f171155c.createBuilder();
            for (C28595b bVar : cqVar) {
                iVar.mo59204a(bVar.f77798b, bVar.f77799c);
            }
            cxVar = C60856cj.m92900i((C63327k) iVar.build());
        }
        return (C60870cx) rVar.f340839d.map(new C123153h(cxVar)).orElse(cxVar);
    }
}
