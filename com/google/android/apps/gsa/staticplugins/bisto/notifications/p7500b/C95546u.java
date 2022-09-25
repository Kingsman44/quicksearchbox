package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.u */
/* compiled from: PG */
final class C95546u implements C94637a {

    /* renamed from: a */
    final /* synthetic */ C94637a f267392a;

    /* renamed from: b */
    final /* synthetic */ AtomicBoolean f267393b;

    public C95546u(C94637a aVar, AtomicBoolean atomicBoolean) {
        this.f267392a = aVar;
        this.f267393b = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo88580a(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C94637a aVar = this.f267392a;
        boolean z2 = false;
        if (this.f267393b.get() && z) {
            z2 = true;
        }
        aVar.mo88580a(z2);
    }
}
