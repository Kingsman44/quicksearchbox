package com.google.android.libraries.lens.view.session.ondevice;

import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.android.libraries.lens.p2014e.C24203af;
import com.google.android.libraries.lens.p2014e.C24209al;
import com.google.android.libraries.lens.p2014e.C24211c;
import com.google.android.libraries.lens.p2014e.C24228t;
import com.google.android.libraries.lens.p2014e.C24229u;
import com.google.android.libraries.lens.view.p2070an.C25372aj;
import com.google.android.libraries.lens.view.p2070an.C25387ay;
import com.google.android.libraries.lens.view.p2070an.p2071a.C25357f;
import com.google.android.libraries.lens.view.p2070an.p2071a.C25359h;
import com.google.android.libraries.lens.view.p2093d.C25762k;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.C27879bi;
import com.google.android.libraries.lens.view.session.ondevice.p2168c.C27940n;
import com.google.android.libraries.lens.view.utils.C28130s;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.amc;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4017at.p4056g.p4057a.p4058a.C54006bn;
import com.google.p4017at.p4056g.p4057a.p4058a.C54007bo;
import com.google.p4017at.p4056g.p4057a.p4058a.C54019c;
import com.google.p4017at.p4056g.p4057a.p4058a.C54037cr;
import com.google.p4017at.p4056g.p4057a.p4058a.C54038cs;
import com.google.p4017at.p4056g.p4057a.p4058a.C54046d;
import com.google.p4017at.p4056g.p4057a.p4058a.C54053e;
import com.google.p4017at.p4056g.p4057a.p4058a.C54054f;
import com.google.p4172bg.p4174b.C55731t;
import com.google.p4172bg.p4174b.C55733v;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56243ax;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56277cd;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56281ch;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56297cx;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56299cz;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56301da;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56302db;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56303dc;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56304dd;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C63088z;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.z */
/* compiled from: PG */
public final class C28017z implements C27654a {

    /* renamed from: a */
    public static final C58974d f76238a = C58974d.m91135i("OnDeviceQueryEngine");

    /* renamed from: b */
    public final Executor f76239b;

    /* renamed from: c */
    public final C25357f f76240c;

    /* renamed from: d */
    public final C27920ak f76241d;

    /* renamed from: e */
    public final C27879bi f76242e;

    /* renamed from: f */
    public final C25359h f76243f;

    /* renamed from: g */
    public final C58833ax f76244g;

    /* renamed from: h */
    public final C27940n f76245h;

    /* renamed from: i */
    public final boolean f76246i;

    /* renamed from: j */
    public C28015x f76247j;

    /* renamed from: k */
    public C56280cg f76248k;

    /* renamed from: l */
    private final boolean f76249l;

    /* renamed from: m */
    private final boolean f76250m;

    /* renamed from: n */
    private final Queue f76251n = new ArrayDeque();

    /* renamed from: o */
    private C28015x f76252o;

    /* renamed from: p */
    private int f76253p = 1;

    public C28017z(Executor executor, C27879bi biVar, C25357f fVar, C27920ak akVar, C25359h hVar, C58833ax axVar, C27940n nVar, boolean z, boolean z2, boolean z3) {
        this.f76239b = executor;
        this.f76242e = biVar;
        this.f76240c = fVar;
        this.f76241d = akVar;
        this.f76243f = hVar;
        this.f76244g = axVar;
        this.f76245h = nVar;
        this.f76249l = z;
        this.f76250m = z2;
        this.f76246i = z3;
    }

