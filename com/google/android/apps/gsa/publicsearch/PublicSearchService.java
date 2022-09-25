package com.google.android.apps.gsa.publicsearch;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;

/* compiled from: PG */
public class PublicSearchService extends C84202b {

    /* renamed from: a */
    public static final C59071e f229188a = C59071e.m91332i("com.google.android.apps.gsa.publicsearch.PublicSearchService");

    /* renamed from: b */
    static final C58485gu f229189b = C58485gu.m89848p("LENS_SERVICE_SESSION", "LENS_BACKGROUND_SERVICE_SESSION", "opa_ambient_mode");

    /* renamed from: c */
    public C22871g f229190c;

    /* renamed from: d */
    public C87677ae f229191d;

    /* renamed from: e */
    private C84213m f229192e;

    public final IBinder onBind(Intent intent) {
        return new C84216o(this.f229191d, this.f229190c, this.f229192e);
    }

    public final void onCreate() {
        C74507e.m120466b(14);
        super.onCreate();
        this.f229192e = new C84213m(getApplicationContext());
    }

    public final boolean onUnbind(Intent intent) {
        return false;
    }
}
