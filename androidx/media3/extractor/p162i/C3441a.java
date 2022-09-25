package androidx.media3.extractor.p162i;

import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3351az;
import androidx.media3.extractor.C3364bb;
import androidx.media3.extractor.C3365bc;

/* renamed from: androidx.media3.extractor.i.a */
/* compiled from: PG */
final class C3441a implements C3364bb {

    /* renamed from: a */
    final /* synthetic */ C3442b f10617a;

    public C3441a(C3442b bVar) {
        this.f10617a = bVar;
    }

    /* renamed from: b */
    public final C3351az mo7324b(long j) {
        C3442b bVar = this.f10617a;
        long f = bVar.f10620c.mo7411f(j);
        long j2 = bVar.f10618a;
        long j3 = bVar.f10619b;
        long j4 = -1 + j3;
        C3365bc bcVar = new C3365bc(j, C2612ak.m6994s((((f * (j3 - j2)) / bVar.f10621d) + j2) - 30000, j2, j4));
        return new C3351az(bcVar, bcVar);
    }

    /* renamed from: r */
    public final long mo7325r() {
        C3442b bVar = this.f10617a;
        return bVar.f10620c.mo7410e(bVar.f10621d);
    }

    /* renamed from: t */
    public final boolean mo7326t() {
        return true;
    }
}
