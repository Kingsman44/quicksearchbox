package com.google.android.libraries.web.contrib.favicon.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.p3348b.p3349a.C43238c;
import com.google.android.libraries.web.contrib.favicon.C43542a;
import com.google.android.libraries.web.contrib.favicon.C43543b;
import com.google.android.libraries.web.contrib.favicon.C43546e;
import com.google.android.libraries.web.p3428m.C43948y;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.android.libraries.web.shared.p3441a.C44078b;
import com.google.android.libraries.web.shared.p3441a.C44080d;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.android.libraries.web.shared.p3444d.C44089a;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.common.util.concurrent.C60866ct;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.web.contrib.favicon.internal.c */
/* compiled from: PG */
public final class C43556c implements C44107h, C43238c {

    /* renamed from: a */
    private final Set f113725a;

    /* renamed from: b */
    private final C44080d f113726b;

    /* renamed from: c */
    private final C46778cv f113727c;

    public C43556c(C43948y yVar, C44089a aVar, C43269t tVar, C44078b bVar, C46778cv cvVar) {
        this.f113725a = aVar.mo47063c(tVar.mo46387e(C43546e.class));
        this.f113726b = bVar.mo47044a(C44082a.f114755a, "com.google.android.libraries.web.contrib.favicon.FaviconDataService_WebModel", C43542a.f113702a);
        this.f113727c = cvVar;
        yVar.mo46938e(new C43555b(this));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo44356a() {
    }

    /* renamed from: b */
    public final void mo46319b(String str, Bitmap bitmap) {
        Object obj;
        C44080d dVar = this.f113726b;
        if (bitmap == null) {
            obj = C43542a.f113702a;
        } else {
            obj = new C43543b(bitmap);
        }
        dVar.mo47046b(obj);
        this.f113727c.mo50787a(C60866ct.f164955a, "com.google.android.libraries.web.contrib.favicon.FaviconDataService_DataSource");
        Collection.EL.stream(this.f113725a).forEach(new C43551a(bitmap, Uri.parse(str)));
    }
}
