package com.google.common.p4575r;

import com.google.common.base.C58838bb;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.common.r.q */
/* compiled from: PG */
final class C60760q extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final long[] f164803a;

    /* renamed from: b */
    final int f164804b;

    /* renamed from: c */
    final int f164805c;

    public C60760q(long[] jArr, int i, int i2) {
        this.f164803a = jArr;
        this.f164804b = i;
        this.f164805c = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Long) && C60761r.m92756b(this.f164803a, ((Long) obj).longValue(), this.f164804b, this.f164805c) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C60760q)) {
            return super.equals(obj);
        }
        C60760q qVar = (C60760q) obj;
        int i = this.f164805c - this.f164804b;
        if (qVar.f164805c - qVar.f164804b != i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f164803a[this.f164804b + i2] != qVar.f164803a[qVar.f164804b + i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        C58838bb.m90861B(i, this.f164805c - this.f164804b, "index");
        return Long.valueOf(this.f164803a[this.f164804b + i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f164804b; i2 < this.f164805c; i2++) {
            long j = this.f164803a[i2];
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int b;
        if (!(obj instanceof Long) || (b = C60761r.m92756b(this.f164803a, ((Long) obj).longValue(), this.f164804b, this.f164805c)) < 0) {
            return -1;
        }
        return b - this.f164804b;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Long) {
            long[] jArr = this.f164803a;
            long longValue = ((Long) obj).longValue();
            int i = this.f164804b;
            int i2 = this.f164805c - 1;
            while (true) {
                if (i2 >= i) {
                    if (jArr[i2] == longValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - this.f164804b;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Long l = (Long) obj;
        C58838bb.m90861B(i, this.f164805c - this.f164804b, "index");
        long[] jArr = this.f164803a;
        int i2 = this.f164804b + i;
        long j = jArr[i2];
        l.getClass();
        jArr[i2] = l.longValue();
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f164805c - this.f164804b;
    }

    public final List subList(int i, int i2) {
        C58838bb.m90882q(i, i2, this.f164805c - this.f164804b);
        if (i == i2) {
            return Collections.emptyList();
        }
        long[] jArr = this.f164803a;
        int i3 = this.f164804b;
        return new C60760q(jArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f164805c - this.f164804b) * 10);
        sb.append('[');
        sb.append(this.f164803a[this.f164804b]);
        int i = this.f164804b;
        while (true) {
            i++;
            if (i < this.f164805c) {
                sb.append(", ");
                sb.append(this.f164803a[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
