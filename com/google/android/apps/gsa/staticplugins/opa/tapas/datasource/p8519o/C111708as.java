package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.assistant.p3858ar.p3859a.C49728r;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58879cp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.as */
/* compiled from: PG */
public final class C111708as implements C111704ao {

    /* renamed from: a */
    public static final C59071e f310535a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.as");

    /* renamed from: b */
    private final C86124t f310536b;

    /* renamed from: c */
    private final C111703an f310537c;

    /* renamed from: d */
    private final C21370a f310538d;

    /* renamed from: e */
    private final C113425ff f310539e;

    /* renamed from: f */
    private final C22871g f310540f;

    public C111708as(C86124t tVar, C111703an anVar, C21370a aVar, C113425ff ffVar, C22871g gVar) {
        this.f310536b = tVar;
        this.f310537c = anVar;
        this.f310538d = aVar;
        this.f310539e = ffVar;
        this.f310540f = gVar;
    }

    /* renamed from: g */
    private final C88616t m185524g(String str) {
        return new C88616t(Query.f252741b.mo84268aE(str, false), 1, "web", (Query) null, this.f310538d);
    }

    /* renamed from: a */
    public final void mo99209a(boolean z) {
        if (this.f310536b.mo79746e(C90063do.f249415dB)) {
            if (this.f310536b.mo79746e(C90063do.f249437dX) && !this.f310539e.mo100143i()) {
                C58976aa aaVar = C58975e.f156826a;
                this.f310537c.mo82241j();
            } else if (this.f310536b.mo79746e(C90063do.f249407cu)) {
                this.f310540f.mo28211k(this.f310539e.mo100136b(), "process response", new C111706aq(this, z));
            } else {
                mo99212d(this.f310539e.mo100138d(), z);
            }
        }
    }

    /* renamed from: b */
    public final C49728r mo99210b(boolean z) {
        if (!z) {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f310536b.mo79746e(C90063do.f249418dE)) {
                this.f310537c.mo82241j();
            }
            return C49728r.f128339j;
        }
        MessageLite b = this.f310537c.mo82240b(m185524g(BuildConfig.FLAVOR));
        if (b instanceof C49728r) {
            C58976aa aaVar2 = C58975e.f156826a;
            return (C49728r) b;
        }
        C58976aa aaVar3 = C58975e.f156826a;
        return C49728r.f128339j;
    }

    /* renamed from: c */
    public final C58833ax mo99211c(String str) {
        if (!this.f310536b.mo79746e(C90063do.f249415dB)) {
            return C58836b.f156633a;
        }
        if (!C58879cp.m90962d(str)) {
            return C58836b.f156633a;
        }
        if (!this.f310539e.mo100143i()) {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f310536b.mo79746e(C90063do.f249418dE)) {
                this.f310537c.mo82241j();
            }
            return C58836b.f156633a;
        } else if (this.f310536b.mo79746e(C90063do.f249407cu)) {
            return C58833ax.m90834k(this.f310540f.mo28209i(this.f310539e.mo100136b(), "process response", new C111705ap(this)));
        } else {
            return C58833ax.m90834k(C60856cj.m92900i(mo99210b(this.f310539e.mo100138d())));
        }
    }

    /* renamed from: d */
    public final void mo99212d(boolean z, boolean z2) {
        if (!this.f310536b.mo79746e(C90063do.f249417dD) || !z2 || z) {
            this.f310537c.mo78004e();
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f310537c.mo82241j();
    }

    /* renamed from: e */
    public final void mo99213e(C49728r rVar) {
        if ((rVar.f128341a & 1) != 0 && C58879cp.m90962d(rVar.f128342b)) {
            if (this.f310536b.mo79746e(C90063do.f249436dW) && !this.f310539e.mo100143i()) {
                C58976aa aaVar = C58975e.f156826a;
            } else if (this.f310536b.mo79746e(C90063do.f249407cu)) {
                this.f310540f.mo28211k(this.f310539e.mo100136b(), "process response", new C111707ar(this, rVar));
            } else {
                mo99214f(this.f310539e.mo100138d(), rVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo99214f(boolean z, C49728r rVar) {
        if (!this.f310536b.mo79746e(C90063do.f249416dC) || z) {
            C58976aa aaVar = C58975e.f156826a;
            this.f310537c.mo82242k(m185524g(rVar.f128342b), rVar, new C41626a(new ArrayList()));
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
    }
}
