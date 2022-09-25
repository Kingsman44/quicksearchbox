package com.google.android.apps.search.googleapp.p10370p;

import com.google.apps.tiktok.p3663j.C47346d;
import com.google.apps.tiktok.p3663j.C47351i;
import com.google.apps.tiktok.p3663j.C47354l;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.googleapp.p.ap */
/* compiled from: PG */
public final class C136849ap {

    /* renamed from: a */
    private static final C47351i f372486a = C47351i.m84169a("growthtracking_sync");

    /* renamed from: a */
    public static Set m222541a(C69464a aVar, boolean z) {
        if (!z) {
            return C58733pz.f156496a;
        }
        C47354l lVar = new C47354l();
        lVar.f123076a = f372486a;
        lVar.f123078c = aVar;
        C47346d dVar = new C47346d();
        dVar.mo51220c(1, TimeUnit.DAYS);
        lVar.f123077b = dVar.mo51218a();
        return new C58759qy(lVar.mo51226a());
    }
}
