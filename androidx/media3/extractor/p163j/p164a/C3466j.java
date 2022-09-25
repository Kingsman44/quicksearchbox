package androidx.media3.extractor.p163j.p164a;

import androidx.media3.extractor.p163j.C3496f;

/* renamed from: androidx.media3.extractor.j.a.j */
/* compiled from: PG */
final class C3466j extends C3496f implements Comparable {

    /* renamed from: h */
    public long f10768h;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C3466j jVar = (C3466j) obj;
        if (mo5954fh(4) != jVar.mo5954fh(4)) {
            return !mo5954fh(4) ? -1 : 1;
        }
        long j = this.f6957e - jVar.f6957e;
        if (j == 0) {
            j = this.f10768h - jVar.f10768h;
            if (j == 0) {
                return 0;
            }
        }
        return j <= 0 ? -1 : 1;
    }
}
