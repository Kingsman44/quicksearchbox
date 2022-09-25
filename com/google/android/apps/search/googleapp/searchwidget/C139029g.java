package com.google.android.apps.search.googleapp.searchwidget;

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

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.g */
/* compiled from: PG */
public final class C139029g {

    /* renamed from: a */
    private static final C62910ar f378097a = C62948a.m95457h(2);

    /* renamed from: a */
    public static Set m225814a(C69464a aVar, boolean z, boolean z2, C62910ar arVar) {
        if (!z || !z2) {
            return C58733pz.f156496a;
        }
        C47354l lVar = new C47354l();
        lVar.f123076a = C47351i.m84169a("SearchWidgetDailySynclet");
        lVar.f123078c = aVar;
        C47346d dVar = new C47346d();
        dVar.mo51220c(Math.max(C62948a.m95451b(arVar), C62948a.m95451b(f378097a)), TimeUnit.HOURS);
        lVar.f123077b = dVar.mo51218a();
        return new C58759qy(lVar.mo51226a());
    }
}
