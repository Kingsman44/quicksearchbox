package com.google.android.apps.gsa.shared.util;

import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84441h;
import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;

/* renamed from: com.google.android.apps.gsa.shared.util.k */
/* compiled from: PG */
final class C91045k extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ C91043j f254289a;

    /* renamed from: b */
    final /* synthetic */ Object f254290b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91045k(C91043j jVar, Object obj) {
        super("Consumers.consumeAsyncUi");
        this.f254289a = jVar;
        this.f254290b = obj;
    }

    public final void run() {
        ((C84441h) this.f254289a).mo17709a((GetGlobalSearchSourcesCall$GlobalSearchSource[]) this.f254290b);
    }
}
