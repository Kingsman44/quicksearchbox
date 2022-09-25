package androidx.media3.extractor;

import androidx.media3.common.C2671o;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2604ac;
import java.io.EOFException;

/* renamed from: androidx.media3.extractor.z */
/* compiled from: PG */
public final class C3636z implements C3368bf {

    /* renamed from: a */
    private final byte[] f11583a = new byte[4096];

    /* renamed from: a */
    public final /* synthetic */ int mo6849a(C2671o oVar, int i, boolean z) {
        int a = oVar.mo5879a(this.f11583a, 0, Math.min(4096, i));
        if (a != -1) {
            return a;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    public final void mo6850b(C2680x xVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo6851c(C2604ac acVar, int i) {
        acVar.mo6131A(acVar.f7235b + i);
    }

    /* renamed from: d */
    public final void mo6852d(long j, int i, int i2, int i3, C3367be beVar) {
    }

    /* renamed from: e */
    public final int mo6853e(C2671o oVar, int i, boolean z) {
        throw null;
    }

    /* renamed from: f */
    public final void mo6854f(C2604ac acVar, int i) {
        acVar.mo6131A(acVar.f7235b + i);
    }
}
