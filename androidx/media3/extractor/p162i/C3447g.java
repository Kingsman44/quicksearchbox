package androidx.media3.extractor.p162i;

import androidx.media3.common.C2599az;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3330ae;
import androidx.media3.extractor.C3627q;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.media3.extractor.i.g */
/* compiled from: PG */
final class C3447g {

    /* renamed from: a */
    public int f10644a;

    /* renamed from: b */
    public long f10645b;

    /* renamed from: c */
    public int f10646c;

    /* renamed from: d */
    public int f10647d;

    /* renamed from: e */
    public int f10648e;

    /* renamed from: f */
    public final int[] f10649f = new int[PrivateKeyType.INVALID];

    /* renamed from: g */
    private final C2604ac f10650g = new C2604ac((int) PrivateKeyType.INVALID);

    /* renamed from: a */
    public final void mo7407a() {
        this.f10644a = 0;
        this.f10645b = 0;
        this.f10646c = 0;
        this.f10647d = 0;
        this.f10648e = 0;
    }

    /* renamed from: b */
    public final boolean mo7408b(C3327ab abVar, boolean z) {
        mo7407a();
        this.f10650g.mo6156x(27);
        if (C3330ae.m9648e(abVar, this.f10650g.f7234a, 27, z) && this.f10650g.mo6146n() == 1332176723) {
            if (this.f10650g.mo6139g() == 0) {
                this.f10644a = this.f10650g.mo6139g();
                this.f10645b = this.f10650g.mo6143k();
                this.f10650g.mo6144l();
                this.f10650g.mo6144l();
                this.f10650g.mo6144l();
                int g = this.f10650g.mo6139g();
                this.f10646c = g;
                this.f10647d = g + 27;
                this.f10650g.mo6156x(g);
                if (C3330ae.m9648e(abVar, this.f10650g.f7234a, this.f10646c, z)) {
                    for (int i = 0; i < this.f10646c; i++) {
                        this.f10649f[i] = this.f10650g.mo6139g();
                        this.f10648e += this.f10649f[i];
                    }
                    return true;
                }
            } else if (z) {
                return false;
            } else {
                throw C2599az.m6822d("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo7409c(C3327ab abVar, long j) {
        int c;
        C3627q qVar = (C3627q) abVar;
        C2601a.m6830b(qVar.f11566c == abVar.mo7312e());
        this.f10650g.mo6156x(4);
        while (true) {
            if ((j == -1 || qVar.f11566c + 4 < j) && C3330ae.m9648e(abVar, this.f10650g.f7234a, 4, true)) {
                this.f10650g.mo6131A(0);
                if (this.f10650g.mo6146n() == 1332176723) {
                    qVar.f11568e = 0;
                    return true;
                }
                qVar.mo7639q(1);
            }
        }
        do {
            if (j != -1 && qVar.f11566c >= j) {
                break;
            }
            c = qVar.mo7636c(1);
            if (c == 0) {
                c = qVar.mo7635b(qVar.f11564a, 0, Math.min(1, 4096), 0, true);
            }
            qVar.mo7637h(c);
        } while (c != -1);
        return false;
    }
}
