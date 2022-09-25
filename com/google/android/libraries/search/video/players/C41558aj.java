package com.google.android.libraries.search.video.players;

import com.google.android.youtube.player.YouTubeEmbedSupportFragment;

/* renamed from: com.google.android.libraries.search.video.players.aj */
/* compiled from: PG */
public final /* synthetic */ class C41558aj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ YouTubeWrapper f108646a;

    /* renamed from: b */
    public final /* synthetic */ C41566ar f108647b;

    public /* synthetic */ C41558aj(YouTubeWrapper youTubeWrapper, C41566ar arVar) {
        this.f108646a = youTubeWrapper;
        this.f108647b = arVar;
    }

    public final void run() {
        YouTubeWrapper youTubeWrapper = this.f108646a;
        C41566ar arVar = this.f108647b;
        YouTubeEmbedSupportFragment youTubeEmbedSupportFragment = youTubeWrapper.f108603k;
        youTubeEmbedSupportFragment.getClass();
        youTubeWrapper.mo44070f(youTubeEmbedSupportFragment, arVar);
        if (((C41568c) arVar).f108674c) {
            youTubeEmbedSupportFragment.mo49570a();
        } else {
            youTubeEmbedSupportFragment.mo49572c();
        }
        youTubeWrapper.f108604l = true;
    }
}
