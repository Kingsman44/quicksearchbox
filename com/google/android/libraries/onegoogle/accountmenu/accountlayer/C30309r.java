package com.google.android.libraries.onegoogle.accountmenu.accountlayer;

import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.onegoogle.account.disc.C30213m;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmenu.features.C30518b;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30474o;
import com.google.android.libraries.onegoogle.p2378b.C30830g;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.android.libraries.onegoogle.p2380c.p2381a.C30847m;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.accountlayer.r */
/* compiled from: PG */
public final class C30309r extends C30304m {

    /* renamed from: c */
    public C30306o f81941c;

    /* renamed from: d */
    public C30158c f81942d;

    /* renamed from: e */
    public C30518b f81943e;

    /* renamed from: f */
    public C30830g f81944f;

    /* renamed from: g */
    public C30860b f81945g;

    /* renamed from: h */
    public C30474o f81946h;

    /* renamed from: i */
    public C30213m f81947i;

    /* renamed from: j */
    public Class f81948j;

    /* renamed from: k */
    public C30897z f81949k;

    /* renamed from: l */
    public C58833ax f81950l;

    /* renamed from: m */
    private C30294c f81951m;

    /* renamed from: n */
    private C58833ax f81952n;

    /* renamed from: o */
    private C30213m f81953o;

    /* renamed from: p */
    private ExecutorService f81954p;

    /* renamed from: q */
    private C28421h f81955q;

    /* renamed from: r */
    private C30847m f81956r;

    public C30309r() {
        C58836b bVar = C58836b.f156633a;
        this.f81952n = bVar;
        this.f81950l = bVar;
    }

    public C30309r(C30305n nVar) {
        C58836b bVar = C58836b.f156633a;
        this.f81952n = bVar;
        this.f81950l = bVar;
        C30310s sVar = (C30310s) nVar;
        this.f81941c = sVar.f81957a;
        this.f81942d = sVar.f81958b;
        this.f81951m = sVar.f81959c;
        this.f81943e = sVar.f81960d;
        this.f81944f = sVar.f81961e;
        this.f81945g = sVar.f81962f;
        this.f81946h = sVar.f81963g;
        this.f81952n = sVar.f81964h;
        this.f81947i = sVar.f81965i;
        this.f81953o = sVar.f81966j;
        this.f81948j = sVar.f81967k;
        this.f81954p = sVar.f81968l;
        this.f81955q = sVar.f81969m;
        this.f81949k = sVar.f81970n;
        this.f81956r = sVar.f81971o;
        this.f81950l = sVar.f81972p;
    }

    /* renamed from: a */
    public final C28421h mo35827a() {
        C28421h hVar = this.f81955q;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("Property \"vePrimitives\" has not been set");
    }

    /* renamed from: b */
    public final C30158c mo35828b() {
        C30158c cVar = this.f81942d;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("Property \"accountConverter\" has not been set");
    }

