package com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a;

/* renamed from: com.google.assistant.f.a.a.a.a.a */
/* compiled from: PG */
public final class C52799a extends C52803e {

    /* renamed from: a */
    public final String f138525a;

    /* renamed from: b */
    public final int f138526b;

    public C52799a(int i, String str) {
        this.f138526b = i;
        this.f138525a = str;
    }

    /* renamed from: a */
    public final String mo53911a() {
        return this.f138525a;
    }

    /* renamed from: b */
    public final int mo53912b() {
        return this.f138526b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C52803e) {
            C52803e eVar = (C52803e) obj;
            return this.f138526b == eVar.mo53912b() && this.f138525a.equals(eVar.mo53911a());
        }
    }

    public final int hashCode() {
        return ((this.f138526b ^ 1000003) * 1000003) ^ this.f138525a.hashCode();
    }
}
