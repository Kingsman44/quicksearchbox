package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import com.google.android.apps.search.googleapp.googleappbrowser.p10262c.C135543c;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.common.util.concurrent.C60826bg;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.n */
/* compiled from: PG */
public final class C135994n {

    /* renamed from: a */
    public final C135543c f370374a;

    /* renamed from: b */
    public final boolean f370375b;

    /* renamed from: c */
    private final C46723bg f370376c;

    /* renamed from: d */
    private final C135973at f370377d;

    public C135994n(C46723bg bgVar, C135543c cVar, boolean z, C135973at atVar) {
        C69664n.m101061g(bgVar, "dataSources");
        C69664n.m101061g(cVar, "firstRunDataAccessor");
        C69664n.m101061g(atVar, "googleAppBrowserSettingsDataService");
        this.f370376c = bgVar;
        this.f370374a = cVar;
        this.f370375b = z;
        this.f370377d = atVar;
    }

    /* renamed from: a */
    public final C46689ag mo112671a() {
        C46719bc bcVar = new C46719bc(this.f370376c, new C135991k(this), "google_app_browser_first_run_disabled_or_complete");
        C46689ag c = this.f370377d.mo112654c();
        C135992l lVar = C135992l.f370373a;
        C69664n.m101060f(C60826bg.f164896a, "directExecutor()");
        return C46723bg.m83265a(bcVar, c, lVar, new C135993m());
    }
}
