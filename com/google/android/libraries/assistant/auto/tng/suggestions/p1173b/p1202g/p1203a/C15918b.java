package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.g.a.b */
/* compiled from: PG */
final class C15918b extends C15938h {

    /* renamed from: a */
    private final C15937g f47262a;

    /* renamed from: b */
    private final C58833ax f47263b;

    /* renamed from: c */
    private final boolean f47264c;

    public C15918b(C15937g gVar, C58833ax axVar, boolean z) {
        this.f47262a = gVar;
        this.f47263b = axVar;
        this.f47264c = z;
    }

    /* renamed from: a */
    public final C15937g mo22605a() {
        return this.f47262a;
    }

    /* renamed from: b */
    public final C58833ax mo22606b() {
        return this.f47263b;
    }

    /* renamed from: c */
    public final boolean mo22607c() {
        return this.f47264c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15938h) {
            C15938h hVar = (C15938h) obj;
            return this.f47262a.equals(hVar.mo22605a()) && this.f47263b.equals(hVar.mo22606b()) && this.f47264c == hVar.mo22607c();
        }
    }

    public final int hashCode() {
        return ((((this.f47262a.hashCode() ^ 1000003) * 1000003) ^ this.f47263b.hashCode()) * 1000003) ^ (true != this.f47264c ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f47262a.toString();
        String valueOf = String.valueOf(this.f47263b);
        boolean z = this.f47264c;
        return "TriggerMetadata{triggerType=" + obj + ", displayType=" + valueOf + ", ignoreVisibilitySignals=" + z + "}";
    }
}
