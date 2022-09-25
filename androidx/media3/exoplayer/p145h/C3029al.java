package androidx.media3.exoplayer.p145h;

import androidx.media3.common.C2649bk;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.exoplayer.h.al */
/* compiled from: PG */
final class C3029al extends C3024ag {

    /* renamed from: b */
    public static final Object f8782b = new Object();

    /* renamed from: d */
    public final Object f8783d;

    /* renamed from: e */
    private final Object f8784e;

    public C3029al(C2651bm bmVar, Object obj, Object obj2) {
        super(bmVar);
        this.f8784e = obj;
        this.f8783d = obj2;
    }

    /* renamed from: a */
    public final int mo6020a(Object obj) {
        Object obj2;
        C2651bm bmVar = this.f8765a;
        if (f8782b.equals(obj) && (obj2 = this.f8783d) != null) {
            obj = obj2;
        }
        return bmVar.mo6020a(obj);
    }

    /* renamed from: d */
    public final C2649bk mo6023d(int i, C2649bk bkVar, boolean z) {
        this.f8765a.mo6023d(i, bkVar, z);
        if (C2612ak.m6951aa(bkVar.f7329b, this.f8783d) && z) {
            bkVar.f7329b = f8782b;
        }
        return bkVar;
    }

    /* renamed from: e */
    public final C2650bl mo6024e(int i, C2650bl blVar, long j) {
        this.f8765a.mo6024e(i, blVar, j);
        if (C2612ak.m6951aa(blVar.f7337b, this.f8784e)) {
            blVar.f7337b = C2650bl.f7335a;
        }
        return blVar;
    }

    /* renamed from: f */
    public final Object mo6026f(int i) {
        Object f = this.f8765a.mo6026f(i);
        return C2612ak.m6951aa(f, this.f8783d) ? f8782b : f;
    }

    /* renamed from: p */
    public final C3029al mo6970p(C2651bm bmVar) {
        return new C3029al(bmVar, this.f8784e, this.f8783d);
    }
}
