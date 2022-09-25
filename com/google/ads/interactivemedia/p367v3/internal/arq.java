package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arq */
/* compiled from: PG */
public final class arq {

    /* renamed from: a */
    Object[] f21457a;

    /* renamed from: b */
    int f21458b;

    public arq() {
        this(4);
    }

    /* renamed from: d */
    private final void m19422d(int i) {
        int i2 = i + i;
        Object[] objArr = this.f21457a;
        int length = objArr.length;
        if (i2 > length) {
            this.f21457a = Arrays.copyOf(objArr, ari.m19385a(length, i2));
        }
    }

    /* renamed from: a */
    public final ars mo15310a() {
        return asi.m19496k(this.f21458b, this.f21457a);
    }

    /* renamed from: b */
    public final void mo15311b(Object obj, Object obj2) {
        m19422d(this.f21458b + 1);
        ary.m19459l(obj, obj2);
        Object[] objArr = this.f21457a;
        int i = this.f21458b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.f21458b = i + 1;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15312c(java.lang.Iterable r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x000e
            int r0 = r2.f21458b
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.m19422d(r0)
        L_0x000e:
            java.util.Iterator r3 = r3.iterator()
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.mo15311b(r1, r0)
            goto L_0x0012
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.arq.mo15312c(java.lang.Iterable):void");
    }

    public arq(int i) {
        this.f21457a = new Object[(i + i)];
        this.f21458b = 0;
    }
}
