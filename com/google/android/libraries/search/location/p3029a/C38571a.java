package com.google.android.libraries.search.location.p3029a;

import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56734j;

/* renamed from: com.google.android.libraries.search.location.a.a */
/* compiled from: PG */
final class C38571a extends C38585ae {

    /* renamed from: a */
    public final boolean f101956a;

    /* renamed from: b */
    public final boolean f101957b;

    /* renamed from: c */
    public final C38633by f101958c;

    /* renamed from: d */
    public final C56734j f101959d;

    /* renamed from: f */
    private final int f101960f;

    public C38571a(boolean z, boolean z2, C38633by byVar, int i, C56734j jVar) {
        this.f101956a = z;
        this.f101957b = z2;
        if (byVar != null) {
            this.f101958c = byVar;
            this.f101960f = i;
            if (jVar != null) {
                this.f101959d = jVar;
                return;
            }
            throw new NullPointerException("Null getSilkPermissionState");
        }
        throw new NullPointerException("Null getAppSetting");
    }

    /* renamed from: a */
    public final C38633by mo41494a() {
        return this.f101958c;
    }

    /* renamed from: b */
    public final C56734j mo41495b() {
        return this.f101959d;
    }

    /* renamed from: c */
    public final boolean mo41496c() {
        return this.f101957b;
    }

    /* renamed from: d */
    public final boolean mo41497d() {
        return this.f101956a;
    }

    /* renamed from: e */
    public final int mo41498e() {
        return this.f101960f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C38585ae) {
            C38585ae aeVar = (C38585ae) obj;
            return this.f101956a == aeVar.mo41497d() && this.f101957b == aeVar.mo41496c() && this.f101958c.equals(aeVar.mo41494a()) && this.f101960f == aeVar.mo41498e() && this.f101959d.equals(aeVar.mo41495b());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.f101956a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.f101957b) {
            i = 1231;
        }
        return ((((((i2 ^ i) * 1000003) ^ this.f101958c.hashCode()) * 1000003) ^ this.f101960f) * 1000003) ^ this.f101959d.hashCode();
    }

    public final String toString() {
        boolean z = this.f101956a;
        boolean z2 = this.f101957b;
        String obj = this.f101958c.toString();
        String num = Integer.toString(this.f101960f - 1);
        String obj2 = this.f101959d.toString();
        return "State{shouldPromptForConsent=" + z + ", hasAccessToLocationData=" + z2 + ", getAppSetting=" + obj + ", getAppFlowResultCode=" + num + ", getSilkPermissionState=" + obj2 + "}";
    }
}
