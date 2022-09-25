package androidx.p060c;

import androidx.p060c.p061a.C0969a;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.c.n */
/* compiled from: PG */
public class C0984n {

    /* renamed from: a */
    private int[] f3120a;

    /* renamed from: b */
    private Object[] f3121b;

    /* renamed from: d */
    public int f3122d;

    public C0984n() {
        this(0);
    }

    /* renamed from: a */
    private final int m2963a(Object obj, int i) {
        int i2 = this.f3122d;
        if (i2 == 0) {
            return -1;
        }
        int a = C0969a.m2915a(this.f3120a, i2, i);
        if (a < 0 || C69664n.m101066l(obj, this.f3121b[a + a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f3120a[i3] == i) {
            if (C69664n.m101066l(obj, this.f3121b[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f3120a[i4] == i) {
            if (C69664n.m101066l(obj, this.f3121b[i4 + i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: b */
    private final int m2964b() {
        int i = this.f3122d;
        if (i == 0) {
            return -1;
        }
        int a = C0969a.m2915a(this.f3120a, i, 0);
        if (a < 0 || this.f3121b[a + a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f3120a[i2] == 0) {
            if (this.f3121b[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f3120a[i3] == 0) {
            if (this.f3121b[i3 + i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public void clear() {
        if (this.f3122d > 0) {
            this.f3120a = C0969a.f3084a;
            this.f3121b = C0969a.f3086c;
            this.f3122d = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        return mo3701d(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return mo3697c(obj) >= 0;
    }

    /* renamed from: d */
    public final int mo3701d(Object obj) {
        if (obj == null) {
            return m2964b();
        }
        return m2963a(obj, obj.hashCode());
    }

    /* renamed from: e */
    public final Object mo3702e(int i) {
        if (i >= 0 && i < this.f3122d) {
            return this.f3121b[i + i];
        }
        throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C0984n) {
                int i = this.f3122d;
                C0984n nVar = (C0984n) obj;
                if (i != nVar.f3122d) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object e = mo3702e(i2);
                    Object h = mo3708h(i2);
                    Object obj2 = nVar.get(e);
                    if (h == null) {
                        if (obj2 != null || !nVar.containsKey(e)) {
                            return false;
                        }
                    } else if (!C69664n.m101066l(h, obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f3122d != ((Map) obj).size()) {
                return false;
            } else {
                int i3 = this.f3122d;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object e2 = mo3702e(i4);
                    Object h2 = mo3708h(i4);
                    Map map = (Map) obj;
                    Object obj3 = map.get(e2);
                    if (h2 == null) {
                        if (obj3 != null || !map.containsKey(e2)) {
                            return false;
                        }
                    } else if (!C69664n.m101066l(h2, obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: g */
    public Object mo3705g(int i, Object obj) {
        if (i < 0 || i >= this.f3122d) {
            throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        int i2 = i + i + 1;
        Object[] objArr = this.f3121b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final Object get(Object obj) {
        int d = mo3701d(obj);
        if (d >= 0) {
            return this.f3121b[d + d + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d = mo3701d(obj);
        return d >= 0 ? this.f3121b[d + d + 1] : obj2;
    }

    /* renamed from: h */
    public final Object mo3708h(int i) {
        if (i >= 0 && i < this.f3122d) {
            return this.f3121b[i + i + 1];
        }
        throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
    }

    public int hashCode() {
        int[] iArr = this.f3120a;
        Object[] objArr = this.f3121b;
        int i = this.f3122d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public final void mo3710i(int i) {
        int i2 = this.f3122d;
        int[] iArr = this.f3120a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            C69664n.m101060f(copyOf, "copyOf(this, newSize)");
            this.f3120a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f3121b, i + i);
            C69664n.m101060f(copyOf2, "copyOf(this, newSize)");
            this.f3121b = copyOf2;
        }
        if (this.f3122d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean isEmpty() {
        return this.f3122d <= 0;
    }

    /* renamed from: j */
    public void mo3712j(C0984n nVar) {
        int i = nVar.f3122d;
        mo3710i(this.f3122d + i);
        if (this.f3122d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(nVar.mo3702e(i2), nVar.mo3708h(i2));
            }
        } else if (i > 0) {
            C69531o.m100927e(nVar.f3120a, this.f3120a, 0, 0, i);
            C69531o.m100928f(nVar.f3121b, this.f3121b, 0, 0, i + i);
            this.f3122d = i;
        }
    }

    public Object put(Object obj, Object obj2) {
        int i = this.f3122d;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int a = obj != null ? m2963a(obj, hashCode) : m2964b();
        if (a >= 0) {
            int i2 = a + a + 1;
            Object[] objArr = this.f3121b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = a ^ -1;
        int[] iArr = this.f3120a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            C69664n.m101060f(copyOf, "copyOf(this, newSize)");
            this.f3120a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f3121b, i4 + i4);
            C69664n.m101060f(copyOf2, "copyOf(this, newSize)");
            this.f3121b = copyOf2;
            if (i != this.f3122d) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f3120a;
            int i5 = i3 + 1;
            C69531o.m100927e(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.f3121b;
            int i6 = this.f3122d;
            C69531o.m100928f(objArr2, objArr2, i5 + i5, i3 + i3, i6 + i6);
        }
        int i7 = this.f3122d;
        if (i == i7) {
            int[] iArr3 = this.f3120a;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.f3121b;
                int i8 = i3 + i3;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.f3122d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final Object remove(Object obj) {
        int d = mo3701d(obj);
        if (d >= 0) {
            return mo3704f(d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d = mo3701d(obj);
        if (d >= 0) {
            return mo3705g(d, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f3122d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3122d * 28);
        sb.append('{');
        int i = this.f3122d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object e = mo3702e(i2);
            if (e != sb) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object h = mo3708h(i2);
            if (h != sb) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: c */
    public final int mo3697c(Object obj) {
        int i = this.f3122d;
        int i2 = i + i;
        Object[] objArr = this.f3121b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (C69664n.m101066l(obj, objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public C0984n(int i) {
        int[] iArr;
        if (i == 0) {
            iArr = C0969a.f3084a;
        } else {
            iArr = new int[i];
        }
        this.f3120a = iArr;
        this.f3121b = i == 0 ? C0969a.f3086c : new Object[(i + i)];
    }

    /* renamed from: f */
    public Object mo3704f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f3122d)) {
            throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        Object[] objArr = this.f3121b;
        int i3 = i + i;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
        } else {
            int i4 = i2 - 1;
            int[] iArr = this.f3120a;
            int length = iArr.length;
            int i5 = 8;
            if (length <= 8 || i2 >= length / 3) {
                if (i < i4) {
                    int i6 = i + 1;
                    int i7 = i4 + 1;
                    C69531o.m100927e(iArr, iArr, i, i6, i7);
                    Object[] objArr2 = this.f3121b;
                    C69531o.m100928f(objArr2, objArr2, i3, i6 + i6, i7 + i7);
                }
                Object[] objArr3 = this.f3121b;
                int i8 = i4 + i4;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                if (i2 > 8) {
                    i5 = i2 + (i2 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i5);
                C69664n.m101060f(copyOf, "copyOf(this, newSize)");
                this.f3120a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f3121b, i5 + i5);
                C69664n.m101060f(copyOf2, "copyOf(this, newSize)");
                this.f3121b = copyOf2;
                if (i2 == this.f3122d) {
                    if (i > 0) {
                        C69531o.m100927e(iArr, this.f3120a, 0, 0, i);
                        C69531o.m100928f(objArr, this.f3121b, 0, 0, i3);
                    }
                    if (i < i4) {
                        int i9 = i + 1;
                        int i10 = i4 + 1;
                        C69531o.m100927e(iArr, this.f3120a, i, i9, i10);
                        C69531o.m100928f(objArr, this.f3121b, i3, i9 + i9, i10 + i10);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            if (i2 == this.f3122d) {
                this.f3122d = i4;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d = mo3701d(obj);
        if (d < 0 || !C69664n.m101066l(obj2, mo3708h(d))) {
            return false;
        }
        mo3704f(d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d = mo3701d(obj);
        if (d < 0 || !C69664n.m101066l(obj2, mo3708h(d))) {
            return false;
        }
        mo3705g(d, obj3);
        return true;
    }
}
