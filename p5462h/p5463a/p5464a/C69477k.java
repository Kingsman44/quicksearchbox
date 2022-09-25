package p5462h.p5463a.p5464a;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p5462h.p5463a.C69502as;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69642c;
import p5462h.p5480j.C69695c;

/* renamed from: h.a.a.k */
/* compiled from: PG */
public final class C69477k implements Map, Serializable, C69642c {

    /* renamed from: a */
    public Object[] f185895a;

    /* renamed from: b */
    public Object[] f185896b;

    /* renamed from: c */
    public int[] f185897c;

    /* renamed from: d */
    public int f185898d;

    /* renamed from: e */
    public int f185899e;

    /* renamed from: f */
    public boolean f185900f;

    /* renamed from: g */
    private int[] f185901g;

    /* renamed from: h */
    private int f185902h;

    /* renamed from: i */
    private int f185903i;

    /* renamed from: j */
    private C69479m f185904j;

    /* renamed from: k */
    private C69480n f185905k;

    /* renamed from: l */
    private C69478l f185906l;

    public C69477k() {
        this(8);
    }

    /* renamed from: k */
    private final int m100785k(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * -1640531527) >>> this.f185903i;
    }

    /* renamed from: l */
    private final void m100786l(int i) {
        if (i >= 0) {
            Object[] objArr = this.f185895a;
            int length = objArr.length;
            if (i > length) {
                int i2 = (length * 3) / 2;
                if (i <= i2) {
                    i = i2;
                }
                this.f185895a = C69470d.m100782c(objArr, i);
                Object[] objArr2 = this.f185896b;
                this.f185896b = objArr2 != null ? C69470d.m100782c(objArr2, i) : null;
                int[] copyOf = Arrays.copyOf(this.f185897c, i);
                C69664n.m101060f(copyOf, "copyOf(this, newSize)");
                this.f185897c = copyOf;
                int a = C69471e.m100783a(i);
                if (a > this.f185901g.length) {
                    m100787m(a);
                }
            } else if ((this.f185898d + i) - this.f185899e > length) {
                m100787m(this.f185901g.length);
            }
        } else {
            throw new OutOfMemoryError();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        r3[r0] = r7;
        r6.f185897c[r2] = r0;
        r2 = r7;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m100787m(int r7) {
        /*
            r6 = this;
            int r0 = r6.f185898d
            int r1 = r6.f185899e
            r2 = 0
            if (r0 <= r1) goto L_0x0034
            java.lang.Object[] r0 = r6.f185896b
            r1 = 0
            r3 = 0
        L_0x000b:
            int r4 = r6.f185898d
            if (r1 >= r4) goto L_0x0026
            int[] r4 = r6.f185897c
            r4 = r4[r1]
            if (r4 < 0) goto L_0x0023
            java.lang.Object[] r4 = r6.f185895a
            r5 = r4[r1]
            r4[r3] = r5
            if (r0 == 0) goto L_0x0021
            r4 = r0[r1]
            r0[r3] = r4
        L_0x0021:
            int r3 = r3 + 1
        L_0x0023:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0026:
            java.lang.Object[] r1 = r6.f185895a
            p5462h.p5463a.p5464a.C69470d.m100781b(r1, r3, r4)
            if (r0 == 0) goto L_0x0032
            int r1 = r6.f185898d
            p5462h.p5463a.p5464a.C69470d.m100781b(r0, r3, r1)
        L_0x0032:
            r6.f185898d = r3
        L_0x0034:
            int[] r0 = r6.f185901g
            int r1 = r0.length
            if (r7 == r1) goto L_0x0046
            int[] r0 = new int[r7]
            r6.f185901g = r0
            int r7 = java.lang.Integer.numberOfLeadingZeros(r7)
            int r7 = r7 + 1
            r6.f185903i = r7
            goto L_0x004e
        L_0x0046:
            java.lang.String r7 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r7)
            java.util.Arrays.fill(r0, r2, r1, r2)
        L_0x004e:
            int r7 = r6.f185898d
            if (r2 >= r7) goto L_0x0082
            int r7 = r2 + 1
            java.lang.Object[] r0 = r6.f185895a
            r0 = r0[r2]
            int r0 = r6.m100785k(r0)
            int r1 = r6.f185902h
        L_0x005e:
            int[] r3 = r6.f185901g
            r4 = r3[r0]
            if (r4 != 0) goto L_0x006c
            r3[r0] = r7
            int[] r1 = r6.f185897c
            r1[r2] = r0
            r2 = r7
            goto L_0x004e
        L_0x006c:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x007a
            int r4 = r0 + -1
            if (r0 != 0) goto L_0x0078
            int r0 = r3.length
            int r0 = r0 + -1
            goto L_0x005e
        L_0x0078:
            r0 = r4
            goto L_0x005e
        L_0x007a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r7.<init>(r0)
            throw r7
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5462h.p5463a.p5464a.C69477k.m100787m(int):void");
    }

    /* renamed from: a */
    public final int mo61100a(Object obj) {
        mo61107e();
        while (true) {
            int k = m100785k(obj);
            int i = this.f185902h;
            int i2 = i + i;
            int length = this.f185901g.length >> 1;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.f185901g;
                int i4 = iArr[k];
                if (i4 <= 0) {
                    int i5 = this.f185898d;
                    Object[] objArr = this.f185895a;
                    if (i5 >= objArr.length) {
                        m100786l(i5 + 1);
                    } else {
                        int i6 = i5 + 1;
                        this.f185898d = i6;
                        objArr[i5] = obj;
                        this.f185897c[i5] = k;
                        iArr[k] = i6;
                        this.f185899e++;
                        if (i3 > this.f185902h) {
                            this.f185902h = i3;
                        }
                        return i5;
                    }
                } else if (C69664n.m101066l(this.f185895a[i4 - 1], obj)) {
                    return -i4;
                } else {
                    i3++;
                    if (i3 > i2) {
                        int length2 = this.f185901g.length;
                        m100787m(length2 + length2);
                        break;
                    }
                    k = k == 0 ? this.f185901g.length - 1 : k - 1;
                }
            }
        }
    }

    /* renamed from: b */
    public final int mo61101b(Object obj) {
        int k = m100785k(obj);
        int i = this.f185902h;
        while (true) {
            int i2 = this.f185901g[k];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (C69664n.m101066l(this.f185895a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            k = k == 0 ? this.f185901g.length - 1 : k - 1;
        }
    }

    /* renamed from: c */
    public final int mo61102c(Object obj) {
        int i = this.f185898d;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f185897c[i] >= 0) {
                Object[] objArr = this.f185896b;
                C69664n.m101058d(objArr);
                if (C69664n.m101066l(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final void clear() {
        mo61107e();
        C69502as a = new C69695c(0, this.f185898d - 1).iterator();
        while (a.hasNext()) {
            int a2 = a.mo5128a();
            int[] iArr = this.f185897c;
            int i = iArr[a2];
            if (i >= 0) {
                this.f185901g[i] = 0;
                iArr[a2] = -1;
            }
        }
        C69470d.m100781b(this.f185895a, 0, this.f185898d);
        Object[] objArr = this.f185896b;
        if (objArr != null) {
            C69470d.m100781b(objArr, 0, this.f185898d);
        }
        this.f185899e = 0;
        this.f185898d = 0;
    }

    public final boolean containsKey(Object obj) {
        return mo61101b(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return mo61102c(obj) >= 0;
    }

    /* renamed from: d */
    public final int mo61106d(Object obj) {
        mo61107e();
        int b = mo61101b(obj);
        if (b < 0) {
            return -1;
        }
        mo61110f(b);
        return b;
    }

    /* renamed from: e */
    public final void mo61107e() {
        if (this.f185900f) {
            throw new UnsupportedOperationException();
        }
    }

    public final /* bridge */ Set entrySet() {
        C69478l lVar = this.f185906l;
        if (lVar != null) {
            return lVar;
        }
        C69478l lVar2 = new C69478l(this);
        this.f185906l = lVar2;
        return lVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f185899e == map.size() && mo61111g(map.entrySet());
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61110f(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f185895a
            p5462h.p5463a.p5464a.C69470d.m100780a(r0, r12)
            int[] r0 = r11.f185897c
            r0 = r0[r12]
            int r1 = r11.f185902h
            int r1 = r1 + r1
            int[] r2 = r11.f185901g
            int r2 = r2.length
            int r2 = r2 >> 1
            if (r1 <= r2) goto L_0x0014
            r1 = r2
        L_0x0014:
            r2 = 0
            r3 = r1
            r4 = 0
            r1 = r0
        L_0x0018:
            int r5 = r0 + -1
            r6 = -1
            if (r0 != 0) goto L_0x0022
            int[] r0 = r11.f185901g
            int r0 = r0.length
            int r0 = r0 + r6
            goto L_0x0023
        L_0x0022:
            r0 = r5
        L_0x0023:
            int r4 = r4 + 1
            int r5 = r11.f185902h
            if (r4 <= r5) goto L_0x002e
            int[] r0 = r11.f185901g
            r0[r1] = r2
            goto L_0x005e
        L_0x002e:
            int[] r5 = r11.f185901g
            r7 = r5[r0]
            if (r7 != 0) goto L_0x0037
            r5[r1] = r2
            goto L_0x005e
        L_0x0037:
            if (r7 >= 0) goto L_0x003e
            r5[r1] = r6
        L_0x003b:
            r1 = r0
            r4 = 0
            goto L_0x0057
        L_0x003e:
            java.lang.Object[] r5 = r11.f185895a
            int r8 = r7 + -1
            r5 = r5[r8]
            int r5 = r11.m100785k(r5)
            int[] r9 = r11.f185901g
            int r5 = r5 - r0
            int r10 = r9.length
            int r10 = r10 + r6
            r5 = r5 & r10
            if (r5 < r4) goto L_0x0057
            r9[r1] = r7
            int[] r4 = r11.f185897c
            r4[r8] = r1
            goto L_0x003b
        L_0x0057:
            int r3 = r3 + r6
            if (r3 >= 0) goto L_0x0018
            int[] r0 = r11.f185901g
            r0[r1] = r6
        L_0x005e:
            int[] r0 = r11.f185897c
            r0[r12] = r6
            int r12 = r11.f185899e
            int r12 = r12 + r6
            r11.f185899e = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5462h.p5463a.p5464a.C69477k.mo61110f(int):void");
    }

    /* renamed from: g */
    public final boolean mo61111g(Collection collection) {
        C69664n.m101061g(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!mo61113h((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final Object get(Object obj) {
        int b = mo61101b(obj);
        if (b < 0) {
            return null;
        }
        Object[] objArr = this.f185896b;
        C69664n.m101058d(objArr);
        return objArr[b];
    }

    /* renamed from: h */
    public final boolean mo61113h(Map.Entry entry) {
        C69664n.m101061g(entry, "entry");
        int b = mo61101b(entry.getKey());
        if (b < 0) {
            return false;
        }
        Object[] objArr = this.f185896b;
        C69664n.m101058d(objArr);
        return C69664n.m101066l(objArr[b], entry.getValue());
    }

    public final int hashCode() {
        C69472f fVar = new C69472f(this);
        int i = 0;
        while (fVar.hasNext()) {
            int i2 = fVar.f185893b;
            C69477k kVar = fVar.f185892a;
            if (i2 < kVar.f185898d) {
                fVar.f185893b = i2 + 1;
                fVar.f185894c = i2;
                Object obj = kVar.f185895a[i2];
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] objArr = fVar.f185892a.f185896b;
                C69664n.m101058d(objArr);
                Object obj2 = objArr[fVar.f185894c];
                int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
                fVar.mo61097a();
                i += hashCode ^ hashCode2;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i;
    }

    /* renamed from: i */
    public final Object[] mo61115i() {
        Object[] objArr = this.f185896b;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[this.f185895a.length];
        this.f185896b = objArr2;
        return objArr2;
    }

    public final boolean isEmpty() {
        return this.f185899e == 0;
    }

    /* renamed from: j */
    public final void mo61117j() {
        mo61107e();
        this.f185900f = true;
    }

    public final /* bridge */ Set keySet() {
        C69479m mVar = this.f185904j;
        if (mVar != null) {
            return mVar;
        }
        C69479m mVar2 = new C69479m(this);
        this.f185904j = mVar2;
        return mVar2;
    }

    public final Object put(Object obj, Object obj2) {
        mo61107e();
        int a = mo61100a(obj);
        Object[] i = mo61115i();
        if (a < 0) {
            int i2 = (-a) - 1;
            Object obj3 = i[i2];
            i[i2] = obj2;
            return obj3;
        }
        i[a] = obj2;
        return null;
    }

    public final void putAll(Map map) {
        C69664n.m101061g(map, "from");
        mo61107e();
        Set<Map.Entry> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            m100786l(this.f185898d + entrySet.size());
            for (Map.Entry entry : entrySet) {
                int a = mo61100a(entry.getKey());
                Object[] i = mo61115i();
                if (a >= 0) {
                    i[a] = entry.getValue();
                } else {
                    int i2 = (-a) - 1;
                    if (!C69664n.m101066l(entry.getValue(), i[i2])) {
                        i[i2] = entry.getValue();
                    }
                }
            }
        }
    }

    public final Object remove(Object obj) {
        int d = mo61106d(obj);
        if (d < 0) {
            return null;
        }
        Object[] objArr = this.f185896b;
        C69664n.m101058d(objArr);
        Object obj2 = objArr[d];
        C69470d.m100780a(objArr, d);
        return obj2;
    }

    public final int size() {
        return this.f185899e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f185899e * 3) + 2);
        sb.append("{");
        C69472f fVar = new C69472f(this);
        int i = 0;
        while (fVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = fVar.f185893b;
            C69477k kVar = fVar.f185892a;
            if (i2 < kVar.f185898d) {
                fVar.f185893b = i2 + 1;
                fVar.f185894c = i2;
                Object obj = kVar.f185895a[i2];
                if (C69664n.m101066l(obj, kVar)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = fVar.f185892a.f185896b;
                C69664n.m101058d(objArr);
                Object obj2 = objArr[fVar.f185894c];
                if (C69664n.m101066l(obj2, fVar.f185892a)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                fVar.mo61097a();
                i++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public final /* bridge */ Collection values() {
        C69480n nVar = this.f185905k;
        if (nVar != null) {
            return nVar;
        }
        C69480n nVar2 = new C69480n(this);
        this.f185905k = nVar2;
        return nVar2;
    }

    public C69477k(int i) {
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int[] iArr2 = new int[C69471e.m100783a(i)];
        this.f185895a = objArr;
        this.f185896b = null;
        this.f185897c = iArr;
        this.f185901g = iArr2;
        this.f185902h = 2;
        this.f185898d = 0;
        this.f185903i = Integer.numberOfLeadingZeros(iArr2.length) + 1;
    }

    private final Object writeReplace() {
        if (this.f185900f) {
            return new C69482p(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }
}
