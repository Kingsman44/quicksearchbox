package p5589m;

import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: m.s */
/* compiled from: PG */
public final class C71842s {

    /* renamed from: a */
    public final byte[] f191373a;

    /* renamed from: b */
    public int f191374b;

    /* renamed from: c */
    public int f191375c;

    /* renamed from: d */
    public boolean f191376d;

    /* renamed from: e */
    public final boolean f191377e;

    /* renamed from: f */
    public C71842s f191378f;

    /* renamed from: g */
    public C71842s f191379g;

    public C71842s() {
        this.f191373a = new byte[8192];
        this.f191377e = true;
        this.f191376d = false;
    }

    public C71842s(byte[] bArr, int i, int i2, boolean z) {
        C69664n.m101061g(bArr, "data");
        this.f191373a = bArr;
        this.f191374b = i;
        this.f191375c = i2;
        this.f191376d = z;
        this.f191377e = false;
    }

    /* renamed from: a */
    public final C71842s mo63123a() {
        C71842s sVar = this.f191378f;
        if (sVar == this) {
            sVar = null;
        }
        C71842s sVar2 = this.f191379g;
        C69664n.m101058d(sVar2);
        sVar2.f191378f = this.f191378f;
        C71842s sVar3 = this.f191378f;
        C69664n.m101058d(sVar3);
        sVar3.f191379g = this.f191379g;
        this.f191378f = null;
        this.f191379g = null;
        return sVar;
    }

    /* renamed from: b */
    public final C71842s mo63124b() {
        this.f191376d = true;
        return new C71842s(this.f191373a, this.f191374b, this.f191375c, true);
    }

    /* renamed from: c */
    public final void mo63125c(C71842s sVar, int i) {
        C69664n.m101061g(sVar, "sink");
        if (sVar.f191377e) {
            int i2 = sVar.f191375c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!sVar.f191376d) {
                    int i4 = sVar.f191374b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = sVar.f191373a;
                        C69531o.m100926d(bArr, bArr, 0, i4, i2);
                        i2 = sVar.f191375c - sVar.f191374b;
                        sVar.f191375c = i2;
                        sVar.f191374b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f191373a;
            byte[] bArr3 = sVar.f191373a;
            int i5 = this.f191374b;
            C69531o.m100926d(bArr2, bArr3, i2, i5, i5 + i);
            sVar.f191375c += i;
            this.f191374b += i;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    /* renamed from: d */
    public final void mo63126d(C71842s sVar) {
        C69664n.m101061g(sVar, "segment");
        sVar.f191379g = this;
        sVar.f191378f = this.f191378f;
        C71842s sVar2 = this.f191378f;
        C69664n.m101058d(sVar2);
        sVar2.f191379g = sVar;
        this.f191378f = sVar;
    }
}
