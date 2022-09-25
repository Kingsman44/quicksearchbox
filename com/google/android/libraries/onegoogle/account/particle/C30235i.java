package com.google.android.libraries.onegoogle.account.particle;

import androidx.lifecycle.C2391v;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.account.particle.i */
/* compiled from: PG */
final class C30235i extends C30233g {

    /* renamed from: a */
    public final C2391v f81733a;

    /* renamed from: b */
    public final C58833ax f81734b;

    /* renamed from: c */
    public final C58833ax f81735c;

    /* renamed from: d */
    public final C58833ax f81736d;

    public C30235i(C2391v vVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        this.f81733a = vVar;
        this.f81734b = axVar;
        this.f81735c = axVar2;
        this.f81736d = axVar3;
    }

    /* renamed from: a */
    public final C2391v mo35706a() {
        return this.f81733a;
    }

    /* renamed from: b */
    public final C30232f mo35707b() {
        return new C30234h(this);
    }

    /* renamed from: c */
    public final C58833ax mo35708c() {
        return this.f81736d;
    }

    /* renamed from: d */
    public final C58833ax mo35709d() {
        return this.f81734b;
    }

    /* renamed from: e */
    public final C58833ax mo35710e() {
        return this.f81735c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30233g) {
            C30233g gVar = (C30233g) obj;
            return this.f81733a.equals(gVar.mo35706a()) && this.f81734b.equals(gVar.mo35709d()) && this.f81735c.equals(gVar.mo35710e()) && this.f81736d.equals(gVar.mo35708c());
        }
    }

    public final int hashCode() {
        return ((((((this.f81733a.hashCode() ^ 1000003) * 1000003) ^ this.f81734b.hashCode()) * 1000003) ^ this.f81735c.hashCode()) * 1000003) ^ this.f81736d.hashCode();
    }

    public final String toString() {
        String obj = this.f81733a.toString();
        String valueOf = String.valueOf(this.f81734b);
        String valueOf2 = String.valueOf(this.f81735c);
        String valueOf3 = String.valueOf(this.f81736d);
        return "AdditionalAccountInformation{lifecycleOwner=" + obj + ", countDecorationGenerator=" + valueOf + ", criticalAlertFeature=" + valueOf2 + ", accountCapabilitiesRetriever=" + valueOf3 + "}";
    }
}
