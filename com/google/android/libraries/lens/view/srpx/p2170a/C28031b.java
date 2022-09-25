package com.google.android.libraries.lens.view.srpx.p2170a;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.srpx.a.b */
/* compiled from: PG */
final class C28031b extends C28033d {

    /* renamed from: a */
    private final C58833ax f76298a;

    /* renamed from: b */
    private final C58833ax f76299b;

    /* renamed from: c */
    private final C58833ax f76300c;

    /* renamed from: d */
    private final C58833ax f76301d;

    /* renamed from: e */
    private final C58833ax f76302e;

    /* renamed from: f */
    private final C58833ax f76303f;

    /* renamed from: g */
    private final int f76304g;

    public C28031b(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6, int i) {
        this.f76298a = axVar;
        this.f76299b = axVar2;
        this.f76300c = axVar3;
        this.f76301d = axVar4;
        this.f76302e = axVar5;
        this.f76303f = axVar6;
        this.f76304g = i;
    }

    /* renamed from: a */
    public final int mo33487a() {
        return this.f76304g;
    }

    /* renamed from: b */
    public final C58833ax mo33488b() {
        return this.f76300c;
    }

    /* renamed from: c */
    public final C58833ax mo33489c() {
        return this.f76302e;
    }

    /* renamed from: d */
    public final C58833ax mo33490d() {
        return this.f76298a;
    }

    /* renamed from: e */
    public final C58833ax mo33491e() {
        return this.f76299b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28033d) {
            C28033d dVar = (C28033d) obj;
            return this.f76298a.equals(dVar.mo33490d()) && this.f76299b.equals(dVar.mo33491e()) && this.f76300c.equals(dVar.mo33488b()) && this.f76301d.equals(dVar.mo33494g()) && this.f76302e.equals(dVar.mo33489c()) && this.f76303f.equals(dVar.mo33493f()) && this.f76304g == dVar.mo33487a();
        }
    }

    /* renamed from: f */
    public final C58833ax mo33493f() {
        return this.f76303f;
    }

    /* renamed from: g */
    public final C58833ax mo33494g() {
        return this.f76301d;
    }

    public final int hashCode() {
        return ((((((((((((this.f76298a.hashCode() ^ 1000003) * 1000003) ^ this.f76299b.hashCode()) * 1000003) ^ this.f76300c.hashCode()) * 1000003) ^ this.f76301d.hashCode()) * 1000003) ^ this.f76302e.hashCode()) * 1000003) ^ this.f76303f.hashCode()) * 1000003) ^ this.f76304g;
    }
}
