package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.ak */
/* compiled from: PG */
public final /* synthetic */ class C115623ak implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ ThumbnailView f320748a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f320749b;

    /* renamed from: c */
    public final /* synthetic */ String f320750c;

    public /* synthetic */ C115623ak(ThumbnailView thumbnailView, C60870cx cxVar, String str) {
        this.f320748a = thumbnailView;
        this.f320749b = cxVar;
        this.f320750c = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        ThumbnailView thumbnailView = this.f320748a;
        C60870cx cxVar = this.f320749b;
        String str = this.f320750c;
        Exception exc = (Exception) obj;
        if (thumbnailView.f320710a == cxVar && !cxVar.isCancelled() && !(exc instanceof CancellationException)) {
            thumbnailView.mo102128b(str, C115621ai.m191764a(thumbnailView.getResources(), str));
        }
    }
}
