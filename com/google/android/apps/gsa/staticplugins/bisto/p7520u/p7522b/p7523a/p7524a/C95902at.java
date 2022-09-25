package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import android.media.MediaRouter;
import com.google.android.apps.gsa.nga.shared.p6356m.C81427c;
import com.google.android.apps.gsa.nga.shared.p6356m.C81428d;
import com.google.android.apps.gsa.shared.bisto.C89603aa;
import com.google.android.apps.gsa.shared.bisto.C89604ab;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89493ce;
import com.google.android.apps.gsa.staticplugins.bisto.C95458i;
import com.google.android.apps.gsa.staticplugins.bisto.p7478ad.C95026a;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95357bh;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95373bx;
import com.google.android.apps.gsa.staticplugins.bisto.p7494l.C95482c;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95711ab;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95763ba;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95764bb;
import com.google.android.apps.gsa.staticplugins.bisto.p7515q.C95848i;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.at */
/* compiled from: PG */
public final class C95902at extends C95910e implements C89603aa, C95763ba, C95711ab, C81427c, C89604ab {

    /* renamed from: d */
    private static final C59071e f268508d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.at");

    /* renamed from: c */
    public final C96023bs f268509c;

    /* renamed from: e */
    private final C95355bf f268510e;

    /* renamed from: f */
    private final C95458i f268511f;

    /* renamed from: g */
    private final C95357bh f268512g;

    /* renamed from: h */
    private final C95026a f268513h;

    /* renamed from: i */
    private final C89492cd f268514i;

    /* renamed from: j */
    private final C95482c f268515j;

    /* renamed from: k */
    private final C95764bb f268516k;

    /* renamed from: l */
    private final C22871g f268517l;

    /* renamed from: m */
    private final Optional f268518m;

    /* renamed from: n */
    private final C95373bx f268519n;

    /* renamed from: o */
    private final C89493ce f268520o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95902at(C95346ax axVar, C96023bs bsVar, C89492cd cdVar, C89493ce ceVar, C95458i iVar, C95357bh bhVar, C95026a aVar, C95482c cVar, C95764bb bbVar, C95848i iVar2, Optional optional, C22871g gVar, C95373bx bxVar, C95850a aVar2) {
        super(axVar, bsVar, "VQInteractingState", cdVar, iVar2, aVar2);
        this.f268509c = bsVar;
        this.f268510e = axVar;
        this.f268511f = iVar;
        this.f268512g = bhVar;
        this.f268513h = aVar;
        this.f268514i = cdVar;
        this.f268515j = cVar;
        this.f268516k = bbVar;
        this.f268517l = gVar;
        this.f268518m = optional;
        this.f268519n = bxVar;
        this.f268520o = ceVar;
    }

    /* renamed from: n */
    private final C124548d m159026n() {
        return this.f268514i.mo83401b(this.f268510e.mo89270k());
    }

    /* renamed from: o */
    private final void m159027o() {
        C58976aa aaVar = C58975e.f156826a;
        C124548d n = m159026n();
        if (n == null) {
            C59104x c = f268508d.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VQInteractingState");
            ((C59052c) ((C59052c) c).mo56372aa(15921)).mo56386p("Could not retrieve bistoDeviceInfo.");
            return;
        }
        m159028p();
        this.f268512g.mo89296i(this.f268510e, this.f268513h.mo88940b(n));
    }

    /* renamed from: p */
    private final void m159028p() {
        C58976aa aaVar = C58975e.f156826a;
        C124548d n = m159026n();
        if (n == null) {
            C59104x c = f268508d.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VQInteractingState");
            ((C59052c) ((C59052c) c).mo56372aa(15936)).mo56386p("Could not retrieve bistoDeviceInfo for hotword check.");
            this.f268511f.mo89376E(this.f268510e.mo89270k(), false, false);
        } else if (n.mo106497ak()) {
            this.f268511f.mo89376E(this.f268510e.mo89270k(), this.f268513h.mo88940b(n), true);
        }
    }

