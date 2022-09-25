package androidx.media3.exoplayer.p137a;

import androidx.media3.exoplayer.p145h.C3036as;

/* renamed from: androidx.media3.exoplayer.a.bm */
/* compiled from: PG */
final class C2724bm {

    /* renamed from: a */
    public final String f7561a;

    /* renamed from: b */
    public int f7562b;

    /* renamed from: c */
    public long f7563c;

    /* renamed from: d */
    public C3036as f7564d;

    /* renamed from: e */
    public boolean f7565e;

    /* renamed from: f */
    public boolean f7566f;

    /* renamed from: g */
    final /* synthetic */ C2725bn f7567g;

    public C2724bm(C2725bn bnVar, String str, int i, C3036as asVar) {
        this.f7567g = bnVar;
        this.f7561a = str;
        this.f7562b = i;
        this.f7563c = asVar == null ? -1 : asVar.f7207d;
        if (asVar != null && asVar.mo6102a()) {
            this.f7564d = asVar;
        }
    }

    /* renamed from: a */
    public final void mo6411a(int i, C3036as asVar) {
        if (this.f7563c == -1 && i == this.f7562b && asVar != null) {
            this.f7563c = asVar.f7207d;
        }
    }

    /* renamed from: b */
    public final boolean mo6412b(int i, C3036as asVar) {
        if (asVar == null) {
            return i == this.f7562b;
        }
        C3036as asVar2 = this.f7564d;
        return asVar2 == null ? !asVar.mo6102a() && asVar.f7207d == this.f7563c : asVar.f7207d == asVar2.f7207d && asVar.f7205b == asVar2.f7205b && asVar.f7206c == asVar2.f7206c;
    }

    /* renamed from: c */
    public final boolean mo6413c(C2711b bVar) {
        long j = this.f7563c;
        if (j == -1) {
            return false;
        }
        C3036as asVar = bVar.f7530d;
        if (asVar == null) {
            return this.f7562b != bVar.f7529c;
        }
        if (asVar.f7207d > j) {
            return true;
        }
        if (this.f7564d == null) {
            return false;
        }
        int a = bVar.f7528b.mo6020a(asVar.f7204a);
        int a2 = bVar.f7528b.mo6020a(this.f7564d.f7204a);
        C3036as asVar2 = bVar.f7530d;
        if (asVar2.f7207d < this.f7564d.f7207d || a < a2) {
            return false;
        }
        if (a > a2) {
            return true;
        }
        if (asVar2.mo6102a()) {
            C3036as asVar3 = bVar.f7530d;
            int i = asVar3.f7205b;
            int i2 = asVar3.f7206c;
            C3036as asVar4 = this.f7564d;
            int i3 = asVar4.f7205b;
            if (i > i3 || (i == i3 && i2 > asVar4.f7206c)) {
                return true;
            }
            return false;
        }
        int i4 = bVar.f7530d.f7208e;
        return i4 == -1 || i4 > this.f7564d.f7205b;
    }
}
