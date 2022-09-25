package com.google.common.p4522b;

import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import com.google.common.p4575r.C60757n;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.da */
/* compiled from: PG */
class C58384da extends AbstractMap implements Serializable {

    /* renamed from: a */
    public static final Object f155965a = new Object();

    /* renamed from: b */
    public transient Object f155966b;

    /* renamed from: c */
    transient int[] f155967c;

    /* renamed from: d */
    transient Object[] f155968d;

    /* renamed from: e */
    transient Object[] f155969e;

    /* renamed from: f */
    public transient int f155970f;

    /* renamed from: g */
    public transient int f155971g;

    /* renamed from: h */
    private transient Set f155972h;

    /* renamed from: i */
    private transient Set f155973i;

    /* renamed from: j */
    private transient Collection f155974j;

    public C58384da() {
        mo55103m(3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            mo55103m(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException("Invalid size: " + readInt);
    }

    /* renamed from: u */
    private final int m89422u(int i, int i2, int i3, int i4) {
        Object e = C58387dd.m89460e(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C58387dd.m89462g(e, i3 & i5, i4 + 1);
        }
        Object requireNonNull = Objects.requireNonNull(this.f155966b);
        int[] r = mo55109r();
        for (int i6 = 0; i6 <= i; i6++) {
            int c = C58387dd.m89458c(requireNonNull, i6);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = r[i7];
                int i9 = ((i ^ -1) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = C58387dd.m89458c(e, i10);
                C58387dd.m89462g(e, i10, c);
                r[i7] = ((i5 ^ -1) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.f155966b = e;
        m89423v(i5);
        return i5;
    }

    /* renamed from: v */
    private final void m89423v(int i) {
        this.f155970f = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f155970f & -32);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator h = mo55096h();
        while (h.hasNext()) {
            Map.Entry entry = (Map.Entry) h.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* renamed from: a */
    public int mo55084a(int i, int i2) {
        return i - 1;
    }

    /* renamed from: b */
    public int mo55085b() {
        C58838bb.m90884s(mo55108q(), "Arrays already allocated");
        int i = this.f155970f;
        int d = C58387dd.m89459d(i);
        this.f155966b = C58387dd.m89460e(d);
        m89423v(d - 1);
        this.f155967c = new int[i];
        this.f155968d = new Object[i];
        this.f155969e = new Object[i];
        return i;
    }

    /* renamed from: c */
    public int mo55086c() {
        return isEmpty() ? -1 : 0;
    }

    public void clear() {
        if (!mo55108q()) {
            mo55102l();
            Map k = mo55100k();
            if (k != null) {
                this.f155970f = C60757n.m92742c(size(), 3, 1073741823);
                k.clear();
                this.f155966b = null;
                this.f155971g = 0;
                return;
            }
            Arrays.fill(mo55111s(), 0, this.f155971g, (Object) null);
            Arrays.fill(mo55113t(), 0, this.f155971g, (Object) null);
            C58387dd.m89461f(Objects.requireNonNull(this.f155966b));
            Arrays.fill(mo55109r(), 0, this.f155971g, 0);
            this.f155971g = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        Map k = mo55100k();
        if (k != null) {
            return k.containsKey(obj);
        }
        return mo55093f(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        Map k = mo55100k();
        if (k != null) {
            return k.containsValue(obj);
        }
        for (int i = 0; i < this.f155971g; i++) {
            if (C58832aw.m90831a(obj, mo55113t()[i])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public int mo55090d(int i) {
        int i2 = i + 1;
        if (i2 < this.f155971g) {
            return i2;
        }
        return -1;
    }

    /* renamed from: e */
    public final int mo55091e() {
        return (1 << (this.f155970f & 31)) - 1;
    }

    public final Set entrySet() {
        Set set = this.f155973i;
        if (set != null) {
            return set;
        }
        C58378cv cvVar = new C58378cv(this);
        this.f155973i = cvVar;
        return cvVar;
    }

    /* renamed from: f */
    public final int mo55093f(Object obj) {
        if (mo55108q()) {
            return -1;
        }
        int b = C58462fy.m89758b(obj);
        int e = mo55091e();
        int c = C58387dd.m89458c(Objects.requireNonNull(this.f155966b), b & e);
        if (c != 0) {
            int i = e ^ -1;
            int i2 = b & i;
            do {
                int i3 = c - 1;
                int i4 = mo55109r()[i3];
                if ((i4 & i) == i2 && C58832aw.m90831a(obj, mo55111s()[i3])) {
                    return i3;
                }
                c = i4 & e;
            } while (c != 0);
        }
        return -1;
    }

    /* renamed from: g */
    public final Object mo55094g(Object obj) {
        if (mo55108q()) {
            return f155965a;
        }
        int e = mo55091e();
        int b = C58387dd.m89457b(obj, (Object) null, e, Objects.requireNonNull(this.f155966b), mo55109r(), mo55111s(), (Object[]) null);
        if (b == -1) {
            return f155965a;
        }
        Object obj2 = mo55113t()[b];
        mo55105o(b, e);
        this.f155971g--;
        mo55102l();
        return obj2;
    }

    public final Object get(Object obj) {
        Map k = mo55100k();
        if (k != null) {
            return k.get(obj);
        }
        int f = mo55093f(obj);
        if (f == -1) {
            return null;
        }
        return mo55113t()[f];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final Iterator mo55096h() {
        Map k = mo55100k();
        if (k != null) {
            return k.entrySet().iterator();
        }
        return new C58376ct(this);
    }

    /* renamed from: i */
    public Map mo55097i() {
        Map j = mo55099j(mo55091e() + 1);
        int c = mo55086c();
        while (c >= 0) {
            j.put(mo55111s()[c], mo55113t()[c]);
            c = mo55090d(c);
        }
        this.f155966b = j;
        this.f155967c = null;
        this.f155968d = null;
        this.f155969e = null;
        mo55102l();
        return j;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public Map mo55099j(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Map mo55100k() {
        Object obj = this.f155966b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final Set keySet() {
        Set set = this.f155972h;
        if (set != null) {
            return set;
        }
        C58380cx cxVar = new C58380cx(this);
        this.f155972h = cxVar;
        return cxVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo55102l() {
        this.f155970f += 32;
    }

    /* renamed from: m */
    public void mo55103m(int i) {
        C58838bb.m90869d(i >= 0, "Expected size must be >= 0");
        this.f155970f = C60757n.m92742c(i, 1, 1073741823);
    }

    /* renamed from: n */
    public void mo55104n(int i, Object obj, Object obj2, int i2, int i3) {
        mo55109r()[i] = i2 & (i3 ^ -1);
        mo55111s()[i] = obj;
        mo55113t()[i] = obj2;
    }

    /* renamed from: o */
    public void mo55105o(int i, int i2) {
        Object requireNonNull = Objects.requireNonNull(this.f155966b);
        int[] r = mo55109r();
        Object[] s = mo55111s();
        Object[] t = mo55113t();
        int size = size() - 1;
        if (i < size) {
            Object obj = s[size];
            s[i] = obj;
            t[i] = t[size];
            s[size] = null;
            t[size] = null;
            r[i] = r[size];
            r[size] = 0;
            int b = C58462fy.m89758b(obj) & i2;
            int c = C58387dd.m89458c(requireNonNull, b);
            int i3 = size + 1;
            if (c != i3) {
                while (true) {
                    int i4 = c - 1;
                    int i5 = r[i4];
                    int i6 = i5 & i2;
                    if (i6 != i3) {
                        c = i6;
                    } else {
                        r[i4] = ((i + 1) & i2) | (i5 & (i2 ^ -1));
                        return;
                    }
                }
            } else {
                C58387dd.m89462g(requireNonNull, b, i + 1);
            }
        } else {
            s[i] = null;
            t[i] = null;
            r[i] = 0;
        }
    }

    /* renamed from: p */
    public void mo55106p(int i) {
        this.f155967c = Arrays.copyOf(mo55109r(), i);
        this.f155968d = Arrays.copyOf(mo55111s(), i);
        this.f155969e = Arrays.copyOf(mo55113t(), i);
    }

    public final Object put(Object obj, Object obj2) {
        int min;
        int u;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (mo55108q()) {
            mo55085b();
        }
        Map k = mo55100k();
        if (k != null) {
            return k.put(obj3, obj4);
        }
        int[] r = mo55109r();
        Object[] s = mo55111s();
        Object[] t = mo55113t();
        int i = this.f155971g;
        int i2 = i + 1;
        int b = C58462fy.m89758b(obj);
        int e = mo55091e();
        int i3 = b & e;
        int c = C58387dd.m89458c(Objects.requireNonNull(this.f155966b), i3);
        if (c != 0) {
            int i4 = e ^ -1;
            int i5 = b & i4;
            int i6 = 0;
            while (true) {
                int i7 = c - 1;
                int i8 = r[i7];
                int i9 = i8 & i4;
                int i10 = i4;
                if (i9 != i5 || !C58832aw.m90831a(obj3, s[i7])) {
                    int i11 = i8 & e;
                    i6++;
                    if (i11 != 0) {
                        c = i11;
                        i4 = i10;
                    } else if (i6 >= 9) {
                        return mo55097i().put(obj3, obj4);
                    } else {
                        if (i2 > e) {
                            u = m89422u(e, C58387dd.m89456a(e), b, i);
                        } else {
                            r[i7] = (i2 & e) | i9;
                        }
                    }
                } else {
                    Object obj5 = t[i7];
                    t[i7] = obj4;
                    return obj5;
                }
            }
            int length = mo55109r().length;
            mo55106p(min);
            mo55104n(i, obj, obj2, b, e);
            this.f155971g = i2;
            mo55102l();
            return null;
        } else if (i2 > e) {
            u = m89422u(e, C58387dd.m89456a(e), b, i);
        } else {
            C58387dd.m89462g(Objects.requireNonNull(this.f155966b), i3, i2);
            int length2 = mo55109r().length;
            if (i2 > length2 && (min = Math.min(1073741823, (Math.max(1, length2 >>> 1) + length2) | 1)) != length2) {
                mo55106p(min);
            }
            mo55104n(i, obj, obj2, b, e);
            this.f155971g = i2;
            mo55102l();
            return null;
        }
        e = u;
        int length22 = mo55109r().length;
        mo55106p(min);
        mo55104n(i, obj, obj2, b, e);
        this.f155971g = i2;
        mo55102l();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo55108q() {
        return this.f155966b == null;
    }

    /* renamed from: r */
    public final int[] mo55109r() {
        return (int[]) Objects.requireNonNull(this.f155967c);
    }

    public final Object remove(Object obj) {
        Map k = mo55100k();
        if (k != null) {
            return k.remove(obj);
        }
        Object g = mo55094g(obj);
        if (g == f155965a) {
            return null;
        }
        return g;
    }

    /* renamed from: s */
    public final Object[] mo55111s() {
        return (Object[]) Objects.requireNonNull(this.f155968d);
    }

    public final int size() {
        Map k = mo55100k();
        return k != null ? k.size() : this.f155971g;
    }

    /* renamed from: t */
    public final Object[] mo55113t() {
        return (Object[]) Objects.requireNonNull(this.f155969e);
    }

    public final Collection values() {
        Collection collection = this.f155974j;
        if (collection != null) {
            return collection;
        }
        C58382cz czVar = new C58382cz(this);
        this.f155974j = czVar;
        return czVar;
    }

    public C58384da(int i) {
        mo55103m(i);
    }
}
