package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aev */
/* compiled from: PG */
public final class aev {

    /* renamed from: a */
    public final List f20480a;

    /* renamed from: b */
    public final int f20481b;

    /* renamed from: c */
    public final int f20482c;

    /* renamed from: d */
    public final int f20483d;

    /* renamed from: e */
    public final float f20484e;

    private aev(List list, int i, int i2, int i3, float f) {
        this.f20480a = list;
        this.f20481b = i;
        this.f20482c = i2;
        this.f20483d = i3;
        this.f20484e = f;
    }

    /* renamed from: a */
    public static aev m18557a(aee aee) {
        float f;
        int i;
        int i2;
        try {
            aee.mo14557k(4);
            int n = (aee.mo14560n() & 3) + 1;
            if (n != 3) {
                ArrayList arrayList = new ArrayList();
                int n2 = aee.mo14560n() & 31;
                for (int i3 = 0; i3 < n2; i3++) {
                    arrayList.add(m18558b(aee));
                }
                int n3 = aee.mo14560n();
                for (int i4 = 0; i4 < n3; i4++) {
                    arrayList.add(m18558b(aee));
                }
                if (n2 > 0) {
                    aeb b = aec.m18364b((byte[]) arrayList.get(0), n, ((byte[]) arrayList.get(0)).length);
                    int i5 = b.f20408e;
                    int i6 = b.f20409f;
                    f = b.f20410g;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new aev(arrayList, n, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C6886dt("Error parsing AVC config", e);
        }
    }

    /* renamed from: b */
    private static byte[] m18558b(aee aee) {
        int o = aee.mo14561o();
        int g = aee.mo14553g();
        aee.mo14557k(o);
        return adl.m18316a(aee.mo14555i(), g, o);
    }
}
