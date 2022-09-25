package com.google.android.apps.gsa.staticplugins.nga.p8075n;

import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.shared.p6983ah.C89145b;
import com.google.android.apps.gsa.shared.p6983ah.C89156m;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103335ap;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103356f;
import com.google.android.apps.gsa.staticplugins.nga.p8068k.C103382f;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.n.s */
/* compiled from: PG */
public final class C103454s implements C103382f, C2391v {

    /* renamed from: a */
    public final C2393x f288317a = new C2393x(this);

    /* renamed from: b */
    public final C103335ap f288318b;

    /* renamed from: c */
    public final C22871g f288319c;

    /* renamed from: d */
    public final C89145b f288320d;

    /* renamed from: e */
    private final C22871g f288321e;

    public C103454s(C103335ap apVar, C90821bm bmVar, C89145b bVar, C22871g gVar) {
        this.f288318b = apVar;
        this.f288319c = bmVar.mo85163a(C103453r.class);
        this.f288320d = bVar;
        this.f288321e = gVar;
    }

    /* renamed from: a */
    public final void mo93788a(C89156m mVar) {
        this.f288318b.f288119a.mo93770d(new C103356f(mVar));
    }

    /* renamed from: b */
    public final boolean mo93789b() {
        Boolean bool = (Boolean) this.f288320d.mo83130d().mo3842a();
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: c */
    public final void mo93774c() {
        this.f288319c.mo28212l("[NGA] onNgaStartInSearch#sendOpaVisibilityEvent", new C103444i(this));
        this.f288321e.mo28212l("[NGA] onNgaStartInSearch#registerObservers", new C103445j(this));
    }

    /* renamed from: e */
    public final void mo93775e() {
        this.f288321e.mo28212l("[NGA] onNgaStopInSearch#unregisterObservers", new C103447l(this));
    }

    public final C2384o getLifecycle() {
        return this.f288317a;
    }
}
