package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.ondevice.k.x */
/* compiled from: PG */
public final class C24754x {

    /* renamed from: a */
    public final OnDeviceEngineNativeApi f67642a;

    /* renamed from: b */
    public final C24530h f67643b;

    static {
        C58974d.m91135i("EmbeddingEngineHelper");
    }

    public C24754x(OnDeviceEngineNativeApi onDeviceEngineNativeApi, C24530h hVar) {
        this.f67642a = onDeviceEngineNativeApi;
        this.f67643b = hVar;
    }

    /* renamed from: a */
    public static final String m45908a(int i) {
        int i2 = i - 2;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            return "mobile_sbv5_floating_v0_0_uncompressed_with_metadata";
        } else {
            if (i2 == 2) {
                return "mobile_sbv5_quantized_v0_0_compressed";
            }
            if (i2 == 3) {
                return "mobile_sbv5_quantized_v0_1_compressed";
            }
            throw new IllegalArgumentException("Invalid embedding model name");
        }
    }
}
