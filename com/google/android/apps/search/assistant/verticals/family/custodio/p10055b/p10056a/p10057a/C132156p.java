package com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.p10057a;

import com.google.android.apps.search.assistant.verticals.family.custodio.p10059c.C132203c;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10059c.C132205e;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10059c.C132209i;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.p427am.p432b.p433a.C8659bk;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.p427am.p432b.p433a.C8680j;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import java.util.Collections;
import java.util.Map;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.b.a.a.p */
/* compiled from: PG */
public final /* synthetic */ class C132156p implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C132159s f360711a;

    /* renamed from: b */
    public final /* synthetic */ boolean f360712b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f360713c;

    public /* synthetic */ C132156p(C132159s sVar, boolean z, C58485gu guVar) {
        this.f360711a = sVar;
        this.f360712b = z;
        this.f360713c = guVar;
    }

    public final Object apply(Object obj) {
        C132159s sVar = this.f360711a;
        boolean z = this.f360712b;
        C58485gu guVar = this.f360713c;
        C132209i iVar = (C132209i) obj;
        C8659bk bkVar = (C8659bk) C8660bl.f29961c.createBuilder();
        C63042fg c = C62950b.m95472c(Instant.now());
        if (z) {
            if ((iVar.f360855a & 2) != 0) {
                C132203c cVar = iVar.f360858d;
                if (cVar == null) {
                    cVar = C132203c.f360837d;
                }
                C8680j jVar = cVar.f360841c;
                if (jVar == null) {
                    jVar = C8680j.f30003b;
                }
                bkVar.copyOnWrite();
                jVar.getClass();
                ((C8660bl) bkVar.instance).f29963a = jVar;
                C132203c cVar2 = iVar.f360858d;
                if (cVar2 == null) {
                    cVar2 = C132203c.f360837d;
                }
                C63042fg fgVar = cVar2.f360840b;
                if (fgVar == null) {
                    fgVar = C63042fg.f170152c;
                }
                c = C132161u.m214793i(c, fgVar);
            }
            return C46688af.f121976a;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(iVar.f360856b);
        if (!guVar.isEmpty()) {
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                C132205e eVar = (C132205e) unmodifiableMap.get((String) guVar.get(i2));
                if (eVar == null) {
                    return C46688af.f121976a;
                }
                C8675e eVar2 = eVar.f360846c;
                if (eVar2 == null) {
                    eVar2 = C8675e.f29990g;
                }
                bkVar.mo17209a(eVar2);
                C63042fg fgVar2 = eVar.f360845b;
                if (fgVar2 == null) {
                    fgVar2 = C63042fg.f170152c;
                }
                c = C132161u.m214793i(c, fgVar2);
            }
        } else {
            if ((iVar.f360855a & 1) != 0) {
                for (C132205e eVar3 : unmodifiableMap.values()) {
                    C8675e eVar4 = eVar3.f360846c;
                    if (eVar4 == null) {
                        eVar4 = C8675e.f29990g;
                    }
                    bkVar.mo17209a(eVar4);
                }
                C63042fg fgVar3 = iVar.f360857c;
                if (fgVar3 == null) {
                    fgVar3 = C63042fg.f170152c;
                }
                c = C132161u.m214793i(c, fgVar3);
            }
            return C46688af.f121976a;
        }
        if (sVar.f360721e.f360727e.mo57444a().isAfter(C62950b.m95474e(c).plus(C132161u.f360723b))) {
            return C46688af.f121976a;
        }
        if (sVar.f360721e.f360727e.mo57444a().isAfter(C62950b.m95474e(c).plus(C132161u.f360722a))) {
            return C46688af.m83206c((C8660bl) bkVar.build());
        }
        return C46688af.m83205b((C8660bl) bkVar.build(), C62950b.m95474e(c).toEpochMilli());
    }
}
