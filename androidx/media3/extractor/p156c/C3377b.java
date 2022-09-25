package androidx.media3.extractor.p156c;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3330ae;
import androidx.media3.extractor.C3332ag;
import androidx.media3.extractor.C3333ah;
import androidx.media3.extractor.C3337al;
import androidx.media3.extractor.C3526k;
import androidx.media3.extractor.C3574l;
import androidx.media3.extractor.C3627q;

/* renamed from: androidx.media3.extractor.c.b */
/* compiled from: PG */
final class C3377b implements C3574l {

    /* renamed from: a */
    private final C3337al f10207a;

    /* renamed from: b */
    private final int f10208b;

    /* renamed from: c */
    private final C3332ag f10209c = new C3332ag();

    public C3377b(C3337al alVar, int i) {
        this.f10207a = alVar;
        this.f10208b = i;
    }

    /* renamed from: c */
    private final long m9764c(C3327ab abVar) {
        C3627q qVar;
        C3327ab abVar2 = abVar;
        while (true) {
            qVar = (C3627q) abVar2;
            if (abVar.mo7312e() >= qVar.f11565b - 6) {
                break;
            }
            C3337al alVar = this.f10207a;
            int i = this.f10208b;
            C3332ag agVar = this.f10209c;
            long e = abVar.mo7312e();
            byte[] bArr = new byte[2];
            qVar.mo7320o(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                qVar.f11568e = 0;
                qVar.mo7319n((int) (e - qVar.f11566c), false);
            } else {
                C2604ac acVar = new C2604ac(16);
                System.arraycopy(bArr, 0, acVar.f7234a, 0, 2);
                acVar.mo6158z(C3330ae.m9644a(abVar2, acVar.f7234a, 2, 14));
                qVar.f11568e = 0;
                qVar.mo7319n((int) (e - qVar.f11566c), false);
                if (C3333ah.m9653c(acVar, alVar, i, agVar)) {
                    break;
                }
            }
            qVar.mo7319n(1, false);
        }
        long e2 = abVar.mo7312e();
        long j = qVar.f11565b;
        if (e2 < -6 + j) {
            return this.f10209c.f10054a;
        }
        qVar.mo7319n((int) (j - abVar.mo7312e()), false);
        return this.f10207a.f10068j;
    }

    /* renamed from: a */
    public final C3526k mo7366a(C3327ab abVar, long j) {
        C3627q qVar = (C3627q) abVar;
        long j2 = qVar.f11566c;
        long c = m9764c(abVar);
        long e = abVar.mo7312e();
        qVar.mo7319n(Math.max(6, this.f10207a.f10061c), false);
        long c2 = m9764c(abVar);
        long e2 = abVar.mo7312e();
        if (c > j || c2 <= j) {
            return c2 <= j ? C3526k.m10185c(c2, e2) : C3526k.m10183a(c, j2);
        }
        return C3526k.m10184b(e);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo7367b() {
    }
}
