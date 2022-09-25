package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83765h;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131232a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131233b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.p.f */
/* compiled from: PG */
final class C110881f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C131233b f308893a;

    /* renamed from: b */
    final /* synthetic */ C110886k f308894b;

    public C110881f(C110886k kVar, C131233b bVar) {
        this.f308894b = kVar;
        this.f308893a = bVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) this.f308894b.f308909e.mo56226d()).mo56372aa(26814)).mo56386p("Failed to get current displayed calendar, and skipped the calendar TTL merge status logging.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (!((List) Collection.EL.stream(((C83765h) obj).f228312a).map(C110880e.f308892a).collect(Collectors.toList())).contains(Long.valueOf(((C131232a) this.f308893a).f358863a))) {
            this.f308894b.f308908d.mo109898aG();
        }
    }
}
