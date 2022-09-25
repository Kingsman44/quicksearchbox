package com.google.android.apps.gsa.search.core.p6513aj;

import com.google.protobuf.C63088z;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.search.core.aj.i */
/* compiled from: PG */
public final class C84549i extends C84552l {

    /* renamed from: b */
    private final C63088z f230090b;

    public C84549i(C63088z zVar, int i) {
        super(i);
        zVar.getClass();
        this.f230090b = zVar;
    }

    /* renamed from: b */
    public final int mo78277b() {
        return this.f230090b.mo59031d();
    }

    /* renamed from: c */
    public final InputStream mo78278c() {
        return this.f230090b.mo59041m();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C84549i) {
            C84549i iVar = (C84549i) obj;
            return this.f230091a == iVar.f230091a && this.f230090b.equals(iVar.f230090b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f230090b, Integer.valueOf(this.f230091a)});
    }
}
