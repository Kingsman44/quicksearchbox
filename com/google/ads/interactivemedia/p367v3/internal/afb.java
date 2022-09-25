package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afb */
/* compiled from: PG */
public final class afb {

    /* renamed from: a */
    public final List f20504a;

    /* renamed from: b */
    public final int f20505b;

    private afb(List list, int i) {
        this.f20504a = list;
        this.f20505b = i;
    }

    /* renamed from: a */
    public static afb m18568a(aee aee) {
        List list;
        try {
            aee.mo14557k(21);
            int n = aee.mo14560n() & 3;
            int n2 = aee.mo14560n();
            int g = aee.mo14553g();
            int i = 0;
            for (int i2 = 0; i2 < n2; i2++) {
                aee.mo14557k(1);
                int o = aee.mo14561o();
                for (int i3 = 0; i3 < o; i3++) {
                    int o2 = aee.mo14561o();
                    i += o2 + 4;
                    aee.mo14557k(o2);
                }
            }
            aee.mo14554h(g);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < n2; i5++) {
                aee.mo14557k(1);
                int o3 = aee.mo14561o();
                for (int i6 = 0; i6 < o3; i6++) {
                    int o4 = aee.mo14561o();
                    System.arraycopy(aec.f20417a, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(aee.mo14555i(), aee.mo14553g(), bArr, i7, o4);
                    i4 = i7 + o4;
                    aee.mo14557k(o4);
                }
            }
            if (i == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new afb(list, n + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C6886dt("Error parsing HEVC config", e);
        }
    }
}
