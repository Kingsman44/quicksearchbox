package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.ij */
/* compiled from: PG */
public abstract class C58528ij extends C58471gg implements Set {

    /* renamed from: a */
    private transient C58485gu f156178a;

    /* renamed from: A */
    static int m90002A(int i) {
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
        C58838bb.m90869d(max < 1073741824, "collection too large");
        return 1073741824;
    }

    /* renamed from: C */
    public static C58526ih m90003C(int i) {
        C58371co.m89408c(i, "expectedSize");
        return new C58526ih(i);
    }

    /* renamed from: E */
    public static C58528ij m90005E(Iterable iterable) {
        if (iterable instanceof Collection) {
            return m90006F((Collection) iterable);
        }
        return m90007G(iterable.iterator());
    }

    /* renamed from: F */
    public static C58528ij m90006F(Collection collection) {
        if ((collection instanceof C58528ij) && !(collection instanceof SortedSet)) {
            C58528ij ijVar = (C58528ij) collection;
            if (!ijVar.mo55032a()) {
                return ijVar;
            }
        }
        Object[] array = collection.toArray();
        return m90004D(array.length, array);
    }

    /* renamed from: G */
    public static C58528ij m90007G(Iterator it) {
        if (!it.hasNext()) {
            return C58733pz.f156496a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return new C58759qy(next);
        }
        C58526ih ihVar = new C58526ih();
        ihVar.mo55373c(next);
        it.getClass();
        while (it.hasNext()) {
            ihVar.mo55373c(it.next());
        }
        return ihVar.mo55486f();
    }

    /* renamed from: H */
    public static C58528ij m90008H(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C58733pz.f156496a;
        }
        if (length != 1) {
            return m90004D(length, (Object[]) objArr.clone());
        }
        return new C58759qy(objArr[0]);
    }

    /* renamed from: I */
    public static C58528ij m90009I() {
        return C58733pz.f156496a;
    }

    /* renamed from: J */
    public static C58528ij m90010J(Object obj) {
        return new C58759qy(obj);
    }

    /* renamed from: K */
    public static C58528ij m90011K(Object obj, Object obj2) {
        return m90004D(2, obj, obj2);
    }

    /* renamed from: L */
    public static C58528ij m90012L(Object obj, Object obj2, Object obj3) {
        return m90004D(3, obj, obj2, obj3);
    }

    /* renamed from: M */
    public static C58528ij m90013M(Object obj, Object obj2, Object obj3, Object obj4) {
        return m90004D(4, obj, obj2, obj3, obj4);
    }

    /* renamed from: N */
    public static C58528ij m90014N(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m90004D(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    /* renamed from: O */
    public static C58528ij m90015O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return m90004D(i, objArr2);
    }

    /* renamed from: P */
    public static boolean m90016P(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: B */
    public C58485gu mo55492B() {
        return C58485gu.m89839g(toArray(C58471gg.f156097c));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C58528ij) || !mo55230v() || !((C58528ij) obj).mo55230v() || hashCode() == obj.hashCode()) {
            return C58758qx.m90654l(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return C58758qx.m90643a(this);
    }

    /* renamed from: lA */
    public abstract C58800sl iterator();

    /* renamed from: u */
    public C58485gu mo55229u() {
        C58485gu guVar = this.f156178a;
        if (guVar != null) {
            return guVar;
        }
        C58485gu B = mo55492B();
        this.f156178a = B;
        return B;
    }

    /* renamed from: v */
    public boolean mo55230v() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58527ii(toArray(C58471gg.f156097c));
    }

    /* renamed from: D */
    public static C58528ij m90004D(int i, Object... objArr) {
        if (i == 0) {
            return C58733pz.f156496a;
        }
        if (i == 1) {
            return new C58759qy(Objects.requireNonNull(objArr[0]));
        }
        int A = m90002A(i);
        Object[] objArr2 = new Object[A];
        int i2 = A - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            C58704ox.m90450c(obj, i5);
            int hashCode = obj.hashCode();
            int a = C58462fy.m89757a(hashCode);
            while (true) {
                int i6 = a & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += hashCode;
                    i4++;
                    break;
                } else if (obj2.equals(obj)) {
                    break;
                } else {
                    a++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new C58759qy(Objects.requireNonNull(objArr[0]));
        }
        if (m90002A(i4) < A / 2) {
            return m90004D(i4, objArr);
        }
        if (m90016P(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C58733pz(objArr, i3, objArr2, i2, i4);
    }
}
