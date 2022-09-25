package com.google.android.libraries.lens.view.p2059ah.p2060a.p2062b;

import android.os.Build;
import com.google.apps.tiktok.p3663j.C47346d;
import com.google.apps.tiktok.p3663j.C47348f;
import com.google.apps.tiktok.p3663j.C47350h;
import com.google.apps.tiktok.p3663j.C47351i;
import com.google.apps.tiktok.p3663j.C47354l;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.ah.a.b.i */
/* compiled from: PG */
public final class C25129i {

    /* renamed from: a */
    private static final C47351i f68436a = C47351i.m84169a("bluechip_bg_lang_sync");

    static {
        C58974d.m91135i("BCBackgroundLanguageSyncletModule");
    }

    /* renamed from: a */
    public static Set m46432a(C69464a aVar, boolean z) {
        if (!z || Build.VERSION.SDK_INT < 31) {
            return C58733pz.f156496a;
        }
        C47354l lVar = new C47354l();
        lVar.f123076a = f68436a;
        lVar.f123078c = aVar;
        C47346d dVar = new C47346d();
        dVar.mo51220c(6, TimeUnit.HOURS);
        C47348f fVar = new C47348f();
        fVar.f123067a = C47350h.ON_NETWORK_UNMETERED;
        dVar.mo51219b(fVar.mo51221a());
        C47348f fVar2 = new C47348f();
        fVar2.f123067a = C47350h.ON_CHARGER;
        fVar2.mo51222b(8, TimeUnit.HOURS);
        dVar.mo51219b(fVar2.mo51221a());
        lVar.f123077b = dVar.mo51218a();
        return new C58759qy(lVar.mo51226a());
    }
}
