package androidx.p060c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: androidx.c.c */
/* compiled from: PG */
public final class C0973c implements Set {

    /* renamed from: a */
    public final /* synthetic */ C0977g f3089a;

    public C0973c(C0977g gVar) {
        this.f3089a = gVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f3089a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f3089a.containsKey(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.f3089a.mo3642a(collection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (this.f3089a.f3122d != set.size() || !this.f3089a.mo3642a(set)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        for (int i3 = this.f3089a.f3122d - 1; i3 >= 0; i3--) {
            Object e = this.f3089a.mo3702e(i3);
            if (e == null) {
                i = 0;
            } else {
                i = e.hashCode();
            }
            i2 += i;
        }
        return i2;
    }

    public final boolean isEmpty() {
        return this.f3089a.isEmpty();
    }

    public final Iterator iterator() {
        return new C0972b(this.f3089a);
    }

    public final boolean remove(Object obj) {
        int d = this.f3089a.mo3701d(obj);
        if (d < 0) {
            return false;
        }
        this.f3089a.mo3704f(d);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        C0977g gVar = this.f3089a;
        int i = gVar.f3122d;
        for (Object remove : collection) {
            gVar.remove(remove);
        }
        return i != gVar.f3122d;
    }

    public final boolean retainAll(Collection collection) {
        return this.f3089a.mo3643b(collection);
    }

    public final int size() {
        return this.f3089a.f3122d;
    }

    public final Object[] toArray() {
        int i = this.f3089a.f3122d;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = this.f3089a.mo3702e(i2);
        }
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        int i = this.f3089a.f3122d;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = this.f3089a.mo3702e(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
