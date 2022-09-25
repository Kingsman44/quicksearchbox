package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.util.p7159c.C90926bw;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95064aa;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95127t;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95188c;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95239o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95832d;
import com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96500t;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96504x;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9402f.C124606a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.p10712d.C142377db;
import com.google.android.p10712d.C142383dh;
import com.google.android.p10712d.C142386dk;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.av */
/* compiled from: PG */
public final class C95731av extends C95814m {

    /* renamed from: e */
    public static final C59071e f268020e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.av");

    /* renamed from: f */
    private final C21370a f268021f;

    /* renamed from: g */
    private final C22871g f268022g;

    /* renamed from: h */
    private final C96504x f268023h;

    /* renamed from: i */
    private final C68214a f268024i;

    /* renamed from: j */
    private final C95355bf f268025j;

    /* renamed from: k */
    private C96500t f268026k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95731av(Context context, C95064aa aaVar, C22871g gVar, C22871g gVar2, C21370a aVar, C96504x xVar, C68214a aVar2, C90926bw bwVar, C96628d dVar, C95239o oVar, C89656k kVar, C124606a aVar3, C95355bf bfVar) {
        super(context, aaVar, oVar, gVar, gVar2, bwVar, dVar, kVar, aVar3);
        this.f268022g = gVar2;
        this.f268021f = aVar;
        this.f268023h = xVar;
        this.f268024i = aVar2;
        this.f268025j = bfVar;
    }

    /* renamed from: w */
    private final void m158553w() {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f268275d;
        C96500t tVar = this.f268026k;
        if (tVar != null) {
            tVar.mo90183d();
            this.f268026k = null;
        }
    }

    /* renamed from: x */
    private final void m158554x(boolean z, PlaybackStatus playbackStatus) {
        if (this.f268275d == 1 || mo89718u()) {
            Uri b = mo89782b();
            if (b == null) {
                C59104x c = f268020e.mo56225c();
                c.mo56378ag(C58975e.f156826a, "LocalMicVoiceInpHandler");
                ((C59052c) ((C59052c) c).mo56372aa(15297)).mo56386p("Can't start voice input - no uri.");
                return;
            }
            mo89790v(new C95455a(b, z, this.f268021f.mo26870b()), C95127t.f266137c, playbackStatus, (C95832d) null);
        }
    }

    /* renamed from: J */
    public final C58833ax mo89704J() {
        C59104x c = f268020e.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LocalMicVoiceInpHandler");
        ((C59052c) ((C59052c) c).mo56372aa(15291)).mo56386p("prepareVoiceData called on the local mic handler.");
        return C58836b.f156633a;
    }

    /* renamed from: K */
    public final void mo89705K(C142377db dbVar) {
        C59104x c = f268020e.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LocalMicVoiceInpHandler");
        ((C59052c) ((C59052c) c).mo56372aa(15292)).mo56386p("local mic should not send VoiceData.");
    }

    /* renamed from: L */
    public final void mo89706L(C142386dk dkVar) {
        C59104x c = f268020e.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LocalMicVoiceInpHandler");
        ((C59052c) ((C59052c) c).mo56372aa(15294)).mo56386p("local mic should not send VoiceStop.");
    }

    /* renamed from: M */
    public final void mo89707M(C95288a aVar, PlaybackStatus playbackStatus) {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f268275d;
        if (!this.f268025j.mo89279x()) {
            ((C95188c) this.f268024i.mo27525b()).mo89096a(9);
        }
        m158554x(true, playbackStatus);
    }

    /* renamed from: N */
    public final void mo89708N() {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f268275d;
        if (this.f268275d != 2) {
            mo89718u();
        }
    }

    /* renamed from: O */
    public final void mo89709O() {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f268275d;
        if (this.f268275d == 1) {
            mo89787n();
        }
    }

    /* renamed from: P */
    public final void mo89710P(C95288a aVar, PlaybackStatus playbackStatus) {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f268275d;
        m158554x(false, playbackStatus);
    }

    /* renamed from: Q */
    public final void mo89711Q() {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f268275d;
        mo89788p();
    }

    /* renamed from: R */
    public final void mo89712R(C142383dh dhVar, PlaybackStatus playbackStatus) {
        C59104x c = f268020e.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LocalMicVoiceInpHandler");
        ((C59052c) ((C59052c) c).mo56372aa(15293)).mo56386p("local mic should not send VoiceStart.");
    }

    /* renamed from: c */
    public final void mo88997c() {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f268275d;
        mo89788p();
    }

    /* renamed from: d */
    public final void mo88998d() {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f268275d;
        mo89788p();
    }

    /* renamed from: f */
    public final void mo88999f() {
        ((C95188c) this.f268024i.mo27525b()).mo89096a(7);
        mo89710P((C95288a) null, (PlaybackStatus) null);
    }

    /* renamed from: h */
    public final void mo89716h() {
        m158553w();
        super.mo89716h();
    }

    /* renamed from: o */
    public final void mo89717o() {
        super.mo89717o();
        ((C95188c) this.f268024i.mo27525b()).mo89096a(8);
    }

    /* renamed from: u */
    public final boolean mo89718u() {
        if (!super.mo89718u()) {
            return false;
        }
        ((C95188c) this.f268024i.mo27525b()).mo89097b();
        String str = true != mo89789s() ? "VOICE_QUERY" : "ANNOUNCEMENT";
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f268275d;
        m158553w();
        Uri b = mo89782b();
        if (b == null) {
            C89655j.m145957a("can't start recording - no uri.");
        } else {
            C96500t tVar = new C96500t(this.f268022g, this.f268023h, str, new C95730au(this, b));
            this.f268026k = tVar;
            tVar.mo90182c();
        }
        return true;
    }
}
