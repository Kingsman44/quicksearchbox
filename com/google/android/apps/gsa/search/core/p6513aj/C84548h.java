package com.google.android.apps.gsa.search.core.p6513aj;

import com.google.common.base.C58838bb;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.search.core.aj.h */
/* compiled from: PG */
public final class C84548h extends C84552l {

    /* renamed from: b */
    private final byte[] f230088b;

    /* renamed from: c */
    private final int f230089c;

    public C84548h(byte[] bArr, int i, int i2) {
        super(i2);
        boolean z = true;
        C58838bb.m90868c(i >= 0);
        C58838bb.m90868c(i > bArr.length ? false : z);
        bArr.getClass();
        this.f230088b = bArr;
        this.f230089c = i;
    }

    /* renamed from: b */
    public final int mo78277b() {
        return this.f230088b.length;
    }

    /* renamed from: c */
    public final InputStream mo78278c() {
        return new ByteArrayInputStream(this.f230088b, 0, this.f230089c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C84548h) {
            C84548h hVar = (C84548h) obj;
            return this.f230089c == hVar.f230089c && this.f230091a == hVar.f230091a && Arrays.equals(this.f230088b, hVar.f230088b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f230088b)), Integer.valueOf(this.f230089c), Integer.valueOf(this.f230091a)});
    }
}
