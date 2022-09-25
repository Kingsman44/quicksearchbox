package com.google.android.libraries.gcoreclient.p1811z.p1812a;

import com.google.android.gms.udc.UdcCacheResponse;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.z.a.e */
/* compiled from: PG */
public final class C21748e {

    /* renamed from: a */
    private final UdcCacheResponse f60050a;

    public C21748e(UdcCacheResponse udcCacheResponse) {
        this.f60050a = udcCacheResponse;
    }

    /* renamed from: a */
    public final List mo27084a() {
        List<UdcCacheResponse.UdcSetting> list = this.f60050a.f394770a;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (UdcCacheResponse.UdcSetting hVar : list) {
            arrayList.add(new C21751h(hVar));
        }
        return arrayList;
    }
}
