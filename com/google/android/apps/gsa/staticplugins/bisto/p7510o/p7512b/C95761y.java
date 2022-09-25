package com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b;

import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bisto.p7478ad.C95026a;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95778bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95803ci;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.p10712d.C142359ck;
import com.google.android.p10712d.C142377db;
import com.google.android.p10712d.C142379dd;
import com.google.android.p10712d.C142381df;
import com.google.android.p10712d.C142383dh;
import com.google.android.p10712d.C142386dk;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.b.y */
/* compiled from: PG */
public final class C95761y implements AutoCloseable, C95803ci, C89495cg {

    /* renamed from: a */
    private static final C59071e f268121a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.b.y");

    /* renamed from: b */
    private final C95778bp f268122b;

    /* renamed from: c */
    private final C95355bf f268123c;

    /* renamed from: d */
    private final C95026a f268124d;

    /* renamed from: e */
    private C124548d f268125e;

    /* renamed from: f */
    private final C95759w f268126f;

    /* renamed from: g */
    private final C95737a f268127g;

    /* renamed from: h */
    private final C89496ch f268128h;

    /* renamed from: i */
    private C95762z f268129i;

    public C95761y(C95778bp bpVar, C95759w wVar, C95737a aVar, C89496ch chVar, C95355bf bfVar, C95026a aVar2, C95850a aVar3) {
        this.f268122b = bpVar;
        this.f268126f = wVar;
        this.f268127g = aVar;
        this.f268129i = aVar;
        this.f268123c = bfVar;
        this.f268124d = aVar2;
        this.f268128h = chVar;
        this.f268125e = chVar.mo83401b(bfVar.mo89270k());
        chVar.mo83360B(C58528ij.m90011K(26, 31), this);
        C58976aa aaVar = C58975e.f156826a;
        aVar3.f268408a.add(this);
    }

    /* renamed from: J */
    public final C58833ax mo89704J() {
        return this.f268129i.mo89724a();
    }

    /* renamed from: K */
    public final void mo89705K(C142377db dbVar) {
        this.f268129i.mo89727d();
    }

    /* renamed from: L */
    public final void mo89706L(C142386dk dkVar) {
        this.f268129i.mo89726c(dkVar);
    }

    /* renamed from: M */
    public final void mo89707M(C95288a aVar, PlaybackStatus playbackStatus) {
        this.f268122b.mo89707M(aVar, playbackStatus);
    }

    /* renamed from: N */
    public final void mo89708N() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: O */
    public final void mo89709O() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: P */
    public final void mo89710P(C95288a aVar, PlaybackStatus playbackStatus) {
        this.f268122b.mo89710P(aVar, playbackStatus);
    }

    /* renamed from: Q */
    public final void mo89711Q() {
        this.f268122b.mo89711Q();
    }

    /* renamed from: R */
    public final void mo89712R(C142383dh dhVar, PlaybackStatus playbackStatus) {
        boolean z = dhVar.f386366k;
        boolean b = this.f268124d.mo88940b(this.f268125e);
        if (!z || !b) {
            this.f268129i = this.f268127g;
        } else {
            this.f268129i = this.f268126f;
        }
        this.f268129i.mo89725b(dhVar, playbackStatus);
    }

    /* renamed from: a */
    public final int mo89688a() {
        return this.f268122b.f268275d;
    }

    /* renamed from: c */
    public final void mo88997c() {
        this.f268122b.mo88997c();
    }

    public final void close() {
        C59104x b = f268121a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MicStreamDelegator");
        ((C59052c) ((C59052c) b).mo56372aa(15446)).mo56386p("cleaning up");
        this.f268128h.mo83379U(this);
    }

    /* renamed from: d */
    public final void mo88998d() {
        this.f268122b.mo88998d();
    }

    /* renamed from: f */
    public final void mo88999f() {
        C59104x d = f268121a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MicStreamDelegator");
        ((C59052c) ((C59052c) d).mo56372aa(15450)).mo56386p("openMic");
        int i = C90755l.f253831a;
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (str.equals(this.f268123c.mo89270k())) {
            this.f268125e = dVar;
        }
    }

    /* renamed from: g */
    public final void mo89713g() {
        this.f268122b.mo89713g();
    }

    /* renamed from: j */
    public final void mo89714j(C142379dd ddVar) {
        C95762z zVar = this.f268129i;
        if (zVar == null) {
            C59104x d = f268121a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MicStreamDelegator");
            ((C59052c) ((C59052c) d).mo56372aa(15447)).mo56386p("Ignoring VoiceInfo. Delegation hasn't been established yet");
            return;
        }
        zVar.mo89742h(ddVar);
    }

    /* renamed from: k */
    public final void mo89715k(C142381df dfVar) {
        C59104x d = f268121a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MicStreamDelegator");
        ((C59052c) ((C59052c) d).mo56372aa(15448)).mo56386p("handleVoiceMissingData");
        int i = C90755l.f253831a;
    }

    /* renamed from: q */
    public final /* synthetic */ boolean mo89694q(C142359ck ckVar) {
        return true;
    }

    /* renamed from: r */
    public final boolean mo89695r() {
        return this.f268122b.mo89695r();
    }

    /* renamed from: t */
    public final boolean mo89696t() {
        return this.f268122b.mo89696t();
    }
}
