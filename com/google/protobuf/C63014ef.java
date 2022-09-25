package com.google.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.ef */
/* compiled from: PG */
final class C63014ef extends C63035f implements RandomAccess {

    /* renamed from: b */
    public static final C63014ef f170093b;

    /* renamed from: c */
    private Object[] f170094c;

    /* renamed from: d */
    private int f170095d;

    static {
        C63014ef efVar = new C63014ef(new Object[0], 0);
        f170093b = efVar;
        efVar.f170142a = false;
    }

    public C63014ef() {
        this(new Object[10], 0);
    }

    /* renamed from: d */
    private final String m95707d(int i) {
        int i2 = this.f170095d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: f */
    private final void m95708f(int i) {
        if (i < 0 || i >= this.f170095d) {
            throw new IndexOutOfBoundsException(m95707d(i));
        }
    }

    public final void add(int i, Object obj) {
        int i2;
        mo59080lH();
        if (i < 0 || i > (i2 = this.f170095d)) {
            throw new IndexOutOfBoundsException(m95707d(i));
        }
        Object[] objArr = this.f170094c;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f170094c, i, objArr2, i + 1, this.f170095d - i);
            this.f170094c = objArr2;
        }
        this.f170094c[i] = obj;
        this.f170095d++;
        this.modCount++;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C62971cq mo58798e(int i) {
        if (i >= this.f170095d) {
            return new C63014ef(Arrays.copyOf(this.f170094c, i), this.f170095d);
        }
        throw new IllegalArgumentException();
    }

    public final Object get(int i) {
        m95708f(i);
        return this.f170094c[i];
    }

    public final Object remove(int i) {
        mo59080lH();
        m95708f(i);
        Object[] objArr = this.f170094c;
        Object obj = objArr[i];
        int i2 = this.f170095d;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f170095d--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo59080lH();
        m95708f(i);
        Object[] objArr = this.f170094c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f170095d;
    }

    private C63014ef(Object[] objArr, int i) {
        this.f170094c = objArr;
        this.f170095d = i;
    }

    public final boolean add(Object obj) {
        mo59080lH();
        int i = this.f170095d;
        Object[] objArr = this.f170094c;
        if (i == objArr.length) {
            this.f170094c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f170094c;
        int i2 = this.f170095d;
        this.f170095d = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
