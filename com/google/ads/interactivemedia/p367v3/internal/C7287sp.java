package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sp */
/* compiled from: PG */
public final class C7287sp implements adc {

    /* renamed from: a */
    private final adc f23758a;

    /* renamed from: b */
    private final List f23759b;

    public C7287sp(adc adc, List list) {
        this.f23758a = adc;
        this.f23759b = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14477a(Uri uri, InputStream inputStream) {
        C7286so soVar = (C7286so) this.f23758a.mo14477a(uri, inputStream);
        List list = this.f23759b;
        return (list == null || list.isEmpty()) ? soVar : (C7286so) soVar.mo16457a(this.f23759b);
    }
}
