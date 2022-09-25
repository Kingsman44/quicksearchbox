package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C2354bb;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.C2370br;
import androidx.lifecycle.C2371bs;
import androidx.lifecycle.C2380k;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import androidx.lifecycle.p127a.C2320a;
import androidx.lifecycle.p127a.C2322c;
import androidx.savedstate.C4088d;
import androidx.savedstate.C4089e;
import androidx.savedstate.C4090f;
import androidx.savedstate.C4091g;
import java.util.Set;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.m */
/* compiled from: PG */
public final class C3892m implements C2391v, C2371bs, C2380k, C4091g {

    /* renamed from: a */
    public final Context f12476a;

    /* renamed from: b */
    public C3825ax f12477b;

    /* renamed from: c */
    public final Bundle f12478c;

    /* renamed from: d */
    public C2383n f12479d;

    /* renamed from: e */
    public final String f12480e;

    /* renamed from: f */
    public C2393x f12481f;

    /* renamed from: g */
    public final C4090f f12482g;

    /* renamed from: h */
    public C2383n f12483h;

    /* renamed from: i */
    private final Bundle f12484i;

    /* renamed from: j */
    private final C69613f f12485j;

    /* renamed from: k */
    private final C3810ai f12486k;

    public C3892m(Context context, C3825ax axVar, Bundle bundle, C2383n nVar, C3810ai aiVar, String str, Bundle bundle2) {
        this.f12476a = context;
        this.f12477b = axVar;
        this.f12478c = bundle;
        this.f12479d = nVar;
        this.f12486k = aiVar;
        this.f12480e = str;
        this.f12484i = bundle2;
        this.f12481f = new C2393x(this);
        this.f12482g = C4089e.m11719a(this);
        this.f12485j = new C69747m(new C3890k(this));
        new C69747m(new C3891l(this));
        this.f12483h = C2383n.INITIALIZED;
    }

    /* renamed from: a */
    public final void mo8133a(C2383n nVar) {
        C69664n.m101061g(nVar, "maxState");
        if (this.f12483h == C2383n.INITIALIZED) {
            this.f12482g.mo8589b(this.f12484i);
        }
        this.f12483h = nVar;
        mo8134b();
    }

    /* renamed from: b */
    public final void mo8134b() {
        if (this.f12479d.ordinal() < this.f12483h.ordinal()) {
            this.f12481f.mo5795g(this.f12479d);
        } else {
            this.f12481f.mo5795g(this.f12483h);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj == null || !(obj instanceof C3892m)) {
            return false;
        }
        C3892m mVar = (C3892m) obj;
        if (!C69664n.m101066l(this.f12480e, mVar.f12480e) || !C69664n.m101066l(this.f12477b, mVar.f12477b) || !C69664n.m101066l(this.f12481f, mVar.f12481f) || !C69664n.m101066l(this.f12482g.f13082a, mVar.f12482g.f13082a)) {
            return false;
        }
        if (!C69664n.m101066l(this.f12478c, mVar.f12478c)) {
            Bundle bundle = this.f12478c;
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            if (!keySet.isEmpty()) {
                for (String str : keySet) {
                    Object obj2 = this.f12478c.get(str);
                    Bundle bundle2 = mVar.f12478c;
                    if (!C69664n.m101066l(obj2, bundle2 == null ? null : bundle2.get(str))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final /* synthetic */ C2322c getDefaultViewModelCreationExtras() {
        return C2320a.f6515a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return (C2354bb) this.f12485j.mo5768a();
    }

    public final C2384o getLifecycle() {
        return this.f12481f;
    }

    public final C4088d getSavedStateRegistry() {
        return this.f12482g.f13082a;
    }

    public final C2370br getViewModelStore() {
        if (this.f12481f.f6612c.mo5788a(C2383n.CREATED)) {
            C3810ai aiVar = this.f12486k;
            if (aiVar != null) {
                String str = this.f12480e;
                C69664n.m101061g(str, "backStackEntryId");
                C2370br brVar = (C2370br) aiVar.f12314b.get(str);
                if (brVar != null) {
                    return brVar;
                }
                C2370br brVar2 = new C2370br();
                aiVar.f12314b.put(str, brVar2);
                return brVar2;
            }
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = (this.f12480e.hashCode() * 31) + this.f12477b.hashCode();
        Bundle bundle = this.f12478c;
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            for (String str : keySet) {
                int i = hashCode * 31;
                Object obj = this.f12478c.get(str);
                hashCode = i + (obj == null ? 0 : obj.hashCode());
            }
        }
        return (((hashCode * 31) + this.f12481f.hashCode()) * 31) + this.f12482g.f13082a.hashCode();
    }

    public C3892m(C3892m mVar, Bundle bundle) {
        this(mVar.f12476a, mVar.f12477b, bundle, mVar.f12479d, mVar.f12486k, mVar.f12480e, mVar.f12484i);
        this.f12479d = mVar.f12479d;
        mo8133a(mVar.f12483h);
    }
}
