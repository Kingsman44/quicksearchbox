package com.google.android.libraries.lens.ondevice;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.ondevice.b */
/* compiled from: PG */
final class C24267b extends C24825q {

    /* renamed from: a */
    private final C58833ax f66311a;

    /* renamed from: b */
    private final C58833ax f66312b;

    /* renamed from: c */
    private final C58833ax f66313c;

    /* renamed from: d */
    private final C58833ax f66314d;

    public C24267b(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        this.f66311a = axVar;
        this.f66312b = axVar2;
        this.f66313c = axVar3;
        this.f66314d = axVar4;
    }

    /* renamed from: a */
    public final C58833ax mo29796a() {
        return this.f66311a;
    }

    /* renamed from: b */
    public final C58833ax mo29797b() {
        return this.f66314d;
    }

    /* renamed from: c */
    public final C58833ax mo29798c() {
        return this.f66312b;
    }

    /* renamed from: d */
    public final C58833ax mo29799d() {
        return this.f66313c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24825q) {
            C24825q qVar = (C24825q) obj;
            return this.f66311a.equals(qVar.mo29796a()) && this.f66312b.equals(qVar.mo29798c()) && this.f66313c.equals(qVar.mo29799d()) && this.f66314d.equals(qVar.mo29797b());
        }
    }

    public final int hashCode() {
        return ((((((this.f66311a.hashCode() ^ 1000003) * 1000003) ^ this.f66312b.hashCode()) * 1000003) ^ this.f66313c.hashCode()) * 1000003) ^ this.f66314d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f66311a);
        String valueOf2 = String.valueOf(this.f66312b);
        String valueOf3 = String.valueOf(this.f66313c);
        String valueOf4 = String.valueOf(this.f66314d);
        return "OptionalDependencies{debugSink=" + valueOf + ", serverQueryEngine=" + valueOf2 + ", serverQueryExecutor=" + valueOf3 + ", lensFeApplicationClient=" + valueOf4 + "}";
    }
}
