package com.google.android.libraries.search.assistant.p2511d;

import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71643cp;

/* renamed from: com.google.android.libraries.search.assistant.d.q */
/* compiled from: PG */
final class C32554q implements Closeable {

    /* renamed from: a */
    final /* synthetic */ C71643cp f87187a;

    public C32554q(C71643cp cpVar) {
        this.f87187a = cpVar;
    }

    public final void close() {
        this.f87187a.mo62723u(new CancellationException("ClosingFuture pipeline is finishing"));
    }
}
