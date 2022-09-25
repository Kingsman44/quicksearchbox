package com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1500b;

import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.assistant.g.c.d.a.b.a */
/* compiled from: PG */
public final class C18119a extends C18125g {

    /* renamed from: a */
    public final String f51593a;

    /* renamed from: b */
    private final String f51594b = "String";

    /* renamed from: c */
    private final Iterable f51595c;

    /* renamed from: d */
    private final C18121c f51596d;

    /* renamed from: e */
    private final C18122d f51597e;

    public C18119a(String str, Iterable iterable, C18121c cVar, C18122d dVar) {
        this.f51593a = str;
        if (iterable != null) {
            this.f51595c = iterable;
            this.f51596d = cVar;
            this.f51597e = dVar;
            return;
        }
        throw new NullPointerException("Null fields");
    }

    /* renamed from: a */
    public final Iterable mo23600a() {
        return this.f51595c;
    }

    /* renamed from: b */
    public final String mo23601b() {
        return this.f51593a;
    }

    /* renamed from: c */
    public final String mo23602c() {
        return this.f51594b;
    }

    /* renamed from: e */
    public final C18121c mo23607e() {
        return this.f51596d;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.util.List, java.lang.Iterable] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18125g) {
            C18125g gVar = (C18125g) obj;
            return this.f51593a.equals(gVar.mo23601b()) && this.f51594b.equals(gVar.mo23602c()) && C58597ky.m90218i(this.f51595c, gVar.mo23600a()) && this.f51596d.equals(gVar.mo23607e()) && this.f51597e.equals(gVar.mo23609f());
        }
    }

    /* renamed from: f */
    public final C18122d mo23609f() {
        return this.f51597e;
    }

    public final int hashCode() {
        return ((((((((this.f51593a.hashCode() ^ 1000003) * 1000003) ^ this.f51594b.hashCode()) * 1000003) ^ this.f51595c.hashCode()) * 1000003) ^ this.f51596d.hashCode()) * 1000003) ^ this.f51597e.hashCode();
    }

    public final String toString() {
        String str = this.f51593a;
        String str2 = this.f51594b;
        String obj = this.f51595c.toString();
        String obj2 = this.f51596d.toString();
        String obj3 = this.f51597e.toString();
        return "OptionalParam{name=" + str + ", typeName=" + str2 + ", fields=" + obj + ", bundleReader=" + obj2 + ", bundleWriter=" + obj3 + "}";
    }
}
