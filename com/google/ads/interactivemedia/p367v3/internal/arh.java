package com.google.ads.interactivemedia.p367v3.internal;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arh */
/* compiled from: PG */
public final class arh extends AbstractMap implements Serializable, aqi {

    /* renamed from: a */
    transient Object[] f21432a;

    /* renamed from: b */
    transient Object[] f21433b;

    /* renamed from: c */
    transient int f21434c;

    /* renamed from: d */
    transient int f21435d;

    /* renamed from: e */
    private transient int[] f21436e;

    /* renamed from: f */
    private transient int[] f21437f;

    /* renamed from: g */
    private transient int[] f21438g;

    /* renamed from: h */
    private transient int[] f21439h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public transient int f21440i;

    /* renamed from: j */
    private transient int f21441j;

    /* renamed from: k */
    private transient int[] f21442k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public transient int[] f21443l;

    /* renamed from: m */
    private transient Set f21444m;

    /* renamed from: n */
    private transient Set f21445n;

    /* renamed from: o */
    private transient Set f21446o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public transient aqi f21447p;

    private arh() {
        mo15247a(2);
    }

    /* renamed from: A */
    private final void m19356A(int i, int i2, int i3) {
        int i4;
        int i5;
        aqd.m19276d(i != -1);
        m19372y(i, i2);
        m19373z(i, i3);
        m19369v(this.f21442k[i], this.f21443l[i]);
        int i6 = this.f21434c - 1;
        if (i6 != i) {
            int i7 = this.f21442k[i6];
            int i8 = this.f21443l[i6];
            m19369v(i7, i);
            m19369v(i, i8);
            Object[] objArr = this.f21432a;
            Object obj = objArr[i6];
            Object[] objArr2 = this.f21433b;
            Object obj2 = objArr2[i6];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int u = m19368u(ary.m19450c(obj));
            int[] iArr = this.f21436e;
            int i9 = iArr[u];
            if (i9 == i6) {
                iArr[u] = i;
            } else {
                int i10 = this.f21438g[i9];
                while (true) {
                    int i11 = i9;
                    i9 = i10;
                    i5 = i11;
                    if (i9 == i6) {
                        break;
                    }
                    i10 = this.f21438g[i9];
                }
                this.f21438g[i5] = i;
            }
            int[] iArr2 = this.f21438g;
            iArr2[i] = iArr2[i6];
            iArr2[i6] = -1;
            int u2 = m19368u(ary.m19450c(obj2));
            int[] iArr3 = this.f21437f;
            int i12 = iArr3[u2];
            if (i12 == i6) {
                iArr3[u2] = i;
            } else {
                int i13 = this.f21439h[i12];
                while (true) {
                    int i14 = i12;
                    i12 = i13;
                    i4 = i14;
                    if (i12 == i6) {
                        break;
                    }
                    i13 = this.f21439h[i12];
                }
                this.f21439h[i4] = i;
            }
            int[] iArr4 = this.f21439h;
            iArr4[i] = iArr4[i6];
            iArr4[i6] = -1;
        }
        Object[] objArr3 = this.f21432a;
        int i15 = this.f21434c - 1;
        objArr3[i15] = null;
        this.f21433b[i15] = null;
        this.f21434c = i15;
        this.f21435d++;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m19357B(int i, Object obj) {
        aqd.m19276d(i != -1);
        int c = mo15249c(obj, ary.m19450c(obj));
        int i2 = this.f21441j;
        if (c == -1) {
            if (i2 == i) {
                i2 = this.f21442k[i];
            } else if (i2 == this.f21434c) {
                i2 = c;
            }
            if (i == -2) {
                c = this.f21443l[-2];
            } else if (this.f21434c != -2) {
                c = -2;
            }
            m19369v(this.f21442k[i], this.f21443l[i]);
            m19372y(i, ary.m19450c(this.f21432a[i]));
            this.f21432a[i] = obj;
            m19370w(i, ary.m19450c(obj));
            m19369v(i2, i);
            m19369v(i, c);
            return;
        }
        String valueOf = String.valueOf(obj);
        String.valueOf(valueOf).length();
        throw new IllegalArgumentException("Key already present in map: ".concat(String.valueOf(valueOf)));
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m19358C(int i, Object obj) {
        aqd.m19276d(i != -1);
        int c = ary.m19450c(obj);
        if (mo15254e(obj, c) == -1) {
            m19373z(i, ary.m19450c(this.f21433b[i]));
            this.f21433b[i] = obj;
            m19371x(i, c);
            return;
        }
        String valueOf = String.valueOf(obj);
        String.valueOf(valueOf).length();
        throw new IllegalArgumentException("Value already present in map: ".concat(String.valueOf(valueOf)));
    }

    /* renamed from: p */
    public static arh m19364p() {
        return new arh();
    }

    /* renamed from: r */
    private static int[] m19365r(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        mo15247a(16);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* renamed from: s */
    private static int[] m19366s(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    /* renamed from: t */
    private final void m19367t(int i) {
        int length = this.f21438g.length;
        if (length < i) {
            int a = ari.m19385a(length, i);
            this.f21432a = Arrays.copyOf(this.f21432a, a);
            this.f21433b = Arrays.copyOf(this.f21433b, a);
            this.f21438g = m19366s(this.f21438g, a);
            this.f21439h = m19366s(this.f21439h, a);
            this.f21442k = m19366s(this.f21442k, a);
            this.f21443l = m19366s(this.f21443l, a);
        }
        if (this.f21436e.length < i) {
            int d = ary.m19451d(i);
            this.f21436e = m19365r(d);
            this.f21437f = m19365r(d);
            for (int i2 = 0; i2 < this.f21434c; i2++) {
                int u = m19368u(ary.m19450c(this.f21432a[i2]));
                int[] iArr = this.f21438g;
                int[] iArr2 = this.f21436e;
                iArr[i2] = iArr2[u];
                iArr2[u] = i2;
                int u2 = m19368u(ary.m19450c(this.f21433b[i2]));
                int[] iArr3 = this.f21439h;
                int[] iArr4 = this.f21437f;
                iArr3[i2] = iArr4[u2];
                iArr4[u2] = i2;
            }
        }
    }

    /* renamed from: u */
    private final int m19368u(int i) {
        return i & (this.f21436e.length - 1);
    }

    /* renamed from: w */
    private final void m19370w(int i, int i2) {
        aqd.m19276d(i != -1);
        int u = m19368u(i2);
        int[] iArr = this.f21438g;
        int[] iArr2 = this.f21436e;
        iArr[i] = iArr2[u];
        iArr2[u] = i;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f21434c);
        for (Map.Entry entry : entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* renamed from: x */
    private final void m19371x(int i, int i2) {
        aqd.m19276d(i != -1);
        int u = m19368u(i2);
        int[] iArr = this.f21439h;
        int[] iArr2 = this.f21437f;
        iArr[i] = iArr2[u];
        iArr2[u] = i;
    }

    /* renamed from: y */
    private final void m19372y(int i, int i2) {
        aqd.m19276d(i != -1);
        int u = m19368u(i2);
        int[] iArr = this.f21436e;
        int i3 = iArr[u];
        if (i3 == i) {
            int[] iArr2 = this.f21438g;
            iArr[u] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.f21438g[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            int i6 = i5;
            if (i3 == -1) {
                String valueOf = String.valueOf(this.f21432a[i]);
                String.valueOf(valueOf).length();
                throw new AssertionError("Expected to find entry with key ".concat(String.valueOf(valueOf)));
            } else if (i3 == i) {
                int[] iArr3 = this.f21438g;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = this.f21438g[i3];
            }
        }
    }

    /* renamed from: z */
    private final void m19373z(int i, int i2) {
        aqd.m19276d(i != -1);
        int u = m19368u(i2);
        int[] iArr = this.f21437f;
        int i3 = iArr[u];
        if (i3 == i) {
            int[] iArr2 = this.f21439h;
            iArr[u] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.f21439h[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            int i6 = i5;
            if (i3 == -1) {
                String valueOf = String.valueOf(this.f21433b[i]);
                String.valueOf(valueOf).length();
                throw new AssertionError("Expected to find entry with value ".concat(String.valueOf(valueOf)));
            } else if (i3 == i) {
                int[] iArr3 = this.f21439h;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = this.f21439h[i3];
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15247a(int i) {
        ary.m19461n(i, "expectedSize");
        int d = ary.m19451d(i);
        this.f21434c = 0;
        this.f21432a = new Object[i];
        this.f21433b = new Object[i];
        this.f21436e = m19365r(d);
        this.f21437f = m19365r(d);
        this.f21438g = m19365r(i);
        this.f21439h = m19365r(i);
        this.f21440i = -2;
        this.f21441j = -2;
        this.f21442k = m19365r(i);
        this.f21443l = m19365r(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo15248b(Object obj) {
        return mo15249c(obj, ary.m19450c(obj));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo15249c(Object obj, int i) {
        return mo15256f(obj, i, this.f21436e, this.f21438g, this.f21432a);
    }

    public final void clear() {
        Arrays.fill(this.f21432a, 0, this.f21434c, (Object) null);
        Arrays.fill(this.f21433b, 0, this.f21434c, (Object) null);
        Arrays.fill(this.f21436e, -1);
        Arrays.fill(this.f21437f, -1);
        Arrays.fill(this.f21438g, 0, this.f21434c, -1);
        Arrays.fill(this.f21439h, 0, this.f21434c, -1);
        Arrays.fill(this.f21442k, 0, this.f21434c, -1);
        Arrays.fill(this.f21443l, 0, this.f21434c, -1);
        this.f21434c = 0;
        this.f21440i = -2;
        this.f21441j = -2;
        this.f21435d++;
    }

    public final boolean containsKey(Object obj) {
        return mo15248b(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        return mo15253d(obj) != -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo15253d(Object obj) {
        return mo15254e(obj, ary.m19450c(obj));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo15254e(Object obj, int i) {
        return mo15256f(obj, i, this.f21437f, this.f21439h, this.f21433b);
    }

    public final Set entrySet() {
        Set set = this.f21446o;
        if (set != null) {
            return set;
        }
        ara ara = new ara(this);
        this.f21446o = ara;
        return ara;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo15256f(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[m19368u(i)];
        while (i2 != -1) {
            if (apz.m19253b(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo15257g(int i, int i2) {
        m19356A(i, i2, ary.m19450c(this.f21433b[i]));
    }

    public final Object get(Object obj) {
        int b = mo15248b(obj);
        if (b == -1) {
            return null;
        }
        return this.f21433b[b];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo15259h(int i, int i2) {
        m19356A(i, ary.m19450c(this.f21432a[i]), i2);
    }

    /* renamed from: i */
    public final Set values() {
        Set set = this.f21445n;
        if (set != null) {
            return set;
        }
        are are = new are(this);
        this.f21445n = are;
        return are;
    }

    /* renamed from: j */
    public final aqi mo15261j() {
        aqi aqi = this.f21447p;
        if (aqi != null) {
            return aqi;
        }
        arb arb = new arb(this);
        this.f21447p = arb;
        return arb;
    }

    public final Set keySet() {
        Set set = this.f21444m;
        if (set != null) {
            return set;
        }
        ard ard = new ard(this);
        this.f21444m = ard;
        return ard;
    }

    public final Object put(Object obj, Object obj2) {
        int c = ary.m19450c(obj);
        int c2 = mo15249c(obj, c);
        if (c2 != -1) {
            Object obj3 = this.f21433b[c2];
            if (apz.m19253b(obj3, obj2)) {
                return obj2;
            }
            m19358C(c2, obj2);
            return obj3;
        }
        int c3 = ary.m19450c(obj2);
        aqd.m19278f(mo15254e(obj2, c3) == -1, "Value already present: %s", obj2);
        m19367t(this.f21434c + 1);
        Object[] objArr = this.f21432a;
        int i = this.f21434c;
        objArr[i] = obj;
        this.f21433b[i] = obj2;
        m19370w(i, c);
        m19371x(this.f21434c, c3);
        m19369v(this.f21441j, this.f21434c);
        m19369v(this.f21434c, -2);
        this.f21434c++;
        this.f21435d++;
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Object mo15264q(Object obj, Object obj2) {
        int i;
        int c = ary.m19450c(obj);
        int e = mo15254e(obj, c);
        if (e != -1) {
            Object obj3 = this.f21432a[e];
            if (apz.m19253b(obj3, obj2)) {
                return obj2;
            }
            m19357B(e, obj2);
            return obj3;
        }
        int i2 = this.f21441j;
        int c2 = ary.m19450c(obj2);
        aqd.m19278f(mo15249c(obj2, c2) == -1, "Key already present: %s", obj2);
        m19367t(this.f21434c + 1);
        Object[] objArr = this.f21432a;
        int i3 = this.f21434c;
        objArr[i3] = obj2;
        this.f21433b[i3] = obj;
        m19370w(i3, c2);
        m19371x(this.f21434c, c);
        if (i2 == -2) {
            i = this.f21440i;
        } else {
            i = this.f21443l[i2];
        }
        m19369v(i2, this.f21434c);
        m19369v(this.f21434c, i);
        this.f21434c++;
        this.f21435d++;
        return null;
    }

    public final Object remove(Object obj) {
        int c = ary.m19450c(obj);
        int c2 = mo15249c(obj, c);
        if (c2 == -1) {
            return null;
        }
        Object obj2 = this.f21433b[c2];
        mo15257g(c2, c);
        return obj2;
    }

    public final int size() {
        return this.f21434c;
    }

    /* renamed from: v */
    private final void m19369v(int i, int i2) {
        if (i == -2) {
            this.f21440i = i2;
        } else {
            this.f21443l[i] = i2;
        }
        if (i2 == -2) {
            this.f21441j = i;
        } else {
            this.f21442k[i2] = i;
        }
    }
}
