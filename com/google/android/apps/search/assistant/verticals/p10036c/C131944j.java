package com.google.android.apps.search.assistant.verticals.p10036c;

import com.google.apps.tiktok.p3663j.C47346d;
import com.google.apps.tiktok.p3663j.C47348f;
import com.google.apps.tiktok.p3663j.C47350h;
import com.google.apps.tiktok.p3663j.C47351i;
import com.google.apps.tiktok.p3663j.C47354l;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.assistant.verticals.c.j */
/* compiled from: PG */
public final class C131944j {

    /* renamed from: a */
    private static final C47351i f360258a = C47351i.m84169a("assistant_deeplinks");

    /* renamed from: a */
    public static Set m214402a(C131943i iVar, boolean z) {
        if (!z) {
            return C58733pz.f156496a;
        }
        C47354l lVar = new C47354l();
        lVar.f123076a = f360258a;
        lVar.mo51227b(iVar);
        C47346d dVar = new C47346d();
        dVar.mo51220c(8, TimeUnit.HOURS);
        C47348f fVar = new C47348f();
        fVar.f123067a = C47350h.ON_NETWORK_UNMETERED;
        fVar.mo51222b(12, TimeUnit.HOURS);
        dVar.mo51219b(fVar.mo51221a());
        C47348f fVar2 = new C47348f();
        fVar2.f123067a = C47350h.ON_CHARGER;
        fVar2.mo51222b(12, TimeUnit.HOURS);
        dVar.mo51219b(fVar2.mo51221a());
        lVar.f123077b = dVar.mo51218a();
        return new C58759qy(lVar.mo51226a());
    }
}
