package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import android.os.Bundle;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88253uv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88254uw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88255ux;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88272vn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88273vo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88274vp;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.C101718a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.C101725ag;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66595bu;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.ap */
/* compiled from: PG */
public final class C101942ap extends C101943aq {

    /* renamed from: a */
    public static final C59071e f284399a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.ap");

    /* renamed from: b */
    public final C68214a f284400b;

    /* renamed from: c */
    public final boolean f284401c;

    /* renamed from: d */
    public final boolean f284402d;

    /* renamed from: e */
    public final C22871g f284403e;

    /* renamed from: f */
    public final C101860a f284404f;

    /* renamed from: g */
    public final String f284405g;

    /* renamed from: h */
    public final C86124t f284406h;

    /* renamed from: i */
    final C92380d f284407i;

    /* renamed from: j */
    public C87673aa f284408j;

    /* renamed from: k */
    public Map f284409k;

    /* renamed from: l */
    public final C101983x f284410l;

    /* renamed from: n */
    private final C74555u f284411n;

    /* renamed from: o */
    private final C101718a f284412o;

    /* renamed from: p */
    private final C87677ae f284413p;

    /* renamed from: q */
    private final C90932cb f284414q;

    /* renamed from: r */
    private final C92486a f284415r;

    /* renamed from: s */
    private final boolean f284416s;

    /* renamed from: t */
    private final boolean f284417t;

    /* renamed from: u */
    private final C90584f f284418u;

    /* renamed from: v */
    private final C101945as f284419v;

