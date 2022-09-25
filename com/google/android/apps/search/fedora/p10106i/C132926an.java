package com.google.android.apps.search.fedora.p10106i;

import com.google.apps.tiktok.p3663j.C47346d;
import com.google.apps.tiktok.p3663j.C47348f;
import com.google.apps.tiktok.p3663j.C47350h;
import com.google.apps.tiktok.p3663j.C47351i;
import com.google.apps.tiktok.p3663j.C47354l;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.fedora.i.an */
/* compiled from: PG */
public final class C132926an {

    /* renamed from: a */
    private static final C59071e f362596a = C59071e.m91332i("com.google.android.apps.search.fedora.i.an");

    /* renamed from: b */
    private static final C47351i f362597b = C47351i.m84169a("fedora_maintenance_sync");

    /* renamed from: a */
    public static Set m215898a(C69464a aVar, boolean z) {
        if (!z) {
            return C58733pz.f156496a;
        }
        ((C59052c) ((C59052c) f362596a.mo56224b()).mo56372aa(39953)).mo56386p("binding FedoraSynclet");
        C47354l lVar = new C47354l();
        lVar.f123076a = f362597b;
        lVar.f123078c = aVar;
        C47346d dVar = new C47346d();
        dVar.mo51220c(8, TimeUnit.HOURS);
        C47348f fVar = new C47348f();
        fVar.f123067a = C47350h.ON_CHARGER;
        fVar.mo51222b(12, TimeUnit.HOURS);
        dVar.mo51219b(fVar.mo51221a());
        C47348f fVar2 = new C47348f();
        fVar2.f123067a = C47350h.ON_NETWORK_UNMETERED;
        fVar2.mo51222b(12, TimeUnit.HOURS);
        dVar.mo51219b(fVar2.mo51221a());
        lVar.f123077b = dVar.mo51218a();
        return new C58759qy(lVar.mo51226a());
    }
}
