package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p677b.p678a;

import com.google.android.gms.car.C143195dl;
import com.google.android.gms.car.C143196dm;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p677b.C11552b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.b */
/* compiled from: PG */
final class C11532b implements C143196dm {

    /* renamed from: a */
    final /* synthetic */ Consumer f37412a;

    /* renamed from: b */
    final /* synthetic */ C11552b f37413b;

    /* renamed from: c */
    final /* synthetic */ Runnable f37414c;

    public C11532b(Consumer consumer, C11552b bVar, Runnable runnable) {
        this.f37412a = consumer;
        this.f37413b = bVar;
        this.f37414c = runnable;
    }

    /* renamed from: a */
    public final void mo20041a() {
        C58976aa aaVar = C58975e.f156826a;
        ((C11545o) this.f37414c).f37439a.mo5437b(true);
    }

    /* renamed from: b */
    public final void mo20042b(C143195dl dlVar) {
        C59104x d = C11534d.f37417a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CarClientTokenFactory");
        ((C59052c) ((C59052c) d).mo56372aa(43357)).mo56389s("TokenConnectionCallbacks#onConnectionSuspended: %s", dlVar);
        this.f37412a.accept(new RuntimeException("Token connection suspended : ".concat(String.valueOf(String.valueOf(dlVar)))));
        this.f37413b.mo20010b();
    }
}
