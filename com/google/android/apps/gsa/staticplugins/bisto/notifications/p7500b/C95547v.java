package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.v */
/* compiled from: PG */
final class C95547v implements C94637a {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f267394a;

    /* renamed from: b */
    final /* synthetic */ C94637a f267395b;

    /* renamed from: c */
    final /* synthetic */ C95551z f267396c;

    public C95547v(C95551z zVar, AtomicBoolean atomicBoolean, C94637a aVar) {
        this.f267396c = zVar;
        this.f267394a = atomicBoolean;
        this.f267395b = aVar;
    }

    /* renamed from: a */
    public final void mo88580a(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        AtomicBoolean atomicBoolean = this.f267394a;
        atomicBoolean.set(atomicBoolean.get() && z);
        if (this.f267396c.mo89438H() == null) {
            this.f267395b.mo88580a(true);
        } else {
            this.f267395b.mo88580a(false);
        }
    }
}
