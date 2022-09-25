package com.google.android.apps.search.googleapp.incognito.p10331h.p10332a;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.apps.search.googleapp.incognito.h.a.d */
/* compiled from: PG */
public final class C136342d {

    /* renamed from: a */
    public final C42876ab f371225a;

    /* renamed from: b */
    public final C60887da f371226b;

    /* renamed from: c */
    private final C46723bg f371227c;

    /* renamed from: d */
    private final C46778cv f371228d;

    public C136342d(C46723bg bgVar, C42876ab abVar, C60887da daVar, C46778cv cvVar) {
        this.f371227c = bgVar;
        this.f371225a = abVar;
        this.f371226b = daVar;
        this.f371228d = cvVar;
    }

    /* renamed from: a */
    public final C46689ag mo112926a() {
        return new C46719bc(this.f371227c, new C136341c(this), "biometrics-setting");
    }

    /* renamed from: b */
    public final C47633f mo112927b(boolean z) {
        C47633f g = C47633f.m84733g(this.f371225a.mo46039a(new C136339a(z), this.f371226b));
        this.f371228d.mo50787a(g, "biometrics-setting");
        return g;
    }
}
