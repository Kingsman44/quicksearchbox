package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.education.pie.C75862d;
import com.google.android.apps.gsa.nga.engine.education.pie.C75866e;
import com.google.android.apps.gsa.nga.engine.education.pie.C75906g;
import com.google.android.apps.gsa.nga.engine.education.pie.C75913n;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75786o;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75788q;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75794w;
import com.google.android.apps.gsa.nga.engine.education.pie.p6022d.C75864b;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75891l;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80201av;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80204ay;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80205az;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80256k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80257l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81377k;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81380n;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.p1879c.C22867c;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.p4553a.C59478bb;
import com.google.common.p4552o.p4553a.C59479bc;
import com.google.common.p4552o.p4553a.C59482bf;
import com.google.common.p4552o.p4553a.C59491bo;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.ai */
/* compiled from: PG */
public final class C75808ai implements C75866e, C75864b, C75786o {

    /* renamed from: a */
    public static final C58974d f210379a = C58974d.m91136j();

    /* renamed from: b */
    public final C75906g f210380b;

    /* renamed from: c */
    public final C22871g f210381c;

    /* renamed from: d */
    public final C79863k f210382d;

    /* renamed from: e */
    public Optional f210383e = Optional.empty();

    /* renamed from: f */
    public final C83357g f210384f = new C83361k(C75862d.FLOW_NOT_IN_PROGRESS, C22867c.class);

    /* renamed from: g */
    public final C83363m f210385g = new C83363m();

    /* renamed from: h */
    public final C75830bd f210386h;

    /* renamed from: i */
    private final C75794w f210387i;

    /* renamed from: j */
    private final C75827ba f210388j;

    /* renamed from: k */
    private final C58881cr f210389k;

    /* renamed from: l */
    private final C91142g f210390l;

    public C75808ai(C75794w wVar, C75830bd bdVar, C75827ba baVar, C75906g gVar, C68214a aVar, C22871g gVar2, C91142g gVar3, C79863k kVar) {
        this.f210387i = wVar;
        this.f210386h = bdVar;
        this.f210388j = baVar;
        this.f210380b = gVar;
        this.f210389k = C58886cw.m90973a(new C75807ah(aVar));
        this.f210381c = gVar2;
        this.f210390l = gVar3;
        this.f210382d = kVar;
    }

