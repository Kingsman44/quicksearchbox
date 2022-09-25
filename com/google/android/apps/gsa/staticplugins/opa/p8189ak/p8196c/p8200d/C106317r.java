package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8200d;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80116d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80118f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80120h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80122j;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.C106221b;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106279g;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106285m;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106286n;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106298z;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107705p;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.d.r */
/* compiled from: PG */
public final class C106317r {

    /* renamed from: a */
    public static final C59071e f296611a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ak.c.d.r");

    /* renamed from: b */
    public final C68214a f296612b;

    /* renamed from: c */
    public final C68214a f296613c;

    /* renamed from: d */
    public final AtomicReference f296614d = new AtomicReference();

    /* renamed from: e */
    C60870cx f296615e = null;

    /* renamed from: f */
    private final C68214a f296616f;

    /* renamed from: g */
    private final C68214a f296617g;

    /* renamed from: h */
    private final C68214a f296618h;

    public C106317r(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f296612b = aVar;
        this.f296613c = aVar2;
        this.f296616f = aVar3;
        this.f296617g = aVar4;
        this.f296618h = aVar5;
    }

    /* renamed from: e */
    private final void m177077e(C106286n nVar, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = this.f296615e;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f296615e = null;
        }
        if (((C86124t) this.f296617g.mo27525b()).mo79746e(C90014bt.f247599kG)) {
            this.f296615e = ((C22871g) this.f296616f.mo27525b()).mo28208h("stopNgaSearchServiceClient", ((C86124t) this.f296617g.mo27525b()).mo79743a(C90014bt.f247160bs), new C106310k(this, nVar));
        }
        ((C22871g) this.f296616f.mo27525b()).mo28212l("Send client event", new C106312m(this, nVar, bundle));
    }

    /* renamed from: f */
    private final void m177078f() {
        ((C22871g) this.f296616f.mo27525b()).mo28212l("Set callback for SearchServiceClient disconnection", new C106315p(this));
    }

    /* renamed from: g */
    private final void m177079g() {
        C58976aa aaVar = C58975e.f156826a;
        ((C22871g) this.f296616f.mo27525b()).mo28212l("Start SearchServiceClient", new C106313n(this));
    }

    /* renamed from: a */
    public final void mo95487a() {
        C58976aa aaVar = C58975e.f156826a;
        ((C22871g) this.f296616f.mo27525b()).mo28212l("Disconnect search service client", new C106314o(this));
    }

    /* renamed from: b */
    public final void mo95488b() {
        long a = ((C86124t) this.f296617g.mo27525b()).mo79743a(C90126fx.f251590lg);
        if (a <= 0) {
            C58976aa aaVar = C58975e.f156826a;
            mo95487a();
            return;
        }
        C60870cx cxVar = this.f296615e;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f296615e = null;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f296615e = ((C22871g) this.f296616f.mo27525b()).mo28208h("[NGA] Disconnect SearchServiceClient on OPA activity started", a, new C106316q(this));
    }

    /* renamed from: c */
    public final void mo95489c(C106286n nVar, Bundle bundle) {
        String str;
        C80120h hVar;
        C80122j jVar;
        C80118f fVar;
        C80116d dVar;
        C106279g gVar;
        C106298z zVar;
        C58976aa aaVar = C58975e.f156826a;
        int i = nVar.f296546b;
        C106285m mVar = C106285m.INITIALIZE_QUERY_EVENT_DATA;
        C106221b bVar = (C106221b) this.f296618h.mo27525b();
        String name = C106285m.m177064a(nVar.f296546b).name();
        int ordinal = C106285m.m177064a(nVar.f296546b).ordinal();
        if (ordinal == 0) {
            if (nVar.f296546b == 1) {
                hVar = (C80120h) nVar.f296547c;
            } else {
                hVar = C80120h.f219843o;
            }
            str = hVar.f219846b;
        } else if (ordinal == 1) {
            if (nVar.f296546b == 2) {
                jVar = (C80122j) nVar.f296547c;
            } else {
                jVar = C80122j.f219860d;
            }
            str = jVar.f219863b;
        } else if (ordinal == 2) {
            if (nVar.f296546b == 3) {
                fVar = (C80118f) nVar.f296547c;
            } else {
                fVar = C80118f.f219836e;
            }
            str = fVar.f219839b;
        } else if (ordinal == 3) {
            if (nVar.f296546b == 4) {
                dVar = (C80116d) nVar.f296547c;
            } else {
                dVar = C80116d.f219831d;
            }
            str = dVar.f219834b;
        } else if (ordinal == 4) {
            if (nVar.f296546b == 5) {
                gVar = (C106279g) nVar.f296547c;
            } else {
                gVar = C106279g.f296506g;
            }
            str = gVar.f296509b;
        } else if (ordinal != 15) {
            str = BuildConfig.FLAVOR;
        } else {
            if (nVar.f296546b == 23) {
                zVar = (C106298z) nVar.f296547c;
            } else {
                zVar = C106298z.f296567c;
            }
            str = zVar.f296570b;
        }
        bVar.mo95444b(name, str);
        int ordinal2 = C106285m.m177064a(nVar.f296546b).ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 == 2) {
                    m177077e(nVar, bundle);
                    m177078f();
                    return;
                } else if (ordinal2 == 3) {
                    m177077e(nVar, bundle);
                    mo95487a();
                    return;
                } else if (ordinal2 == 4) {
                    m177079g();
                    m177077e(nVar, bundle);
                    m177078f();
                    return;
                } else if (ordinal2 != 6) {
                    throw new RuntimeException();
                }
            }
            m177077e(nVar, bundle);
            return;
        }
        m177079g();
        m177077e(nVar, bundle);
    }

    /* renamed from: d */
    public final boolean mo95490d() {
        return ((C107705p) this.f296612b.mo27525b()).mo96237j();
    }
}
