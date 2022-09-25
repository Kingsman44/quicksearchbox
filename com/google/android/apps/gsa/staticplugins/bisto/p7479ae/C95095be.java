package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.be */
/* compiled from: PG */
class C95095be {

    /* renamed from: d */
    final String f266012d;

    /* renamed from: e */
    final /* synthetic */ C95097bg f266013e;

    public C95095be(C95097bg bgVar, String str) {
        this.f266013e = bgVar;
        this.f266012d = str;
    }

    /* renamed from: a */
    public void mo89003a() {
        C59104x b = C95097bg.f266015a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "QueryHandler");
        ((C59052c) ((C59052c) b).mo56372aa(18027)).mo56389s("enter state: %s", this.f266012d);
    }

    /* renamed from: d */
    public void mo89006d() {
        C59104x b = C95097bg.f266015a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "QueryHandler");
        ((C59052c) ((C59052c) b).mo56372aa(18026)).mo56389s("cancelQuery: %s", this.f266012d);
        C95133z zVar = this.f266013e.f266034f;
        zVar.f266164f.mo89056a();
        zVar.f266161c.mo81950v();
        zVar.f266161c.mo81930a(false);
        C95097bg bgVar = this.f266013e;
        C22871g gVar = bgVar.f266032d;
        C95133z zVar2 = bgVar.f266034f;
        Objects.requireNonNull(zVar2);
        gVar.mo28212l("finishGsaDialogWithMinorDelay", new C95094bd(zVar2));
        this.f266013e.mo89018e("IDLE");
    }

    /* renamed from: e */
    public void mo89007e() {
        C59104x b = C95097bg.f266015a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "QueryHandler");
        ((C59052c) ((C59052c) b).mo56372aa(18030)).mo56389s("stopQueryInput: %s", this.f266012d);
        C95127t tVar = this.f266013e.f266026J;
        if (tVar != null) {
            tVar.mo89047a();
        }
    }

    /* renamed from: is */
    public void mo89004is() {
        C59104x b = C95097bg.f266015a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "QueryHandler");
        ((C59052c) ((C59052c) b).mo56372aa(18028)).mo56389s("exit state: %s", this.f266012d);
    }

    /* renamed from: it */
    public void mo89005it(ServiceEventData serviceEventData) {
        C59104x c = C95097bg.f266015a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "QueryHandler");
        C59052c cVar = (C59052c) ((C59052c) c).mo56372aa(18029);
        String str = this.f266012d;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        cVar.mo56354G("%s state: Unexpected onServiceEvent: %s", str, a);
    }
}
