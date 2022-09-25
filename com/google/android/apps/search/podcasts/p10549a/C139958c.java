package com.google.android.apps.search.podcasts.p10549a;

import com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao;
import com.google.android.apps.search.podcasts.p10550b.p10555e.C140084z;
import com.google.android.apps.search.podcasts.p10550b.p10556f.C140097al;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10590o.C140709b;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4757ac.p4758a.C63111j;
import dagger.C68214a;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.a.c */
/* compiled from: PG */
public final class C139958c {

    /* renamed from: a */
    public final C140022ao f380430a;

    /* renamed from: b */
    private final C140097al f380431b;

    /* renamed from: c */
    private final C140133ai f380432c;

    /* renamed from: d */
    private final C68214a f380433d;

    /* renamed from: e */
    private final C140084z f380434e;

    /* renamed from: f */
    private final C140709b f380435f;

    /* renamed from: g */
    private final C140459au f380436g;

    public C139958c(C140097al alVar, C140133ai aiVar, C68214a aVar, C140084z zVar, C140709b bVar, C140022ao aoVar, C140459au auVar) {
        C69664n.m101061g(alVar, "queueManager");
        C69664n.m101061g(aiVar, "favoriteManager");
        C69664n.m101061g(aVar, "podcastAudioPlayer");
        C69664n.m101061g(zVar, "progressManager");
        C69664n.m101061g(bVar, "reactionManager");
        C69664n.m101061g(aoVar, "episodeDownloadManager");
        C69664n.m101061g(auVar, "preferencesManager");
        this.f380431b = alVar;
        this.f380432c = aiVar;
        this.f380433d = aVar;
        this.f380434e = zVar;
        this.f380435f = bVar;
        this.f380430a = aoVar;
        this.f380436g = auVar;
    }

    /* renamed from: a */
    public final C60870cx mo115361a(C63111j jVar) {
        C69664n.m101061g(jVar, "episodeAndShowMetadata");
        return C140989k.m228944b(mo115362b(C69540x.m100944b(jVar)), C139956a.f380421a);
    }

    /* renamed from: b */
    public final C60870cx mo115362b(List list) {
        C69664n.m101061g(list, "episodeAndShowMetadataList");
        C60870cx b = this.f380431b.f380724d.mo50395b();
        C60870cx c = this.f380432c.mo115472c();
        C60870cx b2 = this.f380434e.mo115433b();
        C60870cx a = this.f380435f.mo115839a();
        C60870cx e = ((C140790h) this.f380433d.mo27525b()).mo115883e();
        C60870cx c2 = this.f380436g.mo115678c();
        return C47638k.m84751b(this.f380430a.f380561d.mo50395b(), b, c, b2, a, e, c2).mo51520a(new C139957b(list, c, a, c2, b, this, e, b2), C60826bg.f164896a);
    }
}
