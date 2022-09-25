package androidx.p060c;

import androidx.p060c.p061a.C0969a;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: androidx.c.i */
/* compiled from: PG */
public final class C0979i implements Collection, Set {

    /* renamed from: a */
    Object[] f3100a;

    /* renamed from: b */
    public int f3101b;

    /* renamed from: c */
    private int[] f3102c;

    public C0979i() {
        this(0);
    }

    /* renamed from: d */
    private final int m2931d(int i) {
        try {
            return C0969a.m2915a(this.f3102c, this.f3101b, i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    private final int m2932e(Object obj, int i) {
        int i2 = this.f3101b;
        if (i2 == 0) {
            return -1;
        }
        int d = m2931d(i);
        if (d < 0 || obj.equals(this.f3100a[d])) {
            return d;
        }
        int i3 = d + 1;
        while (i3 < i2 && this.f3102c[i3] == i) {
            if (obj.equals(this.f3100a[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = d - 1;
        while (i4 >= 0 && this.f3102c[i4] == i) {
            if (obj.equals(this.f3100a[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: f */
    private final int m2933f() {
        int i = this.f3101b;
        if (i == 0) {
            return -1;
        }
        int d = m2931d(0);
        if (d < 0 || this.f3100a[d] == null) {
            return d;
        }
        int i2 = d + 1;
        while (i2 < i && this.f3102c[i2] == 0) {
            if (this.f3100a[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = d - 1;
        while (i3 >= 0 && this.f3102c[i3] == 0) {
            if (this.f3100a[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: g */
    private final void m2934g(int i) {
        this.f3102c = new int[i];
        this.f3100a = new Object[i];
    }

    /* renamed from: a */
    public final int mo3654a(Object obj) {
        return obj == null ? m2933f() : m2932e(obj, obj.hashCode());
    }

    public final boolean add(Object obj) {
        int i;
        int i2;
        int i3 = this.f3101b;
        if (obj == null) {
            i2 = m2933f();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            i2 = m2932e(obj, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i4 = i2 ^ -1;
        int[] iArr = this.f3102c;
        int length = iArr.length;
        if (i3 >= length) {
            int i5 = 8;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f3100a;
            m2934g(i5);
            if (i3 == this.f3101b) {
                int[] iArr2 = this.f3102c;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                    System.arraycopy(objArr, 0, this.f3100a, 0, objArr.length);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i3) {
            int[] iArr3 = this.f3102c;
            int i6 = i4 + 1;
            int i7 = i3 - i4;
            System.arraycopy(iArr3, i4, iArr3, i6, i7);
            Object[] objArr2 = this.f3100a;
            System.arraycopy(objArr2, i4, objArr2, i6, i7);
        }
        int i8 = this.f3101b;
        if (i3 == i8) {
            int[] iArr4 = this.f3102c;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                this.f3100a[i4] = obj;
                this.f3101b = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean addAll(Collection collection) {
        mo3657b(this.f3101b + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: b */
    public final void mo3657b(int i) {
        int i2 = this.f3101b;
        int[] iArr = this.f3102c;
        if (iArr.length < i) {
            Object[] objArr = this.f3100a;
            m2934g(i);
            int i3 = this.f3101b;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f3102c, 0, i3);
                System.arraycopy(objArr, 0, this.f3100a, 0, this.f3101b);
            }
        }
        if (this.f3101b != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public final void mo3658c(int i) {
        int i2 = this.f3101b;
        Object[] objArr = this.f3100a;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f3102c;
        int length = iArr.length;
        int i4 = 8;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i3) {
                int i5 = i + 1;
                int i6 = i3 - i;
                System.arraycopy(iArr, i5, iArr, i, i6);
                Object[] objArr2 = this.f3100a;
                System.arraycopy(objArr2, i5, objArr2, i, i6);
            }
            this.f3100a[i3] = null;
        } else {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            m2934g(i4);
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f3102c, 0, i);
                System.arraycopy(objArr, 0, this.f3100a, 0, i);
            }
            if (i < i3) {
                int i7 = i + 1;
                int i8 = i3 - i;
                System.arraycopy(iArr, i7, this.f3102c, i, i8);
                System.arraycopy(objArr, i7, this.f3100a, i, i8);
            }
        }
        if (i2 == this.f3101b) {
            this.f3101b = i3;
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final void clear() {
        if (this.f3101b != 0) {
            this.f3102c = C0969a.f3084a;
            this.f3100a = C0969a.f3086c;
            this.f3101b = 0;
        }
    }

    public final boolean contains(Object obj) {
        return mo3654a(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f3101b == set.size()) {
                int i = 0;
                while (i < this.f3101b) {
                    try {
                        if (!set.contains(this.f3100a[i])) {
                            return false;
                        }
                        i++;
                    } catch (ClassCastException | NullPointerException unused) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f3102c;
        int i = this.f3101b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final boolean isEmpty() {
        return this.f3101b <= 0;
    }

    public final Iterator iterator() {
        return new C0978h(this);
    }

    public final boolean remove(Object obj) {
        int a = mo3654a(obj);
        if (a < 0) {
            return false;
        }
        mo3658c(a);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f3101b - 1; i >= 0; i--) {
            if (!collection.contains(this.f3100a[i])) {
                mo3658c(i);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.f3101b;
    }

    public final Object[] toArray() {
        int i = this.f3101b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f3100a, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3101b * 14);
        sb.append('{');
        for (int i = 0; i < this.f3101b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f3100a[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0979i(int i) {
        if (i == 0) {
            this.f3102c = C0969a.f3084a;
            this.f3100a = C0969a.f3086c;
        } else {
            m2934g(i);
        }
        this.f3101b = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0979i(C0979i iVar) {
        this(0);
        if (iVar != null) {
            int i = iVar.f3101b;
            mo3657b(this.f3101b + i);
            if (this.f3101b != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    add(iVar.f3100a[i2]);
                }
            } else if (i > 0) {
                System.arraycopy(iVar.f3102c, 0, this.f3102c, 0, i);
                System.arraycopy(iVar.f3100a, 0, this.f3100a, 0, i);
                if (this.f3101b == 0) {
                    this.f3101b = i;
                    return;
                }
                throw new ConcurrentModificationException();
            }
        }
    }

    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f3101b) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f3101b);
        }
        System.arraycopy(this.f3100a, 0, objArr, 0, this.f3101b);
        int length = objArr.length;
        int i = this.f3101b;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public C0979i(Collection collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }
}
