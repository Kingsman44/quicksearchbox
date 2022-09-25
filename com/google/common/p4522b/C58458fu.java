package com.google.common.p4522b;

import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Set;

/* renamed from: com.google.common.b.fu */
/* compiled from: PG */
public final class C58458fu extends AbstractMap implements Serializable, C58334be {

    /* renamed from: a */
    transient Object[] f156071a;

    /* renamed from: b */
    transient Object[] f156072b;

    /* renamed from: c */
    public transient int f156073c;

    /* renamed from: d */
    transient int f156074d;

    /* renamed from: e */
    public transient int f156075e;

    /* renamed from: f */
    public transient int[] f156076f;

    /* renamed from: g */
    public transient C58334be f156077g;

    /* renamed from: h */
    private transient int[] f156078h;

    /* renamed from: i */
    private transient int[] f156079i;

    /* renamed from: j */
    private transient int[] f156080j;

    /* renamed from: k */
    private transient int[] f156081k;

    /* renamed from: l */
    private transient int f156082l;

    /* renamed from: m */
    private transient int[] f156083m;

    /* renamed from: n */
    private transient Set f156084n;

    /* renamed from: o */
    private transient Set f156085o;

    /* renamed from: p */
    private transient Set f156086p;

    public C58458fu(int i) {
        mo55340f(i);
    }

    /* renamed from: m */
    private final int m89733m(int i) {
        return i & (this.f156078h.length - 1);
    }

