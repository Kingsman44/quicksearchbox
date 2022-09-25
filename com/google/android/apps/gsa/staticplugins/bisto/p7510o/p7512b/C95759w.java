package com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74250qv;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.bisto.C89606ad;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90926bw;
import com.google.android.apps.gsa.staticplugins.bisto.p7478ad.C95026a;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95064aa;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95214aa;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95357bh;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95777bo;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95778bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95832d;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95833e;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95836h;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.p10712d.C142379dd;
import com.google.android.p10712d.C142383dh;
import com.google.android.p10712d.C142386dk;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60057jf;
import com.google.common.p4552o.C60087kg;
import com.google.common.p4552o.C60091kk;
import com.google.common.p4552o.C60092kl;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.b.w */
/* compiled from: PG */
public final class C95759w extends C95762z implements AutoCloseable, C89495cg {

    /* renamed from: a */
    public static final C59071e f268078a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.b.w");

    /* renamed from: b */
    public static final long f268079b = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: A */
    public byte[] f268080A;

    /* renamed from: B */
    public Long f268081B;

    /* renamed from: C */
    private volatile C95836h f268082C;

    /* renamed from: D */
    private final C90926bw f268083D;

    /* renamed from: E */
    private final C95833e f268084E;

    /* renamed from: F */
    private final C89496ch f268085F;

    /* renamed from: G */
    private final C95026a f268086G;

    /* renamed from: H */
    private C124548d f268087H;

    /* renamed from: I */
    private SpeakerIdModel f268088I;

    /* renamed from: J */
    private String f268089J;

    /* renamed from: K */
    private final Map f268090K;

    /* renamed from: L */
    private final C74250qv f268091L;

    /* renamed from: c */
    public int f268092c;

    /* renamed from: d */
    public final C95355bf f268093d;

    /* renamed from: e */
    public final C95778bp f268094e;

    /* renamed from: f */
    public final C22871g f268095f;

    /* renamed from: g */
    public final C22871g f268096g;

    /* renamed from: h */
    public final C21370a f268097h;

    /* renamed from: i */
    public final C95064aa f268098i;

    /* renamed from: j */
    public final C95760x f268099j;

    /* renamed from: k */
    public final C95357bh f268100k;

    /* renamed from: l */
    public final C89656k f268101l;

    /* renamed from: m */
    public C58833ax f268102m = C58836b.f156633a;

    /* renamed from: n */
    public HotwordResult f268103n;

    /* renamed from: o */
    public final C89606ad f268104o;

    /* renamed from: p */
    public final C95214aa f268105p;

    /* renamed from: q */
    public C95832d f268106q;

    /* renamed from: r */
    volatile C95748l f268107r;

    /* renamed from: s */
    public PlaybackStatus f268108s;

    /* renamed from: t */
    public int f268109t;

    /* renamed from: u */
    public int f268110u;

    /* renamed from: v */
    public Long f268111v;

    /* renamed from: w */
    public Uri f268112w;

    /* renamed from: x */
    public int f268113x;

    /* renamed from: y */
    public int f268114y;

    /* renamed from: z */
    public int f268115z;

