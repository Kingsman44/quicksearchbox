package com.google.android.apps.gsa.staticplugins.p7960g.p7961a;

import com.google.android.apps.gsa.assist.p501a.C9313a;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.g.a.i */
/* compiled from: PG */
final class C101271i extends C90888av {

    /* renamed from: a */
    private final SettableFuture f282648a;

    /* renamed from: b */
    private final AtomicBoolean f282649b;

    /* renamed from: c */
    private final C9313a f282650c;

    public C101271i(String str, SettableFuture settableFuture, C9313a aVar, AtomicBoolean atomicBoolean) {
        super(str.concat(".Timeout"), 1, 0);
        this.f282648a = settableFuture;
        this.f282650c = aVar;
        this.f282649b = atomicBoolean;
    }

    public final void run() {
        if (this.f282649b.compareAndSet(false, true)) {
            this.f282648a.mo57356n((Object) null);
            this.f282650c.mo17503a(13);
        }
    }
}
