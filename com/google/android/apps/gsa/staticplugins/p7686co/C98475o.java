package com.google.android.apps.gsa.staticplugins.p7686co;

import com.google.android.gms.awareness.C142928c;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.contextmanager.fence.internal.C144035c;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21519u;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21523y;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21529b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21544l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.o */
/* compiled from: PG */
final class C98475o implements Callable {

    /* renamed from: a */
    final /* synthetic */ C98477q f274974a;

    /* renamed from: b */
    final /* synthetic */ C21523y f274975b;

    public C98475o(C98477q qVar, C21523y yVar) {
        this.f274974a = qVar;
        this.f274975b = yVar;
    }

    public final /* synthetic */ Object call() {
        C21519u uVar = (C21519u) this.f274974a.f274979b.mo17428b();
        C21529b bVar = this.f274974a.f253307n;
        C21523y yVar = this.f274975b;
        C143840l lVar = C142928c.f387829a;
        C21551h hVar = (C21551h) C21544l.m40655b(C144035c.m234226a(C21544l.m40656c(bVar), yVar.f59928a)).mo26995b(60, TimeUnit.SECONDS);
        C58976aa aaVar = C58975e.f156826a;
        return hVar;
    }
}
