package com.google.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.bi */
/* compiled from: PG */
final class C62929bi extends C63035f implements RandomAccess, C62960cg, C63011ec {

    /* renamed from: b */
    public static final C62929bi f169952b;

    /* renamed from: c */
    private float[] f169953c;

    /* renamed from: d */
    private int f169954d;

    static {
        C62929bi biVar = new C62929bi(new float[0], 0);
        f169952b = biVar;
        biVar.f170142a = false;
    }

    public C62929bi() {
        this(new float[10], 0);
    }

    /* renamed from: h */
    private final String m95416h(int i) {
        int i2 = this.f169954d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m95417i(int i) {
        if (i < 0 || i >= this.f169954d) {
            throw new IndexOutOfBoundsException(m95416h(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo59080lH();
        if (i < 0 || i > (i2 = this.f169954d)) {
            throw new IndexOutOfBoundsException(m95416h(i));
        }
        float[] fArr = this.f169953c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f169953c, i, fArr2, i + 1, this.f169954d - i);
            this.f169953c = fArr2;
        }
        this.f169953c[i] = floatValue;
        this.f169954d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo59080lH();
        C62972cr.m95548h(collection);
        if (!(collection instanceof C62929bi)) {
            return super.addAll(collection);
        }
        C62929bi biVar = (C62929bi) collection;
        int i = biVar.f169954d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f169954d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f169953c;
            if (i3 > fArr.length) {
                this.f169953c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(biVar.f169953c, 0, this.f169953c, this.f169954d, biVar.f169954d);
            this.f169954d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final float mo58859d(int i) {
        m95417i(i);
        return this.f169953c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62929bi)) {
            return super.equals(obj);
        }
        C62929bi biVar = (C62929bi) obj;
        if (this.f169954d != biVar.f169954d) {
            return false;
        }
        float[] fArr = biVar.f169953c;
        for (int i = 0; i < this.f169954d; i++) {
            if (Float.floatToIntBits(this.f169953c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final C62960cg mo58798e(int i) {
        if (i >= this.f169954d) {
            return new C62929bi(Arrays.copyOf(this.f169953c, i), this.f169954d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final void mo58861g(float f) {
        mo59080lH();
        int i = this.f169954d;
        float[] fArr = this.f169953c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f169953c = fArr2;
        }
        float[] fArr3 = this.f169953c;
        int i2 = this.f169954d;
        this.f169954d = i2 + 1;
        fArr3[i2] = f;
    }

    public final /* synthetic */ Object get(int i) {
        m95417i(i);
        return Float.valueOf(this.f169953c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f169954d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f169953c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f169954d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f169953c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo59080lH();
        m95417i(i);
        float[] fArr = this.f169953c;
        float f = fArr[i];
        int i2 = this.f169954d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f169954d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo59080lH();
        if (i2 >= i) {
            float[] fArr = this.f169953c;
            System.arraycopy(fArr, i2, fArr, i, this.f169954d - i2);
            this.f169954d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo59080lH();
        m95417i(i);
        float[] fArr = this.f169953c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f169954d;
    }

    public C62929bi(float[] fArr, int i) {
        this.f169953c = fArr;
        this.f169954d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo58861g(((Float) obj).floatValue());
        return true;
    }
}
