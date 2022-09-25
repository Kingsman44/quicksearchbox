package p5462h.p5463a;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.a.n */
/* compiled from: PG */
public final class C69530n extends C69526j {

    /* renamed from: b */
    private static final Object[] f185945b = new Object[0];

    /* renamed from: a */
    public int f185946a;

    /* renamed from: c */
    private int f185947c;

    /* renamed from: d */
    private Object[] f185948d;

    public C69530n() {
        this.f185948d = f185945b;
    }

    /* renamed from: k */
    private final int m100907k(int i) {
        return i == 0 ? C69531o.m100931h(this.f185948d) : i - 1;
    }

    /* renamed from: l */
    private final int m100908l(int i) {
        if (i == C69531o.m100931h(this.f185948d)) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: m */
    private final int m100909m(int i) {
        return i < 0 ? i + this.f185948d.length : i;
    }

    /* renamed from: n */
    private final int m100910n(int i) {
        int length = this.f185948d.length;
        return i >= length ? i - length : i;
    }

    /* renamed from: o */
    private final void m100911o(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f185948d.length;
        while (i < length && it.hasNext()) {
            this.f185948d[i] = it.next();
            i++;
        }
        int i2 = this.f185947c;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f185948d[i3] = it.next();
        }
        this.f185946a += collection.size();
    }