    /* renamed from: c */
    public final C30305n mo35829c() {
        C30158c cVar;
        C30294c cVar2;
        C30518b bVar;
        C30860b bVar2;
        C30474o oVar;
        C30213m mVar;
        Class cls;
        ExecutorService executorService;
        C28421h hVar;
        C30897z zVar;
        C30306o oVar2 = this.f81941c;
        if (oVar2 != null && (cVar = this.f81942d) != null && (cVar2 = this.f81951m) != null && (bVar = this.f81943e) != null && (bVar2 = this.f81945g) != null && (oVar = this.f81946h) != null && (mVar = this.f81953o) != null && (cls = this.f81948j) != null && (executorService = this.f81954p) != null && (hVar = this.f81955q) != null && (zVar = this.f81949k) != null) {
            return new C30310s(oVar2, cVar, cVar2, bVar, this.f81944f, bVar2, oVar, this.f81952n, this.f81947i, mVar, cls, executorService, hVar, zVar, this.f81956r, this.f81950l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f81941c == null) {
            sb.append(" accountsModel");
        }
        if (this.f81942d == null) {
            sb.append(" accountConverter");
        }
        if (this.f81951m == null) {
            sb.append(" clickListeners");
        }
        if (this.f81943e == null) {
            sb.append(" features");
        }
        if (this.f81945g == null) {
            sb.append(" oneGoogleEventLogger");
        }
        if (this.f81946h == null) {
            sb.append(" configuration");
        }
        if (this.f81953o == null) {
            sb.append(" avatarImageLoader");
        }
        if (this.f81948j == null) {
            sb.append(" accountClass");
        }
        if (this.f81954p == null) {
            sb.append(" backgroundExecutor");
        }
        if (this.f81955q == null) {
            sb.append(" vePrimitives");
        }
        if (this.f81949k == null) {
            sb.append(" visualElements");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: e */
    public final C30306o mo35831e() {
        C30306o oVar = this.f81941c;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("Property \"accountsModel\" has not been set");
    }

    /* renamed from: f */
    public final C30518b mo35832f() {
        C30518b bVar = this.f81943e;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("Property \"features\" has not been set");
    }

    /* renamed from: g */
    public final C30860b mo35833g() {
        C30860b bVar = this.f81945g;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("Property \"oneGoogleEventLogger\" has not been set");
    }

    /* renamed from: h */
    public final C30847m mo35834h() {
        return this.f81956r;
    }

    /* renamed from: i */
    public final C58833ax mo35835i() {
        return this.f81950l;
    }

    /* renamed from: j */
    public final C58833ax mo35836j() {
        C30830g gVar = this.f81944f;
        return gVar == null ? C58836b.f156633a : C58833ax.m90834k(gVar);
    }

    /* renamed from: k */
    public final C58833ax mo35837k() {
        ExecutorService executorService = this.f81954p;
        return executorService == null ? C58836b.f156633a : C58833ax.m90834k(executorService);
    }

    /* renamed from: l */
    public final C58833ax mo35838l() {
        C30294c cVar = this.f81951m;
        return cVar == null ? C58836b.f156633a : C58833ax.m90834k(cVar);
    }

    /* renamed from: m */
    public final C58833ax mo35839m() {
        C30213m mVar = this.f81947i;
        return mVar == null ? C58836b.f156633a : C58833ax.m90834k(mVar);
    }

    /* renamed from: n */
    public final C58833ax mo35840n() {
        return this.f81952n;
    }

    /* renamed from: o */
    public final void mo35841o(C30213m mVar) {
        if (mVar != null) {
            this.f81953o = mVar;
            return;
        }
        throw new NullPointerException("Null avatarImageLoader");
    }

    /* renamed from: p */
    public final void mo35842p(ExecutorService executorService) {
        if (executorService != null) {
            this.f81954p = executorService;
            return;
        }
        throw new NullPointerException("Null backgroundExecutor");
    }

    /* renamed from: q */
    public final void mo35843q(C30294c cVar) {
        if (cVar != null) {
            this.f81951m = cVar;
            return;
        }
        throw new NullPointerException("Null clickListeners");
    }

    /* renamed from: r */
    public final void mo35844r(C30474o oVar) {
        if (oVar != null) {
            this.f81946h = oVar;
            return;
        }
        throw new NullPointerException("Null configuration");
    }

    /* renamed from: s */
    public final void mo35845s(C30518b bVar) {
        if (bVar != null) {
            this.f81943e = bVar;
            return;
        }
        throw new NullPointerException("Null features");
    }

    /* renamed from: t */
    public final void mo35846t(C30313v vVar) {
        this.f81952n = C58833ax.m90833j(vVar);
    }

    /* renamed from: u */
    public final void mo35847u(C30860b bVar) {
        this.f81945g = bVar;
    }

    /* renamed from: v */
    public final void mo35848v(C30847m mVar) {
        this.f81956r = mVar;
    }

    /* renamed from: w */
    public final void mo35849w(C28421h hVar) {
        if (hVar != null) {
            this.f81955q = hVar;
            return;
        }
        throw new NullPointerException("Null vePrimitives");
    }

    /* renamed from: x */
    public final void mo35850x(C30897z zVar) {
        this.f81949k = zVar;
    }
}
