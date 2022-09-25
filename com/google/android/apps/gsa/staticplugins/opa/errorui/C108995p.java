package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.p */
/* compiled from: PG */
public final class C108995p extends C108940ep {

    /* renamed from: a */
    public Bundle f303079a;

    /* renamed from: b */
    private int f303080b;

    /* renamed from: c */
    private boolean f303081c;

    /* renamed from: d */
    private boolean f303082d;

    /* renamed from: e */
    private boolean f303083e;

    /* renamed from: f */
    private int f303084f;

    /* renamed from: g */
    private boolean f303085g;

    /* renamed from: h */
    private boolean f303086h;

    /* renamed from: i */
    private byte f303087i;

    public C108995p() {
    }

    public C108995p(StartupConfig startupConfig) {
        AutoValue_StartupConfig autoValue_StartupConfig = (AutoValue_StartupConfig) startupConfig;
        this.f303080b = autoValue_StartupConfig.f302565a;
        this.f303081c = autoValue_StartupConfig.f302566b;
        this.f303079a = autoValue_StartupConfig.f302567c;
        this.f303082d = autoValue_StartupConfig.f302568d;
        this.f303083e = autoValue_StartupConfig.f302569e;
        this.f303084f = autoValue_StartupConfig.f302570f;
        this.f303085g = autoValue_StartupConfig.f302571g;
        this.f303086h = autoValue_StartupConfig.f302572h;
        this.f303087i = Byte.MAX_VALUE;
    }

    /* renamed from: a */
    public final StartupConfig mo97294a() {
        if (this.f303087i == Byte.MAX_VALUE) {
            return new AutoValue_StartupConfig(this.f303080b, this.f303081c, this.f303079a, this.f303082d, this.f303083e, this.f303084f, this.f303085g, this.f303086h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f303087i & 1) == 0) {
            sb.append(" triggeredBy");
        }
        if ((this.f303087i & 2) == 0) {
            sb.append(" hasPromptedForHotwordTraining");
        }
        if ((this.f303087i & 4) == 0) {
            sb.append(" supportSignedOutMode");
        }
        if ((this.f303087i & 8) == 0) {
            sb.append(" supportTryBeforeYouBuy");
        }
        if ((this.f303087i & 16) == 0) {
            sb.append(" valuePropId");
        }
        if ((this.f303087i & 32) == 0) {
            sb.append(" forceRunOnboarding");
        }
        if ((this.f303087i & 64) == 0) {
            sb.append(" forceCheckUdc");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo97295b(boolean z) {
        this.f303086h = z;
        this.f303087i = (byte) (this.f303087i | 64);
    }

    /* renamed from: c */
    public final void mo97296c(boolean z) {
        this.f303085g = z;
        this.f303087i = (byte) (this.f303087i | 32);
    }

    /* renamed from: d */
    public final void mo97297d(boolean z) {
        this.f303081c = z;
        this.f303087i = (byte) (this.f303087i | 2);
    }

    /* renamed from: e */
    public final void mo97298e(Bundle bundle) {
        this.f303079a = bundle;
    }

    /* renamed from: f */
    public final void mo97299f(boolean z) {
        this.f303082d = z;
        this.f303087i = (byte) (this.f303087i | 4);
    }

    /* renamed from: g */
    public final void mo97300g(boolean z) {
        this.f303083e = z;
        this.f303087i = (byte) (this.f303087i | 8);
    }

    /* renamed from: h */
    public final void mo97301h(int i) {
        this.f303080b = i;
        this.f303087i = (byte) (this.f303087i | 1);
    }

    /* renamed from: i */
    public final void mo97302i(int i) {
        this.f303084f = i;
        this.f303087i = (byte) (this.f303087i | 16);
    }
}
