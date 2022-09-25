package com.google.android.libraries.assistant.assistantactions.p621c.p631d;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.d.f */
/* compiled from: PG */
public final class C11245f extends C11243d {

    /* renamed from: a */
    private final String f36657a;

    /* renamed from: b */
    private final String f36658b;

    /* renamed from: c */
    private final String f36659c;

    /* renamed from: d */
    private final String f36660d;

    /* renamed from: e */
    private final String f36661e;

    public C11245f(String str, String str2, String str3, String str4, String str5) {
        this.f36657a = str;
        this.f36658b = str2;
        this.f36659c = str3;
        this.f36660d = str4;
        this.f36661e = str5;
    }

    /* renamed from: a */
    public final String mo19665a() {
        return this.f36658b;
    }

    /* renamed from: b */
    public final String mo19666b() {
        return this.f36661e;
    }

    /* renamed from: c */
    public final String mo19667c() {
        return this.f36660d;
    }

    /* renamed from: d */
    public final String mo19668d() {
        return this.f36659c;
    }

    /* renamed from: e */
    public final String mo19669e() {
        return this.f36657a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11243d) {
            C11243d dVar = (C11243d) obj;
            return this.f36657a.equals(dVar.mo19669e()) && this.f36658b.equals(dVar.mo19665a()) && this.f36659c.equals(dVar.mo19668d()) && this.f36660d.equals(dVar.mo19667c()) && this.f36661e.equals(dVar.mo19666b());
        }
    }

    public final int hashCode() {
        return ((((((((this.f36657a.hashCode() ^ 1000003) * 1000003) ^ this.f36658b.hashCode()) * 1000003) ^ this.f36659c.hashCode()) * 1000003) ^ this.f36660d.hashCode()) * 1000003) ^ this.f36661e.hashCode();
    }

    public final String toString() {
        String str = this.f36657a;
        String str2 = this.f36658b;
        String str3 = this.f36659c;
        String str4 = this.f36660d;
        String str5 = this.f36661e;
        return "AumResult{sessionId=" + str + ", resolvedContactName=" + str2 + ", resolvedProvider=" + str3 + ", resolvedInstanceLabel=" + str4 + ", resolvedInstance=" + str5 + "}";
    }
}
