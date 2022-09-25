package com.google.android.apps.search.assistant.verticals.familyshare.p10063a;

import android.content.Context;
import com.google.apps.tiktok.p3663j.C47346d;
import com.google.apps.tiktok.p3663j.C47351i;
import com.google.apps.tiktok.p3663j.C47354l;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.verticals.familyshare.a.g */
/* compiled from: PG */
public final class C132375g implements C68220f {
    /* renamed from: a */
    public static Set m215158a(C69464a aVar, Context context, boolean z, long j) {
        Set set;
        C58976aa aaVar = C58975e.f156826a;
        if (!z) {
            C132370c.m215155a(context, false);
            set = C58733pz.f156496a;
        } else {
            C47354l lVar = new C47354l();
            lVar.f123076a = C47351i.m84169a("SharesheetComponentSynclet");
            lVar.f123078c = aVar;
            C47346d dVar = new C47346d();
            dVar.mo51220c(j, TimeUnit.HOURS);
            lVar.f123077b = dVar.mo51218a();
            set = new C58759qy(lVar.mo51226a());
        }
        C68225k.m98532d(set);
        return set;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
