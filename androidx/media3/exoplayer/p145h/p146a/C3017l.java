package androidx.media3.exoplayer.p145h.p146a;

import androidx.media3.common.C2649bk;
import androidx.media3.common.C2651bm;
import androidx.media3.common.C2659c;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.exoplayer.p145h.C3024ag;

/* renamed from: androidx.media3.exoplayer.h.a.l */
/* compiled from: PG */
public final class C3017l extends C3024ag {

    /* renamed from: b */
    private final C2659c f8747b;

    public C3017l(C2651bm bmVar, C2659c cVar) {
        super(bmVar);
        boolean z = false;
        C2601a.m6832d(bmVar.mo6021b() == 1);
        C2601a.m6832d(bmVar.mo6022c() == 1 ? true : z);
        this.f8747b = cVar;
    }

    /* renamed from: d */
    public final C2649bk mo6023d(int i, C2649bk bkVar, boolean z) {
        this.f8765a.mo6023d(i, bkVar, z);
        long j = bkVar.f7331d;
        if (j == -9223372036854775807L) {
            j = this.f8747b.f7417e;
        }
        C2649bk bkVar2 = bkVar;
        bkVar2.mo6290i(bkVar.f7328a, bkVar.f7329b, bkVar.f7330c, j, bkVar.f7332e, this.f8747b, bkVar.f7333f);
        return bkVar;
    }
}