    /* renamed from: c */
    public static C89857g m122179c(C89849ae aeVar, C80201av avVar) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        C59478bb bbVar = (C59478bb) C59479bc.f157808c.createBuilder();
        C59482bf bfVar = (C59482bf) C59491bo.f157839m.createBuilder();
        bfVar.copyOnWrite();
        C59491bo boVar = (C59491bo) bfVar.instance;
        boVar.f157846f = avVar.f220046m;
        boVar.f157841a |= 4;
        C59491bo boVar2 = (C59491bo) bfVar.build();
        bbVar.copyOnWrite();
        C59479bc bcVar = (C59479bc) bbVar.instance;
        boVar2.getClass();
        bcVar.f157811b = boVar2;
        bcVar.f157810a = 1;
        C59479bc bcVar2 = (C59479bc) bbVar.build();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        bcVar2.getClass();
        cbVar.f160071aI = bcVar2;
        cbVar.f160123d |= 2;
        fVar.f246203c = (C59687cb) ajVar.build();
        return fVar.mo83699a();
    }

    /* renamed from: h */
    private final void m122180h(C75862d dVar) {
        this.f210381c.mo28212l("[NGA] PieImpl.setGreeting", new C75806ag(this, dVar));
    }

    /* renamed from: a */
    public final void mo71903a(C80257l lVar) {
        C75830bd bdVar = this.f210386h;
        C80204ay ayVar = (C80204ay) C80205az.f220051c.createBuilder();
        ayVar.copyOnWrite();
        C80205az azVar = (C80205az) ayVar.instance;
        lVar.getClass();
        azVar.f220054b = lVar;
        azVar.f220053a = 1;
        C60870cx a = bdVar.mo71917a((C80205az) ayVar.build());
        a.mo4106b(new C75802ac(this, a), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final synchronized void mo71904b(Bundle bundle, C75913n nVar) {
        if (nVar.mo71897e() != 0) {
            C80267v a = C81377k.m129443a(bundle);
            if (this.f210380b.mo71922a().mo76657c() != C80201av.PIE_ELIGIBLE) {
                ((C58970a) ((C58970a) f210379a.mo56225c()).mo56372aa(3369)).mo56386p("Not triggering new flow, Pie is not eligible");
                C81380n d = C81381o.m129461d();
                d.mo75044c(a);
                d.mo75045d(nVar.mo71897e());
                d.mo75043b(C80265t.TRIGGER_PIE_NOT_ELIGIBLE);
                throw d.mo75042a();
            } else if (!mo71905g()) {
                C75794w wVar = this.f210387i;
                C80267v a2 = C81377k.m129443a(bundle);
                a2.name();
                Function function = (Function) wVar.f210353b.get(a2);
                if (function != null) {
                    C75788q qVar = (C75788q) function.apply(bundle);
                    qVar.mo71881m(nVar);
                    this.f210388j.f210435a = Optional.m71637of(bundle);
                    C58800sl lA = ((C58528ij) this.f210389k.mo6453a()).iterator();
                    while (lA.hasNext()) {
                        qVar.mo71880l((C75786o) lA.next());
                    }
                    qVar.mo71880l(this);
                    qVar.mo71882n();
                } else {
                    ((C58970a) ((C58970a) C75794w.f210352a.mo56225c()).mo56372aa(3350)).mo56389s("Could not find flow for ID \"%s\"", a2.name());
                    C81380n d2 = C81381o.m129461d();
                    d2.mo75044c(a2);
                    d2.mo75043b(C80265t.TRIGGER_FLOW_CREATION_FAILED);
                    d2.mo75045d(nVar.mo71897e());
                    throw d2.mo75042a();
                }
            } else {
                ((C58970a) ((C58970a) f210379a.mo56225c()).mo56372aa(3368)).mo56386p("Not triggering new flow, one is already in progress");
                C81380n d3 = C81381o.m129461d();
                d3.mo75044c(a);
                d3.mo75045d(nVar.mo71897e());
                d3.mo75043b(C80265t.TRIGGER_FLOW_IN_PROGRESS);
                throw d3.mo75042a();
            }
        } else {
            throw null;
        }
    }

    /* renamed from: d */
    public final synchronized void mo71889d(C75788q qVar, int i, C80265t tVar) {
        this.f210383e = Optional.empty();
        m122180h(C75862d.FLOW_NOT_IN_PROGRESS);
    }

    /* renamed from: e */
    public final synchronized void mo71890e(C75788q qVar, int i, C75891l lVar) {
        if (i == 0) {
            this.f210383e = Optional.m71637of(qVar);
            m122180h(qVar.mo71872a());
        }
    }

    /* renamed from: f */
    public final synchronized void mo71891f(C75788q qVar) {
        this.f210383e = Optional.empty();
        m122180h(C75862d.FLOW_NOT_IN_PROGRESS);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        return false;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo71905g() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.engine.education.pie.g r0 = r3.f210380b     // Catch:{ all -> 0x002d }
            com.google.android.apps.gsa.nga.shared.x.h r0 = r0.mo71922a()     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.mo76657c()     // Catch:{ all -> 0x002d }
            com.google.android.apps.gsa.nga.shared.aa.d.a.av r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80201av.PIE_ELIGIBLE     // Catch:{ all -> 0x002d }
            r2 = 0
            if (r0 != r1) goto L_0x002b
            j$.util.Optional r0 = r3.f210383e     // Catch:{ all -> 0x002d }
            com.google.android.apps.gsa.nga.engine.education.pie.b.z r1 = com.google.android.apps.gsa.nga.engine.education.pie.p6020b.C75859z.f210498a     // Catch:{ all -> 0x002d }
            j$.util.Optional r0 = r0.map(r1)     // Catch:{ all -> 0x002d }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.orElse(r1)     // Catch:{ all -> 0x002d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002b
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x002b:
            monitor-exit(r3)
            return r2
        L_0x002d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.education.pie.p6020b.C75808ai.mo71905g():boolean");
    }

    /* renamed from: gH */
    public final C60870cx mo71906gH() {
        this.f210381c.mo28204d("[NGA] PieImpl.initialize", this.f210390l.mo85399d(C90037cp.f248498bZ), new C75803ad(this));
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: gI */
    public final void mo71907gI() {
        this.f210385g.mo76661a();
        C80256k kVar = (C80256k) C80257l.f220192c.createBuilder();
        C80201av avVar = C80201av.PIE_INELIGIBLE_UNINITIALIZED;
        kVar.copyOnWrite();
        C80257l lVar = (C80257l) kVar.instance;
        lVar.f220195b = Integer.valueOf(avVar.f220046m);
        lVar.f220194a = 2;
        mo71903a((C80257l) kVar.build());
    }
}
