package androidx.media3.extractor.p155b;

import androidx.media3.extractor.C3351az;
import androidx.media3.extractor.C3364bb;

/* renamed from: androidx.media3.extractor.b.b */
/* compiled from: PG */
final class C3354b implements C3364bb {

    /* renamed from: a */
    final /* synthetic */ C3356d f10128a;

    /* renamed from: b */
    private final long f10129b;

    public C3354b(C3356d dVar, long j) {
        this.f10128a = dVar;
        this.f10129b = j;
    }

    /* renamed from: b */
    public final C3351az mo7324b(long j) {
        C3351az b = this.f10128a.f10133a[0].mo7351b(j);
        int i = 1;
        while (true) {
            C3359g[] gVarArr = this.f10128a.f10133a;
            if (i >= gVarArr.length) {
                return b;
            }
            C3351az b2 = gVarArr[i].mo7351b(j);
            if (b2.f10123a.f10175c < b.f10123a.f10175c) {
                b = b2;
            }
            i++;
        }
    }

    /* renamed from: r */
    public final long mo7325r() {
        return this.f10129b;
    }

    /* renamed from: t */
    public final boolean mo7326t() {
        return true;
    }
}