    /* renamed from: p */
    private final void m100912p(int i) {
        if (i >= 0) {
            Object[] objArr = this.f185948d;
            int length = objArr.length;
            if (i > length) {
                if (objArr == f185945b) {
                    if (i < 10) {
                        i = 10;
                    }
                    this.f185948d = new Object[i];
                    return;
                }
                Object[] objArr2 = new Object[C69529m.m100906a(length, i)];
                C69531o.m100928f(objArr, objArr2, 0, this.f185947c, length);
                Object[] objArr3 = this.f185948d;
                int length2 = objArr3.length;
                int i2 = this.f185947c;
                C69531o.m100928f(objArr3, objArr2, length2 - i2, 0, i2);
                this.f185947c = 0;
                this.f185948d = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    /* renamed from: a */
    public final int mo61066a() {
        return this.f185946a;
    }

    public final void add(int i, Object obj) {
        C69520d.m100899b(i, this.f185946a);
        int i2 = this.f185946a;
        if (i == i2) {
            mo61321j(obj);
        } else if (i != 0) {
            m100912p(i2 + 1);
            int n = m100910n(this.f185947c + i);
            int i3 = this.f185946a;
            if (i < ((i3 + 1) >> 1)) {
                int k = m100907k(n);
                int k2 = m100907k(this.f185947c);
                int i4 = this.f185947c;
                if (k >= i4) {
                    Object[] objArr = this.f185948d;
                    objArr[k2] = objArr[i4];
                    C69531o.m100928f(objArr, objArr, i4, i4 + 1, k + 1);
                } else {
                    Object[] objArr2 = this.f185948d;
                    C69531o.m100928f(objArr2, objArr2, i4 - 1, i4, objArr2.length);
                    Object[] objArr3 = this.f185948d;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C69531o.m100928f(objArr3, objArr3, 0, 1, k + 1);
                }
                this.f185948d[k] = obj;
                this.f185947c = k2;
            } else {
                int n2 = m100910n(this.f185947c + i3);
                if (n < n2) {
                    Object[] objArr4 = this.f185948d;
                    C69531o.m100928f(objArr4, objArr4, n + 1, n, n2);
                } else {
                    Object[] objArr5 = this.f185948d;
                    C69531o.m100928f(objArr5, objArr5, 1, 0, n2);
                    Object[] objArr6 = this.f185948d;
                    int length = objArr6.length - 1;
                    objArr6[0] = objArr6[length];
                    C69531o.m100928f(objArr6, objArr6, n + 1, n, length);
                }
                this.f185948d[n] = obj;
            }
            this.f185946a++;
        } else {
            mo61318i(obj);
        }
    }

    public final boolean addAll(int i, Collection collection) {
        C69664n.m101061g(collection, "elements");
        C69520d.m100899b(i, this.f185946a);
        if (collection.isEmpty()) {
            return false;
        }
        int i2 = this.f185946a;
        if (i == i2) {
            return addAll(collection);
        }
        m100912p(i2 + collection.size());
        int n = m100910n(this.f185947c + this.f185946a);
        int n2 = m100910n(this.f185947c + i);
        int size = collection.size();
        if (i < ((this.f185946a + 1) >> 1)) {
            int i3 = this.f185947c;
            int i4 = i3 - size;
            if (n2 < i3) {
                Object[] objArr = this.f185948d;
                C69531o.m100928f(objArr, objArr, i4, i3, objArr.length);
                if (size >= n2) {
                    Object[] objArr2 = this.f185948d;
                    C69531o.m100928f(objArr2, objArr2, objArr2.length - size, 0, n2);
                } else {
                    Object[] objArr3 = this.f185948d;
                    C69531o.m100928f(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f185948d;
                    C69531o.m100928f(objArr4, objArr4, 0, size, n2);
                }
            } else if (i4 >= 0) {
                Object[] objArr5 = this.f185948d;
                C69531o.m100928f(objArr5, objArr5, i4, i3, n2);
            } else {
                Object[] objArr6 = this.f185948d;
                int length = objArr6.length;
                i4 += length;
                int i5 = length - i4;
                if (i5 >= n2 - i3) {
                    C69531o.m100928f(objArr6, objArr6, i4, i3, n2);
                } else {
                    C69531o.m100928f(objArr6, objArr6, i4, i3, i3 + i5);
                    Object[] objArr7 = this.f185948d;
                    C69531o.m100928f(objArr7, objArr7, 0, this.f185947c + i5, n2);
                }
            }
            this.f185947c = i4;
            m100911o(m100909m(n2 - size), collection);
        } else {
            int i6 = n2 + size;
            if (n2 < n) {
                int i7 = size + n;
                Object[] objArr8 = this.f185948d;
                int length2 = objArr8.length;
                if (i7 <= length2) {
                    C69531o.m100928f(objArr8, objArr8, i6, n2, n);
                } else if (i6 >= length2) {
                    C69531o.m100928f(objArr8, objArr8, i6 - length2, n2, n);
                } else {
                    int i8 = n - (i7 - length2);
                    C69531o.m100928f(objArr8, objArr8, 0, i8, n);
                    Object[] objArr9 = this.f185948d;
                    C69531o.m100928f(objArr9, objArr9, i6, n2, i8);
                }
            } else {
                Object[] objArr10 = this.f185948d;
                C69531o.m100928f(objArr10, objArr10, size, 0, n);
                Object[] objArr11 = this.f185948d;
                int length3 = objArr11.length;
                if (i6 >= length3) {
                    C69531o.m100928f(objArr11, objArr11, i6 - length3, n2, length3);
                } else {
                    C69531o.m100928f(objArr11, objArr11, 0, length3 - size, length3);
                    Object[] objArr12 = this.f185948d;
                    C69531o.m100928f(objArr12, objArr12, i6, n2, objArr12.length - size);
                }
            }
            m100911o(n2, collection);
        }
        return true;
    }

    /* renamed from: b */
    public final Object mo61071b(int i) {
        C69520d.m100898a(i, this.f185946a);
        if (i == C69540x.m100945c(this)) {
            return mo61317h();
        }
        if (i == 0) {
            return mo61315g();
        }
        int n = m100910n(this.f185947c + i);
        Object[] objArr = this.f185948d;
        Object obj = objArr[n];
        if (i < (this.f185946a >> 1)) {
            int i2 = this.f185947c;
            if (n >= i2) {
                C69531o.m100928f(objArr, objArr, i2 + 1, i2, n);
            } else {
                C69531o.m100928f(objArr, objArr, 1, 0, n);
                Object[] objArr2 = this.f185948d;
                int length = objArr2.length - 1;
                objArr2[0] = objArr2[length];
                int i3 = this.f185947c;
                C69531o.m100928f(objArr2, objArr2, i3 + 1, i3, length);
            }
            Object[] objArr3 = this.f185948d;
            int i4 = this.f185947c;
            objArr3[i4] = null;
            this.f185947c = m100908l(i4);
        } else {
            int n2 = m100910n(this.f185947c + C69540x.m100945c(this));
            if (n <= n2) {
                Object[] objArr4 = this.f185948d;
                C69531o.m100928f(objArr4, objArr4, n, n + 1, n2 + 1);
            } else {
                Object[] objArr5 = this.f185948d;
                C69531o.m100928f(objArr5, objArr5, n, n + 1, objArr5.length);
                Object[] objArr6 = this.f185948d;
                objArr6[objArr6.length - 1] = objArr6[0];
                C69531o.m100928f(objArr6, objArr6, 0, 1, n2 + 1);
            }
            this.f185948d[n2] = null;
        }
        this.f185946a--;
        return obj;
    }

    /* renamed from: c */
    public final Object mo61309c() {
        if (!isEmpty()) {
            return this.f185948d[this.f185947c];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final void clear() {
        int n = m100910n(this.f185947c + this.f185946a);
        int i = this.f185947c;
        if (i < n) {
            C69531o.m100924b(this.f185948d, (Object) null, i, n);
        } else if (!isEmpty()) {
            Object[] objArr = this.f185948d;
            C69531o.m100924b(objArr, (Object) null, i, objArr.length);
            C69531o.m100924b(this.f185948d, (Object) null, 0, n);
        }
        this.f185947c = 0;
        this.f185946a = 0;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final Object mo61312d() {
        if (isEmpty()) {
            return null;
        }
        return this.f185948d[this.f185947c];
    }

    /* renamed from: e */
    public final Object mo61313e() {
        if (!isEmpty()) {
            return this.f185948d[m100910n(this.f185947c + C69540x.m100945c(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* renamed from: f */
    public final Object mo61314f() {
        if (isEmpty()) {
            return null;
        }
        return this.f185948d[m100910n(this.f185947c + C69540x.m100945c(this))];
    }

    /* renamed from: g */
    public final Object mo61315g() {
        if (!isEmpty()) {
            Object[] objArr = this.f185948d;
            int i = this.f185947c;
            Object obj = objArr[i];
            objArr[i] = null;
            this.f185947c = m100908l(i);
            this.f185946a--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object get(int i) {
        C69520d.m100898a(i, this.f185946a);
        return this.f185948d[m100910n(this.f185947c + i)];
    }

    /* renamed from: h */
    public final Object mo61317h() {
        if (!isEmpty()) {
            int n = m100910n(this.f185947c + C69540x.m100945c(this));
            Object[] objArr = this.f185948d;
            Object obj = objArr[n];
            objArr[n] = null;
            this.f185946a--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* renamed from: i */
    public final void mo61318i(Object obj) {
        m100912p(this.f185946a + 1);
        int k = m100907k(this.f185947c);
        this.f185947c = k;
        this.f185948d[k] = obj;
        this.f185946a++;
    }

    public final int indexOf(Object obj) {
        int i;
        int n = m100910n(this.f185947c + this.f185946a);
        int i2 = this.f185947c;
        if (i2 < n) {
            while (i2 < n) {
                if (C69664n.m101066l(obj, this.f185948d[i2])) {
                    i = this.f185947c;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < n) {
            return -1;
        } else {
            int length = this.f185948d.length;
            while (true) {
                if (i2 >= length) {
                    int i3 = 0;
                    while (i3 < n) {
                        if (C69664n.m101066l(obj, this.f185948d[i3])) {
                            i2 = i3 + this.f185948d.length;
                            i = this.f185947c;
                        } else {
                            i3++;
                        }
                    }
                    return -1;
                } else if (C69664n.m101066l(obj, this.f185948d[i2])) {
                    i = this.f185947c;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    public final boolean isEmpty() {
        return this.f185946a == 0;
    }

    /* renamed from: j */
    public final void mo61321j(Object obj) {
        m100912p(this.f185946a + 1);
        this.f185948d[m100910n(this.f185947c + this.f185946a)] = obj;
        this.f185946a++;
    }

    public final int lastIndexOf(Object obj) {
        int i;
        int i2;
        int n = m100910n(this.f185947c + this.f185946a);
        int i3 = this.f185947c;
        if (i3 < n) {
            i = n - 1;
            if (i3 <= i) {
                while (!C69664n.m101066l(obj, this.f185948d[i])) {
                    if (i != i3) {
                        i--;
                    }
                }
                i2 = this.f185947c;
            }
            return -1;
        }
        if (i3 > n) {
            int i4 = n - 1;
            while (true) {
                if (i4 < 0) {
                    int h = C69531o.m100931h(this.f185948d);
                    int i5 = this.f185947c;
                    if (i5 <= h) {
                        while (!C69664n.m101066l(obj, this.f185948d[i])) {
                            if (i != i5) {
                                h = i - 1;
                            }
                        }
                        i2 = this.f185947c;
                    }
                } else if (C69664n.m101066l(obj, this.f185948d[i4])) {
                    i = i4 + this.f185948d.length;
                    i2 = this.f185947c;
                    break;
                } else {
                    i4--;
                }
            }
        }
        return -1;
        return i - i2;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        mo61071b(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x008e
            java.lang.Object[] r0 = r11.f185948d
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x008e
        L_0x0013:
            int r0 = r11.f185947c
            int r2 = r11.f185946a
            int r0 = r0 + r2
            int r0 = r11.m100910n(r0)
            int r2 = r11.f185947c
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0041
            r5 = r2
        L_0x0023:
            if (r2 >= r0) goto L_0x003b
            java.lang.Object[] r6 = r11.f185948d
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 != 0) goto L_0x0037
            int r7 = r5 + 1
            java.lang.Object[] r8 = r11.f185948d
            r8[r5] = r6
            r5 = r7
            goto L_0x0038
        L_0x0037:
            r1 = 1
        L_0x0038:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x003b:
            java.lang.Object[] r12 = r11.f185948d
            p5462h.p5463a.C69531o.m100924b(r12, r3, r5, r0)
            goto L_0x0081
        L_0x0041:
            java.lang.Object[] r5 = r11.f185948d
            int r5 = r5.length
            r6 = r2
            r7 = 0
        L_0x0046:
            if (r2 >= r5) goto L_0x0060
            java.lang.Object[] r8 = r11.f185948d
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 != 0) goto L_0x005c
            int r8 = r6 + 1
            java.lang.Object[] r10 = r11.f185948d
            r10[r6] = r9
            r6 = r8
            goto L_0x005d
        L_0x005c:
            r7 = 1
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x0046
        L_0x0060:
            int r2 = r11.m100910n(r6)
            r5 = r2
        L_0x0065:
            if (r1 >= r0) goto L_0x0080
            java.lang.Object[] r2 = r11.f185948d
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 != 0) goto L_0x007c
            java.lang.Object[] r2 = r11.f185948d
            r2[r5] = r6
            int r5 = r11.m100908l(r5)
            goto L_0x007d
        L_0x007c:
            r7 = 1
        L_0x007d:
            int r1 = r1 + 1
            goto L_0x0065
        L_0x0080:
            r1 = r7
        L_0x0081:
            if (r1 != 0) goto L_0x0084
            goto L_0x008e
        L_0x0084:
            int r12 = r11.f185947c
            int r5 = r5 - r12
            int r12 = r11.m100909m(r5)
            r11.f185946a = r12
            return r4
        L_0x008e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p5462h.p5463a.C69530n.removeAll(java.util.Collection):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean retainAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x008e
            java.lang.Object[] r0 = r11.f185948d
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x008e
        L_0x0013:
            int r0 = r11.f185947c
            int r2 = r11.f185946a
            int r0 = r0 + r2
            int r0 = r11.m100910n(r0)
            int r2 = r11.f185947c
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0041
            r5 = r2
        L_0x0023:
            if (r2 >= r0) goto L_0x003b
            java.lang.Object[] r6 = r11.f185948d
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x0037
            int r7 = r5 + 1
            java.lang.Object[] r8 = r11.f185948d
            r8[r5] = r6
            r5 = r7
            goto L_0x0038
        L_0x0037:
            r1 = 1
        L_0x0038:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x003b:
            java.lang.Object[] r12 = r11.f185948d
            p5462h.p5463a.C69531o.m100924b(r12, r3, r5, r0)
            goto L_0x0081
        L_0x0041:
            java.lang.Object[] r5 = r11.f185948d
            int r5 = r5.length
            r6 = r2
            r7 = 0
        L_0x0046:
            if (r2 >= r5) goto L_0x0060
            java.lang.Object[] r8 = r11.f185948d
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x005c
            int r8 = r6 + 1
            java.lang.Object[] r10 = r11.f185948d
            r10[r6] = r9
            r6 = r8
            goto L_0x005d
        L_0x005c:
            r7 = 1
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x0046
        L_0x0060:
            int r2 = r11.m100910n(r6)
            r5 = r2
        L_0x0065:
            if (r1 >= r0) goto L_0x0080
            java.lang.Object[] r2 = r11.f185948d
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L_0x007c
            java.lang.Object[] r2 = r11.f185948d
            r2[r5] = r6
            int r5 = r11.m100908l(r5)
            goto L_0x007d
        L_0x007c:
            r7 = 1
        L_0x007d:
            int r1 = r1 + 1
            goto L_0x0065
        L_0x0080:
            r1 = r7
        L_0x0081:
            if (r1 != 0) goto L_0x0084
            goto L_0x008e
        L_0x0084:
            int r12 = r11.f185947c
            int r5 = r5 - r12
            int r12 = r11.m100909m(r5)
            r11.f185946a = r12
            return r4
        L_0x008e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p5462h.p5463a.C69530n.retainAll(java.util.Collection):boolean");
    }

    public final Object set(int i, Object obj) {
        C69520d.m100898a(i, this.f185946a);
        int n = m100910n(this.f185947c + i);
        Object[] objArr = this.f185948d;
        Object obj2 = objArr[n];
        objArr[n] = obj;
        return obj2;
    }

    public final Object[] toArray() {
        return toArray(new Object[this.f185946a]);
    }

    public C69530n(int i) {
        this.f185948d = i == 0 ? f185945b : new Object[i];
    }

    public final Object[] toArray(Object[] objArr) {
        C69664n.m101061g(objArr, "array");
        int length = objArr.length;
        int i = this.f185946a;
        if (length < i) {
            C69664n.m101061g(objArr, "reference");
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            C69664n.m101059e(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        C69664n.m101059e(objArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int n = m100910n(this.f185947c + this.f185946a);
        int i2 = this.f185947c;
        if (i2 < n) {
            C69531o.m100929g(this.f185948d, objArr, 0, i2, n, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f185948d;
            C69531o.m100928f(objArr2, objArr, 0, i2, objArr2.length);
            Object[] objArr3 = this.f185948d;
            C69531o.m100928f(objArr3, objArr, objArr3.length - this.f185947c, 0, n);
        }
        int length2 = objArr.length;
        int i3 = this.f185946a;
        if (length2 > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public final boolean add(Object obj) {
        mo61321j(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m100912p(this.f185946a + collection.size());
        m100911o(m100910n(this.f185947c + this.f185946a), collection);
        return true;
    }
}
