package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8200d;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106284l;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106286n;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107460a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107503d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107487m;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107705p;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.d.e */
/* compiled from: PG */
public final class C106304e {

    /* renamed from: a */
    public static final C59071e f296579a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ak.c.d.e");

    /* renamed from: b */
    public final C68214a f296580b;

    /* renamed from: c */
    public final Set f296581c = new HashSet();

    /* renamed from: d */
    public int f296582d = 1;

    /* renamed from: e */
    public final AtomicReference f296583e = new AtomicReference();

    /* renamed from: f */
    C60870cx f296584f = null;

    /* renamed from: g */
    private final C68214a f296585g;

    /* renamed from: h */
    private final C68214a f296586h;

    public C106304e(C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f296580b = aVar;
        this.f296585g = aVar2;
        this.f296586h = aVar3;
    }

    /* renamed from: a */
    static ClientEventData m177068a(C106286n nVar, Bundle bundle, int i) {
        C106284l lVar = (C106284l) nVar.toBuilder();
        lVar.copyOnWrite();
        C106286n nVar2 = (C106286n) lVar.instance;
        nVar2.f296545a |= C89885b.HTTP_VALUE;
        nVar2.f296549e = i;
        C107503d dVar = (C107503d) C107504e.f299115c.createBuilder();
        C107502c cVar = C107502c.NGA_CLIENT_EVENT;
        dVar.copyOnWrite();
        C107504e eVar = (C107504e) dVar.instance;
        eVar.f299118b = cVar.f299114n;
        eVar.f299117a |= 1;
        dVar.mo58885m(C107487m.f299082a, (C106286n) lVar.build());
        C88489j jVar = new C88489j(C87739bu.OPA_SESSION_CLIENT_EVENT);
        jVar.mo82014b(C107460a.f299029a, (C107504e) dVar.build());
        Bundle g = C90772bp.m148299g(bundle);
        if (g != null) {
            jVar.mo82015c(g);
        }
        return jVar.mo82013a();
    }

    /* renamed from: f */
    private final void m177069f() {
        C60870cx cxVar = this.f296584f;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f296584f = null;
        }
        if (((C86124t) this.f296586h.mo27525b()).mo79746e(C90014bt.f247599kG)) {
            this.f296584f = ((C22871g) this.f296585g.mo27525b()).mo28208h("stopNgaSearchServiceClient", ((C86124t) this.f296586h.mo27525b()).mo79743a(C90014bt.f247160bs), new C106303d(this));
        }
    }

    /* renamed from: b */
    public final void mo95479b() {
        Callable callable = (Callable) this.f296583e.get();
        if (callable != null) {
            try {
                callable.call();
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) f296579a.mo56225c()).mo56382g(e)).mo56372aa(25222)).mo56386p("error calling callback on disconnect");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo95480c(C106286n nVar, Bundle bundle) {
        m177069f();
        ((C22871g) this.f296585g.mo27525b()).mo28212l("connectAndSendNgaClientEvent", new C106301b(this, nVar, bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo95481d(C106286n nVar, Bundle bundle) {
        m177069f();
        ((C22871g) this.f296585g.mo27525b()).mo28212l("sendNgaClientEventIfConnected", new C106299a(this, nVar, bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo95482e() {
        return ((C107705p) this.f296580b.mo27525b()).mo96237j();
    }
}