    /* renamed from: n */
    private final void m89734n(int i, int i2) {
        C58838bb.m90868c(i != -1);
        int m = m89733m(i2);
        int[] iArr = this.f156078h;
        int i3 = iArr[m];
        if (i3 == i) {
            int[] iArr2 = this.f156080j;
            iArr[m] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.f156080j[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            int i6 = i5;
            if (i3 == -1) {
                StringBuilder sb = new StringBuilder("Expected to find entry with key ");
                Object obj = this.f156071a[i];
                sb.append(obj);
                throw new AssertionError("Expected to find entry with key ".concat(String.valueOf(obj)));
            } else if (i3 == i) {
                int[] iArr3 = this.f156080j;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = this.f156080j[i3];
            }
        }
    }

    /* renamed from: o */
    private final void m89735o(int i, int i2) {
        C58838bb.m90868c(i != -1);
        int m = m89733m(i2);
        int[] iArr = this.f156079i;
        int i3 = iArr[m];
        if (i3 == i) {
            int[] iArr2 = this.f156081k;
            iArr[m] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.f156081k[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            int i6 = i5;
            if (i3 == -1) {
                StringBuilder sb = new StringBuilder("Expected to find entry with value ");
                Object obj = this.f156072b[i];
                sb.append(obj);
                throw new AssertionError("Expected to find entry with value ".concat(String.valueOf(obj)));
            } else if (i3 == i) {
                int[] iArr3 = this.f156081k;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = this.f156081k[i3];
            }
        }
    }

    /* renamed from: p */
    private final void m89736p(int i) {
        int length = this.f156080j.length;
        if (length < i) {
            int e = C58470gf.m89790e(length, i);
            this.f156071a = Arrays.copyOf(this.f156071a, e);
            this.f156072b = Arrays.copyOf(this.f156072b, e);
            this.f156080j = m89742v(this.f156080j, e);
            this.f156081k = m89742v(this.f156081k, e);
            this.f156083m = m89742v(this.f156083m, e);
            this.f156076f = m89742v(this.f156076f, e);
        }
        if (this.f156078h.length < i) {
            int c = C58462fy.m89759c(i);
            this.f156078h = m89741u(c);
            this.f156079i = m89741u(c);
            for (int i2 = 0; i2 < this.f156073c; i2++) {
                int m = m89733m(C58462fy.m89758b(this.f156071a[i2]));
                int[] iArr = this.f156080j;
                int[] iArr2 = this.f156078h;
                iArr[i2] = iArr2[m];
                iArr2[m] = i2;
                int m2 = m89733m(C58462fy.m89758b(this.f156072b[i2]));
                int[] iArr3 = this.f156081k;
                int[] iArr4 = this.f156079i;
                iArr3[i2] = iArr4[m2];
                iArr4[m2] = i2;
            }
        }
    }

    /* renamed from: q */
    private final void m89737q(int i, int i2) {
        C58838bb.m90868c(i != -1);
        int m = m89733m(i2);
        int[] iArr = this.f156080j;
        int[] iArr2 = this.f156078h;
        iArr[i] = iArr2[m];
        iArr2[m] = i;
    }

    /* renamed from: r */
    private final void m89738r(int i, int i2) {
        C58838bb.m90868c(i != -1);
        int m = m89733m(i2);
        int[] iArr = this.f156081k;
        int[] iArr2 = this.f156079i;
        iArr[i] = iArr2[m];
        iArr2[m] = i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        mo55340f(16);
        C58742qh.m90623b(this, objectInputStream, readInt);
    }

    /* renamed from: s */
    private final void m89739s(int i, int i2, int i3) {
        int i4;
        int i5;
        C58838bb.m90868c(i != -1);
        m89734n(i, i2);
        m89735o(i, i3);
        m89740t(this.f156083m[i], this.f156076f[i]);
        int i6 = this.f156073c - 1;
        if (i6 != i) {
            int i7 = this.f156083m[i6];
            int i8 = this.f156076f[i6];
            m89740t(i7, i);
            m89740t(i, i8);
            Object[] objArr = this.f156071a;
            Object obj = objArr[i6];
            Object[] objArr2 = this.f156072b;
            Object obj2 = objArr2[i6];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int m = m89733m(C58462fy.m89758b(obj));
            int[] iArr = this.f156078h;
            int i9 = iArr[m];
            if (i9 == i6) {
                iArr[m] = i;
            } else {
                int i10 = this.f156080j[i9];
                while (true) {
                    int i11 = i9;
                    i9 = i10;
                    i5 = i11;
                    if (i9 == i6) {
                        break;
                    }
                    i10 = this.f156080j[i9];
                }
                this.f156080j[i5] = i;
            }
            int[] iArr2 = this.f156080j;
            iArr2[i] = iArr2[i6];
            iArr2[i6] = -1;
            int m2 = m89733m(C58462fy.m89758b(obj2));
            int[] iArr3 = this.f156079i;
            int i12 = iArr3[m2];
            if (i12 == i6) {
                iArr3[m2] = i;
            } else {
                int i13 = this.f156081k[i12];
                while (true) {
                    int i14 = i12;
                    i12 = i13;
                    i4 = i14;
                    if (i12 == i6) {
                        break;
                    }
                    i13 = this.f156081k[i12];
                }
                this.f156081k[i4] = i;
            }
            int[] iArr4 = this.f156081k;
            iArr4[i] = iArr4[i6];
            iArr4[i6] = -1;
        }
        Object[] objArr3 = this.f156071a;
        int i15 = this.f156073c - 1;
        objArr3[i15] = null;
        this.f156072b[i15] = null;
        this.f156073c = i15;
        this.f156074d++;
    }

    /* renamed from: u */
    private static int[] m89741u(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: v */
    private static int[] m89742v(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C58742qh.m90626e(this, objectOutputStream);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo55332a(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[m89733m(i)];
        while (i2 != -1) {
            if (C58832aw.m90831a(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo55333b(Object obj, int i) {
        return mo55332a(obj, i, this.f156078h, this.f156080j, this.f156071a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo55334c(Object obj, int i) {
        return mo55332a(obj, i, this.f156079i, this.f156081k, this.f156072b);
    }

    public final void clear() {
        Arrays.fill(this.f156071a, 0, this.f156073c, (Object) null);
        Arrays.fill(this.f156072b, 0, this.f156073c, (Object) null);
        Arrays.fill(this.f156078h, -1);
        Arrays.fill(this.f156079i, -1);
        Arrays.fill(this.f156080j, 0, this.f156073c, -1);
        Arrays.fill(this.f156081k, 0, this.f156073c, -1);
        Arrays.fill(this.f156083m, 0, this.f156073c, -1);
        Arrays.fill(this.f156076f, 0, this.f156073c, -1);
        this.f156073c = 0;
        this.f156075e = -2;
        this.f156082l = -2;
        this.f156074d++;
    }

    public final boolean containsKey(Object obj) {
        return mo55333b(obj, C58462fy.m89758b(obj)) != -1;
    }

    public final boolean containsValue(Object obj) {
        return mo55334c(obj, C58462fy.m89758b(obj)) != -1;
    }

    /* renamed from: d */
    public final Object mo55338d(Object obj, Object obj2, boolean z) {
        int b = C58462fy.m89758b(obj);
        int b2 = mo55333b(obj, b);
        if (b2 != -1) {
            Object obj3 = this.f156072b[b2];
            if (C58832aw.m90831a(obj3, obj2)) {
                return obj2;
            }
            mo55344j(b2, obj2, z);
            return obj3;
        }
        int b3 = C58462fy.m89758b(obj2);
        int c = mo55334c(obj2, b3);
        if (!z) {
            C58838bb.m90873h(c == -1, "Value already present: %s", obj2);
        } else if (c != -1) {
            mo55343i(c, b3);
        }
        m89736p(this.f156073c + 1);
        Object[] objArr = this.f156071a;
        int i = this.f156073c;
        objArr[i] = obj;
        this.f156072b[i] = obj2;
        m89737q(i, b);
        m89738r(this.f156073c, b3);
        m89740t(this.f156082l, this.f156073c);
        m89740t(this.f156073c, -2);
        this.f156073c++;
        this.f156074d++;
        return null;
    }

    /* renamed from: e */
    public final C58334be mo55027e() {
        C58334be beVar = this.f156077g;
        if (beVar != null) {
            return beVar;
        }
        C58452fo foVar = new C58452fo(this);
        this.f156077g = foVar;
        return foVar;
    }

    public final Set entrySet() {
        Set set = this.f156086p;
        if (set != null) {
            return set;
        }
        C58451fn fnVar = new C58451fn(this);
        this.f156086p = fnVar;
        return fnVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo55340f(int i) {
        C58371co.m89408c(i, "expectedSize");
        int c = C58462fy.m89759c(i);
        this.f156073c = 0;
        this.f156071a = new Object[i];
        this.f156072b = new Object[i];
        this.f156078h = m89741u(c);
        this.f156079i = m89741u(c);
        this.f156080j = m89741u(i);
        this.f156081k = m89741u(i);
        this.f156075e = -2;
        this.f156082l = -2;
        this.f156083m = m89741u(i);
        this.f156076f = m89741u(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo55341g(int i, int i2) {
        m89739s(i, i2, C58462fy.m89758b(this.f156072b[i]));
    }

    public final Object get(Object obj) {
        int b = mo55333b(obj, C58462fy.m89758b(obj));
        if (b == -1) {
            return null;
        }
        return this.f156072b[b];
    }

    /* renamed from: h */
    public final Set values() {
        Set set = this.f156085o;
        if (set != null) {
            return set;
        }
        C58455fr frVar = new C58455fr(this);
        this.f156085o = frVar;
        return frVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo55343i(int i, int i2) {
        m89739s(i, C58462fy.m89758b(this.f156071a[i]), i2);
    }

    /* renamed from: j */
    public final void mo55344j(int i, Object obj, boolean z) {
        C58838bb.m90868c(i != -1);
        int b = C58462fy.m89758b(obj);
        int c = mo55334c(obj, b);
        if (c != -1) {
            if (z) {
                mo55343i(c, b);
                if (i == this.f156073c) {
                    i = c;
                }
            } else {
                new StringBuilder("Value already present in map: ").append(obj);
                throw new IllegalArgumentException("Value already present in map: ".concat(String.valueOf(obj)));
            }
        }
        m89735o(i, C58462fy.m89758b(this.f156072b[i]));
        this.f156072b[i] = obj;
        m89738r(i, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Object mo55345k(Object obj, Object obj2) {
        int i;
        int b = C58462fy.m89758b(obj);
        int c = mo55334c(obj, b);
        if (c != -1) {
            Object obj3 = this.f156071a[c];
            if (C58832aw.m90831a(obj3, obj2)) {
                return obj2;
            }
            mo55347l(c, obj2);
            return obj3;
        }
        int i2 = this.f156082l;
        int b2 = C58462fy.m89758b(obj2);
        C58838bb.m90873h(mo55333b(obj2, b2) == -1, "Key already present: %s", obj2);
        m89736p(this.f156073c + 1);
        Object[] objArr = this.f156071a;
        int i3 = this.f156073c;
        objArr[i3] = obj2;
        this.f156072b[i3] = obj;
        m89737q(i3, b2);
        m89738r(this.f156073c, b);
        if (i2 == -2) {
            i = this.f156075e;
        } else {
            i = this.f156076f[i2];
        }
        m89740t(i2, this.f156073c);
        m89740t(this.f156073c, i);
        this.f156073c++;
        this.f156074d++;
        return null;
    }

    public final Set keySet() {
        Set set = this.f156084n;
        if (set != null) {
            return set;
        }
        C58454fq fqVar = new C58454fq(this);
        this.f156084n = fqVar;
        return fqVar;
    }

    /* renamed from: l */
    public final void mo55347l(int i, Object obj) {
        C58838bb.m90868c(i != -1);
        int b = mo55333b(obj, C58462fy.m89758b(obj));
        int i2 = this.f156082l;
        if (b == -1) {
            if (i2 == i) {
                i2 = this.f156083m[i];
            } else if (i2 == this.f156073c) {
                i2 = b;
            }
            if (i == -2) {
                b = this.f156076f[-2];
            } else if (this.f156073c != -2) {
                b = -2;
            }
            m89740t(this.f156083m[i], this.f156076f[i]);
            m89734n(i, C58462fy.m89758b(this.f156071a[i]));
            this.f156071a[i] = obj;
            m89737q(i, C58462fy.m89758b(obj));
            m89740t(i2, i);
            m89740t(i, b);
            return;
        }
        new StringBuilder("Key already present in map: ").append(obj);
        throw new IllegalArgumentException("Key already present in map: ".concat(String.valueOf(obj)));
    }

    public final Object put(Object obj, Object obj2) {
        return mo55338d(obj, obj2, false);
    }

    public final Object remove(Object obj) {
        int b = C58462fy.m89758b(obj);
        int b2 = mo55333b(obj, b);
        if (b2 == -1) {
            return null;
        }
        Object obj2 = this.f156072b[b2];
        mo55341g(b2, b);
        return obj2;
    }

    public final int size() {
        return this.f156073c;
    }

    /* renamed from: t */
    private final void m89740t(int i, int i2) {
        if (i == -2) {
            this.f156075e = i2;
        } else {
            this.f156076f[i] = i2;
        }
        if (i2 == -2) {
            this.f156082l = i;
        } else {
            this.f156083m[i2] = i;
        }
    }
}
