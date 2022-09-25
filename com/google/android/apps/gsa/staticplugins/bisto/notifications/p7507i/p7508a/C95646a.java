package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a;

import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94641e;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95210y;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95214aa;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95239o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.a */
/* compiled from: PG */
public final class C95646a {

    /* renamed from: a */
    public static final C59071e f267693a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.a");

    /* renamed from: b */
    public final C95239o f267694b;

    /* renamed from: c */
    public final AtomicReference f267695c = new AtomicReference();

    /* renamed from: d */
    public final AtomicReference f267696d = new AtomicReference();

    /* renamed from: e */
    public final AtomicReference f267697e = new AtomicReference();

    /* renamed from: f */
    public final AtomicReference f267698f = new AtomicReference();

    /* renamed from: g */
    public C95668q f267699g;

    /* renamed from: h */
    public int f267700h;

    /* renamed from: i */
    public boolean f267701i;

    public C95646a(C95239o oVar) {
        this.f267694b = oVar;
    }

    /* renamed from: a */
    public final void mo89613a() {
        C95214aa aaVar = (C95214aa) this.f267698f.get();
        if (aaVar != null) {
            aaVar.mo89125d(this.f267700h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo89614b() {
        C95239o oVar = this.f267694b;
        if (oVar != null) {
            this.f267701i = true;
            oVar.mo89162j(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo89615c() {
        boolean k;
        if (mo89617e()) {
            return false;
        }
        C95239o oVar = this.f267694b;
        C95210y yVar = oVar.f266449c.f266594d;
        synchronized (yVar.f266362l) {
            k = yVar.mo89119k();
        }
        C58976aa aaVar = C58975e.f156826a;
        if (oVar.f266450d.f266443a || !k || oVar.f266454h) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo89616d() {
        C95214aa aaVar = (C95214aa) this.f267698f.get();
        return aaVar != null && !aaVar.mo89131j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo89617e() {
        return this.f267694b.f266450d.f266443a;
    }

    /* renamed from: f */
    public final boolean mo89618f(C94641e eVar) {
        boolean z = false;
        if (this.f267694b.mo89168p()) {
            return false;
        }
        C95214aa aaVar = (C95214aa) this.f267698f.get();
        if (aaVar != null && !aaVar.mo89131j()) {
            if (!aaVar.mo89132k(new C95288a(), false)) {
                return false;
            }
            this.f267700h = aaVar.mo89122a();
            this.f267699g = null;
            this.f267696d.set(eVar);
            C95239o oVar = this.f267694b;
            if (!oVar.mo89168p()) {
                C58976aa aaVar2 = C58975e.f156826a;
                z = oVar.mo89173u(eVar, false);
            }
            if (!z) {
                this.f267696d.set((Object) null);
                C59104x b = f267693a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "AudControlInteractor");
                ((C59052c) ((C59052c) b).mo56372aa(16401)).mo56386p("Didn't start, end interaction");
                mo89613a();
            }
        }
        return z;
    }
}
