package p5462h.p5463a.p5464a;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p5462h.p5463a.C69520d;
import p5462h.p5463a.C69526j;
import p5462h.p5463a.C69529m;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69641b;

/* renamed from: h.a.a.c */
/* compiled from: PG */
public final class C69469c extends C69526j implements List, RandomAccess, Serializable, C69641b {

    /* renamed from: a */
    public Object[] f185884a;

    /* renamed from: b */
    public int f185885b;

    /* renamed from: c */
    public int f185886c;

    /* renamed from: d */
    public boolean f185887d;

    /* renamed from: e */
    public final C69469c f185888e;

    /* renamed from: f */
    private final C69469c f185889f;

    public C69469c() {
        this(10);
    }

    /* renamed from: d */
    private final int m100770d(int i, int i2, Collection collection, boolean z) {
        C69469c cVar = this.f185888e;
        if (cVar == null) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i + i3;
                if (collection.contains(this.f185884a[i5]) == z) {
                    Object[] objArr = this.f185884a;
                    i3++;
                    objArr[i4 + i] = objArr[i5];
                    i4++;
                } else {
                    i3++;
                }
            }
            int i6 = i2 - i4;
            Object[] objArr2 = this.f185884a;
            C69531o.m100928f(objArr2, objArr2, i4 + i, i + i2, this.f185886c);
            Object[] objArr3 = this.f185884a;
            int i7 = this.f185886c;
            C69470d.m100781b(objArr3, i7 - i6, i7);
            this.f185886c -= i6;
            return i6;
        }
        int d = cVar.m100770d(i, i2, collection, z);
        this.f185886c -= d;
        return d;
    }

    /* renamed from: e */
    private final Object m100771e(int i) {
        C69469c cVar = this.f185888e;
        if (cVar != null) {
            this.f185886c--;
            return cVar.m100771e(i);
        }
        Object[] objArr = this.f185884a;
        Object obj = objArr[i];
        C69531o.m100928f(objArr, objArr, i, i + 1, this.f185885b + this.f185886c);
        C69470d.m100780a(this.f185884a, (this.f185885b + this.f185886c) - 1);
        this.f185886c--;
        return obj;
    }

    /* renamed from: f */
    private final void m100772f(int i, Collection collection, int i2) {
        C69469c cVar = this.f185888e;
        if (cVar != null) {
            cVar.m100772f(i, collection, i2);
            this.f185884a = this.f185888e.f185884a;
            this.f185886c += i2;
            return;
        }
        m100774h(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f185884a[i + i3] = it.next();
        }
    }

    /* renamed from: g */
    private final void m100773g(int i, Object obj) {
        C69469c cVar = this.f185888e;
        if (cVar != null) {
            cVar.m100773g(i, obj);
            this.f185884a = this.f185888e.f185884a;
            this.f185886c++;
            return;
        }
        m100774h(i, 1);
        this.f185884a[i] = obj;
    }

    /* renamed from: h */
    private final void m100774h(int i, int i2) {
        int i3 = this.f185886c + i2;
        if (this.f185888e != null) {
            throw new IllegalStateException();
        } else if (i3 >= 0) {
            Object[] objArr = this.f185884a;
            int length = objArr.length;
            if (i3 > length) {
                this.f185884a = C69470d.m100782c(objArr, C69529m.m100906a(length, i3));
            }
            Object[] objArr2 = this.f185884a;
            C69531o.m100928f(objArr2, objArr2, i + i2, i, this.f185885b + this.f185886c);
            this.f185886c += i2;
        } else {
            throw new OutOfMemoryError();
        }
    }

    /* renamed from: i */
    private final void m100775i(int i, int i2) {
        C69469c cVar = this.f185888e;
        if (cVar != null) {
            cVar.m100775i(i, i2);
        } else {
            Object[] objArr = this.f185884a;
            C69531o.m100928f(objArr, objArr, i, i + i2, this.f185886c);
            Object[] objArr2 = this.f185884a;
            int i3 = this.f185886c;
            C69470d.m100781b(objArr2, i3 - i2, i3);
        }
        this.f185886c -= i2;
    }

    /* renamed from: j */
    private final boolean m100776j() {
        if (this.f185887d) {
            return true;
        }
        C69469c cVar = this.f185889f;
        return cVar != null && cVar.f185887d;
    }

    /* renamed from: a */
    public final int mo61066a() {
        return this.f185886c;
    }

    public final void add(int i, Object obj) {
        mo61072c();
        C69520d.m100899b(i, this.f185886c);
        m100773g(this.f185885b + i, obj);
    }

    public final boolean addAll(int i, Collection collection) {
        C69664n.m101061g(collection, "elements");
        mo61072c();
        C69520d.m100899b(i, this.f185886c);
        int size = collection.size();
        m100772f(this.f185885b + i, collection, size);
        return size > 0;
    }

    /* renamed from: b */
    public final Object mo61071b(int i) {
        mo61072c();
        C69520d.m100898a(i, this.f185886c);
        return m100771e(this.f185885b + i);
    }

    /* renamed from: c */
    public final void mo61072c() {
        if (m100776j()) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        mo61072c();
        m100775i(this.f185885b, this.f185886c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        Object[] objArr = this.f185884a;
        int i = this.f185885b;
        int i2 = this.f185886c;
        if (i2 == list.size()) {
            int i3 = 0;
            while (i3 < i2) {
                if (C69664n.m101066l(objArr[i + i3], list.get(i3))) {
                    i3++;
                }
            }
            return true;
        }
        return false;
    }

    public final Object get(int i) {
        C69520d.m100898a(i, this.f185886c);
        return this.f185884a[this.f185885b + i];
    }

    public final int hashCode() {
        Object[] objArr = this.f185884a;
        int i = this.f185885b;
        int i2 = this.f185886c;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i + i4];
            i3 = (i3 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i3;
    }

    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f185886c; i++) {
            if (C69664n.m101066l(this.f185884a[this.f185885b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.f185886c == 0;
    }

    public final Iterator iterator() {
        return new C69468b(this, 0);
    }

    public final int lastIndexOf(Object obj) {
        for (int i = this.f185886c - 1; i >= 0; i--) {
            if (C69664n.m101066l(this.f185884a[this.f185885b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return new C69468b(this, 0);
    }

    public final ListIterator listIterator(int i) {
        C69520d.m100899b(i, this.f185886c);
        return new C69468b(this, i);
    }

    public final boolean remove(Object obj) {
        mo61072c();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            mo61071b(indexOf);
        }
        return indexOf >= 0;
    }

    public final boolean removeAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        mo61072c();
        if (m100770d(this.f185885b, this.f185886c, collection, false) > 0) {
            return true;
        }
        return false;
    }

    public final boolean retainAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        mo61072c();
        if (m100770d(this.f185885b, this.f185886c, collection, true) > 0) {
            return true;
        }
        return false;
    }

    public final Object set(int i, Object obj) {
        mo61072c();
        C69520d.m100898a(i, this.f185886c);
        Object[] objArr = this.f185884a;
        int i2 = this.f185885b + i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final List subList(int i, int i2) {
        C69520d.m100900c(i, i2, this.f185886c);
        Object[] objArr = this.f185884a;
        int i3 = this.f185885b + i;
        int i4 = i2 - i;
        boolean z = this.f185887d;
        C69469c cVar = this.f185889f;
        return new C69469c(objArr, i3, i4, z, this, cVar == null ? this : cVar);
    }

    public final Object[] toArray() {
        Object[] objArr = this.f185884a;
        int i = this.f185885b;
        int i2 = this.f185886c + i;
        C69664n.m101061g(objArr, "<this>");
        int length = objArr.length;
        if (i2 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
            C69664n.m101060f(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            C69664n.m101059e(copyOfRange, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        Object[] objArr = this.f185884a;
        int i = this.f185885b;
        int i2 = this.f185886c;
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(objArr[i + i3]);
        }
        sb.append("]");
        return sb.toString();
    }

    public C69469c(int i) {
        this(new Object[i], 0, 0, false, (C69469c) null, (C69469c) null);
    }

    private final Object writeReplace() {
        if (m100776j()) {
            return new C69481o(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    private C69469c(Object[] objArr, int i, int i2, boolean z, C69469c cVar, C69469c cVar2) {
        this.f185884a = objArr;
        this.f185885b = i;
        this.f185886c = i2;
        this.f185887d = z;
        this.f185888e = cVar;
        this.f185889f = cVar2;
    }

    public final boolean add(Object obj) {
        mo61072c();
        m100773g(this.f185885b + this.f185886c, obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        mo61072c();
        int size = collection.size();
        m100772f(this.f185885b + this.f185886c, collection, size);
        return size > 0;
    }

    public final Object[] toArray(Object[] objArr) {
        C69664n.m101061g(objArr, "destination");
        int length = objArr.length;
        int i = this.f185886c;
        if (length < i) {
            Object[] objArr2 = this.f185884a;
            int i2 = this.f185885b;
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            C69664n.m101060f(copyOfRange, "copyOfRange(array, offse…h, destination.javaClass)");
            return copyOfRange;
        }
        Object[] objArr3 = this.f185884a;
        C69664n.m101059e(objArr3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilder.toArray>");
        int i3 = this.f185885b;
        C69531o.m100928f(objArr3, objArr, 0, i3, this.f185886c + i3);
        int i4 = this.f185886c;
        if (length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
