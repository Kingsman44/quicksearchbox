package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.os.Bundle;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.d */
/* compiled from: PG */
final class C110480d extends C110475ay {

    /* renamed from: a */
    private final boolean f308007a;

    /* renamed from: b */
    private final boolean f308008b;

    /* renamed from: c */
    private final boolean f308009c;

    /* renamed from: d */
    private final boolean f308010d;

    /* renamed from: e */
    private final boolean f308011e;

    /* renamed from: f */
    private final Bundle f308012f;

    public C110480d(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Bundle bundle) {
        this.f308007a = z;
        this.f308008b = z2;
        this.f308009c = z3;
        this.f308010d = z4;
        this.f308011e = z5;
        this.f308012f = bundle;
    }

    /* renamed from: a */
    public final Bundle mo98714a() {
        return this.f308012f;
    }

    /* renamed from: b */
    public final boolean mo98715b() {
        return this.f308010d;
    }

    /* renamed from: c */
    public final boolean mo98716c() {
        return this.f308008b;
    }

    /* renamed from: d */
    public final boolean mo98717d() {
        return this.f308007a;
    }

    /* renamed from: e */
    public final boolean mo98718e() {
        return this.f308009c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C110475ay) {
            C110475ay ayVar = (C110475ay) obj;
            return this.f308007a == ayVar.mo98717d() && this.f308008b == ayVar.mo98716c() && this.f308009c == ayVar.mo98718e() && this.f308010d == ayVar.mo98715b() && this.f308011e == ayVar.mo98719f() && this.f308012f.equals(ayVar.mo98714a());
        }
    }

    /* renamed from: f */
    public final boolean mo98719f() {
        return this.f308011e;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((true != this.f308007a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f308008b ? 1237 : 1231)) * 1000003) ^ (true != this.f308009c ? 1237 : 1231)) * 1000003) ^ (true != this.f308010d ? 1237 : 1231)) * 1000003;
        if (true == this.f308011e) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.f308012f.hashCode();
    }

    public final String toString() {
        boolean z = this.f308007a;
        boolean z2 = this.f308008b;
        boolean z3 = this.f308009c;
        boolean z4 = this.f308010d;
        boolean z5 = this.f308011e;
        String obj = this.f308012f.toString();
        return "SuwSequenceConfig{hasCompletedSuw=" + z + ", hardwareButtonTrainingEnabled=" + z2 + ", hotwordTrainingEnabled=" + z3 + ", canSkipValueProp=" + z4 + ", isDeferredSetupWizard=" + z5 + ", opaSuwIntentExtras=" + obj + "}";
    }
}
