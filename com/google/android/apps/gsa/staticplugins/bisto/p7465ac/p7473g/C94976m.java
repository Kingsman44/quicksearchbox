package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g;

import com.google.android.apps.gsa.nga.api.bh;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90926bw;
import com.google.android.apps.gsa.staticplugins.bisto.opus.OpusDecoder;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94928z;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95007y;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a.C95046i;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a.C95054q;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95838j;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.C37357av;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37513dt;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.C37560ea;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.android.libraries.search.p2904c.p2907ab.C37334a;
import com.google.android.libraries.search.p2904c.p2907ab.C37335b;
import com.google.android.libraries.search.p2904c.p2907ab.C37336c;
import com.google.assistant.p3739a.p3740a.C48098ce;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.g.m */
/* compiled from: PG */
public final class C94976m implements C95054q, C95046i, C94965b {

    /* renamed from: a */
    public static final C59071e f265691a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.g.m");

    /* renamed from: b */
    public final C22871g f265692b;

    /* renamed from: c */
    public final C95007y f265693c;

    /* renamed from: d */
    final OpusDecoder f265694d = new OpusDecoder();

    /* renamed from: e */
    public C94928z f265695e;

    /* renamed from: f */
    public volatile boolean f265696f;

    /* renamed from: g */
    public volatile boolean f265697g = false;

    /* renamed from: h */
    public final AtomicBoolean f265698h = new AtomicBoolean(false);

    /* renamed from: i */
    C37336c f265699i;

    /* renamed from: j */
    private final bh f265700j;

    /* renamed from: k */
    private final C90926bw f265701k;

    public C94976m(C22871g gVar, bh bhVar, C95007y yVar) {
        this.f265692b = gVar;
        this.f265700j = bhVar;
        this.f265693c = yVar;
        this.f265701k = new C90926bw((Object) null);
    }

    /* renamed from: j */
    private final C37360ay m156801j() {
        C94928z zVar = this.f265695e;
        if (zVar == null) {
            C59104x c = f265691a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GacsVoiceInputManager");
            ((C59052c) ((C59052c) c).mo56372aa(17747)).mo56386p("#createAudioLibInputParams without params");
            return C37360ay.f99224l;
        }
        C37357av avVar = (C37357av) C37360ay.f99224l.createBuilder();
        int c2 = zVar.mo88789c();
        avVar.copyOnWrite();
        C37360ay ayVar = (C37360ay) avVar.instance;
        ayVar.f99226a |= 2;
        ayVar.f99228c = c2;
        return (C37360ay) avVar.build();
    }

    /* renamed from: a */
    public final void mo88876a() {
        C59104x b = f265691a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsVoiceInputManager");
        ((C59052c) ((C59052c) b).mo56372aa(17754)).mo56386p("onCancelQuery");
        mo88886g(new C94968e(this));
    }

    /* renamed from: b */
    public final void mo88877b() {
        C59104x b = f265691a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsVoiceInputManager");
        ((C59052c) ((C59052c) b).mo56372aa(17755)).mo56386p("onStopStreaming");
        mo88886g(new C94974k(this));
    }

    /* renamed from: c */
    public final C37336c mo88881c(boolean z) {
        C37335b a = this.f265700j.a(m156801j());
        C37560ea eaVar = (C37560ea) C37561eb.f99800c.createBuilder();
        C37563ed edVar = C37563ed.OPENED;
        eaVar.copyOnWrite();
        C37561eb ebVar = (C37561eb) eaVar.instance;
        ebVar.f99803b = Integer.valueOf(edVar.f99809d);
        ebVar.f99802a = 1;
        C37334a aVar = new C37334a(a, m156801j(), C60856cj.m92900i((C37561eb) eaVar.build()));
        mo88886g(new C94975l(this, aVar));
        return aVar;
    }

    public final void close() {
    }

    /* renamed from: d */
    public final C60870cx mo88883d(boolean z) {
        this.f265698h.set(true);
        C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
        C37516dw dwVar = C37516dw.CLOSED;
        dtVar.copyOnWrite();
        C37514du duVar = (C37514du) dtVar.instance;
        duVar.f99632b = Integer.valueOf(dwVar.f99638d);
        duVar.f99631a = 1;
        return C60856cj.m92900i((C37514du) dtVar.build());
    }

    /* renamed from: e */
    public final void mo88884e(C48098ce ceVar) {
        mo88886g(new C94970g(this, ceVar));
    }

    /* renamed from: f */
    public final void mo88885f(byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
        mo88886g(new C94969f(this, bArr));
    }

    /* renamed from: g */
    public final void mo88886g(C22870f fVar) {
        C90875ai.m148465b(C94972i.f265686a, this.f265701k.mo85235a(new C94971h(this, fVar)), this.f265692b, "v2-qpu-audio-decoder").mo85223a(C94973j.f265687a);
    }

    /* renamed from: h */
    public final void mo88887h(C95838j jVar) {
    }

    /* renamed from: i */
    public final void mo88888i() {
        if (this.f265696f) {
            this.f265694d.mo89797b();
        }
        this.f265696f = false;
        this.f265698h.set(false);
        C37336c cVar = this.f265699i;
        if (cVar != null) {
            ((C37334a) cVar).f99173a.mo40891i();
        }
    }
}
