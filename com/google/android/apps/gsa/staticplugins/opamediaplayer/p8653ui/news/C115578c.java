package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115485b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.c */
/* compiled from: PG */
public final /* synthetic */ class C115578c implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ MediaItemInfoPageRenderer f320608a;

    public /* synthetic */ C115578c(MediaItemInfoPageRenderer mediaItemInfoPageRenderer) {
        this.f320608a = mediaItemInfoPageRenderer;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        MediaItemInfoPageRenderer mediaItemInfoPageRenderer = this.f320608a;
        C115466j jVar = (C115466j) obj;
        C58976aa aaVar = C58975e.f156826a;
        mediaItemInfoPageRenderer.f320529t = C58833ax.m90834k(jVar);
        C58833ax a = C115485b.m191567a(mediaItemInfoPageRenderer.f320528s);
        boolean h = a.mo56113h();
        int i = R.string.omp_media_item_info_page_listen_to_story;
        if (h && ((String) a.mo56107c()).equals(jVar.f320319n) && !jVar.f320309d) {
            i = R.string.omp_pause;
        }
        mediaItemInfoPageRenderer.f320523n.setContentDescription(mediaItemInfoPageRenderer.f320510a.getResources().getString(i));
        mediaItemInfoPageRenderer.f320519j.setText(i);
    }
}
