package com.google.android.libraries.lens.view.imageviewer;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.web.contrib.requestblock.C43714a;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.libraries.lens.view.imageviewer.l */
/* compiled from: PG */
public final /* synthetic */ class C26949l implements C43714a {

    /* renamed from: a */
    public final /* synthetic */ ImageViewerRequestObserver f73458a;

    public /* synthetic */ C26949l(ImageViewerRequestObserver imageViewerRequestObserver) {
        this.f73458a = imageViewerRequestObserver;
    }

    /* renamed from: a */
    public final void mo32340a(C43367l lVar) {
        ImageViewerRequestObserver imageViewerRequestObserver = this.f73458a;
        Uri parse = Uri.parse(lVar.f113296b);
        if (TextUtils.equals(C26956s.f73472a.getAuthority(), parse.getAuthority()) && TextUtils.equals(C26956s.f73472a.getPath(), parse.getPath()) && !TextUtils.isEmpty(parse.getQueryParameter("url"))) {
            String queryParameter = parse.getQueryParameter("url");
            queryParameter.getClass();
            parse = Uri.parse(queryParameter);
        }
        C47393f.m84236g(new C26957t(parse.toString()), imageViewerRequestObserver.f73429b);
    }
}
