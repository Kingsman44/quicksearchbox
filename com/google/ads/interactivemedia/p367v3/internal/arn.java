package com.google.ads.interactivemedia.p367v3.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arn */
/* compiled from: PG */
public abstract class arn extends arj implements List, RandomAccess {

    /* renamed from: a */
    private static final asq f21456a = new asq(asd.f21475a, 0);

    /* renamed from: i */
    public static arn m19402i() {
        return asd.f21475a;
    }

    /* renamed from: j */
    public static arn m19403j(Object obj) {
        return m19410s(obj);
    }

    /* renamed from: k */
    public static arn m19404k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m19410s(obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: l */
    public static arn m19405l(Collection collection) {
        if (!(collection instanceof arj)) {
            return m19410s(collection.toArray());
        }
        arn e = ((arj) collection).mo15277e();
        return e.mo15278f() ? m19407n(e.toArray()) : e;
    }

    /* renamed from: m */
    public static arn m19406m(Object[] objArr) {
        if (objArr.length == 0) {
            return asd.f21475a;
        }
        return m19410s((Object[]) objArr.clone());
    }

    /* renamed from: n */
    static arn m19407n(Object[] objArr) {
        return m19408o(objArr, objArr.length);
    }

    /* renamed from: o */
    static arn m19408o(Object[] objArr, int i) {
        if (i == 0) {
            return asd.f21475a;
        }
        return new asd(objArr, i);
    }

    /* renamed from: r */
    public static ark m19409r() {
        return new ark();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: s */
    private static arn m19410s(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            asn.m19519f(objArr[i], i);
        }
        return m19407n(objArr);
    }

    /* renamed from: a */
    public final asp mo15269a() {
        return listIterator();
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: e */
    public final arn mo15277e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (apz.m19253b(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!apz.m19253b(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        return !it2.hasNext();
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public int mo15279g(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    /* renamed from: h */
    public arn subList(int i, int i2) {
        aqd.m19280h(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return asd.f21475a;
        }
        return new arm(this, i, i3);
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public final asq listIterator() {
        return listIterator(0);
    }

    /* renamed from: q */
    public final asq listIterator(int i) {
        aqd.m19284l(i, size());
        if (isEmpty()) {
            return f21456a;
        }
        return new asq(this, i);
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new arl(toArray());
    }
}
