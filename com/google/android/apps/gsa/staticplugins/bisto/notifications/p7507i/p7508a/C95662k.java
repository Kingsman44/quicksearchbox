package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a;

import android.content.Context;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.C95504a;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7499a.C95505a;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7499a.C95507c;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95598as;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95600au;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95645a;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95682f;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95687k;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95691o;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95692p;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95214aa;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95237m;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96467ay;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96470ba;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.k */
/* compiled from: PG */
public final class C95662k {

    /* renamed from: a */
    public static final C59071e f267765a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.k");

    /* renamed from: b */
    public final C95652af f267766b;

    /* renamed from: c */
    public final C95293ae f267767c;

    /* renamed from: d */
    public final Context f267768d;

    /* renamed from: e */
    public C95665n f267769e;

    /* renamed from: f */
    public volatile boolean f267770f = false;

    /* renamed from: g */
    private final C95646a f267771g;

    /* renamed from: h */
    private final C95507c f267772h;

    /* renamed from: i */
    private final C22871g f267773i;

    /* renamed from: j */
    private final C89656k f267774j;

    /* renamed from: k */
    private final C68214a f267775k;

    /* renamed from: l */
    private final C96470ba f267776l;

    /* renamed from: m */
    private final C68214a f267777m;

    /* renamed from: n */
    private final C95504a f267778n;

    /* renamed from: o */
    private final String f267779o;

    public C95662k(Context context, C95652af afVar, C95646a aVar, C95293ae aeVar, C95507c cVar, C22871g gVar, C89656k kVar, C96470ba baVar, C68214a aVar2, C68214a aVar3, C95504a aVar4, String str) {
        this.f267768d = context;
        this.f267766b = afVar;
        this.f267771g = aVar;
        this.f267767c = aeVar;
        this.f267772h = cVar;
        this.f267773i = gVar;
        this.f267774j = kVar;
        this.f267776l = baVar;
        this.f267777m = aVar3;
        this.f267778n = aVar4;
        this.f267775k = aVar2;
        this.f267779o = str;
    }

    /* renamed from: d */
    private final int m158403d() {
        boolean z = false;
        if (!this.f267774j.mo83561p()) {
            return 0;
        }
        C124548d b = ((C89492cd) this.f267777m.mo27525b()).mo83401b(this.f267779o);
        C96470ba baVar = this.f267776l;
        if (b != null && b.mo106487aa()) {
            z = true;
        }
        return baVar.mo90164a(z);
    }

    /* renamed from: e */
    private static boolean m158404e(int i) {
        return i == 0;
    }

    /* renamed from: a */
    public final boolean mo89629a(C95691o oVar, C95294af afVar, C95288a aVar) {
        C22872h.m42742b(C0826b.class);
        C95665n nVar = this.f267769e;
        if (nVar != null) {
            nVar.mo89632a();
        }
        C58976aa aaVar = C58975e.f156826a;
        C95646a aVar2 = this.f267771g;
        if (afVar != null) {
            aVar2.f267699g = new C95668q(afVar, oVar);
        }
        C95214aa aaVar2 = (C95214aa) aVar2.f267698f.get();
        if (aaVar2 == null) {
            return false;
        }
        if (aaVar2.mo89131j()) {
            aaVar2.mo89133l();
        } else {
            aaVar2.mo89132k(aVar, true);
        }
        int a = aaVar2.mo89122a();
        C95237m mVar = aVar2.f267694b.f266450d;
        if (mVar.f266443a) {
            mVar.mo89149b(true);
        }
        aVar2.f267700h = a;
        aVar2.f267696d.set(oVar);
        if (!aVar2.f267694b.mo89167o(oVar, true)) {
            aVar2.f267699g = null;
            aVar2.f267696d.set((Object) null);
            C59104x b = C95646a.f267693a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AudControlInteractor");
            ((C59052c) ((C59052c) b).mo56372aa(16402)).mo56386p("Couldn't start, end interaction");
            aVar2.mo89613a();
            return false;
        }
        oVar.mo89639A(C95659h.f267759a);
        return true;
    }

    /* renamed from: b */
    public final boolean mo89630b(C95294af afVar, C95288a aVar) {
        C22872h.m42742b(C0826b.class);
        if (this.f267770f) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
        C95652af afVar2 = this.f267766b;
        C95682f fVar = new C95682f(afVar2.f267728b, afVar2.f267729c, afVar2.f267730d, afVar2.f267731e, afVar2.f267732f, afVar2.f267735i, afVar2.f267736j, afVar2.f267738l, afVar2.f267739m, afVar2.f267737k, C95692p.f267905c);
        if (!fVar.mo89638w()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        }
        C58976aa aaVar3 = C58975e.f156826a;
        if (!m158404e(m158403d())) {
            return false;
        }
        return mo89629a(fVar, afVar, aVar);
    }

    /* renamed from: c */
    public final boolean mo89631c(C95294af afVar, C95288a aVar, String str) {
        String str2;
        C95294af afVar2 = afVar;
        C95288a aVar2 = aVar;
        if (this.f267770f) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
        int d = m158403d();
        C95645a aVar3 = new C95645a(C36619a.m65148d(this.f267778n.f267242a), m158404e(d));
        if (!aVar3.f267691a) {
            C58976aa aaVar2 = C58975e.f156826a;
            C95507c cVar = this.f267772h;
            new C90873ag(cVar.f267251e.mo28209i(cVar.f267250d.mo89379a().mo46042d(), "maybeSendUserNotif", new C95505a(cVar, str)), this.f267773i, "notification-access-request", new C95660i(this, aVar3, afVar2, aVar2)).mo85223a(C95661j.f267764a);
            return true;
        } else if (!aVar3.f267692b) {
            if (d == 3) {
                str2 = this.f267768d.getString(R.string.locked_fetch_requires_unlock);
            } else if (d == 2) {
                str2 = this.f267768d.getString(R.string.locked_fetch_requires_hpr);
            } else {
                str2 = this.f267768d.getString(R.string.fetch_requires_pr);
            }
            mo89629a(this.f267766b.mo89625a(str2, aVar3), afVar2, aVar2);
            ((C96467ay) this.f267775k.mo27525b()).mo83494a();
            return false;
        } else {
            C22872h.m42742b(C0826b.class);
            C95652af afVar3 = this.f267766b;
            Context context = afVar3.f267727a;
            C95598as asVar = afVar3.f267728b;
            List list = afVar3.f267734h;
            C58485gu m = C58485gu.m89845m();
            C95706l lVar = afVar3.f267729c;
            C95293ae aeVar = afVar3.f267730d;
            C95600au auVar = afVar3.f267731e;
            C68214a aVar4 = afVar3.f267735i;
            C68214a aVar5 = afVar3.f267736j;
            C95645a aVar6 = aVar3;
            C68214a aVar7 = aVar5;
            C95687k kVar = new C95687k(context, asVar, list, m, lVar, aeVar, auVar, aVar4, aVar7, afVar3.f267738l, afVar3.f267739m, afVar3.f267737k, aVar6);
            this.f267767c.mo89218k(8);
            return mo89629a(kVar, afVar, aVar2);
        }
    }
}
