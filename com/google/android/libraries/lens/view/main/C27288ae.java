package com.google.android.libraries.lens.view.main;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Size;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.libraries.lens.p2014e.C24199ab;
import com.google.android.libraries.lens.p2014e.C24203af;
import com.google.android.libraries.lens.p2014e.C24226r;
import com.google.android.libraries.lens.p2014e.C24229u;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.view.filters.p2099c.C25941f;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.translation.C26120dc;
import com.google.android.libraries.lens.view.gleam.C26505cj;
import com.google.android.libraries.lens.view.gleam.C26512cq;
import com.google.android.libraries.lens.view.gleam.C26513cr;
import com.google.android.libraries.lens.view.gleam.C26526dd;
import com.google.android.libraries.lens.view.gleam.C26566em;
import com.google.android.libraries.lens.view.gleam.C26637y;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26961a;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26968d;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26971g;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26973i;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26980p;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26982r;
import com.google.android.libraries.lens.view.infopanel.p2138a.p2139a.C26965d;
import com.google.android.libraries.lens.view.infopanel.p2144e.C27164f;
import com.google.android.libraries.lens.view.p2056af.C25043ao;
import com.google.android.libraries.lens.view.p2056af.C25050av;
import com.google.android.libraries.lens.view.p2056af.C25073c;
import com.google.android.libraries.lens.view.p2069am.C25332h;
import com.google.android.libraries.lens.view.p2069am.C25333i;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.android.libraries.lens.view.p2078at.C25497ac;
import com.google.android.libraries.lens.view.p2078at.C25523f;
import com.google.android.libraries.lens.view.p2078at.C25533p;
import com.google.android.libraries.lens.view.p2081au.C25550af;
import com.google.android.libraries.lens.view.p2081au.C25558h;
import com.google.android.libraries.lens.view.p2081au.C25560j;
import com.google.android.libraries.lens.view.p2081au.C25561k;
import com.google.android.libraries.lens.view.p2081au.C25562l;
import com.google.android.libraries.lens.view.p2081au.C25563m;
import com.google.android.libraries.lens.view.p2081au.C25565o;
import com.google.android.libraries.lens.view.p2081au.C25574x;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.lens.view.p2096f.C25799b;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26765q;
import com.google.android.libraries.lens.view.p2148l.C27227g;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.p2153o.C27459a;
import com.google.android.libraries.lens.view.p2154p.p2156b.C27543c;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.lens.view.ris.C27679e;
import com.google.android.libraries.lens.view.session.C27732a;
import com.google.android.libraries.lens.view.session.C27761ax;
import com.google.android.libraries.lens.view.session.C27763az;
import com.google.android.libraries.lens.view.session.C27768bd;
import com.google.android.libraries.lens.view.session.C27772bh;
import com.google.android.libraries.lens.view.session.C27774bj;
import com.google.android.libraries.lens.view.session.C27777bm;
import com.google.android.libraries.lens.view.session.C27778bn;
import com.google.android.libraries.lens.view.session.C27791k;
import com.google.android.libraries.lens.view.session.C27793m;
import com.google.android.libraries.lens.view.session.C28020r;
import com.google.android.libraries.lens.view.textoverlay.C28072e;
import com.google.android.libraries.lens.view.textoverlay.C28079l;
import com.google.android.libraries.lens.view.utils.C28099aa;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.aar;
import com.google.common.p4552o.aas;
import com.google.common.p4552o.abd;
import com.google.common.p4552o.abg;
import com.google.common.p4552o.abh;
import com.google.common.p4552o.abp;
import com.google.common.p4552o.abr;
import com.google.common.p4552o.abu;
import com.google.common.p4552o.acb;
import com.google.common.p4552o.p4563i.C59892ba;
import com.google.common.p4552o.p4563i.C59895bd;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import com.google.lens.p4699e.C62231l;
import com.google.lens.p4707j.C62433bj;
import com.google.lens.p4707j.C62478da;
import com.google.lens.p4707j.C62479db;
import com.google.lens.p4707j.C62480dc;
import com.google.lens.p4707j.C62494dq;
import com.google.lens.p4707j.C62496ds;
import com.google.lens.p4707j.C62573go;
import com.google.lens.p4707j.C62592z;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4017at.p4056g.p4057a.p4058a.C54038cs;
import com.google.p4017at.p4056g.p4057a.p4058a.C54053e;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56250bd;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56251be;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56310h;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56327y;
import com.google.protos.p4963bf.p4964a.p4965a.C64597bs;
import dagger.C68214a;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p5488io.grpc.C70761fa;

/* renamed from: com.google.android.libraries.lens.view.main.ae */
/* compiled from: PG */
public final class C27288ae implements C27654a {

    /* renamed from: a */
    public static final C58974d f74662a = C58974d.m91135i("LensUiController");

    /* renamed from: A */
    private final boolean f74663A;

    /* renamed from: B */
    private final boolean f74664B;

    /* renamed from: C */
    private final C25043ao f74665C;

    /* renamed from: D */
    private C60870cx f74666D;

    /* renamed from: E */
    private C60870cx f74667E;

    /* renamed from: F */
    private C24229u f74668F;

    /* renamed from: b */
    public final C25550af f74669b;

    /* renamed from: c */
    public final C25565o f74670c;

    /* renamed from: d */
    public final C27232l f74671d;

    /* renamed from: e */
    public final C58833ax f74672e;

    /* renamed from: f */
    public final C27763az f74673f;

    /* renamed from: g */
    public final C68214a f74674g;

    /* renamed from: h */
    public final C25758g f74675h;

    /* renamed from: i */
    public final C25073c f74676i;

    /* renamed from: j */
    public final C27459a f74677j;

    /* renamed from: k */
    public final boolean f74678k;

    /* renamed from: l */
    public C27286ac f74679l;

    /* renamed from: m */
    public C25533p f74680m;

    /* renamed from: n */
    public C62496ds f74681n = C62496ds.f168723e;

    /* renamed from: o */
    public boolean f74682o;

    /* renamed from: p */
    public C60214n f74683p = null;

    /* renamed from: q */
    public C27228h f74684q;

    /* renamed from: r */
    public C27440t f74685r;

    /* renamed from: s */
    private final Executor f74686s;

    /* renamed from: t */
    private final Executor f74687t;

    /* renamed from: u */
    private final C28020r f74688u;

    /* renamed from: v */
    private final C26120dc f74689v;

    /* renamed from: w */
    private final C26566em f74690w;

    /* renamed from: x */
    private final C25799b f74691x;

    /* renamed from: y */
    private final boolean f74692y;

    /* renamed from: z */
    private final boolean f74693z;

    public C27288ae(C25550af afVar, C25565o oVar, Executor executor, Executor executor2, C28020r rVar, C25043ao aoVar, C27232l lVar, C25799b bVar, C58833ax axVar, C68214a aVar, C26120dc dcVar, C26566em emVar, C25073c cVar, C58833ax axVar2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f74669b = afVar;
        this.f74670c = oVar;
        this.f74686s = executor;
        this.f74687t = executor2;
        this.f74688u = rVar;
        this.f74671d = lVar;
        this.f74691x = bVar;
        this.f74665C = aoVar;
        this.f74672e = axVar;
        this.f74673f = new C27763az();
        this.f74674g = aVar;
        this.f74689v = dcVar;
        this.f74690w = emVar;
        this.f74676i = cVar;
        this.f74693z = z;
        this.f74663A = z2;
        this.f74678k = z3;
        this.f74692y = z4;
        this.f74664B = z5;
        this.f74677j = (C27459a) axVar2.mo56111f();
        this.f74675h = new C25758g(C58836b.f156633a);
    }

    /* renamed from: A */
    private final void m50824A(C54038cs csVar) {
        if (this.f74677j != null) {
            String str = csVar.f141787d;
            C64597bs bsVar = csVar.f141788e;
            if (bsVar == null) {
                bsVar = C64597bs.f175135c;
            }
            int i = bsVar.f175137a;
            C27459a aVar = this.f74677j;
            aVar.getClass();
            aVar.mo33002f();
        }
    }

    /* renamed from: B */
    private final void m50825B(C25574x xVar) {
        Object obj;
        if (xVar != null && this.f74664B) {
            if (this.f74691x.mo30941b()) {
                C58838bb.m90883r(((C25558h) xVar).f69579b.mo56113h());
            } else if (!((C25558h) xVar).f69579b.mo56113h()) {
                ((C58970a) ((C58970a) f74662a.mo56225c()).mo56372aa(49707)).mo56386p("ResultParentVed is missing in EyesInteraction");
            }
        }
        this.f74682o = xVar != null;
        this.f74669b.mo30609f(xVar);
        if (this.f74663A) {
            m50826C();
            return;
        }
        C25758g gVar = this.f74675h;
        if (xVar == null) {
            obj = C58836b.f156633a;
        } else {
            obj = C58833ax.m90834k(((C25558h) xVar).f69578a);
        }
        gVar.mo5708l(obj);
    }

    /* renamed from: C */
    private final void m50826C() {
        C58833ax axVar;
        C58838bb.m90883r(this.f74663A);
        if (this.f74680m == null) {
            axVar = C58836b.f156633a;
        } else {
            axVar = ((C58833ax) this.f74669b.f69552b.mo30656d()).mo56106b(C27441u.f75089a);
        }
        if (!axVar.equals(this.f74675h.mo3842a())) {
            C25758g gVar = this.f74675h;
            axVar.getClass();
            gVar.mo5708l(axVar);
        }
    }

    /* renamed from: D */
    private final boolean m50827D(C56306df dfVar) {
        return ((C25989d) this.f74674g.mo27525b()).mo31207f(dfVar);
    }

    /* renamed from: z */
    private final void m50828z() {
        this.f74685r = null;
        this.f74681n = C62496ds.f168723e;
    }

    /* renamed from: a */
    public final C58833ax mo32825a() {
        return this.f74680m == null ? C58836b.f156633a : (C58833ax) this.f74670c.mo30594b().mo30656d();
    }

