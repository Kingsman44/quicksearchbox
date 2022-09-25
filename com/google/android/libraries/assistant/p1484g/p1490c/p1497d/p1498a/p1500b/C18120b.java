package com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1500b;

import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.assistant.g.c.d.a.b.b */
/* compiled from: PG */
final class C18120b extends C18128j {

    /* renamed from: a */
    public final String f51598a;

    /* renamed from: b */
    public final C18121c f51599b;

    /* renamed from: c */
    public final C18122d f51600c;

    /* renamed from: d */
    private final String f51601d;

    /* renamed from: e */
    private final Iterable f51602e;

    public C18120b(String str, String str2, Iterable iterable, C18121c cVar, C18122d dVar) {
        this.f51598a = str;
        if (str2 != null) {
            this.f51601d = str2;
            if (iterable != null) {
                this.f51602e = iterable;
                if (cVar != null) {
                    this.f51599b = cVar;
                    if (dVar != null) {
                        this.f51600c = dVar;
                        return;
                    }
                    throw new NullPointerException("Null bundleWriter");
                }
                throw new NullPointerException("Null bundleReader");
            }
            throw new NullPointerException("Null fields");
        }
        throw new NullPointerException("Null typeName");
    }

    /* renamed from: a */
    public final Iterable mo23600a() {
        return this.f51602e;
    }

    /* renamed from: b */
    public final String mo23601b() {
        return this.f51598a;
    }

    /* renamed from: c */
    public final String mo23602c() {
        return this.f51601d;
    }

    /* renamed from: e */
    public final C18121c mo23612e() {
        return this.f51599b;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.util.List, java.lang.Iterable] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18128j) {
            C18128j jVar = (C18128j) obj;
            return this.f51598a.equals(jVar.mo23601b()) && this.f51601d.equals(jVar.mo23602c()) && C58597ky.m90218i(this.f51602e, jVar.mo23600a()) && this.f51599b.equals(jVar.mo23612e()) && this.f51600c.equals(jVar.mo23614f());
        }
    }

    /* renamed from: f */
    public final C18122d mo23614f() {
        return this.f51600c;
    }

    public final int hashCode() {
        return ((((((((this.f51598a.hashCode() ^ 1000003) * 1000003) ^ this.f51601d.hashCode()) * 1000003) ^ this.f51602e.hashCode()) * 1000003) ^ this.f51599b.hashCode()) * 1000003) ^ this.f51600c.hashCode();
    }

    public final String toString() {
        String str = this.f51598a;
        String str2 = this.f51601d;
        String obj = this.f51602e.toString();
        String obj2 = this.f51599b.toString();
        String obj3 = this.f51600c.toString();
        return "RequiredParam{name=" + str + ", typeName=" + str2 + ", fields=" + obj + ", bundleReader=" + obj2 + ", bundleWriter=" + obj3 + "}";
    }
}
