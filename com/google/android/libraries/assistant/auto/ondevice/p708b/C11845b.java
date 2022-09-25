package com.google.android.libraries.assistant.auto.ondevice.p708b;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.b */
/* compiled from: PG */
final class C11845b extends C11866w {

    /* renamed from: a */
    private final C58833ax f38098a;

    /* renamed from: b */
    private final C58833ax f38099b;

    /* renamed from: c */
    private final C58833ax f38100c;

    /* renamed from: d */
    private final C58833ax f38101d;

    /* renamed from: e */
    private final C58833ax f38102e;

    /* renamed from: f */
    private final C58833ax f38103f;

    /* renamed from: g */
    private final C58833ax f38104g;

    public C11845b(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6, C58833ax axVar7) {
        this.f38098a = axVar;
        this.f38099b = axVar2;
        this.f38100c = axVar3;
        this.f38101d = axVar4;
        this.f38102e = axVar5;
        this.f38103f = axVar6;
        this.f38104g = axVar7;
    }

    /* renamed from: a */
    public final C58833ax mo20211a() {
        return this.f38099b;
    }

    /* renamed from: b */
    public final C58833ax mo20212b() {
        return this.f38103f;
    }

    /* renamed from: c */
    public final C58833ax mo20213c() {
        return this.f38104g;
    }

    /* renamed from: d */
    public final C58833ax mo20214d() {
        return this.f38100c;
    }

    /* renamed from: e */
    public final C58833ax mo20215e() {
        return this.f38102e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11866w) {
            C11866w wVar = (C11866w) obj;
            return this.f38098a.equals(wVar.mo20218g()) && this.f38099b.equals(wVar.mo20211a()) && this.f38100c.equals(wVar.mo20214d()) && this.f38101d.equals(wVar.mo20217f()) && this.f38102e.equals(wVar.mo20215e()) && this.f38103f.equals(wVar.mo20212b()) && this.f38104g.equals(wVar.mo20213c());
        }
    }

    /* renamed from: f */
    public final C58833ax mo20217f() {
        return this.f38101d;
    }

    /* renamed from: g */
    public final C58833ax mo20218g() {
        return this.f38098a;
    }

    public final int hashCode() {
        return ((((((((((((this.f38098a.hashCode() ^ 1000003) * 1000003) ^ this.f38099b.hashCode()) * 1000003) ^ this.f38100c.hashCode()) * 1000003) ^ this.f38101d.hashCode()) * 1000003) ^ this.f38102e.hashCode()) * 1000003) ^ this.f38103f.hashCode()) * 1000003) ^ this.f38104g.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f38098a);
        String valueOf2 = String.valueOf(this.f38099b);
        String valueOf3 = String.valueOf(this.f38100c);
        String valueOf4 = String.valueOf(this.f38101d);
        String valueOf5 = String.valueOf(this.f38102e);
        String valueOf6 = String.valueOf(this.f38103f);
        String valueOf7 = String.valueOf(this.f38104g);
        return "MediaInitInfo{song=" + valueOf + ", album=" + valueOf2 + ", artist=" + valueOf3 + ", playlist=" + valueOf4 + ", genre=" + valueOf5 + ", app=" + valueOf6 + ", appPackage=" + valueOf7 + "}";
    }
}
