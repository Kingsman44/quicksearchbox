package com.google.android.enterprise.connectedapps.internal;

/* renamed from: com.google.android.enterprise.connectedapps.internal.h */
/* compiled from: PG */
final class C142583h implements Runnable {

    /* renamed from: a */
    RuntimeException f386893a;

    public C142583h() {
    }

    public C142583h(RuntimeException runtimeException) {
        this.f386893a = runtimeException;
    }

    public final void run() {
        throw this.f386893a;
    }
}
