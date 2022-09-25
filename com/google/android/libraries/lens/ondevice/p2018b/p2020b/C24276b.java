package com.google.android.libraries.lens.ondevice.p2018b.p2020b;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.ondevice.b.b.b */
/* compiled from: PG */
final class C24276b extends C24280f {

    /* renamed from: a */
    private final C58833ax f66323a;

    /* renamed from: b */
    private final C58833ax f66324b;

    /* renamed from: c */
    private final C58833ax f66325c;

    /* renamed from: d */
    private final C58833ax f66326d;

    /* renamed from: e */
    private final C58833ax f66327e;

    /* renamed from: f */
    private final C58833ax f66328f;

    public C24276b(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6) {
        this.f66323a = axVar;
        this.f66324b = axVar2;
        this.f66325c = axVar3;
        this.f66326d = axVar4;
        this.f66327e = axVar5;
        this.f66328f = axVar6;
    }

    /* renamed from: a */
    public final C58833ax mo29809a() {
        return this.f66327e;
    }

    /* renamed from: b */
    public final C58833ax mo29810b() {
        return this.f66323a;
    }

    /* renamed from: c */
    public final C58833ax mo29811c() {
        return this.f66328f;
    }

    /* renamed from: d */
    public final C58833ax mo29812d() {
        return this.f66324b;
    }

    /* renamed from: e */
    public final C58833ax mo29813e() {
        return this.f66325c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24280f) {
            C24280f fVar = (C24280f) obj;
            return this.f66323a.equals(fVar.mo29810b()) && this.f66324b.equals(fVar.mo29812d()) && this.f66325c.equals(fVar.mo29813e()) && this.f66326d.equals(fVar.mo29815f()) && this.f66327e.equals(fVar.mo29809a()) && this.f66328f.equals(fVar.mo29811c());
        }
    }

    /* renamed from: f */
    public final C58833ax mo29815f() {
        return this.f66326d;
    }

    public final int hashCode() {
        return ((((((((((this.f66323a.hashCode() ^ 1000003) * 1000003) ^ this.f66324b.hashCode()) * 1000003) ^ this.f66325c.hashCode()) * 1000003) ^ this.f66326d.hashCode()) * 1000003) ^ this.f66327e.hashCode()) * 1000003) ^ this.f66328f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f66323a);
        String valueOf2 = String.valueOf(this.f66324b);
        String valueOf3 = String.valueOf(this.f66325c);
        String valueOf4 = String.valueOf(this.f66326d);
        String valueOf5 = String.valueOf(this.f66327e);
        String valueOf6 = String.valueOf(this.f66328f);
        return "ImageInput{bitmap=" + valueOf + ", textInputs=" + valueOf2 + ", trackedDetections=" + valueOf3 + ", webContext=" + valueOf4 + ", analyticsId=" + valueOf5 + ", runtimeParameters=" + valueOf6 + "}";
    }
}
