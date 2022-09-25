package com.google.android.apps.gsa.nga.engine.recognition.p6110c;

import com.google.android.apps.gsa.nga.engine.am.p.d;
import com.google.android.apps.gsa.nga.engine.av.af;
import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.b.f.f;
import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.e.b.a.o;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75157e;
import com.google.android.apps.gsa.nga.engine.p5978b.p5987f.C75245i;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6137s.C77908f;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.C78712r;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.engine.p6273z.C80031b;
import com.google.android.apps.gsa.nga.engine.p6273z.C80045p;
import com.google.android.apps.gsa.nga.engine.recognition.C77495a;
import com.google.android.apps.gsa.nga.engine.recognition.C77553af;
import com.google.android.apps.gsa.nga.engine.recognition.C77557aj;
import com.google.android.apps.gsa.nga.engine.recognition.C77564aq;
import com.google.android.apps.gsa.nga.engine.recognition.C77570aw;
import com.google.android.apps.gsa.nga.engine.recognition.C77572b;
import com.google.android.apps.gsa.nga.engine.recognition.C77623f;
import com.google.android.apps.gsa.nga.engine.recognition.C77889u;
import com.google.android.apps.gsa.nga.engine.recognition.C77891w;
import com.google.android.apps.gsa.nga.engine.recognition.p6109b.C77580h;
import com.google.android.apps.gsa.nga.engine.recognition.p6115f.C77631d;
import com.google.android.apps.gsa.nga.engine.recognition.p6131m.C77865d;
import com.google.android.apps.gsa.nga.engine.viss.C79391u;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6288j.C80471b;
import com.google.android.apps.gsa.nga.shared.p6320al.C80884a;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82300ab;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82376cx;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82907ew;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.recognizer.p5233a.C67464l;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.c.n */
/* compiled from: PG */
public final class C77595n implements C77553af, C75157e, C77572b, C77631d {

    /* renamed from: s */
    private static final C58974d f213763s = C58974d.m91136j();

    /* renamed from: t */
    private static final C58528ij f213764t = C58528ij.m90012L(C83016y.OFFLINE_SPEECH_ENDED, C83016y.MANUAL_ENDPOINT, C83016y.ENDPOINT_ON_TIMEOUT);

    /* renamed from: A */
    private final C118843f f213765A;

    /* renamed from: B */
    private final C78712r f213766B;

    /* renamed from: C */
    private final o f213767C;

    /* renamed from: D */
    private final C83305i f213768D;

    /* renamed from: E */
    private final C80031b f213769E;

    /* renamed from: F */
    private final C76092h f213770F;

    /* renamed from: a */
    public final C75050a f213771a;

    /* renamed from: b */
    public final d f213772b;

    /* renamed from: c */
    public final f f213773c;

    /* renamed from: d */
    public final C22871g f213774d;

    /* renamed from: e */
    public final C77603v f213775e;

    /* renamed from: f */
    public final C91142g f213776f;

    /* renamed from: g */
    public final AtomicBoolean f213777g = new AtomicBoolean(false);

    /* renamed from: h */
    public final AtomicBoolean f213778h = new AtomicBoolean(false);

    /* renamed from: i */
    public final C77580h f213779i;

    /* renamed from: j */
    public final C80045p f213780j;

    /* renamed from: k */
    public final C79391u f213781k;

    /* renamed from: l */
    public C82907ew f213782l = C82907ew.f226160o;

    /* renamed from: m */
    public C83016y f213783m = C83016y.UNKNOWN;

    /* renamed from: n */
    public C60870cx f213784n = C60866ct.f164955a;

    /* renamed from: o */
    public final C68214a f213785o;

    /* renamed from: p */
    public final AtomicBoolean f213786p = new AtomicBoolean(false);

    /* renamed from: q */
    public final AtomicBoolean f213787q = new AtomicBoolean(false);

    /* renamed from: r */
    public final AtomicReference f213788r = new AtomicReference();

    /* renamed from: u */
    private final C68214a f213789u;

    /* renamed from: v */
    private final C77908f f213790v;

    /* renamed from: w */
    private final C79851ai f213791w;

    /* renamed from: x */
    private final C77865d f213792x;

    /* renamed from: y */
    private final C75245i f213793y;

    /* renamed from: z */
    private final af f213794z;

