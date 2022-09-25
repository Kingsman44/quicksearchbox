package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import com.google.assistant.p3861at.C50359ud;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.b */
/* compiled from: PG */
final class C109806b extends C109818n {

    /* renamed from: a */
    public final boolean f305973a;

    /* renamed from: b */
    public final C50359ud f305974b;

    /* renamed from: c */
    public final C58833ax f305975c;

    /* renamed from: d */
    public final int f305976d;

    /* renamed from: e */
    public final int f305977e;

    public C109806b(boolean z, C50359ud udVar, C58833ax axVar, int i, int i2) {
        this.f305973a = z;
        this.f305974b = udVar;
        this.f305975c = axVar;
        this.f305976d = i;
        this.f305977e = i2;
    }

    /* renamed from: a */
    public final C50359ud mo98152a() {
        return this.f305974b;
    }

    /* renamed from: b */
    public final C58833ax mo98153b() {
        return this.f305975c;
    }

    /* renamed from: c */
    public final boolean mo98154c() {
        return this.f305973a;
    }

    /* renamed from: d */
    public final int mo98155d() {
        return this.f305976d;
    }

    /* renamed from: e */
    public final int mo98156e() {
        return this.f305977e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C109818n) {
            C109818n nVar = (C109818n) obj;
            return this.f305973a == nVar.mo98154c() && this.f305974b.equals(nVar.mo98152a()) && this.f305975c.equals(nVar.mo98153b()) && this.f305976d == nVar.mo98155d() && this.f305977e == nVar.mo98156e();
        }
    }

    public final int hashCode() {
        return (((((((((true != this.f305973a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f305974b.hashCode()) * 1000003) ^ this.f305975c.hashCode()) * 1000003) ^ this.f305976d) * 1000003) ^ this.f305977e;
    }

    public final String toString() {
        boolean z = this.f305973a;
        String obj = this.f305974b.toString();
        String valueOf = String.valueOf(this.f305975c);
        String num = Integer.toString(this.f305976d - 1);
        String num2 = Integer.toString(this.f305977e - 1);
        return "DisclosureConfig{shouldShowDisclosures=" + z + ", consentUi=" + obj + ", valuePropConfig=" + valueOf + ", omniconsentScope=" + num + ", flowId=" + num2 + "}";
    }
}
