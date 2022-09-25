package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import com.google.android.libraries.p579ar.faceviewer.runtime.RuntimeJni;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.ab */
/* compiled from: PG */
public final class C10581ab implements AutoCloseable {

    /* renamed from: b */
    public static final /* synthetic */ int f35401b = 0;

    /* renamed from: a */
    public final RuntimeJni f35402a;

    public C10581ab(RuntimeJni runtimeJni) {
        this.f35402a = runtimeJni;
    }

    public final void close() {
        RuntimeJni runtimeJni = this.f35402a;
        long j = runtimeJni.f35580a;
        if (j != 0) {
            runtimeJni.nativeDestroy(j);
            runtimeJni.f35580a = 0;
        }
    }
}
