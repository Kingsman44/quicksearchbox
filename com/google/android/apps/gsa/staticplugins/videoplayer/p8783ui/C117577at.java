package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import android.view.ViewGroup;
import com.google.android.youtube.player.C45511g;
import com.google.android.youtube.player.YouTubeEmbedSupportFragment;
import com.google.android.youtube.player.p3561b.C45448ag;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.at */
/* compiled from: PG */
final class C117577at implements C45511g {

    /* renamed from: a */
    final /* synthetic */ C117578au f326359a;

    public C117577at(C117578au auVar) {
        this.f326359a = auVar;
    }

    /* renamed from: m */
    public final void mo44073m(YouTubeEmbedSupportFragment youTubeEmbedSupportFragment, C45448ag agVar) {
        this.f326359a.mo103385g();
        ViewGroup.LayoutParams layoutParams = this.f326359a.f326378p.getLayoutParams();
        layoutParams.height = -2;
        this.f326359a.f326378p.setLayoutParams(layoutParams);
        if (this.f326359a.f326365c.getResources().getConfiguration().orientation == 2) {
            youTubeEmbedSupportFragment.mo49576g(true);
        } else {
            youTubeEmbedSupportFragment.mo49576g(false);
        }
        youTubeEmbedSupportFragment.mo49582m(this);
    }
}
