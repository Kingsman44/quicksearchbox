package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.b.a */
/* compiled from: PG */
public final class C121493a extends C121501i {

    /* renamed from: a */
    public final String f337165a;

    /* renamed from: b */
    public final String f337166b;

    public C121493a(String str, String str2) {
        this.f337165a = str;
        this.f337166b = str2;
    }

    /* renamed from: a */
    public final String mo105193a() {
        return this.f337165a;
    }

    /* renamed from: b */
    public final String mo105194b() {
        return this.f337166b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C121501i) {
            C121501i iVar = (C121501i) obj;
            return this.f337165a.equals(iVar.mo105193a()) && this.f337166b.equals(iVar.mo105194b());
        }
    }

    public final int hashCode() {
        return ((this.f337165a.hashCode() ^ 1000003) * 1000003) ^ this.f337166b.hashCode();
    }
}
