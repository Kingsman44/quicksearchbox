package com.google.android.apps.search.fedora.examplestore;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.fedora.examplestore.g */
/* compiled from: PG */
final class C132825g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f362418a;

    public C132825g(String str) {
        this.f362418a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C132826h.f362419a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "FedExampleStoreDel");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(39826)).mo56389s("startQuery() failed for collection: %s", this.f362418a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C59104x b = C132826h.f362419a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedExampleStoreDel");
        ((C59052c) ((C59052c) b).mo56372aa(39827)).mo56389s("startQuery() success for collection: %s", this.f362418a);
    }
}
