package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.carousel;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.C115570aq;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.carousel.a */
/* compiled from: PG */
final class C115579a extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ MediaPlayerCarousel f320633a;

    public C115579a(MediaPlayerCarousel mediaPlayerCarousel) {
        this.f320633a = mediaPlayerCarousel;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            MediaPlayerCarousel mediaPlayerCarousel = this.f320633a;
            mediaPlayerCarousel.f320614e = true;
            mediaPlayerCarousel.f320615f = false;
            int i2 = mediaPlayerCarousel.f320611b.f320623a;
            mediaPlayerCarousel.f320616g = i2;
            C115570aq aqVar = mediaPlayerCarousel.f320618i;
            if (aqVar != null) {
                aqVar.f320552a.f320565d.mo101877h(i2);
            }
        } else if (i == 1) {
            MediaPlayerCarousel mediaPlayerCarousel2 = this.f320633a;
            mediaPlayerCarousel2.f320615f = true;
            mediaPlayerCarousel2.f320614e = false;
        }
    }
}
