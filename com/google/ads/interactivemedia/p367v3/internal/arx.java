package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arx */
/* compiled from: PG */
public abstract class arx extends arj implements Set {

    /* renamed from: a */
    private transient arn f21469a;

    /* renamed from: h */
    public static arx m19439h(Object obj) {
        return new aso(obj);
    }

    /* renamed from: i */
    static int m19440i(int i) {
        double d;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
                d = (double) highestOneBit;
                Double.isNaN(d);
            } while (d * 0.7d < ((double) max));
            return highestOneBit;
        }
        aqd.m19277e(max < 1073741824, "collection too large");
        return 1073741824;
    }

    /* renamed from: j */
    public static arx m19441j(Collection collection) {
        if ((collection instanceof arx) && !(collection instanceof SortedSet)) {
            arx arx = (arx) collection;
            if (!arx.mo15278f()) {
                return arx;
            }
        }
        Object[] array = collection.toArray();
        return m19443n(array.length, array);
    }

    /* renamed from: k */
    public static arx m19442k(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return asj.f21492a;
        }
        if (length != 1) {
            return m19443n(length, (Object[]) objArr.clone());
        }
        return m19439h(objArr[0]);
    }

    /* renamed from: a */
    public abstract asp iterator();

    /* renamed from: e */
    public arn mo15277e() {
        arn arn = this.f21469a;
        if (arn != null) {
            return arn;
        }
        arn m = mo15337m();
        this.f21469a = m;
        return m;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof arx) && mo15336l() && ((arx) obj).mo15336l() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() != set.size() || !containsAll(set)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return asn.m19514a(this);
    }

    /* renamed from: l */
    public boolean mo15336l() {
        return false;
    }

    /* renamed from: m */
    public arn mo15337m() {
        return arn.m19407n(toArray());
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new arw(toArray());
    }

    /* renamed from: n */
    private static arx m19443n(int i, Object... objArr) {
        if (i == 0) {
            return asj.f21492a;
        }
        if (i == 1) {
            return m19439h(objArr[0]);
        }
        int i2 = m19440i(i);
        Object[] objArr2 = new Object[i2];
        int i3 = i2 - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[i6];
            asn.m19519f(obj, i6);
            int hashCode = obj.hashCode();
            int b = ary.m19449b(hashCode);
            while (true) {
                int i7 = b & i3;
                Object obj2 = objArr2[i7];
                if (obj2 == null) {
                    objArr[i5] = obj;
                    objArr2[i7] = obj;
                    i4 += hashCode;
                    i5++;
                    break;
                } else if (obj2.equals(obj)) {
                    break;
                } else {
                    b++;
                }
            }
        }
        Arrays.fill(objArr, i5, i, (Object) null);
        if (i5 == 1) {
            return new aso(objArr[0], i4);
        }
        if (m19440i(i5) < i2 / 2) {
            return m19443n(i5, objArr);
        }
        int length = objArr.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new asj(objArr, i4, objArr2, i3, i5);
    }
}
