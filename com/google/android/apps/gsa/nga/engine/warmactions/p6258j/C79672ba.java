package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.apps.gsa.nga.engine.p6260x.C79857e;
import com.google.android.apps.gsa.nga.engine.recognition.C77548aa;
import com.google.android.apps.gsa.nga.engine.recognition.C77892x;
import com.google.android.apps.gsa.nga.engine.warmactions.p6248a.C79456n;
import com.google.android.apps.gsa.nga.engine.warmactions.p6250c.C79485j;
import com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79544b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79552j;
import com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79553k;
import com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79561s;
import com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79562t;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79617a;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80561f;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81012c;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81013d;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81014e;
import com.google.android.apps.gsa.nga.shared.p6345h.C81252aq;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82473gm;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.speech.p5218j.C67026ih;
import com.google.speech.p5218j.C67037is;
import com.google.speech.p5218j.C67038it;
import com.google.speech.p5218j.C67048jc;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67095kw;
import dagger.C68214a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.ba */
/* compiled from: PG */
public final class C79672ba implements C79617a, C77892x {

    /* renamed from: a */
    public static final C58974d f218494a = C58974d.m91136j();

    /* renamed from: b */
    public final C81252aq f218495b;

    /* renamed from: c */
    public final C68214a f218496c;

    /* renamed from: d */
    public final C22871g f218497d;

    /* renamed from: e */
    public final C81013d f218498e;

    /* renamed from: f */
    public final C91142g f218499f;

    /* renamed from: g */
    public final AtomicBoolean f218500g = new AtomicBoolean(false);

    /* renamed from: h */
    public final AtomicLong f218501h = new AtomicLong(0);

    /* renamed from: i */
    public final C81012c f218502i = new C81012c();

    /* renamed from: j */
    public final C79693bv f218503j;

    /* renamed from: k */
    private final C79857e f218504k;

    /* renamed from: l */
    private final C79687bp f218505l;

    /* renamed from: m */
    private final Optional f218506m;

    /* renamed from: n */
    private final C79553k f218507n;

    /* renamed from: o */
    private final Optional f218508o;

    /* renamed from: p */
    private final Executor f218509p;

    /* renamed from: q */
    private final C21370a f218510q;

    /* renamed from: r */
    private final AtomicReference f218511r;

    /* renamed from: s */
    private final AtomicReference f218512s = new AtomicReference(Optional.empty());

    /* renamed from: t */
    private final AtomicReference f218513t = new AtomicReference(Optional.empty());

    public C79672ba(C79857e eVar, C81252aq aqVar, C79687bp bpVar, Optional optional, C79553k kVar, C68214a aVar, C22871g gVar, Optional optional2, C79693bv bvVar, C81013d dVar, C91142g gVar2, Executor executor, C21370a aVar2) {
        this.f218504k = eVar;
        this.f218495b = aqVar;
        this.f218505l = bpVar;
        this.f218506m = optional;
        this.f218507n = kVar;
        this.f218496c = aVar;
        this.f218497d = gVar;
        this.f218508o = optional2;
        this.f218503j = bvVar;
        this.f218498e = dVar;
        this.f218499f = gVar2;
        this.f218509p = executor;
        this.f218510q = aVar2;
        this.f218511r = new AtomicReference(new C79856d(eVar.mo74270a()));
    }

