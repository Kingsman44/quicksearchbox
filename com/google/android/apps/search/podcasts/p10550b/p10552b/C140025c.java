package com.google.android.apps.search.podcasts.p10550b.p10552b;

import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.b.b.c */
/* compiled from: PG */
public final class C140025c {

    /* renamed from: a */
    private final C140022ao f380581a;

    /* renamed from: b */
    private final C140790h f380582b;

    public C140025c(C140022ao aoVar, C140790h hVar) {
        C69664n.m101061g(aoVar, "episodeDownloadManager");
        C69664n.m101061g(hVar, "podcastAudioPlayer");
        this.f380581a = aoVar;
        this.f380582b = hVar;
    }

    /* renamed from: a */
    public final void mo115407a(String str, String str2, Set set) {
        C69664n.m101061g(str, "feedUrl");
        C69664n.m101061g(str2, "clusterId");
        C69664n.m101061g(set, "episodeGuids");
        C140022ao aoVar = this.f380581a;
        C60870cx b = C140989k.m228944b(this.f380582b.mo115883e(), C140024b.f380580a);
        C140011ad adVar = new C140011ad(aoVar, str, str2, set);
        C60856cj.m92911t(b, C47810es.m84974n(adVar), aoVar.f380567j);
    }
}
