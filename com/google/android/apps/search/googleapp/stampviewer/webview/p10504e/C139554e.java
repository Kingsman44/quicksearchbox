package com.google.android.apps.search.googleapp.stampviewer.webview.p10504e;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.p3353c.p3355b.C43357z;
import com.google.android.libraries.web.shared.p3441a.C44078b;
import com.google.android.libraries.web.shared.p3441a.C44080d;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.common.util.concurrent.C60866ct;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.e.e */
/* compiled from: PG */
public final class C139554e {

    /* renamed from: a */
    public static final C46690ah f379405a = new C46885y("LOADING_STATE_KEY");

    /* renamed from: b */
    public final C44080d f379406b;

    /* renamed from: c */
    private final C46778cv f379407c;

    /* renamed from: d */
    private final C43357z f379408d;

    public C139554e(C43357z zVar, C46778cv cvVar, C44078b bVar) {
        this.f379408d = zVar;
        this.f379407c = cvVar;
        this.f379406b = bVar.mo47044a(C44082a.f114755a, "StampViewer LoadingState", C139551b.f379396f);
    }

    /* renamed from: a */
    public final C139551b mo115053a() {
        return (C139551b) this.f379406b.mo47045a();
    }

    /* renamed from: b */
    public final C46851e mo115054b() {
        this.f379408d.mo46476c(R.id.googleapp_stampviewer_loading_state_data_service_page_load_start_subscription, new C139552c(this));
        return new C139553d(this);
    }

    /* renamed from: c */
    public final void mo115055c() {
        this.f379407c.mo50787a(C60866ct.f164955a, f379405a);
    }
}
