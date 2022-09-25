package com.google.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.ap */
/* compiled from: PG */
final class C62908ap extends C63035f implements RandomAccess, C62956cc, C63011ec {

    /* renamed from: b */
    public static final C62908ap f169855b;

    /* renamed from: c */
    private double[] f169856c;

    /* renamed from: d */
    private int f169857d;

    static {
        C62908ap apVar = new C62908ap(new double[0], 0);
        f169855b = apVar;
        apVar.f170142a = false;
    }

    public C62908ap() {
        this(new double[10], 0);
    }

    /* renamed from: h */
    private final String m95357h(int i) {
        int i2 = this.f169857d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m95358i(int i) {
        if (i < 0 || i >= this.f169857d) {
            throw new IndexOutOfBoundsException(m95357h(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo59080lH();
        if (i < 0 || i > (i2 = this.f169857d)) {
            throw new IndexOutOfBoundsException(m95357h(i));
        }
        double[] dArr = this.f169856c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f169856c, i, dArr2, i + 1, this.f169857d - i);
            this.f169856c = dArr2;
        }
        this.f169856c[i] = doubleValue;
        this.f169857d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo59080lH();
        C62972cr.m95548h(collection);
        if (!(collection instanceof C62908ap)) {
            return super.addAll(collection);
        }
        C62908ap apVar = (C62908ap) collection;
        int i = apVar.f169857d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f169857d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f169856c;
            if (i3 > dArr.length) {
                this.f169856c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(apVar.f169856c, 0, this.f169856c, this.f169857d, apVar.f169857d);
            this.f169857d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final double mo58797d(int i) {
        m95358i(i);
        return this.f169856c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62908ap)) {
            return super.equals(obj);
        }
        C62908ap apVar = (C62908ap) obj;
        if (this.f169857d != apVar.f169857d) {
            return false;
        }
        double[] dArr = apVar.f169856c;
        for (int i = 0; i < this.f169857d; i++) {
            if (Double.doubleToLongBits(this.f169856c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final C62956cc mo58798e(int i) {
        if (i >= this.f169857d) {
            return new C62908ap(Arrays.copyOf(this.f169856c, i), this.f169857d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final void mo58801g(double d) {
        mo59080lH();
        int i = this.f169857d;
        double[] dArr = this.f169856c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f169856c = dArr2;
        }
        double[] dArr3 = this.f169856c;
        int i2 = this.f169857d;
        this.f169857d = i2 + 1;
        dArr3[i2] = d;
    }

    public final /* synthetic */ Object get(int i) {
        m95358i(i);
        return Double.valueOf(this.f169856c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f169857d; i2++) {
            i = (i * 31) + C62972cr.m95543c(Double.doubleToLongBits(this.f169856c[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f169857d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f169856c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo59080lH();
        m95358i(i);
        double[] dArr = this.f169856c;
        double d = dArr[i];
        int i2 = this.f169857d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f169857d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo59080lH();
        if (i2 >= i) {
            double[] dArr = this.f169856c;
            System.arraycopy(dArr, i2, dArr, i, this.f169857d - i2);
            this.f169857d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo59080lH();
        m95358i(i);
        double[] dArr = this.f169856c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f169857d;
    }

    public C62908ap(double[] dArr, int i) {
        this.f169856c = dArr;
        this.f169857d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo58801g(((Double) obj).doubleValue());
        return true;
    }
}
