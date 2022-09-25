package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.p7598a;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88469s;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88474x;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7596b.C97053d;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7596b.C97059j;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7596b.C97061l;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7596b.C97062m;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7596b.C97064o;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.C97065a;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97093h;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.p7601a.C97079a;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7586b.C96988f;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7586b.C96994l;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C96997b;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C97015t;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97041d;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97042e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.c.a.e */
/* compiled from: PG */
public final class C97070e implements C97079a, C97065a {

    /* renamed from: a */
    public final C97073h f271232a;

    /* renamed from: b */
    public final C97067b f271233b;

    /* renamed from: c */
    public Runnable f271234c;

    /* renamed from: d */
    public int f271235d = 1;

    /* renamed from: e */
    private final C97093h f271236e;

    /* renamed from: f */
    private final C97072g f271237f;

    /* renamed from: g */
    private final C22871g f271238g;

    /* renamed from: h */
    private final C88474x f271239h;

    /* renamed from: i */
    private final int f271240i;

    public C97070e(C97093h hVar, C97073h hVar2, C97072g gVar, C97067b bVar, C22871g gVar2, C88474x xVar, int i) {
        this.f271236e = hVar;
        this.f271232a = hVar2;
        this.f271237f = gVar;
        this.f271233b = bVar;
        this.f271238g = gVar2;
        this.f271239h = xVar;
        this.f271240i = i;
    }

    /* renamed from: i */
    private final void m160670i(C97015t tVar) {
        this.f271232a.mo90436a(tVar);
        if ((tVar.f271117a & 16) != 0) {
            C97072g gVar = this.f271237f;
            C96994l lVar = tVar.f271122f;
            if (lVar == null) {
                lVar = C96994l.f271061e;
            }
            C96988f a = C97053d.m160642a(tVar);
            if (!C97072g.m160680b(lVar)) {
                ((C59052c) ((C59052c) C97072g.f271242a.mo56225c()).mo56372aa(18365)).mo56389s("Invalid update config: [%s]", lVar);
                gVar.f271244c.mo90425f();
                return;
            }
            gVar.f271245d = gVar.f271243b.mo26870b();
            gVar.f271246e = (long) lVar.f271066d;
            C97053d dVar = gVar.f271244c;
            C97062m a2 = C97072g.m160679a(lVar);
            C97071f fVar = new C97071f(gVar);
            Uri d = dVar.f271207f.mo90398d(a);
            C58838bb.m90869d(!d.toString().isEmpty(), "startPolling called with empty uri");
            dVar.f271211j.equals(d);
            dVar.f271210i = a;
            dVar.f271213l = fVar;
            dVar.f271211j = d;
            dVar.f271212k = a2;
            dVar.f271215n = C97061l.f271200d;
            dVar.mo90424e();
            C97064o oVar = dVar.f271209h;
            oVar.f271217b = new C97059j(dVar);
            C58976aa aaVar = C58975e.f156826a;
            oVar.f271218c = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            oVar.f271216a.registerReceiver(oVar, intentFilter);
            return;
        }
        this.f271237f.f271244c.mo90425f();
    }

    /* renamed from: a */
    public final void mo90428a() {
        this.f271236e.mo90459b(2);
    }

    /* renamed from: b */
    public final void mo90429b() {
        Object obj;
        this.f271237f.f271247f = new C97069d(this);
        C88474x xVar = this.f271239h;
        C62940bt r1 = C62942bv.checkIsLite(C97015t.f271115m);
        xVar.mo58887l(r1);
        Object l = xVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C97015t tVar = (C97015t) obj;
        int a = C88469s.m142817a(this.f271239h.f239176c);
        int i = 3;
        if (a == 0) {
            a = 3;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            m160670i(C97066a.m160668a(tVar));
        } else if (i2 == 2) {
            m160670i(tVar);
        } else {
            throw new C97041d("Unspecified initialization mode");
        }
        int a2 = C88469s.m142817a(this.f271239h.f239176c);
        if (a2 != 0) {
            i = a2;
        }
        this.f271235d = i;
    }

    /* renamed from: c */
    public final void mo90430c() {
        this.f271237f.f271244c.mo90425f();
    }

    /* renamed from: d */
    public final void mo90431d() {
        this.f271236e.mo90459b(1);
    }

    /* renamed from: e */
    public final void mo90432e(Runnable runnable) {
        this.f271234c = runnable;
    }

    /* renamed from: f */
    public final boolean mo90433f() {
        return false;
    }

    /* renamed from: g */
    public final void mo90434g() {
    }

    /* renamed from: h */
    public final void mo90435h(C96997b bVar) {
        this.f271236e.mo90459b(1);
        C97042e.m160627c(C59743a.LIVE_RESULTS_BUBBLE_MORE_INFO_EVENT, 3, this.f271240i);
        this.f271238g.mo28213m("openImmersiveEvent", 200, new C97068c(this, bVar));
    }
}
