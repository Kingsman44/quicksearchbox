package com.google.android.libraries.search.video.players;

import com.google.android.youtube.player.YouTubeEmbedSupportFragment;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.video.players.ao */
/* compiled from: PG */
public final /* synthetic */ class C41563ao implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C41564ap f108655a;

    /* renamed from: b */
    public final /* synthetic */ C41566ar f108656b;

    /* renamed from: c */
    public final /* synthetic */ Duration f108657c;

    public /* synthetic */ C41563ao(C41564ap apVar, C41566ar arVar, Duration duration) {
        this.f108655a = apVar;
        this.f108656b = arVar;
        this.f108657c = duration;
    }

    public final void run() {
        C41564ap apVar = this.f108655a;
        C41566ar arVar = this.f108656b;
        Duration duration = this.f108657c;
        YouTubeEmbedSupportFragment youTubeEmbedSupportFragment = apVar.f108660c.f108603k;
        youTubeEmbedSupportFragment.getClass();
        youTubeEmbedSupportFragment.mo49584o(String.format("https://www.youtube.com/embed/%s?t=%s", new Object[]{((C41568c) arVar).f108672a, Long.valueOf(duration.getSeconds())}));
        YouTubeEmbedSupportFragment youTubeEmbedSupportFragment2 = apVar.f108660c.f108603k;
        youTubeEmbedSupportFragment2.getClass();
        youTubeEmbedSupportFragment2.mo49572c();
    }
}
