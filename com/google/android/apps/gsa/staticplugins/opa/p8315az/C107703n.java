package com.google.android.apps.gsa.staticplugins.opa.p8315az;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.C106204a;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.C106221b;
import com.google.android.apps.gsa.staticplugins.opa.p8595v.C113898b;
import com.google.android.apps.gsa.staticplugins.opa.p8595v.C113920x;
import com.google.android.apps.gsa.staticplugins.opa.util.C113884o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import dagger.C68214a;
import java.util.HashSet;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.az.n */
/* compiled from: PG */
public final class C107703n {

    /* renamed from: a */
    public static final C59071e f299696a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.az.n");

    /* renamed from: b */
    public final C68214a f299697b;

    /* renamed from: c */
    public final C113898b f299698c;

    /* renamed from: d */
    public final C113920x f299699d;

    /* renamed from: e */
    public final Set f299700e = new HashSet();

    /* renamed from: f */
    public final boolean f299701f;

    /* renamed from: g */
    public final boolean f299702g;

    /* renamed from: h */
    public final C106221b f299703h;

    /* renamed from: i */
    public final C107702m f299704i = new C107702m();

    /* renamed from: j */
    public Optional f299705j = Optional.empty();

    /* renamed from: k */
    public C87673aa f299706k;

    /* renamed from: l */
    public C107706q f299707l = C107706q.DEFAULT;

    /* renamed from: m */
    private final C87677ae f299708m;

    /* renamed from: n */
    private final C68214a f299709n;

    /* renamed from: o */
    private final boolean f299710o;

    /* renamed from: p */
    private final boolean f299711p;

    public C107703n(C87677ae aeVar, C68214a aVar, C68214a aVar2, C113898b bVar, C113920x xVar, C86124t tVar, C106221b bVar2) {
        this.f299708m = aeVar;
        this.f299709n = aVar;
        this.f299697b = aVar2;
        this.f299698c = bVar;
        this.f299699d = xVar;
        this.f299701f = tVar.mo79746e(C90014bt.f247512iZ);
        this.f299710o = tVar.mo79746e(C90014bt.f247566ja);
        this.f299702g = tVar.mo79746e(C90014bt.f247057V);
        this.f299711p = tVar.mo79746e(C90014bt.f247271dx);
        this.f299703h = bVar2;
    }

    /* renamed from: a */
    public final long mo96222a() {
        C58976aa aaVar = C58975e.f156826a;
        C87673aa aaVar2 = this.f299706k;
        if (aaVar2 != null) {
            return aaVar2.f237001q;
        }
        C59104x c = f299696a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OSSClientManager");
        ((C59052c) ((C59052c) c).mo56372aa(26047)).mo56386p("getSessionId, Search Service Client is not connected");
        return 0;
    }

    /* renamed from: b */
    public final C107706q mo96223b() {
        C58976aa aaVar = C58975e.f156826a;
        C107706q qVar = C107706q.DEFAULT;
        for (C107707r rVar : this.f299700e) {
            C107706q a = rVar.mo96228a();
            C107706q qVar2 = C107706q.STARTED;
            if (a == qVar2) {
                return qVar2;
            }
            C107706q a2 = rVar.mo96228a();
            C107706q qVar3 = C107706q.CONNECTED;
            if (a2 == qVar3) {
                qVar = qVar3;
            }
        }
        return qVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo96224c() {
        C87673aa aaVar = this.f299706k;
        if (aaVar != null) {
            C58976aa aaVar2 = C58975e.f156826a;
            this.f299703h.mo95448f(C106204a.CONNECT);
            aaVar.mo81932c();
            return;
        }
        C58976aa aaVar3 = C58975e.f156826a;
        this.f299703h.mo95448f(C106204a.CREATE);
        C87677ae aeVar = this.f299708m;
        C107702m mVar = this.f299711p ? this.f299704i : null;
        C88486g gVar = new C88486g();
        gVar.f239199a = 4411200389408L;
        gVar.f239201c = amo.OPA_ANDROID;
        gVar.f239204f = "opa";
        if (((C113884o) this.f299709n.mo27525b()).mo100742a()) {
            gVar.f239200b = 16;
        }
        C87673aa a = aeVar.mo81958a((C87682aj) null, mVar, new ClientConfig(gVar));
        this.f299706k = a;
        this.f299703h.mo95448f(C106204a.CONNECT);
        a.mo81932c();
        a.mo81940l(new C107699j(this), C88244um.TTS_PLAYBACK_STARTED, C88244um.TTS_PLAYBACK_DONE);
        if (this.f299702g) {
            a.mo81940l(new C107700k(this), C88244um.CONVERSATION_SURFACE_EVENT);
            a.mo81940l(new C107701l(this), C88244um.OPA_SESSION_SERVICE_EVENT);
        }
    }

    /* renamed from: d */
    public final void mo96225d() {
        C87673aa aaVar = this.f299706k;
        if (aaVar == null) {
            C59104x c = f299696a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OSSClientManager");
            ((C59052c) ((C59052c) c).mo56372aa(26055)).mo56386p("disconnectClient, Search Service Client is not connected");
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f299703h.mo95448f(C106204a.DISCONNECT);
        aaVar.mo81934f();
        this.f299706k = null;
    }

    /* renamed from: e */
    public final void mo96226e() {
        C87673aa aaVar = this.f299706k;
        if (aaVar == null) {
            C59104x c = f299696a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OSSClientManager");
            ((C59052c) ((C59052c) c).mo56372aa(26070)).mo56386p("startClient, Search Service Client is not connected");
        } else if (this.f299710o) {
            C58976aa aaVar2 = C58975e.f156826a;
            long a = mo96222a();
            this.f299703h.mo95449g(C106204a.START, Optional.empty(), Optional.m71637of(Long.valueOf(a)), Optional.empty());
            aaVar.mo81946r(a, (Bundle) null, C88431bb.f239082a);
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            this.f299703h.mo95448f(C106204a.START);
            aaVar.mo81944p();
        }
    }

    /* renamed from: f */
    public final void mo96227f() {
        C87673aa aaVar = this.f299706k;
        if (aaVar == null) {
            C59104x c = f299696a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OSSClientManager");
            ((C59052c) ((C59052c) c).mo56372aa(26072)).mo56386p("stopClient, Search Service Client is not connected");
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f299703h.mo95448f(C106204a.STOP);
        aaVar.mo81948t(false);
    }
}
