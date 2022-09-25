package com.google.android.apps.gsa.staticplugins.opa.appintegration;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.apps.gsa.assistant.shared.C73796a;
import com.google.android.apps.gsa.assistant.shared.C73838b;
import com.google.android.apps.gsa.assistant.shared.bd;
import com.google.android.apps.gsa.assistant.shared.c;
import com.google.android.apps.gsa.assistant.shared.d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.search.assistant.platform.appintegration.p8990b.C119516b;
import com.google.android.libraries.assistant.p1467d.p1471b.C17835u;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17840c;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.p1475a.C17858h;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.p1475a.C17859i;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17900bc;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17906h;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17908j;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17909k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.f */
/* compiled from: PG */
public final class C107336f implements C73838b {

    /* renamed from: a */
    public static final C59071e f298704a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appintegration.f");

    /* renamed from: j */
    private static final C73796a f298705j = new C107329b();

    /* renamed from: b */
    public final C68214a f298706b;

    /* renamed from: c */
    public final C86124t f298707c;

    /* renamed from: d */
    public C58833ax f298708d;

    /* renamed from: e */
    public C73796a f298709e = f298705j;

    /* renamed from: f */
    C58833ax f298710f;

    /* renamed from: g */
    final C107335e f298711g;

    /* renamed from: h */
    C58833ax f298712h;

    /* renamed from: i */
    C58833ax f298713i;

    /* renamed from: k */
    private final Context f298714k;

    /* renamed from: l */
    private final C107348r f298715l;

    /* renamed from: m */
    private final bd f298716m;

    /* renamed from: n */
    private final d f298717n;

    /* renamed from: o */
    private final C68214a f298718o;

    /* renamed from: p */
    private final C22871g f298719p;

    /* renamed from: q */
    private final C58833ax f298720q;

    /* renamed from: r */
    private C58833ax f298721r;

    public C107336f(Context context, C107348r rVar, bd bdVar, d dVar, C68214a aVar, C22871g gVar, C68214a aVar2, C86124t tVar, C58833ax axVar) {
        C58836b bVar = C58836b.f156633a;
        this.f298721r = bVar;
        this.f298708d = bVar;
        this.f298710f = bVar;
        this.f298711g = new C107335e(this);
        this.f298712h = bVar;
        this.f298713i = bVar;
        this.f298714k = context;
        this.f298715l = rVar;
        this.f298716m = bdVar;
        this.f298717n = dVar;
        this.f298718o = aVar;
        this.f298719p = gVar;
        this.f298706b = aVar2;
        this.f298707c = tVar;
        this.f298720q = axVar;
    }

