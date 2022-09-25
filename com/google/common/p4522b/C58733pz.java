package com.google.common.p4522b;

import java.util.Iterator;

/* renamed from: com.google.common.b.pz */
/* compiled from: PG */
public final class C58733pz extends C58528ij {

    /* renamed from: a */
    public static final C58733pz f156496a;

    /* renamed from: g */
    private static final Object[] f156497g;

    /* renamed from: b */
    final transient Object[] f156498b;

    /* renamed from: d */
    public final transient int f156499d;

    /* renamed from: e */
    final transient Object[] f156500e;

    /* renamed from: f */
    public final transient int f156501f;

    /* renamed from: h */
    private final transient int f156502h;

    static {
        Object[] objArr = new Object[0];
        f156497g = objArr;
        f156496a = new C58733pz(objArr, 0, objArr, 0, 0);
    }

    public C58733pz(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f156498b = objArr;
        this.f156499d = i;
        this.f156500e = objArr2;
        this.f156502h = i2;
        this.f156501f = i3;
    }

    /* renamed from: B */
    public final C58485gu mo55492B() {
        return C58485gu.m89840h(this.f156498b, this.f156501f);
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return false;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f156500e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b = C58462fy.m89758b(obj);
        while (true) {
            int i = b & this.f156502h;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b = i + 1;
        }
    }

    public final int hashCode() {
        return this.f156499d;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo55229u().listIterator(0);
    }

    /* renamed from: lA */
    public final C58800sl mo55210lA() {
        return mo55229u().listIterator(0);
    }

    public final int size() {
        return this.f156501f;
    }

    /* renamed from: v */
    public final boolean mo55230v() {
        return true;
    }

    /* renamed from: w */
    public final int mo55383w(Object[] objArr, int i) {
        System.arraycopy(this.f156498b, 0, objArr, i, this.f156501f);
        return i + this.f156501f;
    }

    /* renamed from: x */
    public final int mo55384x() {
        return this.f156501f;
    }

    /* renamed from: y */
    public final int mo55385y() {
        return 0;
    }

    /* renamed from: z */
    public final Object[] mo55386z() {
        return this.f156498b;
    }
}
