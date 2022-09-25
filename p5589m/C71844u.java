package p5589m;

import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;
import p5589m.p5590a.C71822c;

/* renamed from: m.u */
/* compiled from: PG */
public final class C71844u extends C71832i {

    /* renamed from: e */
    public final transient byte[][] f191383e;

    /* renamed from: f */
    public final transient int[] f191384f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71844u(byte[][] bArr, int[] iArr) {
        super(C71832i.f191357a.f191358b);
        C69664n.m101061g(bArr, "segments");
        C69664n.m101061g(iArr, "directory");
        this.f191383e = bArr;
        this.f191384f = iArr;
    }

    /* renamed from: l */
    private final C71832i m105213l() {
        return new C71832i(mo63104i());
    }

    private final Object writeReplace() {
        return m105213l();
    }

    /* renamed from: a */
    public final byte mo63093a(int i) {
        int i2;
        C71824ab.m105127a((long) this.f191384f[((Object[]) this.f191383e).length - 1], (long) i, 1);
        int a = C71822c.m105124a(this, i);
        if (a == 0) {
            i2 = 0;
        } else {
            i2 = this.f191384f[a - 1];
        }
        int[] iArr = this.f191384f;
        byte[][] bArr = this.f191383e;
        return bArr[a][(i - i2) + iArr[((Object[]) bArr).length + a]];
    }

    /* renamed from: b */
    public final int mo63094b() {
        return this.f191384f[((Object[]) this.f191383e).length - 1];
    }

    /* renamed from: c */
    public final String mo63095c() {
        return m105213l().mo63095c();
    }

    /* renamed from: e */
    public final C71832i mo63098e() {
        return m105213l().mo63098e();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C71832i) {
            C71832i iVar = (C71832i) obj;
            return iVar.mo63094b() == mo63094b() && mo63105j(iVar, mo63094b());
        }
    }

    /* renamed from: f */
    public final boolean mo63100f(int i, byte[] bArr, int i2, int i3) {
        int i4;
        C69664n.m101061g(bArr, "other");
        if (i < 0 || i > mo63094b() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int a = C71822c.m105124a(this, i);
        while (i < i5) {
            if (a == 0) {
                a = 0;
                i4 = 0;
            } else {
                i4 = this.f191384f[a - 1];
            }
            int[] iArr = this.f191384f;
            int i6 = iArr[a];
            int i7 = iArr[((Object[]) this.f191383e).length + a];
            int min = Math.min(i5, (i6 - i4) + i4) - i;
            if (!C71824ab.m105128b(this.f191383e[a], i7 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            a++;
        }
        return true;
    }

    /* renamed from: h */
    public final byte[] mo63102h() {
        return mo63104i();
    }

    public final int hashCode() {
        int i = this.f191359c;
        if (i != 0) {
            return i;
        }
        int length = ((Object[]) this.f191383e).length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f191384f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr = this.f191383e[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f191359c = i3;
        return i3;
    }

    /* renamed from: i */
    public final byte[] mo63104i() {
        byte[] bArr = new byte[mo63094b()];
        int length = ((Object[]) this.f191383e).length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f191384f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            C69531o.m100926d(this.f191383e[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    /* renamed from: j */
    public final boolean mo63105j(C71832i iVar, int i) {
        int i2;
        C69664n.m101061g(iVar, "other");
        if (mo63094b() - i < 0) {
            return false;
        }
        int a = C71822c.m105124a(this, 0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (a == 0) {
                a = 0;
                i2 = 0;
            } else {
                i2 = this.f191384f[a - 1];
            }
            int[] iArr = this.f191384f;
            int i5 = iArr[a];
            int i6 = iArr[((Object[]) this.f191383e).length + a];
            int min = Math.min(i, (i5 - i2) + i2) - i3;
            if (!iVar.mo63100f(i4, this.f191383e[a], i6 + (i3 - i2), min)) {
                return false;
            }
            i4 += min;
            i3 += min;
            a++;
        }
        return true;
    }

    /* renamed from: k */
    public final void mo63106k(C71828e eVar, int i) {
        int i2;
        int a = C71822c.m105124a(this, 0);
        int i3 = 0;
        while (i3 < i) {
            if (a == 0) {
                a = 0;
                i2 = 0;
            } else {
                i2 = this.f191384f[a - 1];
            }
            int[] iArr = this.f191384f;
            int i4 = iArr[a];
            int i5 = iArr[((Object[]) this.f191383e).length + a];
            int min = Math.min(i, (i4 - i2) + i2) - i3;
            int i6 = i5 + (i3 - i2);
            C71842s sVar = new C71842s(this.f191383e[a], i6, i6 + min, true);
            C71842s sVar2 = eVar.f191355a;
            if (sVar2 == null) {
                sVar.f191379g = sVar;
                sVar.f191378f = sVar.f191379g;
                eVar.f191355a = sVar.f191378f;
            } else {
                C71842s sVar3 = sVar2.f191379g;
                C69664n.m101058d(sVar3);
                sVar3.mo63126d(sVar);
            }
            i3 += min;
            a++;
        }
        eVar.f191356b += (long) i;
    }

    public final String toString() {
        return m105213l().toString();
    }
}
