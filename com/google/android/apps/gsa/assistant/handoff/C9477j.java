package com.google.android.apps.gsa.assistant.handoff;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.j */
/* compiled from: PG */
final class C9477j extends C9448ae {

    /* renamed from: a */
    private final int f32910a;

    /* renamed from: b */
    private final C58833ax f32911b;

    /* renamed from: c */
    private final C58833ax f32912c;

    public C9477j(int i, C58833ax axVar, C58833ax axVar2) {
        this.f32910a = i;
        this.f32911b = axVar;
        this.f32912c = axVar2;
    }

    /* renamed from: a */
    public final int mo17692a() {
        return this.f32910a;
    }

    /* renamed from: b */
    public final C58833ax mo17693b() {
        return this.f32912c;
    }

    /* renamed from: c */
    public final C58833ax mo17694c() {
        return this.f32911b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9448ae) {
            C9448ae aeVar = (C9448ae) obj;
            return this.f32910a == aeVar.mo17692a() && this.f32911b.equals(aeVar.mo17694c()) && this.f32912c.equals(aeVar.mo17693b());
        }
    }

    public final int hashCode() {
        return ((((this.f32910a ^ 1000003) * 1000003) ^ this.f32911b.hashCode()) * 1000003) ^ this.f32912c.hashCode();
    }

    public final String toString() {
        int i = this.f32910a;
        String obj = this.f32911b.toString();
        String obj2 = this.f32912c.toString();
        return "HandoffResult{resultCode=" + i + ", intent=" + obj + ", handoffResult=" + obj2 + "}";
    }
}
