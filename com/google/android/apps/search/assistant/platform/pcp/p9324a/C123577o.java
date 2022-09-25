package com.google.android.apps.search.assistant.platform.pcp.p9324a;

import com.google.apps.tiktok.p3663j.C47346d;
import com.google.apps.tiktok.p3663j.C47348f;
import com.google.apps.tiktok.p3663j.C47350h;
import com.google.apps.tiktok.p3663j.C47351i;
import com.google.apps.tiktok.p3663j.C47354l;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.a.o */
/* compiled from: PG */
public final class C123577o {

    /* renamed from: a */
    private static final C47351i f341464a = C47351i.m84169a("pcp_daily_sync_key");

    /* renamed from: a */
    public static Set m202879a(C69464a aVar, C62910ar arVar, C62910ar arVar2) {
        if (C62948a.m95464o(arVar2)) {
            return C58733pz.f156496a;
        }
        C47354l lVar = new C47354l();
        lVar.f123076a = f341464a;
        lVar.f123078c = aVar;
        C47346d dVar = new C47346d();
        dVar.mo51220c(C62948a.m95451b(arVar), TimeUnit.HOURS);
        C47348f fVar = new C47348f();
        fVar.f123067a = C47350h.ON_CHARGER;
        fVar.mo51222b(C62948a.m95451b(arVar), TimeUnit.HOURS);
        dVar.mo51219b(fVar.mo51221a());
        lVar.f123077b = dVar.mo51218a();
        return new C58759qy(lVar.mo51226a());
    }
}
