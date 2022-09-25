package com.google.android.libraries.lens.view.p2087ay;

import android.util.Size;
import com.google.android.libraries.lens.view.gleam.C26504ci;
import com.google.android.libraries.lens.view.gleam.C26508cm;
import com.google.android.libraries.lens.view.p2056af.C25050av;
import com.google.android.libraries.lens.view.p2082av.C25579c;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26752d;
import com.google.android.libraries.lens.view.p2173u.C28097c;
import com.google.android.libraries.lens.view.vision.C28168j;
import com.google.android.libraries.lens.view.vision.C28171m;
import com.google.android.libraries.lens.view.vision.C28172n;
import com.google.android.libraries.lens.view.vision.C28178t;
import com.google.android.libraries.lens.view.vision.C28179u;
import com.google.android.libraries.lens.view.vision.C28180v;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4707j.C62445bv;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56219a;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56327y;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56328z;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.view.ay.at */
/* compiled from: PG */
public final class C25637at implements C25626ai, C28171m {

    /* renamed from: g */
    public static final /* synthetic */ int f69737g = 0;

    /* renamed from: h */
    private static final C58974d f69738h = C58974d.m91135i("TrackingController");

    /* renamed from: a */
    public final C21370a f69739a;

    /* renamed from: b */
    public final Executor f69740b;

    /* renamed from: c */
    public final C25050av f69741c;

    /* renamed from: d */
    public volatile C28172n f69742d;

    /* renamed from: e */
    public C25618aa f69743e;

    /* renamed from: f */
    public volatile C25663x f69744f;

    /* renamed from: i */
    private final C26752d f69745i;

    /* renamed from: j */
    private final C26508cm f69746j;

    /* renamed from: k */
    private final C25579c f69747k;

    /* renamed from: l */
    private final boolean f69748l;

    /* renamed from: m */
    private final boolean f69749m;

    /* renamed from: n */
    private volatile C28168j f69750n;

    public C25637at(C26752d dVar, C21370a aVar, Executor executor, C26508cm cmVar, C25050av avVar, C25579c cVar, boolean z, boolean z2) {
        this.f69745i = dVar;
        this.f69739a = aVar;
        this.f69740b = executor;
        this.f69746j = cmVar;
        this.f69741c = avVar;
        this.f69747k = cVar;
        this.f69748l = z;
        this.f69749m = z2;
    }

    /* renamed from: j */
    private static C28179u m47291j(C28172n nVar, C28179u uVar, long j) {
        C28179u n = nVar.mo33598n(uVar, j);
        if (n == null) {
            Objects.requireNonNull(uVar);
        }
        return n;
    }

    /* renamed from: k */
    private final void m47292k() {
        C28172n nVar = this.f69742d;
        C25663x xVar = this.f69744f;
        if (!(nVar == null || xVar == null)) {
            this.f69750n = new C25627aj(this, xVar);
            nVar.mo33585f(this.f69750n);
            Executor executor = this.f69740b;
            Objects.requireNonNull(xVar);
            executor.execute(new C25629al(xVar));
        }
        this.f69740b.execute(new C25630am(this));
    }

