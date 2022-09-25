package androidx.media3.extractor.p162i;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3330ae;

/* renamed from: androidx.media3.extractor.i.f */
/* compiled from: PG */
final class C3446f {

    /* renamed from: a */
    public final C3447g f10639a = new C3447g();

    /* renamed from: b */
    public final C2604ac f10640b = new C2604ac(new byte[65025], 0);

    /* renamed from: c */
    public int f10641c = -1;

    /* renamed from: d */
    public boolean f10642d;

    /* renamed from: e */
    private int f10643e;

    /* renamed from: b */
    private final int m9982b(int i) {
        int i2;
        int i3 = 0;
        this.f10643e = 0;
        do {
            int i4 = this.f10643e;
            int i5 = i + i4;
            C3447g gVar = this.f10639a;
            if (i5 >= gVar.f10646c) {
                break;
            }
            int[] iArr = gVar.f10649f;
            this.f10643e = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: a */
    public final boolean mo7406a(C3327ab abVar) {
        if (this.f10642d) {
            this.f10642d = false;
            this.f10640b.mo6156x(0);
        }
        while (true) {
            boolean z = true;
            if (this.f10642d) {
                return true;
            }
            int i = this.f10641c;
            if (i < 0) {
                if (!this.f10639a.mo7409c(abVar, -1) || !this.f10639a.mo7408b(abVar, true)) {
                    return false;
                }
                C3447g gVar = this.f10639a;
                int i2 = gVar.f10647d;
                if ((gVar.f10644a & 1) == 1 && this.f10640b.f7236c == 0) {
                    i2 += m9982b(0);
                    i = this.f10643e;
                } else {
                    i = 0;
                }
                if (!C3330ae.m9647d(abVar, i2)) {
                    return false;
                }
                this.f10641c = i;
            }
            int b = m9982b(i);
            int i3 = this.f10641c + this.f10643e;
            if (b > 0) {
                C2604ac acVar = this.f10640b;
                acVar.mo6153u(acVar.f7236c + b);
                C2604ac acVar2 = this.f10640b;
                if (!C3330ae.m9646c(abVar, acVar2.f7234a, acVar2.f7236c, b)) {
                    return false;
                }
                C2604ac acVar3 = this.f10640b;
                acVar3.mo6158z(acVar3.f7236c + b);
                if (this.f10639a.f10649f[i3 - 1] == 255) {
                    z = false;
                }
                this.f10642d = z;
            }
            if (i3 == this.f10639a.f10646c) {
                i3 = -1;
            }
            this.f10641c = i3;
        }
        return false;
    }
}
