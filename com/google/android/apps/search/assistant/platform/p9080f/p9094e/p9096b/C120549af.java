package com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b;

import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33461o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.f.e.b.af */
/* compiled from: PG */
final class C120549af implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C120550ag f335255a;

    public C120549af(C120550ag agVar) {
        this.f335255a = agVar;
    }

    public final /* synthetic */ void accept(Object obj) {
        C120560k kVar;
        C33461o oVar = (C33461o) obj;
        C58976aa aaVar = C58975e.f156826a;
        C120550ag agVar = this.f335255a;
        if (!agVar.f335259d.getAndSet(true) && (kVar = (C120560k) agVar.f335258c.getAndSet((Object) null)) != null) {
            kVar.mo104836c();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
