package com.google.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.p */
/* compiled from: PG */
final class C63078p extends C63035f implements RandomAccess, C62955cb, C63011ec {

    /* renamed from: b */
    public static final C63078p f170231b;

    /* renamed from: c */
    private boolean[] f170232c;

    /* renamed from: d */
    private int f170233d;

    static {
        C63078p pVar = new C63078p(new boolean[0], 0);
        f170231b = pVar;
        pVar.f170142a = false;
    }

    public C63078p() {
        this(new boolean[10], 0);
    }

    /* renamed from: h */
    private final String m96100h(int i) {
        int i2 = this.f170233d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m96101i(int i) {
        if (i < 0 || i >= this.f170233d) {
            throw new IndexOutOfBoundsException(m96100h(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo59080lH();
        if (i < 0 || i > (i2 = this.f170233d)) {
            throw new IndexOutOfBoundsException(m96100h(i));
        }
        boolean[] zArr = this.f170232c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f170232c, i, zArr2, i + 1, this.f170233d - i);
            this.f170232c = zArr2;
        }
        this.f170232c[i] = booleanValue;
        this.f170233d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo59080lH();
        C62972cr.m95548h(collection);
        if (!(collection instanceof C63078p)) {
            return super.addAll(collection);
        }
        C63078p pVar = (C63078p) collection;
        int i = pVar.f170233d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f170233d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f170232c;
            if (i3 > zArr.length) {
                this.f170232c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(pVar.f170232c, 0, this.f170232c, this.f170233d, pVar.f170233d);
            this.f170233d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final C62955cb mo58798e(int i) {
        if (i >= this.f170233d) {
            return new C63078p(Arrays.copyOf(this.f170232c, i), this.f170233d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63078p)) {
            return super.equals(obj);
        }
        C63078p pVar = (C63078p) obj;
        if (this.f170233d != pVar.f170233d) {
            return false;
        }
        boolean[] zArr = pVar.f170232c;
        for (int i = 0; i < this.f170233d; i++) {
            if (this.f170232c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo58923f(boolean z) {
        mo59080lH();
        int i = this.f170233d;
        boolean[] zArr = this.f170232c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f170232c = zArr2;
        }
        boolean[] zArr3 = this.f170232c;
        int i2 = this.f170233d;
        this.f170233d = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: g */
    public final boolean mo58924g(int i) {
        m96101i(i);
        return this.f170232c[i];
    }

    public final /* synthetic */ Object get(int i) {
        m96101i(i);
        return Boolean.valueOf(this.f170232c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f170233d; i2++) {
            i = (i * 31) + C62972cr.m95541a(this.f170232c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f170233d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f170232c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo59080lH();
        m96101i(i);
        boolean[] zArr = this.f170232c;
        boolean z = zArr[i];
        int i2 = this.f170233d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f170233d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo59080lH();
        if (i2 >= i) {
            boolean[] zArr = this.f170232c;
            System.arraycopy(zArr, i2, zArr, i, this.f170233d - i2);
            this.f170233d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo59080lH();
        m96101i(i);
        boolean[] zArr = this.f170232c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f170233d;
    }

    public C63078p(boolean[] zArr, int i) {
        this.f170232c = zArr;
        this.f170233d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo58923f(((Boolean) obj).booleanValue());
        return true;
    }
}
