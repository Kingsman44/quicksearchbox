package com.google.android.libraries.blocks.runtime.java;

/* compiled from: PG */
public class ClientCreatorProxy {

    /* renamed from: a */
    private final long f54705a;

    public ClientCreatorProxy(long j) {
        this.f54705a = j;
    }

    private native long nativeCreateBlock(long j, int i);

    private native long nativeCreateConcreteBlock(long j, int i, InstanceProxy instanceProxy);

    private native long nativeCreateFromMovableRef(long j, String str);

    private native long nativeCreateFromSharedRef(long j, String str);

    private native long nativeCreateInstanceContext(long j, int i);

    private native void nativeDelete(long j);

    /* access modifiers changed from: protected */
    public final void finalize() {
        nativeDelete(this.f54705a);
    }
}
