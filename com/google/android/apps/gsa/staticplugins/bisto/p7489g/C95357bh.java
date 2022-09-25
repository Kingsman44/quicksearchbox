package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.shared.bisto.C89648c;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.p10712d.C142310ap;
import com.google.android.p10712d.C142311aq;
import com.google.android.p10712d.C142312ar;
import com.google.android.p10712d.C142313as;
import com.google.android.p10712d.C142348c;
import com.google.android.p10712d.C142375d;
import com.google.android.p10712d.C142398dw;
import com.google.android.p10712d.C142403ea;
import com.google.android.p10712d.C142528t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.bh */
/* compiled from: PG */
public final class C95357bh {

    /* renamed from: a */
    public static final C59071e f266784a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.bh");

    /* renamed from: b */
    public final C21370a f266785b;

    /* renamed from: c */
    public final C68214a f266786c;

    /* renamed from: d */
    public final C89656k f266787d;

    /* renamed from: e */
    private final C60888db f266788e;

    /* renamed from: f */
    private final C95373bx f266789f;

    public C95357bh(C21370a aVar, C68214a aVar2, C60888db dbVar, C95373bx bxVar, C89656k kVar) {
        this.f266785b = aVar;
        this.f266786c = aVar2;
        this.f266788e = dbVar;
        this.f266787d = kVar;
        this.f266789f = bxVar;
    }

    /* renamed from: a */
    public final C60870cx mo89288a(C95355bf bfVar, boolean z) {
        C124548d b = ((C89492cd) this.f266786c.mo27525b()).mo83401b(bfVar.mo89270k());
        if (b != null && C89648c.f242752a.contains(b.mo106514l())) {
            return C60856cj.m92900i(true);
        }
        C142348c cVar = (C142348c) C142375d.f386335d.createBuilder();
        cVar.copyOnWrite();
        C142375d dVar = (C142375d) cVar.instance;
        dVar.f386337a |= 1;
        dVar.f386338b = !z;
        C60870cx D = bfVar.mo89257D(10, 2, ((C142375d) cVar.build()).toByteArray());
        C60856cj.m92911t(D, new C95356bg(this, bfVar), this.f266788e);
        return D;
    }

    /* renamed from: b */
    public final void mo89289b(C95355bf bfVar) {
        bfVar.mo89257D(15, 4, C142528t.f386754a.toByteArray());
    }

    /* renamed from: c */
    public final void mo89290c(C95355bf bfVar) {
        bfVar.mo89257D(5, 17, C142398dw.f386403a.toByteArray());
    }

    /* renamed from: d */
    public final void mo89291d(C95355bf bfVar) {
        bfVar.mo89257D(5, 2, C142403ea.f386410a.toByteArray());
    }

    /* renamed from: e */
    public final void mo89292e(C95355bf bfVar) {
        C142312ar arVar = (C142312ar) C142313as.f386082c.createBuilder();
        arVar.copyOnWrite();
        C142313as asVar = (C142313as) arVar.instance;
        asVar.f386085b = 1;
        asVar.f386084a = 1 | asVar.f386084a;
        C59104x b = f266784a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ClassicDeviceHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14952)).mo56386p("Sent DeviceMultipointControl");
        bfVar.mo89257D(9, 16, ((C142313as) arVar.build()).toByteArray());
    }

    /* renamed from: f */
    public final void mo89293f(C95355bf bfVar) {
        C95373bx bxVar = this.f266789f;
        C58976aa aaVar = C58975e.f156826a;
        bxVar.f266875e = 5;
        C142310ap apVar = (C142310ap) C142311aq.f386076d.createBuilder();
        apVar.copyOnWrite();
        C142311aq aqVar = (C142311aq) apVar.instance;
        aqVar.f386078a |= 1;
        aqVar.f386079b = false;
        apVar.copyOnWrite();
        C142311aq aqVar2 = (C142311aq) apVar.instance;
        aqVar2.f386078a |= 2;
        aqVar2.f386080c = true;
        C59104x b = f266784a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ClassicDeviceHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14955)).mo56386p("Sent MicClose");
        bfVar.mo89257D(9, 6, ((C142311aq) apVar.build()).toByteArray());
    }

    /* renamed from: g */
    public final void mo89294g(C95355bf bfVar) {
        C95373bx bxVar = this.f266789f;
        C58976aa aaVar = C58975e.f156826a;
        bxVar.f266875e = 5;
        C142310ap apVar = (C142310ap) C142311aq.f386076d.createBuilder();
        apVar.copyOnWrite();
        C142311aq aqVar = (C142311aq) apVar.instance;
        aqVar.f386078a |= 1;
        aqVar.f386079b = false;
        apVar.copyOnWrite();
        C142311aq aqVar2 = (C142311aq) apVar.instance;
        aqVar2.f386078a |= 2;
        aqVar2.f386080c = false;
        C59104x b = f266784a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ClassicDeviceHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14956)).mo56386p("Sent MicCloseWithoutAbort");
        bfVar.mo89257D(9, 6, ((C142311aq) apVar.build()).toByteArray());
    }

    /* renamed from: h */
    public final void mo89295h(C95355bf bfVar) {
        C95373bx bxVar = this.f266789f;
        C58976aa aaVar = C58975e.f156826a;
        bxVar.f266875e = 4;
        C142310ap apVar = (C142310ap) C142311aq.f386076d.createBuilder();
        apVar.copyOnWrite();
        C142311aq aqVar = (C142311aq) apVar.instance;
        aqVar.f386078a |= 1;
        aqVar.f386079b = true;
        apVar.copyOnWrite();
        C142311aq aqVar2 = (C142311aq) apVar.instance;
        aqVar2.f386078a |= 2;
        aqVar2.f386080c = true;
        C59104x b = f266784a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ClassicDeviceHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14957)).mo56386p("Sent MicOpen");
        bfVar.mo89257D(9, 6, ((C142311aq) apVar.build()).toByteArray());
    }

    /* renamed from: i */
    public final void mo89296i(C95355bf bfVar, boolean z) {
        C59104x b = f266784a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ClassicDeviceHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14958)).mo56389s("setting hotword enabled: %b", Boolean.valueOf(z));
        C142348c cVar = (C142348c) C142375d.f386335d.createBuilder();
        cVar.copyOnWrite();
        C142375d dVar = (C142375d) cVar.instance;
        dVar.f386337a |= 8;
        dVar.f386339c = z;
        bfVar.mo89257D(10, 2, ((C142375d) cVar.build()).toByteArray());
    }
}