    public C77595n(C75050a aVar, d dVar, C68214a aVar2, C77908f fVar, f fVar2, C90821bm bmVar, C79851ai aiVar, C77865d dVar2, C75245i iVar, af afVar, C77603v vVar, C78712r rVar, C91142g gVar, C118843f fVar3, o oVar, C77580h hVar, C83305i iVar2, C80045p pVar, C79391u uVar, C76092h hVar2, C80031b bVar, C68214a aVar3) {
        this.f213766B = rVar;
        this.f213767C = oVar;
        this.f213771a = aVar;
        this.f213772b = dVar;
        this.f213789u = aVar2;
        this.f213790v = fVar;
        this.f213773c = fVar2;
        C90821bm bmVar2 = bmVar;
        this.f213774d = bmVar.mo85163a(C77594m.class);
        this.f213791w = aiVar;
        this.f213792x = dVar2;
        this.f213793y = iVar;
        this.f213794z = afVar;
        this.f213775e = vVar;
        this.f213776f = gVar;
        this.f213765A = fVar3;
        this.f213779i = hVar;
        this.f213768D = iVar2;
        this.f213780j = pVar;
        this.f213781k = uVar;
        this.f213770F = hVar2;
        this.f213769E = bVar;
        this.f213785o = aVar3;
    }