    /* renamed from: a */
    public final C58833ax mo30741a(long j, Map map, C58485gu guVar) {
        C28172n nVar = this.f69742d;
        if (nVar == null) {
            return C58836b.f156633a;
        }
        Size size = this.f69745i.f72881b.f72878a;
        C56328z zVar = (C56328z) C56220aa.f149748b.createBuilder();
        int size2 = guVar.size();
        for (int i = 0; i < size2; i++) {
            C26504ci ciVar = (C26504ci) guVar.get(i);
            C28179u uVar = (C28179u) map.get(Integer.valueOf(ciVar.f72214h.mo33664h()));
            if (uVar != null || (uVar = m47291j(nVar, ciVar.f72215i, j)) != null) {
                C56219a aVar = (C56219a) C56327y.f150136i.createBuilder(ciVar.f72216j);
                int h = ciVar.f72214h.mo33664h();
                aVar.copyOnWrite();
                C56327y yVar = (C56327y) aVar.instance;
                yVar.f150138a |= 1;
                yVar.f150141d = (long) h;
                C62445bv b = C28180v.m52674b(uVar, size);
                aVar.copyOnWrite();
                C56327y yVar2 = (C56327y) aVar.instance;
                b.getClass();
                yVar2.f150140c = b;
                yVar2.f150139b = 7;
                zVar.mo54357b((C56327y) aVar.build());
            }
        }
        return C58833ax.m90834k((C56220aa) zVar.build());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4, types: [int] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58485gu mo30743c(com.google.common.p4522b.C58485gu r17, com.google.common.p4522b.C58485gu r18, long r19, long r21, long r23, boolean r25, java.lang.Runnable r26) {
        /*
            r16 = this;
            r13 = r16
            r0 = r17
            r5 = r19
            com.google.android.libraries.lens.view.vision.n r1 = r13.f69742d
            if (r1 != 0) goto L_0x000f
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            return r0
        L_0x000f:
            boolean r2 = r13.f69748l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001e
            r2 = r0
            com.google.common.b.pq r2 = (com.google.common.p4522b.C58724pq) r2
            int r2 = r2.f156474d
            if (r2 <= r4) goto L_0x001e
            r12 = 1
            goto L_0x001f
        L_0x001e:
            r12 = 0
        L_0x001f:
            if (r12 == 0) goto L_0x008c
            com.google.common.f.a.d r2 = f69738h
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            r7 = 50248(0xc448, float:7.0412E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r7)
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            java.lang.String r7 = "***** startTrackingGrouped[%d]"
            r2.mo56388r(r7, r5)
            com.google.common.b.gp r2 = new com.google.common.b.gp
            r7 = 4
            r2.<init>(r7)
            com.google.common.b.gp r8 = new com.google.common.b.gp
            r8.<init>(r7)
            r7 = r0
            com.google.common.b.pq r7 = (com.google.common.p4522b.C58724pq) r7
            int r7 = r7.f156474d
        L_0x0047:
            if (r3 >= r7) goto L_0x0080
            java.lang.Object r9 = r0.get(r3)
            com.google.bp.f.b.a.y r9 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56327y) r9
            com.google.android.libraries.lens.view.gleam.cm r10 = r13.f69746j
            com.google.android.libraries.lens.view.gleam.ci r9 = r10.mo31779a(r9, r5)
            com.google.android.libraries.lens.view.vision.u r10 = r9.f72215i
            r8.mo55395g(r10)
            r9.f72221o = r4
            r9.f72213g = r4
            r2.mo55395g(r9)
            com.google.android.libraries.lens.view.vision.u r10 = r9.f72215i
            boolean r10 = r10.mo33682x()
            if (r10 == 0) goto L_0x007d
            com.google.common.f.a.d r10 = f69738h
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.android.libraries.lens.view.vision.u r9 = r9.f72214h
            int r9 = r9.mo33664h()
            r11 = 50249(0xc449, float:7.0414E-41)
            java.lang.String r14 = "***** Started GroupTracking for object with id %d"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r11)).mo56387q(r14, r9)
        L_0x007d:
            int r3 = r3 + 1
            goto L_0x0047
        L_0x0080:
            com.google.common.b.gu r0 = r8.mo55394f()
            r1.mo33602r(r0)
            com.google.common.b.gu r0 = r2.mo55394f()
            goto L_0x00b7
        L_0x008c:
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0093
            r3 = 1
        L_0x0093:
            com.google.common.base.C58838bb.m90868c(r3)
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r17)
            com.google.android.libraries.lens.view.ay.an r2 = new com.google.android.libraries.lens.view.ay.an
            r2.<init>(r13, r1, r5)
            j$.util.stream.Stream r0 = r0.map(r2)
            com.google.android.libraries.lens.view.ay.ao r1 = com.google.android.libraries.lens.view.p2087ay.C25632ao.f69731a
            j$.util.stream.Stream r0 = r0.filter(r1)
            com.google.android.libraries.lens.view.ay.ap r1 = com.google.android.libraries.lens.view.p2087ay.C25633ap.f69732a
            j$.util.stream.Stream r0 = r0.map(r1)
            j$.util.stream.Collector r1 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r0 = r0.collect(r1)
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0
        L_0x00b7:
            r14 = r0
            java.util.concurrent.Executor r15 = r13.f69740b
            com.google.android.libraries.lens.view.ay.ak r11 = new com.google.android.libraries.lens.view.ay.ak
            r0 = r11
            r1 = r16
            r2 = r26
            r3 = r14
            r4 = r18
            r5 = r19
            r7 = r21
            r9 = r23
            r13 = r11
            r11 = r25
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r12)
            r15.execute(r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2087ay.C25637at.mo30743c(com.google.common.b.gu, com.google.common.b.gu, long, long, long, boolean, java.lang.Runnable):com.google.common.b.gu");
    }

    /* renamed from: d */
    public final void mo30744d(long j, C58485gu guVar) {
        C28179u uVar;
        C28172n nVar = this.f69742d;
        if (nVar == null) {
            ((C58970a) ((C58970a) f69738h.mo56226d()).mo56372aa(50253)).mo56386p("freezeGleamsOnImage called while FrameAnalyzer unavailable.");
            return;
        }
        C25618aa aaVar = this.f69743e;
        if (aaVar != null && aaVar.mo30730c()) {
            ((C58970a) ((C58970a) f69738h.mo56224b()).mo56372aa(50250)).mo56389s("*****finishRemoveOrAddTrackedObjects FORCE-FINISHED (%s)", String.format(Locale.US, "detection: %d; baseline: %d; pending: (%d, %d)", new Object[]{Long.valueOf(aaVar.f69686d), Long.valueOf(aaVar.f69687e), Integer.valueOf(aaVar.f69685c.size()), Integer.valueOf(aaVar.f69684b.size())}));
            aaVar.mo30729b();
        }
        C58495hd hdVar = null;
        C28097c b = this.f69749m ? this.f69747k.mo30662b(j) : null;
        if (b != null) {
            hdVar = b.f76493k;
        }
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C26504ci ciVar = (C26504ci) guVar.get(i);
            if (ciVar.f72213g) {
                int h = ciVar.f72215i.mo33664h();
                mo30745e(ciVar);
                ciVar.f72213g = false;
                if (hdVar == null || (uVar = (C28179u) hdVar.get(Integer.valueOf(h))) == null) {
                    C28179u j2 = m47291j(nVar, ciVar.f72215i, j);
                    if (j2 != null) {
                        ciVar.mo31762f(j2);
                    } else {
                        C28178t k = ciVar.f72215i.mo33668k();
                        k.mo33650n(j);
                        ciVar.mo31762f(k.mo33696r());
                    }
                } else {
                    ciVar.mo31762f(uVar);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo30745e(C26504ci ciVar) {
        C28172n nVar = this.f69742d;
        if (nVar != null && ciVar.f72213g) {
            nVar.mo33605u(ciVar.f72215i.mo33664h());
        }
    }

    /* renamed from: f */
    public final boolean mo30746f() {
        return (this.f69742d == null || this.f69744f == null || this.f69750n == null) ? false : true;
    }

    /* renamed from: g */
    public final boolean mo30747g(C58485gu guVar, long j) {
        C25618aa aaVar = this.f69743e;
        if (aaVar == null) {
            ((C58970a) ((C58970a) f69738h.mo56226d()).mo56372aa(50259)).mo56386p("resumeRemoveOrAddTrackedObjects called while tracker unavailable");
            return false;
        }
        if (aaVar.mo30730c()) {
            aaVar.f69684b.retainAll(guVar);
            if (!aaVar.f69684b.isEmpty()) {
                if (j > aaVar.f69687e) {
                    Iterator it = aaVar.f69684b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            ((C58970a) ((C58970a) C25618aa.f69683a.mo56224b()).mo56372aa(50235)).mo56359L("*****areAllObjectsCurrent YES: lastUpdate: %d > baselineTS: %d (detection: %d)", Long.valueOf(j), Long.valueOf(aaVar.f69687e), Long.valueOf(aaVar.f69686d));
                            break;
                        }
                        C26504ci ciVar = (C26504ci) it.next();
                        if (ciVar.f72215i.mo33666i() < j) {
                            if (ciVar.f72213g) {
                                ciVar.f72215i.mo33664h();
                            }
                            Long valueOf = Long.valueOf(j);
                            if (j - aaVar.f69687e > 1000000) {
                                ((C58970a) ((C58970a) C25618aa.f69683a.mo56226d()).mo56372aa(50234)).mo56359L("*****areAllObjectsCurrent: ESCAPED; File a bug! last: %d > baseline: %d (org: %d)", valueOf, Long.valueOf(aaVar.f69687e), Long.valueOf(aaVar.f69686d));
                            }
                        }
                    }
                } else {
                    ((C58970a) ((C58970a) C25618aa.f69683a.mo56224b()).mo56372aa(50237)).mo56359L("*****areAllObjectsCurrent: Not Yet; lastUpdate: %d <= baselineTS: %d (detection: %d)", Long.valueOf(j), Long.valueOf(aaVar.f69687e), Long.valueOf(aaVar.f69686d));
                }
            }
            aaVar.mo30729b();
        }
        return aaVar.mo30730c();
    }

    /* renamed from: h */
    public final void mo30748h(C25663x xVar) {
        this.f69744f = xVar;
        m47292k();
    }

    /* renamed from: i */
    public final C58833ax mo30755i(C28172n nVar, C56327y yVar, long j, boolean z, boolean z2) {
        C26504ci a = this.f69746j.mo31779a(yVar, j);
        if (z2) {
            nVar.mo33601q(a.f72215i);
        } else {
            C28179u o = nVar.mo33599o(a.f72215i);
            if (o == null) {
                return C58836b.f156633a;
            }
            a.mo31762f(o);
        }
        a.f72213g = true;
        if (z) {
            a.f72221o = true;
        }
        return C58833ax.m90834k(a);
    }

    /* renamed from: o */
    public final void mo30756o(C28172n nVar) {
        this.f69742d = nVar;
        m47292k();
    }

    /* renamed from: p */
    public final void mo30757p() {
        C28172n nVar = this.f69742d;
        this.f69742d = null;
        C28168j jVar = this.f69750n;
        this.f69750n = null;
        if (!(nVar == null || jVar == null)) {
            nVar.mo33590k(jVar);
        }
        this.f69740b.execute(new C25634aq(this));
    }

    /* renamed from: b */
    public final C58833ax mo30742b(C56327y yVar) {
        long j;
        C28172n nVar = this.f69742d;
        if (nVar == null) {
            return C58836b.f156633a;
        }
        C28172n nVar2 = this.f69742d;
        if (nVar2 == null) {
            j = 0;
        } else {
            C58833ax p = nVar2.mo33600p();
            C58838bb.m90884s(p.mo56113h(), "Invalid timestamp or cache expired.");
            j = ((Long) p.mo56107c()).longValue();
        }
        return mo30755i(nVar, yVar, j, false, true);
    }
}
