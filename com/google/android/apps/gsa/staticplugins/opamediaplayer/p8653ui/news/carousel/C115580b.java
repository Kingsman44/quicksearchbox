package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.carousel;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0656fr;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b.p8642a.C115142a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.libraries.logging.C28285c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.carousel.b */
/* compiled from: PG */
final class C115580b extends C0656fr {

    /* renamed from: a */
    final /* synthetic */ MediaPlayerCarousel f320634a;

    public C115580b(MediaPlayerCarousel mediaPlayerCarousel) {
        this.f320634a = mediaPlayerCarousel;
    }

    /* renamed from: e */
    public final boolean mo3014e(int i, int i2) {
        C0640fb fbVar;
        C0673gh findViewHolderForItemId;
        MediaPlayerCarousel mediaPlayerCarousel = this.f320634a;
        if (mediaPlayerCarousel.f320613d != null && mediaPlayerCarousel.f320612c.mo56113h()) {
            C58833ax a = mediaPlayerCarousel.mo102107a((C115466j) mediaPlayerCarousel.f320612c.mo56107c());
            if (!(!a.mo56113h() || (fbVar = mediaPlayerCarousel.mAdapter) == null || (findViewHolderForItemId = mediaPlayerCarousel.findViewHolderForItemId(fbVar.getItemId(((Integer) a.mo56107c()).intValue()))) == null)) {
                View view = findViewHolderForItemId.itemView;
                C58833ax axVar = mediaPlayerCarousel.f320612c;
                C58976aa aaVar = C58975e.f156826a;
                C60321oe i3 = C28285c.m52882i(view, 22, (Integer) null);
                if (i3 != null) {
                    C115142a.m190819c(i3, axVar, 1393);
                }
            }
        }
        this.f320634a.fling(i, i2);
        return true;
    }
}
