package com.google.android.apps.gsa.staticplugins.p7761cz.p7762a;

import com.google.android.apps.gsa.p6487s3.C84290h;
import com.google.android.apps.gsa.p6487s3.C84294l;
import com.google.android.apps.gsa.p6487s3.C84295m;
import com.google.android.apps.gsa.p6487s3.C84330s;
import com.google.android.apps.gsa.p6487s3.C84332u;
import com.google.android.apps.gsa.p6487s3.C84333v;
import com.google.android.apps.gsa.p8889z.p8917f.p8918a.C119072a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cz.a.d */
/* compiled from: PG */
public final class C99241d implements C84294l {

    /* renamed from: a */
    private static final C59071e f277627a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cz.a.d");

    /* renamed from: b */
    private final C90931ca f277628b;

    /* renamed from: c */
    private final C84295m f277629c;

    /* renamed from: d */
    private final C89012aj f277630d;

    /* renamed from: e */
    private final C89061q f277631e;

    /* renamed from: f */
    private final C119072a f277632f;

    /* renamed from: g */
    private final C92439c f277633g;

    /* renamed from: h */
    private final C84332u f277634h;

    /* renamed from: i */
    private final boolean f277635i;

    /* renamed from: j */
    private final int f277636j;

    /* renamed from: k */
    private final boolean f277637k;

    /* renamed from: l */
    private final C68214a f277638l;

    /* renamed from: m */
    private final C86124t f277639m;

    /* renamed from: n */
    private final String f277640n;

    /* renamed from: o */
    private boolean f277641o;

    /* renamed from: p */
    private C99243f f277642p;

    /* renamed from: q */
    private C84333v f277643q;

    /* renamed from: r */
    private final C99239b f277644r = new C99239b(this);

    public C99241d(C90931ca caVar, C84295m mVar, C89012aj ajVar, C89061q qVar, C119072a aVar, C92439c cVar, C84332u uVar, boolean z, int i, boolean z2, C68214a aVar2, C86124t tVar, String str) {
        this.f277628b = caVar;
        this.f277629c = mVar;
        this.f277630d = ajVar;
        this.f277631e = qVar;
        this.f277632f = aVar;
        this.f277633g = cVar;
        this.f277634h = uVar;
        this.f277635i = z;
        this.f277636j = i;
        this.f277637k = z2;
        this.f277638l = aVar2;
        this.f277639m = tVar;
        this.f277640n = str;
    }

    /* renamed from: e */
    private final void m164570e() {
        C58976aa aaVar = C58975e.f156826a;
        C84333v vVar = this.f277643q;
        if (vVar != null) {
            vVar.mo77826a();
            this.f277643q = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo77824a() {
        C58838bb.m90884s(!this.f277641o, "Duplicate call to start.");
        this.f277641o = true;
        mo91388d(this.f277631e, false);
    }

    /* renamed from: b */
    public final synchronized void mo77825b() {
        C58838bb.m90884s(this.f277641o, "Call to close without start.");
        this.f277641o = false;
        m164570e();
        this.f277633g.mo87119b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo91387c(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f277641o) {
            C59104x d = f277627a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NetworkRecognitionRnr");
            ((C59052c) ((C59052c) d).mo56372aa(31736)).mo56386p("Can't retry, session already closed.");
            return;
        }
        m164570e();
        C89061q qVar = this.f277631e;
        if (z) {
            this.f277633g.mo87120c();
            int a = this.f277634h.mo77828a();
            if (a > 0) {
                this.f277628b.mo85137b(new C99240c(this, qVar), (long) a);
                return;
            }
        }
        mo91388d(qVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo91388d(C89061q qVar, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        this.f277642p = new C99243f(this.f277629c, this.f277634h, this.f277644r);
        if (this.f277637k) {
            C59104x b = f277627a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NetworkRecognitionRnr");
            ((C59052c) ((C59052c) b).mo56372aa(31739)).mo56386p("Using gRPC for connection");
            this.f277643q = new C84290h(this.f277628b, this.f277630d, this.f277638l, this.f277632f, C58833ax.m90833j(this.f277640n));
        } else {
            C59104x b2 = f277627a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "NetworkRecognitionRnr");
            ((C59052c) ((C59052c) b2).mo56372aa(31738)).mo56386p("Using pair HTTP connection");
            this.f277643q = new C84330s(this.f277628b, this.f277632f.mo104108d(), this.f277630d, qVar, this.f277635i, z, this.f277636j, this.f277639m);
        }
        C84333v vVar = this.f277643q;
        C99243f fVar = this.f277642p;
        fVar.getClass();
        vVar.mo77827b(fVar, this.f277633g);
    }
}
