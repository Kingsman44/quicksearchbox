package com.google.android.libraries.search.assistant.p2497ab;

import com.google.apps.tiktok.p3663j.C47346d;
import com.google.apps.tiktok.p3663j.C47351i;
import com.google.apps.tiktok.p3663j.C47354l;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.search.assistant.ab.bi */
/* compiled from: PG */
public final class C32394bi {

    /* renamed from: a */
    private static final C47351i f86829a = C47351i.m84169a("top_contact_refresh_sync_key");

    /* renamed from: a */
    public static Set m60185a(C69464a aVar, boolean z, C62910ar arVar) {
        if (!z) {
            return C58733pz.f156496a;
        }
        C47354l lVar = new C47354l();
        lVar.f123076a = f86829a;
        lVar.f123078c = aVar;
        C47346d dVar = new C47346d();
        dVar.mo51220c(Math.max(12, C62948a.m95451b(arVar)), TimeUnit.HOURS);
        lVar.f123077b = dVar.mo51218a();
        return new C58759qy(lVar.mo51226a());
    }
}
