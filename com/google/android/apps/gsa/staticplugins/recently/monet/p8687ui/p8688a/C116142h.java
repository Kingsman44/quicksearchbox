package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.p8688a;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.RecentlyGifView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.h */
/* compiled from: PG */
public final /* synthetic */ class C116142h implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116143i f322061a;

    /* renamed from: b */
    public final /* synthetic */ RecentlyGifView f322062b;

    public /* synthetic */ C116142h(C116143i iVar, RecentlyGifView recentlyGifView) {
        this.f322061a = iVar;
        this.f322062b = recentlyGifView;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116143i iVar = this.f322061a;
        RecentlyGifView recentlyGifView = this.f322062b;
        Drawable drawable = iVar.f322052a.getDrawable(R.drawable.recently_cloud_off_daynight);
        recentlyGifView.setImageDrawable(new InsetDrawable(drawable, drawable.getMinimumWidth()));
        recentlyGifView.setBackgroundColor(R.color.agsa_color_surface);
        ((C59052c) ((C59052c) ((C59052c) C116143i.f322063c.mo56225c()).mo56382g((Exception) obj)).mo56372aa(30908)).mo56386p("Failure loading doodle image.");
    }
}