    /* renamed from: a */
    public final void mo75081a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268517l.mo28212l("#onNgaActiveChanged", new C95899aq(this));
    }

    /* renamed from: b */
    public final void mo83451b() {
        this.f268515j.mo89386a();
        m159027o();
    }

    /* renamed from: c */
    public final void mo83452c() {
        this.f268517l.mo28212l("#onSodaUsageChanged", new C95901as(this));
    }

    /* renamed from: d */
    public final void mo89753d(int i, int i2) {
        if (i2 != 0) {
            C59104x b = f268508d.mo56224b();
            b.mo56378ag(C58975e.f156826a, "VQInteractingState");
            ((C59052c) ((C59052c) b).mo56372aa(15928)).mo56386p("Phone call started");
            mo89847j("DispatchingState", (Intent) null);
        }
    }

    /* renamed from: e */
    public final void mo89671e() {
        C58976aa aaVar = C58975e.f156826a;
        mo89847j("SdkState", (Intent) null);
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (set.contains(29)) {
            C59104x b = f268508d.mo56224b();
            b.mo56378ag(C58975e.f156826a, "VQInteractingState");
            ((C59052c) ((C59052c) b).mo56372aa(15931)).mo56389s("OHD status change. Current status: %s", dVar.mo106461B());
            if (this.f268520o.mo83439a(dVar)) {
                mo89847j("OffHeadStateInteracting", (Intent) null);
            }
        }
        if (set.contains(26)) {
            C59104x b2 = f268508d.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "VQInteractingState");
            ((C59052c) ((C59052c) b2).mo56372aa(15930)).mo56389s("Target hotword model: %s", dVar.mo106482W());
            m159027o();
        }
        if (set.contains(31)) {
            C59104x b3 = f268508d.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "VQInteractingState");
            ((C59052c) ((C59052c) b3).mo56372aa(15929)).mo56386p("Hotword was enabled or disabled, recreating component.");
            this.f268517l.mo28212l("#onDeviceInfoChanged (HOTWORD_USER_CONSENT)", new C95900ar(this));
        }
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268519n.f266875e = 3;
        if (this.f268516k.f268131a != 0) {
            C59104x b = f268508d.mo56224b();
            b.mo56378ag(C58975e.f156826a, "VQInteractingState");
            ((C59052c) ((C59052c) b).mo56372aa(15919)).mo56386p("In a call");
            mo89847j("DispatchingState", (Intent) null);
            return;
        }
        this.f268516k.mo89754a(this);
        this.f268509c.mo89834d();
        m159028p();
        this.f268515j.mo89386a();
        this.f268511f.mo83460f(this);
        this.f268511f.f267116g.add(this);
        if (this.f268518m.isPresent()) {
            ((C81428d) this.f268518m.get()).mo75075b(this);
        }
        this.f268509c.mo89832b(this);
        this.f268512g.mo89290c(this.f268510e);
    }

    /* renamed from: h */
    public final void mo89672h() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: i */
    public final void mo89846i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = false;
        this.f268519n.f266875e = 2;
        this.f268516k.mo89756c(this);
        this.f268511f.mo83472r(this);
        this.f268511f.f267116g.remove(this);
        if (this.f268518m.isPresent()) {
            ((C81428d) this.f268518m.get()).mo75076c(this);
        }
        this.f268509c.mo89839i(this);
    }

    /* renamed from: io */
    public final void mo89849io(MediaRouter.RouteInfo routeInfo, boolean z, boolean z2, boolean z3) {
        C58976aa aaVar = C58975e.f156826a;
        if (!"deviceId-c18b75e2-82d5-4974-8bc9-7119c97c6ad8".equals(this.f268510e.mo89270k())) {
            if (!z || z2 || !z3) {
                C59104x b = f268508d.mo56224b();
                b.mo56378ag(C58975e.f156826a, "VQInteractingState");
                ((C59052c) ((C59052c) b).mo56372aa(15925)).mo56386p("Incorrect audio route; moving to READY_NO_AUDIO");
                mo89847j("ReadyNoAudClassicState", (Intent) null);
            }
        }
    }

    /* renamed from: j */
    public final void mo89847j(String str, Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        if (!str.equals("TwsReconnectingInteractingState")) {
            this.f268511f.mo89376E(this.f268510e.mo89270k(), false, false);
            this.f268509c.mo89836f();
        }
        super.mo89847j(str, intent);
    }

    /* renamed from: l */
    public final boolean mo89848l(Intent intent) {
        if ("action_start_audio_testing".equals(intent.getAction())) {
            mo89847j("AudioTestingState", intent);
            return true;
        }
        if ("action_set_hotword_setting_state".equals(intent.getAction()) && this.f268510e.mo89270k().equals(intent.getStringExtra("key_device_id"))) {
            m159027o();
        }
        return super.mo89848l(intent);
    }
}
