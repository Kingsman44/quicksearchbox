package androidx.media3.extractor.p172k;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2609ah;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3526k;
import androidx.media3.extractor.C3574l;
import androidx.media3.extractor.C3627q;

/* renamed from: androidx.media3.extractor.k.aa */
/* compiled from: PG */
final class C3528aa implements C3574l {

    /* renamed from: a */
    private final C2609ah f11031a;

    /* renamed from: b */
    private final C2604ac f11032b = new C2604ac();

    public C3528aa(C2609ah ahVar) {
        this.f11031a = ahVar;
    }

    /* renamed from: a */
    public final C3526k mo7366a(C3327ab abVar, long j) {
        int g;
        long j2;
        C3627q qVar = (C3627q) abVar;
        long j3 = qVar.f11566c;
        int min = (int) Math.min(20000, qVar.f11565b - j3);
        this.f11032b.mo6156x(min);
        qVar.mo7320o(this.f11032b.f7234a, 0, min, false);
        C2604ac acVar = this.f11032b;
        int i = -1;
        long j4 = -9223372036854775807L;
        int i2 = -1;
        while (true) {
            int i3 = acVar.f7236c;
            int i4 = acVar.f7235b;
            if (i3 - i4 < 4) {
                return j4 != -9223372036854775807L ? C3526k.m10185c(j4, j3 + ((long) i)) : C3526k.f11024a;
            }
            if (C3529ab.m10193g(acVar.f7234a, i4) != 442) {
                acVar.mo6131A(acVar.f7235b + 1);
            } else {
                acVar.mo6131A(acVar.f7235b + 4);
                long a = C3530ac.m10194a(acVar);
                if (a != -9223372036854775807L) {
                    long b = this.f11031a.mo6180b(a);
                    if (b > j) {
                        if (j4 == -9223372036854775807L) {
                            return C3526k.m10183a(b, j3);
                        }
                        j2 = (long) i2;
                    } else if (100000 + b > j) {
                        j2 = (long) acVar.f7235b;
                        break;
                    } else {
                        i2 = acVar.f7235b;
                        j4 = b;
                    }
                }
                int i5 = acVar.f7236c;
                int i6 = acVar.f7235b;
                if (i5 - i6 >= 10) {
                    acVar.mo6131A(i6 + 9);
                    int g2 = acVar.mo6139g() & 7;
                    int i7 = acVar.f7236c;
                    int i8 = acVar.f7235b;
                    if (i7 - i8 >= g2) {
                        acVar.mo6131A(i8 + g2);
                        int i9 = acVar.f7236c;
                        int i10 = acVar.f7235b;
                        if (i9 - i10 >= 4) {
                            if (C3529ab.m10193g(acVar.f7234a, i10) == 443) {
                                acVar.mo6131A(acVar.f7235b + 4);
                                int j5 = acVar.mo6142j();
                                int i11 = acVar.f7236c;
                                int i12 = acVar.f7235b;
                                if (i11 - i12 < j5) {
                                    acVar.mo6131A(i5);
                                } else {
                                    acVar.mo6131A(i12 + j5);
                                }
                            }
                            while (true) {
                                int i13 = acVar.f7236c;
                                int i14 = acVar.f7235b;
                                if (i13 - i14 < 4 || (g = C3529ab.m10193g(acVar.f7234a, i14)) == 442 || g == 441 || (g >>> 8) != 1) {
                                    break;
                                }
                                acVar.mo6131A(acVar.f7235b + 4);
                                if (acVar.f7236c - acVar.f7235b < 2) {
                                    acVar.mo6131A(i5);
                                    break;
                                }
                                acVar.mo6131A(Math.min(acVar.f7236c, acVar.f7235b + acVar.mo6142j()));
                            }
                        } else {
                            acVar.mo6131A(i5);
                        }
                    } else {
                        acVar.mo6131A(i5);
                    }
                } else {
                    acVar.mo6131A(i5);
                }
                i = acVar.f7235b;
            }
        }
        return C3526k.m10184b(j3 + j2);
    }

    /* renamed from: b */
    public final void mo7367b() {
        C2604ac acVar = this.f11032b;
        byte[] bArr = C2612ak.f7254f;
        int length = bArr.length;
        acVar.mo6157y(bArr, 0);
    }
}
