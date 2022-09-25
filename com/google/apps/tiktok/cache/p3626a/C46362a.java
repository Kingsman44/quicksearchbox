package com.google.apps.tiktok.cache.p3626a;

import com.google.apps.tiktok.cache.C46382at;
import com.google.apps.tiktok.cache.C46383au;
import com.google.apps.tiktok.cache.C46385aw;
import com.google.apps.tiktok.p3663j.C47346d;
import com.google.apps.tiktok.p3663j.C47348f;
import com.google.apps.tiktok.p3663j.C47350h;
import com.google.apps.tiktok.p3663j.C47351i;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.p3663j.C47354l;
import com.google.apps.tiktok.p3663j.C47355m;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.cache.a.a */
/* compiled from: PG */
public final class C46362a implements C47352j {

    /* renamed from: a */
    private final C69464a f121370a;

    private C46362a(C69464a aVar) {
        this.f121370a = aVar;
    }

    /* renamed from: a */
    public static C47355m m82665a(String str, C69464a aVar, long j, TimeUnit timeUnit) {
        C58838bb.m90869d(timeUnit.toDays(j) >= 7, "Setting a expireAfterWrite duration shorter than 1 week is not allowed");
        C46362a aVar2 = new C46362a(aVar);
        C47354l lVar = new C47354l();
        lVar.f123076a = C47351i.m84169a(str);
        lVar.mo51227b(aVar2);
        C47346d dVar = new C47346d();
        dVar.mo51220c(j >> 1, timeUnit);
        C47348f fVar = new C47348f();
        fVar.f123067a = C47350h.ON_CHARGER;
        fVar.mo51222b(j, timeUnit);
        dVar.mo51219b(fVar.mo51221a());
        lVar.f123077b = dVar.mo51218a();
        return lVar.mo51226a();
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        C46385aw awVar = (C46385aw) this.f121370a.mo17428b();
        C58838bb.m90883r(awVar.f121416g);
        return C47633f.m84733g(awVar.f121412c.mo45938b(new C46382at(awVar))).mo51516i(new C46383au(awVar), awVar.f121411b);
    }
}
