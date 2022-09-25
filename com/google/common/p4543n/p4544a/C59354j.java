package com.google.common.p4543n.p4544a;

import com.google.common.base.C58838bb;

/* renamed from: com.google.common.n.a.j */
/* compiled from: PG */
public final class C59354j implements CharSequence {

    /* renamed from: a */
    public final String f157551a;

    /* renamed from: b */
    public final int f157552b;

    /* renamed from: c */
    public final int f157553c;

    /* renamed from: d */
    public final int f157554d;

    public C59354j(String str, int i, int i2, int i3) {
        this.f157551a = str;
        this.f157552b = i;
        int i4 = i + i2;
        this.f157553c = i4;
        this.f157554d = i3;
        boolean z = true;
        C58838bb.m90885t(i >= 0, "Invalid index: %s", i);
        C58838bb.m90885t(i2 >= 0, "Invalid length: %s", i2);
        C58838bb.m90885t(i4 <= str.length(), "Invalid endIndex: %s", i4);
        C58838bb.m90885t(i3 < i4 ? false : z, "Invalid repetitionStartIndex: %s", i3);
    }

    /* renamed from: a */
    static C59354j m92245a(String str, int i, int i2) {
        return new C59354j(str, i, i2, Math.max(1, i2) + i);
    }

    /* renamed from: d */
    static C59354j m92246d(String str, int i, int i2) {
        return new C59354j(str, i, i2, Math.max(1, i2) + i);
    }

    /* renamed from: b */
    public final String mo56876b() {
        return this.f157551a.substring(this.f157553c);
    }

    /* renamed from: c */
    public final String mo56877c() {
        return this.f157551a.substring(0, this.f157552b);
    }

    public final char charAt(int i) {
        if (i >= 0) {
            int i2 = this.f157553c;
            int i3 = this.f157552b;
            int i4 = i2 - i3;
            if (i < i4) {
                return this.f157551a.charAt(i3 + i);
            }
            throw new IndexOutOfBoundsException("Invalid index (" + i + ") >= length (" + i4 + ")");
        }
        throw new IndexOutOfBoundsException("Invalid index (" + i + ") < 0");
    }

    public final int length() {
        return this.f157553c - this.f157552b;
    }

    public final CharSequence subSequence(int i, int i2) {
        if (i >= 0) {
            int i3 = this.f157553c;
            int i4 = this.f157552b;
            int i5 = i3 - i4;
            if (i2 > i5) {
                throw new IndexOutOfBoundsException("Invalid index: end (" + i2 + ") > length (" + i5 + ")");
            } else if (i <= i2) {
                return new C59354j(this.f157551a, i4 + i, i2 - i, this.f157554d);
            } else {
                throw new IndexOutOfBoundsException("Invalid index: begin (" + i + ") > end (" + i2 + ")");
            }
        } else {
            throw new IndexOutOfBoundsException("Invalid index: begin (" + i + ") < 0");
        }
    }

    public final String toString() {
        return this.f157551a.substring(this.f157552b, this.f157553c);
    }
}
