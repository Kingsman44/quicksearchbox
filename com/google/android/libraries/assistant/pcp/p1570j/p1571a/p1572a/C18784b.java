package com.google.android.libraries.assistant.pcp.p1570j.p1571a.p1572a;

import com.google.android.libraries.assistant.pcp.p1578m.C18995y;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58532in;

/* renamed from: com.google.android.libraries.assistant.pcp.j.a.a.b */
/* compiled from: PG */
final class C18784b extends C18792j {

    /* renamed from: a */
    private final C18995y f52906a;

    /* renamed from: b */
    private final C58528ij f52907b;

    /* renamed from: c */
    private final C58532in f52908c;

    public C18784b(C18995y yVar, C58528ij ijVar, C58532in inVar) {
        this.f52906a = yVar;
        this.f52907b = ijVar;
        this.f52908c = inVar;
    }

    /* renamed from: a */
    public final C18995y mo24127a() {
        return this.f52906a;
    }

    /* renamed from: b */
    public final C58528ij mo24128b() {
        return this.f52907b;
    }

    /* renamed from: c */
    public final C58532in mo24129c() {
        return this.f52908c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18792j) {
            C18792j jVar = (C18792j) obj;
            return this.f52906a.equals(jVar.mo24127a()) && this.f52907b.equals(jVar.mo24128b()) && this.f52908c.equals(jVar.mo24129c());
        }
    }

    public final int hashCode() {
        return ((((this.f52906a.hashCode() ^ 1000003) * 1000003) ^ this.f52907b.hashCode()) * 1000003) ^ this.f52908c.hashCode();
    }

    public final String toString() {
        String obj = this.f52906a.toString();
        String obj2 = this.f52907b.toString();
        String obj3 = this.f52908c.toString();
        return "UpsertResult{storedElement=" + obj + ", unchangedRenderedDataIds=" + obj2 + ", removedValidRenderedDataIds=" + obj3 + "}";
    }
}