    /* renamed from: l */
    private final void m124526l(String str, C83016y yVar) {
        C83305i iVar = this.f213768D;
        String name = yVar.name();
        if (name != null) {
            iVar.mo75579d(new C82376cx("NGA_INVOCATION", str, name));
            return;
        }
        throw new NullPointerException("Null attentionTrigger");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0134 A[Catch:{ all -> 0x0281 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x013b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71137a(com.google.android.apps.gsa.nga.engine.p5964av.C75077bo r10, com.google.android.apps.gsa.nga.engine.p5964av.C75077bo r11) {
        /*
            r9 = this;
            com.google.common.f.a.d r0 = f213763s
            com.google.common.f.x r1 = r0.mo56224b()
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1
            r2 = 4318(0x10de, float:6.051E-42)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            r2 = r1
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            java.lang.String r3 = "State changed: %s => %s by %s and %s with %s"
            com.google.android.apps.gsa.nga.engine.av.bl r4 = r11.mo71458b()
            com.google.android.apps.gsa.nga.engine.av.bl r5 = r10.mo71458b()
            com.google.android.apps.gsa.nga.shared.v.d.y r1 = r10.mo71460d()
            java.lang.String r6 = r1.name()
            j$.util.Optional r1 = r10.mo71467m()
            com.google.android.apps.gsa.nga.engine.recognition.c.i r7 = com.google.android.apps.gsa.nga.engine.recognition.p6110c.C77590i.f213754a
            j$.util.Optional r1 = r1.map(r7)
            java.lang.String r7 = "N/A"
            java.lang.Object r7 = r1.orElse(r7)
            j$.util.Optional r8 = r10.mo71463g()
            r2.mo56361N(r3, r4, r5, r6, r7, r8)
            java.util.concurrent.atomic.AtomicBoolean r1 = r9.f213777g
            com.google.android.apps.gsa.nga.engine.av.bl r2 = r10.mo71458b()
            com.google.android.apps.gsa.nga.engine.av.bl r3 = com.google.android.apps.gsa.nga.engine.av.bl.a
            boolean r2 = r2.equals(r3)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0058
            com.google.android.apps.gsa.nga.shared.v.d.y r2 = r10.mo71460d()
            com.google.android.apps.gsa.nga.shared.v.d.y r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y.RETRY
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0058
            r2 = 1
            goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            r1.set(r2)
            com.google.android.apps.gsa.nga.engine.x.ai r1 = r9.f213791w
            r2 = 29
            com.google.android.apps.gsa.nga.engine.x.ah r1 = r1.mo74251b(r2)
            com.google.android.apps.gsa.nga.engine.recognition.m.d r2 = r9.f213792x     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.shared.aa.j.b r2 = r2.mo72841d(r10)     // Catch:{ all -> 0x0281 }
            java.util.concurrent.atomic.AtomicReference r5 = r9.f213788r     // Catch:{ all -> 0x0281 }
            r5.set(r2)     // Catch:{ all -> 0x0281 }
            j$.util.Optional r5 = r10.mo71464h()     // Catch:{ all -> 0x0281 }
            j$.util.Optional r6 = r11.mo71464h()     // Catch:{ all -> 0x0281 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0281 }
            if (r5 != 0) goto L_0x00ad
            j$.util.Optional r5 = r11.mo71464h()     // Catch:{ all -> 0x0281 }
            boolean r5 = r5.isPresent()     // Catch:{ all -> 0x0281 }
            if (r5 == 0) goto L_0x00ad
            com.google.common.f.x r5 = r0.mo56224b()     // Catch:{ all -> 0x0281 }
            com.google.common.f.a.a r5 = (com.google.common.p4526f.p4527a.C58970a) r5     // Catch:{ all -> 0x0281 }
            r6 = 4324(0x10e4, float:6.059E-42)
            com.google.common.f.x r5 = r5.mo56372aa(r6)     // Catch:{ all -> 0x0281 }
            com.google.common.f.a.a r5 = (com.google.common.p4526f.p4527a.C58970a) r5     // Catch:{ all -> 0x0281 }
            java.lang.String r6 = "Cancel previous utterance: %s"
            j$.util.Optional r7 = r11.mo71464h()     // Catch:{ all -> 0x0281 }
            r5.mo56389s(r6, r7)     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.b.f.f r5 = r9.f213773c     // Catch:{ all -> 0x0281 }
            j$.util.Optional r6 = r11.mo71464h()     // Catch:{ all -> 0x0281 }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.b.g.ac r6 = (com.google.android.apps.gsa.nga.engine.b.g.ac) r6     // Catch:{ all -> 0x0281 }
            r5.a(r6)     // Catch:{ all -> 0x0281 }
        L_0x00ad:
            boolean r5 = r10.mo71473s()     // Catch:{ all -> 0x0281 }
            if (r5 == 0) goto L_0x00b8
            java.util.concurrent.atomic.AtomicBoolean r5 = r9.f213787q     // Catch:{ all -> 0x0281 }
            r5.set(r4)     // Catch:{ all -> 0x0281 }
        L_0x00b8:
            com.google.android.apps.gsa.nga.engine.av.bl r5 = r10.mo71458b()     // Catch:{ all -> 0x0281 }
            boolean r5 = r5.a()     // Catch:{ all -> 0x0281 }
            r6 = 0
            if (r5 != 0) goto L_0x013f
            com.google.android.apps.gsa.z.a.f r11 = r9.f213765A     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.search.c.e r2 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_NO_AUDIO     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.search.c.d r5 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_ANY     // Catch:{ all -> 0x0281 }
            r11.mo71761v(r2, r5, r6)     // Catch:{ all -> 0x0281 }
            j$.util.Optional r11 = r10.mo71464h()     // Catch:{ all -> 0x0281 }
            java.util.concurrent.atomic.AtomicBoolean r2 = r9.f213787q     // Catch:{ all -> 0x0281 }
            boolean r2 = r2.get()     // Catch:{ all -> 0x0281 }
            if (r2 == 0) goto L_0x0110
            boolean r2 = r11.isPresent()     // Catch:{ all -> 0x0281 }
            if (r2 == 0) goto L_0x0110
            com.google.common.b.ij r2 = f213764t     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.shared.v.d.y r5 = r10.mo71460d()     // Catch:{ all -> 0x0281 }
            boolean r2 = r2.contains(r5)     // Catch:{ all -> 0x0281 }
            if (r2 != 0) goto L_0x00eb
            goto L_0x0110
        L_0x00eb:
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0281 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0281 }
            r2 = 4323(0x10e3, float:6.058E-42)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x0281 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0281 }
            java.lang.String r2 = "Not stopping speech recognizer because going into pending execution state"
            r0.mo56386p(r2)     // Catch:{ all -> 0x0281 }
            dagger.a r0 = r9.f213789u     // Catch:{ all -> 0x0281 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.recognition.aq r0 = (com.google.android.apps.gsa.nga.engine.recognition.C77564aq) r0     // Catch:{ all -> 0x0281 }
            java.lang.Object r11 = r11.get()     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.b.g.ac r11 = (com.google.android.apps.gsa.nga.engine.b.g.ac) r11     // Catch:{ all -> 0x0281 }
            r0.mo72673a(r11)     // Catch:{ all -> 0x0281 }
            goto L_0x011b
        L_0x0110:
            dagger.a r11 = r9.f213789u     // Catch:{ all -> 0x0281 }
            java.lang.Object r11 = r11.mo27525b()     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.recognition.aq r11 = (com.google.android.apps.gsa.nga.engine.recognition.C77564aq) r11     // Catch:{ all -> 0x0281 }
            r11.mo72677e()     // Catch:{ all -> 0x0281 }
        L_0x011b:
            java.lang.String r11 = "PAUSE"
            com.google.android.apps.gsa.nga.shared.v.d.y r0 = r10.mo71460d()     // Catch:{ all -> 0x0281 }
            r9.m124526l(r11, r0)     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.am.y.c r11 = r10.mo71457a()     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.am.y.d r0 = com.google.android.apps.gsa.nga.engine.p5964av.C75078bp.f209366e     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.am.y.g r11 = r11.b     // Catch:{ all -> 0x0281 }
            java.lang.Object r11 = r11.b(r0)     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.av.bk r11 = (com.google.android.apps.gsa.nga.engine.p5964av.C75076bk) r11     // Catch:{ all -> 0x0281 }
            if (r11 == 0) goto L_0x0139
            com.google.android.apps.gsa.nga.engine.b.f.f r0 = r9.f213773c     // Catch:{ all -> 0x0281 }
            r0.c(r10, r11)     // Catch:{ all -> 0x0281 }
        L_0x0139:
            if (r1 == 0) goto L_0x013e
            r1.mo74255b()
        L_0x013e:
            return
        L_0x013f:
            j$.util.Optional r5 = r10.mo71464h()     // Catch:{ all -> 0x0281 }
            boolean r7 = r5.isEmpty()     // Catch:{ all -> 0x0281 }
            if (r7 == 0) goto L_0x0166
            com.google.common.f.x r11 = r0.mo56225c()     // Catch:{ all -> 0x0281 }
            com.google.common.f.a.a r11 = (com.google.common.p4526f.p4527a.C58970a) r11     // Catch:{ all -> 0x0281 }
            r0 = 4321(0x10e1, float:6.055E-42)
            com.google.common.f.x r11 = r11.mo56372aa(r0)     // Catch:{ all -> 0x0281 }
            com.google.common.f.a.a r11 = (com.google.common.p4526f.p4527a.C58970a) r11     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = "No utterance for state %s"
            com.google.android.apps.gsa.nga.engine.av.bl r10 = r10.mo71458b()     // Catch:{ all -> 0x0281 }
            r11.mo56389s(r0, r10)     // Catch:{ all -> 0x0281 }
            if (r1 == 0) goto L_0x0165
            r1.mo74255b()
        L_0x0165:
            return
        L_0x0166:
            j$.util.Optional r7 = r10.mo71463g()     // Catch:{ all -> 0x0281 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0281 }
            if (r7 == 0) goto L_0x018d
            com.google.common.f.x r11 = r0.mo56225c()     // Catch:{ all -> 0x0281 }
            com.google.common.f.a.a r11 = (com.google.common.p4526f.p4527a.C58970a) r11     // Catch:{ all -> 0x0281 }
            r0 = 4320(0x10e0, float:6.054E-42)
            com.google.common.f.x r11 = r11.mo56372aa(r0)     // Catch:{ all -> 0x0281 }
            com.google.common.f.a.a r11 = (com.google.common.p4526f.p4527a.C58970a) r11     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = "No SpeechSessionParams set for %s"
            com.google.android.apps.gsa.nga.engine.av.bl r10 = r10.mo71458b()     // Catch:{ all -> 0x0281 }
            r11.mo56389s(r0, r10)     // Catch:{ all -> 0x0281 }
            if (r1 == 0) goto L_0x018c
            r1.mo74255b()
        L_0x018c:
            return
        L_0x018d:
            java.lang.Object r0 = r5.get()     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.b.g.ac r0 = (com.google.android.apps.gsa.nga.engine.b.g.ac) r0     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.x.d r5 = new com.google.android.apps.gsa.nga.engine.x.d     // Catch:{ all -> 0x0281 }
            r5.<init>(r0)     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.av.bl r11 = r11.mo71458b()     // Catch:{ all -> 0x0281 }
            boolean r11 = r11.a()     // Catch:{ all -> 0x0281 }
            if (r11 == 0) goto L_0x01c3
            com.google.android.apps.gsa.nga.engine.av.bl r11 = r10.mo71458b()     // Catch:{ all -> 0x0281 }
            boolean r11 = r11.a()     // Catch:{ all -> 0x0281 }
            if (r11 == 0) goto L_0x01c3
            dagger.a r11 = r9.f213789u     // Catch:{ all -> 0x0281 }
            java.lang.Object r11 = r11.mo27525b()     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.recognition.aq r11 = (com.google.android.apps.gsa.nga.engine.recognition.C77564aq) r11     // Catch:{ all -> 0x0281 }
            j$.util.Optional r0 = r10.mo71463g()     // Catch:{ all -> 0x0281 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.recognition.as r0 = (com.google.android.apps.gsa.nga.engine.recognition.C77566as) r0     // Catch:{ all -> 0x0281 }
            boolean r11 = r11.mo72675c(r0, r5)     // Catch:{ all -> 0x0281 }
            goto L_0x01d9
        L_0x01c3:
            dagger.a r11 = r9.f213789u     // Catch:{ all -> 0x0281 }
            java.lang.Object r11 = r11.mo27525b()     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.recognition.aq r11 = (com.google.android.apps.gsa.nga.engine.recognition.C77564aq) r11     // Catch:{ all -> 0x0281 }
            j$.util.Optional r0 = r10.mo71463g()     // Catch:{ all -> 0x0281 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.recognition.as r0 = (com.google.android.apps.gsa.nga.engine.recognition.C77566as) r0     // Catch:{ all -> 0x0281 }
            boolean r11 = r11.mo72676d(r0, r5)     // Catch:{ all -> 0x0281 }
        L_0x01d9:
            com.google.android.apps.gsa.nga.engine.b.f.f r0 = r9.f213773c     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.shared.aa.j.b r5 = com.google.android.apps.gsa.nga.shared.p6275aa.p6288j.C80471b.S3     // Catch:{ all -> 0x0281 }
            if (r2 != r5) goto L_0x01e2
            com.google.android.apps.gsa.nga.engine.recognition.u r2 = com.google.android.apps.gsa.nga.engine.recognition.C77889u.S3     // Catch:{ all -> 0x0281 }
            goto L_0x01e4
        L_0x01e2:
            com.google.android.apps.gsa.nga.engine.recognition.u r2 = com.google.android.apps.gsa.nga.engine.recognition.C77889u.SODA     // Catch:{ all -> 0x0281 }
        L_0x01e4:
            r0.e(r10, r2)     // Catch:{ all -> 0x0281 }
            if (r11 == 0) goto L_0x025b
            com.google.android.apps.gsa.shared.util.v.g r11 = r9.f213776f     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251107ca     // Catch:{ all -> 0x0281 }
            boolean r11 = r11.mo85405j(r0)     // Catch:{ all -> 0x0281 }
            if (r11 == 0) goto L_0x01f4
            goto L_0x0225
        L_0x01f4:
            com.google.android.apps.gsa.nga.engine.e.b.a.o r11 = r9.f213767C     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.search.c.e r11 = r11.a()     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.search.c.e r0 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_BLUETOOTH_REQUIRED     // Catch:{ all -> 0x0281 }
            int r11 = r11.ordinal()     // Catch:{ all -> 0x0281 }
            if (r11 == 0) goto L_0x021c
            if (r11 == r3) goto L_0x0212
            r0 = 3
            if (r11 == r0) goto L_0x0208
            goto L_0x0225
        L_0x0208:
            com.google.android.apps.gsa.z.a.f r11 = r9.f213765A     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.search.c.e r0 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_NO_AUDIO     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.search.c.d r2 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_NONE     // Catch:{ all -> 0x0281 }
            r11.mo71761v(r0, r2, r6)     // Catch:{ all -> 0x0281 }
            goto L_0x0225
        L_0x0212:
            com.google.android.apps.gsa.z.a.f r11 = r9.f213765A     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.search.c.e r0 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_BLUETOOTH_PREFERRED     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.search.c.d r2 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_BVRA     // Catch:{ all -> 0x0281 }
            r11.mo71761v(r0, r2, r6)     // Catch:{ all -> 0x0281 }
            goto L_0x0225
        L_0x021c:
            com.google.android.apps.gsa.z.a.f r11 = r9.f213765A     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.search.c.e r0 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_BLUETOOTH_REQUIRED     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.search.c.d r2 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_BVRA     // Catch:{ all -> 0x0281 }
            r11.mo71761v(r0, r2, r6)     // Catch:{ all -> 0x0281 }
        L_0x0225:
            com.google.android.apps.gsa.nga.engine.recognition.b.h r11 = r9.f213779i     // Catch:{ all -> 0x0281 }
            monitor-enter(r11)     // Catch:{ all -> 0x0281 }
            r0 = 0
            r11.f213723b = r0     // Catch:{ all -> 0x0258 }
            r11.f213722a = r3     // Catch:{ all -> 0x0258 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f213726e     // Catch:{ all -> 0x0258 }
            r0.set(r4)     // Catch:{ all -> 0x0258 }
            monitor-exit(r11)     // Catch:{ all -> 0x0258 }
            java.util.concurrent.atomic.AtomicBoolean r11 = r9.f213786p     // Catch:{ all -> 0x0281 }
            r11.set(r4)     // Catch:{ all -> 0x0281 }
            java.util.concurrent.atomic.AtomicBoolean r11 = r9.f213787q     // Catch:{ all -> 0x0281 }
            r11.set(r4)     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.gsa.k.g r11 = r9.f213774d     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.recognition.c.v r0 = r9.f213775e     // Catch:{ all -> 0x0281 }
            p3186j$.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.recognition.c.g r2 = new com.google.android.apps.gsa.nga.engine.recognition.c.g     // Catch:{ all -> 0x0281 }
            r2.<init>(r0)     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = "[NGA] NgaHandler.clearLastNonFinalRecognitionResult"
            r11.mo28212l(r0, r2)     // Catch:{ all -> 0x0281 }
            java.lang.String r11 = "RESET"
            com.google.android.apps.gsa.nga.shared.v.d.y r0 = r10.mo71460d()     // Catch:{ all -> 0x0281 }
            r9.m124526l(r11, r0)     // Catch:{ all -> 0x0281 }
            goto L_0x025b
        L_0x0258:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0258 }
            throw r10     // Catch:{ all -> 0x0281 }
        L_0x025b:
            boolean r11 = r10.mo71470p()     // Catch:{ all -> 0x0281 }
            if (r11 == 0) goto L_0x0276
            com.google.android.apps.gsa.nga.engine.viss.u r11 = r9.f213781k     // Catch:{ all -> 0x0281 }
            boolean r11 = r11.mo74010c()     // Catch:{ all -> 0x0281 }
            if (r11 != 0) goto L_0x0276
            com.google.android.libraries.gsa.k.g r11 = r9.f213774d     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.recognition.c.j r0 = new com.google.android.apps.gsa.nga.engine.recognition.c.j     // Catch:{ all -> 0x0281 }
            r0.<init>(r9, r10)     // Catch:{ all -> 0x0281 }
            java.lang.String r10 = "[NGA] NgaHandler.onActiveStateChangeEvent"
            r11.mo28212l(r10, r0)     // Catch:{ all -> 0x0281 }
            goto L_0x027b
        L_0x0276:
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.f213778h     // Catch:{ all -> 0x0281 }
            r10.set(r4)     // Catch:{ all -> 0x0281 }
        L_0x027b:
            if (r1 == 0) goto L_0x0280
            r1.mo74255b()
        L_0x0280:
            return
        L_0x0281:
            r10 = move-exception
            if (r1 == 0) goto L_0x029e
            r1.mo74255b()     // Catch:{ all -> 0x0288 }
            goto L_0x029e
        L_0x0288:
            r11 = move-exception
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x029e }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r0[r4] = r1     // Catch:{ Exception -> 0x029e }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            java.lang.String r2 = "addSuppressed"
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r2, r0)     // Catch:{ Exception -> 0x029e }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x029e }
            r1[r4] = r11     // Catch:{ Exception -> 0x029e }
            r0.invoke(r10, r1)     // Catch:{ Exception -> 0x029e }
        L_0x029e:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.recognition.p6110c.C77595n.mo71137a(com.google.android.apps.gsa.nga.engine.av.bo, com.google.android.apps.gsa.nga.engine.av.bo):void");
    }

    /* renamed from: b */
    public final void mo71138b(bl blVar) {
        if (blVar == bl.a) {
            ((C58970a) ((C58970a) f213763s.mo56224b()).mo56372aa(4325)).mo56386p("NGA starts FULL_LISTENING");
        }
    }

    /* renamed from: c */
    public final void mo72619c(C67464l lVar, ac acVar, boolean z) {
        this.f213774d.mo28212l("[NGA] NgaHandler.onEndpointerEvent", new C77586e(this, lVar, z, acVar));
    }

    /* renamed from: e */
    public final void mo72620e(C77557aj ajVar) {
        boolean z;
        if (!ajVar.mo72658u()) {
            if (this.f213775e.mo72733d(ajVar)) {
                ajVar.mo72660x();
                return;
            }
            this.f213775e.mo72732c(ajVar);
            if (ajVar.mo72639b() == C77889u.PROACTIVE) {
                this.f213772b.g();
            }
            String b = C80884a.m128737b(ajVar.mo72660x().trim(), this.f213770F.mo72021b().mo72039e());
            C80031b bVar = this.f213769E;
            ac b2 = ajVar.mo72638a().b();
            synchronized (bVar.f219623a) {
                if (ajVar.mo72662z()) {
                    z = bVar.f219624b.remove(b2);
                } else {
                    if (!b.isEmpty()) {
                        bVar.f219624b.add(b2);
                        while (bVar.f219624b.size() > 8) {
                            bVar.f219624b.pollFirst();
                        }
                    }
                    z = false;
                }
            }
            if (ajVar.mo72662z()) {
                C83305i iVar = bVar.f219625c;
                String name = ajVar.mo72639b().name();
                if (name != null) {
                    iVar.mo75579d(new C82300ab("EMPTY_RECOGNITION", name, z, !b.isEmpty()));
                } else {
                    throw new NullPointerException("Null speechRecognizer");
                }
            }
            this.f213774d.mo28212l("[NGA] NgaHandler.onRecognitionResult", new C77592k(this, b, ajVar));
        }
    }

    /* renamed from: f */
    public final void mo72621f(C77570aw awVar) {
        this.f213793y.mo71600f(awVar);
        this.f213772b.t(this.f213794z.b(awVar.mo72709f()));
    }

    /* renamed from: g */
    public final void mo72711g(ac acVar, C77495a aVar) {
        aVar.name();
        this.f213774d.mo28212l("[NGA] NgaHandler.onListeningStateTimeout", new C77593l(this, acVar, aVar));
    }

    /* renamed from: gG */
    public final void mo72714gG(C77623f fVar) {
        Optional h = this.f213771a.mo71417a().mo71464h();
        if (!h.isEmpty() && ((ac) h.get()).equals(fVar.mo72755d())) {
            this.f213766B.mo73589a(fVar.mo72752a());
            if (!this.f213776f.mo85405j(C90126fx.f251297gE) || this.f213788r.get() != C80471b.S3) {
                C77580h hVar = this.f213779i;
                float a = fVar.mo72752a();
                synchronized (hVar) {
                    if (hVar.f213722a && hVar.f213723b < a) {
                        hVar.f213723b = a;
                    }
                }
            }
        }
    }

    /* renamed from: gK */
    public final void mo72622gK(C77891w wVar) {
        this.f213772b.e();
        this.f213790v.mo72879d();
    }

    /* renamed from: h */
    public final void mo72726h(ac acVar, C83016y yVar) {
        C58838bb.m90868c(f213764t.contains(yVar));
        this.f213787q.set(true);
        this.f213772b.c(acVar, yVar);
    }

    /* renamed from: i */
    public final void mo72727i(ac acVar) {
        if (this.f213776f.mo85405j(C90126fx.f251297gE)) {
            this.f213779i.f213726e.set(true);
        }
    }

    /* renamed from: j */
    public final void mo72728j(ac acVar, C89849ae aeVar, C83016y yVar) {
        this.f213773c.b(acVar);
        this.f213772b.a(aeVar, yVar);
    }

    /* renamed from: k */
    public final boolean mo72729k() {
        return ((C77564aq) this.f213789u.mo27525b()).mo72674b();
    }
}
