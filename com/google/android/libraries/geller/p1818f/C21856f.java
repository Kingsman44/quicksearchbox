package com.google.android.libraries.geller.p1818f;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.geller.f.f */
/* compiled from: PG */
final class C21856f extends C21850cf {

    /* renamed from: a */
    public final C58528ij f60324a;

    /* renamed from: b */
    public final C58528ij f60325b;

    /* renamed from: c */
    public final C58485gu f60326c;

    public C21856f(C58528ij ijVar, C58528ij ijVar2, C58485gu guVar) {
        this.f60324a = ijVar;
        this.f60325b = ijVar2;
        this.f60326c = guVar;
    }

    /* renamed from: a */
    public final C21849ce mo27151a() {
        return new C21855e(this);
    }

    /* renamed from: b */
    public final C58485gu mo27152b() {
        return this.f60326c;
    }

    /* renamed from: c */
    public final C58528ij mo27153c() {
        return this.f60324a;
    }

    /* renamed from: d */
    public final C58528ij mo27154d() {
        return this.f60325b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21850cf) {
            C21850cf cfVar = (C21850cf) obj;
            return this.f60324a.equals(cfVar.mo27153c()) && this.f60325b.equals(cfVar.mo27154d()) && C58597ky.m90218i(this.f60326c, cfVar.mo27152b());
        }
    }

    public final int hashCode() {
        return ((((this.f60324a.hashCode() ^ 1000003) * 1000003) ^ this.f60325b.hashCode()) * 1000003) ^ this.f60326c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f60324a);
        String valueOf2 = String.valueOf(this.f60325b);
        String valueOf3 = String.valueOf(this.f60326c);
        return "SyncResult{changedElementKeys=" + valueOf + ", uploadedElementKeys=" + valueOf2 + ", failures=" + valueOf3 + "}";
    }
}
