package com.google.android.libraries.lens.view.p2057ag;

import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.p3545q.p3547b.C45212e;
import com.google.android.p3545q.p3547b.C45214g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.lens.view.ag.b */
/* compiled from: PG */
final class C25100b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C25102d f68369a;

    public C25100b(C25102d dVar) {
        this.f68369a = dVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f68369a.f68377b.mo19974a(C37194a.f98537bu.mo40815i(C62722b.UNKNOWN));
        ((C58970a) ((C58970a) ((C58970a) C25102d.f68376a.mo56225c()).mo56382g(th)).mo56372aa(49792)).mo56386p("Unexpected failure in loading math typeface");
        C25102d dVar = this.f68369a;
        dVar.f68381f = false;
        dVar.f68378c.mo5706i(C58836b.f156633a);
        this.f68369a.f68380e.mo30934b("DOWNLOAD_FAIL");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C45214g gVar = (C45214g) obj;
        C25102d dVar = this.f68369a;
        dVar.f68381f = false;
        dVar.f68378c.mo5706i(C58833ax.m90834k(gVar.f117988b));
        this.f68369a.f68380e.mo30934b("DOWNLOAD_SUCCESS");
        if (gVar.f117987a == C45212e.CACHE) {
            this.f68369a.f68377b.mo19974a(C37194a.f98536bt.mo40815i(C62722b.OK));
        }
        if (gVar.f117987a == C45212e.NETWORK) {
            this.f68369a.f68377b.mo19974a(C37194a.f98537bu.mo40815i(C62722b.OK));
        }
    }
}
