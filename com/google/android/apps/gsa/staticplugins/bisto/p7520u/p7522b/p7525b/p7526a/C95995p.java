package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a;

import android.content.Intent;
import android.media.MediaRouter;
import com.google.android.apps.gsa.nga.shared.p6356m.C81427c;
import com.google.android.apps.gsa.nga.shared.p6356m.C81428d;
import com.google.android.apps.gsa.staticplugins.bisto.C95458i;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95447t;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95763ba;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95764bb;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.p */
/* compiled from: PG */
public final class C95995p extends C95980a implements C95763ba, C81427c {

    /* renamed from: d */
    private static final C59071e f268759d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.p");

    /* renamed from: c */
    public final C96023bs f268760c;

    /* renamed from: e */
    private final C95447t f268761e;

    /* renamed from: f */
    private final C95764bb f268762f;

    /* renamed from: g */
    private final C95458i f268763g;

    /* renamed from: h */
    private final C22871g f268764h;

    /* renamed from: i */
    private final Optional f268765i;

    public C95995p(C96023bs bsVar, C95447t tVar, C95764bb bbVar, C95850a aVar, C95458i iVar, C22871g gVar, Optional optional) {
        super(bsVar, "WiredInteractingState", tVar, aVar);
        this.f268760c = bsVar;
        this.f268761e = tVar;
        this.f268762f = bbVar;
        this.f268763g = iVar;
        this.f268764h = gVar;
        this.f268765i = optional;
    }

    /* renamed from: a */
    public final void mo75081a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268764h.mo28212l("#onNgaActiveChanged", new C95994o(this));
    }

    /* renamed from: d */
    public final void mo89753d(int i, int i2) {
        if (i2 != 0) {
            C59104x b = f268759d.mo56224b();
            b.mo56378ag(C58975e.f156826a, "WiredInteractingState");
            ((C59052c) ((C59052c) b).mo56372aa(15999)).mo56386p("Phone call started");
            mo89847j("WiredPhoneCallState", (Intent) null);
        }
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268760c.mo89840j(true);
        this.f268760c.mo89834d();
        if (this.f268762f.f268131a != 0) {
            C59104x b = f268759d.mo56224b();
            b.mo56378ag(C58975e.f156826a, "WiredInteractingState");
            ((C59052c) ((C59052c) b).mo56372aa(15994)).mo56386p("In a call");
            mo89847j("WiredPhoneCallState", (Intent) null);
            return;
        }
        if (this.f268765i.isPresent()) {
            ((C81428d) this.f268765i.get()).mo75075b(this);
        }
        this.f268762f.mo89754a(this);
    }

    /* renamed from: i */
    public final void mo89846i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = false;
        this.f268760c.mo89836f();
        if (this.f268765i.isPresent()) {
            ((C81428d) this.f268765i.get()).mo75076c(this);
        }
        this.f268762f.mo89756c(this);
        this.f268763g.mo89373B(this.f268761e.f267071c);
    }

    /* renamed from: io */
    public final void mo89849io(MediaRouter.RouteInfo routeInfo, boolean z, boolean z2, boolean z3) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f268761e.mo89310v(z, z2, z3)) {
            C59104x b = f268759d.mo56224b();
            b.mo56378ag(C58975e.f156826a, "WiredInteractingState");
            ((C59052c) ((C59052c) b).mo56372aa(15998)).mo56386p("Incorrect audio route; moving to READY_NO_AUDIO_WIRED");
            mo89847j("WiredReadyNoAudioState", (Intent) null);
        }
    }

    /* renamed from: l */
    public final boolean mo89848l(Intent intent) {
        if (!"android.intent.action.VOICE_COMMAND".equals(intent.getAction())) {
            return super.mo89848l(intent);
        }
        this.f268761e.mo89307s();
        return true;
    }
}
