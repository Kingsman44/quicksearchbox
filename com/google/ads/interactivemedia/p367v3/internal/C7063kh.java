package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.kh */
/* compiled from: PG */
public final class C7063kh {

    /* renamed from: a */
    public final int f22604a;

    /* renamed from: b */
    public final int f22605b;

    /* renamed from: c */
    public final int f22606c;

    /* renamed from: d */
    public final int f22607d;

    /* renamed from: e */
    public final int f22608e;

    /* renamed from: f */
    public final int f22609f;

    /* renamed from: g */
    public final int f22610g;

    /* renamed from: h */
    public final int f22611h;

    /* renamed from: i */
    public final int f22612i;

    /* renamed from: j */
    public final long f22613j;

    /* renamed from: k */
    public final C7062kg f22614k;

    /* renamed from: l */
    private final C7243qz f22615l;

    private C7063kh(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C7062kg kgVar, C7243qz qzVar) {
        this.f22604a = i;
        this.f22605b = i2;
        this.f22606c = i3;
        this.f22607d = i4;
        this.f22608e = i5;
        this.f22609f = m20949h(i5);
        this.f22610g = i6;
        this.f22611h = i7;
        this.f22612i = m20950i(i7);
        this.f22613j = j;
        this.f22614k = kgVar;
        this.f22615l = qzVar;
    }

    public C7063kh(byte[] bArr, int i) {
        aed aed = new aed(bArr);
        aed.mo14528e(i * 8);
        this.f22604a = aed.mo14532i(16);
        this.f22605b = aed.mo14532i(16);
        this.f22606c = aed.mo14532i(24);
        this.f22607d = aed.mo14532i(24);
        int i2 = aed.mo14532i(20);
        this.f22608e = i2;
        this.f22609f = m20949h(i2);
        this.f22610g = aed.mo14532i(3) + 1;
        int i3 = aed.mo14532i(5) + 1;
        this.f22611h = i3;
        this.f22612i = m20950i(i3);
        this.f22613j = aeu.m18500R(aed.mo14532i(4), aed.mo14532i(32));
        this.f22614k = null;
        this.f22615l = null;
    }

    /* renamed from: h */
    private static int m20949h(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: i */
    private static int m20950i(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: j */
    private static C7243qz m20951j(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] A = aeu.m18483A(str, "=");
            if (A.length != 2) {
                String valueOf = String.valueOf(str);
                Log.w("FlacStreamMetadata", valueOf.length() != 0 ? "Failed to parse Vorbis comment: ".concat(valueOf) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new C7253ri(A[0], A[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C7243qz((List) arrayList);
    }

    /* renamed from: a */
    public final long mo16116a() {
        long j = this.f22613j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f22608e);
    }

    /* renamed from: b */
    public final long mo16117b(long j) {
        return aeu.m18491I((j * ((long) this.f22608e)) / 1000000, 0, this.f22613j - 1);
    }

    /* renamed from: c */
    public final C6864cy mo16118c(byte[] bArr, C7243qz qzVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.f22607d;
        if (i <= 0) {
            i = -1;
        }
        C7243qz d = mo16119d(qzVar);
        C6863cx cxVar = new C6863cx();
        cxVar.mo15630ae("audio/flac");
        cxVar.mo15621W(i);
        cxVar.mo15606H(this.f22610g);
        cxVar.mo15631af(this.f22608e);
        cxVar.mo15618T(Collections.singletonList(bArr));
        cxVar.mo15622X(d);
        return cxVar.mo15625a();
    }

    /* renamed from: d */
    public final C7243qz mo16119d(C7243qz qzVar) {
        C7243qz qzVar2 = this.f22615l;
        return qzVar2 == null ? qzVar : qzVar2.mo16343c(qzVar);
    }

    /* renamed from: e */
    public final C7063kh mo16120e(C7062kg kgVar) {
        return new C7063kh(this.f22604a, this.f22605b, this.f22606c, this.f22607d, this.f22608e, this.f22610g, this.f22611h, this.f22613j, kgVar, this.f22615l);
    }

    /* renamed from: f */
    public final C7063kh mo16121f(List list) {
        return new C7063kh(this.f22604a, this.f22605b, this.f22606c, this.f22607d, this.f22608e, this.f22610g, this.f22611h, this.f22613j, this.f22614k, mo16119d(m20951j(list, Collections.emptyList())));
    }

    /* renamed from: g */
    public final C7063kh mo16122g(List list) {
        return new C7063kh(this.f22604a, this.f22605b, this.f22606c, this.f22607d, this.f22608e, this.f22610g, this.f22611h, this.f22613j, this.f22614k, mo16119d(m20951j(Collections.emptyList(), list)));
    }
}
