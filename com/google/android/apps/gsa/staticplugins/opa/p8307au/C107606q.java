package com.google.android.apps.gsa.staticplugins.opa.p8307au;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90024cc;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.p8307au.p8309b.C107590b;
import com.google.android.apps.gsa.staticplugins.opa.util.C113859cn;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.au.q */
/* compiled from: PG */
public final class C107606q {

    /* renamed from: a */
    public static final C59071e f299350a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.au.q");

    /* renamed from: b */
    public final Context f299351b;

    /* renamed from: c */
    public final C86124t f299352c;

    /* renamed from: d */
    public final C68214a f299353d;

    /* renamed from: e */
    public final C28292j f299354e = new C28292j(79900);

    /* renamed from: f */
    public final C91097g f299355f;

    /* renamed from: g */
    public final boolean f299356g;

    /* renamed from: h */
    public final C68214a f299357h;

    /* renamed from: i */
    public final C68214a f299358i;

    /* renamed from: j */
    public final C58833ax f299359j;

    /* renamed from: k */
    public C113859cn f299360k;

    /* renamed from: l */
    public C107590b f299361l;

    /* renamed from: m */
    ViewGroup f299362m;

    /* renamed from: n */
    ViewGroup f299363n;

    /* renamed from: o */
    final List f299364o = new ArrayList();

    /* renamed from: p */
    public boolean f299365p = false;

    /* renamed from: q */
    private final Map f299366q;

    /* renamed from: r */
    private final C22871g f299367r;

    public C107606q(Context context, Map map, C86124t tVar, C22871g gVar, C91097g gVar2, boolean z, C68214a aVar, C68214a aVar2, C68214a aVar3, C58833ax axVar) {
        this.f299351b = context;
        this.f299366q = map;
        this.f299352c = tVar;
        this.f299367r = gVar;
        this.f299356g = z;
        this.f299358i = aVar;
        this.f299353d = aVar2;
        this.f299355f = gVar2;
        this.f299357h = aVar3;
        this.f299359j = axVar;
    }

    /* renamed from: d */
    public static boolean m178485d(SharedPreferences sharedPreferences, C86124t tVar) {
        long a = tVar.mo79743a(C90014bt.f247078aP);
        if (a < 0 || ((long) sharedPreferences.getInt("opa_citadel_suggestions_impression_count", 0)) < a) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m178486e(C86124t tVar) {
        return C58597ky.m90218i(tVar.mo79745c(C90014bt.f247627ki), C58485gu.m89846n(C107605p.CITADEL.f299349c));
    }

    /* renamed from: a */
    public final void mo96066a(ViewGroup viewGroup) {
        C107609t tVar;
        if (!m178486e(this.f299352c) || !m178485d((SharedPreferences) this.f299357h.mo27525b(), this.f299352c)) {
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.OPA_ANDROID_RICH_INPUT_DRAW_START;
            ((C89859i) this.f299353d.mo27525b()).mo74236a(fVar.mo83699a());
            C58485gu c = this.f299352c.mo79745c(C90014bt.f247627ki);
            C58480gp e = C58485gu.m89837e();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                String str = (String) c.get(i);
                if (!(this.f299366q.get(str) == null || (tVar = (C107609t) ((C68214a) this.f299366q.get(str)).mo27525b()) == null)) {
                    e.mo55395g(tVar.mo96061b());
                }
            }
            new C90873ag(this.f299367r.mo28209i(C60856cj.m92896e(e.mo55394f()), "richInputController.buildContent", new C107599j(this)), this.f299367r, "richInputController.buildContent", new C107603n(this, viewGroup)).mo85223a(new C107604o(this));
        }
    }

    /* renamed from: b */
    public final void mo96067b() {
        if (this.f299365p && this.f299363n != null && !this.f299352c.mo79746e(C90024cc.f248134e)) {
            ViewGroup viewGroup = this.f299363n;
            viewGroup.getClass();
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo96068c() {
        if (this.f299365p) {
            ViewGroup viewGroup = this.f299362m;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                this.f299362m.setVisibility(8);
            }
            ViewGroup viewGroup2 = this.f299363n;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            this.f299365p = false;
        }
    }
}
