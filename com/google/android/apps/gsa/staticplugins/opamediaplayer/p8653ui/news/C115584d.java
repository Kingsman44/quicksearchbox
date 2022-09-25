package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import android.app.Activity;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.d */
/* compiled from: PG */
final class C115584d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ MediaItemInfoPageRenderer f320653a;

    public C115584d(MediaItemInfoPageRenderer mediaItemInfoPageRenderer) {
        this.f320653a = mediaItemInfoPageRenderer;
    }

    public final void onClick(View view) {
        MediaItemInfoPageRenderer mediaItemInfoPageRenderer = this.f320653a;
        if (mediaItemInfoPageRenderer.f63126Q.mo28316z() && mediaItemInfoPageRenderer.f320527r.mo56113h()) {
            ((Activity) mediaItemInfoPageRenderer.f320527r.mo56107c()).onBackPressed();
        }
    }
}
