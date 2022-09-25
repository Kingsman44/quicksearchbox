package com.google.android.libraries.geller.portable;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.geller.portable.b */
/* compiled from: PG */
final class C21948b extends C21952d {

    /* renamed from: a */
    private final String f60551a;

    /* renamed from: b */
    private final C58833ax f60552b;

    public C21948b(String str, C58833ax axVar) {
        this.f60551a = str;
        this.f60552b = axVar;
    }

    /* renamed from: a */
    public final C58833ax mo27228a() {
        return this.f60552b;
    }

    /* renamed from: b */
    public final String mo27229b() {
        return this.f60551a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21952d) {
            C21952d dVar = (C21952d) obj;
            return this.f60551a.equals(dVar.mo27229b()) && this.f60552b.equals(dVar.mo27228a());
        }
    }

    public final int hashCode() {
        return ((this.f60551a.hashCode() ^ 1000003) * 1000003) ^ this.f60552b.hashCode();
    }

    public final String toString() {
        String str = this.f60551a;
        String valueOf = String.valueOf(this.f60552b);
        return "ElementId{key=" + str + ", timestampMicros=" + valueOf + "}";
    }
}
