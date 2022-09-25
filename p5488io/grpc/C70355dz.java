package p5488io.grpc;

import java.util.Arrays;

/* renamed from: io.grpc.dz */
/* compiled from: PG */
final class C70355dz implements C70697eb {

    /* renamed from: a */
    final int f187524a;

    /* renamed from: b */
    final C70697eb[] f187525b;

    /* renamed from: c */
    private final int f187526c;

    private C70355dz(int i, C70697eb[] ebVarArr, int i2) {
        this.f187524a = i;
        this.f187525b = ebVarArr;
        this.f187526c = i2;
    }

    /* renamed from: d */
    static C70697eb m102644d(C70697eb ebVar, int i, C70697eb ebVar2, int i2, int i3) {
        int i4 = (i >>> i3) & 31;
        int i5 = 1 << i4;
        int i6 = (i2 >>> i3) & 31;
        int i7 = 1 << i6;
        if (i5 != i7) {
            C70697eb ebVar3 = i4 > i6 ? ebVar : ebVar2;
            if (i4 > i6) {
                ebVar = ebVar2;
            }
            return new C70355dz(i5 | i7, new C70697eb[]{ebVar, ebVar3}, ebVar.mo62067a() + ebVar3.mo62067a());
        }
        C70697eb d = m102644d(ebVar, i, ebVar2, i2, i3 + 5);
        return new C70355dz(i5, new C70697eb[]{d}, ((C70355dz) d).f187526c);
    }

    /* renamed from: e */
    private final int m102645e(int i) {
        return Integer.bitCount((i - 1) & this.f187524a);
    }

    /* renamed from: a */
    public final int mo62067a() {
        return this.f187526c;
    }

    /* renamed from: b */
    public final C70697eb mo62068b(Object obj, Object obj2, int i, int i2) {
        int i3 = 1 << ((i >>> i2) & 31);
        int e = m102645e(i3);
        int i4 = this.f187524a;
        if ((i4 & i3) == 0) {
            C70697eb[] ebVarArr = this.f187525b;
            C70697eb[] ebVarArr2 = new C70697eb[(ebVarArr.length + 1)];
            System.arraycopy(ebVarArr, 0, ebVarArr2, 0, e);
            ebVarArr2[e] = new C70696ea(obj, obj2);
            C70697eb[] ebVarArr3 = this.f187525b;
            System.arraycopy(ebVarArr3, e, ebVarArr2, e + 1, ebVarArr3.length - e);
            return new C70355dz(i4 | i3, ebVarArr2, this.f187526c + 1);
        }
        C70697eb[] ebVarArr4 = this.f187525b;
        C70697eb[] ebVarArr5 = (C70697eb[]) Arrays.copyOf(ebVarArr4, ebVarArr4.length);
        C70697eb b = this.f187525b[e].mo62068b(obj, obj2, i, i2 + 5);
        ebVarArr5[e] = b;
        int i5 = this.f187526c;
        int a = b.mo62067a();
        return new C70355dz(this.f187524a, ebVarArr5, (i5 + a) - this.f187525b[e].mo62067a());
    }

    /* renamed from: c */
    public final Object mo62069c(Object obj, int i, int i2) {
        int i3 = 1 << ((i >>> i2) & 31);
        if ((this.f187524a & i3) == 0) {
            return null;
        }
        return this.f187525b[m102645e(i3)].mo62069c(obj, i, i2 + 5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedIndex(");
        sb.append(String.format("bitmap=%s ", new Object[]{Integer.toBinaryString(this.f187524a)}));
        for (C70697eb append : this.f187525b) {
            sb.append(append);
            sb.append(" ");
        }
        sb.append(")");
        return sb.toString();
    }
}
