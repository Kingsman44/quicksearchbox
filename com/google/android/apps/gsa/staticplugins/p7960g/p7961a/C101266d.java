package com.google.android.apps.gsa.staticplugins.p7960g.p7961a;

import com.google.android.apps.gsa.assist.p501a.C9313a;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.g.a.d */
/* compiled from: PG */
final class C101266d extends C90888av {

    /* renamed from: a */
    private final SettableFuture f282624a;

    /* renamed from: b */
    private final Future f282625b;

    /* renamed from: c */
    private final AtomicBoolean f282626c;

    /* renamed from: d */
    private final C9313a f282627d;

    /* renamed from: e */
    private final boolean f282628e;

    public C101266d(SettableFuture settableFuture, Future future, AtomicBoolean atomicBoolean, C9313a aVar, boolean z) {
        super("AssistDataBuilder.ProcessScreenshotAvailability", 1, 8);
        this.f282624a = settableFuture;
        this.f282625b = future;
        this.f282626c = atomicBoolean;
        this.f282627d = aVar;
        this.f282628e = z;
    }

    public final void run() {
        if (C101272j.m167534c(C101272j.m167532a(this.f282625b, this.f282627d, this.f282628e))) {
            this.f282624a.mo57356n(true);
        } else {
            this.f282624a.mo57356n(false);
        }
        this.f282626c.set(true);
    }
}
