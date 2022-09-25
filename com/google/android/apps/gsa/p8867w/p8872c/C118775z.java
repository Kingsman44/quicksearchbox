package com.google.android.apps.gsa.p8867w.p8872c;

import com.google.android.apps.gsa.opaonboarding.p6462d.C83926m;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83927n;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83928o;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83929p;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1341b.C16891d;

/* renamed from: com.google.android.apps.gsa.w.c.z */
/* compiled from: PG */
public final /* synthetic */ class C118775z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C118744ab f331304a;

    /* renamed from: b */
    public final /* synthetic */ C16891d f331305b;

    /* renamed from: c */
    public final /* synthetic */ String f331306c;

    public /* synthetic */ C118775z(C118744ab abVar, C16891d dVar, String str) {
        this.f331304a = abVar;
        this.f331305b = dVar;
        this.f331306c = str;
    }

    public final void run() {
        C118744ab abVar = this.f331304a;
        C16891d dVar = this.f331305b;
        String str = this.f331306c;
        C86337q b = ((C86338r) abVar.f331220b.mo17428b()).mo80076b();
        if ((dVar.f49389a & 1) != 0) {
            abVar.mo103949e("notification-enable-status", new C118755f(b, str, dVar));
        }
        if ((dVar.f49389a & 2) != 0) {
            abVar.mo103949e("home-screen-notification-enable-status", new C118756g(b, str, dVar));
        }
        if ((dVar.f49389a & 16) != 0) {
            abVar.mo103949e("suggestions-enable-status", new C118757h(b, str, dVar));
        }
        if ((dVar.f49389a & 8) != 0 && dVar.f49392d) {
            C83927n nVar = (C83927n) C83928o.f228580d.createBuilder();
            nVar.copyOnWrite();
            C83928o oVar = (C83928o) nVar.instance;
            str.getClass();
            oVar.f228582a |= 1;
            oVar.f228583b = str;
            nVar.copyOnWrite();
            C83928o oVar2 = (C83928o) nVar.instance;
            oVar2.f228584c = 5;
            oVar2.f228582a |= 2;
            C83926m mVar = (C83926m) abVar.mo103947a().toBuilder();
            mVar.mo77332a((C83928o) nVar.build());
            b.mo80068c("oc:third_party_disclosures_acked", ((C83929p) mVar.build()).toByteArray());
        }
        b.apply();
    }
}
