package com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a;

import java.io.Closeable;

/* renamed from: com.google.android.libraries.search.assistant.f.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C32600e implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ C32601f f87293a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f87294b;

    public /* synthetic */ C32600e(C32601f fVar, Runnable runnable) {
        this.f87293a = fVar;
        this.f87294b = runnable;
    }

    public final void close() {
        C32601f fVar = this.f87293a;
        Runnable runnable = this.f87294b;
        synchronized (fVar.f87296b) {
            fVar.f87295a.remove(runnable);
        }
    }
}
