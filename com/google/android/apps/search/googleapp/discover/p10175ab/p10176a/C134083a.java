package com.google.android.apps.search.googleapp.discover.p10175ab.p10176a;

import android.view.ViewGroup;
import com.google.android.apps.search.googleapp.discover.loggingsignals.C134469g;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1649b.p1650a.C19610g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19619i;
import com.google.android.libraries.p1649b.p1652c.C19622a;
import com.google.android.libraries.p1649b.p1653d.C19623a;
import com.google.android.libraries.p1649b.p1655f.C19628b;
import com.google.android.libraries.p1649b.p1655f.C19629c;
import com.google.android.libraries.p1649b.p1655f.C19630d;
import com.google.android.libraries.p1649b.p1655f.C19631e;
import com.google.android.libraries.p1649b.p1655f.C19632f;
import com.google.android.libraries.search.integrations.p3013a.p3014a.C38487e;
import com.google.android.libraries.search.logging.p3041d.C39143kr;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.p4283bv.p4354e.C57528m;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.ab.a.a */
/* compiled from: PG */
public final class C134083a implements C134469g {

    /* renamed from: a */
    private final C134085c f365245a;

    /* renamed from: b */
    private final C134766q f365246b;

    /* renamed from: c */
    private ViewGroup f365247c;

    /* renamed from: d */
    private boolean f365248d;

    /* renamed from: e */
    private C57528m f365249e;

    /* renamed from: f */
    private boolean f365250f;

    /* renamed from: g */
    private boolean f365251g;

    /* renamed from: h */
    private boolean f365252h;

    /* renamed from: i */
    private boolean f365253i;

    /* renamed from: j */
    private final C39143kr f365254j;

    public C134083a(C134085c cVar, C39143kr krVar, C134766q qVar) {
        C69664n.m101061g(cVar, "discoverAttentionLogger");
        C69664n.m101061g(krVar, "clientStreamz");
        C69664n.m101061g(qVar, "tngDiscoverSurface");
        this.f365245a = cVar;
        this.f365254j = krVar;
        this.f365246b = qVar;
    }

    /* renamed from: a */
    private final String m217516a() {
        C57528m mVar = this.f365249e;
        if (mVar == null) {
            mVar = C57528m.UNKNOWN_SURFACE;
        }
        return mVar.name();
    }

    /* renamed from: b */
    private final void m217517b() {
        this.f365250f = false;
        this.f365251g = false;
        this.f365252h = false;
        this.f365253i = false;
    }

    /* renamed from: d */
    public final void mo111493d() {
        this.f365245a.mo24921c(new C19623a(2), (C19628b) null);
    }

    /* renamed from: e */
    public final void mo111494e() {
        this.f365245a.mo24920b();
    }

    /* renamed from: f */
    public final void mo111495f() {
        this.f365245a.f365256a.clear();
        this.f365247c = null;
    }

    /* renamed from: g */
    public final void mo111496g() {
        this.f365245a.mo24921c(new C19623a(3), (C19628b) null);
        if (this.f365250f) {
            C39143kr krVar = this.f365254j;
            ((C19567d) krVar.f103056a.f103113v.mo6453a()).mo24822a(1, m217516a(), Boolean.valueOf(this.f365251g));
        }
        if (this.f365252h) {
            C39143kr krVar2 = this.f365254j;
            ((C19567d) krVar2.f103056a.f103114w.mo6453a()).mo24822a(1, m217516a(), Boolean.valueOf(this.f365253i));
        }
        m217517b();
    }

    /* renamed from: h */
    public final void mo111497h() {
        m217517b();
        ViewGroup viewGroup = this.f365247c;
        if (viewGroup != null) {
            C134085c cVar = this.f365245a;
            C134766q qVar = this.f365246b;
            C69664n.m101061g(qVar, "tngDiscoverSurface");
            C134089g gVar = cVar.f365257b;
            C68214a a = C68219e.m98518a(((C68226l) gVar.f365267a).f184585a);
            a.getClass();
            C38487e eVar = (C38487e) gVar.f365268b.mo17428b();
            eVar.getClass();
            C71422aw awVar = (C71422aw) gVar.f365269c.mo17428b();
            awVar.getClass();
            qVar.getClass();
            cVar.mo24923e(new C134088f(a, eVar, awVar, qVar));
            cVar.mo24924f(new C134090h(viewGroup, cVar.f365256a));
            cVar.mo24926h(viewGroup);
            if (cVar.f365258c.isPresent()) {
                C19622a aVar = (C19622a) cVar.f365258c.get();
                C19618h hVar = cVar.f54548d;
                if (hVar != null) {
                    hVar.f54592h = aVar;
                    C19619i iVar = hVar.f54589e;
                    if (iVar != null) {
                        iVar.mo24951c(aVar);
                    }
                }
            }
            this.f365245a.mo24921c(new C19623a(5), new C19632f(viewGroup.getWidth(), viewGroup.getHeight()));
        }
        if (this.f365249e == C57528m.ANDROID_LAUNCHER_MAIN_SCREEN || this.f365249e == C57528m.ANDROID_GO_LAUNCHER_MAIN_SCREEN) {
            boolean z = viewGroup != null && viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0;
            ((C19567d) this.f365254j.f103056a.f103105n.mo6453a()).mo24822a(1, Boolean.valueOf(this.f365245a.mo111551a()), Boolean.valueOf(z));
        }
    }

    /* renamed from: i */
    public final void mo111498i(int i, int i2) {
        ViewGroup viewGroup = this.f365247c;
        if (viewGroup != null && !this.f365248d && viewGroup.getChildCount() > 0) {
            this.f365245a.mo24921c(new C19623a(2), (C19628b) null);
        }
    }

    /* renamed from: j */
    public final void mo111499j() {
    }

    /* renamed from: k */
    public final void mo111500k(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i != 0) {
            i6 = i;
            i5 = i2;
        } else if (i2 == 0) {
            if (i3 > 0 || i4 > 0) {
                this.f365245a.mo24921c(new C19623a(4), new C19630d());
            }
            i6 = 0;
            i5 = 0;
        } else {
            i5 = i2;
            i6 = 0;
        }
        ViewGroup viewGroup = this.f365247c;
        if (viewGroup != null) {
            this.f365248d = true;
            this.f365245a.mo24921c(new C19623a(6), new C19631e(viewGroup, true, 1, i6, i5));
            C134085c cVar = this.f365245a;
            C19610g gVar = cVar.f54550f;
            if (gVar == null || !gVar.mo24946f()) {
                this.f365250f = true;
            } else {
                this.f365251g = true;
            }
            if (!cVar.mo111551a()) {
                this.f365252h = true;
            } else {
                this.f365253i = true;
            }
        }
    }

    /* renamed from: l */
    public final void mo111501l() {
    }

    /* renamed from: m */
    public final void mo111502m() {
        this.f365248d = false;
    }

    /* renamed from: q */
    public final void mo111506q(C60218r rVar) {
        C69664n.m101061g(rVar, "rootEventId");
        this.f365245a.mo24921c(new C19623a(7), new C19629c(rVar));
    }

    /* renamed from: r */
    public final void mo111507r(ViewGroup viewGroup, C57528m mVar) {
        C69664n.m101061g(mVar, "surface");
        this.f365248d = false;
        this.f365247c = viewGroup;
        this.f365249e = mVar;
    }
}