    /* renamed from: b */
    public final void mo32826b() {
        C25533p pVar = this.f74680m;
        if (pVar != null) {
            ((C25523f) pVar).f69503a.cancel(false);
            this.f74680m = null;
        }
        C60870cx cxVar = this.f74666D;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f74666D = null;
        }
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("LensUiController");
        eVar.mo33146c(this.f74669b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo32828e() {
        m50828z();
        mo32829f(true);
        this.f74668F = null;
        this.f74669b.mo30610g((C60870cx) null);
    }

    /* renamed from: f */
    public final void mo32829f(boolean z) {
        C19559g.m37304c();
        if (z) {
            mo32838o();
        }
        m50828z();
        m50825B((C25574x) null);
    }

    /* renamed from: g */
    public final void mo32830g(boolean z, C58833ax axVar) {
        boolean z2;
        C24226r rVar;
        Bitmap bitmap;
        m50828z();
        if (!this.f74663A) {
            z2 = z;
        } else if (this.f74666D == null) {
            axVar = C58836b.f156633a;
            z2 = false;
        } else {
            ((C58970a) ((C58970a) f74662a.mo56225c()).mo56372aa(49692)).mo56386p("Attempt to freeze when already frozen");
            return;
        }
        C60870cx cxVar = (C60870cx) ((C58833ax) this.f74669b.f69551a.mo30656d()).mo56111f();
        if (cxVar == null) {
            ((C58970a) ((C58970a) f74662a.mo56226d()).mo56372aa(49691)).mo56386p("Request to freeze non-existent prefetch image");
            return;
        }
        this.f74673f.mo33233b(true);
        C27228h hVar = this.f74684q;
        if (hVar == null) {
            rVar = C24226r.CAMERA;
        } else {
            rVar = (C24226r) hVar.mo32673f().mo56107c();
        }
        C24226r rVar2 = rVar;
        C27228h hVar2 = this.f74684q;
        if (hVar2 == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) hVar2.mo32668b().mo56111f();
        }
        mo32826b();
        this.f74666D = cxVar;
        C60870cx j = C60856cj.m92901j(cxVar);
        C27439s sVar = C27439s.f75085a;
        C60870cx g = C60922j.m93044g(j, C47810es.m84963c(sVar), this.f74687t);
        if (rVar2 != null) {
            C25523f fVar = new C25523f(g, C58833ax.m90833j(bitmap), z2, C58833ax.m90833j((C27777bm) axVar.mo56111f()), rVar2);
            this.f74680m = fVar;
            C27286ac acVar = this.f74679l;
            acVar.getClass();
            C27326bp bpVar = (C27326bp) acVar;
            bpVar.f74752a.f74776V.mo33306d(fVar);
            bpVar.f74752a.mo32868A(C25497ac.FROZEN, fVar);
            if (this.f74663A) {
                m50826C();
                return;
            }
            return;
        }
        throw new NullPointerException("Null source");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x039d, code lost:
        if (r4.equals("download") == false) goto L_0x03b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03e6  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32832i(com.google.android.libraries.lens.view.p2069am.C25342r r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            java.lang.String r2 = "com.google.android.apps.translate"
            com.google.android.libraries.p1623at.p1632e.C19559g.m37304c()
            r20.m50828z()
            r20.mo32846w()
            com.google.android.libraries.lens.view.session.az r3 = r1.f74673f
            boolean r3 = r3.mo33234c()
            if (r3 == 0) goto L_0x0bbd
            r3 = 1
            r1.f74682o = r3
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            r5 = 0
            r1.mo32830g(r5, r4)
            com.google.android.libraries.lens.view.main.ac r4 = r1.f74679l
            r4.getClass()
            r6 = r4
            com.google.android.libraries.lens.view.main.bp r6 = (com.google.android.libraries.lens.view.main.C27326bp) r6
            com.google.android.libraries.lens.view.main.bq r7 = r6.f74752a
            boolean r8 = r7.f74765K
            if (r8 != 0) goto L_0x003d
            com.google.common.f.e r0 = com.google.android.libraries.lens.view.main.C27327bq.f74753a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "Attempt to execute intent while inactive"
            r3 = 49723(0xc23b, float:6.9677E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x003d:
            com.google.android.libraries.lens.view.z.a r7 = r7.f74821z
            java.lang.String r8 = r0.f68973b
            r7.mo33732c(r8)
            java.lang.String r7 = r0.f68973b
            int r8 = r7.hashCode()
            r14 = 4
            r16 = -1
            r10 = 2
            switch(r8) {
                case -1443093509: goto L_0x0102;
                case -1274492040: goto L_0x00f8;
                case -961247276: goto L_0x00ed;
                case -780714149: goto L_0x00e2;
                case -632460988: goto L_0x00d8;
                case -608018234: goto L_0x00ce;
                case -526584950: goto L_0x00c4;
                case -361853939: goto L_0x00b9;
                case 3059573: goto L_0x00af;
                case 684075221: goto L_0x00a4;
                case 1052832078: goto L_0x0099;
                case 1303338828: goto L_0x008d;
                case 1357047512: goto L_0x0081;
                case 1446317010: goto L_0x0075;
                case 1571573226: goto L_0x0069;
                case 1745385173: goto L_0x005e;
                case 1872767179: goto L_0x0053;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x010d
        L_0x0053:
            java.lang.String r8 = "save-to"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010d
            r7 = 1
            goto L_0x010e
        L_0x005e:
            java.lang.String r8 = "select-some-text"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010d
            r7 = 5
            goto L_0x010e
        L_0x0069:
            java.lang.String r8 = "translate-model"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010d
            r7 = 10
            goto L_0x010e
        L_0x0075:
            java.lang.String r8 = "math-editor"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010d
            r7 = 16
            goto L_0x010e
        L_0x0081:
            java.lang.String r8 = "translate-in-app"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010d
            r7 = 8
            goto L_0x010e
        L_0x008d:
            java.lang.String r8 = "document-scanner"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010d
            r7 = 12
            goto L_0x010e
        L_0x0099:
            java.lang.String r8 = "translate"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010d
            r7 = 7
            goto L_0x010e
        L_0x00a4:
            java.lang.String r8 = "change-language"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010d
            r7 = 9
            goto L_0x010e
        L_0x00af:
            java.lang.String r8 = "copy"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010d
            r7 = 3
            goto L_0x010e
        L_0x00b9:
            java.lang.String r8 = "cloud-copy"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010d
            r7 = 14
            goto L_0x010e
        L_0x00c4:
            java.lang.String r8 = "select-all-text"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010d
            r7 = 4
            goto L_0x010e
        L_0x00ce:
            java.lang.String r8 = "select-some-paragraph"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010d
            r7 = 6
            goto L_0x010e
        L_0x00d8:
            java.lang.String r8 = "connect-to-wifi"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010d
            r7 = 0
            goto L_0x010e
        L_0x00e2:
            java.lang.String r8 = "lens-request-retry"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010d
            r7 = 13
            goto L_0x010e
        L_0x00ed:
            java.lang.String r8 = "text-to-speech"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010d
            r7 = 15
            goto L_0x010e
        L_0x00f8:
            java.lang.String r8 = "filter"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010d
            r7 = 2
            goto L_0x010e
        L_0x0102:
            java.lang.String r8 = "lens-query-request"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010d
            r7 = 11
            goto L_0x010e
        L_0x010d:
            r7 = -1
        L_0x010e:
            java.lang.String r8 = "Unknown action target: %s"
            r18 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.String r12 = "android.intent.action.VIEW"
            java.lang.String r9 = "q"
            java.lang.String r13 = "tl"
            java.lang.String r11 = "sl"
            r15 = 32
            switch(r7) {
                case 0: goto L_0x08c8;
                case 1: goto L_0x0763;
                case 2: goto L_0x074e;
                case 3: goto L_0x073b;
                case 4: goto L_0x068b;
                case 5: goto L_0x05d1;
                case 6: goto L_0x04ed;
                case 7: goto L_0x04a3;
                case 8: goto L_0x0465;
                case 9: goto L_0x044e;
                case 10: goto L_0x0351;
                case 11: goto L_0x032b;
                case 12: goto L_0x0315;
                case 13: goto L_0x026c;
                case 14: goto L_0x021a;
                case 15: goto L_0x0191;
                case 16: goto L_0x0139;
                default: goto L_0x0120;
            }
        L_0x0120:
            com.google.common.f.e r2 = com.google.android.libraries.lens.view.main.C27327bq.f74753a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r3 = 49714(0xc232, float:6.9664E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r3 = "Unhandled action name: %s"
            java.lang.String r0 = r0.f68973b
            r2.mo56389s(r3, r0)
            return
        L_0x0139:
            com.google.android.libraries.lens.view.main.bq r2 = r6.f74752a
            com.google.android.libraries.lens.view.main.bl r2 = r2.f74787ag
            r2.getClass()
            com.google.android.libraries.lens.view.am.q r0 = r0.f68983l
            if (r0 != 0) goto L_0x0146
            com.google.android.libraries.lens.view.am.q r0 = com.google.android.libraries.lens.view.p2069am.C25341q.f68965d
        L_0x0146:
            com.google.android.libraries.lens.view.main.dt r2 = (com.google.android.libraries.lens.view.main.C27384dt) r2
            com.google.apps.tiktok.account.AccountId r3 = r2.f74989i
            java.lang.String r4 = r0.f68968b
            boolean r0 = r0.f68969c
            com.google.android.libraries.lens.view.ag.a.b r5 = com.google.android.libraries.lens.view.p2057ag.p2058a.C25099b.f68365c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.lens.view.ag.a.a r5 = (com.google.android.libraries.lens.view.p2057ag.p2058a.C25098a) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.libraries.lens.view.ag.a.b r6 = (com.google.android.libraries.lens.view.p2057ag.p2058a.C25099b) r6
            r4.getClass()
            r6.f68367a = r4
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            com.google.android.libraries.lens.view.ag.a.b r4 = (com.google.android.libraries.lens.view.p2057ag.p2058a.C25099b) r4
            r4.f68368b = r0
            com.google.protobuf.bv r0 = r5.build()
            com.google.android.libraries.lens.view.ag.a.b r0 = (com.google.android.libraries.lens.view.p2057ag.p2058a.C25099b) r0
            com.google.android.libraries.lens.view.ag.g r4 = new com.google.android.libraries.lens.view.ag.g
            r4.<init>()
            dagger.hilt.android.internal.managers.C68324h.m98669f(r4)
            com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.m84047b(r4, r3)
            com.google.apps.tiktok.inject.p3659d.C47243l.m84039a(r4, r0)
            r2.f74956az = r4
            com.google.android.libraries.lens.view.ag.g r0 = r2.f74956az
            if (r0 == 0) goto L_0x08ba
            com.google.android.libraries.lens.view.main.ai r2 = r2.f74987g
            android.support.v4.app.FragmentManager r2 = r2.getChildFragmentManager()
            java.lang.String r3 = "math_editor_fragment"
            r0.showNow(r2, r3)
            return
        L_0x0191:
            java.lang.String r2 = r0.f68980i
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x020b
            int r2 = r0.f68972a     // Catch:{ Exception -> 0x01fb }
            r2 = r2 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x01a6
            com.google.lens.j.eg r2 = r0.f68982k     // Catch:{ Exception -> 0x01fb }
            if (r2 != 0) goto L_0x01a8
            com.google.lens.j.eg r2 = com.google.lens.p4707j.C62511eg.f168775b     // Catch:{ Exception -> 0x01fb }
            goto L_0x01a8
        L_0x01a6:
            com.google.lens.j.eg r2 = com.google.lens.p4707j.C62511eg.f168775b     // Catch:{ Exception -> 0x01fb }
        L_0x01a8:
            r3 = r4
            com.google.android.libraries.lens.view.main.bp r3 = (com.google.android.libraries.lens.view.main.C27326bp) r3     // Catch:{ Exception -> 0x01fb }
            com.google.android.libraries.lens.view.main.bq r3 = r3.f74752a     // Catch:{ Exception -> 0x01fb }
            com.google.android.libraries.lens.view.textoverlay.e r3 = r3.f74768N     // Catch:{ Exception -> 0x01fb }
            java.lang.String r5 = r0.f68980i     // Catch:{ Exception -> 0x01fb }
            r6 = r3
            com.google.android.libraries.lens.view.textoverlay.l r6 = (com.google.android.libraries.lens.view.textoverlay.C28079l) r6     // Catch:{ Exception -> 0x01fb }
            com.google.common.base.ax r6 = r6.mo33533b()     // Catch:{ Exception -> 0x01fb }
            boolean r7 = r6.mo56113h()     // Catch:{ Exception -> 0x01fb }
            if (r7 == 0) goto L_0x01cc
            com.google.android.libraries.lens.view.textoverlay.l r3 = (com.google.android.libraries.lens.view.textoverlay.C28079l) r3     // Catch:{ Exception -> 0x01fb }
            com.google.android.libraries.lens.view.ax.p r3 = r3.f76414b     // Catch:{ Exception -> 0x01fb }
            java.lang.Object r6 = r6.mo56107c()     // Catch:{ Exception -> 0x01fb }
            com.google.bp.f.b.a.aw r6 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw) r6     // Catch:{ Exception -> 0x01fb }
            r3.mo30724a(r6, r2, r5)     // Catch:{ Exception -> 0x01fb }
            goto L_0x01ea
        L_0x01cc:
            r6 = r3
            com.google.android.libraries.lens.view.textoverlay.l r6 = (com.google.android.libraries.lens.view.textoverlay.C28079l) r6     // Catch:{ Exception -> 0x01fb }
            com.google.android.libraries.lens.view.d.g r6 = r6.f76418f     // Catch:{ Exception -> 0x01fb }
            java.lang.Object r6 = r6.mo3842a()     // Catch:{ Exception -> 0x01fb }
            com.google.common.base.ax r6 = (com.google.common.base.C58833ax) r6     // Catch:{ Exception -> 0x01fb }
            boolean r7 = r6.mo56113h()     // Catch:{ Exception -> 0x01fb }
            if (r7 == 0) goto L_0x01ea
            com.google.android.libraries.lens.view.textoverlay.l r3 = (com.google.android.libraries.lens.view.textoverlay.C28079l) r3     // Catch:{ Exception -> 0x01fb }
            com.google.android.libraries.lens.view.ax.p r3 = r3.f76414b     // Catch:{ Exception -> 0x01fb }
            java.lang.Object r6 = r6.mo56107c()     // Catch:{ Exception -> 0x01fb }
            com.google.bp.f.b.a.aw r6 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw) r6     // Catch:{ Exception -> 0x01fb }
            r3.mo30724a(r6, r2, r5)     // Catch:{ Exception -> 0x01fb }
        L_0x01ea:
            com.google.android.libraries.lens.view.main.bp r4 = (com.google.android.libraries.lens.view.main.C27326bp) r4     // Catch:{ Exception -> 0x01fb }
            com.google.android.libraries.lens.view.main.bq r2 = r4.f74752a     // Catch:{ Exception -> 0x01fb }
            com.google.android.libraries.lens.view.main.bl r2 = r2.f74787ag     // Catch:{ Exception -> 0x01fb }
            r2.getClass()
            java.lang.String r0 = r0.f68980i     // Catch:{ Exception -> 0x01fb }
            com.google.android.libraries.lens.view.main.dt r2 = (com.google.android.libraries.lens.view.main.C27384dt) r2     // Catch:{ Exception -> 0x01fb }
            r2.mo32947ai(r0, r10, r10)     // Catch:{ Exception -> 0x01fb }
            return
        L_0x01fb:
            r0 = move-exception
            com.google.common.f.e r2 = com.google.android.libraries.lens.view.main.C27327bq.f74753a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Listen action threw an error."
            r4 = 49721(0xc239, float:6.9674E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
            return
        L_0x020b:
            com.google.common.f.e r0 = com.google.android.libraries.lens.view.main.C27327bq.f74753a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "Chip ID not provided, ignoring listen action"
            r3 = 49722(0xc23a, float:6.9675E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x021a:
            com.google.android.libraries.lens.view.main.bq r2 = r6.f74752a
            com.google.android.libraries.lens.view.main.bl r2 = r2.f74787ag
            r2.getClass()
            com.google.lens.j.j r0 = r0.f68981j
            if (r0 != 0) goto L_0x0227
            com.google.lens.j.j r0 = com.google.lens.p4707j.C62576j.f168937e
        L_0x0227:
            com.google.android.libraries.lens.view.main.dt r2 = (com.google.android.libraries.lens.view.main.C27384dt) r2
            com.google.android.libraries.lens.view.main.ai r3 = r2.f74987g
            android.support.v4.app.FragmentManager r3 = r3.getChildFragmentManager()
            boolean r3 = r3.mo461ab()
            if (r3 == 0) goto L_0x0244
            com.google.common.f.e r0 = com.google.android.libraries.lens.view.main.C27384dt.f74877a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "Should not perform the commit after onSaveInstanceState."
            r3 = 49782(0xc276, float:6.976E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x0244:
            com.google.apps.tiktok.account.AccountId r3 = r2.f74989i
            com.google.android.libraries.lens.view.i.d r3 = com.google.android.libraries.lens.view.p2133i.C26932q.m49879e(r3, r0)
            dagger.a r4 = r2.f74983c
            java.lang.Object r4 = r4.mo27525b()
            android.support.v4.app.FragmentManager r4 = (android.support.p031v4.app.FragmentManager) r4
            java.lang.String r5 = "device_picker_fragment"
            r3.showNow(r4, r5)
            com.google.android.libraries.lens.view.i.q r3 = r3.mo17754z()
            com.google.android.libraries.lens.view.main.dy r4 = new com.google.android.libraries.lens.view.main.dy
            r4.<init>(r2, r0)
            r3.f73402q = r4
            com.google.android.libraries.lens.view.i.b r0 = r3.f73386a
            boolean r0 = r0.f73335b
            if (r0 == 0) goto L_0x08ba
            r3.mo32319d(r10)
            return
        L_0x026c:
            com.google.android.libraries.lens.view.main.bq r2 = r6.f74752a
            com.google.bp.f.b.a.be r0 = r0.f68978g
            if (r0 != 0) goto L_0x0274
            com.google.bp.f.b.a.be r0 = com.google.p4242bp.p4257f.p4260b.p4261a.C56251be.f149845d
        L_0x0274:
            boolean r4 = r2.f74765K
            if (r4 != 0) goto L_0x027a
            goto L_0x08ba
        L_0x027a:
            boolean r4 = r2.f74807l
            if (r4 == 0) goto L_0x029c
            com.google.android.libraries.lens.view.main.ae r0 = r2.f74816u
            com.google.android.libraries.lens.view.au.af r2 = r0.f74669b
            com.google.android.libraries.lens.view.au.ac r2 = r2.f69552b
            java.lang.Object r2 = r2.mo30656d()
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2
            boolean r3 = r2.mo56113h()
            if (r3 == 0) goto L_0x08ba
            com.google.android.libraries.lens.view.au.af r0 = r0.f74669b
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.libraries.lens.view.au.x r2 = (com.google.android.libraries.lens.view.p2081au.C25574x) r2
            r0.mo30609f(r2)
            return
        L_0x029c:
            com.google.android.libraries.lens.view.au.y r4 = r2.f74819x
            com.google.android.libraries.lens.view.au.s r4 = r4.mo30607d()
            java.lang.Object r4 = r4.mo30656d()
            com.google.common.base.ax r4 = (com.google.common.base.C58833ax) r4
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x08ba
            com.google.android.libraries.lens.view.au.y r4 = r2.f74819x
            com.google.android.libraries.lens.view.au.s r4 = r4.mo30606b()
            java.lang.Object r4 = r4.mo30656d()
            com.google.common.base.ax r4 = (com.google.common.base.C58833ax) r4
            boolean r4 = r4.mo56113h()
            com.google.lens.j.ds r5 = com.google.lens.p4707j.C62496ds.f168723e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.lens.j.dq r5 = (com.google.lens.p4707j.C62494dq) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.lens.j.ds r6 = (com.google.lens.p4707j.C62496ds) r6
            int r7 = r6.f168725a
            r7 = r7 | r10
            r6.f168725a = r7
            r6.f168727c = r4
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.lens.j.ds r6 = (com.google.lens.p4707j.C62496ds) r6
            r6.f168726b = r14
            int r7 = r6.f168725a
            r3 = r3 | r7
            r6.f168725a = r3
            com.google.protobuf.bv r3 = r5.build()
            com.google.lens.j.ds r3 = (com.google.lens.p4707j.C62496ds) r3
            com.google.android.libraries.lens.view.main.ae r5 = r2.f74816u
            com.google.bp.f.b.a.aa r6 = com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa.f149748b
            r5.mo32847x(r3, r6)
            if (r4 == 0) goto L_0x08ba
            com.google.android.libraries.lens.view.gleam.cj r3 = r2.f74767M
            boolean r3 = r3.mo31776l()
            if (r3 == 0) goto L_0x030f
            com.google.common.base.ax r3 = r2.f74791ak
            boolean r3 = r3.mo56113h()
            if (r3 == 0) goto L_0x030f
            com.google.common.base.ax r0 = r2.f74791ak
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.libraries.lens.view.session.bm r0 = (com.google.android.libraries.lens.view.session.C27777bm) r0
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            r2.mo32889u(r0, r3)
            return
        L_0x030f:
            com.google.android.libraries.lens.view.main.ae r2 = r2.f74816u
            r2.mo32844u(r0)
            return
        L_0x0315:
            com.google.android.libraries.lens.view.main.bq r2 = r6.f74752a
            com.google.android.libraries.lens.view.session.n r3 = r2.f74776V
            com.google.android.libraries.lens.view.main.ae r2 = r2.f74816u
            com.google.android.libraries.lens.view.at.p r2 = r2.f74680m
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90833j(r2)
            java.lang.Object r2 = r2.mo56111f()
            com.google.android.libraries.lens.view.at.p r2 = (com.google.android.libraries.lens.view.p2078at.C25533p) r2
            r3.mo33303a(r0, r2)
            return
        L_0x032b:
            int r2 = r0.f68972a
            r2 = r2 & r15
            if (r2 == 0) goto L_0x08ba
            com.google.android.libraries.lens.view.main.bq r2 = r6.f74752a
            com.google.android.libraries.lens.view.af.av r3 = r2.f74813r
            com.google.android.libraries.lens.view.session.ax r4 = r2.f74778X
            android.content.Context r2 = r2.f74800e
            com.google.common.o.aac r2 = com.google.android.libraries.lens.view.utils.C28137z.m52436b(r2, r5)
            com.google.common.o.uf r2 = r4.mo33230a(r2)
            r3.mo30241a(r2)
            com.google.android.libraries.lens.view.main.bq r2 = r6.f74752a
            com.google.android.libraries.lens.view.main.ae r2 = r2.f74816u
            com.google.bp.f.b.a.be r0 = r0.f68978g
            if (r0 != 0) goto L_0x034d
            com.google.bp.f.b.a.be r0 = com.google.p4242bp.p4257f.p4260b.p4261a.C56251be.f149845d
        L_0x034d:
            r2.mo32844u(r0)
            return
        L_0x0351:
            java.lang.String r2 = r0.f68980i
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x043f
            int r2 = r0.f68972a
            r2 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0430
            com.google.lens.j.x r2 = r0.f68985n
            if (r2 != 0) goto L_0x0365
            com.google.lens.j.x r2 = com.google.lens.p4707j.C62590x.f168982b
        L_0x0365:
            com.google.protobuf.cq r2 = r2.f168984a
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.libraries.lens.view.main.an r4 = com.google.android.libraries.lens.view.main.C27297an.f74707a
            j$.util.stream.Stream r2 = r2.filter(r4)
            j$.util.Optional r2 = r2.findFirst()
            com.google.android.libraries.lens.view.main.ao r4 = com.google.android.libraries.lens.view.main.C27298ao.f74708a
            j$.util.Optional r2 = r2.map(r4)
            boolean r4 = r2.isPresent()
            if (r4 == 0) goto L_0x0421
            java.lang.String r4 = r0.f68974c
            int r7 = r4.hashCode()
            r9 = -1367724422(0xffffffffae7a2e7a, float:-5.68847E-11)
            if (r7 == r9) goto L_0x03aa
            r9 = -934610812(0xffffffffc84af884, float:-207842.06)
            if (r7 == r9) goto L_0x03a0
            r9 = 1427818632(0x551ac888, float:1.06366291E13)
            if (r7 == r9) goto L_0x0397
            goto L_0x03b4
        L_0x0397:
            java.lang.String r7 = "download"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x03b4
            goto L_0x03b5
        L_0x03a0:
            java.lang.String r5 = "remove"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x03b4
            r5 = 1
            goto L_0x03b5
        L_0x03aa:
            java.lang.String r5 = "cancel"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x03b4
            r5 = 2
            goto L_0x03b5
        L_0x03b4:
            r5 = -1
        L_0x03b5:
            if (r5 == 0) goto L_0x03e6
            if (r5 == r3) goto L_0x03d8
            if (r5 == r10) goto L_0x03c8
            com.google.common.f.e r0 = com.google.android.libraries.lens.view.main.C27327bq.f74753a
            com.google.common.f.x r0 = r0.mo56225c()
            r2 = 49717(0xc235, float:6.9668E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r8, r4)
            return
        L_0x03c8:
            com.google.android.libraries.lens.view.main.bq r0 = r6.f74752a
            com.google.android.libraries.lens.view.filters.translation.ax r0 = r0.f74817v
            java.lang.Object r2 = r2.get()
            java.util.Locale r2 = (java.util.Locale) r2
            com.google.android.libraries.lens.view.d.m r0 = r0.f70834x
            r0.mo5706i(r2)
            return
        L_0x03d8:
            com.google.android.libraries.lens.view.main.bq r0 = r6.f74752a
            com.google.android.libraries.lens.view.filters.translation.ax r0 = r0.f74817v
            java.lang.Object r2 = r2.get()
            java.util.Locale r2 = (java.util.Locale) r2
            r0.mo31261p(r2)
            return
        L_0x03e6:
            com.google.android.libraries.lens.view.main.bq r3 = r6.f74752a
            com.google.android.libraries.lens.view.filters.translation.ax r3 = r3.f74817v
            java.lang.Object r4 = r2.get()
            java.util.Locale r4 = (java.util.Locale) r4
            java.lang.String r0 = r0.f68980i
            com.google.android.libraries.lens.view.d.g r3 = r3.f70829s
            com.google.android.libraries.lens.view.filters.translation.k r5 = com.google.android.libraries.lens.view.filters.translation.C26129l.m48226e()
            r7 = r5
            com.google.android.libraries.lens.view.filters.translation.b r7 = (com.google.android.libraries.lens.view.filters.translation.C26062b) r7
            r7.f70837a = r0
            r7.f70838b = r4
            com.google.android.libraries.lens.view.filters.translation.l r0 = r5.mo31270a()
            r0.getClass()
            r3.mo5708l(r0)
            com.google.android.libraries.lens.view.main.bq r0 = r6.f74752a
            com.google.android.libraries.lens.view.filters.translation.ax r0 = r0.f74817v
            java.lang.Object r2 = r2.get()
            java.util.Locale r2 = (java.util.Locale) r2
            boolean r3 = r0.mo31266u(r2)
            if (r3 == 0) goto L_0x08ba
            java.util.Locale r2 = com.google.android.libraries.lens.view.utils.C28136y.m52434e(r2)
            r0.mo31260o(r2)
            return
        L_0x0421:
            com.google.common.f.e r0 = com.google.android.libraries.lens.view.main.C27327bq.f74753a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "Invalid language pack (no non-English language), ignoring download action."
            r3 = 49718(0xc236, float:6.967E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x0430:
            com.google.common.f.e r0 = com.google.android.libraries.lens.view.main.C27327bq.f74753a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "Download Language data not provided, ignoring download action"
            r3 = 49719(0xc237, float:6.9671E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x043f:
            com.google.common.f.e r0 = com.google.android.libraries.lens.view.main.C27327bq.f74753a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "Chip ID not provided, ignoring download action"
            r3 = 49720(0xc238, float:6.9673E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x044e:
            com.google.android.libraries.lens.view.main.bq r0 = r6.f74752a
            com.google.android.libraries.lens.view.main.bl r0 = r0.f74787ag
            r0.getClass()
            com.google.android.libraries.lens.view.main.dt r0 = (com.google.android.libraries.lens.view.main.C27384dt) r0
            com.google.apps.tiktok.account.AccountId r2 = r0.f74989i
            dagger.a r0 = r0.f74983c
            java.lang.Object r0 = r0.mo27525b()
            android.support.v4.app.FragmentManager r0 = (android.support.p031v4.app.FragmentManager) r0
            com.google.android.libraries.lens.view.filters.translation.C26104co.m48174d(r2, r0, r5)
            return
        L_0x0465:
            com.google.android.libraries.lens.view.main.bq r2 = r6.f74752a
            java.lang.String r0 = r0.f68974c
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            java.lang.String r4 = "googletranslate"
            android.net.Uri$Builder r3 = r3.scheme(r4)
            java.lang.String r4 = ""
            android.net.Uri$Builder r3 = r3.authority(r4)
            java.lang.String r4 = "/open"
            android.net.Uri$Builder r3 = r3.path(r4)
            java.lang.String r4 = r2.mo32876g()
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r11, r4)
            java.lang.String r4 = r2.mo32877h()
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r13, r4)
            android.net.Uri$Builder r0 = r3.appendQueryParameter(r9, r0)
            android.net.Uri r0 = r0.build()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r12, r0)
            com.google.android.libraries.lens.view.at.t r0 = r2.f74801f
            r0.mo30556f(r3)
            return
        L_0x04a3:
            com.google.android.libraries.lens.view.main.bq r4 = r6.f74752a
            java.lang.String r0 = r0.f68974c
            android.net.Uri$Builder r5 = new android.net.Uri$Builder
            r5.<init>()
            java.lang.String r6 = "https"
            android.net.Uri$Builder r5 = r5.scheme(r6)
            java.lang.String r6 = "translate.google.com"
            android.net.Uri$Builder r5 = r5.authority(r6)
            java.lang.String r6 = "/m/translate"
            android.net.Uri$Builder r5 = r5.path(r6)
            java.lang.String r6 = r4.mo32876g()
            android.net.Uri$Builder r5 = r5.appendQueryParameter(r11, r6)
            java.lang.String r6 = r4.mo32877h()
            android.net.Uri$Builder r5 = r5.appendQueryParameter(r13, r6)
            android.net.Uri$Builder r0 = r5.appendQueryParameter(r9, r0)
            android.net.Uri r0 = r0.build()
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r12, r0)
            android.content.Context r0 = r4.f74800e     // Catch:{ NameNotFoundException -> 0x04e7 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x04e7 }
            r0.getPackageInfo(r2, r3)     // Catch:{ NameNotFoundException -> 0x04e7 }
            r5.setPackage(r2)
        L_0x04e7:
            com.google.android.libraries.lens.view.at.t r0 = r4.f74801f
            r0.mo30556f(r5)
            return
        L_0x04ed:
            com.google.android.libraries.lens.view.main.bq r0 = r6.f74752a
            android.graphics.PointF r2 = com.google.android.libraries.lens.view.main.C27327bq.f74754b
            com.google.android.libraries.lens.view.bb.e r4 = r0.f74786af
            com.google.common.base.ax r4 = r4.mo30800b()
            boolean r6 = r4.mo56113h()
            if (r6 == 0) goto L_0x0509
            com.google.android.libraries.lens.view.bb.e r2 = r0.f74786af
            java.lang.Object r4 = r4.mo56107c()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            android.graphics.PointF r2 = r2.mo30799a(r4)
        L_0x0509:
            com.google.android.libraries.lens.view.textoverlay.e r0 = r0.f74768N
            r0.getClass()
            com.google.android.libraries.lens.view.textoverlay.l r0 = (com.google.android.libraries.lens.view.textoverlay.C28079l) r0
            com.google.android.libraries.lens.view.d.g r4 = r0.f76418f
            java.lang.Object r4 = r4.mo3842a()
            com.google.common.base.ax r4 = (com.google.common.base.C58833ax) r4
            boolean r6 = r4.mo56113h()
            if (r6 != 0) goto L_0x052d
            com.google.common.f.a.d r0 = com.google.android.libraries.lens.view.textoverlay.C28079l.f76413a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "'selectCentermostParagraph' has no effect because model.selectableWords() is not present"
            r3 = 50191(0xc40f, float:7.0333E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x052d:
            java.lang.Object r4 = r4.mo56107c()
            com.google.bp.f.b.a.aw r4 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw) r4
            com.google.protobuf.cq r4 = r4.f149801a
            java.util.Iterator r4 = r4.iterator()
            r6 = -1
            r7 = -1
            r8 = 0
        L_0x053c:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x059c
            java.lang.Object r9 = r4.next()
            com.google.bp.f.b.a.ap r9 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap) r9
            com.google.protobuf.cq r9 = r9.f149783b
            java.util.Iterator r9 = r9.iterator()
            r11 = r8
            r12 = r11
            r10 = 0
        L_0x0551:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x0594
            java.lang.Object r13 = r9.next()
            com.google.bp.f.b.a.an r13 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56233an) r13
            com.google.protobuf.cq r13 = r13.f149778b
            java.util.Iterator r13 = r13.iterator()
        L_0x0563:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0551
            java.lang.Object r11 = r13.next()
            com.google.bp.f.b.a.av r11 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56241av) r11
            com.google.bp.f.b.a.ae r11 = r11.f149797e
            if (r11 != 0) goto L_0x0575
            com.google.bp.f.b.a.ae r11 = com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae.f149753h
        L_0x0575:
            android.graphics.PointF r11 = com.google.android.libraries.lens.view.p2177w.C28185a.m52683a(r11)
            float r11 = com.google.android.libraries.lens.common.p1998a.C24094b.m44752a(r11, r2)
            int r14 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r14 >= 0) goto L_0x0583
            r14 = 0
            goto L_0x0584
        L_0x0583:
            r14 = 1
        L_0x0584:
            r14 = r14 ^ r3
            r10 = r10 | r14
            int r14 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r14 >= 0) goto L_0x058c
            r18 = r11
        L_0x058c:
            int r11 = r12 + 1
            r19 = r12
            r12 = r11
            r11 = r19
            goto L_0x0563
        L_0x0594:
            if (r3 != r10) goto L_0x0597
            r7 = r11
        L_0x0597:
            if (r3 != r10) goto L_0x059a
            r6 = r8
        L_0x059a:
            r8 = r12
            goto L_0x053c
        L_0x059c:
            if (r6 >= 0) goto L_0x05a0
            if (r7 < 0) goto L_0x08ba
        L_0x05a0:
            com.google.android.libraries.lens.view.am.l r2 = com.google.android.libraries.lens.view.p2069am.C25336l.f68957d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.lens.view.am.j r2 = (com.google.android.libraries.lens.view.p2069am.C25334j) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.lens.view.am.l r3 = (com.google.android.libraries.lens.view.p2069am.C25336l) r3
            r3.f68959a = r6
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.lens.view.am.l r3 = (com.google.android.libraries.lens.view.p2069am.C25336l) r3
            r3.f68960b = r7
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.libraries.lens.view.am.l r2 = (com.google.android.libraries.lens.view.p2069am.C25336l) r2
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            r0.mo33541h(r2)
            com.google.common.base.bk r2 = (com.google.common.base.C58847bk) r2
            java.lang.Object r2 = r2.f156646a
            com.google.android.libraries.lens.view.am.l r2 = (com.google.android.libraries.lens.view.p2069am.C25336l) r2
            r0.mo33538e(r2)
            return
        L_0x05d1:
            com.google.android.libraries.lens.view.main.bq r0 = r6.f74752a
            com.google.android.libraries.lens.view.textoverlay.e r0 = r0.f74768N
            com.google.android.libraries.lens.view.textoverlay.l r0 = (com.google.android.libraries.lens.view.textoverlay.C28079l) r0
            com.google.android.libraries.lens.view.d.g r2 = r0.f76418f
            java.lang.Object r2 = r2.mo3842a()
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2
            boolean r3 = r2.mo56113h()
            if (r3 != 0) goto L_0x05f4
            com.google.common.f.a.d r0 = com.google.android.libraries.lens.view.textoverlay.C28079l.f76413a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "'selectCentermostWord' has no effect because model.selectableWords() is not present"
            r3 = 50190(0xc40e, float:7.0331E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x05f4:
            android.graphics.PointF r3 = new android.graphics.PointF
            r4 = 1056964608(0x3f000000, float:0.5)
            r3.<init>(r4, r4)
            java.lang.Object r2 = r2.mo56107c()
            com.google.bp.f.b.a.aw r2 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw) r2
            com.google.protobuf.cq r2 = r2.f149801a
            java.util.Iterator r2 = r2.iterator()
            r4 = -1
        L_0x0608:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0658
            java.lang.Object r6 = r2.next()
            com.google.bp.f.b.a.ap r6 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap) r6
            com.google.protobuf.cq r6 = r6.f149783b
            java.util.Iterator r6 = r6.iterator()
        L_0x061a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0608
            java.lang.Object r7 = r6.next()
            com.google.bp.f.b.a.an r7 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56233an) r7
            com.google.protobuf.cq r7 = r7.f149778b
            java.util.Iterator r7 = r7.iterator()
        L_0x062c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x061a
            java.lang.Object r8 = r7.next()
            com.google.bp.f.b.a.av r8 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56241av) r8
            com.google.bp.f.b.a.ae r8 = r8.f149797e
            if (r8 != 0) goto L_0x063e
            com.google.bp.f.b.a.ae r8 = com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae.f149753h
        L_0x063e:
            android.graphics.PointF r8 = com.google.android.libraries.lens.view.p2177w.C28185a.m52683a(r8)
            float r8 = com.google.android.libraries.lens.common.p1998a.C24094b.m44752a(r8, r3)
            int r9 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r9 >= 0) goto L_0x064c
            r9 = r8
            goto L_0x064e
        L_0x064c:
            r9 = r18
        L_0x064e:
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 >= 0) goto L_0x0653
            r4 = r5
        L_0x0653:
            int r5 = r5 + 1
            r18 = r9
            goto L_0x062c
        L_0x0658:
            if (r4 < 0) goto L_0x08ba
            com.google.android.libraries.lens.view.am.l r2 = com.google.android.libraries.lens.view.p2069am.C25336l.f68957d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.lens.view.am.j r2 = (com.google.android.libraries.lens.view.p2069am.C25334j) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.lens.view.am.l r3 = (com.google.android.libraries.lens.view.p2069am.C25336l) r3
            r3.f68959a = r4
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.lens.view.am.l r3 = (com.google.android.libraries.lens.view.p2069am.C25336l) r3
            r3.f68960b = r4
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.libraries.lens.view.am.l r2 = (com.google.android.libraries.lens.view.p2069am.C25336l) r2
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            r0.mo33541h(r2)
            com.google.common.base.bk r2 = (com.google.common.base.C58847bk) r2
            java.lang.Object r2 = r2.f156646a
            com.google.android.libraries.lens.view.am.l r2 = (com.google.android.libraries.lens.view.p2069am.C25336l) r2
            r0.mo33538e(r2)
            return
        L_0x068b:
            com.google.android.libraries.lens.view.main.bq r0 = r6.f74752a
            com.google.android.libraries.lens.view.textoverlay.e r0 = r0.f74768N
            com.google.android.libraries.lens.view.textoverlay.l r0 = (com.google.android.libraries.lens.view.textoverlay.C28079l) r0
            com.google.android.libraries.lens.view.d.g r2 = r0.f76418f
            java.lang.Object r2 = r2.mo3842a()
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2
            boolean r3 = r2.mo56113h()
            if (r3 != 0) goto L_0x06ae
            com.google.common.f.a.d r0 = com.google.android.libraries.lens.view.textoverlay.C28079l.f76413a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "'Select All' has no effect because model.selectableWords() is not present"
            r3 = 50189(0xc40d, float:7.033E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x06ae:
            java.lang.Object r2 = r2.mo56107c()
            com.google.bp.f.b.a.aw r2 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw) r2
            com.google.protobuf.cq r2 = r2.f149801a
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L_0x06bb:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x06e1
            java.lang.Object r4 = r2.next()
            com.google.bp.f.b.a.ap r4 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap) r4
            com.google.protobuf.cq r4 = r4.f149783b
            java.util.Iterator r4 = r4.iterator()
        L_0x06cd:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x06bb
            java.lang.Object r6 = r4.next()
            com.google.bp.f.b.a.an r6 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56233an) r6
            com.google.protobuf.cq r6 = r6.f149778b
            int r6 = r6.size()
            int r3 = r3 + r6
            goto L_0x06cd
        L_0x06e1:
            if (r3 > 0) goto L_0x06f2
            com.google.common.f.a.d r0 = com.google.android.libraries.lens.view.textoverlay.C28079l.f76413a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "'Select All' has no effect because there is fewer than one word selected (%d)"
            r4 = 50188(0xc40c, float:7.0328E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r4)).mo56387q(r2, r3)
            return
        L_0x06f2:
            int r3 = r3 + -1
            com.google.common.f.a.d r2 = com.google.android.libraries.lens.view.textoverlay.C28079l.f76413a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            r4 = 50187(0xc40b, float:7.0327E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            java.lang.String r4 = "Select All is selecting word range: [%d, %d]"
            r2.mo56393w(r4, r5, r3)
            com.google.android.libraries.lens.view.am.l r2 = com.google.android.libraries.lens.view.p2069am.C25336l.f68957d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.lens.view.am.j r2 = (com.google.android.libraries.lens.view.p2069am.C25334j) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.libraries.lens.view.am.l r4 = (com.google.android.libraries.lens.view.p2069am.C25336l) r4
            r4.f68959a = r5
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.libraries.lens.view.am.l r4 = (com.google.android.libraries.lens.view.p2069am.C25336l) r4
            r4.f68960b = r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.libraries.lens.view.am.l r2 = (com.google.android.libraries.lens.view.p2069am.C25336l) r2
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            r0.mo33541h(r2)
            com.google.common.base.bk r2 = (com.google.common.base.C58847bk) r2
            java.lang.Object r2 = r2.f156646a
            com.google.android.libraries.lens.view.am.l r2 = (com.google.android.libraries.lens.view.p2069am.C25336l) r2
            r0.mo33538e(r2)
            return
        L_0x073b:
            com.google.android.libraries.lens.view.main.bq r2 = r6.f74752a
            java.lang.String r0 = r0.f68974c
            java.util.concurrent.Executor r3 = r2.f74811p
            com.google.android.libraries.lens.view.main.aj r4 = new com.google.android.libraries.lens.view.main.aj
            r4.<init>(r2, r0)
            java.lang.Runnable r0 = com.google.apps.tiktok.tracing.C47810es.m84977q(r4)
            r3.execute(r0)
            return
        L_0x074e:
            java.lang.String r0 = r0.f68974c
            int r0 = java.lang.Integer.parseInt(r0)
            com.google.bp.f.b.a.df r0 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.m87964a(r0)
            com.google.android.libraries.lens.view.main.bq r2 = r6.f74752a
            com.google.android.libraries.lens.view.main.bl r2 = r2.f74787ag
            r2.getClass()
            r2.mo32862l(r0, r5)
            return
        L_0x0763:
            java.lang.String r2 = r0.f68974c
            java.lang.String r4 = "keep"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0771
            java.lang.String r15 = "com.google.android.keep"
            goto L_0x088a
        L_0x0771:
            java.lang.String r4 = "share-translate"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0881
            com.google.android.libraries.lens.view.main.bq r0 = r6.f74752a
            com.google.android.libraries.lens.view.ak.bd r2 = r0.f74773S
            com.google.android.libraries.lens.view.ak.ca r2 = r2.mo30351g()
            com.google.android.libraries.lens.view.ak.bd r4 = r0.f74773S
            com.google.protobuf.bn r6 = r2.toBuilder()
            com.google.android.libraries.lens.view.ak.bz r6 = (com.google.android.libraries.lens.view.p2067ak.C25247bz) r6
            int r2 = r2.f68712a
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.libraries.lens.view.ak.ca r7 = (com.google.android.libraries.lens.view.p2067ak.C25249ca) r7
            int r2 = r2 + r3
            r7.f68712a = r2
            com.google.protobuf.bv r2 = r6.build()
            com.google.android.libraries.lens.view.ak.ca r2 = (com.google.android.libraries.lens.view.p2067ak.C25249ca) r2
            com.google.android.libraries.lens.view.ak.bt r4 = r4.f68662a
            com.google.android.libraries.lens.view.ak.an r6 = new com.google.android.libraries.lens.view.ak.an
            r6.<init>(r2)
            r4.mo30363c(r6)
            android.content.Context r2 = r0.f74800e
            r4 = 2132089013(0x7f1518b5, float:1.9818326E38)
            java.lang.String r2 = r2.getString(r4)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "\nhttps://g.co/lenstranslate"
            java.lang.String r16 = r2.concat(r4)
            com.google.android.libraries.lens.view.filecache.c r11 = r0.f74814s
            com.google.android.libraries.lens.view.main.bl r0 = r0.f74787ag
            r0.getClass()
            com.google.android.libraries.lens.view.main.dt r0 = (com.google.android.libraries.lens.view.main.C27384dt) r0
            com.google.android.libraries.lens.view.frozenimage.d r2 = r0.f74922aR
            r2.getClass()
            android.view.View r2 = r2.getView()
            r2.getClass()
            r4 = 2131430641(0x7f0b0cf1, float:1.8482989E38)
            android.view.View r2 = r2.findViewById(r4)
            int[] r4 = new int[r10]
            r2.getLocationOnScreen(r4)
            r3 = r4[r3]
            com.google.android.libraries.lens.view.frozenimage.d r4 = r0.f74922aR
            com.google.android.libraries.lens.view.frozenimage.q r4 = r4.mo17754z()
            com.google.android.libraries.lens.view.frozenimage.g r4 = r4.f71426b
            com.google.android.libraries.lens.view.d.g r4 = r4.f71413c
            java.lang.Object r4 = r4.mo3842a()
            com.google.common.base.ax r4 = (com.google.common.base.C58833ax) r4
            boolean r6 = r4.mo56113h()
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x07fc
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.libraries.lens.view.at.ax r4 = (com.google.android.libraries.lens.view.p2078at.C25518ax) r4
            float r4 = r4.f69480b
            goto L_0x07fe
        L_0x07fc:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x07fe:
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0806
            int r3 = java.lang.Math.max(r3, r5)
        L_0x0806:
            com.google.android.libraries.lens.view.main.LensOverlayLayout r4 = r0.f74918aN
            int r6 = r4.getWidth()
            android.content.Context r7 = r0.f75000t
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131169412(0x7f071084, float:1.7953153E38)
            int r7 = r7.getDimensionPixelSize(r8)
            int r2 = r2.getHeight()
            int r2 = r2 + r7
            int r2 = r2 + r3
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r6, r2, r7)
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r7)
            com.google.android.libraries.lens.view.gleam.cj r9 = r0.mo32956u()
            com.google.android.libraries.lens.view.gleam.fh r10 = com.google.android.libraries.lens.view.gleam.C26588fh.NO_SCRIM
            r9.mo31774j(r10)
            r4.draw(r8)
            com.google.android.libraries.lens.view.gleam.cj r4 = r0.mo32956u()
            com.google.android.libraries.lens.view.gleam.fh r8 = com.google.android.libraries.lens.view.gleam.C26588fh.DARK_SCRIM
            r4.mo31774j(r8)
            if (r3 <= 0) goto L_0x0843
            int r2 = r2 - r3
            goto L_0x0844
        L_0x0843:
            r3 = 0
        L_0x0844:
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r7, r5, r3, r6, r2)
            android.content.Context r0 = r0.f75000t
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r3 = 2131626830(0x7f0e0b4e, float:1.8880907E38)
            r4 = 0
            android.view.View r0 = r0.inflate(r3, r4)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
            r4 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r4)
            r0.measure(r3, r4)
            r0.layout(r5, r5, r6, r2)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r12)
            r0.draw(r2)
            com.google.android.libraries.lens.view.at.y r13 = com.google.android.libraries.lens.view.p2078at.C25542y.JPEG
            r14 = 80
            r15 = 0
            r17 = 0
            com.google.common.util.concurrent.cx r0 = r11.mo30985a(r12, r13, r14, r15, r16, r17)
            com.google.android.libraries.lens.view.main.C27327bq.m50890p(r0)
            return
        L_0x0881:
            java.lang.String r3 = "share"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x08bb
            r15 = 0
        L_0x088a:
            com.google.android.libraries.lens.view.main.bq r2 = r6.f74752a
            java.lang.String r3 = r0.f68975d
            java.lang.String r0 = r0.f68976e
            com.google.android.libraries.lens.view.main.ae r4 = r2.f74816u
            com.google.android.libraries.lens.view.at.p r4 = r4.f74680m
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90833j(r4)
            boolean r5 = r4.mo56113h()
            if (r5 == 0) goto L_0x08ba
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.libraries.lens.view.at.p r4 = (com.google.android.libraries.lens.view.p2078at.C25533p) r4
            com.google.common.util.concurrent.cx r4 = r4.mo30572d()
            com.google.android.libraries.lens.view.main.as r5 = new com.google.android.libraries.lens.view.main.as
            r5.<init>(r2, r3, r0, r15)
            java.util.concurrent.Executor r0 = r2.f74779Y
            com.google.common.util.concurrent.s r2 = com.google.apps.tiktok.tracing.C47810es.m84966f(r5)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r4, r2, r0)
            com.google.android.libraries.lens.view.main.C27327bq.m50890p(r0)
        L_0x08ba:
            return
        L_0x08bb:
            com.google.common.f.e r0 = com.google.android.libraries.lens.view.main.C27327bq.f74753a
            com.google.common.f.x r0 = r0.mo56225c()
            r3 = 49716(0xc234, float:6.9667E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r8, r2)
            return
        L_0x08c8:
            java.lang.String r2 = r0.f68976e     // Catch:{ ct -> 0x0ba4 }
            byte[] r2 = r2.getBytes()     // Catch:{ ct -> 0x0ba4 }
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0ba4 }
            com.google.bk.c.a.d r7 = com.google.p4215bk.p4220c.p4221a.C56054d.f149359d     // Catch:{ ct -> 0x0ba4 }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r7, (byte[]) r2, (com.google.protobuf.C62921ba) r4)     // Catch:{ ct -> 0x0ba4 }
            com.google.bk.c.a.d r2 = (com.google.p4215bk.p4220c.p4221a.C56054d) r2     // Catch:{ ct -> 0x0ba4 }
            com.google.android.libraries.barhopper.Barcode$WiFi r4 = new com.google.android.libraries.barhopper.Barcode$WiFi
            r4.<init>()
            java.lang.String r0 = r2.f149361a
            r4.ssid = r0
            int r0 = r2.f149362b
            int r0 = com.google.p4215bk.p4220c.p4221a.C56053c.m87891a(r0)
            if (r0 != 0) goto L_0x08ec
            r0 = 1
        L_0x08ec:
            int r0 = r0 + -1
            r4.encryptionType = r0
            java.lang.String r0 = r2.f149363c
            r4.password = r0
            com.google.android.libraries.lens.view.main.bq r0 = r6.f74752a
            android.content.Context r0 = r0.f74800e
            java.lang.Class<android.net.wifi.WifiManager> r2 = android.net.wifi.WifiManager.class
            java.lang.Object r2 = androidx.core.content.C1878d.m5129b(r0, r2)
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2
            com.google.android.libraries.lens.view.main.bq r7 = r6.f74752a
            com.google.android.libraries.ba.b.a.a.a r8 = r7.f74815t
            com.google.android.libraries.ba.a.a.a.a r9 = new com.google.android.libraries.ba.a.a.a.a
            android.content.Context r7 = r7.f74800e
            r9.<init>(r7, r8)
            if (r2 != 0) goto L_0x091d
            com.google.android.libraries.ba.a.a.a r0 = new com.google.android.libraries.ba.a.a.a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = r4.ssid
            r2[r5] = r3
            r3 = 2132091752(0x7f152368, float:1.9823881E38)
            r0.<init>(r8, r3, r2)
            goto L_0x0b8e
        L_0x091d:
            java.lang.String r7 = "android.permission.CHANGE_WIFI_STATE"
            int r0 = androidx.core.content.C1882h.m5137c(r0, r7)
            if (r0 == 0) goto L_0x0935
            com.google.android.libraries.ba.a.a.a r0 = new com.google.android.libraries.ba.a.a.a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = r4.ssid
            r2[r5] = r3
            r3 = 2132091751(0x7f152367, float:1.982388E38)
            r0.<init>(r8, r3, r2)
            goto L_0x0b8e
        L_0x0935:
            int r0 = r4.encryptionType
            if (r0 == r3) goto L_0x0960
            if (r0 == r10) goto L_0x0959
            r7 = 3
            if (r0 == r7) goto L_0x0952
            com.google.android.libraries.ba.c.a.c r7 = com.google.android.libraries.p1657ba.p1664c.p1665a.C19646c.f54650a
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r5] = r0
            java.lang.Class<com.google.android.libraries.ba.a.a.c> r0 = com.google.android.libraries.p1657ba.p1658a.p1659a.C19639c.class
            java.lang.String r12 = "Unexpected barcodeWiFiInt: %s"
            r7.mo24967a(r0, r12, r11)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x0966
        L_0x0952:
            com.google.android.libraries.ba.a.a r0 = com.google.android.libraries.p1657ba.p1658a.C19635a.WEP
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0966
        L_0x0959:
            com.google.android.libraries.ba.a.a r0 = com.google.android.libraries.p1657ba.p1658a.C19635a.WPA
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0966
        L_0x0960:
            com.google.android.libraries.ba.a.a r0 = com.google.android.libraries.p1657ba.p1658a.C19635a.OPEN
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
        L_0x0966:
            boolean r7 = r0.mo56113h()
            if (r7 != 0) goto L_0x097c
            com.google.android.libraries.ba.a.a.a r0 = new com.google.android.libraries.ba.a.a.a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = r4.ssid
            r2[r5] = r3
            r3 = 2132091750(0x7f152366, float:1.9823877E38)
            r0.<init>(r8, r3, r2)
            goto L_0x0b8e
        L_0x097c:
            com.google.android.libraries.ba.a.c r7 = new com.google.android.libraries.ba.a.c     // Catch:{ b -> 0x0b2d }
            r7.<init>()     // Catch:{ b -> 0x0b2d }
            java.lang.String r11 = r4.ssid     // Catch:{ b -> 0x0b2d }
            java.lang.String r11 = com.google.common.base.C58837ba.m90858g(r11)     // Catch:{ b -> 0x0b2d }
            r7.f54642a = r11     // Catch:{ b -> 0x0b2d }
            java.lang.String r11 = r4.password     // Catch:{ b -> 0x0b2d }
            java.lang.String r11 = com.google.common.base.C58837ba.m90858g(r11)     // Catch:{ b -> 0x0b2d }
            r7.f54643b = r11     // Catch:{ b -> 0x0b2d }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ b -> 0x0b2d }
            com.google.android.libraries.ba.a.a r0 = (com.google.android.libraries.p1657ba.p1658a.C19635a) r0     // Catch:{ b -> 0x0b2d }
            r7.f54644c = r0     // Catch:{ b -> 0x0b2d }
            boolean r0 = r4.isHidden     // Catch:{ b -> 0x0b2d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ b -> 0x0b2d }
            r7.f54645d = r0     // Catch:{ b -> 0x0b2d }
            android.net.wifi.WifiConfiguration r0 = new android.net.wifi.WifiConfiguration     // Catch:{ b -> 0x0b2d }
            r0.<init>()     // Catch:{ b -> 0x0b2d }
            java.lang.String r11 = r7.f54642a     // Catch:{ b -> 0x0b2d }
            boolean r12 = com.google.android.libraries.p1657ba.p1658a.C19641c.m37471c(r11, r3, r15)     // Catch:{ b -> 0x0b2d }
            if (r12 == 0) goto L_0x0b22
            java.lang.String r11 = com.google.android.libraries.p1657ba.p1658a.C19641c.m37469a(r11)     // Catch:{ b -> 0x0b2d }
            r0.SSID = r11     // Catch:{ b -> 0x0b2d }
            com.google.android.libraries.ba.a.a r11 = com.google.android.libraries.p1657ba.p1658a.C19635a.OPEN     // Catch:{ b -> 0x0b2d }
            com.google.android.libraries.ba.a.a r11 = r7.f54644c     // Catch:{ b -> 0x0b2d }
            int r11 = r11.ordinal()     // Catch:{ b -> 0x0b2d }
            if (r11 == 0) goto L_0x0ace
            if (r11 == r3) goto L_0x0a3f
            if (r11 == r10) goto L_0x09c4
            goto L_0x0b09
        L_0x09c4:
            java.lang.String r11 = r7.f54643b     // Catch:{ b -> 0x0b2d }
            boolean r12 = r11.isEmpty()     // Catch:{ b -> 0x0b2d }
            if (r12 != 0) goto L_0x0a35
            r12 = 63
            r13 = 8
            boolean r12 = com.google.android.libraries.p1657ba.p1658a.C19641c.m37471c(r11, r13, r12)     // Catch:{ b -> 0x0b2d }
            if (r12 == 0) goto L_0x09db
            java.lang.String r11 = com.google.android.libraries.p1657ba.p1658a.C19641c.m37469a(r11)     // Catch:{ b -> 0x0b2d }
            goto L_0x09e9
        L_0x09db:
            int r12 = r11.length()     // Catch:{ b -> 0x0b2d }
            r13 = 64
            if (r12 != r13) goto L_0x0a26
            boolean r12 = com.google.android.libraries.p1657ba.p1658a.C19641c.m37470b(r11)     // Catch:{ b -> 0x0b2d }
            if (r12 == 0) goto L_0x0a1b
        L_0x09e9:
            r0.preSharedKey = r11     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedProtocols     // Catch:{ b -> 0x0b2d }
            r11.set(r3)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedProtocols     // Catch:{ b -> 0x0b2d }
            r11.set(r5)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedKeyManagement     // Catch:{ b -> 0x0b2d }
            r11.set(r3)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedPairwiseCiphers     // Catch:{ b -> 0x0b2d }
            r11.set(r10)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedPairwiseCiphers     // Catch:{ b -> 0x0b2d }
            r11.set(r3)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedGroupCiphers     // Catch:{ b -> 0x0b2d }
            r11.set(r5)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedGroupCiphers     // Catch:{ b -> 0x0b2d }
            r11.set(r3)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedGroupCiphers     // Catch:{ b -> 0x0b2d }
            r12 = 3
            r11.set(r12)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedGroupCiphers     // Catch:{ b -> 0x0b2d }
            r11.set(r10)     // Catch:{ b -> 0x0b2d }
            goto L_0x0b09
        L_0x0a1b:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ b -> 0x0b2d }
            r0[r5] = r11     // Catch:{ b -> 0x0b2d }
            java.lang.String r2 = "WPA PSK %s is 64 chars, which means it must be hex; but it was not"
            com.google.android.libraries.ba.a.b r0 = com.google.android.libraries.p1657ba.p1658a.C19640b.m37468a(r14, r2, r0)     // Catch:{ b -> 0x0b2d }
            throw r0     // Catch:{ b -> 0x0b2d }
        L_0x0a26:
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ b -> 0x0b2d }
            r0[r5] = r11     // Catch:{ b -> 0x0b2d }
            java.lang.String r2 = "WPA PSKs must be 8-63 ASCII characters, or exactly 64 hex characters"
            r0[r3] = r2     // Catch:{ b -> 0x0b2d }
            java.lang.String r2 = "WPA PSK %s has an invalid length. %s"
            com.google.android.libraries.ba.a.b r0 = com.google.android.libraries.p1657ba.p1658a.C19640b.m37468a(r14, r2, r0)     // Catch:{ b -> 0x0b2d }
            throw r0     // Catch:{ b -> 0x0b2d }
        L_0x0a35:
            java.lang.String r0 = "No WPA PSK was specified"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ b -> 0x0b2d }
            r7 = 3
            com.google.android.libraries.ba.a.b r0 = com.google.android.libraries.p1657ba.p1658a.C19640b.m37468a(r7, r0, r2)     // Catch:{ b -> 0x0b2d }
            throw r0     // Catch:{ b -> 0x0b2d }
        L_0x0a3f:
            java.lang.String[] r11 = r0.wepKeys     // Catch:{ b -> 0x0b2d }
            java.lang.String r12 = r7.f54643b     // Catch:{ b -> 0x0b2d }
            int r13 = r12.length()     // Catch:{ b -> 0x0b2d }
            if (r13 == 0) goto L_0x0ac4
            r14 = 5
            if (r13 == r14) goto L_0x0a8e
            r14 = 10
            if (r13 == r14) goto L_0x0a77
            r14 = 13
            if (r13 == r14) goto L_0x0a8e
            r14 = 16
            if (r13 == r14) goto L_0x0a8e
            r14 = 26
            if (r13 == r14) goto L_0x0a77
            r14 = 29
            if (r13 == r14) goto L_0x0a8e
            if (r13 == r15) goto L_0x0a77
            r14 = 58
            if (r13 != r14) goto L_0x0a67
            goto L_0x0a77
        L_0x0a67:
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ b -> 0x0b2d }
            r0[r5] = r12     // Catch:{ b -> 0x0b2d }
            java.lang.String r2 = "WEP passwords must be 5, 13, 16, or 29 ASCII characters, or 10, 26, 32, or 58 hex characters."
            r0[r3] = r2     // Catch:{ b -> 0x0b2d }
            java.lang.String r2 = "Invalid WEP password %s. %s"
            r7 = 4
            com.google.android.libraries.ba.a.b r0 = com.google.android.libraries.p1657ba.p1658a.C19640b.m37468a(r7, r2, r0)     // Catch:{ b -> 0x0b2d }
            throw r0     // Catch:{ b -> 0x0b2d }
        L_0x0a77:
            boolean r13 = com.google.android.libraries.p1657ba.p1658a.C19641c.m37470b(r12)     // Catch:{ b -> 0x0b2d }
            if (r13 == 0) goto L_0x0a7e
            goto L_0x0a92
        L_0x0a7e:
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ b -> 0x0b2d }
            r0[r5] = r12     // Catch:{ b -> 0x0b2d }
            java.lang.String r2 = "WEP passwords must be 5, 13, 16, or 29 ASCII characters, or 10, 26, 32, or 58 hex characters."
            r0[r3] = r2     // Catch:{ b -> 0x0b2d }
            java.lang.String r2 = "WEP password %s is not a hex string, but has a length such that it must be one. %s"
            r7 = 4
            com.google.android.libraries.ba.a.b r0 = com.google.android.libraries.p1657ba.p1658a.C19640b.m37468a(r7, r2, r0)     // Catch:{ b -> 0x0b2d }
            throw r0     // Catch:{ b -> 0x0b2d }
        L_0x0a8e:
            java.lang.String r12 = com.google.android.libraries.p1657ba.p1658a.C19641c.m37469a(r12)     // Catch:{ b -> 0x0b2d }
        L_0x0a92:
            r11[r5] = r12     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedKeyManagement     // Catch:{ b -> 0x0b2d }
            r11.set(r5)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedProtocols     // Catch:{ b -> 0x0b2d }
            r11.set(r3)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedProtocols     // Catch:{ b -> 0x0b2d }
            r11.set(r5)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedAuthAlgorithms     // Catch:{ b -> 0x0b2d }
            r11.set(r5)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedAuthAlgorithms     // Catch:{ b -> 0x0b2d }
            r11.set(r3)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedPairwiseCiphers     // Catch:{ b -> 0x0b2d }
            r11.set(r10)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedPairwiseCiphers     // Catch:{ b -> 0x0b2d }
            r11.set(r3)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedGroupCiphers     // Catch:{ b -> 0x0b2d }
            r11.set(r5)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedGroupCiphers     // Catch:{ b -> 0x0b2d }
            r11.set(r3)     // Catch:{ b -> 0x0b2d }
            r0.wepTxKeyIndex = r5     // Catch:{ b -> 0x0b2d }
            goto L_0x0b09
        L_0x0ac4:
            java.lang.String r0 = "No WEP password was specified"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ b -> 0x0b2d }
            r7 = 3
            com.google.android.libraries.ba.a.b r0 = com.google.android.libraries.p1657ba.p1658a.C19640b.m37468a(r7, r0, r2)     // Catch:{ b -> 0x0b2d }
            throw r0     // Catch:{ b -> 0x0b2d }
        L_0x0ace:
            java.lang.String r11 = r7.f54643b     // Catch:{ b -> 0x0b2d }
            boolean r11 = r11.isEmpty()     // Catch:{ b -> 0x0b2d }
            if (r11 == 0) goto L_0x0b19
            java.util.BitSet r11 = r0.allowedKeyManagement     // Catch:{ b -> 0x0b2d }
            r11.set(r5)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedProtocols     // Catch:{ b -> 0x0b2d }
            r11.set(r3)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedProtocols     // Catch:{ b -> 0x0b2d }
            r11.set(r5)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedAuthAlgorithms     // Catch:{ b -> 0x0b2d }
            r11.clear()     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedPairwiseCiphers     // Catch:{ b -> 0x0b2d }
            r11.set(r10)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedPairwiseCiphers     // Catch:{ b -> 0x0b2d }
            r11.set(r3)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedGroupCiphers     // Catch:{ b -> 0x0b2d }
            r11.set(r5)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedGroupCiphers     // Catch:{ b -> 0x0b2d }
            r11.set(r3)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedGroupCiphers     // Catch:{ b -> 0x0b2d }
            r12 = 3
            r11.set(r12)     // Catch:{ b -> 0x0b2d }
            java.util.BitSet r11 = r0.allowedGroupCiphers     // Catch:{ b -> 0x0b2d }
            r11.set(r10)     // Catch:{ b -> 0x0b2d }
        L_0x0b09:
            java.lang.Boolean r7 = r7.f54645d     // Catch:{ b -> 0x0b2d }
            boolean r7 = r7.booleanValue()     // Catch:{ b -> 0x0b2d }
            r0.hiddenSSID = r7     // Catch:{ b -> 0x0b2d }
            com.google.android.libraries.ba.a.a.c r3 = new com.google.android.libraries.ba.a.a.c
            r3.<init>(r2, r8, r0, r9)
            r0 = r3
            goto L_0x0b8e
        L_0x0b19:
            java.lang.String r0 = "Open WiFi network should not have a password specified"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ b -> 0x0b2d }
            com.google.android.libraries.ba.a.b r0 = com.google.android.libraries.p1657ba.p1658a.C19640b.m37468a(r10, r0, r2)     // Catch:{ b -> 0x0b2d }
            throw r0     // Catch:{ b -> 0x0b2d }
        L_0x0b22:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ b -> 0x0b2d }
            r0[r5] = r11     // Catch:{ b -> 0x0b2d }
            java.lang.String r2 = "SSID must have a length of 1-32 chars. SSID is: %s"
            com.google.android.libraries.ba.a.b r0 = com.google.android.libraries.p1657ba.p1658a.C19640b.m37468a(r3, r2, r0)     // Catch:{ b -> 0x0b2d }
            throw r0     // Catch:{ b -> 0x0b2d }
        L_0x0b2d:
            r0 = move-exception
            com.google.android.libraries.ba.c.a.c r2 = com.google.android.libraries.p1657ba.p1664c.p1665a.C19646c.f54650a
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r5] = r0
            r9 = 5
            boolean r9 = r2.mo24971e(r9)
            if (r9 == 0) goto L_0x0b46
            java.lang.String r2 = r2.f54651b
            java.lang.String r9 = "QR code contained invalid wifi. Details: %s"
            java.lang.String r7 = com.google.android.libraries.p1657ba.p1664c.p1665a.C19646c.m37475f(r9, r7)
            android.util.Log.w(r2, r7, r0)
        L_0x0b46:
            int r2 = r0.f54641a
            int r7 = r2 + -1
            if (r2 == 0) goto L_0x0ba2
            if (r7 == 0) goto L_0x0b80
            if (r7 == r3) goto L_0x0b71
            if (r7 == r10) goto L_0x0b71
            r2 = 3
            if (r7 == r2) goto L_0x0b71
            com.google.android.libraries.ba.c.a.c r2 = com.google.android.libraries.p1657ba.p1664c.p1665a.C19646c.f54650a
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r5] = r0
            java.lang.Class<com.google.android.libraries.ba.a.a.c> r0 = com.google.android.libraries.p1657ba.p1658a.p1659a.C19639c.class
            java.lang.String r9 = "Unhandled WifiConfigurationBuilder exception %s"
            r2.mo24967a(r0, r9, r7)
            com.google.android.libraries.ba.a.a.a r0 = new com.google.android.libraries.ba.a.a.a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = r4.ssid
            r2[r5] = r3
            r3 = 2132091750(0x7f152366, float:1.9823877E38)
            r0.<init>(r8, r3, r2)
            goto L_0x0b8e
        L_0x0b71:
            com.google.android.libraries.ba.a.a.a r0 = new com.google.android.libraries.ba.a.a.a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = r4.ssid
            r2[r5] = r3
            r3 = 2132091753(0x7f152369, float:1.9823883E38)
            r0.<init>(r8, r3, r2)
            goto L_0x0b8e
        L_0x0b80:
            com.google.android.libraries.ba.a.a.a r0 = new com.google.android.libraries.ba.a.a.a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = r4.ssid
            r2[r5] = r3
            r3 = 2132091754(0x7f15236a, float:1.9823885E38)
            r0.<init>(r8, r3, r2)
        L_0x0b8e:
            com.google.android.libraries.lens.view.main.bq r2 = r6.f74752a
            java.util.concurrent.Executor r2 = r2.f74811p
            p3186j$.util.Objects.requireNonNull(r0)
            com.google.android.libraries.lens.view.main.bn r3 = new com.google.android.libraries.lens.view.main.bn
            r3.<init>(r0)
            java.lang.Runnable r0 = com.google.apps.tiktok.tracing.C47810es.m84977q(r3)
            r2.execute(r0)
            return
        L_0x0ba2:
            r2 = 0
            throw r2
        L_0x0ba4:
            com.google.common.f.e r2 = com.google.android.libraries.lens.view.main.C27327bq.f74753a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r3 = 49715(0xc233, float:6.9666E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r3 = "Failed to parse eventData: %s"
            java.lang.String r0 = r0.f68976e
            r2.mo56389s(r3, r0)
            return
        L_0x0bbd:
            java.lang.String r2 = r0.f68973b
            com.google.android.libraries.lens.view.main.k r3 = new com.google.android.libraries.lens.view.main.k
            r3.<init>(r1, r0)
            com.google.lens.j.ds r0 = r1.f74681n
            java.lang.String r4 = "handleIntent "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r4.concat(r2)
            r1.mo32842s(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.main.C27288ae.mo32832i(com.google.android.libraries.lens.view.am.r):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x040a, code lost:
        if (r6.mo32615b(r5) != false) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x040d, code lost:
        r5 = r26;
        r7 = r27;
     */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x055b  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x073b  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0748  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0758  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0776  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0779  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x07e3  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x08ac  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x08c5  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x08f9  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0981  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x09f7  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0b97  */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x0598 A[SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32833j(com.google.android.libraries.lens.view.p2081au.C25561k r34) {
        /*
            r33 = this;
            r0 = r33
            if (r34 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r1 = r0.f74692y
            if (r1 == 0) goto L_0x0026
            com.google.android.libraries.lens.e.ak r1 = r34.mo30623c()
            com.google.common.base.ax r1 = r1.mo29699d()
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.lens.e.ab r1 = (com.google.android.libraries.lens.p2014e.C24199ab) r1
            com.google.common.base.ax r1 = r1.mo29667e()
            com.google.at.g.a.a.cs r2 = com.google.p4017at.p4056g.p4057a.p4058a.C54038cs.f141782f
            java.lang.Object r1 = r1.mo56109e(r2)
            com.google.at.g.a.a.cs r1 = (com.google.p4017at.p4056g.p4057a.p4058a.C54038cs) r1
            r0.m50824A(r1)
        L_0x0026:
            int r1 = r34.mo30621a()
            com.google.android.libraries.lens.view.au.af r2 = r0.f74669b
            com.google.android.libraries.lens.view.au.ac r2 = r2.f69552b
            int r2 = r2.f69592b
            if (r1 == r2) goto L_0x0041
            com.google.common.f.a.d r1 = f74662a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "Ignoring result for stale interaction"
            r3 = 49695(0xc21f, float:6.9638E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x0041:
            com.google.android.libraries.lens.e.ak r1 = r34.mo30623c()
            com.google.common.base.ax r1 = r1.mo29699d()
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.lens.e.ab r1 = (com.google.android.libraries.lens.p2014e.C24199ab) r1
            com.google.protobuf.z r2 = r1.mo29672j()
            boolean r2 = r2.mo59173M()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0068
            com.google.common.base.ax r2 = r1.mo29665c()
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r2 = 0
            goto L_0x0069
        L_0x0068:
            r2 = 1
        L_0x0069:
            com.google.android.libraries.lens.view.af.c r5 = r0.f74676i
            com.google.net.a.a.b r6 = com.google.net.p4726a.p4727a.C62722b.OK
            com.google.android.libraries.lens.e.ak r7 = r34.mo30623c()
            com.google.android.libraries.lens.e.af r7 = r7.mo29697b()
            r8 = 3
            r9 = 2
            if (r2 == 0) goto L_0x007b
            r10 = 3
            goto L_0x007c
        L_0x007b:
            r10 = 2
        L_0x007c:
            r5.mo30255d(r6, r7, r10)
            if (r2 == 0) goto L_0x0089
            com.google.android.libraries.lens.view.af.ao r1 = r0.f74665C
            java.lang.String r2 = "PRESENTATION_HTML"
            r1.mo30236b(r2)
            goto L_0x00a2
        L_0x0089:
            com.google.common.b.gu r1 = r1.mo29670h()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x009b
            com.google.android.libraries.lens.view.af.ao r1 = r0.f74665C
            java.lang.String r2 = "PRESENTATION_RESULT"
            r1.mo30236b(r2)
            goto L_0x00a2
        L_0x009b:
            com.google.android.libraries.lens.view.af.ao r1 = r0.f74665C
            java.lang.String r2 = "EMPTY"
            r1.mo30236b(r2)
        L_0x00a2:
            com.google.android.libraries.lens.view.main.ac r1 = r0.f74679l
            r1.getClass()
            com.google.android.libraries.lens.e.ak r2 = r34.mo30623c()
            com.google.android.libraries.lens.e.af r2 = r2.mo29697b()
            com.google.android.libraries.lens.e.ak r5 = r34.mo30623c()
            com.google.common.base.ax r5 = r5.mo29699d()
            java.lang.Object r5 = r5.mo56107c()
            com.google.android.libraries.lens.e.ab r5 = (com.google.android.libraries.lens.p2014e.C24199ab) r5
            com.google.android.libraries.lens.view.au.j r6 = r34.mo30624d()
            com.google.common.base.ax r7 = r34.mo30627f()
            java.lang.Object r7 = r7.mo56107c()
            com.google.android.libraries.lens.view.au.x r7 = (com.google.android.libraries.lens.view.p2081au.C25574x) r7
            com.google.android.libraries.lens.view.session.bm r7 = r7.mo30644a()
            java.lang.String r10 = "EyesSessionSubCtrlImpl:showResponse"
            android.os.Trace.beginSection(r10)
            int r10 = r5.mo29663a()
            com.google.android.libraries.lens.view.main.bp r1 = (com.google.android.libraries.lens.view.main.C27326bp) r1
            r1.mo32867b(r10)
            com.google.android.libraries.lens.view.main.bq r10 = r1.f74752a
            com.google.android.libraries.lens.view.main.f r10 = r10.f74755A
            boolean r11 = com.google.android.libraries.lens.view.session.C27778bn.m51735g(r7)
            com.google.android.libraries.lens.view.flags.b r12 = r10.f75056a
            com.google.android.libraries.lens.view.flags.a r13 = com.google.android.libraries.lens.view.flags.C26239a.SELECTION_STATE_ENABLED
            boolean r12 = r12.mo31462g(r13)
            r13 = 4
            if (r12 == 0) goto L_0x011e
            boolean r12 = r5.mo29674l()
            if (r12 == 0) goto L_0x011e
            com.google.common.base.ax r12 = r5.mo29668f()
            com.google.android.libraries.lens.e.z r14 = com.google.android.libraries.lens.p2014e.C24234z.f66292a
            com.google.common.base.ax r12 = r12.mo56106b(r14)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r12 = r12.mo56109e(r14)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x011e
            com.google.common.base.ax r12 = r5.mo29664b()
            boolean r12 = r12.mo56113h()
            if (r12 != 0) goto L_0x011e
            r10.mo32974a(r8)
            goto L_0x0126
        L_0x011e:
            if (r4 == r11) goto L_0x0122
            r11 = 4
            goto L_0x0123
        L_0x0122:
            r11 = 2
        L_0x0123:
            r10.mo32974a(r11)
        L_0x0126:
            com.google.common.base.ax r10 = r5.mo29667e()
            com.google.at.g.a.a.cs r11 = com.google.p4017at.p4056g.p4057a.p4058a.C54038cs.f141782f
            java.lang.Object r10 = r10.mo56109e(r11)
            com.google.at.g.a.a.cs r10 = (com.google.p4017at.p4056g.p4057a.p4058a.C54038cs) r10
            com.google.android.libraries.lens.view.main.bq r11 = r1.f74752a
            com.google.android.libraries.lens.view.gleam.cj r12 = r11.f74767M
            r12.mo31775k()
            com.google.android.libraries.lens.view.filters.e.d r12 = r11.f74777W
            com.google.android.libraries.lens.view.filters.e.a.e r12 = r12.mo31203a()
            boolean r12 = r12.mo31192i()
            if (r12 == 0) goto L_0x014c
            int r12 = r7.mo33260h()
            if (r12 != r13) goto L_0x014c
            goto L_0x018c
        L_0x014c:
            com.google.android.libraries.lens.view.textoverlay.e r12 = r11.f74768N
            boolean r14 = r11.mo32871D()
            com.google.android.libraries.lens.view.textoverlay.l r12 = (com.google.android.libraries.lens.view.textoverlay.C28079l) r12
            boolean r15 = r12.f76426n
            if (r15 == r14) goto L_0x015d
            r12.f76426n = r14
            r12.mo33542i()
        L_0x015d:
            com.google.android.libraries.lens.view.textoverlay.e r12 = r11.f74768N
            com.google.bp.f.b.a.ag r14 = r10.f141785b
            if (r14 == 0) goto L_0x017d
            com.google.bp.f.b.a.df r14 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.EDUCATION
            com.google.android.libraries.lens.view.filters.e.d r11 = r11.f74777W
            boolean r11 = r11.mo31207f(r14)
            if (r11 == 0) goto L_0x0172
            boolean r11 = r7 instanceof com.google.android.libraries.lens.view.session.C27774bj
            if (r11 == 0) goto L_0x0172
            goto L_0x017d
        L_0x0172:
            com.google.bp.f.b.a.ag r11 = r10.f141785b
            if (r11 != 0) goto L_0x0178
            com.google.bp.f.b.a.ag r11 = com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag.f149762e
        L_0x0178:
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r11)
            goto L_0x017f
        L_0x017d:
            com.google.common.base.b r11 = com.google.common.base.C58836b.f156633a
        L_0x017f:
            com.google.bp.f.b.a.ag r14 = com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag.f149762e
            java.lang.Object r11 = r11.mo56109e(r14)
            com.google.bp.f.b.a.ag r11 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag) r11
            com.google.android.libraries.lens.view.textoverlay.l r12 = (com.google.android.libraries.lens.view.textoverlay.C28079l) r12
            r12.mo33539f(r11)
        L_0x018c:
            com.google.common.base.ax r11 = r5.mo29664b()
            com.google.lens.j.bp r12 = com.google.lens.p4707j.C62439bp.f168603d
            java.lang.Object r11 = r11.mo56109e(r12)
            com.google.lens.j.bp r11 = (com.google.lens.p4707j.C62439bp) r11
            com.google.android.libraries.lens.view.main.bq r12 = r1.f74752a
            boolean r14 = r12.f74761G
            if (r14 == 0) goto L_0x01a8
            com.google.android.libraries.lens.e.w r14 = r7.mo33256c()
            com.google.android.libraries.lens.e.w r15 = com.google.android.libraries.lens.p2014e.C24231w.RETICLE_SELECTION
            if (r14 != r15) goto L_0x01a8
            r14 = 1
            goto L_0x01a9
        L_0x01a8:
            r14 = 0
        L_0x01a9:
            boolean r15 = r12.mo32869B()
            if (r15 != 0) goto L_0x01f2
            com.google.android.libraries.lens.view.filters.e.d r15 = r12.f74777W
            com.google.bp.f.b.a.df r13 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.EDUCATION
            boolean r13 = r15.mo31207f(r13)
            if (r13 != 0) goto L_0x01f2
            com.google.android.libraries.lens.view.flags.b r13 = r12.f74804i
            com.google.android.libraries.lens.view.flags.a r15 = com.google.android.libraries.lens.view.flags.C26239a.SELECTION_STATE_ENABLED
            boolean r13 = r13.mo31462g(r15)
            if (r13 == 0) goto L_0x01cb
            com.google.lens.j.bp r13 = com.google.lens.p4707j.C62439bp.f168603d
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x01f2
        L_0x01cb:
            com.google.android.libraries.lens.view.gleam.cj r13 = r12.f74767M
            com.google.common.base.ax r13 = r13.mo31770f(r11, r14)
            boolean r14 = r13.mo56113h()
            if (r14 == 0) goto L_0x01f2
            com.google.android.libraries.lens.view.bb.e r12 = r12.f74786af
            com.google.android.libraries.lens.view.bb.a r14 = com.google.android.libraries.lens.view.p2091bb.C25688b.m47362b()
            java.lang.Object r13 = r13.mo56107c()
            android.graphics.RectF r13 = (android.graphics.RectF) r13
            r14.mo30792e(r13)
            r13 = r14
            com.google.android.libraries.lens.view.bb.c r13 = (com.google.android.libraries.lens.view.p2091bb.C25689c) r13
            r13.f69830b = r9
            com.google.android.libraries.lens.view.bb.b r13 = r14.mo30790c()
            r12.mo30810l(r13)
        L_0x01f2:
            com.google.android.libraries.lens.view.main.bq r12 = r1.f74752a
            com.google.android.libraries.lens.view.main.bl r12 = r12.f74787ag
            r12.getClass()
            com.google.android.libraries.lens.view.main.dt r12 = (com.google.android.libraries.lens.view.main.C27384dt) r12
            boolean r13 = r12.mo32946ah()
            if (r13 != 0) goto L_0x0223
            com.google.common.f.e r2 = com.google.android.libraries.lens.view.main.C27384dt.f74877a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r7 = 49773(0xc26d, float:6.9747E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r7)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r7 = "Ignoring onInteractionResult in state: %s"
            com.google.android.libraries.lens.view.main.eb r12 = r12.f74908aD
            r2.mo56389s(r7, r12)
        L_0x0219:
            r26 = r5
            r24 = r6
            r21 = r10
            r19 = r11
            goto L_0x08bc
        L_0x0223:
            r12.mo32923J()
            com.google.android.libraries.lens.view.flags.b r13 = r12.f74995o
            com.google.android.libraries.lens.view.flags.a r15 = com.google.android.libraries.lens.view.flags.C26239a.SELECTION_STATE_ENABLED
            boolean r13 = r13.mo31462g(r15)
            if (r13 == 0) goto L_0x023c
            com.google.android.libraries.lens.view.main.bq r13 = r12.f74881C
            com.google.android.libraries.lens.view.main.f r13 = r13.f74755A
            int r13 = r13.f75058c
            if (r13 != r8) goto L_0x023c
            r12.mo32931R()
            goto L_0x0219
        L_0x023c:
            r12.mo32935V(r3)
            com.google.android.libraries.lens.view.main.a r13 = new com.google.android.libraries.lens.view.main.a
            r13.<init>(r2, r5, r6, r7)
            r12.mo32925L()
            com.google.android.libraries.lens.view.main.bq r2 = r12.f74881C
            com.google.android.libraries.lens.view.main.ae r2 = r2.f74816u
            com.google.android.libraries.lens.view.at.p r2 = r2.f74680m
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90833j(r2)
            com.google.android.libraries.lens.view.session.bb r7 = r12.f74903Y
            com.google.android.libraries.lens.view.main.fe r15 = r12.f74897S
            com.google.android.libraries.lens.e.ab r8 = r13.f74651b
            com.google.android.libraries.lens.view.au.j r9 = r13.f74652c
            com.google.android.libraries.lens.view.session.bm r4 = r13.f74653d
            boolean r17 = r2.mo56113h()
            if (r17 == 0) goto L_0x0272
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.libraries.lens.view.at.p r2 = (com.google.android.libraries.lens.view.p2078at.C25533p) r2
            com.google.common.base.ax r2 = r2.mo30587f()
            com.google.android.libraries.lens.view.main.dm r14 = com.google.android.libraries.lens.view.main.C27377dm.f74870a
            com.google.common.base.ax r2 = r2.mo56106b(r14)
            goto L_0x0274
        L_0x0272:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
        L_0x0274:
            boolean r14 = r4 instanceof com.google.android.libraries.lens.view.session.C27774bj
            if (r14 == 0) goto L_0x028b
            com.google.android.libraries.lens.view.session.bj r4 = (com.google.android.libraries.lens.view.session.C27774bj) r4
            com.google.android.libraries.lens.e.s r2 = r9.mo30614a()
            android.graphics.Bitmap r2 = r2.mo29707c()
            android.graphics.RectF r4 = r4.mo33280a()
            com.google.android.libraries.lens.view.main.fd r2 = com.google.android.libraries.lens.view.main.C27423fd.m51093c(r2, r4)
            goto L_0x02de
        L_0x028b:
            if (r2 == 0) goto L_0x029a
            boolean r4 = r2.mo56113h()
            if (r4 == 0) goto L_0x029a
            java.lang.Object r2 = r2.mo56107c()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            goto L_0x02a2
        L_0x029a:
            com.google.android.libraries.lens.e.s r2 = r9.mo30614a()
            android.graphics.Bitmap r2 = r2.mo29707c()
        L_0x02a2:
            com.google.common.base.ax r4 = r8.mo29666d()
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x02d9
            com.google.common.base.ax r4 = r8.mo29666d()
            java.lang.Object r4 = r4.mo56107c()
            com.google.bp.f.b.a.ai r4 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56228ai) r4
            com.google.protobuf.cq r4 = r4.f149770a
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.libraries.lens.view.ay.y r8 = r15.f75062a
            com.google.common.base.ax r4 = r8.mo30770d(r4)
            boolean r8 = r4.mo56113h()
            if (r8 == 0) goto L_0x02d9
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.libraries.lens.view.gleam.ci r4 = (com.google.android.libraries.lens.view.gleam.C26504ci) r4
            android.graphics.RectF r4 = r4.mo31759c()
            com.google.android.libraries.lens.view.main.fd r2 = com.google.android.libraries.lens.view.main.C27423fd.m51093c(r2, r4)
            goto L_0x02de
        L_0x02d9:
            r4 = 0
            com.google.android.libraries.lens.view.main.fd r2 = com.google.android.libraries.lens.view.main.C27423fd.m51093c(r2, r4)
        L_0x02de:
            com.google.android.libraries.lens.view.d.g r4 = r7.f75782a
            com.google.android.libraries.lens.view.main.b r2 = (com.google.android.libraries.lens.view.main.C27310b) r2
            android.graphics.Bitmap r8 = r2.f74722a
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r8)
            r4.mo5708l(r8)
            com.google.common.base.ax r4 = r2.f74723b
            boolean r8 = r4.mo56113h()
            if (r8 == 0) goto L_0x0311
            android.graphics.Bitmap r2 = r2.f74722a
            java.lang.Object r4 = r4.mo56107c()
            android.graphics.RectF r4 = (android.graphics.RectF) r4
            com.google.android.libraries.lens.view.session.ba r8 = new com.google.android.libraries.lens.view.session.ba
            r8.<init>(r7, r2, r4)
            java.util.concurrent.Executor r2 = r7.f75783b
            java.lang.Runnable r4 = com.google.apps.tiktok.tracing.C47810es.m84977q(r8)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92903l(r4, r2)
            java.lang.String r4 = "Error cropping the query image"
            java.lang.Object[] r7 = new java.lang.Object[r3]
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r2, r4, r7)
        L_0x0311:
            com.google.android.libraries.lens.view.infopanel.a.l r2 = r12.f74879A
            com.google.android.libraries.lens.e.ab r4 = r13.f74651b
            com.google.android.libraries.lens.view.infopanel.a.p r7 = r12.f75005y
            r7.mo32436b()
            com.google.android.libraries.lens.e.af r7 = r13.f74650a
            com.google.android.libraries.lens.view.infopanel.a.p r8 = r12.f75005y
            com.google.android.libraries.lens.view.d.g r8 = r8.f73571e
            java.lang.Object r8 = r8.mo3842a()
            com.google.common.base.ax r8 = (com.google.common.base.C58833ax) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.google.common.base.b r14 = com.google.common.base.C58836b.f156633a
            com.google.android.libraries.lens.view.infopanel.a.a.d r15 = com.google.android.libraries.lens.view.infopanel.p2138a.p2139a.C26965d.m50011g()
            com.google.android.libraries.lens.view.infopanel.a.g r3 = com.google.android.libraries.lens.view.infopanel.p2138a.C26973i.m50040p()
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r7)
            r18 = r14
            r14 = r3
            com.google.android.libraries.lens.view.infopanel.a.a r14 = (com.google.android.libraries.lens.view.infopanel.p2138a.C26961a) r14
            r14.f73515g = r7
            com.google.protobuf.z r7 = r4.mo29672j()
            boolean r7 = r7.mo59173M()
            r16 = 1
            r7 = r7 ^ 1
            java.lang.String r0 = ""
            if (r7 != 0) goto L_0x0703
            com.google.common.base.ax r7 = r4.mo29665c()
            boolean r7 = r7.mo56113h()
            if (r7 == 0) goto L_0x037a
            com.google.common.base.ax r2 = r4.mo29665c()
            java.lang.Object r2 = r2.mo56107c()
            com.google.common.j.a.f r2 = (com.google.common.p4538j.p4539a.C59308f) r2
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            r14.f73512d = r2
            r28 = r1
            r26 = r5
            r24 = r6
            r21 = r10
            r19 = r11
            r30 = r12
            r29 = r13
            goto L_0x071b
        L_0x037a:
            com.google.common.b.gu r4 = r4.mo29670h()
            int r7 = r4.size()
            r21 = r10
            r19 = r11
            r10 = 0
            r11 = 0
            r20 = 0
        L_0x038a:
            if (r11 >= r7) goto L_0x06af
            java.lang.Object r22 = r4.get(r11)
            r23 = r4
            r4 = r22
            com.google.at.g.a.a.ce r4 = (com.google.p4017at.p4056g.p4057a.p4058a.C54024ce) r4
            r22 = r7
            int r7 = r4.f141747a
            r24 = r6
            r6 = 5
            if (r7 != r6) goto L_0x03a8
            java.lang.Object r7 = r4.f141748b
            com.google.at.g.a.a.ac r7 = (com.google.p4017at.p4056g.p4057a.p4058a.C53968ac) r7
            com.google.android.libraries.lens.view.infopanel.a.a.d r7 = com.google.android.libraries.lens.view.infopanel.p2138a.p2139a.C26965d.m50010f(r7)
            r15 = r7
        L_0x03a8:
            int r7 = r4.f141747a
            r6 = 6
            if (r7 != r6) goto L_0x059d
            com.google.android.libraries.lens.view.infopanel.e.x r6 = r2.f73558b
            java.lang.Object r7 = r4.f141748b
            com.google.at.g.a.a.l r7 = (com.google.p4017at.p4056g.p4057a.p4058a.C54060l) r7
            r25 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            com.google.protobuf.cq r7 = r7.f141842a
            java.util.Iterator r7 = r7.iterator()
        L_0x03c0:
            boolean r26 = r7.hasNext()
            if (r26 == 0) goto L_0x04d5
            java.lang.Object r26 = r7.next()
            r27 = r7
            r7 = r26
            com.google.at.g.a.a.j r7 = (com.google.p4017at.p4056g.p4057a.p4058a.C54058j) r7
            r26 = r5
            com.google.protobuf.cq r5 = r7.f141837h
            java.util.Iterator r5 = r5.iterator()
        L_0x03d8:
            boolean r28 = r5.hasNext()
            if (r28 == 0) goto L_0x03f8
            java.lang.Object r28 = r5.next()
            r29 = r5
            r5 = r28
            com.google.at.g.a.a.i r5 = (com.google.p4017at.p4056g.p4057a.p4058a.C54057i) r5
            com.google.at.g.a.a.b r5 = r5.f141825e
            if (r5 != 0) goto L_0x03ee
            com.google.at.g.a.a.b r5 = com.google.p4017at.p4056g.p4057a.p4058a.C53992b.f141653e
        L_0x03ee:
            boolean r5 = r6.mo32615b(r5)
            if (r5 != 0) goto L_0x03f5
            goto L_0x040d
        L_0x03f5:
            r5 = r29
            goto L_0x03d8
        L_0x03f8:
            com.google.protobuf.cq r5 = r7.f141837h
            int r5 = r5.size()
            if (r5 != 0) goto L_0x0412
            com.google.at.g.a.a.b r5 = r7.f141833d
            if (r5 != 0) goto L_0x0406
            com.google.at.g.a.a.b r5 = com.google.p4017at.p4056g.p4057a.p4058a.C53992b.f141653e
        L_0x0406:
            boolean r5 = r6.mo32615b(r5)
            if (r5 == 0) goto L_0x040d
            goto L_0x0412
        L_0x040d:
            r5 = r26
            r7 = r27
            goto L_0x03c0
        L_0x0412:
            com.google.android.libraries.lens.view.infopanel.e.v r5 = com.google.android.libraries.lens.view.infopanel.p2144e.C27181w.m50397d()
            r28 = r1
            com.google.at.g.a.a.cz r1 = r7.f141834e
            if (r1 == 0) goto L_0x04ae
            int r1 = r1.f141803a
            r29 = r13
            r13 = 117556(0x1cb34, float:1.64731E-40)
            if (r1 != r13) goto L_0x04a9
            com.google.android.libraries.lens.view.ak.bd r1 = r6.f74305d
            com.google.android.libraries.lens.view.ak.ca r1 = r1.mo30351g()
            int r1 = r1.f68712a
            r13 = 10
            if (r1 < r13) goto L_0x0440
            com.google.android.libraries.lens.view.infopanel.e.v r1 = com.google.android.libraries.lens.view.infopanel.p2144e.C27181w.m50397d()
            com.google.android.libraries.lens.view.infopanel.e.w r1 = r1.mo32559a()
            r32 = r3
            r30 = r12
            r3 = 5
            goto L_0x04bd
        L_0x0440:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.content.Context r13 = r6.f74303b
            boolean r13 = com.google.android.libraries.lens.view.utils.C28110al.m52391c(r13)
            r30 = r12
            r12 = 1
            if (r12 == r13) goto L_0x0453
            java.lang.String r12 = "https://www.gstatic.com/images/icons/material/system/2x/share_googblue_48dp.png"
            goto L_0x0455
        L_0x0453:
            java.lang.String r12 = "https://www.gstatic.com/lens/cards/assets/share_icon_dark_mode.png"
        L_0x0455:
            r1.add(r12)
            com.google.common.b.hd r12 = com.google.android.libraries.lens.view.infopanel.p2144e.C27182x.f74302a
            com.google.common.b.ij r12 = r12.keySet()
            com.google.common.b.sl r12 = r12.iterator()
        L_0x0462:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0493
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            r31 = r12
            int r12 = r1.size()
            r32 = r3
            r3 = 5
            if (r12 < r3) goto L_0x047a
            goto L_0x0496
        L_0x047a:
            boolean r12 = r6.mo32614a(r13)
            if (r12 == 0) goto L_0x048e
            com.google.common.b.hd r12 = com.google.android.libraries.lens.view.infopanel.p2144e.C27182x.f74302a
            java.lang.Object r12 = r12.get(r13)
            java.lang.String r12 = (java.lang.String) r12
            r12.getClass()
            r1.add(r12)
        L_0x048e:
            r12 = r31
            r3 = r32
            goto L_0x0462
        L_0x0493:
            r32 = r3
            r3 = 5
        L_0x0496:
            int r12 = r1.size()
            r13 = 2
            if (r12 < r13) goto L_0x04a4
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89842j(r1)
            r5.mo32560b(r1)
        L_0x04a4:
            com.google.android.libraries.lens.view.infopanel.e.w r1 = r5.mo32559a()
            goto L_0x04bd
        L_0x04a9:
            r32 = r3
            r30 = r12
            goto L_0x04b4
        L_0x04ae:
            r32 = r3
            r30 = r12
            r29 = r13
        L_0x04b4:
            r3 = 5
            com.google.android.libraries.lens.view.infopanel.e.v r1 = com.google.android.libraries.lens.view.infopanel.p2144e.C27181w.m50397d()
            com.google.android.libraries.lens.view.infopanel.e.w r1 = r1.mo32559a()
        L_0x04bd:
            com.google.android.libraries.lens.view.infopanel.e.t r5 = new com.google.android.libraries.lens.view.infopanel.e.t
            com.google.apps.tiktok.media.e r12 = r6.f74304c
            r5.<init>(r7, r12, r1)
            r15.add(r5)
            r5 = r26
            r7 = r27
            r1 = r28
            r13 = r29
            r12 = r30
            r3 = r32
            goto L_0x03c0
        L_0x04d5:
            r28 = r1
            r32 = r3
            r26 = r5
            r30 = r12
            r29 = r13
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x04e7
            goto L_0x0699
        L_0x04e7:
            com.google.android.libraries.lens.view.infopanel.e.y r1 = new com.google.android.libraries.lens.view.infopanel.e.y
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89842j(r15)
            int r5 = r4.f141747a
            r6 = 6
            if (r5 != r6) goto L_0x04f7
            java.lang.Object r5 = r4.f141748b
            com.google.at.g.a.a.l r5 = (com.google.p4017at.p4056g.p4057a.p4058a.C54060l) r5
            goto L_0x04f9
        L_0x04f7:
            com.google.at.g.a.a.l r5 = com.google.p4017at.p4056g.p4057a.p4058a.C54060l.f141840c
        L_0x04f9:
            int r5 = r5.f141843b
            if (r5 == 0) goto L_0x0509
            r6 = 1
            if (r5 == r6) goto L_0x0507
            r6 = 2
            if (r5 == r6) goto L_0x0505
            r5 = 0
            goto L_0x050a
        L_0x0505:
            r5 = 4
            goto L_0x050a
        L_0x0507:
            r5 = 3
            goto L_0x050a
        L_0x0509:
            r5 = 2
        L_0x050a:
            if (r5 != 0) goto L_0x050d
            r5 = 1
        L_0x050d:
            r1.<init>(r3, r5)
            r9.add(r1)
            if (r10 != 0) goto L_0x0542
            com.google.common.b.gu r1 = r1.f74306a
            int r3 = r1.size()
            r5 = 0
        L_0x051c:
            if (r5 >= r3) goto L_0x0540
            java.lang.Object r6 = r1.get(r5)
            com.google.android.libraries.lens.view.infopanel.e.t r6 = (com.google.android.libraries.lens.view.infopanel.p2144e.C27178t) r6
            java.lang.String r7 = r6.mo32612c()
            java.lang.String r10 = "👎"
            boolean r7 = android.text.TextUtils.equals(r7, r10)
            if (r7 != 0) goto L_0x053d
            java.lang.String r6 = r6.mo32612c()
            java.lang.String r7 = "👍"
            boolean r6 = android.text.TextUtils.equals(r6, r7)
            if (r6 != 0) goto L_0x053d
            goto L_0x0542
        L_0x053d:
            int r5 = r5 + 1
            goto L_0x051c
        L_0x0540:
            r1 = 0
            goto L_0x0543
        L_0x0542:
            r1 = 1
        L_0x0543:
            int r3 = r4.f141747a
            r5 = 6
            if (r3 != r5) goto L_0x054d
            java.lang.Object r3 = r4.f141748b
            com.google.at.g.a.a.l r3 = (com.google.p4017at.p4056g.p4057a.p4058a.C54060l) r3
            goto L_0x054f
        L_0x054d:
            com.google.at.g.a.a.l r3 = com.google.p4017at.p4056g.p4057a.p4058a.C54060l.f141840c
        L_0x054f:
            com.google.protobuf.cq r3 = r3.f141842a
            java.util.Iterator r3 = r3.iterator()
        L_0x0555:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0598
            java.lang.Object r5 = r3.next()
            com.google.at.g.a.a.j r5 = (com.google.p4017at.p4056g.p4057a.p4058a.C54058j) r5
            com.google.at.g.a.a.b r5 = r5.f141833d
            if (r5 == 0) goto L_0x0555
            int r6 = r5.f141655a
            r7 = 3
            if (r6 != r7) goto L_0x056f
            java.lang.Object r5 = r5.f141656b
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0570
        L_0x056f:
            r5 = r0
        L_0x0570:
            android.content.Intent r5 = com.google.android.libraries.lens.view.utils.C28133v.m52416b(r5)
            com.google.common.base.ax r5 = com.google.android.libraries.lens.view.utils.C28133v.m52417c(r5)
            boolean r6 = r5.mo56113h()
            if (r6 == 0) goto L_0x0555
            com.google.common.b.ij r6 = com.google.android.libraries.lens.view.infopanel.p2138a.C26976l.f73557a
            java.lang.Object r5 = r5.mo56107c()
            com.google.protos.ag.b.d r5 = (com.google.protos.p4799ag.p4802b.C63164d) r5
            int r5 = r5.f170558a
            com.google.protos.ag.b.b r5 = com.google.protos.p4799ag.p4802b.C63162b.m96189a(r5)
            if (r5 != 0) goto L_0x0590
            com.google.protos.ag.b.b r5 = com.google.protos.p4799ag.p4802b.C63162b.UNKNOWN_ACTION
        L_0x0590:
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x0555
            r3 = 1
            goto L_0x0599
        L_0x0598:
            r3 = 0
        L_0x0599:
            r10 = r1
            r20 = r3
            goto L_0x05a9
        L_0x059d:
            r28 = r1
            r32 = r3
            r26 = r5
            r30 = r12
            r29 = r13
            r25 = r15
        L_0x05a9:
            int r1 = r4.f141747a
            r3 = 2
            if (r1 != r3) goto L_0x0699
            java.lang.Object r1 = r4.f141748b
            com.google.at.g.a.a.ck r1 = (com.google.p4017at.p4056g.p4057a.p4058a.C54030ck) r1
            com.google.at.h.b.a.r r3 = r1.f141759a
            r4 = 28
            r5 = 27
            if (r3 == 0) goto L_0x05d5
            com.google.android.libraries.lens.view.infopanel.e.i r6 = new com.google.android.libraries.lens.view.infopanel.e.i
            r6.<init>(r3)
            r9.add(r6)
            com.google.lens.a.ax r1 = r1.f141760b
            if (r1 == 0) goto L_0x05d1
            if (r10 != 0) goto L_0x05d1
            int r1 = r1.f167625a
            if (r1 != r5) goto L_0x05ce
        L_0x05cc:
            r1 = 0
            goto L_0x05d2
        L_0x05ce:
            if (r1 != r4) goto L_0x05d1
            goto L_0x05cc
        L_0x05d1:
            r1 = 1
        L_0x05d2:
            r10 = r1
            goto L_0x0699
        L_0x05d5:
            com.google.lens.a.ax r3 = r1.f141760b
            if (r3 == 0) goto L_0x0699
            if (r10 != 0) goto L_0x05e4
            int r6 = r3.f167625a
            if (r6 != r5) goto L_0x05e1
        L_0x05df:
            r4 = 0
            goto L_0x05e5
        L_0x05e1:
            if (r6 != r4) goto L_0x05e4
            goto L_0x05df
        L_0x05e4:
            r4 = 1
        L_0x05e5:
            boolean r5 = r2.f73560d
            if (r5 == 0) goto L_0x0603
            int r5 = r3.f167625a
            r6 = 41
            if (r5 != r6) goto L_0x0603
            java.lang.Object r1 = r3.f167626b
            com.google.lens.a.cv r1 = (com.google.lens.p4694a.C62097cv) r1
            com.google.android.libraries.lens.view.srpx.a.c r1 = com.google.android.libraries.lens.view.srpx.p2170a.C28033d.m52241i(r1)
            com.google.android.libraries.lens.view.srpx.a.d r1 = r1.mo33486a()
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
        L_0x05ff:
            r14.f73510b = r1
            goto L_0x0698
        L_0x0603:
            int r5 = r3.f167625a
            r6 = 56
            if (r5 != r6) goto L_0x0690
            com.google.android.libraries.lens.view.connectivity.LensConnectivityManager r5 = r2.f73559c
            boolean r5 = r5.mo30907k()
            if (r5 == 0) goto L_0x0681
            int r1 = r3.f167625a
            if (r1 != r6) goto L_0x061a
            java.lang.Object r1 = r3.f167626b
            com.google.lens.a.dl r1 = (com.google.lens.p4694a.C62114dl) r1
            goto L_0x061c
        L_0x061a:
            com.google.lens.a.dl r1 = com.google.lens.p4694a.C62114dl.f167736e
        L_0x061c:
            com.google.common.base.cr r3 = r2.f73561e
            java.lang.Object r3 = r3.mo6453a()
            com.google.knowledge.e.a.a.a.d r3 = (com.google.knowledge.p4686e.p4687a.p4688a.p4689a.C62004d) r3
            java.lang.String r5 = r1.f167739b
            java.lang.String r6 = r1.f167740c
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r6)
            java.lang.String r7 = r1.f167741d
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)
            r10 = 57
            com.google.ch.b.j r3 = r3.mo58483a(r10, r5, r6, r7)
            byte[] r3 = r3.toByteArray()
            int r5 = r3.length
            byte[] r3 = com.google.common.util.C60789b.m92791a(r3, r5)
            com.google.common.l.i r5 = com.google.common.p4541l.C59326i.f157517e
            com.google.common.l.i r5 = r5.mo56826f()
            int r6 = r3.length
            java.lang.String r3 = r5.mo56837l(r3, r6)
            r5 = 143417(0x23039, float:2.0097E-40)
            com.google.android.libraries.lens.view.srpx.a.c r5 = com.google.android.libraries.lens.view.srpx.p2170a.C28033d.m52240h(r5)
            java.lang.String r1 = r1.f167739b
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            r6 = r5
            com.google.android.libraries.lens.view.srpx.a.a r6 = (com.google.android.libraries.lens.view.srpx.p2170a.C28030a) r6
            r6.f76290a = r1
            java.lang.String r1 = "p"
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            r6.f76293d = r1
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r3)
            r6.f76295f = r1
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r3)
            r6.f76294e = r1
            com.google.android.libraries.lens.view.srpx.a.d r1 = r5.mo33486a()
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            goto L_0x05ff
        L_0x0681:
            com.google.android.libraries.lens.view.infopanel.e.ah r3 = new com.google.android.libraries.lens.view.infopanel.e.ah
            com.google.lens.a.ax r1 = r1.f141760b
            if (r1 != 0) goto L_0x0689
            com.google.lens.a.ax r1 = com.google.lens.p4694a.C62045ax.f167623c
        L_0x0689:
            r3.<init>(r1)
            r9.add(r3)
            goto L_0x0698
        L_0x0690:
            com.google.android.libraries.lens.view.infopanel.e.ah r1 = new com.google.android.libraries.lens.view.infopanel.e.ah
            r1.<init>(r3)
            r9.add(r1)
        L_0x0698:
            r10 = r4
        L_0x0699:
            int r11 = r11 + 1
            r7 = r22
            r4 = r23
            r6 = r24
            r15 = r25
            r5 = r26
            r1 = r28
            r13 = r29
            r12 = r30
            r3 = r32
            goto L_0x038a
        L_0x06af:
            r28 = r1
            r32 = r3
            r26 = r5
            r24 = r6
            r30 = r12
            r29 = r13
            if (r20 != 0) goto L_0x06e7
            com.google.android.libraries.lens.view.infopanel.a.j r1 = com.google.android.libraries.lens.view.infopanel.p2138a.C26974j.f73555a
            com.google.common.base.ax r1 = r8.mo56106b(r1)
            java.lang.Object r1 = r1.mo56109e(r0)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x06e7
            if (r10 == 0) goto L_0x06dc
            com.google.android.libraries.lens.view.infopanel.e.ab r1 = new com.google.android.libraries.lens.view.infopanel.e.ab
            r2 = 2
            r1.<init>(r2)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            goto L_0x06e9
        L_0x06dc:
            com.google.android.libraries.lens.view.infopanel.e.ab r1 = new com.google.android.libraries.lens.view.infopanel.e.ab
            r2 = 1
            r1.<init>(r2)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            goto L_0x06e9
        L_0x06e7:
            r1 = r18
        L_0x06e9:
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89842j(r9)
            r3 = r32
            r3.mo32396d(r2)
            r3.mo32394b(r15)
            r2 = 0
            r3.mo32398f(r2)
            r14.f73511c = r1
            r3.mo32395c(r10)
            com.google.android.libraries.lens.view.infopanel.a.i r1 = r3.mo32393a()
            goto L_0x0735
        L_0x0703:
            r28 = r1
            r26 = r5
            r24 = r6
            r21 = r10
            r19 = r11
            r30 = r12
            r29 = r13
            com.google.protobuf.z r1 = r4.mo29672j()
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            r14.f73513e = r1
        L_0x071b:
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            r3.mo32396d(r1)
            r3.mo32394b(r15)
            r1 = 0
            r3.mo32398f(r1)
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            r14.f73511c = r1
            r1 = 1
            r3.mo32395c(r1)
            com.google.android.libraries.lens.view.infopanel.a.i r1 = r3.mo32393a()
        L_0x0735:
            r12 = r30
            com.google.android.libraries.lens.view.feedback.FeedbackBannerView r2 = r12.f74986f
            if (r2 != 0) goto L_0x0748
            com.google.android.libraries.lens.view.ad.d r2 = r12.f74899U
            com.google.android.libraries.lens.view.main.dn r3 = new com.google.android.libraries.lens.view.main.dn
            r3.<init>(r12)
            com.google.android.libraries.lens.view.ad.c r4 = com.google.android.libraries.lens.view.p2053ad.C24980c.RESULTS_RENDERED
            r2.mo30199b(r3, r4)
            goto L_0x074b
        L_0x0748:
            r12.mo32934U()
        L_0x074b:
            com.google.android.libraries.lens.view.infopanel.a.p r2 = r12.f75005y
            r2.mo32440g(r1)
            com.google.android.libraries.lens.view.infopanel.a.d r1 = r2.mo32435a()
            com.google.android.libraries.lens.view.infopanel.a.d r3 = com.google.android.libraries.lens.view.infopanel.p2138a.C26968d.FULLY_EXPANDED
            if (r1 == r3) goto L_0x075d
            com.google.android.libraries.lens.view.infopanel.a.d r1 = com.google.android.libraries.lens.view.infopanel.p2138a.C26968d.OPEN
            r2.mo32441h(r1)
        L_0x075d:
            com.google.android.libraries.lens.view.z.a r1 = r12.f74998r
            r1.mo33733d()
            com.google.android.libraries.lens.view.main.bq r1 = r12.f74881C
            com.google.android.libraries.lens.view.main.ae r1 = r1.f74816u
            com.google.android.libraries.lens.view.l.h r1 = r1.f74684q
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r1)
            java.lang.Object r1 = r1.mo56111f()
            com.google.android.libraries.lens.view.l.h r1 = (com.google.android.libraries.lens.view.p2148l.C27228h) r1
            com.google.android.libraries.lens.view.onboarding.o r2 = r12.f74996p
            if (r1 != 0) goto L_0x0779
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            goto L_0x077d
        L_0x0779:
            com.google.common.base.ax r1 = r1.mo32673f()
        L_0x077d:
            boolean r3 = r2.f75255i
            if (r3 == 0) goto L_0x0786
            boolean r3 = r2.f75256j
            if (r3 == 0) goto L_0x0786
            goto L_0x07db
        L_0x0786:
            com.google.android.libraries.lens.e.r r3 = com.google.android.libraries.lens.p2014e.C24226r.SAMPLE_IMAGES
            p3186j$.util.Objects.requireNonNull(r3)
            com.google.android.libraries.lens.view.onboarding.n r4 = new com.google.android.libraries.lens.view.onboarding.n
            r4.<init>(r3)
            com.google.common.base.ax r1 = r1.mo56106b(r4)
            r3 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r1 = r1.mo56109e(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x07db
            android.support.v4.app.Fragment r1 = r2.mo33054a()
            if (r1 == 0) goto L_0x07db
            com.google.android.libraries.lens.view.onboarding.r r1 = (com.google.android.libraries.lens.view.onboarding.C27520r) r1
            com.google.android.libraries.lens.view.onboarding.w r1 = r1.mo17754z()
            android.support.v4.app.Fragment r2 = r1.mo33059a()
            boolean r2 = r2 instanceof com.google.android.libraries.lens.view.sampleimages.C27701e
            if (r2 != 0) goto L_0x07db
            com.google.common.util.concurrent.cx r2 = r1.f75295s
            if (r2 != 0) goto L_0x07db
            com.google.common.util.concurrent.db r2 = r1.f75286j
            java.lang.Runnable r3 = com.google.common.util.concurrent.C60901do.f165001a
            r4 = 4
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            com.google.common.util.concurrent.cz r2 = r2.mo29164d(r3, r4, r6)
            r1.f75295s = r2
            com.google.apps.tiktok.concurrent.futuresmixin.e r2 = r1.f75281e
            com.google.common.util.concurrent.cx r3 = r1.f75295s
            com.google.apps.tiktok.concurrent.futuresmixin.d r3 = com.google.apps.tiktok.concurrent.futuresmixin.C46438d.m82810b(r3)
            com.google.apps.tiktok.concurrent.futuresmixin.f r1 = r1.f75292p
            com.google.common.util.concurrent.cx r3 = r3.f121541a
            r4 = 0
            r2.mo50428h(r3, r4, r1)
        L_0x07db:
            r1 = r29
            com.google.android.libraries.lens.e.ab r1 = r1.f74651b
            boolean r2 = r12.f74948ar
            if (r2 != 0) goto L_0x08ba
            com.google.android.libraries.lens.view.main.ff r2 = r12.f74935ae
            com.google.android.libraries.lens.view.l.l r3 = r2.f75063a
            com.google.lens.j.cu r3 = r3.mo32717v()
            int r3 = r3.f168678a
            r4 = 3
            if (r3 != r4) goto L_0x08a4
            com.google.android.libraries.lens.view.l.l r2 = r2.f75063a
            com.google.lens.j.cu r2 = r2.mo32717v()
            int r3 = r2.f168678a
            if (r3 != r4) goto L_0x07ff
            java.lang.Object r2 = r2.f168679b
            com.google.lens.j.cr r2 = (com.google.lens.p4707j.C62468cr) r2
            goto L_0x0801
        L_0x07ff:
            com.google.lens.j.cr r2 = com.google.lens.p4707j.C62468cr.f168665d
        L_0x0801:
            boolean r2 = r2.f168669c
            if (r2 == 0) goto L_0x08a4
            com.google.common.b.gu r1 = r1.mo29670h()
            int r2 = r1.size()
            r3 = 0
        L_0x080e:
            if (r3 >= r2) goto L_0x08a1
            java.lang.Object r4 = r1.get(r3)
            com.google.at.g.a.a.ce r4 = (com.google.p4017at.p4056g.p4057a.p4058a.C54024ce) r4
            int r5 = r4.f141747a
            r6 = 6
            if (r5 != r6) goto L_0x089d
            java.lang.Object r4 = r4.f141748b
            com.google.at.g.a.a.l r4 = (com.google.p4017at.p4056g.p4057a.p4058a.C54060l) r4
            com.google.protobuf.cq r4 = r4.f141842a
            java.util.Iterator r4 = r4.iterator()
        L_0x0825:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x089d
            java.lang.Object r5 = r4.next()
            com.google.at.g.a.a.j r5 = (com.google.p4017at.p4056g.p4057a.p4058a.C54058j) r5
            com.google.at.g.a.a.b r7 = r5.f141833d
            if (r7 != 0) goto L_0x0837
            com.google.at.g.a.a.b r7 = com.google.p4017at.p4056g.p4057a.p4058a.C53992b.f141653e
        L_0x0837:
            int r8 = r7.f141655a
            r9 = 3
            if (r8 != r9) goto L_0x0841
            java.lang.Object r7 = r7.f141656b
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0842
        L_0x0841:
            r7 = r0
        L_0x0842:
            com.google.protobuf.cq r8 = r5.f141837h
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0874
            int r8 = r5.f141838i
            com.google.protobuf.cq r5 = r5.f141837h
            java.util.Iterator r5 = r5.iterator()
        L_0x0852:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0874
            java.lang.Object r9 = r5.next()
            com.google.at.g.a.a.i r9 = (com.google.p4017at.p4056g.p4057a.p4058a.C54057i) r9
            int r10 = r9.f141821a
            if (r8 != r10) goto L_0x0852
            com.google.at.g.a.a.b r7 = r9.f141825e
            if (r7 != 0) goto L_0x0868
            com.google.at.g.a.a.b r7 = com.google.p4017at.p4056g.p4057a.p4058a.C53992b.f141653e
        L_0x0868:
            int r9 = r7.f141655a
            r10 = 3
            if (r9 != r10) goto L_0x0872
            java.lang.Object r7 = r7.f141656b
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0852
        L_0x0872:
            r7 = r0
            goto L_0x0852
        L_0x0874:
            if (r7 == 0) goto L_0x0825
            android.content.Intent r5 = com.google.android.libraries.lens.view.utils.C28133v.m52416b(r7)
            android.net.Uri r7 = r5.getData()
            if (r7 == 0) goto L_0x0825
            java.lang.String r8 = r7.getScheme()
            java.lang.String r7 = r7.getHost()
            java.lang.String r9 = "ae-action"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x0825
            java.lang.String r8 = "text-to-speech"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0825
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r5)
            goto L_0x08a6
        L_0x089d:
            int r3 = r3 + 1
            goto L_0x080e
        L_0x08a1:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x08a6
        L_0x08a4:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x08a6:
            boolean r1 = r0.mo56113h()
            if (r1 == 0) goto L_0x08b7
            com.google.android.libraries.lens.view.at.t r1 = r12.f74883E
            java.lang.Object r0 = r0.mo56107c()
            android.content.Intent r0 = (android.content.Intent) r0
            r1.mo30556f(r0)
        L_0x08b7:
            r0 = 1
            r12.f74948ar = r0
        L_0x08ba:
            r1 = r28
        L_0x08bc:
            com.google.android.libraries.lens.view.main.bq r0 = r1.f74752a
            com.google.android.libraries.lens.view.main.f r2 = r0.f74755A
            int r2 = r2.f75058c
            r3 = 3
            if (r2 != r3) goto L_0x08ca
            com.google.android.libraries.lens.view.main.ae r0 = r0.f74816u
            r0.mo32839p()
        L_0x08ca:
            com.google.at.g.a.a.bo r0 = r26.mo29671i()
            com.google.protobuf.z r0 = r0.f141703a
            android.util.Size r2 = new android.util.Size
            com.google.android.libraries.lens.e.s r3 = r24.mo30614a()
            android.graphics.Bitmap r3 = r3.mo29707c()
            int r3 = r3.getWidth()
            com.google.android.libraries.lens.e.s r4 = r24.mo30614a()
            android.graphics.Bitmap r4 = r4.mo29707c()
            int r4 = r4.getHeight()
            r2.<init>(r3, r4)
            int r3 = r2.getWidth()
            if (r3 <= 0) goto L_0x0981
            int r3 = r2.getHeight()
            if (r3 <= 0) goto L_0x0981
            com.google.common.b.ih r3 = new com.google.common.b.ih
            r3.<init>()
            com.google.android.libraries.lens.view.main.bq r4 = r1.f74752a
            com.google.android.libraries.lens.view.ay.y r4 = r4.f74808m
            com.google.common.b.gu r4 = r4.mo30772f()
            if (r4 == 0) goto L_0x093b
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.google.android.libraries.lens.view.main.bq r5 = r1.f74752a
            com.google.android.libraries.lens.view.ay.y r5 = r5.f74808m
            com.google.common.b.gu r5 = r5.mo30772f()
            int r6 = r5.size()
            r7 = 0
        L_0x091a:
            if (r7 >= r6) goto L_0x093c
            java.lang.Object r8 = r5.get(r7)
            com.google.android.libraries.lens.view.gleam.ci r8 = (com.google.android.libraries.lens.view.gleam.C26504ci) r8
            boolean r9 = r8.mo31766k()
            if (r9 != 0) goto L_0x0938
            com.google.bp.f.b.a.y r9 = r8.f72216j
            r4.add(r9)
            float r8 = r8.mo31757a()
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r3.mo55373c(r8)
        L_0x0938:
            int r7 = r7 + 1
            goto L_0x091a
        L_0x093b:
            r4 = 0
        L_0x093c:
            com.google.common.b.ij r3 = r3.mo55486f()
            com.google.android.libraries.lens.view.main.bq r5 = r1.f74752a
            com.google.android.libraries.lens.view.ay.y r5 = r5.f74808m
            com.google.common.base.ax r5 = r5.mo30771e()
            boolean r6 = r5.mo56113h()
            if (r6 == 0) goto L_0x0965
            java.lang.Object r6 = r5.mo56107c()
            com.google.android.libraries.lens.view.gleam.ci r6 = (com.google.android.libraries.lens.view.gleam.C26504ci) r6
            boolean r6 = r6.mo31766k()
            if (r6 != 0) goto L_0x0965
            java.lang.Object r5 = r5.mo56107c()
            com.google.android.libraries.lens.view.gleam.ci r5 = (com.google.android.libraries.lens.view.gleam.C26504ci) r5
            com.google.common.o.i.cb r3 = com.google.android.libraries.lens.view.session.C27761ax.m51627d(r5, r3)
            goto L_0x0966
        L_0x0965:
            r3 = 0
        L_0x0966:
            int r5 = r2.getWidth()
            int r6 = r2.getHeight()
            r10 = r21
            com.google.common.o.abf r4 = com.google.android.libraries.lens.view.session.C27761ax.m51626c(r10, r4, r5, r6)
            int r5 = r2.getWidth()
            int r2 = r2.getHeight()
            com.google.common.o.i.dg r2 = com.google.android.libraries.lens.view.session.C27761ax.m51628e(r10, r5, r2)
            goto L_0x0984
        L_0x0981:
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0984:
            com.google.android.libraries.lens.view.main.bq r5 = r1.f74752a
            com.google.android.libraries.lens.view.af.av r6 = r5.f74813r
            com.google.android.libraries.lens.view.session.ax r7 = r5.f74778X
            com.google.android.libraries.lens.view.ay.y r5 = r5.f74808m
            com.google.android.libraries.lens.view.am.y r8 = com.google.android.libraries.lens.view.p2069am.C25349y.GLEAM
            int r5 = r5.mo30767a(r8)
            com.google.android.libraries.lens.view.main.bq r8 = r1.f74752a
            com.google.android.libraries.lens.view.main.f r8 = r8.f74755A
            int r8 = r8.f75058c
            com.google.common.o.uf r9 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.common.o.tz r9 = (com.google.common.p4552o.C60548tz) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.common.o.uf r10 = (com.google.common.p4552o.C60555uf) r10
            int r11 = r10.f164093a
            r12 = 2
            r11 = r11 | r12
            r10.f164093a = r11
            r11 = 1091(0x443, float:1.529E-42)
            r10.f164258m = r11
            com.google.common.o.acb r10 = com.google.common.p4552o.acb.f158263r
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.common.o.abd r10 = (com.google.common.p4552o.abd) r10
            com.google.common.o.abh r11 = com.google.common.p4552o.abh.f158201f
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.common.o.abg r11 = (com.google.common.p4552o.abg) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.common.o.abh r12 = (com.google.common.p4552o.abh) r12
            int r13 = r12.f158203a
            r14 = 1
            r13 = r13 | r14
            r12.f158203a = r13
            r12.f158204b = r5
            com.google.protobuf.bv r5 = r11.build()
            com.google.common.o.abh r5 = (com.google.common.p4552o.abh) r5
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.common.o.acb r11 = (com.google.common.p4552o.acb) r11
            r5.getClass()
            r11.f158266b = r5
            int r5 = r11.f158265a
            r5 = r5 | r14
            r11.f158265a = r5
            com.google.common.o.abu r5 = com.google.common.p4552o.abu.f158230f
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.common.o.abr r5 = (com.google.common.p4552o.abr) r5
            int r11 = r8 + -1
            com.google.bp.f.b.a.u r12 = com.google.p4242bp.p4257f.p4260b.p4261a.C56323u.DEFAULT
            com.google.android.libraries.lens.e.w r12 = com.google.android.libraries.lens.p2014e.C24231w.UNKNOWN
            if (r8 == 0) goto L_0x0b97
            if (r11 == 0) goto L_0x0a37
            r8 = 1
            if (r11 == r8) goto L_0x0a26
            r8 = 2
            if (r11 == r8) goto L_0x0a15
            r8 = 3
            if (r11 == r8) goto L_0x0a05
        L_0x0a02:
            r11 = r19
            goto L_0x0a48
        L_0x0a05:
            r5.copyOnWrite()
            com.google.protobuf.bv r11 = r5.instance
            com.google.common.o.abu r11 = (com.google.common.p4552o.abu) r11
            r11.f158235d = r8
            int r8 = r11.f158232a
            r12 = 4
            r8 = r8 | r12
            r11.f158232a = r8
            goto L_0x0a02
        L_0x0a15:
            r12 = 4
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.common.o.abu r8 = (com.google.common.p4552o.abu) r8
            r11 = 1
            r8.f158235d = r11
            int r11 = r8.f158232a
            r11 = r11 | r12
            r8.f158232a = r11
            goto L_0x0a02
        L_0x0a26:
            r12 = 4
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.common.o.abu r8 = (com.google.common.p4552o.abu) r8
            r11 = 2
            r8.f158235d = r11
            int r11 = r8.f158232a
            r11 = r11 | r12
            r8.f158232a = r11
            goto L_0x0a02
        L_0x0a37:
            r12 = 4
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.common.o.abu r8 = (com.google.common.p4552o.abu) r8
            r11 = 0
            r8.f158235d = r11
            int r11 = r8.f158232a
            r11 = r11 | r12
            r8.f158232a = r11
            goto L_0x0a02
        L_0x0a48:
            int r8 = r11.f168605a
            r12 = 1
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0a5f
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.common.o.abu r8 = (com.google.common.p4552o.abu) r8
            r11 = 2
            r8.f158236e = r11
            int r11 = r8.f158232a
            r11 = r11 | 8
            r8.f158232a = r11
            goto L_0x0a92
        L_0x0a5f:
            com.google.lens.j.bm r8 = r11.f168607c
            if (r8 != 0) goto L_0x0a65
            com.google.lens.j.bm r8 = com.google.lens.p4707j.C62436bm.f168595b
        L_0x0a65:
            com.google.lens.j.bv r8 = r8.f168597a
            if (r8 != 0) goto L_0x0a6b
            com.google.lens.j.bv r8 = com.google.lens.p4707j.C62445bv.f168618e
        L_0x0a6b:
            int r8 = r8.f168620a
            r11 = 1
            r8 = r8 & r11
            if (r8 == 0) goto L_0x0a82
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.common.o.abu r8 = (com.google.common.p4552o.abu) r8
            r11 = 3
            r8.f158236e = r11
            int r11 = r8.f158232a
            r11 = r11 | 8
            r8.f158232a = r11
            goto L_0x0a92
        L_0x0a82:
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.common.o.abu r8 = (com.google.common.p4552o.abu) r8
            r11 = 1
            r8.f158236e = r11
            int r11 = r8.f158232a
            r11 = r11 | 8
            r8.f158232a = r11
        L_0x0a92:
            com.google.protobuf.bv r5 = r5.build()
            com.google.common.o.abu r5 = (com.google.common.p4552o.abu) r5
            r10.copyOnWrite()
            com.google.protobuf.bv r8 = r10.instance
            com.google.common.o.acb r8 = (com.google.common.p4552o.acb) r8
            r5.getClass()
            r8.f158267c = r5
            int r5 = r8.f158265a
            r11 = 2
            r5 = r5 | r11
            r8.f158265a = r5
            if (r4 == 0) goto L_0x0abb
            r10.copyOnWrite()
            com.google.protobuf.bv r5 = r10.instance
            com.google.common.o.acb r5 = (com.google.common.p4552o.acb) r5
            r5.f158269e = r4
            int r4 = r5.f158265a
            r4 = r4 | 8
            r5.f158265a = r4
        L_0x0abb:
            if (r2 == 0) goto L_0x0acc
            r10.copyOnWrite()
            com.google.protobuf.bv r4 = r10.instance
            com.google.common.o.acb r4 = (com.google.common.p4552o.acb) r4
            r4.f158274j = r2
            int r2 = r4.f158265a
            r2 = r2 | 512(0x200, float:7.175E-43)
            r4.f158265a = r2
        L_0x0acc:
            if (r3 == 0) goto L_0x0add
            r10.copyOnWrite()
            com.google.protobuf.bv r2 = r10.instance
            com.google.common.o.acb r2 = (com.google.common.p4552o.acb) r2
            r2.f158278n = r3
            int r3 = r2.f158265a
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
            r2.f158265a = r3
        L_0x0add:
            com.google.common.o.aar r2 = r7.mo33231b()
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.common.o.aas r3 = (com.google.common.p4552o.aas) r3
            com.google.protobuf.bv r4 = r10.build()
            com.google.common.o.acb r4 = (com.google.common.p4552o.acb) r4
            com.google.common.o.aas r5 = com.google.common.p4552o.aas.f158145p
            r4.getClass()
            r3.f158149c = r4
            int r4 = r3.f158147a
            r5 = 4
            r4 = r4 | r5
            r3.f158147a = r4
            com.google.protobuf.z r3 = com.google.protobuf.C63088z.f170246b
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x0b15
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.common.o.aas r3 = (com.google.common.p4552o.aas) r3
            r0.getClass()
            int r4 = r3.f158147a
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            r3.f158147a = r4
            r3.f158153g = r0
        L_0x0b15:
            r9.copyOnWrite()
            com.google.protobuf.bv r0 = r9.instance
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            com.google.protobuf.bv r2 = r2.build()
            com.google.common.o.aas r2 = (com.google.common.p4552o.aas) r2
            r2.getClass()
            r0.f164197by = r2
            int r2 = r0.f164253h
            r2 = r2 | 8
            r0.f164253h = r2
            com.google.protobuf.bv r0 = r9.build()
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            r6.mo30241a(r0)
            com.google.bp.f.b.a.dd r0 = r26.mo29673k()
            com.google.common.b.gu r2 = r26.mo29669g()
            com.google.common.base.ax r3 = r26.mo29668f()
            boolean r3 = r3.mo56113h()
            r1.mo32866a(r0, r2, r3)
            com.google.common.base.ax r0 = r26.mo29668f()
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0b8e
            com.google.android.libraries.lens.view.main.bq r0 = r1.f74752a
            com.google.android.libraries.lens.view.flags.b r0 = r0.f74804i
            com.google.android.libraries.lens.view.flags.a r2 = com.google.android.libraries.lens.view.flags.C26239a.SELECTION_STATE_ENABLED
            boolean r0 = r0.mo31462g(r2)
            if (r0 == 0) goto L_0x0b8e
            com.google.android.libraries.lens.view.main.bq r0 = r1.f74752a
            com.google.android.libraries.lens.view.l.l r0 = r0.f74757C
            com.google.common.base.ax r0 = r0.mo32701h()
            boolean r0 = com.google.lens.p4711m.C62632i.m94823h(r0)
            if (r0 != 0) goto L_0x0b8e
            com.google.common.base.ax r0 = r26.mo29668f()
            java.lang.Object r0 = r0.mo56107c()
            com.google.lens.j.go r0 = (com.google.lens.p4707j.C62573go) r0
            java.lang.String r0 = r0.f168936c
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0b8e
            com.google.android.libraries.lens.view.main.bq r1 = r1.f74752a
            g.a.a r1 = r1.f74803h
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.libraries.lens.view.filters.c.f r1 = (com.google.android.libraries.lens.view.filters.p2099c.C25941f) r1
            r1.f70478c = r0
            r1.mo31111d()
        L_0x0b8e:
            android.os.Trace.endSection()
            r1 = 0
            r0 = r33
            r0.f74682o = r1
            return
        L_0x0b97:
            r0 = r33
            r1 = 0
            goto L_0x0b9c
        L_0x0b9b:
            throw r1
        L_0x0b9c:
            goto L_0x0b9b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.main.C27288ae.mo32833j(com.google.android.libraries.lens.view.au.k):void");
    }

    /* renamed from: k */
    public final void mo32834k(C25562l lVar) {
        if (lVar != null) {
            if (lVar.mo30630a() != this.f74669b.f69552b.f69592b) {
                ((C58970a) ((C58970a) f74662a.mo56224b()).mo56372aa(49696)).mo56386p("Ignoring pending query for stale interaction");
                return;
            }
            C25073c cVar = this.f74676i;
            C24203af c = lVar.mo30631b().mo29680c();
            if (cVar.mo30253b()) {
                cVar.mo30252a(C62722b.CANCELLED, C59895bd.f161854d);
            }
            cVar.f68323b.mo19974a(C37194a.f98556cM.mo40816j("lens_query_id", c.toString()));
            cVar.f68324c = 2;
            cVar.f68322a = c;
            C60870cx f = lVar.mo30636f();
            C27285ab abVar = new C27285ab(this, lVar);
            C60856cj.m92911t(f, C47810es.m84974n(abVar), this.f74686s);
            C27286ac acVar = this.f74679l;
            acVar.getClass();
            C27322bl blVar = ((C27326bp) acVar).f74752a.f74787ag;
            blVar.getClass();
            blVar.mo32864n(4);
        }
    }

    /* renamed from: l */
    public final void mo32835l(C25562l lVar) {
        if (lVar != null) {
            if (lVar.mo30630a() != this.f74669b.f69551a.f69592b) {
                ((C58970a) ((C58970a) f74662a.mo56224b()).mo56372aa(49697)).mo56386p("Ignoring pending query for stale prefetch");
                return;
            }
            C27286ac acVar = this.f74679l;
            acVar.getClass();
            C25560j c = lVar.mo30632c();
            if (c.mo30614a().mo29706b() != 0) {
                ((C27326bp) acVar).f74752a.f74775U.mo32193h(c.mo30614a().mo29706b());
            }
            C26526dd ddVar = (C26526dd) ((C27326bp) acVar).f74752a.f74767M;
            ddVar.mo31796p();
            ddVar.f72297g.mo30737h();
        }
    }

    /* renamed from: m */
    public final void mo32836m(C25561k kVar) {
        C58833ax axVar;
        long j;
        C62231l lVar;
        if (kVar != null) {
            if (this.f74692y) {
                m50824A((C54038cs) kVar.mo30623c().mo29696a().mo29734c().mo56109e(C54038cs.f141782f));
            }
            if (kVar.mo30621a() != this.f74669b.f69551a.f69592b) {
                ((C58970a) ((C58970a) f74662a.mo56224b()).mo56372aa(49699)).mo56386p("Ignoring result for stale prefetch");
                return;
            }
            if (this.f74668F != null) {
                C24229u a = kVar.mo30623c().mo29696a();
                C24229u uVar = this.f74668F;
                uVar.getClass();
                if (a.equals(uVar)) {
                    return;
                }
            }
            C27286ac acVar = this.f74679l;
            acVar.getClass();
            C24229u a2 = kVar.mo30623c().mo29696a();
            C25560j d = kVar.mo30624d();
            Trace.beginSection("MainController:showPrefetchResult");
            ((C27326bp) acVar).mo32867b(a2.mo29732a());
            C56220aa j2 = a2.mo29743j();
            C27732a aVar = new C27732a();
            aVar.mo33220b(j2);
            aVar.f75709a = C58833ax.m90834k(a2.mo29738f());
            aVar.f75710b = C58833ax.m90834k(Boolean.valueOf(a2.mo29746m()));
            if (a2.mo29740h().f141818a != null) {
                C54053e eVar = a2.mo29740h().f141818a;
                if (eVar == null) {
                    eVar = C54053e.f141812c;
                }
                axVar = C58833ax.m90834k(eVar);
            } else {
                axVar = C58836b.f156633a;
            }
            C58833ax b = axVar.mo56106b(C27791k.f75826a);
            if (b != null) {
                aVar.f75711c = b;
                aVar.f75712d = C58833ax.m90834k(Boolean.valueOf(a2.mo29747n()));
                aVar.f75713e = d.mo30614a().mo29792n();
                if (d.mo30614a().mo29709e() == C24226r.EXTERNAL) {
                    j = 0;
                } else {
                    j = d.mo30614a().mo29706b();
                }
                aVar.f75714f = j;
                aVar.f75715g = 1;
                C27793m a3 = aVar.mo33219a();
                C27327bq bqVar = ((C27326bp) acVar).f74752a;
                Trace.beginSection("MainController:onDetectedObjectsAvailable");
                C26505cj cjVar = bqVar.f74767M;
                if (!((C25497ac) ((C26526dd) cjVar).f72311u.mo3842a()).mo30527d()) {
                    Trace.beginSection("onDetectedObjectsAvailable");
                    try {
                        if (a3.mo33239e().mo56113h()) {
                            if (((Integer) a3.mo33239e().mo56107c()).intValue() >= ((C26526dd) cjVar).f72303m.intValue()) {
                                ((C26526dd) cjVar).f72303m = (Integer) a3.mo33239e().mo56107c();
                                if (a3.mo33302j()) {
                                    ((C26526dd) cjVar).f72305o = a3;
                                }
                            }
                        }
                        if (a3.mo33302j()) {
                            C26637y yVar = ((C26526dd) cjVar).f72298h;
                            Iterator it = a3.mo33243h().f149750a.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    yVar.f72643a.mo33106i();
                                    break;
                                }
                                Iterator it2 = ((C56327y) it.next()).f150143f.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        C56320r rVar = (C56320r) it2.next();
                                        C56310h hVar = rVar.f150100g;
                                        if (hVar == null) {
                                            hVar = C56310h.f150072g;
                                        }
                                        if (hVar.f150075b == 5) {
                                            C27543c cVar = yVar.f72643a;
                                            C56310h hVar2 = rVar.f150100g;
                                            if (hVar2 == null) {
                                                hVar2 = C56310h.f150072g;
                                            }
                                            if (hVar2.f150075b == 5) {
                                                lVar = (C62231l) hVar2.f150076c;
                                            } else {
                                                lVar = C62231l.f168023e;
                                            }
                                            cVar.mo33114q(lVar);
                                        }
                                    }
                                }
                            }
                        }
                        C26513cr crVar = new C26513cr((C26526dd) cjVar, a3);
                        if (((C25497ac) ((C26526dd) cjVar).f72311u.mo3842a()).mo30525b()) {
                            ((C26526dd) cjVar).f72281D = crVar;
                        } else {
                            ((C26526dd) cjVar).f72281D = null;
                            long j3 = ((C26526dd) cjVar).f72304n;
                            if (j3 == 0 || j3 != a3.mo33235a()) {
                                ((C26526dd) cjVar).f72293c.execute(crVar);
                            } else {
                                a3.mo33235a();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                        Trace.endSection();
                    }
                }
                Trace.endSection();
                a3.mo33243h().f149750a.size();
                if (a2.mo29747n()) {
                    ((C27326bp) acVar).f74752a.f74767M.mo31775k();
                    if (((C27326bp) acVar).f74752a.f74769O.mo31474e()) {
                        C25332h hVar3 = (C25332h) C25333i.f68945c.createBuilder();
                        int width = d.mo30614a().mo29707c().getWidth();
                        hVar3.copyOnWrite();
                        ((C25333i) hVar3.instance).f68947a = width;
                        int height = d.mo30614a().mo29707c().getHeight();
                        hVar3.copyOnWrite();
                        ((C25333i) hVar3.instance).f68948b = height;
                        C27327bq bqVar2 = ((C27326bp) acVar).f74752a;
                        C28072e eVar2 = bqVar2.f74768N;
                        boolean D = bqVar2.mo32871D();
                        ((C28079l) eVar2).f76424l = C58833ax.m90834k(a3);
                        ((C28079l) eVar2).f76419g.mo5708l(C58833ax.m90834k((C25333i) hVar3.build()));
                        ((C28079l) eVar2).f76426n = D;
                        ((C28079l) eVar2).mo33542i();
                    }
                    C27322bl blVar = ((C27326bp) acVar).f74752a.f74787ag;
                    blVar.getClass();
                    blVar.mo32861k(true);
                } else if (a2.mo29746m()) {
                    ((C27326bp) acVar).f74752a.f74767M.mo31775k();
                }
                if (((C27326bp) acVar).f74752a.f74777W.mo31207f(C56306df.TEXT) && ((C27326bp) acVar).f74752a.f74770P.mo30525b()) {
                    if (a2.mo29747n()) {
                        ((C27326bp) acVar).f74752a.f74809n.mo19974a(C37194a.f98464aa);
                    } else if (a2.mo29746m()) {
                        ((C27326bp) acVar).f74752a.f74809n.mo19974a(C37194a.f98465ab);
                    }
                }
                C27327bq bqVar3 = ((C27326bp) acVar).f74752a;
                C25050av avVar = bqVar3.f74813r;
                C27761ax axVar2 = bqVar3.f74778X;
                int b2 = C58557jl.m90121b(C58557jl.m90124e(j2.f149750a, C27325bo.f74751a));
                int a4 = ((C27326bp) acVar).f74752a.f74808m.mo30767a(C25349y.GLEAM);
                int b3 = C58557jl.m90121b(C58557jl.m90124e(j2.f149750a, C27323bm.f74749a));
                int a5 = ((C27326bp) acVar).f74752a.f74808m.mo30767a(C25349y.TEXT_GLEAM);
                boolean n = a2.mo29747n();
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 1227;
                aar b4 = axVar2.mo33231b();
                abd abd = (abd) acb.f158263r.createBuilder();
                abg abg = (abg) abh.f158201f.createBuilder();
                abg.copyOnWrite();
                abh abh = (abh) abg.instance;
                abh.f158203a |= 2;
                abh.f158205c = b2;
                abg.copyOnWrite();
                abh abh2 = (abh) abg.instance;
                abh2.f158203a |= 1;
                abh2.f158204b = a4;
                abg.copyOnWrite();
                abh abh3 = (abh) abg.instance;
                abh3.f158203a |= 8;
                abh3.f158207e = b3;
                abg.copyOnWrite();
                abh abh4 = (abh) abg.instance;
                abh4.f158203a |= 4;
                abh4.f158206d = a5;
                abh abh5 = (abh) abg.build();
                abd.copyOnWrite();
                acb acb = (acb) abd.instance;
                abh5.getClass();
                acb.f158266b = abh5;
                acb.f158265a |= 1;
                abr abr = (abr) abu.f158230f.createBuilder();
                abr.copyOnWrite();
                abu abu = (abu) abr.instance;
                abu.f158232a |= 2;
                abu.f158234c = false;
                abr.copyOnWrite();
                abu abu2 = (abu) abr.instance;
                abu2.f158232a = 1 | abu2.f158232a;
                abu2.f158233b = n;
                abu abu3 = (abu) abr.build();
                abd.copyOnWrite();
                acb acb2 = (acb) abd.instance;
                abu3.getClass();
                acb2.f158267c = abu3;
                acb2.f158265a |= 2;
                b4.copyOnWrite();
                aas aas = (aas) b4.instance;
                acb acb3 = (acb) abd.build();
                aas aas2 = aas.f158145p;
                acb3.getClass();
                aas.f158149c = acb3;
                aas.f158147a |= 4;
                tzVar.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar.instance;
                aas aas3 = (aas) b4.build();
                aas3.getClass();
                ufVar2.f164197by = aas3;
                ufVar2.f164253h |= 8;
                avVar.mo30241a((C60555uf) tzVar.build());
                ((C27326bp) acVar).mo32866a(a2.mo29744k(), a2.mo29739g(), a2.mo29736e().mo56113h());
                if (a2.mo29736e().mo56113h()) {
                    C25941f fVar = (C25941f) ((C27326bp) acVar).f74752a.f74803h.mo17428b();
                    fVar.f70477b = ((C62573go) a2.mo29736e().mo56107c()).f168935b;
                    fVar.mo31111d();
                }
                if (((C27326bp) acVar).f74752a.f74756B && !a2.mo29745l().isEmpty()) {
                    C27322bl blVar2 = ((C27326bp) acVar).f74752a.f74787ag;
                    blVar2.getClass();
                    String l = a2.mo29745l();
                    C27679e y = ((C27384dt) blVar2).mo32959y();
                    y.f75581a = l;
                    y.mo33170b(((C27384dt) blVar2).f74957ba.mo30525b());
                }
                Trace.endSection();
                this.f74668F = kVar.mo30623c().mo29696a();
                return;
            }
            throw new NullPointerException("Null channelResponseIndex");
        }
    }

    /* renamed from: n */
    public final void mo32837n(C27228h hVar, C27777bm bmVar) {
        C58833ax axVar;
        C60870cx cxVar;
        C24231w wVar;
        C58838bb.m90869d(hVar.mo32673f().mo56113h(), "injected image has no source");
        if (this.f74680m != null) {
            ((C58970a) ((C58970a) f74662a.mo56224b()).mo56372aa(49700)).mo56386p("Received new injected image when already frozen");
        }
        mo32827d();
        mo32828e();
        this.f74684q = hVar;
        C28020r rVar = this.f74688u;
        C27232l lVar = this.f74671d;
        C58838bb.m90866a((C24226r) hVar.mo32673f().mo56111f(), "Missing External Image source.");
        C58833ax j = hVar.mo32727j(lVar, (String) rVar.f76263b.mo56111f());
        C58838bb.m90884s(j.mo56113h(), "Injected image has no image data");
        if (((C24226r) hVar.mo32673f().mo56107c()).mo29791a()) {
            axVar = lVar.mo32714t();
        } else {
            axVar = C58836b.f156633a;
        }
        C27227g gVar = C27227g.BITMAP;
        int ordinal = ((C27227g) j.mo56107c()).ordinal();
        if (ordinal == 0) {
            cxVar = rVar.f76262a.mo33478a(hVar, (RectF) axVar.mo56111f());
        } else if (ordinal == 1) {
            cxVar = rVar.f76262a.mo33481d(hVar, (RectF) axVar.mo56111f());
        } else if (ordinal == 2) {
            cxVar = rVar.f76262a.mo33479b(hVar, (RectF) axVar.mo56111f());
        } else if (ordinal != 3) {
            cxVar = null;
        } else {
            cxVar = rVar.f76262a.mo33480c(hVar, (RectF) axVar.mo56111f());
        }
        if (cxVar != null) {
            C60856cj.m92911t(cxVar, C47810es.m84974n(new C27284aa(this, hVar)), this.f74686s);
            this.f74667E = cxVar;
            C62494dq dqVar = (C62494dq) C62496ds.f168723e.createBuilder();
            dqVar.copyOnWrite();
            C62496ds dsVar = (C62496ds) dqVar.instance;
            dsVar.f168725a |= 2;
            dsVar.f168727c = true;
            dqVar.copyOnWrite();
            C62496ds dsVar2 = (C62496ds) dqVar.instance;
            dsVar2.f168726b = 4;
            dsVar2.f168725a |= 1;
            C19559g.m37304c();
            this.f74681n = (C62496ds) dqVar.build();
            mo32841r(cxVar);
            if (bmVar == null) {
                if (!this.f74671d.mo32714t().mo56113h() || !((C24226r) hVar.mo32673f().mo56107c()).mo29791a()) {
                    if (this.f74671d.mo32694a() == C62433bj.NOTIFICATION_RETRY.f168594ao) {
                        wVar = C24231w.BACKGROUND_RETRY;
                    } else {
                        wVar = C24231w.POSTCAPTURE_INJECTED_IMAGE;
                    }
                    bmVar = C27768bd.m51651a(true, wVar);
                } else {
                    bmVar = C27778bn.m51731c((RectF) this.f74671d.mo32714t().mo56107c(), C58836b.f156633a, C24231w.POSTCAPTURE_INJECTED_IMAGE, true);
                }
            }
            mo32845v(bmVar, false, C58836b.f156633a);
            return;
        }
        throw new IllegalStateException("Unhandled image format: ".concat(String.valueOf(String.valueOf(j.mo56107c()))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo32838o() {
        C19559g.m37304c();
        this.f74673f.mo33232a();
        C27459a aVar = this.f74677j;
        if (aVar != null) {
            aVar.mo32998b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo32839p() {
        if (((C58833ax) this.f74670c.mo30594b().mo30656d()).mo56113h()) {
            C24199ab abVar = (C24199ab) ((C25561k) ((C58833ax) this.f74670c.mo30594b().mo30656d()).mo56107c()).mo30623c().mo29699d().mo56107c();
            C25073c cVar = this.f74676i;
            C62722b bVar = C62722b.CANCELLED;
            C59892ba baVar = (C59892ba) C59895bd.f161854d.createBuilder();
            int i = 3;
            if (abVar.mo29672j().mo59173M() && !abVar.mo29665c().mo56113h()) {
                i = 2;
            }
            baVar.copyOnWrite();
            C59895bd bdVar = (C59895bd) baVar.instance;
            bdVar.f161857b = i - 1;
            bdVar.f161856a |= 1;
            cVar.mo30252a(bVar, (C59895bd) baVar.build());
        }
    }

    /* renamed from: q */
    public final void mo32840q() {
        this.f74669b.mo30608e(((C25989d) this.f74674g.mo27525b()).f70643b);
        mo32846w();
    }

    /* renamed from: r */
    public final void mo32841r(C60870cx cxVar) {
        C62496ds dsVar = this.f74681n;
        this.f74681n = C62496ds.f168723e;
        this.f74668F = null;
        C25550af afVar = this.f74669b;
        C27432l lVar = new C27432l(dsVar);
        afVar.mo30610g(C60922j.m93044g(cxVar, C47810es.m84963c(lVar), C60826bg.f164896a));
        C27763az azVar = this.f74673f;
        synchronized (azVar.f75768a) {
            azVar.f75769b = false;
            azVar.f75770c = true;
        }
        C27459a aVar = this.f74677j;
        if (aVar != null) {
            aVar.mo32997a();
        }
    }

    /* renamed from: t */
    public final void mo32843t(C27777bm bmVar, C58833ax axVar) {
        C27287ad adVar;
        C19559g.m37304c();
        if (mo32848y(bmVar)) {
            adVar = C27287ad.FRESH_PREFETCH_BEFORE_FINAL;
        } else if (((C25989d) this.f74674g.mo27525b()).mo31203a().mo31195l() && !bmVar.mo33257d() && (!(bmVar instanceof C27772bh) ? !(!(bmVar instanceof C27774bj) || bmVar.mo33256c() != C24231w.REGION_GLEAM) : bmVar.mo33256c() == C24231w.RETICLE_SELECTION || bmVar.mo33256c() == C24231w.GLEAM)) {
            adVar = C27287ad.FINAL_BEFORE_FRESH_PREFETCH;
        } else if (((C25989d) this.f74674g.mo27525b()).mo31207f(C56306df.TEXT)) {
            adVar = C27287ad.FINAL_BEFORE_FRESH_PREFETCH;
        } else if (((C25989d) this.f74674g.mo27525b()).mo31207f(C56306df.OUTDOOR) || ((C25989d) this.f74674g.mo27525b()).mo31207f(C56306df.TRANSLATE) || ((C25989d) this.f74674g.mo27525b()).mo31207f(C56306df.DINING)) {
            adVar = C27287ad.FRESH_PREFETCH_BEFORE_FINAL;
        } else {
            adVar = C27287ad.FINAL_WITH_LAST_PREFETCH;
        }
        m50828z();
        if (mo32846w()) {
            mo32845v(bmVar, false, axVar);
        } else if (this.f74680m != null || (((C58833ax) this.f74669b.f69551a.mo30656d()).mo56113h() && this.f74684q != null)) {
            mo32845v(bmVar, true, axVar);
        } else {
            if ((this.f74693z && m50827D(C56306df.AUTO_FILTER)) || !this.f74673f.mo33234c()) {
                adVar = C27287ad.FRESH_PREFETCH_BEFORE_FINAL;
            }
            ((C58970a) ((C58970a) f74662a.mo56224b()).mo56372aa(49704)).mo56389s("Using FinalWithOptionalPrefetchType=%s", adVar);
            int ordinal = adVar.ordinal();
            if (ordinal == 0) {
                mo32845v(bmVar, true, axVar);
            } else if (ordinal == 1) {
                mo32845v(bmVar, false, axVar);
                C62496ds a = C28099aa.m52378a(bmVar, false);
                String name = bmVar.mo33256c().name();
                mo32842s(a, "FINAL_BEFORE_FRESH_PREFETCH ".concat(String.valueOf(name)), new C27438r(this, bmVar));
            } else if (ordinal == 2) {
                C62496ds a2 = C28099aa.m52378a(bmVar, true);
                String name2 = bmVar.mo33256c().name();
                mo32842s(a2, "FRESH_FETCH_BEFORE_FINAL ".concat(String.valueOf(name2)), new C27428h(this, bmVar, axVar));
            }
            C27459a aVar = this.f74677j;
            if (aVar != null) {
                aVar.mo32999c();
                C27459a aVar2 = this.f74677j;
                adVar.name();
                aVar2.mo33001e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo32844u(C56251be beVar) {
        C24231w wVar;
        C19559g.m37304c();
        m50828z();
        if (beVar != null) {
            C62592z zVar = beVar.f149848b;
            if (zVar == null) {
                zVar = C62592z.f168985c;
            }
            if ((zVar.f168987a & 1) != 0) {
                C62592z zVar2 = beVar.f149848b;
                if (zVar2 == null) {
                    zVar2 = C62592z.f168985c;
                }
                C62478da daVar = zVar2.f168988b;
                if (daVar == null) {
                    daVar = C62478da.f168682b;
                }
                if (Collection.EL.stream(daVar.f168684a).anyMatch(C27433m.f75077a)) {
                    wVar = C24231w.MATH_EDITOR;
                    m50825B(C25574x.m47163g(C27768bd.m51651a(true, wVar), beVar, this.f74689v.mo31318k(), (Size) this.f74690w.mo31828a().mo56111f(), this.f74683p, (abp) null));
                }
            }
        }
        wVar = C24231w.SCREEN;
        m50825B(C25574x.m47163g(C27768bd.m51651a(true, wVar), beVar, this.f74689v.mo31318k(), (Size) this.f74690w.mo31828a().mo56111f(), this.f74683p, (abp) null));
    }

    /* renamed from: v */
    public final void mo32845v(C27777bm bmVar, boolean z, C58833ax axVar) {
        if (!((C58833ax) this.f74669b.f69551a.mo30656d()).mo56113h()) {
            C58970a aVar = (C58970a) f74662a.mo56225c();
            aVar.mo56380ai(C58979ad.FULL);
            ((C58970a) aVar.mo56372aa(49706)).mo56386p("Prefetch image isn't available. Selection request discarded.");
            return;
        }
        if (z && (!this.f74663A || this.f74680m == null)) {
            mo32830g(false, C58833ax.m90834k(bmVar));
        }
        if (!TextUtils.isEmpty((CharSequence) axVar.mo56106b(C27436p.f75080a).mo56109e(BuildConfig.FLAVOR))) {
            C26982r rVar = (C26982r) axVar.mo56107c();
            C60214n nVar = this.f74683p;
            C56250bd bdVar = (C56250bd) C56251be.f149845d.createBuilder();
            C62479db dbVar = (C62479db) C62480dc.f168685c.createBuilder();
            String b = rVar.mo32428b();
            dbVar.copyOnWrite();
            C62480dc dcVar = (C62480dc) dbVar.instance;
            b.getClass();
            dcVar.f168687a |= 1;
            dcVar.f168688b = b;
            C62480dc dcVar2 = (C62480dc) dbVar.build();
            bdVar.copyOnWrite();
            C56251be beVar = (C56251be) bdVar.instance;
            dcVar2.getClass();
            beVar.f149849c = dcVar2;
            beVar.f149847a |= 4;
            m50825B(C25574x.m47163g(bmVar, (C56251be) bdVar.build(), this.f74689v.mo31318k(), (Size) this.f74690w.mo31828a().mo56111f(), nVar, rVar.mo32427a()));
            return;
        }
        m50825B(C25574x.m47163g(bmVar, (C56251be) null, this.f74689v.mo31318k(), (Size) this.f74690w.mo31828a().mo56111f(), this.f74683p, (abp) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo32846w() {
        if (this.f74678k || this.f74666D == null || ((C58833ax) this.f74669b.f69551a.mo30656d()).mo56113h()) {
            return false;
        }
        m50828z();
        C62494dq dqVar = (C62494dq) this.f74681n.toBuilder();
        dqVar.copyOnWrite();
        C62496ds dsVar = (C62496ds) dqVar.instance;
        dsVar.f168725a |= 2;
        dsVar.f168727c = true;
        C19559g.m37304c();
        this.f74681n = (C62496ds) dqVar.build();
        C60870cx cxVar = this.f74666D;
        cxVar.getClass();
        mo32841r(cxVar);
        return true;
    }

    /* renamed from: x */
    public final boolean mo32847x(C62496ds dsVar, C56220aa aaVar) {
        m50828z();
        C60870cx cxVar = (C60870cx) ((C58833ax) this.f74669b.f69551a.mo30656d()).mo56111f();
        if (cxVar == null) {
            return false;
        }
        C27435o oVar = new C27435o(aaVar);
        C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(oVar), C60826bg.f164896a);
        C19559g.m37304c();
        this.f74681n = dsVar;
        mo32841r(g);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final boolean mo32848y(C27777bm bmVar) {
        if (bmVar.mo33260h() == 1 && ((bmVar.mo33256c() == C24231w.TEXT || bmVar.mo33256c() == C24231w.TRANSLATED_TEXT) && !bmVar.mo33257d())) {
            return true;
        }
        if (m50827D(C56306df.EDUCATION) && !bmVar.mo33257d() && (((bmVar instanceof C27772bh) && bmVar.mo33256c() == C24231w.TEXT) || bmVar.mo33256c() == C24231w.FILTER_SHUTTER)) {
            return true;
        }
        if (!((C25989d) this.f74674g.mo27525b()).mo31203a().mo31196m() || bmVar.mo33260h() != 3 || bmVar.mo33256c() != C24231w.RETICLE_SELECTION || bmVar.mo33257d()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo32827d() {
        if (this.f74684q != null) {
            this.f74684q = null;
            C60870cx cxVar = this.f74667E;
            cxVar.getClass();
            cxVar.cancel(false);
            this.f74667E = null;
        }
    }

    /* renamed from: s */
    public final void mo32842s(C62496ds dsVar, String str, Runnable runnable) {
        this.f74685r = new C27440t(this, dsVar, runnable);
        C27286ac acVar = this.f74679l;
        acVar.getClass();
        C27326bp bpVar = (C27326bp) acVar;
        if (!bpVar.f74752a.f74770P.mo30526c()) {
            C59052c cVar = (C59052c) C27327bq.f74753a.mo56225c();
            cVar.mo56378ag(C38505d.f101864b, 202136602);
            cVar.mo56380ai(C58979ad.FULL);
            ((C59052c) cVar.mo56372aa(49724)).mo56360M("requestNextImage called in imageMode=%s, entrypointType=%s, filter=%s, context=%s)", C61301b.m93812a(bpVar.f74752a.f74770P.name()), C61301b.m93812a(bpVar.f74752a.f74798c.name()), C61301b.m93812a(bpVar.f74752a.f74777W.f70642a.f70649b.name()), C61301b.m93812a(str));
            return;
        }
        C26765q qVar = bpVar.f74752a.f74766L;
        qVar.getClass();
        qVar.mo32117h();
    }

    /* renamed from: h */
    public final void mo32831h(C25563m mVar) {
        if (mVar == null) {
            return;
        }
        if (mVar.mo30640b() == 2 || this.f74682o) {
            C27286ac acVar = this.f74679l;
            acVar.getClass();
            C27326bp bpVar = (C27326bp) acVar;
            C26526dd ddVar = (C26526dd) bpVar.f74752a.f74767M;
            ddVar.f72293c.execute(C47810es.m84977q(new C26512cq(ddVar)));
            bpVar.f74752a.f74768N.mo33534c();
            bpVar.f74752a.f74775U.mo32190e();
            if (mVar.mo30639a() instanceof C70761fa) {
                Throwable cause = mVar.mo30639a().getCause();
                if (cause instanceof UserRecoverableAuthException) {
                    C27322bl blVar = bpVar.f74752a.f74787ag;
                    blVar.getClass();
                    C26980p pVar = ((C27384dt) blVar).f75005y;
                    Intent a = ((UserRecoverableAuthException) cause).mo117772a();
                    C58838bb.m90866a(a, "Auth exception intent");
                    C27164f fVar = new C27164f(a);
                    C26971g p = C26973i.m50040p();
                    p.mo32396d(C58485gu.m89846n(fVar));
                    ((C26961a) p).f73511c = C58836b.f156633a;
                    p.mo32398f(false);
                    p.mo32394b(C26965d.m50011g());
                    p.mo32395c(false);
                    pVar.mo32440g(p.mo32393a());
                    pVar.mo32441h(C26968d.OPEN);
                    return;
                }
            }
            C27322bl blVar2 = bpVar.f74752a.f74787ag;
            blVar2.getClass();
            blVar2.mo32864n(5);
            C27322bl blVar3 = bpVar.f74752a.f74787ag;
            blVar3.getClass();
            blVar3.mo32861k(true);
        }
    }
}
