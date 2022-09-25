package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qa */
/* compiled from: PG */
final class C7218qa {
    /* renamed from: a */
    public static C7215py m21532a(C7050jv jvVar) {
        byte[] bArr;
        aee aee = new aee(16);
        if (C7216pz.m21531a(jvVar, aee).f23561a != 1380533830) {
            return null;
        }
        jvVar.mo16094g(aee.mo14555i(), 0, 4);
        aee.mo14554h(0);
        int v = aee.mo14568v();
        if (v != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(v);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        C7216pz a = C7216pz.m21531a(jvVar, aee);
        while (a.f23561a != 1718449184) {
            jvVar.mo16096i((int) a.f23562b);
            a = C7216pz.m21531a(jvVar, aee);
        }
        ary.m19464q(a.f23562b >= 16);
        jvVar.mo16094g(aee.mo14555i(), 0, 16);
        aee.mo14554h(0);
        int p = aee.mo14562p();
        int p2 = aee.mo14562p();
        int C = aee.mo14539C();
        aee.mo14539C();
        int p3 = aee.mo14562p();
        int p4 = aee.mo14562p();
        int i = ((int) a.f23562b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            jvVar.mo16094g(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = aeu.f20471f;
        }
        return new C7215py(p, p2, C, p3, p4, bArr);
    }
}
