package com.google.android.libraries.p590as.p593b.p596b.p597a;

import com.google.android.libraries.search.p2871b.p2872a.p2884l.C37206a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.as.b.b.a.j */
/* compiled from: PG */
final class C10794j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C10795k f35822a;

    public C10794j(C10795k kVar) {
        this.f35822a = kVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f35822a.f35826d.mo19974a(C37206a.f98777ag.mo40805c(C62722b.UNKNOWN));
        ((C58970a) ((C58970a) ((C58970a) C10795k.f35823a.mo56225c()).mo56382g(th)).mo56372aa(53984)).mo56386p("Error when background downloading LanguagePacks");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        ((C58970a) ((C58970a) C10795k.f35823a.mo56224b()).mo56372aa(53985)).mo56386p("Background LanguagePack updates finished successfully");
        this.f35822a.f35826d.mo19974a(C37206a.f98777ag.mo40805c(C62722b.OK));
    }
}
