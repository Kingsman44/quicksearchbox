package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8406v;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8386b;
import com.google.p386ak.p394d.C8387c;

/* renamed from: com.google.ak.b.a.v */
/* compiled from: PG */
final class C8322v extends C8266aa {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        long j;
        if (aVar.mo17127r() == 9) {
            aVar.mo17123n();
            return null;
        }
        try {
            int i = aVar.f29219d;
            if (i == 0) {
                i = aVar.mo17110b();
            }
            if (i == 15) {
                aVar.f29219d = 0;
                int[] iArr = aVar.f29224i;
                int i2 = aVar.f29223h - 1;
                iArr[i2] = iArr[i2] + 1;
                j = aVar.f29220e;
            } else {
                if (i == 16) {
                    char[] cArr = aVar.f29217b;
                    int i3 = aVar.f29218c;
                    int i4 = aVar.f29221f;
                    aVar.f29222g = new String(cArr, i3, i4);
                    aVar.f29218c = i3 + i4;
                } else {
                    if (!(i == 8 || i == 9)) {
                        if (i != 10) {
                            int r = aVar.mo17127r();
                            throw new IllegalStateException("Expected a long but was " + C8386b.m23197a(r) + aVar.mo17114e());
                        }
                    }
                    if (i == 10) {
                        aVar.f29222g = aVar.mo17118i();
                    } else {
                        aVar.f29222g = aVar.mo17116g(i == 8 ? '\'' : '\"');
                    }
                    try {
                        long parseLong = Long.parseLong(aVar.f29222g);
                        aVar.f29219d = 0;
                        int[] iArr2 = aVar.f29224i;
                        int i5 = aVar.f29223h - 1;
                        iArr2[i5] = iArr2[i5] + 1;
                        j = parseLong;
                    } catch (NumberFormatException unused) {
                    }
                }
                aVar.f29219d = 11;
                double parseDouble = Double.parseDouble(aVar.f29222g);
                long j2 = (long) parseDouble;
                if (((double) j2) == parseDouble) {
                    aVar.f29222g = null;
                    aVar.f29219d = 0;
                    int[] iArr3 = aVar.f29224i;
                    int i6 = aVar.f29223h - 1;
                    iArr3[i6] = iArr3[i6] + 1;
                    j = j2;
                } else {
                    throw new NumberFormatException("Expected a long but was " + aVar.f29222g + aVar.mo17114e());
                }
            }
            return Long.valueOf(j);
        } catch (NumberFormatException e) {
            throw new C8406v((Throwable) e);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        cVar.mo17140j((Number) obj);
    }
}
