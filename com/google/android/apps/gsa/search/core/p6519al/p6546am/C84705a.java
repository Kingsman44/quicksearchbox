package com.google.android.apps.gsa.search.core.p6519al.p6546am;

import com.google.common.p4522b.C58528ij;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.search.core.al.am.a */
/* compiled from: PG */
final class C84705a extends C84711c {

    /* renamed from: a */
    private final byte[] f230340a;

    /* renamed from: b */
    private final C58528ij f230341b;

    public C84705a(byte[] bArr, C58528ij ijVar) {
        if (bArr != null) {
            this.f230340a = bArr;
            if (ijVar != null) {
                this.f230341b = ijVar;
                return;
            }
            throw new NullPointerException("Null stateDestinations");
        }
        throw new NullPointerException("Null payload");
    }

    /* renamed from: a */
    public final C58528ij mo78429a() {
        return this.f230341b;
    }

    /* renamed from: b */
    public final byte[] mo78430b() {
        return this.f230340a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C84711c) {
            C84711c cVar = (C84711c) obj;
            return Arrays.equals(this.f230340a, cVar instanceof C84705a ? ((C84705a) cVar).f230340a : cVar.mo78430b()) && this.f230341b.equals(cVar.mo78429a());
        }
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f230340a) ^ 1000003) * 1000003) ^ this.f230341b.hashCode();
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f230340a);
        String obj = this.f230341b.toString();
        return "ProcessedGcmMessage{payload=" + arrays + ", stateDestinations=" + obj + "}";
    }
}
