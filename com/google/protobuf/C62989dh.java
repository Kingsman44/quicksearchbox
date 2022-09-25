package com.google.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.dh */
/* compiled from: PG */
final class C62989dh extends C63035f implements RandomAccess, C62964ck, C63011ec {

    /* renamed from: b */
    public static final C62989dh f170046b;

    /* renamed from: c */
    public long[] f170047c;

    /* renamed from: d */
    private int f170048d;

    static {
        C62989dh dhVar = new C62989dh(new long[0], 0);
        f170046b = dhVar;
        dhVar.f170142a = false;
    }

    public C62989dh() {
        this(new long[10], 0);
    }

    /* renamed from: h */
    private final String m95587h(int i) {
        int i2 = this.f170048d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: a */
    public final long mo58927a(int i) {
        mo58975g(i);
        return this.f170047c[i];
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo59080lH();
        if (i < 0 || i > (i2 = this.f170048d)) {
            throw new IndexOutOfBoundsException(m95587h(i));
        }
        long[] jArr = this.f170047c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f170047c, i, jArr2, i + 1, this.f170048d - i);
            this.f170047c = jArr2;
        }
        this.f170047c[i] = longValue;
        this.f170048d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo59080lH();
        C62972cr.m95548h(collection);
        if (!(collection instanceof C62989dh)) {
            return super.addAll(collection);
        }
        C62989dh dhVar = (C62989dh) collection;
        int i = dhVar.f170048d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f170048d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f170047c;
            if (i3 > jArr.length) {
                this.f170047c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(dhVar.f170047c, 0, this.f170047c, this.f170048d, dhVar.f170048d);
            this.f170048d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final C62964ck mo58798e(int i) {
        if (i >= this.f170048d) {
            return new C62989dh(Arrays.copyOf(this.f170047c, i), this.f170048d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62989dh)) {
            return super.equals(obj);
        }
        C62989dh dhVar = (C62989dh) obj;
        if (this.f170048d != dhVar.f170048d) {
            return false;
        }
        long[] jArr = dhVar.f170047c;
        for (int i = 0; i < this.f170048d; i++) {
            if (this.f170047c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo58929f(long j) {
        mo59080lH();
        int i = this.f170048d;
        long[] jArr = this.f170047c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f170047c = jArr2;
        }
        long[] jArr3 = this.f170047c;
        int i2 = this.f170048d;
        this.f170048d = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: g */
    public final void mo58975g(int i) {
        if (i < 0 || i >= this.f170048d) {
            throw new IndexOutOfBoundsException(m95587h(i));
        }
    }

    public final /* synthetic */ Object get(int i) {
        mo58975g(i);
        return Long.valueOf(this.f170047c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f170048d; i2++) {
            i = (i * 31) + C62972cr.m95543c(this.f170047c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f170048d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f170047c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo59080lH();
        mo58975g(i);
        long[] jArr = this.f170047c;
        long j = jArr[i];
        int i2 = this.f170048d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f170048d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo59080lH();
        if (i2 >= i) {
            long[] jArr = this.f170047c;
            System.arraycopy(jArr, i2, jArr, i, this.f170048d - i2);
            this.f170048d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo59080lH();
        mo58975g(i);
        long[] jArr = this.f170047c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f170048d;
    }

    private C62989dh(long[] jArr, int i) {
        this.f170047c = jArr;
        this.f170048d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo58929f(((Long) obj).longValue());
        return true;
    }
}
