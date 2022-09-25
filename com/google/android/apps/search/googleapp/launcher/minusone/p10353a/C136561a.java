package com.google.android.apps.search.googleapp.launcher.minusone.p10353a;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.a.a */
/* compiled from: PG */
final class C136561a extends C136565e {

    /* renamed from: a */
    private final Integer f371799a;

    /* renamed from: b */
    private final boolean f371800b;

    public C136561a(Integer num, boolean z) {
        this.f371799a = num;
        this.f371800b = z;
    }

    /* renamed from: a */
    public final Integer mo113226a() {
        return this.f371799a;
    }

    /* renamed from: b */
    public final boolean mo113227b() {
        return this.f371800b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C136565e) {
            C136565e eVar = (C136565e) obj;
            return this.f371799a.equals(eVar.mo113226a()) && this.f371800b == eVar.mo113227b();
        }
    }

    public final int hashCode() {
        return ((this.f371799a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f371800b ? 1237 : 1231);
    }

    public final String toString() {
        Integer num = this.f371799a;
        boolean z = this.f371800b;
        return "BackgroundColorValue{backgroundColor=" + num + ", hasBackgroundColor=" + z + "}";
    }
}
