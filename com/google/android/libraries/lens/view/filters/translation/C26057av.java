package com.google.android.libraries.lens.view.filters.translation;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.av */
/* compiled from: PG */
final class C26057av implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58495hd f70780a;

    /* renamed from: b */
    final /* synthetic */ C26058aw f70781b;

    public C26057av(C26058aw awVar, C58495hd hdVar) {
        this.f70781b = awVar;
        this.f70780a = hdVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C26059ax.f70786c.mo56225c()).mo56382g(th)).mo56372aa(49381)).mo56386p("Unable to retrieve languagepack download states. Will not reconcile");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        ((C58970a) ((C58970a) C26059ax.f70786c.mo56224b()).mo56372aa(49382)).mo56386p("Successfully retrieved lens states and will reconcile.");
        this.f70781b.f70782a.mo31259n(this.f70780a, C26059ax.m48090b((C58495hd) obj));
    }
}
