package com.google.android.libraries.assistant.gallium.framework;

import android.content.Context;
import com.google.protos.p4850an.p4851a.p4852a.C63327k;

/* compiled from: PG */
public final class CppMobStoreResourceLoader extends C18307j {

    /* renamed from: a */
    long f51686a;

    private CppMobStoreResourceLoader(long j) {
        this.f51686a = j;
    }

    /* renamed from: b */
    public static CppMobStoreResourceLoader m35418b(Context context, C63327k kVar) {
        long nativeCreateResourceLoader = nativeCreateResourceLoader(context.getPackageName(), context.getFilesDir().getPath(), kVar.toByteArray());
        if (nativeCreateResourceLoader != 0) {
            return new CppMobStoreResourceLoader(nativeCreateResourceLoader);
        }
        throw new IllegalStateException("Could not create resource loader.");
    }

    private static native long nativeCreateResourceLoader(String str, String str2, byte[] bArr);

    private native long nativeDispose(long j);

    /* renamed from: a */
    public final long mo23655a() {
        return this.f51686a;
    }

    /* renamed from: c */
    public final void mo23656c() {
        long j = this.f51686a;
        if (j != 0) {
            nativeDispose(j);
        }
        this.f51686a = 0;
    }
}
