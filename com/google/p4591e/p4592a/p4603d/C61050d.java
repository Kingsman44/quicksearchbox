package com.google.p4591e.p4592a.p4603d;

import java.util.AbstractMap;
import java.util.Set;

/* renamed from: com.google.e.a.d.d */
/* compiled from: PG */
public final class C61050d extends AbstractMap implements Cloneable {

    /* renamed from: a */
    int f165288a;

    /* renamed from: b */
    public Object[] f165289b;

    /* renamed from: e */
    private final int m93398e(Object obj) {
        int i = this.f165288a;
        int i2 = i + i;
        Object[] objArr = this.f165289b;
        int i3 = 0;
        while (i3 < i2) {
            Object obj2 = objArr[i3];
            if (obj == null) {
                if (obj2 != null) {
                    i3 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i3 += 2;
            }
            return i3;
        }
        return -2;
    }

    /* renamed from: f */
    private final Object m93399f(int i) {
        if (i < 0) {
            return null;
        }
        return this.f165289b[i];
    }

    /* renamed from: g */
    private final void m93400g(int i, Object obj, Object obj2) {
        Object[] objArr = this.f165289b;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
    }

    /* renamed from: a */
    public final C61050d clone() {
        try {
            C61050d dVar = (C61050d) super.clone();
            Object[] objArr = this.f165289b;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                dVar.f165289b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return dVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final Object mo57597b(int i) {
        if (i < 0 || i >= this.f165288a) {
            return null;
        }
        return m93399f(i + i + 1);
    }

    /* renamed from: c */
    public final Object mo57598c(int i) {
        int i2 = this.f165288a;
        int i3 = i2 + i2;
        if (i < 0 || i >= i3) {
            return null;
        }
        Object f = m93399f(i + 1);
        Object[] objArr = this.f165289b;
        int i4 = (i3 - i) - 2;
        if (i4 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i4);
        }
        this.f165288a--;
        m93400g(i3 - 2, (Object) null, (Object) null);
        return f;
    }

    public final void clear() {
        this.f165288a = 0;
        this.f165289b = null;
    }

    public final boolean containsKey(Object obj) {
        return m93398e(obj) != -2;
    }

    public final boolean containsValue(Object obj) {
        int i = this.f165288a;
        int i2 = i + i;
        Object[] objArr = this.f165289b;
        int i3 = 1;
        while (i3 < i2) {
            Object obj2 = objArr[i3];
            if (obj == null) {
                if (obj2 != null) {
                    i3 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i3 += 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final Object mo57603d(int i, Object obj) {
        int i2 = this.f165288a;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i + i + 1;
        Object f = m93399f(i3);
        this.f165289b[i3] = obj;
        return f;
    }

    public final Set entrySet() {
        return new C61049c(this);
    }

    public final Object get(Object obj) {
        return m93399f(m93398e(obj) + 1);
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int e = m93398e(obj) >> 1;
        if (e == -1) {
            e = this.f165288a;
        }
        if (e >= 0) {
            int i2 = e + 1;
            if (i2 >= 0) {
                Object[] objArr = this.f165289b;
                int i3 = i2 + i2;
                if (objArr == null) {
                    i = 0;
                } else {
                    i = objArr.length;
                }
                if (i3 > i) {
                    int i4 = ((i >> 1) * 3) + 1;
                    if (i4 % 2 != 0) {
                        i4++;
                    }
                    if (i4 >= i3) {
                        i3 = i4;
                    }
                    int i5 = this.f165288a;
                    if (i5 == 0 || i3 != objArr.length) {
                        Object[] objArr2 = new Object[i3];
                        this.f165289b = objArr2;
                        if (i5 != 0) {
                            System.arraycopy(objArr, 0, objArr2, 0, i5 + i5);
                        }
                    }
                }
                int i6 = e + e;
                Object f = m93399f(i6 + 1);
                m93400g(i6, obj, obj2);
                if (i2 > this.f165288a) {
                    this.f165288a = i2;
                }
                return f;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }

    public final Object remove(Object obj) {
        return mo57598c(m93398e(obj));
    }

    public final int size() {
        return this.f165288a;
    }
}
