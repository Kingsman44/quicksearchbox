package com.google.common.p4522b;

import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import com.google.common.p4575r.C60757n;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.dc */
/* compiled from: PG */
final class C58386dc extends AbstractSet implements Serializable {

    /* renamed from: a */
    transient Object[] f155979a;

    /* renamed from: b */
    public transient int f155980b;

    /* renamed from: c */
    private transient Object f155981c;

    /* renamed from: d */
    private transient int[] f155982d;

    /* renamed from: e */
    private transient int f155983e;

    public C58386dc() {
        mo55122e(3);
    }

    /* renamed from: h */
    private final int m89445h() {
        return (1 << (this.f155980b & 31)) - 1;
    }

    /* renamed from: i */
    private final int m89446i(int i, int i2, int i3, int i4) {
        Object e = C58387dd.m89460e(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C58387dd.m89462g(e, i3 & i5, i4 + 1);
        }
        Object requireNonNull = Objects.requireNonNull(this.f155981c);
        int[] k = m89448k();
        for (int i6 = 0; i6 <= i; i6++) {
            int c = C58387dd.m89458c(requireNonNull, i6);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = k[i7];
                int i9 = ((i ^ -1) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = C58387dd.m89458c(e, i10);
                C58387dd.m89462g(e, i10, c);
                k[i7] = ((i5 ^ -1) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.f155981c = e;
        m89447j(i5);
        return i5;
    }

    /* renamed from: j */
    private final void m89447j(int i) {
        this.f155980b = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f155980b & -32);
    }

    /* renamed from: k */
    private final int[] m89448k() {
        return (int[]) Objects.requireNonNull(this.f155982d);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            mo55122e(readInt);
            for (int i = 0; i < readInt; i++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException("Invalid size: " + readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo55115a() {
        return isEmpty() ? -1 : 0;
    }

    public final boolean add(Object obj) {
        int min;
        Object obj2 = obj;
        if (mo55123f()) {
            C58838bb.m90884s(mo55123f(), "Arrays already allocated");
            int i = this.f155980b;
            int d = C58387dd.m89459d(i);
            this.f155981c = C58387dd.m89460e(d);
            m89447j(d - 1);
            this.f155982d = new int[i];
            this.f155979a = new Object[i];
        }
        Set c = mo55118c();
        if (c != null) {
            return c.add(obj2);
        }
        int[] k = m89448k();
        Object[] g = mo55124g();
        int i2 = this.f155983e;
        int i3 = i2 + 1;
        int b = C58462fy.m89758b(obj);
        int h = m89445h();
        int i4 = b & h;
        int c2 = C58387dd.m89458c(Objects.requireNonNull(this.f155981c), i4);
        if (c2 != 0) {
            int i5 = h ^ -1;
            int i6 = b & i5;
            int i7 = 0;
            while (true) {
                int i8 = c2 - 1;
                int i9 = k[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && C58832aw.m90831a(obj2, g[i8])) {
                    return false;
                }
                int i11 = i9 & h;
                i7++;
                if (i11 != 0) {
                    c2 = i11;
                } else if (i7 >= 9) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(m89445h() + 1, 1.0f);
                    for (int a = mo55115a(); a >= 0; a = mo55117b(a)) {
                        linkedHashSet.add(mo55124g()[a]);
                    }
                    this.f155981c = linkedHashSet;
                    this.f155982d = null;
                    this.f155979a = null;
                    mo55121d();
                    return linkedHashSet.add(obj2);
                } else if (i3 > h) {
                    h = m89446i(h, C58387dd.m89456a(h), b, i2);
                } else {
                    k[i8] = (i3 & h) | i10;
                }
            }
        } else if (i3 > h) {
            h = m89446i(h, C58387dd.m89456a(h), b, i2);
        } else {
            C58387dd.m89462g(Objects.requireNonNull(this.f155981c), i4, i3);
        }
        int length = m89448k().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f155982d = Arrays.copyOf(m89448k(), min);
            this.f155979a = Arrays.copyOf(mo55124g(), min);
        }
        m89448k()[i2] = (h ^ -1) & b;
        mo55124g()[i2] = obj2;
        this.f155983e = i3;
        mo55121d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo55117b(int i) {
        int i2 = i + 1;
        if (i2 < this.f155983e) {
            return i2;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Set mo55118c() {
        Object obj = this.f155981c;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public final void clear() {
        if (!mo55123f()) {
            mo55121d();
            Set c = mo55118c();
            if (c != null) {
                this.f155980b = C60757n.m92742c(size(), 3, 1073741823);
                c.clear();
                this.f155981c = null;
                this.f155983e = 0;
                return;
            }
            Arrays.fill(mo55124g(), 0, this.f155983e, (Object) null);
            C58387dd.m89461f(Objects.requireNonNull(this.f155981c));
            Arrays.fill(m89448k(), 0, this.f155983e, 0);
            this.f155983e = 0;
        }
    }

    public final boolean contains(Object obj) {
        if (mo55123f()) {
            return false;
        }
        Set c = mo55118c();
        if (c != null) {
            return c.contains(obj);
        }
        int b = C58462fy.m89758b(obj);
        int h = m89445h();
        int c2 = C58387dd.m89458c(Objects.requireNonNull(this.f155981c), b & h);
        if (c2 != 0) {
            int i = h ^ -1;
            int i2 = b & i;
            do {
                int i3 = c2 - 1;
                int i4 = m89448k()[i3];
                if ((i4 & i) == i2 && C58832aw.m90831a(obj, mo55124g()[i3])) {
                    return true;
                }
                c2 = i4 & h;
            } while (c2 != 0);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo55121d() {
        this.f155980b += 32;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo55122e(int i) {
        this.f155980b = C60757n.m92742c(i, 1, 1073741823);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo55123f() {
        return this.f155981c == null;
    }

    /* renamed from: g */
    public final Object[] mo55124g() {
        return (Object[]) Objects.requireNonNull(this.f155979a);
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Iterator iterator() {
        Set c = mo55118c();
        if (c != null) {
            return c.iterator();
        }
        return new C58385db(this);
    }

    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (mo55123f()) {
            return false;
        }
        Set c = mo55118c();
        if (c != null) {
            return c.remove(obj);
        }
        int h = m89445h();
        int b = C58387dd.m89457b(obj, (Object) null, h, Objects.requireNonNull(this.f155981c), m89448k(), mo55124g(), (Object[]) null);
        if (b == -1) {
            return false;
        }
        Object requireNonNull = Objects.requireNonNull(this.f155981c);
        int[] k = m89448k();
        Object[] g = mo55124g();
        int size = size() - 1;
        if (b < size) {
            Object obj2 = g[size];
            g[b] = obj2;
            g[size] = null;
            k[b] = k[size];
            k[size] = 0;
            int b2 = C58462fy.m89758b(obj2) & h;
            int c2 = C58387dd.m89458c(requireNonNull, b2);
            int i3 = size + 1;
            if (c2 == i3) {
                C58387dd.m89462g(requireNonNull, b2, b + 1);
            } else {
                while (true) {
                    i = c2 - 1;
                    i2 = k[i];
                    int i4 = i2 & h;
                    if (i4 == i3) {
                        break;
                    }
                    c2 = i4;
                }
                k[i] = ((b + 1) & h) | (i2 & (h ^ -1));
            }
        } else {
            g[b] = null;
            k[b] = 0;
        }
        this.f155983e--;
        mo55121d();
        return true;
    }

    public final int size() {
        Set c = mo55118c();
        return c != null ? c.size() : this.f155983e;
    }

    public final Object[] toArray() {
        if (mo55123f()) {
            return new Object[0];
        }
        Set c = mo55118c();
        return c != null ? c.toArray() : Arrays.copyOf(mo55124g(), this.f155983e);
    }

    public C58386dc(int i) {
        mo55122e(i);
    }

    public final Object[] toArray(Object[] objArr) {
        if (mo55123f()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set c = mo55118c();
        if (c != null) {
            return c.toArray(objArr);
        }
        Object[] g = mo55124g();
        int i = this.f155983e;
        C58838bb.m90882q(0, i, g.length);
        int length = objArr.length;
        if (length < i) {
            objArr = C58711pd.m90498a(objArr, i);
        } else if (length > i) {
            objArr[i] = null;
        }
        System.arraycopy(g, 0, objArr, 0, i);
        return objArr;
    }
}
