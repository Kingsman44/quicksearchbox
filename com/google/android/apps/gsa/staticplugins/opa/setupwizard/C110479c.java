package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.os.Bundle;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.c */
/* compiled from: PG */
public final class C110479c extends C110474ax {

    /* renamed from: a */
    public Bundle f308000a;

    /* renamed from: b */
    private boolean f308001b;

    /* renamed from: c */
    private boolean f308002c;

    /* renamed from: d */
    private boolean f308003d;

    /* renamed from: e */
    private boolean f308004e;

    /* renamed from: f */
    private boolean f308005f;

    /* renamed from: g */
    private byte f308006g;

    /* renamed from: a */
    public final C110475ay mo98708a() {
        Bundle bundle;
        if (this.f308006g == 31 && (bundle = this.f308000a) != null) {
            return new C110480d(this.f308001b, this.f308002c, this.f308003d, this.f308004e, this.f308005f, bundle);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f308006g & 1) == 0) {
            sb.append(" hasCompletedSuw");
        }
        if ((this.f308006g & 2) == 0) {
            sb.append(" hardwareButtonTrainingEnabled");
        }
        if ((this.f308006g & 4) == 0) {
            sb.append(" hotwordTrainingEnabled");
        }
        if ((this.f308006g & 8) == 0) {
            sb.append(" canSkipValueProp");
        }
        if ((this.f308006g & 16) == 0) {
            sb.append(" isDeferredSetupWizard");
        }
        if (this.f308000a == null) {
            sb.append(" opaSuwIntentExtras");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo98709b(boolean z) {
        this.f308004e = z;
        this.f308006g = (byte) (this.f308006g | 8);
    }

    /* renamed from: c */
    public final void mo98710c(boolean z) {
        this.f308002c = z;
        this.f308006g = (byte) (this.f308006g | 2);
    }

    /* renamed from: d */
    public final void mo98711d(boolean z) {
        this.f308001b = z;
        this.f308006g = (byte) (this.f308006g | 1);
    }

    /* renamed from: e */
    public final void mo98712e(boolean z) {
        this.f308003d = z;
        this.f308006g = (byte) (this.f308006g | 4);
    }

    /* renamed from: f */
    public final void mo98713f(boolean z) {
        this.f308005f = z;
        this.f308006g = (byte) (this.f308006g | 16);
    }
}
