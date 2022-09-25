package androidx.p060c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: androidx.c.e */
/* compiled from: PG */
final class C0975e implements Collection {

    /* renamed from: a */
    final /* synthetic */ C0977g f3094a;

    public C0975e(C0977g gVar) {
        this.f3094a = gVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f3094a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f3094a.mo3697c(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f3094a.isEmpty();
    }

    public final Iterator iterator() {
        return new C0976f(this.f3094a);
    }

    public final boolean remove(Object obj) {
        int c = this.f3094a.mo3697c(obj);
        if (c < 0) {
            return false;
        }
        this.f3094a.mo3704f(c);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        int i = this.f3094a.f3122d;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(this.f3094a.mo3708h(i2))) {
                this.f3094a.mo3704f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        int i = this.f3094a.f3122d;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(this.f3094a.mo3708h(i2))) {
                this.f3094a.mo3704f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    public final int size() {
        return this.f3094a.f3122d;
    }

    public final Object[] toArray() {
        int i = this.f3094a.f3122d;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = this.f3094a.mo3708h(i2);
        }
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        int i = this.f3094a.f3122d;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = this.f3094a.mo3708h(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
