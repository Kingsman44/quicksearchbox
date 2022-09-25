package com.google.android.libraries.gsa.conversation.p1853g.p1854a;

import com.google.android.libraries.gsa.conversation.p1858i.C22724a;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.gsa.conversation.g.a.a */
/* compiled from: PG */
final class C22596a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f62245a;

    /* renamed from: b */
    final /* synthetic */ SettableFuture f62246b;

    /* renamed from: c */
    final /* synthetic */ int f62247c;

    /* renamed from: d */
    final /* synthetic */ MessageLite f62248d;

    /* renamed from: e */
    final /* synthetic */ long f62249e;

    /* renamed from: f */
    final /* synthetic */ C22724a f62250f;

    public C22596a(String str, SettableFuture settableFuture, int i, MessageLite messageLite, long j, C22724a aVar) {
        this.f62245a = str;
        this.f62246b = settableFuture;
        this.f62247c = i;
        this.f62248d = messageLite;
        this.f62249e = j;
        this.f62250f = aVar;
    }

    /* renamed from: c */
    private final void m42085c(Throwable th) {
        int i = this.f62247c;
        if (i > 0) {
            this.f62246b.mo57358p(C22598c.m42092b(this.f62245a, this.f62248d, this.f62249e, i - 1, this.f62250f));
            return;
        }
        if (th.getMessage() != null) {
            ((C59052c) ((C59052c) ((C59052c) C22598c.f62256a.mo56225c()).mo56382g(th)).mo56372aa(48383)).mo56389s("Failed to save content for: %s", this.f62245a);
        }
        this.f62246b.mo57357o(th);
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        m42085c(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f62246b.mo57356n(true);
        } else {
            m42085c(new IllegalStateException("Failed to save content for: ".concat(this.f62245a)));
        }
    }
}