    /* renamed from: p */
    private final Optional m127729p(Optional optional, C67095kw kwVar) {
        Optional optional2 = (Optional) this.f218512s.get();
        if (!optional2.isEmpty()) {
            C79697f fVar = new C79697f();
            fVar.f218557a = ((C79856d) this.f218511r.get()).mo74269a();
            C79485j jVar = (C79485j) optional2.get();
            if (jVar != null) {
                fVar.f218558b = jVar;
                Duration duration = (Duration) ((Optional) this.f218513t.get()).map(new C79666av(kwVar)).orElse(Duration.ZERO);
                if (duration != null) {
                    fVar.f218560d = duration;
                    Objects.requireNonNull(fVar);
                    optional.ifPresent(new C79659ao(fVar));
                    return Optional.m71637of(fVar);
                }
                throw new NullPointerException("Null endOfSpeechElapsedRealtime");
            }
            throw new NullPointerException("Null triggeringContext");
        }
        this.f218498e.mo74788d(mo74184m(), 3);
        return Optional.empty();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo72712a(C77548aa aaVar) {
    }

    /* renamed from: b */
    public final void mo74163b(C67026ih ihVar) {
        if (!this.f218500g.get()) {
            C59081b.m91349a(TimeUnit.MILLISECONDS, "time unit");
            float f = ihVar.f182191b;
            float f2 = ihVar.f182192c;
            if ((ihVar.f182190a & 2) != 0) {
                this.f218502i.mo74783b((double) f2);
            }
        }
    }

    /* renamed from: c */
    public final void mo74164c(C67038it itVar) {
        C67037is a = C67037is.m97413a(itVar.f182223b);
        if (a == null) {
            a = C67037is.START_OF_SPEECH;
        }
        if (a.equals(C67037is.START_OF_SPEECH)) {
            this.f218502i.mo74784c();
        }
    }

    /* renamed from: d */
    public final void mo74165d(C67087ko koVar) {
        if (!this.f218500g.get()) {
            this.f218501h.incrementAndGet();
            C67050je jeVar = koVar.f182369b;
            if (jeVar == null) {
                jeVar = C67050je.f182262f;
            }
            C67048jc jcVar = jeVar.f182265b;
            if (jcVar == null) {
                jcVar = C67048jc.f182253h;
            }
            String str = jcVar.f182257c;
            boolean z = (koVar.f182368a & 64) != 0;
            Objects.requireNonNull(koVar);
            m127729p(C59347c.m92237b(z, new C79661aq(koVar)), C67095kw.f182399i).map(new C79653ai(str)).ifPresent(new C79654aj(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e4, code lost:
        if (r3.f182343b.isEmpty() == false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0103, code lost:
        if (r3.f182230b.isEmpty() == false) goto L_0x0105;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c3  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74166e(com.google.speech.p5218j.C67087ko r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            j$.util.Optional r2 = r1.f218506m
            com.google.android.apps.gsa.nga.engine.warmactions.j.ap r3 = new com.google.android.apps.gsa.nga.engine.warmactions.j.ap
            r3.<init>()
            r2.ifPresent(r3)
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.f218500g
            boolean r2 = r2.get()
            if (r2 != 0) goto L_0x0320
            com.google.speech.j.kk r2 = r0.f182370c
            if (r2 != 0) goto L_0x001c
            com.google.speech.j.kk r2 = com.google.speech.p5218j.C67083kk.f182351g
        L_0x001c:
            com.google.speech.j.io r3 = com.google.speech.p5218j.C67033io.GH_INTERVAL_GUEST
            int r3 = r2.f182354b
            int r4 = com.google.speech.p5218j.C67082kj.m97421a(r3)
            int r5 = r4 + -1
            r6 = 0
            if (r4 == 0) goto L_0x031f
            r4 = 3
            r7 = 4
            r8 = 0
            r9 = 2
            r10 = 1
            if (r5 == 0) goto L_0x0056
            if (r5 == r10) goto L_0x0046
            if (r5 == r9) goto L_0x0036
            goto L_0x00b3
        L_0x0036:
            if (r3 != r7) goto L_0x003d
            java.lang.Object r3 = r2.f182355c
            com.google.speech.j.kg r3 = (com.google.speech.p5218j.C67079kg) r3
            goto L_0x003f
        L_0x003d:
            com.google.speech.j.kg r3 = com.google.speech.p5218j.C67079kg.f182340h
        L_0x003f:
            com.google.speech.j.ks r3 = r3.f182347f
            if (r3 != 0) goto L_0x0065
            com.google.speech.j.ks r3 = com.google.speech.p5218j.C67091ks.f182386h
            goto L_0x0065
        L_0x0046:
            if (r3 != r9) goto L_0x004d
            java.lang.Object r3 = r2.f182355c
            com.google.speech.j.ju r3 = (com.google.speech.p5218j.C67066ju) r3
            goto L_0x004f
        L_0x004d:
            com.google.speech.j.ju r3 = com.google.speech.p5218j.C67066ju.f182302g
        L_0x004f:
            com.google.speech.j.ks r3 = r3.f182307d
            if (r3 != 0) goto L_0x0065
            com.google.speech.j.ks r3 = com.google.speech.p5218j.C67091ks.f182386h
            goto L_0x0065
        L_0x0056:
            if (r3 != r10) goto L_0x005d
            java.lang.Object r3 = r2.f182355c
            com.google.speech.j.ix r3 = (com.google.speech.p5218j.C67042ix) r3
            goto L_0x005f
        L_0x005d:
            com.google.speech.j.ix r3 = com.google.speech.p5218j.C67042ix.f182227l
        L_0x005f:
            com.google.speech.j.ks r3 = r3.f182235g
            if (r3 != 0) goto L_0x0065
            com.google.speech.j.ks r3 = com.google.speech.p5218j.C67091ks.f182386h
        L_0x0065:
            com.google.protobuf.cq r5 = r3.f182394g
            int r5 = r5.size()
            if (r5 == 0) goto L_0x00b3
            com.google.protobuf.cq r5 = r3.f182394g
            int r5 = r5.size()
            if (r5 > r10) goto L_0x00b3
            com.google.protobuf.cq r5 = r3.f182394g
            java.lang.Object r5 = r5.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            com.google.protobuf.dn r3 = r3.f182393f
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
            java.lang.Object r3 = r3.get(r5)
            com.google.speech.j.jy r3 = (com.google.speech.p5218j.C67070jy) r3
            if (r3 == 0) goto L_0x00b3
            com.google.protobuf.cq r5 = r3.f182317a
            int r5 = r5.size()
            if (r5 != r10) goto L_0x00b3
            com.google.protobuf.cq r3 = r3.f182317a
            java.lang.Object r3 = r3.get(r8)
            com.google.speech.j.ip r3 = (com.google.speech.p5218j.C67034ip) r3
            int r3 = r3.f182211b
            com.google.speech.j.io r3 = com.google.speech.p5218j.C67033io.m97411a(r3)
            if (r3 != 0) goto L_0x00a5
            com.google.speech.j.io r3 = com.google.speech.p5218j.C67033io.GH_INTERVAL_GUEST
        L_0x00a5:
            int r5 = r3.ordinal()
            if (r5 == 0) goto L_0x00b3
            if (r5 == r10) goto L_0x00b3
            if (r5 == r9) goto L_0x00b3
            if (r5 == r4) goto L_0x00b3
            int r3 = r3.f182207e
        L_0x00b3:
            com.google.android.apps.gsa.shared.util.v.g r3 = r1.f218499f
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251459jH
            boolean r3 = r3.mo85405j(r5)
            if (r3 == 0) goto L_0x00c3
            int r3 = r2.f182354b
            if (r3 != r10) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            return
        L_0x00c3:
            int r3 = r2.f182354b
            int r5 = com.google.speech.p5218j.C67082kj.m97421a(r3)
            int r11 = r5 + -1
            if (r5 == 0) goto L_0x031e
            if (r11 == 0) goto L_0x00f4
            if (r11 == r10) goto L_0x00e7
            if (r11 == r9) goto L_0x00d5
            goto L_0x0314
        L_0x00d5:
            if (r3 != r7) goto L_0x00dc
            java.lang.Object r3 = r2.f182355c
            com.google.speech.j.kg r3 = (com.google.speech.p5218j.C67079kg) r3
            goto L_0x00de
        L_0x00dc:
            com.google.speech.j.kg r3 = com.google.speech.p5218j.C67079kg.f182340h
        L_0x00de:
            com.google.protobuf.cq r3 = r3.f182343b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0314
            goto L_0x0105
        L_0x00e7:
            if (r3 != r9) goto L_0x00ee
            java.lang.Object r0 = r2.f182355c
            com.google.speech.j.ju r0 = (com.google.speech.p5218j.C67066ju) r0
            goto L_0x00f0
        L_0x00ee:
            com.google.speech.j.ju r0 = com.google.speech.p5218j.C67066ju.f182302g
        L_0x00f0:
            com.google.protobuf.cq r0 = r0.f182306c
            goto L_0x0314
        L_0x00f4:
            if (r3 != r10) goto L_0x00fb
            java.lang.Object r3 = r2.f182355c
            com.google.speech.j.ix r3 = (com.google.speech.p5218j.C67042ix) r3
            goto L_0x00fd
        L_0x00fb:
            com.google.speech.j.ix r3 = com.google.speech.p5218j.C67042ix.f182227l
        L_0x00fd:
            com.google.protobuf.cq r3 = r3.f182230b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0314
        L_0x0105:
            java.util.concurrent.atomic.AtomicLong r3 = r1.f218501h
            r3.incrementAndGet()
            int r3 = r0.f182368a
            r3 = r3 & 64
            if (r3 == 0) goto L_0x0112
            r3 = 1
            goto L_0x0113
        L_0x0112:
            r3 = 0
        L_0x0113:
            p3186j$.util.Objects.requireNonNull(r18)
            com.google.android.apps.gsa.nga.engine.warmactions.j.aq r5 = new com.google.android.apps.gsa.nga.engine.warmactions.j.aq
            r5.<init>(r0)
            j$.util.Optional r3 = com.google.common.p4543n.p4544a.C59347c.m92237b(r3, r5)
            int r0 = r2.f182356d
            int r0 = com.google.speech.p5218j.C67161nh.m97429a(r0)
            if (r0 != 0) goto L_0x0129
            goto L_0x02eb
        L_0x0129:
            if (r0 != r7) goto L_0x02eb
            int r0 = r2.f182354b
            int r5 = com.google.speech.p5218j.C67082kj.m97421a(r0)
            if (r5 == 0) goto L_0x02ea
            com.google.protobuf.cq r5 = r2.f182357e
            int r11 = com.google.speech.p5218j.C67082kj.m97421a(r0)
            int r12 = r11 + -1
            if (r11 == 0) goto L_0x02e9
            if (r12 == 0) goto L_0x0155
            if (r12 == r9) goto L_0x0145
            com.google.speech.j.kw r0 = com.google.speech.p5218j.C67095kw.f182399i
        L_0x0143:
            r2 = r0
            goto L_0x0165
        L_0x0145:
            if (r0 != r7) goto L_0x014c
            java.lang.Object r0 = r2.f182355c
            com.google.speech.j.kg r0 = (com.google.speech.p5218j.C67079kg) r0
            goto L_0x014e
        L_0x014c:
            com.google.speech.j.kg r0 = com.google.speech.p5218j.C67079kg.f182340h
        L_0x014e:
            com.google.speech.j.kw r0 = r0.f182346e
            if (r0 != 0) goto L_0x0143
            com.google.speech.j.kw r0 = com.google.speech.p5218j.C67095kw.f182399i
            goto L_0x0143
        L_0x0155:
            if (r0 != r10) goto L_0x015c
            java.lang.Object r0 = r2.f182355c
            com.google.speech.j.ix r0 = (com.google.speech.p5218j.C67042ix) r0
            goto L_0x015e
        L_0x015c:
            com.google.speech.j.ix r0 = com.google.speech.p5218j.C67042ix.f182227l
        L_0x015e:
            com.google.speech.j.kw r0 = r0.f182237i
            if (r0 != 0) goto L_0x0143
            com.google.speech.j.kw r0 = com.google.speech.p5218j.C67095kw.f182399i
            goto L_0x0143
        L_0x0165:
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r5)
            com.google.android.apps.gsa.nga.engine.warmactions.j.ak r5 = com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79655ak.f218476a
            j$.util.stream.Stream r0 = r0.map(r5)
            j$.util.Optional r0 = r0.findFirst()
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x0188
            com.google.android.apps.gsa.nga.shared.aq.b.d r0 = r1.f218498e
            com.google.android.apps.gsa.nga.engine.warmactions.g.b r2 = r17.mo74184m()
            r0.mo74788d(r2, r9)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x02e0
        L_0x0188:
            java.lang.Object r0 = r0.get()
            r5 = r0
            com.google.speech.j.ck r5 = (com.google.speech.p5218j.C66865ck) r5
            java.lang.String r0 = r5.f181795g
            java.lang.String r6 = "/"
            com.google.common.base.cf r6 = com.google.common.base.C58869cf.m90938d(r6)
            java.util.List r6 = r6.mo56155i(r0)
            int r7 = r6.size()
            if (r7 < r9) goto L_0x0298
            int r7 = r6.size()
            if (r7 <= r4) goto L_0x01a9
            goto L_0x0298
        L_0x01a9:
            java.lang.Object r0 = r6.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class<com.google.android.apps.gsa.nga.engine.warmactions.g.b> r7 = com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b.class
            com.google.common.base.ax r7 = com.google.common.base.C58811ab.m90798a(r7, r0)
            boolean r11 = r7.mo56113h()
            if (r11 != 0) goto L_0x01d2
            com.google.common.f.a.d r11 = f218494a
            com.google.common.f.x r11 = r11.mo56226d()
            java.lang.String r12 = "#MWW The category contains an unsupported ContextType: %s"
            r13 = 5739(0x166b, float:8.042E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r11).mo56372aa(r13)).mo56389s(r12, r0)
            com.google.android.apps.gsa.nga.shared.aq.b.d r0 = r1.f218498e
            com.google.android.apps.gsa.nga.engine.warmactions.g.b r11 = r17.mo74184m()
            r12 = 6
            r0.mo74788d(r11, r12)
        L_0x01d2:
            java.lang.Object r0 = r7.mo56111f()
            com.google.android.apps.gsa.nga.engine.warmactions.g.b r0 = (com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b) r0
            j$.util.Optional r0 = p3186j$.util.Optional.ofNullable(r0)
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L_0x01e8
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x02c2
        L_0x01e8:
            com.google.android.apps.gsa.nga.engine.warmactions.g.f r7 = com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79574f.f218345d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.gsa.nga.engine.warmactions.g.e r7 = (com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79573e) r7
            java.lang.Object r0 = r0.get()
            com.google.android.apps.gsa.nga.engine.warmactions.g.b r0 = (com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b) r0
            r7.copyOnWrite()
            com.google.protobuf.bv r11 = r7.instance
            com.google.android.apps.gsa.nga.engine.warmactions.g.f r11 = (com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79574f) r11
            int r0 = r0.f218339o
            r11.f218349c = r0
            int r0 = r11.f218347a
            r0 = r0 | r9
            r11.f218347a = r0
            int r0 = r6.size()
            if (r0 != r4) goto L_0x0282
            java.lang.Object r0 = r6.get(r10)     // Catch:{ NumberFormatException -> 0x021f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x021f }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x021f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x021f }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ NumberFormatException -> 0x021f }
            goto L_0x025e
        L_0x021f:
            r0 = move-exception
            com.google.common.f.a.d r4 = f218494a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4
            com.google.common.f.x r0 = r4.mo56382g(r0)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            r4 = 5741(0x166d, float:8.045E-42)
            com.google.common.f.x r0 = r0.mo56372aa(r4)
            r11 = r0
            com.google.common.f.a.a r11 = (com.google.common.p4526f.p4527a.C58970a) r11
            java.lang.String r12 = "#MWW Couldn't parse connection id for context %s: %s/%s/%s"
            com.google.android.apps.gsa.nga.engine.warmactions.g.b r0 = r17.mo74184m()
            java.lang.String r13 = r0.name()
            java.lang.Object r14 = r6.get(r8)
            java.lang.Object r15 = r6.get(r10)
            java.lang.Object r16 = r6.get(r9)
            r11.mo56360M(r12, r13, r14, r15, r16)
            com.google.android.apps.gsa.nga.shared.aq.b.d r0 = r1.f218498e
            com.google.android.apps.gsa.nga.engine.warmactions.g.b r4 = r17.mo74184m()
            r8 = 7
            r0.mo74788d(r4, r8)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x025e:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0269
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x02c2
        L_0x0269:
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r4 = r7.instance
            com.google.android.apps.gsa.nga.engine.warmactions.g.f r4 = (com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79574f) r4
            int r8 = r4.f218347a
            r8 = r8 | r10
            r4.f218347a = r8
            long r8 = (long) r0
            r4.f218348b = r8
        L_0x0282:
            java.lang.Object r0 = com.google.common.p4522b.C58557jl.m90131l(r6)
            java.lang.String r0 = (java.lang.String) r0
            com.google.protobuf.bv r4 = r7.build()
            com.google.android.apps.gsa.nga.engine.warmactions.g.f r4 = (com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79574f) r4
            com.google.android.apps.gsa.nga.engine.warmactions.j.e r6 = new com.google.android.apps.gsa.nga.engine.warmactions.j.e
            r6.<init>(r4, r0)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r6)
            goto L_0x02c2
        L_0x0298:
            com.google.common.f.a.d r4 = f218494a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4
            r7 = 5740(0x166c, float:8.043E-42)
            com.google.common.f.x r4 = r4.mo56372aa(r7)
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4
            int r6 = r6.size()
            int r6 = r6 + -1
            java.lang.String r7 = "#MWW Invalid number of '/' in category: %d (%s)"
            r4.mo56395y(r7, r6, r0)
            com.google.android.apps.gsa.nga.shared.aq.b.d r0 = r1.f218498e
            com.google.android.apps.gsa.nga.engine.warmactions.g.b r4 = r17.mo74184m()
            r6 = 8
            r0.mo74788d(r4, r6)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x02c2:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x02cd
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x02e0
        L_0x02cd:
            java.lang.Object r0 = r0.get()
            com.google.android.apps.gsa.nga.engine.warmactions.j.az r0 = (com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79670az) r0
            j$.util.Optional r2 = r1.m127729p(r3, r2)
            com.google.android.apps.gsa.nga.engine.warmactions.j.al r3 = new com.google.android.apps.gsa.nga.engine.warmactions.j.al
            r3.<init>(r5, r0)
            j$.util.Optional r0 = r2.map(r3)
        L_0x02e0:
            com.google.android.apps.gsa.nga.engine.warmactions.j.af r2 = new com.google.android.apps.gsa.nga.engine.warmactions.j.af
            r2.<init>(r1)
            r0.ifPresent(r2)
            goto L_0x030a
        L_0x02e9:
            throw r6
        L_0x02ea:
            throw r6
        L_0x02eb:
            int r0 = r2.f182354b
            int r0 = com.google.speech.p5218j.C67082kj.m97421a(r0)
            if (r0 == 0) goto L_0x0313
            com.google.android.apps.gsa.shared.util.v.g r0 = r1.f218499f
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251782pm
            boolean r0 = r0.mo85405j(r2)
            if (r0 != 0) goto L_0x0306
            com.google.android.apps.gsa.nga.shared.aq.b.d r0 = r1.f218498e
            com.google.android.apps.gsa.nga.engine.warmactions.g.b r2 = r17.mo74184m()
            r0.mo74788d(r2, r10)
        L_0x0306:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x030a:
            com.google.android.apps.gsa.nga.engine.warmactions.j.ar r2 = new com.google.android.apps.gsa.nga.engine.warmactions.j.ar
            r2.<init>(r1)
            r0.ifPresent(r2)
            return
        L_0x0313:
            throw r6
        L_0x0314:
            int r0 = r2.f182354b
            int r0 = com.google.speech.p5218j.C67082kj.m97421a(r0)
            if (r0 == 0) goto L_0x031d
            return
        L_0x031d:
            throw r6
        L_0x031e:
            throw r6
        L_0x031f:
            throw r6
        L_0x0320:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79672ba.mo74166e(com.google.speech.j.ko):void");
    }

    /* renamed from: f */
    public final synchronized void mo74167f(C79485j jVar) {
        this.f218500g.getAndSet(false);
        this.f218501h.set(0);
        this.f218502i.mo74784c();
        this.f218511r.set(new C79856d(this.f218504k.mo74270a()));
        this.f218512s.set(Optional.m71637of(jVar));
    }

    /* renamed from: g */
    public final /* synthetic */ void mo72713g(C80561f fVar, C37514du duVar) {
    }

    /* renamed from: h */
    public final void mo72715h(Optional optional) {
        this.f218513t.set(Optional.m71637of((Duration) optional.orElse(Duration.ofNanos(this.f218510q.mo26872d()))));
    }

    /* renamed from: i */
    public final /* synthetic */ void mo72716i(C80561f fVar, C37561eb ebVar) {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo72717j(C80561f fVar, int i) {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo72718k(C77548aa aaVar) {
    }

    /* renamed from: l */
    public final /* synthetic */ void mo72719l(C77548aa aaVar) {
    }

    /* renamed from: m */
    public final C79570b mo74184m() {
        return (C79570b) ((Optional) this.f218512s.get()).flatMap(C79663as.f218484a).orElse(C79570b.CONTEXT_TYPE_UNSPECIFIED);
    }

    /* renamed from: n */
    public final C60870cx mo74185n(C79690bs bsVar) {
        return (C60870cx) bsVar.mo74197e().map(new C79664at(this)).map(new C79657am(this)).orElseGet(C79658an.f218480a);
    }

    /* renamed from: o */
    public final void mo74186o(C79690bs bsVar) {
        C60870cx cxVar;
        if (this.f218500g.getAndSet(true)) {
            ((C58970a) ((C58970a) f218494a.mo56224b()).mo56372aa(5737)).mo56386p("#MWW A query has already been executed, ignoring.");
            cxVar = C60856cj.m92900i(false);
        } else {
            this.f218508o.ifPresent(new C79667aw(bsVar));
            C79553k kVar = this.f218507n;
            C79544b bVar = new C79544b();
            bVar.mo74124c(C79562t.FINAL_STAGE_VERIFIED);
            bVar.f218259b = Optional.m71637of(bsVar.mo74193a().c());
            C79552j a = bVar.mo74122a();
            C79561s sVar = (C79561s) kVar;
            sVar.mo74136b(a);
            sVar.mo74137c(a);
            C81013d dVar = this.f218498e;
            C79570b a2 = C79570b.m127648a(bsVar.mo74195c().f218349c);
            if (a2 == null) {
                a2 = C79570b.CONTEXT_TYPE_UNSPECIFIED;
            }
            String f = bsVar.mo74198f();
            C83305i iVar = ((C81014e) dVar).f222055a;
            int i = a2.f218339o;
            if (f != null) {
                iVar.mo75579d(new C82473gm("NGA_WARM_ACTIONS_TRIGGER_COUNT", i, f));
                C79687bp bpVar = this.f218505l;
                C58495hd hdVar = bpVar.f218543c;
                C79570b a3 = C79570b.m127648a(bsVar.mo74195c().f218349c);
                if (a3 == null) {
                    a3 = C79570b.CONTEXT_TYPE_UNSPECIFIED;
                }
                C79688bq bqVar = (C79688bq) hdVar.getOrDefault(a3, bpVar.f218544d);
                bqVar.getClass();
                if (bpVar.f218542b.mo85405j(C90126fx.f251455jD)) {
                    C79456n nVar = (C79456n) bpVar.f218547g.mo27525b();
                    C79570b a4 = C79570b.m127648a(bsVar.mo74195c().f218349c);
                    if (a4 == null) {
                        a4 = C79570b.CONTEXT_TYPE_UNSPECIFIED;
                    }
                    nVar.mo74031h(a4, bqVar.mo74176b(bsVar));
                }
                cxVar = C60922j.m93044g(C60922j.m93044g(bqVar.mo74177h(bsVar), new C79686bo(bpVar, bsVar), bpVar.f218546f), new C79651ag(this, bsVar), this.f218509p);
            } else {
                throw new NullPointerException("Null command");
            }
        }
        C60856cj.m92911t(cxVar, new C79668ax(this, bsVar), this.f218509p);
    }
}
