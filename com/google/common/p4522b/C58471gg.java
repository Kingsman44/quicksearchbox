package com.google.common.p4522b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.common.b.gg */
/* compiled from: PG */
public abstract class C58471gg extends AbstractCollection implements Serializable {

    /* renamed from: c */
    public static final Object[] f156097c = new Object[0];

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: a */
    public abstract boolean mo55032a();

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* renamed from: lA */
    public abstract C58800sl iterator();

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
        return toArray(f156097c);
    }

    /* renamed from: u */
    public C58485gu mo55229u() {
        return isEmpty() ? C58485gu.m89845m() : C58485gu.m89839g(toArray(f156097c));
    }

    /* renamed from: w */
    public int mo55383w(Object[] objArr, int i) {
        C58800sl lA = iterator();
        while (lA.hasNext()) {
            objArr[i] = lA.next();
            i++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58483gs(toArray(f156097c));
    }

    /* renamed from: x */
    public int mo55384x() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: y */
    public int mo55385y() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: z */
    public Object[] mo55386z() {
        return null;
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] z = mo55386z();
            if (z != null) {
                return Arrays.copyOfRange(z, mo55385y(), mo55384x(), objArr.getClass());
            }
            objArr = C58711pd.m90498a(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo55383w(objArr, 0);
        return objArr;
    }
}