    /* renamed from: a */
    public static C58833ax m52180a(C58833ax axVar, C58833ax axVar2) {
        C56297cx cxVar = (C56297cx) C56301da.f150037e.createBuilder();
        if (axVar.mo56113h()) {
            String str = (String) axVar.mo56107c();
            if (Locale.CHINESE.toLanguageTag().equals(str)) {
                str = Locale.TRADITIONAL_CHINESE.toLanguageTag();
            }
            cxVar.copyOnWrite();
            C56301da daVar = (C56301da) cxVar.instance;
            str.getClass();
            daVar.f150039a |= 1;
            daVar.f150040b = str;
            cxVar.copyOnWrite();
            C56301da daVar2 = (C56301da) cxVar.instance;
            daVar2.f150039a |= 2;
            daVar2.f150041c = false;
        }
        if (axVar2.mo56113h()) {
            cxVar.copyOnWrite();
            C56301da daVar3 = (C56301da) cxVar.instance;
            daVar3.f150042d = ((C56299cz) axVar2.mo56107c()).f150036i;
            daVar3.f150039a |= 4;
        }
        C56281ch chVar = (C56281ch) C56302db.f150043e.createBuilder();
        C56301da daVar4 = (C56301da) cxVar.build();
        chVar.copyOnWrite();
        C56302db dbVar = (C56302db) chVar.instance;
        daVar4.getClass();
        dbVar.f150047c = daVar4;
        dbVar.f150046b = 4;
        C56306df dfVar = C56306df.TRANSLATE;
        chVar.copyOnWrite();
        C56302db dbVar2 = (C56302db) chVar.instance;
        dbVar2.f150048d = dfVar.f150068m;
        dbVar2.f150045a |= 1;
        C56302db dbVar3 = (C56302db) chVar.build();
        C56303dc dcVar = (C56303dc) C56304dd.f150050b.createBuilder();
        dcVar.copyOnWrite();
        C56304dd ddVar = (C56304dd) dcVar.instance;
        dbVar3.getClass();
        ddVar.mo54350a();
        ddVar.f150052a.add(dbVar3);
        return C58833ax.m90834k((C56304dd) dcVar.build());
    }

