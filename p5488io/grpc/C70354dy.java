package p5488io.grpc;

import java.util.Arrays;

/* renamed from: io.grpc.dy */
/* compiled from: PG */
final class C70354dy implements C70697eb {

    /* renamed from: a */
    private final Object[] f187522a;

    /* renamed from: b */
    private final Object[] f187523b;

    public C70354dy(Object[] objArr, Object[] objArr2) {
        this.f187522a = objArr;
        this.f187523b = objArr2;
    }

    /* renamed from: a */
    public final int mo62067a() {
        return this.f187523b.length;
    }

    /* renamed from: b */
    public final C70697eb mo62068b(Object obj, Object obj2, int i, int i2) {
        Object[] objArr;
        int length;
        int i3 = 0;
        int hashCode = this.f187522a[0].hashCode();
        if (hashCode != i) {
            return C70355dz.m102644d(new C70696ea(obj, obj2), i, this, hashCode, i2);
        }
        while (true) {
            objArr = this.f187522a;
            length = objArr.length;
            if (i3 < length) {
                if (objArr[i3] == obj) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            Object[] copyOf = Arrays.copyOf(objArr, length);
            Object[] copyOf2 = Arrays.copyOf(this.f187523b, this.f187522a.length);
            copyOf[i3] = obj;
            copyOf2[i3] = obj2;
            return new C70354dy(copyOf, copyOf2);
        }
        Object[] copyOf3 = Arrays.copyOf(objArr, length + 1);
        Object[] copyOf4 = Arrays.copyOf(this.f187523b, this.f187522a.length + 1);
        int length2 = this.f187522a.length;
        copyOf3[length2] = obj;
        copyOf4[length2] = obj2;
        return new C70354dy(copyOf3, copyOf4);
    }

    /* renamed from: c */
    public final Object mo62069c(Object obj, int i, int i2) {
        int i3 = 0;
        while (true) {
            Object[] objArr = this.f187522a;
            if (i3 >= objArr.length) {
                return null;
            }
            if (objArr[i3] == obj) {
                return this.f187523b[i3];
            }
            i3++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollisionLeaf(");
        for (int i = 0; i < this.f187523b.length; i++) {
            sb.append("(key=");
            sb.append(this.f187522a[i]);
            sb.append(" value=");
            sb.append(this.f187523b[i]);
            sb.append(") ");
        }
        sb.append(")");
        return sb.toString();
    }
}
