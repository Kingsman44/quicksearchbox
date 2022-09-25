package androidx.media3.extractor.p161h;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3368bf;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.media3.extractor.h.n */
/* compiled from: PG */
final class C3427n {

    /* renamed from: a */
    public final C3368bf f10497a;

    /* renamed from: b */
    public final C3439z f10498b = new C3439z();

    /* renamed from: c */
    public final C2604ac f10499c = new C2604ac();

    /* renamed from: d */
    public C3414aa f10500d;

    /* renamed from: e */
    public C3424k f10501e;

    /* renamed from: f */
    public int f10502f;

    /* renamed from: g */
    public int f10503g;

    /* renamed from: h */
    public int f10504h;

    /* renamed from: i */
    public int f10505i;

    /* renamed from: j */
    public boolean f10506j;

    /* renamed from: k */
    private final C2604ac f10507k = new C2604ac(1);

    /* renamed from: l */
    private final C2604ac f10508l = new C2604ac();

    public C3427n(C3368bf bfVar, C3414aa aaVar, C3424k kVar) {
        this.f10497a = bfVar;
        this.f10500d = aaVar;
        this.f10501e = kVar;
        mo7393d(aaVar, kVar);
    }

    /* renamed from: a */
    public final int mo7390a(int i, int i2) {
        C2604ac acVar;
        C3438y c = mo7392c();
        if (c == null) {
            return 0;
        }
        int i3 = c.f10590d;
        if (i3 != 0) {
            acVar = this.f10498b.f10605n;
        } else {
            byte[] bArr = (byte[]) C2612ak.m6927J(c.f10591e);
            C2604ac acVar2 = this.f10508l;
            int length = bArr.length;
            acVar2.mo6157y(bArr, length);
            acVar = this.f10508l;
            i3 = length;
        }
        boolean b = this.f10498b.mo7398b(this.f10502f);
        boolean z = b || i2 != 0;
        C2604ac acVar3 = this.f10507k;
        acVar3.f7234a[0] = (byte) ((true != z ? 0 : 128) | i3);
        acVar3.mo6131A(0);
        this.f10497a.mo6854f(this.f10507k, 1);
        this.f10497a.mo6854f(acVar, i3);
        if (!z) {
            return i3 + 1;
        }
        if (!b) {
            this.f10499c.mo6156x(8);
            C2604ac acVar4 = this.f10499c;
            byte[] bArr2 = acVar4.f7234a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i2;
            bArr2[4] = (byte) ((i >> 24) & PrivateKeyType.INVALID);
            bArr2[5] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
            bArr2[6] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
            bArr2[7] = (byte) (i & PrivateKeyType.INVALID);
            this.f10497a.mo6854f(acVar4, 8);
            return i3 + 9;
        }
        C2604ac acVar5 = this.f10498b.f10605n;
        int j = acVar5.mo6142j();
        acVar5.mo6131A(acVar5.f7235b - 2);
        int i4 = (j * 6) + 2;
        if (i2 != 0) {
            this.f10499c.mo6156x(i4);
            byte[] bArr3 = this.f10499c.f7234a;
            acVar5.mo6155w(bArr3, 0, i4);
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & PrivateKeyType.INVALID);
            bArr3[3] = (byte) (i5 & PrivateKeyType.INVALID);
            acVar5 = this.f10499c;
        }
        this.f10497a.mo6854f(acVar5, i4);
        return i3 + 1 + i4;
    }

    /* renamed from: b */
    public final long mo7391b() {
        if (!this.f10506j) {
            return this.f10500d.f10456c[this.f10502f];
        }
        return this.f10498b.f10597f[this.f10504h];
    }

    /* renamed from: c */
    public final C3438y mo7392c() {
        if (!this.f10506j) {
            return null;
        }
        C3424k kVar = this.f10498b.f10592a;
        int i = C2612ak.f7249a;
        int i2 = kVar.f10490a;
        C3438y yVar = this.f10498b.f10604m;
        if (yVar == null) {
            yVar = this.f10500d.f10454a.mo7396a(i2);
        }
        if (yVar == null || !yVar.f10587a) {
            return null;
        }
        return yVar;
    }

    /* renamed from: d */
    public final void mo7393d(C3414aa aaVar, C3424k kVar) {
        this.f10500d = aaVar;
        this.f10501e = kVar;
        this.f10497a.mo6850b(aaVar.f10454a.f10581f);
        mo7394e();
    }

    /* renamed from: e */
    public final void mo7394e() {
        C3439z zVar = this.f10498b;
        zVar.f10595d = 0;
        zVar.f10607p = 0;
        zVar.f10608q = false;
        zVar.f10602k = false;
        zVar.f10606o = false;
        zVar.f10604m = null;
        this.f10502f = 0;
        this.f10504h = 0;
        this.f10503g = 0;
        this.f10505i = 0;
        this.f10506j = false;
    }

    /* renamed from: f */
    public final boolean mo7395f() {
        this.f10502f++;
        if (!this.f10506j) {
            return false;
        }
        int i = this.f10503g + 1;
        this.f10503g = i;
        int[] iArr = this.f10498b.f10598g;
        int i2 = this.f10504h;
        if (i != iArr[i2]) {
            return true;
        }
        this.f10504h = i2 + 1;
        this.f10503g = 0;
        return false;
    }
}
