package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi;
import com.google.android.libraries.lens.ondevice.p2023c.C24291a;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.android.libraries.p1657ba.p1664c.p1668c.C19667e;
import com.google.android.libraries.p1657ba.p1664c.p1668c.C19668f;
import java.io.File;

/* renamed from: com.google.android.libraries.lens.ondevice.k.er */
/* compiled from: PG */
public final class C24661er {

    /* renamed from: a */
    public final OnDeviceEngineNativeApi f67467a;

    /* renamed from: b */
    public final C24530h f67468b;

    public C24661er(OnDeviceEngineNativeApi onDeviceEngineNativeApi, C24530h hVar) {
        this.f67467a = onDeviceEngineNativeApi;
        this.f67468b = hVar;
    }

    /* renamed from: a */
    public static final C19668f m45768a(String str) {
        File file = new File(str);
        File file2 = new File(file, C24291a.m45354a(file));
        C19667e eVar = (C19667e) C19668f.f54700c.createBuilder();
        String file3 = file2.toString();
        eVar.copyOnWrite();
        C19668f fVar = (C19668f) eVar.instance;
        file3.getClass();
        fVar.f54702a |= 2;
        fVar.f54703b = file3;
        return (C19668f) eVar.build();
    }
}