    /* renamed from: w */
    private final C90936cf f284420w = new C101939am(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101942ap(C101983x xVar, C92380d dVar, boolean z, C74555u uVar, C101718a aVar, C101725ag agVar, C87677ae aeVar, C68214a aVar2, C90932cb cbVar, C92486a aVar3, C101945as asVar, C22871g gVar, C101860a aVar4, C89994f fVar, C90584f fVar2, String str, C86124t tVar) {
        super(aVar, agVar);
        C101725ag agVar2 = agVar;
        this.f284411n = uVar;
        this.f284407i = dVar;
        this.f284402d = z;
        this.f284410l = xVar;
        this.f284412o = aVar;
        this.f284413p = aeVar;
        this.f284400b = aVar2;
        this.f284414q = cbVar;
        this.f284415r = aVar3;
        this.f284419v = asVar;
        this.f284403e = gVar;
        this.f284416s = uVar.mo70891j();
        this.f284401c = uVar.mo70887e().mo70853a().mo70880d();
        boolean z2 = false;
        if (uVar.mo70892k() && fVar.mo83834w()) {
            z2 = true;
        }
        this.f284417t = z2;
        this.f284418u = fVar2;
        this.f284404f = aVar4;
        this.f284405g = str;
        this.f284406h = tVar;
    }

    /* renamed from: a */
    public final C101945as mo92724a() {
        return this.f284419v;
    }

    /* renamed from: b */
    public final C60870cx mo92725b() {
        return C2169h.m6027a(new C101937ak(this, this.f284415r.mo87228a(this.f284416s), !this.f284416s));
    }

    /* renamed from: c */
    public final void mo92726c() {
        this.f284409k.clear();
    }

    /* renamed from: d */
    public final void mo92727d() {
        C59104x b = f284399a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordDController");
        ((C59052c) ((C59052c) b).mo56372aa(20498)).mo56386p("#connect");
        C87673aa aaVar = this.f284408j;
        if (aaVar != null) {
            if (!aaVar.mo81953y()) {
                aaVar.mo81947s((Bundle) null);
            }
            this.f284408j.mo81932c();
        }
    }

    /* renamed from: e */
    public final void mo92728e() {
        C59104x b = f284399a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordDController");
        ((C59052c) ((C59052c) b).mo56372aa(20499)).mo56386p("#disconnect");
        C87673aa aaVar = this.f284408j;
        if (aaVar != null) {
            aaVar.mo81948t(false);
            this.f284408j.mo81933e();
        }
        this.f284412o.mo92525b();
        mo92726c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r9.f284418u == com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92729f() {
        /*
            r9 = this;
            boolean r0 = r9.f284417t
            r1 = 1
            if (r0 != 0) goto L_0x0018
            com.google.android.apps.gsa.h.s.u r0 = r9.f284411n
            com.google.android.apps.gsa.h.s.ae r0 = r0.mo70887e()
            boolean r0 = r0.mo70856e()
            r2 = 0
            if (r0 == 0) goto L_0x0019
            com.google.android.apps.gsa.shared.speech.hotword.a.f r0 = r9.f284418u
            com.google.android.apps.gsa.shared.speech.hotword.a.f r3 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE
            if (r0 != r3) goto L_0x0019
        L_0x0018:
            r2 = 1
        L_0x0019:
            java.lang.String r0 = r9.f284405g
            boolean r3 = r9.f284416s
            boolean r4 = r9.f284402d
            if (r4 == 0) goto L_0x0027
            r5 = 4398046511136(0x40000000020, double:2.1729236899642E-311)
            goto L_0x002c
        L_0x0027:
            r5 = 4398046515200(0x40000001000, double:2.172923691972E-311)
        L_0x002c:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0035
            r7 = 2251799813685248(0x8000000000000, double:1.1125369292536007E-308)
            long r5 = r5 | r7
        L_0x0035:
            if (r3 == 0) goto L_0x003b
            r7 = 1048576(0x100000, double:5.180654E-318)
            long r5 = r5 | r7
        L_0x003b:
            if (r2 == 0) goto L_0x0043
            r2 = 34359738368(0x800000000, double:1.69759663277E-313)
            long r5 = r5 | r2
        L_0x0043:
            com.google.android.apps.gsa.search.shared.service.g r0 = new com.google.android.apps.gsa.search.shared.service.g
            r0.<init>()
            r0.f239199a = r5
            if (r4 == 0) goto L_0x004f
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.TI_SID_ENROLLMENT
            goto L_0x0051
        L_0x004f:
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.SPEAKER_ID_ENROLLMENT
        L_0x0051:
            r0.f239201c = r2
            if (r1 == r4) goto L_0x0058
            java.lang.String r1 = "search"
            goto L_0x005a
        L_0x0058:
            java.lang.String r1 = "tisid_enrollment"
        L_0x005a:
            r0.f239204f = r1
            com.google.android.apps.gsa.search.shared.service.ClientConfig r1 = new com.google.android.apps.gsa.search.shared.service.ClientConfig
            r1.<init>(r0)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.ao r0 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.ao
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.as r2 = r9.f284419v
            r0.<init>(r9, r2)
            com.google.android.apps.gsa.search.shared.service.ae r2 = r9.f284413p
            com.google.android.apps.gsa.search.shared.service.aa r0 = r2.mo81958a(r0, r0, r1)
            r9.f284408j = r0
            r1 = 0
            r0.mo81947s(r1)
            boolean r0 = r9.f284417t
            if (r0 == 0) goto L_0x0097
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.d r0 = r9.f284407i
            boolean r0 = r0.f257607f
            if (r0 == 0) goto L_0x0097
            com.google.common.f.e r0 = f284399a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "HotwordDController"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Trying to initialize adapter"
            r2 = 20500(0x5014, float:2.8727E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.a r0 = r9.f284412o
            r0.mo92526c()
        L_0x0097:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.f284409k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e.C101942ap.mo92729f():void");
    }

    /* renamed from: g */
    public final void mo92730g(Bundle bundle) {
        C87673aa aaVar = this.f284408j;
        if (aaVar != null) {
            aaVar.mo81942n(bundle);
        }
    }

    /* renamed from: h */
    public final void mo92731h(String str) {
        C59104x b = f284399a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordDController");
        ((C59052c) ((C59052c) b).mo56372aa(20501)).mo56389s("set expected query: %s", str);
        C87673aa aaVar = this.f284408j;
        String c = this.f284404f.mo92638c();
        C88489j jVar = new C88489j(C87739bu.SET_EXPECTED_TISID_ENROLLMENT_QUERY);
        C62940bt btVar = C88253uv.f238713a;
        C88254uw uwVar = (C88254uw) C88255ux.f238714d.createBuilder();
        uwVar.copyOnWrite();
        C88255ux uxVar = (C88255ux) uwVar.instance;
        str.getClass();
        uxVar.f238716a |= 1;
        uxVar.f238717b = str;
        uwVar.copyOnWrite();
        C88255ux uxVar2 = (C88255ux) uwVar.instance;
        uxVar2.f238716a |= 2;
        uxVar2.f238718c = c;
        jVar.mo82014b(btVar, (C88255ux) uwVar.build());
        aaVar.mo81937i(jVar.mo82013a());
    }

    /* renamed from: i */
    public final void mo92732i(boolean z) {
        if (z) {
            C58976aa aaVar = C58975e.f156826a;
            this.f284414q.mo85150o(this.f284420w, 300);
            return;
        }
        this.f284414q.mo85149n(this.f284420w);
        this.f284408j.mo81943o(false);
    }

    /* renamed from: j */
    public final void mo92733j(C66595bu buVar) {
        C59104x b = f284399a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordDController");
        ((C59052c) ((C59052c) b).mo56372aa(20503)).mo56386p("set impersonated user");
        C87673aa aaVar = this.f284408j;
        C88489j jVar = new C88489j(C87739bu.SET_TISID_IMPERSONATED_USER);
        C62940bt btVar = C88272vn.f238754a;
        C88273vo voVar = (C88273vo) C88274vp.f238755c.createBuilder();
        voVar.copyOnWrite();
        C88274vp vpVar = (C88274vp) voVar.instance;
        buVar.getClass();
        vpVar.f238758b = buVar;
        vpVar.f238757a |= 1;
        jVar.mo82014b(btVar, (C88274vp) voVar.build());
        aaVar.mo81937i(jVar.mo82013a());
    }
}
