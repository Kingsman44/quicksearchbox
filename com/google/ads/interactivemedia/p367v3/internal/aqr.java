package com.google.ads.interactivemedia.p367v3.internal;

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

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqr */
/* compiled from: PG */
final class aqr extends AbstractMap implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Object f21396d = new Object();

    /* renamed from: a */
    transient int[] f21397a;

    /* renamed from: b */
    transient Object[] f21398b;

    /* renamed from: c */
    transient Object[] f21399c;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public transient Object f21400e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public transient int f21401f;

    /* renamed from: g */
    private transient int f21402g;

    /* renamed from: h */
    private transient Set f21403h;

    /* renamed from: i */
    private transient Set f21404i;

    /* renamed from: j */
    private transient Collection f21405j;

    public aqr() {
        mo15194b(3);
    }

    /* renamed from: a */
    public static aqr m19306a() {
        return new aqr();
    }

    /* renamed from: p */
    static /* synthetic */ void m19313p(aqr aqr) {
        aqr.f21402g--;
    }

    /* renamed from: q */
    private final void m19314q(int i) {
        this.f21401f = ary.m19457j(this.f21401f, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final int m19315r() {
        return (1 << (this.f21401f & 31)) - 1;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            mo15194b(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(readInt);
        throw new InvalidObjectException(sb.toString());
    }

    /* renamed from: s */
    private final int m19316s(int i, int i2, int i3, int i4) {
        Object e = ary.m19452e(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            ary.m19454g(e, i3 & i5, i4 + 1);
        }
        Object obj = this.f21400e;
        int[] iArr = this.f21397a;
        for (int i6 = 0; i6 <= i; i6++) {
            int f = ary.m19453f(obj, i6);
            while (f != 0) {
                int i7 = f - 1;
                int i8 = iArr[i7];
                int i9 = ary.m19456i(i8, i) | i6;
                int i10 = i9 & i5;
                int f2 = ary.m19453f(e, i10);
                ary.m19454g(e, i10, f);
                iArr[i7] = ary.m19457j(i9, f2, i5);
                f = i8 & i;
            }
        }
        this.f21400e = e;
        m19314q(i5);
        return i5;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final int m19317t(Object obj) {
        if (mo15195c()) {
            return -1;
        }
        int c = ary.m19450c(obj);
        int r = m19315r();
        int f = ary.m19453f(this.f21400e, c & r);
        if (f == 0) {
            return -1;
        }
        int i = ary.m19456i(c, r);
        do {
            int i2 = f - 1;
            int i3 = this.f21397a[i2];
            if (ary.m19456i(i3, r) == i && apz.m19253b(obj, this.f21398b[i2])) {
                return i2;
            }
            f = i3 & r;
        } while (f != 0);
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final Object m19318u(Object obj) {
        if (mo15195c()) {
            return f21396d;
        }
        int r = m19315r();
        int k = ary.m19458k(obj, (Object) null, r, this.f21400e, this.f21397a, this.f21398b, (Object[]) null);
        if (k == -1) {
            return f21396d;
        }
        Object obj2 = this.f21399c[k];
        mo15202f(k, r);
        this.f21402g--;
        mo15200e();
        return obj2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator i = mo15206i();
        while (i.hasNext()) {
            Map.Entry entry = (Map.Entry) i.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15194b(int i) {
        aqd.m19277e(true, "Expected size must be >= 0");
        this.f21401f = aqd.m19286n(i, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo15195c() {
        return this.f21400e == null;
    }

    public final void clear() {
        if (!mo15195c()) {
            mo15200e();
            Map d = mo15199d();
            if (d != null) {
                this.f21401f = aqd.m19286n(size(), 3);
                d.clear();
                this.f21400e = null;
                this.f21402g = 0;
                return;
            }
            Arrays.fill(this.f21398b, 0, this.f21402g, (Object) null);
            Arrays.fill(this.f21399c, 0, this.f21402g, (Object) null);
            Object obj = this.f21400e;
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(this.f21397a, 0, this.f21402g, 0);
            this.f21402g = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        Map d = mo15199d();
        if (d != null) {
            return d.containsKey(obj);
        }
        return m19317t(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        Map d = mo15199d();
        if (d != null) {
            return d.containsValue(obj);
        }
        for (int i = 0; i < this.f21402g; i++) {
            if (apz.m19253b(obj, this.f21399c[i])) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map mo15199d() {
        Object obj = this.f21400e;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo15200e() {
        this.f21401f += 32;
    }

    public final Set entrySet() {
        Set set = this.f21404i;
        if (set != null) {
            return set;
        }
        aqm aqm = new aqm(this);
        this.f21404i = aqm;
        return aqm;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo15202f(int i, int i2) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f21398b;
            Object obj = objArr[size];
            objArr[i] = obj;
            Object[] objArr2 = this.f21399c;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.f21397a;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int c = ary.m19450c(obj) & i2;
            int f = ary.m19453f(this.f21400e, c);
            int i3 = size + 1;
            if (f != i3) {
                while (true) {
                    int i4 = f - 1;
                    int[] iArr2 = this.f21397a;
                    int i5 = iArr2[i4];
                    int i6 = i5 & i2;
                    if (i6 != i3) {
                        f = i6;
                    } else {
                        iArr2[i4] = ary.m19457j(i5, i + 1, i2);
                        return;
                    }
                }
            } else {
                ary.m19454g(this.f21400e, c, i + 1);
            }
        } else {
            this.f21398b[i] = null;
            this.f21399c[i] = null;
            this.f21397a[i] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo15203g() {
        return isEmpty() ? -1 : 0;
    }

    public final Object get(Object obj) {
        Map d = mo15199d();
        if (d != null) {
            return d.get(obj);
        }
        int t = m19317t(obj);
        if (t == -1) {
            return null;
        }
        return this.f21399c[t];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo15205h(int i) {
        int i2 = i + 1;
        if (i2 < this.f21402g) {
            return i2;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Iterator mo15206i() {
        Map d = mo15199d();
        if (d != null) {
            return d.entrySet().iterator();
        }
        return new aqk(this);
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set keySet() {
        Set set = this.f21403h;
        if (set != null) {
            return set;
        }
        aqo aqo = new aqo(this);
        this.f21403h = aqo;
        return aqo;
    }

    public final Object put(Object obj, Object obj2) {
        int min;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (mo15195c()) {
            aqd.m19279g(mo15195c(), "Arrays already allocated");
            int i = this.f21401f;
            int max = Math.max(4, ary.m19451d(i + 1));
            this.f21400e = ary.m19452e(max);
            m19314q(max - 1);
            this.f21397a = new int[i];
            this.f21398b = new Object[i];
            this.f21399c = new Object[i];
        }
        Map d = mo15199d();
        if (d != null) {
            return d.put(obj3, obj4);
        }
        int[] iArr = this.f21397a;
        Object[] objArr = this.f21398b;
        Object[] objArr2 = this.f21399c;
        int i2 = this.f21402g;
        int i3 = i2 + 1;
        int c = ary.m19450c(obj);
        int r = m19315r();
        int i4 = c & r;
        int f = ary.m19453f(this.f21400e, i4);
        if (f != 0) {
            int i5 = ary.m19456i(c, r);
            int i6 = 0;
            while (true) {
                int i7 = f - 1;
                int i8 = iArr[i7];
                if (ary.m19456i(i8, r) != i5 || !apz.m19253b(obj3, objArr[i7])) {
                    int i9 = i8 & r;
                    i6++;
                    if (i9 != 0) {
                        f = i9;
                    } else if (i6 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m19315r() + 1, 1.0f);
                        for (int g = mo15203g(); g >= 0; g = mo15205h(g)) {
                            linkedHashMap.put(this.f21398b[g], this.f21399c[g]);
                        }
                        this.f21400e = linkedHashMap;
                        this.f21397a = null;
                        this.f21398b = null;
                        this.f21399c = null;
                        mo15200e();
                        return linkedHashMap.put(obj3, obj4);
                    } else if (i3 > r) {
                        r = m19316s(r, ary.m19455h(r), c, i2);
                    } else {
                        iArr[i7] = ary.m19457j(i8, i3, r);
                    }
                } else {
                    Object obj5 = objArr2[i7];
                    objArr2[i7] = obj4;
                    return obj5;
                }
            }
        } else if (i3 > r) {
            r = m19316s(r, ary.m19455h(r), c, i2);
        } else {
            ary.m19454g(this.f21400e, i4, i3);
        }
        int length = this.f21397a.length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f21397a = Arrays.copyOf(this.f21397a, min);
            this.f21398b = Arrays.copyOf(this.f21398b, min);
            this.f21399c = Arrays.copyOf(this.f21399c, min);
        }
        this.f21397a[i2] = ary.m19457j(c, 0, r);
        this.f21398b[i2] = obj3;
        this.f21399c[i2] = obj4;
        this.f21402g = i3;
        mo15200e();
        return null;
    }

    public final Object remove(Object obj) {
        Map d = mo15199d();
        if (d != null) {
            return d.remove(obj);
        }
        Object u = m19318u(obj);
        if (u == f21396d) {
            return null;
        }
        return u;
    }

    public final int size() {
        Map d = mo15199d();
        return d != null ? d.size() : this.f21402g;
    }

    public final Collection values() {
        Collection collection = this.f21405j;
        if (collection != null) {
            return collection;
        }
        aqq aqq = new aqq(this);
        this.f21405j = aqq;
        return aqq;
    }
}