    /* renamed from: b */
    public static C58833ax m52181b(C27971i iVar) {
        if (iVar.mo33393j() != null) {
            C55733v j = iVar.mo33393j();
            j.getClass();
            if ((j.f147072a & 2048) != 0) {
                C54037cr crVar = (C54037cr) C54038cs.f141782f.createBuilder();
                String str = j.f147075d;
                crVar.copyOnWrite();
                str.getClass();
                ((C54038cs) crVar.instance).f141787d = str;
                return C58833ax.m90834k((C54038cs) crVar.build());
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: l */
    public static boolean m52182l(C58833ax axVar) {
        return axVar.mo56113h() && ((C55731t) axVar.mo56107c()).f147065c.size() > 0;
    }

    /* renamed from: o */
    public static C24228t m52183o(C56220aa aaVar, amc amc, C58485gu guVar, C58833ax axVar, C58833ax axVar2) {
        if (aaVar != null) {
            aaVar.f149750a.size();
        }
        guVar.size();
        C24228t p = C24229u.m45204p();
        p.mo29728h(true);
        p.mo29724d(aaVar);
        p.mo29723c(guVar);
        C54006bn bnVar = (C54006bn) C54007bo.f141701b.createBuilder();
        C63088z byteString = amc.toByteString();
        bnVar.copyOnWrite();
        byteString.getClass();
        ((C54007bo) bnVar.instance).f141703a = byteString;
        p.mo29730j((C54007bo) bnVar.build());
        C54019c cVar = (C54019c) C54054f.f141816b.createBuilder();
        C54046d dVar = (C54046d) C54053e.f141812c.createBuilder();
        dVar.copyOnWrite();
        ((C54053e) dVar.instance).f141815b = true;
        cVar.copyOnWrite();
        C54053e eVar = (C54053e) dVar.build();
        eVar.getClass();
        ((C54054f) cVar.instance).f141818a = eVar;
        p.mo29722b((C54054f) cVar.build());
        if (axVar.mo56113h()) {
            ((C24211c) p).f66155a = C58833ax.m90833j((C54038cs) axVar.mo56107c());
        }
        if (axVar2.mo56113h()) {
            p.mo29725e((C56304dd) axVar2.mo56107c());
        }
        return p;
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("OnDeviceQueryEngine");
        eVar.mo33146c(this.f76242e.mo33352a());
        C27920ak akVar = this.f76241d;
        eVar.mo33148e("effectiveSourceLanguage", (String) akVar.f76056o.mo56109e("absent"));
        eVar.mo33148e("targetLanguage", (String) akVar.f76054m.mo56109e("absent"));
    }

    /* renamed from: d */
    public final C60870cx mo33466d(C24201ad adVar, C24209al alVar) {
        C25387ay.m46760a();
        Executor executor = this.f76239b;
        String valueOf = String.valueOf(adVar.mo29680c());
        C28016y yVar = new C28016y(adVar, C25372aj.m46734a(alVar, executor, "OnDeviceQueryEngine[" + valueOf + "]"));
        ((C58970a) ((C58970a) f76238a.mo56224b()).mo56372aa(49974)).mo56389s("Query[%s] enqueued", adVar.mo29680c());
        this.f76251n.add(yVar);
        mo33471i();
        return yVar.f76236b.f70026b;
    }

    /* renamed from: e */
    public final void mo33467e(Throwable th) {
        C28015x xVar = this.f76247j;
        if (xVar != null) {
            xVar.f76233e.mo30912b(th);
            this.f76247j = null;
        }
        for (C28016y yVar : this.f76251n) {
            yVar.f76236b.mo30912b(th);
        }
        this.f76251n.clear();
    }

    /* renamed from: f */
    public final void mo33468f() {
        C56277cd cdVar;
        C58833ax axVar;
        C56280cg cgVar = this.f76248k;
        cgVar.getClass();
        C58833ax c = C58557jl.m90122c(cgVar.f149994a, C27975m.f76136a);
        if (c.mo56113h()) {
            C56278ce ceVar = (C56278ce) c.mo56107c();
            if (ceVar.f149989b == 3) {
                cdVar = (C56277cd) ceVar.f149990c;
            } else {
                cdVar = C56277cd.f149981d;
            }
            C27920ak akVar = this.f76241d;
            String str = cdVar.f149985c;
            String str2 = cdVar.f149984b;
            akVar.f76053l = C58833ax.m90834k(str);
            if (akVar.mo33380i()) {
                axVar = akVar.f76056o;
            } else {
                axVar = akVar.f76053l;
            }
            akVar.mo33373b(axVar, C58833ax.m90834k(str2));
            if (this.f76242e.mo33357h()) {
                this.f76242e.mo33354d(this.f76248k);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r9.getMessage().startsWith(r2) != false) goto L_0x0016;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33469g(com.google.android.libraries.lens.view.session.ondevice.C28015x r7, com.google.android.libraries.lens.view.session.ondevice.C27971i r8, java.lang.Throwable r9) {
        /*
            r6 = this;
            java.lang.String r0 = r9.getMessage()
            java.lang.String r1 = r9.getMessage()
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = r9.getMessage()
            java.lang.String r2 = "UNAVAILABLE"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x0018
        L_0x0016:
            r0 = r2
            goto L_0x0032
        L_0x0018:
            java.lang.String r1 = r9.getMessage()
            java.lang.String r2 = "RESOURCE_EXHAUSTED"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x0025
            goto L_0x0016
        L_0x0025:
            java.lang.String r1 = r9.getMessage()
            java.lang.String r2 = "UNAUTHENTICATED"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x0032
            goto L_0x0016
        L_0x0032:
            com.google.android.libraries.lens.view.session.ondevice.ak r1 = r6.f76241d
            r1.mo33372a(r0)
            com.google.android.libraries.lens.e.u r0 = r7.f76234f
            com.google.bp.f.b.a.aa r0 = r0.mo29743j()
            com.google.android.libraries.lens.view.an.a.h r1 = r6.f76243f
            com.google.android.libraries.lens.e.ad r2 = r7.f76229a
            com.google.android.libraries.lens.e.ae r2 = r2.mo29679b()
            com.google.bp.f.b.a.cg r2 = r2.mo29686c()
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            com.google.common.o.amc r1 = r1.mo30408b(r2, r3, r4)
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.base.ax r3 = m52181b(r8)
            com.google.android.libraries.lens.view.session.ondevice.ak r4 = r6.f76241d
            com.google.common.base.ax r5 = r4.f76055n
            com.google.common.base.ax r4 = r4.f76057p
            com.google.common.base.ax r4 = m52180a(r5, r4)
            com.google.android.libraries.lens.e.t r0 = m52183o(r0, r1, r2, r3, r4)
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90833j(r9)
            r1 = r0
            com.google.android.libraries.lens.e.c r1 = (com.google.android.libraries.lens.p2014e.C24211c) r1
            r1.f66158d = r9
            boolean r8 = r8.mo33396m()
            r0.mo29729i(r8)
            com.google.android.libraries.lens.e.u r8 = r0.mo29721a()
            r7.mo33464a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.session.ondevice.C28017z.mo33469g(com.google.android.libraries.lens.view.session.ondevice.x, com.google.android.libraries.lens.view.session.ondevice.i, java.lang.Throwable):void");
    }

    /* renamed from: h */
    public final void mo33470h() {
        C25387ay.m46760a();
        mo33467e(new CancellationException());
        this.f76242e.mo33356f();
        this.f76241d.mo33375d();
    }

    /* renamed from: i */
    public final void mo33471i() {
        C60870cx cxVar;
        this.f76251n.size();
        while (!this.f76251n.isEmpty() && this.f76247j == null) {
            C28016y yVar = (C28016y) this.f76251n.poll();
            if (yVar != null) {
                C58974d dVar = f76238a;
                ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(49975)).mo56355H("Query[%s] executing (interaction=%b)", yVar.f76235a.mo29680c(), yVar.f76235a.mo29682e().mo56113h());
                C28015x xVar = this.f76252o;
                if (xVar == null || !xVar.f76229a.mo29683g(yVar.f76235a)) {
                    C24201ad adVar = yVar.f76235a;
                    C56243ax axVar = (C56243ax) C56244ay.f149802e.createBuilder();
                    axVar.copyOnWrite();
                    C56244ay ayVar = (C56244ay) axVar.instance;
                    boolean z = true;
                    ayVar.f149804a |= 1;
                    ayVar.f149805b = 1;
                    int i = this.f76253p;
                    this.f76253p = i + 1;
                    axVar.copyOnWrite();
                    C56244ay ayVar2 = (C56244ay) axVar.instance;
                    ayVar2.f149804a |= 4;
                    ayVar2.f149807d = (long) i;
                    axVar.copyOnWrite();
                    C56244ay ayVar3 = (C56244ay) axVar.instance;
                    ayVar3.f149804a |= 2;
                    ayVar3.f149806c = 1;
                    C28015x xVar2 = new C28015x(adVar, (C56244ay) axVar.build(), C25762k.m47565a(new C27974l(yVar), this.f76239b, "Query.Image[" + String.valueOf(yVar.f76235a.mo29680c()) + "]"));
                    this.f76252o = xVar2;
                    if (this.f76247j != null) {
                        z = false;
                    }
                    C58838bb.m90884s(z, "expected currentEngineQuery to be null");
                    C56280cg c = xVar2.f76229a.mo29679b().mo29686c();
                    if (!c.equals(this.f76248k)) {
                        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(49996)).mo56389s("Query[%s] filters do not match engine filters, reconfiguring", xVar2.f76229a.mo29680c());
                        mo33473k(c);
                    }
                    this.f76247j = xVar2;
                    C60856cj.m92911t(xVar2.f76233e.f70026b, C47810es.m84974n(new C28009r(this, xVar2)), this.f76239b);
                    xVar2.f76231c.getByteCount();
                    xVar2.f76232d.getWidth();
                    xVar2.f76232d.getHeight();
                    C56280cg c2 = xVar2.f76229a.mo29679b().mo29686c();
                    if (C28130s.m52412c(c2, C56306df.TEXT) || C28130s.m52412c(c2, C56306df.AUTO_FILTER)) {
                        mo33472j(xVar2);
                    } else if (C28130s.m52412c(c2, C56306df.TRANSLATE)) {
                        C27920ak akVar = this.f76241d;
                        if (akVar.f76052k == null) {
                            akVar.f76052k = C60922j.m93044g(akVar.f76044c.mo33438k(), C47810es.m84963c(C27918ai.f76039a), C60826bg.f164896a);
                        }
                        C60856cj.m92911t(akVar.f76052k, C47810es.m84974n(new C28010s(this, xVar2)), this.f76239b);
                    } else {
                        xVar2.f76233e.mo30914d(new IllegalStateException("Image ignored, not in text or translate filter"));
                    }
                    cxVar = this.f76252o.f76233e.f70026b;
                } else {
                    C24203af c3 = yVar.f76235a.mo29680c();
                    C28015x xVar3 = this.f76252o;
                    xVar3.getClass();
                    ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(49973)).mo56354G("Query[%s] reusing image result from Query[%s]", c3, xVar3.f76229a.mo29680c());
                    C28015x xVar4 = this.f76252o;
                    xVar4.getClass();
                    cxVar = xVar4.f76233e.f70026b;
                }
                C60856cj.m92911t(cxVar, C47810es.m84974n(new C28008q(this, yVar)), this.f76239b);
            }
        }
    }

    /* renamed from: j */
    public final void mo33472j(C28015x xVar) {
        C56280cg c = xVar.f76229a.mo29679b().mo29686c();
        if (mo33475n(c) || mo33474m(c)) {
            C24203af c2 = xVar.f76229a.mo29680c();
            C56244ay ayVar = xVar.f76230b;
            ayVar.getClass();
            ((C58970a) ((C58970a) f76238a.mo56224b()).mo56372aa(49993)).mo56353F("Query[%s] sending image to on-device engine (%d)", c2, ayVar.f149807d);
            C27879bi biVar = this.f76242e;
            C56244ay ayVar2 = xVar.f76230b;
            ayVar2.getClass();
            biVar.mo33353c(ayVar2, xVar.f76229a);
            return;
        }
        xVar.f76233e.mo30914d(new IllegalStateException("Should not process image for text or hints"));
    }

    /* renamed from: k */
    public final void mo33473k(C56280cg cgVar) {
        C58838bb.m90884s(this.f76247j == null, "can't change filter config while engine query is in progress");
        if (C28130s.m52412c(cgVar, C56306df.TRANSLATE)) {
            this.f76241d.mo33374c();
        } else {
            C56280cg cgVar2 = this.f76248k;
            if (cgVar2 != null && C28130s.m52412c(cgVar2, C56306df.TRANSLATE)) {
                this.f76241d.mo33375d();
            }
        }
        this.f76248k = cgVar;
        mo33468f();
    }

    /* renamed from: m */
    public final boolean mo33474m(C56280cg cgVar) {
        return C28130s.m52412c(cgVar, C56306df.AUTO_FILTER) && this.f76249l;
    }

    /* renamed from: n */
    public final boolean mo33475n(C56280cg cgVar) {
        if (C28130s.m52412c(cgVar, C56306df.TEXT)) {
            return this.f76250m;
        }
        if (C28130s.m52412c(cgVar, C56306df.TRANSLATE)) {
            boolean z = (this.f76241d.mo33380i() || this.f76241d.f76056o.mo56113h()) && this.f76241d.f76054m.mo56113h();
            boolean z2 = this.f76241d.mo33380i() || this.f76241d.mo33377f();
            if (!z || !z2) {
                return false;
            }
            return true;
        }
        return false;
    }
}
