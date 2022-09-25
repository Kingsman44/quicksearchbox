package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8157b;

import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores.CardIndexingParcelableStore;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23054e;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.b.a */
/* compiled from: PG */
final class C105665a implements C23054e {

    /* renamed from: a */
    final /* synthetic */ C105666b f294790a;

    public C105665a(C105666b bVar) {
        this.f294790a = bVar;
    }

    /* renamed from: d */
    private final void m175820d() {
        C58833ax axVar = (C58833ax) this.f294790a.f294792b.mo95002o().f63720e;
        if (axVar.mo56113h()) {
            this.f294790a.f294793c = (CardIndexingParcelableStore) axVar.mo56107c();
            return;
        }
        this.f294790a.f294793c = new CardIndexingParcelableStore();
        this.f294790a.f294792b.mo95002o().mo28730f(C58833ax.m90834k(this.f294790a.f294793c), false);
    }

    /* renamed from: b */
    public final void mo28489b(C23028x xVar) {
        m175820d();
    }

    /* renamed from: c */
    public final void mo28490c() {
        m175820d();
    }

    /* renamed from: g */
    public final /* synthetic */ void mo28491g() {
    }
}
