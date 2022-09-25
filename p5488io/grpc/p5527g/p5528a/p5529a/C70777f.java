package p5488io.grpc.p5527g.p5528a.p5529a;

import java.util.Arrays;
import p5589m.C71828e;
import p5589m.C71832i;

/* renamed from: io.grpc.g.a.a.f */
/* compiled from: PG */
final class C70777f {

    /* renamed from: a */
    public final C71828e f188735a;

    /* renamed from: b */
    C70775d[] f188736b;

    /* renamed from: c */
    int f188737c;

    /* renamed from: d */
    public int f188738d;

    /* renamed from: e */
    private int f188739e;

    public C70777f(C71828e eVar) {
        C70775d[] dVarArr = new C70775d[8];
        this.f188736b = dVarArr;
        this.f188738d = dVarArr.length - 1;
        this.f188735a = eVar;
    }

    /* renamed from: a */
    public final void mo62469a(C70775d dVar) {
        int i;
        int i2 = dVar.f188726h;
        if (i2 > 4096) {
            Arrays.fill(this.f188736b, (Object) null);
            this.f188738d = this.f188736b.length - 1;
            this.f188737c = 0;
            this.f188739e = 0;
            return;
        }
        int i3 = (this.f188739e + i2) - 4096;
        if (i3 > 0) {
            int length = this.f188736b.length - 1;
            int i4 = 0;
            while (true) {
                i = this.f188738d;
                if (length < i || i3 <= 0) {
                    C70775d[] dVarArr = this.f188736b;
                    int i5 = i + 1;
                    System.arraycopy(dVarArr, i5, dVarArr, i5 + i4, this.f188737c);
                    this.f188738d += i4;
                } else {
                    int i6 = this.f188736b[length].f188726h;
                    i3 -= i6;
                    this.f188739e -= i6;
                    this.f188737c--;
                    i4++;
                    length--;
                }
            }
            C70775d[] dVarArr2 = this.f188736b;
            int i52 = i + 1;
            System.arraycopy(dVarArr2, i52, dVarArr2, i52 + i4, this.f188737c);
            this.f188738d += i4;
        }
        int i7 = this.f188737c;
        C70775d[] dVarArr3 = this.f188736b;
        int length2 = dVarArr3.length;
        if (i7 + 1 > length2) {
            C70775d[] dVarArr4 = new C70775d[(length2 + length2)];
            System.arraycopy(dVarArr3, 0, dVarArr4, length2, length2);
            this.f188738d = this.f188736b.length - 1;
            this.f188736b = dVarArr4;
        }
        int i8 = this.f188738d;
        this.f188738d = i8 - 1;
        this.f188736b[i8] = dVar;
        this.f188737c++;
        this.f188739e += i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo62470b(C71832i iVar) {
        mo62471c(iVar.mo63094b(), 127, 0);
        this.f188735a.mo63083s(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo62471c(int i, int i2, int i3) {
        if (i < i2) {
            this.f188735a.mo63087v(i | i3);
            return;
        }
        this.f188735a.mo63087v(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            this.f188735a.mo63087v(128 | (i4 & 127));
            i4 >>>= 7;
        }
        this.f188735a.mo63087v(i4);
    }
}
