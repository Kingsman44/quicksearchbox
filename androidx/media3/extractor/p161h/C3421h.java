package androidx.media3.extractor.p161h;

import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;

/* renamed from: androidx.media3.extractor.h.h */
/* compiled from: PG */
final class C3421h implements C3419f {

    /* renamed from: a */
    private final int f10481a;

    /* renamed from: b */
    private final int f10482b;

    /* renamed from: c */
    private final C2604ac f10483c;

    public C3421h(C3415b bVar, C2680x xVar) {
        C2604ac acVar = bVar.f10462a;
        this.f10483c = acVar;
        acVar.mo6131A(12);
        int i = acVar.mo6141i();
        if ("audio/raw".equals(xVar.f7496n)) {
            int n = C2612ak.m6989n(xVar.f7479C, xVar.f7477A);
            if (i == 0 || i % n != 0) {
                C2633u.m7050e("AtomParsers", "Audio sample size mismatch. stsd sample size: " + n + ", stsz sample size: " + i);
                i = n;
            }
        }
        this.f10481a = i == 0 ? -1 : i;
        this.f10482b = acVar.mo6141i();
    }

    /* renamed from: a */
    public final int mo7387a() {
        return this.f10481a;
    }

    /* renamed from: b */
    public final int mo7388b() {
        return this.f10482b;
    }

    /* renamed from: c */
    public final int mo7389c() {
        int i = this.f10481a;
        return i == -1 ? this.f10483c.mo6141i() : i;
    }
}
