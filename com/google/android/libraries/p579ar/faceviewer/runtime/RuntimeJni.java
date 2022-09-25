package com.google.android.libraries.p579ar.faceviewer.runtime;

import com.google.android.libraries.p579ar.faceviewer.p580a.p585e.C10616q;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p363ad.p364a.C6682f;
import com.google.research.xeno.effect.AssetDownloader;

/* renamed from: com.google.android.libraries.ar.faceviewer.runtime.RuntimeJni */
/* compiled from: PG */
public final class RuntimeJni {

    /* renamed from: b */
    private static final C59071e f35579b = C59071e.m91332i("com.google.android.libraries.ar.faceviewer.runtime.RuntimeJni");

    /* renamed from: a */
    public long f35580a;

    public RuntimeJni(long j) {
        this.f35580a = j;
    }

    /* renamed from: a */
    public static void m25660a(AssetDownloader assetDownloader, String str, C6682f fVar, String str2, C10616q qVar) {
        nativeCreate(assetDownloader, str, fVar.toByteArray(), str2, new NativeCallback(qVar, C10667e.f35586a));
    }

    private static native void nativeCreate(AssetDownloader assetDownloader, String str, byte[] bArr, String str2, NativeCallback nativeCallback);

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (this.f35580a != 0) {
            ((C59052c) ((C59052c) f35579b.mo56225c()).mo56372aa(42308)).mo56386p("RuntimeJni finalized with non-null nativeHandle.");
        }
    }

    public native void nativeDestroy(long j);

    public native void nativeMakeExperience(long j, byte[] bArr, NativeCallback nativeCallback);
}
