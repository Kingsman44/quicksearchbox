package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94929a;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7472f.C94963b;
import com.google.android.libraries.assistant.accessory.gmutls.C11018a;
import com.google.android.libraries.assistant.accessory.p617a.C10992c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.j */
/* compiled from: PG */
final class C94886j implements C94929a {

    /* renamed from: a */
    final /* synthetic */ C94887k f265364a;

    public C94886j(C94887k kVar) {
        this.f265364a = kVar;
    }

    /* renamed from: a */
    public final void mo88735a(byte[] bArr) {
        this.f265364a.mo88760x(bArr);
        this.f265364a.mo88756p();
    }

    /* renamed from: b */
    public final void mo88736b() {
        this.f265364a.f265392i.mo28212l("check-already-subscribed", new C94882f(this));
    }

    /* renamed from: c */
    public final void mo88737c() {
        C59104x c = C94887k.f265367a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoBleConnection");
        ((C59052c) ((C59052c) c).mo56372aa(17265)).mo56389s("[%s] Fatal handshake error during crypto setup", C94876ay.m156554c(this.f265364a.f265385b));
        this.f265364a.mo88750i(false);
    }

    /* renamed from: d */
    public final void mo88738d() {
        this.f265364a.f265392i.mo28212l("handshake-timeout-error", new C94883g(this));
    }

    /* renamed from: e */
    public final void mo88739e() {
        C59104x c = C94887k.f265367a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoBleConnection");
        ((C59052c) ((C59052c) c).mo56372aa(17266)).mo56389s("[%s] Closing down client, preparing for new handshake", C94876ay.m156554c(this.f265364a.f265385b));
        this.f265364a.f265399p = null;
        this.f265364a.f265400q = null;
        this.f265364a.f265401r = null;
        this.f265364a.f265387d.mo88848b();
        this.f265364a.f265388e.mo88848b();
        this.f265364a.f265389f.mo88848b();
        this.f265364a.mo88746e();
        C94963b bVar = this.f265364a.f265394k;
        if (bVar != null) {
            bVar.mo88871a().mo88804f();
        }
        C94887k kVar = this.f265364a;
        kVar.f265406w.mo19484i(new C11018a(kVar.f265393j));
        this.f265364a.f265405v.mo88840a();
        this.f265364a.f265402s = new C10992c(608);
    }

    /* renamed from: f */
    public final void mo88740f(int i) {
        C59104x b = C94887k.f265367a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoBleConnection");
        ((C59052c) ((C59052c) b).mo56372aa(17267)).mo56352E("[%s] Received max frame size %s", C94876ay.m156554c(this.f265364a.f265385b), i);
        this.f265364a.f265399p = new C10992c(i);
        this.f265364a.f265400q = new C10992c(i);
        this.f265364a.f265401r = new C10992c(i);
        this.f265364a.f265402s = new C10992c(i);
    }

    /* renamed from: g */
    public final void mo88741g() {
        this.f265364a.f265392i.mo28212l("ping-timeout-reconnect", new C94884h(this));
    }

    /* renamed from: h */
    public final void mo88742h(int i) {
        this.f265364a.f265393j = i;
    }
}
