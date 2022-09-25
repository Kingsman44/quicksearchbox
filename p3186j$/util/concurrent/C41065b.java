package p3186j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: j$.util.concurrent.b */
abstract class C41065b implements Collection, Serializable {

    /* renamed from: a */
    final ConcurrentHashMap f107595a;

    C41065b(ConcurrentHashMap concurrentHashMap) {
        this.f107595a = concurrentHashMap;
    }

    public final void clear() {
        this.f107595a.clear();
    }

    public abstract boolean contains(Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean containsAll(java.util.Collection r2) {
        /*
            r1 = this;
            if (r2 == r1) goto L_0x001a
            java.util.Iterator r2 = r2.iterator()
        L_0x0006:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r2.next()
            if (r0 == 0) goto L_0x0018
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0006
        L_0x0018:
            r2 = 0
            return r2
        L_0x001a:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.concurrent.C41065b.containsAll(java.util.Collection):boolean");
    }

    public final boolean isEmpty() {
        return this.f107595a.isEmpty();
    }

    public abstract Iterator iterator();

    public abstract boolean remove(Object obj);

    public boolean removeAll(Collection collection) {
        if (collection != null) {
            C41074k[] kVarArr = this.f107595a.f107579a;
            boolean z = false;
            if (kVarArr == null) {
                return false;
            }
            if (!(collection instanceof Set) || collection.size() <= kVarArr.length) {
                for (Object remove : collection) {
                    z |= remove(remove);
                }
            } else {
                Iterator it = iterator();
                while (it.hasNext()) {
                    if (collection.contains(it.next())) {
                        it.remove();
                        z = true;
                    }
                }
            }
            return z;
        }
        throw null;
    }

    public final boolean retainAll(Collection collection) {
        if (collection != null) {
            Iterator it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        throw null;
    }

    public final int size() {
        return this.f107595a.size();
    }

    public final Object[] toArray() {
        long k = this.f107595a.mo43529k();
        if (k < 0) {
            k = 0;
        }
        if (k <= 2147483639) {
            int i = (int) k;
            Object[] objArr = new Object[i];
            Iterator it = iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (i2 == i) {
                    int i3 = 2147483639;
                    if (i < 2147483639) {
                        if (i < 1073741819) {
                            i3 = (i >>> 1) + 1 + i;
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        i = i3;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                }
                objArr[i2] = next;
                i2++;
            }
            return i2 == i ? objArr : Arrays.copyOf(objArr, i2);
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public final Object[] toArray(Object[] objArr) {
        long k = this.f107595a.mo43529k();
        if (k < 0) {
            k = 0;
        }
        if (k <= 2147483639) {
            int i = (int) k;
            Object[] objArr2 = objArr.length >= i ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            int length = objArr2.length;
            Iterator it = iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (i2 == length) {
                    int i3 = 2147483639;
                    if (length < 2147483639) {
                        if (length < 1073741819) {
                            i3 = (length >>> 1) + 1 + length;
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                        length = i3;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                }
                objArr2[i2] = next;
                i2++;
            }
            if (objArr != objArr2 || i2 >= length) {
                return i2 == length ? objArr2 : Arrays.copyOf(objArr2, i2);
            }
            objArr2[i2] = null;
            return objArr2;
        }
        throw new OutOfMemoryError("Required array size too large");
    }
}
