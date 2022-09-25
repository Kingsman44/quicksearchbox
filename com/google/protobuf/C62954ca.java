package com.google.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.ca */
/* compiled from: PG */
final class C62954ca extends C63035f implements RandomAccess, C62961ch, C63011ec {

    /* renamed from: b */
    public static final C62954ca f169992b;

    /* renamed from: c */
    public int[] f169993c;

    /* renamed from: d */
    private int f169994d;

    static {
        C62954ca caVar = new C62954ca(new int[0], 0);
        f169992b = caVar;
        caVar.f170142a = false;
    }

    public C62954ca() {
        this(new int[10], 0);
    }

    /* renamed from: i */
    private final String m95493i(int i) {
        int i2 = this.f169994d;
        return "Index:" + i + ", Size:" + i2;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo59080lH();
        if (i < 0 || i > (i2 = this.f169994d)) {
            throw new IndexOutOfBoundsException(m95493i(i));
        }
        int[] iArr = this.f169993c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f169993c, i, iArr2, i + 1, this.f169994d - i);
            this.f169993c = iArr2;
        }
        this.f169993c[i] = intValue;
        this.f169994d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo59080lH();
        C62972cr.m95548h(collection);
        if (!(collection instanceof C62954ca)) {
            return super.addAll(collection);
        }
        C62954ca caVar = (C62954ca) collection;
        int i = caVar.f169994d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f169994d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f169993c;
            if (i3 > iArr.length) {
                this.f169993c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(caVar.f169993c, 0, this.f169993c, this.f169994d, caVar.f169994d);
            this.f169994d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final int mo58914d(int i) {
        mo58918h(i);
        return this.f169993c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62954ca)) {
            return super.equals(obj);
        }
        C62954ca caVar = (C62954ca) obj;
        if (this.f169994d != caVar.f169994d) {
            return false;
        }
        int[] iArr = caVar.f169993c;
        for (int i = 0; i < this.f169994d; i++) {
            if (this.f169993c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final C62961ch mo58798e(int i) {
        if (i >= this.f169994d) {
            return new C62954ca(Arrays.copyOf(this.f169993c, i), this.f169994d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final void mo58916g(int i) {
        mo59080lH();
        int i2 = this.f169994d;
        int[] iArr = this.f169993c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f169993c = iArr2;
        }
        int[] iArr3 = this.f169993c;
        int i3 = this.f169994d;
        this.f169994d = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* synthetic */ Object get(int i) {
        mo58918h(i);
        return Integer.valueOf(this.f169993c[i]);
    }

    /* renamed from: h */
    public final void mo58918h(int i) {
        if (i < 0 || i >= this.f169994d) {
            throw new IndexOutOfBoundsException(m95493i(i));
        }
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f169994d; i2++) {
            i = (i * 31) + this.f169993c[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f169994d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f169993c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo59080lH();
        mo58918h(i);
        int[] iArr = this.f169993c;
        int i2 = iArr[i];
        int i3 = this.f169994d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f169994d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo59080lH();
        if (i2 >= i) {
            int[] iArr = this.f169993c;
            System.arraycopy(iArr, i2, iArr, i, this.f169994d - i2);
            this.f169994d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo59080lH();
        mo58918h(i);
        int[] iArr = this.f169993c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f169994d;
    }

    private C62954ca(int[] iArr, int i) {
        this.f169993c = iArr;
        this.f169994d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo58916g(((Integer) obj).intValue());
        return true;
    }
}
