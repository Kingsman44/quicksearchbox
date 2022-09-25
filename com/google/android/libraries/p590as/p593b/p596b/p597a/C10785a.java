package com.google.android.libraries.p590as.p593b.p596b.p597a;

import android.content.Context;
import com.google.android.libraries.directboot.C20674d;
import com.google.android.libraries.search.p2871b.p2872a.p2884l.C37206a;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.as.b.b.a.a */
/* compiled from: PG */
public final class C10785a implements C47352j {

    /* renamed from: a */
    private static final C58974d f35809a = C58974d.m91134h("LPAutoUpdateSynclet");

    /* renamed from: b */
    private final C68214a f35810b;

    /* renamed from: c */
    private final Context f35811c;

    public C10785a(C68214a aVar, Context context) {
        this.f35810b = aVar;
        this.f35811c = context;
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        C58974d dVar = f35809a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(53982)).mo56386p("#sync");
        if (C20674d.m38855d(this.f35811c)) {
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(53983)).mo56386p("Skipping LanguagePackSynclet because of direct boot mode.");
            return C60866ct.f164955a;
        }
        C10795k kVar = (C10795k) this.f35810b.mo27525b();
        kVar.f35826d.mo19974a(C37206a.f98776af);
        C47633f i = C47633f.m84733g(kVar.f35825c.mo19347a()).mo51516i(new C10792h(kVar), kVar.f35827e);
        C10794j jVar = new C10794j(kVar);
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(jVar), kVar.f35827e);
        return C60866ct.f164955a;
    }
}
