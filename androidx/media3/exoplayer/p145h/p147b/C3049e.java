package androidx.media3.exoplayer.p145h.p147b;

import android.util.SparseArray;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3350ay;
import androidx.media3.extractor.C3364bb;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.exoplayer.h.b.e */
/* compiled from: PG */
public final class C3049e implements C3329ad {

    /* renamed from: d */
    private static final C3350ay f8835d = new C3350ay();

    /* renamed from: a */
    public final C3326aa f8836a;

    /* renamed from: b */
    public C3364bb f8837b;

    /* renamed from: c */
    public C2680x[] f8838c;

    /* renamed from: e */
    private final int f8839e;

    /* renamed from: f */
    private final C2680x f8840f;

    /* renamed from: g */
    private final SparseArray f8841g = new SparseArray();

    /* renamed from: h */
    private boolean f8842h;

    /* renamed from: i */
    private long f8843i;

    /* renamed from: j */
    private C3047c f8844j;

    public C3049e(C3326aa aaVar, int i, C2680x xVar) {
        this.f8836a = aaVar;
        this.f8839e = i;
        this.f8840f = xVar;
    }

    /* renamed from: a */
    public final boolean mo6985a(C3327ab abVar) {
        int a = this.f8836a.mo7152a(abVar, f8835d);
        C2601a.m6832d(a != 1);
        return a == 0;
    }

    /* renamed from: b */
    public final void mo6986b(C3047c cVar, long j, long j2) {
        this.f8844j = cVar;
        this.f8843i = j2;
        if (!this.f8842h) {
            this.f8836a.mo7156s(this);
            if (j != -9223372036854775807L) {
                this.f8836a.mo7154d(0, j);
            }
            this.f8842h = true;
            return;
        }
        C3326aa aaVar = this.f8836a;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        aaVar.mo7154d(0, j);
        for (int i = 0; i < this.f8841g.size(); i++) {
            ((C3048d) this.f8841g.valueAt(i)).mo6984g(cVar, j2);
        }
    }

    /* renamed from: eZ */
    public final C3368bf mo6987eZ(int i, int i2) {
        C3048d dVar = (C3048d) this.f8841g.get(i);
        if (dVar == null) {
            C2601a.m6832d(this.f8838c == null);
            dVar = new C3048d(i2, i2 == this.f8839e ? this.f8840f : null);
            dVar.mo6984g(this.f8844j, this.f8843i);
            this.f8841g.put(i, dVar);
        }
        return dVar;
    }

    /* renamed from: fa */
    public final void mo6988fa() {
        C2680x[] xVarArr = new C2680x[this.f8841g.size()];
        for (int i = 0; i < this.f8841g.size(); i++) {
            C2680x xVar = ((C3048d) this.f8841g.valueAt(i)).f8829a;
            C2601a.m6829a(xVar);
            xVarArr[i] = xVar;
        }
        this.f8838c = xVarArr;
    }

    /* renamed from: q */
    public final void mo6989q(C3364bb bbVar) {
        this.f8837b = bbVar;
    }
}
