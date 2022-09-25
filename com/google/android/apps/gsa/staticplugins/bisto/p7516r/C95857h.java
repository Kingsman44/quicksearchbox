package com.google.android.apps.gsa.staticplugins.bisto.p7516r;

import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.r.h */
/* compiled from: PG */
public final class C95857h {

    /* renamed from: a */
    public static final C59071e f268419a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.r.h");

    /* renamed from: b */
    private final C88483e f268420b;

    /* renamed from: c */
    private final C90929bz f268421c;

    public C95857h(C88483e eVar, C90929bz bzVar) {
        this.f268420b = eVar;
        this.f268421c = bzVar;
    }

    /* renamed from: a */
    public final void mo89824a(amo amo, C87739bu buVar, Parcelable parcelable) {
        C88486g gVar = new C88486g();
        gVar.f239201c = amo;
        gVar.f239204f = "bisto";
        ClientConfig clientConfig = new ClientConfig(gVar);
        C88489j jVar = new C88489j(buVar);
        if (parcelable != null) {
            jVar.mo82015c(parcelable);
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f268421c.mo85142g(this.f268420b.mo82004b(clientConfig, jVar.mo82013a(), 50000), new C95856g(buVar));
    }
}
