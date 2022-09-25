package com.google.ads.interactivemedia.p367v3.internal;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arj */
/* compiled from: PG */
public abstract class arj extends AbstractCollection implements Serializable {

    /* renamed from: a */
    private static final Object[] f21451a = new Object[0];

    /* renamed from: a */
    public abstract asp iterator();

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public Object[] mo15272b() {
        return null;
    }

    /* renamed from: c */
    public int mo15273c() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* renamed from: d */
    public int mo15276d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public arn mo15277e() {
        throw null;
    }

    /* renamed from: f */
    public abstract boolean mo15278f();

    /* renamed from: g */
    public int mo15279g(Object[] objArr) {
        throw null;
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f21451a);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new arl(toArray());
    }

    public final Object[] toArray(Object[] objArr) {
        aqd.m19282j(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] b = mo15272b();
            if (b != null) {
                return Arrays.copyOfRange(b, mo15273c(), mo15276d(), objArr.getClass());
            }
            objArr = asn.m19518e(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo15279g(objArr);
        return objArr;
    }
}
