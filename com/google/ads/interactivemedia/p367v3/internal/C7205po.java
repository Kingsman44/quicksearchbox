package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.po */
/* compiled from: PG */
public final class C7205po {

    /* renamed from: a */
    public final int f23514a;

    /* renamed from: b */
    public final String f23515b;

    /* renamed from: c */
    public final List f23516c;

    /* renamed from: d */
    public final byte[] f23517d;

    public C7205po(int i, String str, List list, byte[] bArr) {
        List list2;
        this.f23514a = i;
        this.f23515b = str;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f23516c = list2;
        this.f23517d = bArr;
    }
}
