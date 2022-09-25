package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.common.p4526f.p4527a.C58974d;

/* compiled from: PG */
class NativeScreenAnnotator {

    /* renamed from: a */
    public static final C58974d f214627a = C58974d.m91136j();

    /* renamed from: b */
    public final long f214628b = nativeCreate();

    public static native long getCodeVersion();

    public static native byte[] nativeAnnotate(long j, long j2, byte[] bArr);

    private static native long nativeCreate();

    public static native boolean nativeDestroy(long j);

    private static native boolean nativeUpdateModels(long j, byte[] bArr);
}
