package com.google.android.libraries.search.video.thirdparty;

import android.view.accessibility.CaptioningManager;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.p174ui.C3638b;
import androidx.media3.p174ui.SubtitleView;

/* renamed from: com.google.android.libraries.search.video.thirdparty.w */
/* compiled from: PG */
final class C41622w extends CaptioningManager.CaptioningChangeListener {

    /* renamed from: a */
    final /* synthetic */ C41623x f108792a;

    public C41622w(C41623x xVar) {
        this.f108792a = xVar;
    }

    public final void onFontScaleChanged(float f) {
        C41623x.m72977m(this.f108792a.f108802g, f);
    }

    public final void onUserStyleChanged(CaptioningManager.CaptionStyle captionStyle) {
        SubtitleView subtitleView = this.f108792a.f108802g;
        int i = C2612ak.f7249a;
        subtitleView.f11675b = C3638b.m10522a(captionStyle);
        subtitleView.mo7678a();
    }
}
