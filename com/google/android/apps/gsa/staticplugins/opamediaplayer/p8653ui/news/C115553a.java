package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import android.content.Intent;
import android.view.View;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.a */
/* compiled from: PG */
public final /* synthetic */ class C115553a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MediaItemInfoPageRenderer f320533a;

    /* renamed from: b */
    public final /* synthetic */ Intent f320534b;

    public /* synthetic */ C115553a(MediaItemInfoPageRenderer mediaItemInfoPageRenderer, Intent intent) {
        this.f320533a = mediaItemInfoPageRenderer;
        this.f320534b = intent;
    }

    public final void onClick(View view) {
        MediaItemInfoPageRenderer mediaItemInfoPageRenderer = this.f320533a;
        Intent intent = this.f320534b;
        C58976aa aaVar = C58975e.f156826a;
        mediaItemInfoPageRenderer.f320510a.startActivity(intent);
    }
}