    /* renamed from: i */
    private static void m178183i(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new RuntimeException(str.concat(" should be called in main thread"));
        }
    }

    /* renamed from: j */
    private final void m178184j(C17906h hVar) {
        if (this.f298721r.mo56113h()) {
            C17858h hVar2 = (C17858h) C17859i.f51186c.createBuilder();
            hVar2.copyOnWrite();
            C17859i iVar = (C17859i) hVar2.instance;
            C17909k kVar = (C17909k) hVar.build();
            kVar.getClass();
            iVar.f51189b = kVar;
            iVar.f51188a |= 1;
            ((C70862aj) this.f298721r.mo56107c()).mo20123c((C17859i) hVar2.build());
        }
    }

    /* renamed from: k */
    private final void m178185k(C17906h hVar) {
        C17908j a = C17908j.m35107a(((C17909k) hVar.instance).f51317b);
        if (a == null) {
            a = C17908j.UNKNOWN;
        }
        if (this.f298708d.mo56113h()) {
            try {
                ((C17840c) this.f298708d.mo56107c()).mo23477a(((C17909k) hVar.build()).toByteArray());
            } catch (RemoteException e) {
                C59104x d = f298704a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AppIntegCallbackCntlr");
                C59052c cVar = (C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(23644);
                C17908j a2 = C17908j.m35107a(((C17909k) hVar.instance).f51317b);
                if (a2 == null) {
                    a2 = C17908j.UNKNOWN;
                }
                cVar.mo56389s("forwardCallbackEvent(): %s failed.", a2);
            }
        } else {
            throw new IllegalStateException(String.format("Check connected state before use for event: %d", new Object[]{Integer.valueOf(a.f51313l)}));
        }
    }

    /* renamed from: a */
    public final int mo65315a() {
        return this.f298711g.f298702a;
    }

    /* renamed from: b */
    public final void mo65316b() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f298720q.mo56113h()) {
            this.f298721r = C58833ax.m90834k(((C119516b) this.f298720q.mo56107c()).mo104414a(new C107333c()));
        }
        mo95915f(0);
    }

    /* renamed from: c */
    public final void mo65317c() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f298710f.mo56113h()) {
            ((C60870cx) this.f298710f.mo56107c()).cancel(true);
            this.f298710f = C58836b.f156633a;
        }
        m178183i("unbindMaestroService");
        int i = this.f298711g.f298702a;
        if (i == 0) {
            C59104x d = f298704a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AppIntegCallbackCntlr");
            ((C59052c) ((C59052c) d).mo56372aa(23652)).mo56386p("#unbindMaestroService(): calling unbindMaestroService when service is unbound.");
        } else {
            if (i == 3) {
                C17906h hVar = (C17906h) C17909k.f51314c.createBuilder();
                C17908j jVar = C17908j.UNBIND_CALLBACK_SERVICE;
                hVar.copyOnWrite();
                C17909k kVar = (C17909k) hVar.instance;
                kVar.f51317b = jVar.f51313l;
                kVar.f51316a = 1 | kVar.f51316a;
                m178185k(hVar);
            }
            this.f298714k.unbindService(this.f298711g);
        }
        this.f298711g.f298702a = 0;
        C58836b bVar = C58836b.f156633a;
        this.f298708d = bVar;
        this.f298709e = f298705j;
        this.f298712h = bVar;
        if (this.f298721r.mo56113h()) {
            ((C70862aj) this.f298721r.mo56107c()).mo20121a();
        }
    }

    /* renamed from: d */
    public final void mo65318d(C17835u uVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f298712h = C58833ax.m90834k(uVar);
        if (this.f298711g.f298702a == 3) {
            mo95916g();
        }
    }

    /* renamed from: e */
    public final void mo65319e() {
        if (this.f298711g.f298702a != 3) {
            C59104x d = f298704a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AppIntegCallbackCntlr");
            ((C59052c) ((C59052c) d).mo56372aa(23648)).mo56386p("#requestDismissKeyguard(): integration service not connected.");
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        C17906h hVar = (C17906h) C17909k.f51314c.createBuilder();
        C17908j jVar = C17908j.REQUEST_DISMISS_KEYGUARD;
        hVar.copyOnWrite();
        C17909k kVar = (C17909k) hVar.instance;
        kVar.f51317b = jVar.f51313l;
        kVar.f51316a |= 1;
        m178185k(hVar);
        m178184j(hVar);
    }

    /* renamed from: f */
    public final void mo95915f(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (i >= 5) {
            C59104x d = f298704a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AppIntegCallbackCntlr");
            ((C59052c) ((C59052c) d).mo56372aa(23642)).mo56386p("#connectIntegrationService(): Exceeded maximum number of reconnection attempts.");
            if (this.f298716m.u((String) this.f298717n.a().mo3842a())) {
                ((C107345o) this.f298718o.mo27525b()).mo95922b(false);
            }
            this.f298715l.mo95946c();
            this.f298717n.e((String) null);
            this.f298715l.mo95947e();
            this.f298717n.g(c.a);
            return;
        }
        C107334d dVar = new C107334d(this, i);
        m178183i("bindService");
        this.f298709e = dVar;
        if (this.f298711g.f298702a == 3) {
            C59104x d2 = f298704a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "AppIntegCallbackCntlr");
            ((C59052c) ((C59052c) d2).mo56372aa(23655)).mo56386p("#bindService(): calling bindService when service is connected.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.google.android.apps.gsa.opa.APP_INTEGRATION_CALLBACK_SERVICE");
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.appintegration.service.AppIntegrationService"));
        C107335e eVar = this.f298711g;
        eVar.f298702a = 2;
        if (!this.f298714k.bindService(intent, eVar, 1)) {
            C59104x d3 = f298704a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "AppIntegCallbackCntlr");
            ((C59052c) ((C59052c) d3).mo56372aa(23653)).mo56386p("#bindService(): failed to bind service.");
            this.f298711g.f298702a = 0;
            mo95917h(i + 1);
        }
    }

    /* renamed from: g */
    public final void mo95916g() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f298712h.mo56113h()) {
            C17906h hVar = (C17906h) C17909k.f51314c.createBuilder();
            C17908j jVar = C17908j.VOICE_PLATE_STATE_CHANGED;
            hVar.copyOnWrite();
            C17909k kVar = (C17909k) hVar.instance;
            kVar.f51317b = jVar.f51313l;
            kVar.f51316a |= 1;
            hVar.mo58885m(C17900bc.f51289a, (C17835u) this.f298712h.mo56107c());
            m178185k(hVar);
            m178184j(hVar);
            this.f298713i = this.f298712h;
            this.f298712h = C58836b.f156633a;
        }
    }

    /* renamed from: h */
    public final void mo95917h(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f298710f.mo56113h()) {
            ((C60870cx) this.f298710f.mo56107c()).cancel(true);
        }
        this.f298710f = C58833ax.m90834k(this.f298719p.mo28208h("opa:morris-bind-integration-service", 1000, new C107326a(this, i)));
    }
}
