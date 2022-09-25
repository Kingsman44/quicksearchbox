package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8159d;

import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores.TemporaryFeedStateParcelableStore;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23054e;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.d.a */
/* compiled from: PG */
final class C105714a implements C23054e {

    /* renamed from: a */
    final /* synthetic */ C105715b f294987a;

    public C105714a(C105715b bVar) {
        this.f294987a = bVar;
    }

    /* renamed from: d */
    private final void m175940d() {
        C58833ax axVar = (C58833ax) this.f294987a.f294988a.mo95011x().f63720e;
        if (axVar.mo56113h()) {
            this.f294987a.f294989b = (TemporaryFeedStateParcelableStore) axVar.mo56107c();
            return;
        }
        this.f294987a.f294989b = new TemporaryFeedStateParcelableStore();
        this.f294987a.f294988a.mo95011x().mo28730f(C58833ax.m90834k(this.f294987a.f294989b), false);
    }

    /* renamed from: b */
    public final void mo28489b(C23028x xVar) {
        m175940d();
    }

    /* renamed from: c */
    public final void mo28490c() {
        m175940d();
    }

    /* renamed from: g */
    public final /* synthetic */ void mo28491g() {
    }
}