    public C95759w(C95355bf bfVar, C21370a aVar, C95778bp bpVar, C74250qv qvVar, C22871g gVar, C22871g gVar2, C90926bw bwVar, C95833e eVar, C89496ch chVar, C95064aa aaVar, C95026a aVar2, C89606ad adVar, C95214aa aaVar2, C95760x xVar, C95357bh bhVar, C89656k kVar, C95850a aVar3) {
        String str = null;
        this.f268103n = null;
        this.f268106q = null;
        this.f268107r = C95748l.NONE;
        this.f268110u = 0;
        this.f268111v = null;
        this.f268112w = null;
        this.f268113x = 0;
        this.f268114y = 0;
        this.f268115z = 0;
        this.f268080A = null;
        this.f268081B = null;
        this.f268093d = bfVar;
        this.f268097h = aVar;
        this.f268094e = bpVar;
        this.f268095f = gVar;
        this.f268096g = gVar2;
        this.f268083D = bwVar;
        this.f268084E = eVar;
        this.f268091L = qvVar;
        this.f268098i = aaVar;
        this.f268086G = aVar2;
        this.f268085F = chVar;
        this.f268087H = chVar.mo83401b(bfVar.mo89270k());
        this.f268088I = adVar.mo83455a();
        this.f268104o = adVar;
        this.f268105p = aaVar2;
        this.f268099j = xVar;
        this.f268100k = bhVar;
        this.f268101l = kVar;
        this.f268092c = 0;
        C124548d dVar = this.f268087H;
        this.f268089J = dVar != null ? dVar.mo106471L() : str;
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C95748l.NONE, new C95749m(this));
        gzVar.mo55429h(C95748l.FIRST_STAGE_RECOGNIZED, new C95746j(this));
        gzVar.mo55429h(C95748l.FIRST_STAGE_TIMEOUT, new C95747k(this));
        gzVar.mo55429h(C95748l.SECOND_STAGE_RECOGNIZED, new C95753q(this));
        gzVar.mo55429h(C95748l.RECOGNIZING_CACHING, new C95750n(this));
        gzVar.mo55429h(C95748l.RECOGNIZING_CACHING_TIMEOUT, new C95751o(this));
        gzVar.mo55429h(C95748l.START_QUERY, new C95757u(this));
        gzVar.mo55429h(C95748l.VOICE_DATA_DONE, new C95758v(this));
        this.f268090K = gzVar.mo55427f(false);
        chVar.mo83360B(C58528ij.m90011K(26, 31), this);
        m158616s();
        C58976aa aaVar3 = C58975e.f156826a;
        aVar3.f268408a.add(this);
    }

    /* renamed from: r */
    private final void m158615r(Uri uri) {
        C58976aa aaVar = C58975e.f156826a;
        this.f268102m = C58833ax.m90834k(new C95777bo(this.f268094e, uri));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x007c */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m158616s() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.common.f.e r0 = f268078a     // Catch:{ all -> 0x009e }
            com.google.common.f.x r1 = r0.mo56224b()     // Catch:{ all -> 0x009e }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x009e }
            java.lang.String r3 = "HotwordStage2"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x009e }
            java.lang.String r2 = "#createDetectorIfNeeded"
            r3 = 15409(0x3c31, float:2.1593E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.bisto.ad r1 = r6.f268104o     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r1 = r1.mo83455a()     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.staticplugins.bisto.p.h r2 = r6.f268082C     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x002c
            if (r1 == 0) goto L_0x002c
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r2 = r6.f268088I     // Catch:{ all -> 0x009e }
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x009e }
            if (r2 != 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            monitor-exit(r6)
            return
        L_0x002c:
            com.google.android.apps.gsa.shared.bisto.ad r2 = r6.f268104o     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r2 = r2.mo83455a()     // Catch:{ all -> 0x009e }
            r6.f268088I = r2     // Catch:{ all -> 0x009e }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            java.lang.String r3 = "HotwordStage2"
            r0.mo56378ag(r2, r3)     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            r2 = 15410(0x3c32, float:2.1594E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            java.lang.String r2 = "Creating hotword detector: %b \n\n localModel present: %b"
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r5 = r6.f268088I     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            if (r5 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r3 = 0
        L_0x0058:
            r0.mo56358K(r2, r1, r3)     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            com.google.android.apps.gsa.binaries.satin.app.qv r0 = r6.f268091L     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            com.google.android.apps.gsa.binaries.satin.app.qx r1 = new com.google.android.apps.gsa.binaries.satin.app.qx     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            com.google.android.apps.gsa.binaries.satin.app.aqy r2 = r0.f207683a     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            com.google.android.apps.gsa.binaries.satin.app.amb r3 = r0.f207684b     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            com.google.android.apps.gsa.binaries.satin.app.fj r3 = r0.f207685c     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            com.google.android.apps.gsa.binaries.satin.app.rs r0 = r0.f207686d     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            r1.<init>(r2, r3)     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            dagger.b.d r0 = r1.a     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            com.google.common.util.concurrent.cx r0 = r0.mo60297gq()     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            com.google.android.apps.gsa.shared.s.a.a r1 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            com.google.android.apps.gsa.staticplugins.bisto.p.h r0 = (com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95836h) r0     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            r6.f268082C = r0     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x007c }
            monitor-exit(r6)
            return
        L_0x007c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x009e }
            r0.interrupt()     // Catch:{ all -> 0x009e }
            monitor-exit(r6)
            return
        L_0x0085:
            r0 = move-exception
            com.google.common.f.e r1 = f268078a     // Catch:{ all -> 0x009e }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x009e }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x009e }
            java.lang.String r3 = "HotwordStage2"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x009e }
            java.lang.String r2 = "error creating hotword detector"
            r3 = 15411(0x3c33, float:2.1595E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x009e }
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x009e }
            monitor-exit(r6)
            return
        L_0x009e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b.C95759w.m158616s():void");
    }

    /* renamed from: a */
    public final C58833ax mo89724a() {
        return C58833ax.m90834k(new C95739c(this));
    }

    /* renamed from: b */
    public final void mo89725b(C142383dh dhVar, PlaybackStatus playbackStatus) {
        if (this.f268094e.mo89789s()) {
            this.f268094e.mo89712R(dhVar, playbackStatus);
            return;
        }
        long b = this.f268097h.mo26870b();
        int i = this.f268094e.f268275d;
        boolean z = dhVar.f386366k;
        boolean b2 = this.f268086G.mo88940b(this.f268087H);
        this.f268114y = 0;
        this.f268115z = 0;
        if (z && b2) {
            C95832d a = this.f268084E.mo89814a(2);
            this.f268106q = a;
            a.mo89802c(this.f268089J);
            this.f268109t = 0;
            if (mo89749o()) {
                if (!this.f268094e.mo89695r()) {
                    C59104x d = f268078a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "HotwordStage2");
                    ((C59052c) ((C59052c) d).mo56372aa(15418)).mo56386p("Prior query failed to reset (not in a voice query).");
                    int i2 = C90755l.f253831a;
                } else if (mo89751q(1) && i != 0) {
                    mo89741g();
                    C59104x d2 = f268078a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "HotwordStage2");
                    ((C59052c) ((C59052c) d2).mo56372aa(15417)).mo56386p("Received voice data more than a second ago in non-IDLE state");
                    int i3 = C90755l.f253831a;
                } else if (i == 0) {
                    C59104x d3 = f268078a.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "HotwordStage2");
                    ((C59052c) ((C59052c) d3).mo56372aa(15416)).mo56386p("Prior query failed to reset (recognition done).");
                    int i4 = C90755l.f253831a;
                }
            }
        }
        if (!b2) {
            mo89747m(C95748l.VOICE_DATA_DONE);
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        synchronized (this) {
            this.f268110u = 0;
            m158616s();
            this.f268108s = playbackStatus;
            this.f268081B = Long.valueOf(b + f268079b);
            if (this.f268094e.mo89695r()) {
                C59104x b3 = f268078a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "HotwordStage2");
                ((C59052c) ((C59052c) b3).mo56372aa(15414)).mo56359L("Voice Start State=%s%d HW=%s", "B", Integer.valueOf(i), Boolean.valueOf(z));
            } else {
                C59104x b4 = f268078a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "HotwordStage2");
                ((C59052c) ((C59052c) b4).mo56372aa(15413)).mo56359L("Voice Start State=%s%d HW=%s", BuildConfig.FLAVOR, Integer.valueOf(i), Boolean.valueOf(z));
            }
            mo89747m(C95748l.FIRST_STAGE_RECOGNIZED);
        }
    }

    /* renamed from: c */
    public final void mo89726c(C142386dk dkVar) {
        C59104x b = f268078a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordStage2");
        ((C59052c) ((C59052c) b).mo56372aa(15419)).mo56386p("handleVoiceStop");
        mo89739e(this.f268107r).mo89733c(dkVar);
    }

    public final void close() {
        C59104x b = f268078a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordStage2");
        ((C59052c) ((C59052c) b).mo56372aa(15408)).mo56386p("cleaning up");
        this.f268085F.mo83379U(this);
    }

    /* renamed from: d */
    public final void mo89727d() {
        C59104x d = f268078a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "HotwordStage2");
        ((C59052c) ((C59052c) d).mo56372aa(15412)).mo56386p("unexpected handleVoiceData()");
        int i = C90755l.f253831a;
    }

    /* renamed from: e */
    public final C95754r mo89739e(C95748l lVar) {
        return (C95754r) this.f268090K.get(lVar);
    }

    /* renamed from: f */
    public final void mo89740f() {
        C95778bp bpVar = this.f268094e;
        bpVar.mo89784i(bpVar.mo89782b());
        this.f268094e.mo89783e();
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (str.equals(this.f268093d.mo89270k())) {
            this.f268087H = dVar;
            this.f268089J = dVar != null ? dVar.mo106471L() : null;
        }
    }

    /* renamed from: g */
    public final void mo89741g() {
        C95832d dVar = this.f268106q;
        if (dVar != null) {
            dVar.mo89805f(C60091kk.HOTWORD_DATA_INTERRUPTED, (C60057jf) null, (C60087kg) C60092kl.f162479k.createBuilder(), (String) null);
        }
    }

    /* renamed from: h */
    public final synchronized void mo89742h(C142379dd ddVar) {
        mo89739e(this.f268107r).mo89731a(ddVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo89743i() {
        if (this.f268082C != null) {
            this.f268082C.mo89800b();
        }
    }

    /* renamed from: j */
    public final void mo89744j() {
        this.f268111v = Long.valueOf(this.f268097h.mo26870b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final synchronized void mo89745k() {
        C58976aa aaVar = C58975e.f156826a;
        C59104x b = f268078a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordStage2");
        ((C59052c) ((C59052c) b).mo56372aa(15426)).mo56389s("#onHotwordDetected %s", BuildConfig.FLAVOR);
        mo89747m(C95748l.SECOND_STAGE_RECOGNIZED);
    }

    /* renamed from: l */
    public final void mo89746l() {
        C90875ai.m148465b(C95742f.f268050a, this.f268083D.mo85235a(new C95741e(this, new C95740d(this))), this.f268095f, "bisto-hotword").mo85223a(C95743g.f268051a);
    }

    /* renamed from: m */
    public final synchronized void mo89747m(C95748l lVar) {
        C59104x b = f268078a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordStage2");
        ((C59052c) ((C59052c) b).mo56372aa(15429)).mo56389s("stage=%s", lVar);
        mo89739e(this.f268107r).mo89736f(lVar);
        this.f268107r = lVar;
        mo89739e(lVar).mo89735e();
    }

    /* renamed from: n */
    public final synchronized void mo89748n(C95748l lVar) {
        C58976aa aaVar = C58975e.f156826a;
        try {
            C59104x b = f268078a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HotwordStage2");
            ((C59052c) ((C59052c) b).mo56372aa(15431)).mo56386p("cleanUpCP");
            mo89740f();
        } catch (IllegalArgumentException e) {
            C59104x d = f268078a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HotwordStage2");
            ((C59052c) ((C59052c) d).mo56372aa(15434)).mo56389s("URI already reclaimed: %s", e.getMessage());
        } catch (Throwable th) {
            m158615r(this.f268094e.mo89782b());
            throw th;
        }
        C59071e eVar = f268078a;
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "HotwordStage2");
        ((C59052c) ((C59052c) b2).mo56372aa(15432)).mo56386p("Semaphore runner");
        Semaphore semaphore = new Semaphore(0);
        this.f268096g.mo28212l("bisto-hotword-start-cache", new C95744h(this, semaphore));
        C59104x b3 = eVar.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "HotwordStage2");
        ((C59052c) ((C59052c) b3).mo56372aa(15433)).mo56386p("Semaphore Uninterruptable");
        semaphore.acquireUninterruptibly();
        m158615r(this.f268094e.mo89782b());
        mo89747m(lVar);
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo89749o() {
        return C58528ij.m90011K(C95748l.SECOND_STAGE_RECOGNIZED, C95748l.START_QUERY).contains(this.f268107r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        if (r0.mo84676A() != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ba, code lost:
        return false;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo89750p(byte[] r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00bb }
            java.lang.Class<com.google.android.libraries.gsa.k.c.a> r0 = com.google.android.libraries.gsa.p1876k.p1879c.C22865a.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42742b(r0)     // Catch:{ all -> 0x00bb }
            int r0 = r5.f268114y     // Catch:{ all -> 0x00bb }
            int r1 = r6.length     // Catch:{ all -> 0x00bb }
            int r0 = r0 + r1
            r5.f268114y = r0     // Catch:{ all -> 0x00bb }
            boolean r0 = r5.mo89749o()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x002a
            com.google.common.f.e r0 = f268078a     // Catch:{ all -> 0x00bb }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x00bb }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = "HotwordStage2"
            r0.mo56378ag(r2, r3)     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = "secondStage called when hotword already detected"
            r3 = 15440(0x3c50, float:2.1636E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x00bb }
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x00bb }
        L_0x002a:
            int r0 = r5.f268110u     // Catch:{ all -> 0x00bb }
            int r2 = r1 >> 1
            int r0 = r0 + r2
            r5.f268110u = r0     // Catch:{ all -> 0x00bb }
            com.google.android.apps.gsa.staticplugins.bisto.p.h r0 = r5.f268082C     // Catch:{ all -> 0x00bb }
            r2 = 0
            if (r0 != 0) goto L_0x004c
            com.google.common.f.e r6 = f268078a     // Catch:{ all -> 0x00bb }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x00bb }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = "HotwordStage2"
            r6.mo56378ag(r0, r1)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "HotwordDetector is not created!"
            r1 = 15439(0x3c4f, float:2.1635E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x00bb }
            monitor-exit(r5)
            return r2
        L_0x004c:
            com.google.android.apps.gsa.staticplugins.bisto.p.h r0 = r5.f268082C     // Catch:{ all -> 0x00bb }
            com.google.android.apps.gsa.staticplugins.bisto.p.i r6 = r0.mo89801c(r6, r1)     // Catch:{ all -> 0x00bb }
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r0 = r6.f268383a     // Catch:{ all -> 0x00bb }
            r5.f268103n = r0     // Catch:{ all -> 0x00bb }
            com.google.common.base.ax r0 = r6.f268384b     // Catch:{ all -> 0x00bb }
            boolean r0 = r0.mo56113h()     // Catch:{ all -> 0x00bb }
            r1 = 1
            if (r0 == 0) goto L_0x0099
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r0 = r5.f268103n     // Catch:{ all -> 0x00bb }
            if (r0 != 0) goto L_0x0064
            goto L_0x0099
        L_0x0064:
            int r3 = r0.mo84692j()     // Catch:{ all -> 0x00bb }
            r4 = 2
            if (r3 == r4) goto L_0x0072
            boolean r0 = r0.mo84680E()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0099
            goto L_0x0078
        L_0x0072:
            boolean r0 = r0.mo84676A()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0099
        L_0x0078:
            com.google.common.base.ax r0 = r5.f268102m     // Catch:{ all -> 0x00bb }
            boolean r0 = r0.mo56113h()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0094
            com.google.common.base.ax r6 = r6.f268384b     // Catch:{ all -> 0x00bb }
            boolean r0 = r6.mo56113h()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0094
            java.lang.Object r6 = r6.mo56107c()     // Catch:{ all -> 0x00bb }
            byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x00bb }
            r5.f268080A = r6     // Catch:{ all -> 0x00bb }
            if (r6 == 0) goto L_0x0094
            byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x00bb }
        L_0x0094:
            r5.mo89745k()     // Catch:{ all -> 0x00bb }
            monitor-exit(r5)
            return r1
        L_0x0099:
            int r6 = r5.f268110u     // Catch:{ all -> 0x00bb }
            r0 = 19200(0x4b00, float:2.6905E-41)
            if (r6 < r0) goto L_0x00b9
            com.google.android.apps.gsa.staticplugins.bisto.p.d r6 = r5.f268106q     // Catch:{ all -> 0x00bb }
            if (r6 == 0) goto L_0x00b9
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f268362a     // Catch:{ all -> 0x00bb }
            boolean r0 = r0.compareAndSet(r2, r1)     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x00b9
            com.google.common.o.kk r0 = com.google.common.p4552o.C60091kk.HOTWORD_DATA_TRANSFERRED     // Catch:{ all -> 0x00bb }
            com.google.common.o.kl r1 = com.google.common.p4552o.C60092kl.f162479k     // Catch:{ all -> 0x00bb }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x00bb }
            com.google.common.o.kg r1 = (com.google.common.p4552o.C60087kg) r1     // Catch:{ all -> 0x00bb }
            r3 = 0
            r6.mo89805f(r0, r3, r1, r3)     // Catch:{ all -> 0x00bb }
        L_0x00b9:
            monitor-exit(r5)
            return r2
        L_0x00bb:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b.C95759w.mo89750p(byte[]):boolean");
    }

    /* renamed from: q */
    public final boolean mo89751q(int i) {
        return this.f268111v != null && this.f268097h.mo26870b() > this.f268111v.longValue() + TimeUnit.SECONDS.toMillis((long) i);
    }
}
