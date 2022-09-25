package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.shared.util.c.as */
/* compiled from: PG */
final class C90885as extends C90883aq {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f254094a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90885as(SettableFuture settableFuture) {
        super("Future timeout callback", 1, 0);
        this.f254094a = settableFuture;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f254094a.mo57357o(th);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        this.f254094a.mo57356n(obj);
    }
}
