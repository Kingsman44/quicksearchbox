package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.content.Context;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.shared.util.p7159c.C90926bw;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95188c;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95357bh;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7527c.C96053d;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96500t;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96504x;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.p10712d.C142377db;
import com.google.android.p10712d.C142379dd;
import com.google.android.p10712d.C142381df;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.at */
/* compiled from: PG */
public final class C95729at extends C95724ao {

    /* renamed from: l */
    public static final C59071e f268013l = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.at");

    /* renamed from: m */
    private final C22871g f268014m;

    /* renamed from: n */
    private final C96504x f268015n;

    /* renamed from: o */
    private final C68214a f268016o;

    /* renamed from: p */
    private C96500t f268017p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95729at(Context context, C22871g gVar, C22871g gVar2, C89496ch chVar, C96504x xVar, C68214a aVar, C90926bw bwVar, C95293ae aeVar, C95850a aVar2, C89656k kVar, C95355bf bfVar, C96053d dVar, C95357bh bhVar) {
        super(context, gVar, gVar2, chVar, bwVar, aeVar, aVar2, false, kVar, bfVar, dVar, bhVar);
        this.f268014m = gVar2;
        this.f268015n = xVar;
        this.f268016o = aVar;
    }

    /* renamed from: S */
    private final void m158537S() {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f267992j;
        m158538T();
        C96500t tVar = new C96500t(this.f268014m, this.f268015n, "local-audio-service", new C95728as(this));
        this.f268017p = tVar;
        tVar.mo90182c();
    }

    /* renamed from: T */
    private final void m158538T() {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f267992j;
        C96500t tVar = this.f268017p;
        if (tVar != null) {
            tVar.mo90183d();
            this.f268017p = null;
        }
    }

    /* renamed from: H */
    public final boolean mo89686H() {
        return true;
    }

    /* renamed from: J */
    public final C58833ax mo89704J() {
        C59104x c = f268013l.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LclMicExtVoiceInHandler");
        ((C59052c) ((C59052c) c).mo56372aa(15272)).mo56386p("unexpected prepareForVoiceData()");
        return C58836b.f156633a;
    }

    /* renamed from: K */
    public final void mo89705K(C142377db dbVar) {
        C59104x c = f268013l.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LclMicExtVoiceInHandler");
        ((C59052c) ((C59052c) c).mo56372aa(15275)).mo56386p("unexpected handleVoiceData()");
    }

    /* renamed from: L */
    public final void mo89706L(C142386dk dkVar) {
        C59104x c = f268013l.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LclMicExtVoiceInHandler");
        ((C59052c) ((C59052c) c).mo56372aa(15279)).mo56386p("unexpected handleVoiceStop()");
    }

    /* renamed from: M */
    public final void mo89707M(C95288a aVar, PlaybackStatus playbackStatus) {
        int i = this.f267992j;
        if (i != 2 && i != 1) {
            mo89708N();
            mo89710P(aVar, playbackStatus);
        }
    }

    /* renamed from: N */
    public final void mo89708N() {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f267992j;
        C22872h.m42742b(C0826b.class);
        if (mo89685G()) {
            if (mo89690h() != null) {
                C22872h.m42742b(C0826b.class);
                mo89711Q();
            }
            mo89691i();
            m158537S();
            mo89682C(1);
        }
    }

    /* renamed from: O */
    public final void mo89709O() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: P */
    public final void mo89710P(C95288a aVar, PlaybackStatus playbackStatus) {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f267992j;
        C22872h.m42742b(C0826b.class);
        if (mo89685G() && this.f267992j != 2) {
            ((C95188c) this.f268016o.mo27525b()).mo89096a(2);
            C95723an h = mo89690h();
            if (h == null) {
                h = mo89691i();
                m158537S();
            }
            h.mo89678a();
            mo89697w(new C95726aq(this, h));
            mo89682C(2);
        }
    }

    /* renamed from: Q */
    public final void mo89711Q() {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f267992j;
        C22872h.m42742b(C0826b.class);
        if (mo89685G()) {
            C95723an h = mo89690h();
            if (h == null) {
                C59104x c = f268013l.mo56225c();
                c.mo56378ag(C58975e.f156826a, "LclMicExtVoiceInHandler");
                ((C59052c) ((C59052c) c).mo56372aa(15288)).mo56386p("voice stop received when there is no active session");
                return;
            }
            if (h.f267981c.get()) {
                ((C95188c) this.f268016o.mo27525b()).mo89096a(2);
                mo89697w(new C95725ap(this));
            }
            this.f267993k.set((Object) null);
            m158538T();
            mo89682C(0);
        }
    }

    /* renamed from: R */
    public final void mo89712R(C142383dh dhVar, PlaybackStatus playbackStatus) {
        C59104x c = f268013l.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LclMicExtVoiceInHandler");
        ((C59052c) ((C59052c) c).mo56372aa(15278)).mo56386p("unexpected handleVoiceStart()");
    }

    /* renamed from: g */
    public final void mo89713g() {
        C22872h.m42742b(C0826b.class);
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f267992j;
    }

    /* renamed from: j */
    public final void mo89714j(C142379dd ddVar) {
        C59104x c = f268013l.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LclMicExtVoiceInHandler");
        ((C59052c) ((C59052c) c).mo56372aa(15276)).mo56386p("unexpected handleVoiceInfo()");
    }

    /* renamed from: k */
    public final void mo89715k(C142381df dfVar) {
        C59104x c = f268013l.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LclMicExtVoiceInHandler");
        ((C59052c) ((C59052c) c).mo56372aa(15277)).mo56386p("unexpected handleVoiceMissingData()");
    }
}
