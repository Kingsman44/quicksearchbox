package com.google.common.p4575r;

import com.google.common.base.C58838bb;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.common.r.c */
/* compiled from: PG */
final class C60746c extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final byte[] f164788a;

    /* renamed from: b */
    final int f164789b;

    /* renamed from: c */
    final int f164790c;

    public C60746c(byte[] bArr, int i, int i2) {
        this.f164788a = bArr;
        this.f164789b = i;
        this.f164790c = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Byte) && C60747d.m92719a(this.f164788a, ((Byte) obj).byteValue(), this.f164789b, this.f164790c) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C60746c)) {
            return super.equals(obj);
        }
        C60746c cVar = (C60746c) obj;
        int i = this.f164790c - this.f164789b;
        if (cVar.f164790c - cVar.f164789b != i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f164788a[this.f164789b + i2] != cVar.f164788a[cVar.f164789b + i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        C58838bb.m90861B(i, this.f164790c - this.f164789b, "index");
        return Byte.valueOf(this.f164788a[this.f164789b + i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f164789b; i2 < this.f164790c; i2++) {
            i = (i * 31) + this.f164788a[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int a;
        if (!(obj instanceof Byte) || (a = C60747d.m92719a(this.f164788a, ((Byte) obj).byteValue(), this.f164789b, this.f164790c)) < 0) {
            return -1;
        }
        return a - this.f164789b;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Byte) {
            byte[] bArr = this.f164788a;
            byte byteValue = ((Byte) obj).byteValue();
            int i = this.f164789b;
            int i2 = this.f164790c - 1;
            while (true) {
                if (i2 >= i) {
                    if (bArr[i2] == byteValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - this.f164789b;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Byte b = (Byte) obj;
        C58838bb.m90861B(i, this.f164790c - this.f164789b, "index");
        byte[] bArr = this.f164788a;
        int i2 = this.f164789b + i;
        byte b2 = bArr[i2];
        b.getClass();
        bArr[i2] = b.byteValue();
        return Byte.valueOf(b2);
    }

    public final int size() {
        return this.f164790c - this.f164789b;
    }

    public final List subList(int i, int i2) {
        C58838bb.m90882q(i, i2, this.f164790c - this.f164789b);
        if (i == i2) {
            return Collections.emptyList();
        }
        byte[] bArr = this.f164788a;
        int i3 = this.f164789b;
        return new C60746c(bArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f164790c - this.f164789b) * 5);
        sb.append('[');
        sb.append(this.f164788a[this.f164789b]);
        int i = this.f164789b;
        while (true) {
            i++;
            if (i < this.f164790c) {
                sb.append(", ");
                sb.append(this.f164788a[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
