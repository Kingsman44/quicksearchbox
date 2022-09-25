package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1149g;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.g.b */
/* compiled from: PG */
final class C15630b extends C15641m {

    /* renamed from: a */
    private final C58833ax f46735a;

    /* renamed from: b */
    private final C58833ax f46736b;

    /* renamed from: c */
    private final C58833ax f46737c;

    /* renamed from: d */
    private final C58833ax f46738d;

    /* renamed from: e */
    private final C58833ax f46739e;

    /* renamed from: f */
    private final C58833ax f46740f;

    /* renamed from: g */
    private final C58833ax f46741g;

    public C15630b(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6, C58833ax axVar7) {
        this.f46735a = axVar;
        this.f46736b = axVar2;
        this.f46737c = axVar3;
        this.f46738d = axVar4;
        this.f46739e = axVar5;
        this.f46740f = axVar6;
        this.f46741g = axVar7;
    }

    /* renamed from: a */
    public final C58833ax mo22447a() {
        return this.f46736b;
    }

    /* renamed from: b */
    public final C58833ax mo22448b() {
        return this.f46740f;
    }

    /* renamed from: c */
    public final C58833ax mo22449c() {
        return this.f46741g;
    }

    /* renamed from: d */
    public final C58833ax mo22450d() {
        return this.f46737c;
    }

    /* renamed from: e */
    public final C58833ax mo22451e() {
        return this.f46739e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15641m) {
            C15641m mVar = (C15641m) obj;
            return this.f46735a.equals(mVar.mo22454g()) && this.f46736b.equals(mVar.mo22447a()) && this.f46737c.equals(mVar.mo22450d()) && this.f46738d.equals(mVar.mo22453f()) && this.f46739e.equals(mVar.mo22451e()) && this.f46740f.equals(mVar.mo22448b()) && this.f46741g.equals(mVar.mo22449c());
        }
    }

    /* renamed from: f */
    public final C58833ax mo22453f() {
        return this.f46738d;
    }

    /* renamed from: g */
    public final C58833ax mo22454g() {
        return this.f46735a;
    }

    public final int hashCode() {
        return ((((((((((((this.f46735a.hashCode() ^ 1000003) * 1000003) ^ this.f46736b.hashCode()) * 1000003) ^ this.f46737c.hashCode()) * 1000003) ^ this.f46738d.hashCode()) * 1000003) ^ this.f46739e.hashCode()) * 1000003) ^ this.f46740f.hashCode()) * 1000003) ^ this.f46741g.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f46735a);
        String valueOf2 = String.valueOf(this.f46736b);
        String valueOf3 = String.valueOf(this.f46737c);
        String valueOf4 = String.valueOf(this.f46738d);
        String valueOf5 = String.valueOf(this.f46739e);
        String valueOf6 = String.valueOf(this.f46740f);
        String valueOf7 = String.valueOf(this.f46741g);
        return "MediaInitInfo{song=" + valueOf + ", album=" + valueOf2 + ", artist=" + valueOf3 + ", playlist=" + valueOf4 + ", genre=" + valueOf5 + ", app=" + valueOf6 + ", appPackage=" + valueOf7 + "}";
    }
}
