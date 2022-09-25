package com.google.android.apps.search.podcasts.p10571i;

import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.search.podcasts.p10549a.C139958c;
import com.google.android.apps.search.podcasts.p10550b.p10551a.C139997j;
import com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao;
import com.google.android.apps.search.podcasts.p10550b.p10555e.C140084z;
import com.google.android.apps.search.podcasts.p10550b.p10556f.C140097al;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai;
import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10590o.C140709b;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.i.j */
/* compiled from: PG */
public final class C140415j {

    /* renamed from: a */
    public static final C59071e f381406a = C59071e.m91331h();

    /* renamed from: b */
    public final C46778cv f381407b;

    /* renamed from: c */
    public final C140790h f381408c;

    /* renamed from: d */
    public final C139958c f381409d;

    /* renamed from: e */
    public final C139997j f381410e;

    /* renamed from: f */
    private final C140133ai f381411f;

    /* renamed from: g */
    private final C140709b f381412g;

    /* renamed from: h */
    private final C140459au f381413h;

    /* renamed from: i */
    private final C140097al f381414i;

    /* renamed from: j */
    private final C140084z f381415j;

    /* renamed from: k */
    private final C140022ao f381416k;

    public C140415j(C140133ai aiVar, C140709b bVar, C46778cv cvVar, C140459au auVar, C140097al alVar, C140084z zVar, C140790h hVar, C139958c cVar, C140022ao aoVar, C139997j jVar) {
        C69664n.m101061g(aiVar, "favoriteManager");
        C69664n.m101061g(bVar, "reactionManager");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(auVar, "syncablePreferencesManager");
        C69664n.m101061g(alVar, "queueManager");
        C69664n.m101061g(zVar, "progressManager");
        C69664n.m101061g(hVar, "podcastAudioPlayer");
        C69664n.m101061g(aoVar, "episodeDownloadManager");
        C69664n.m101061g(jVar, "entityCache");
        this.f381411f = aiVar;
        this.f381412g = bVar;
        this.f381407b = cvVar;
        this.f381413h = auVar;
        this.f381414i = alVar;
        this.f381415j = zVar;
        this.f381408c = hVar;
        this.f381409d = cVar;
        this.f381416k = aoVar;
        this.f381410e = jVar;
    }

    /* renamed from: b */
    public final void mo115656b() {
        if (!C19559g.m37305d(Thread.currentThread())) {
            C140989k.m228950h(this.f381408c.mo115883e(), new C140407b(this));
        } else if (this.f381408c.mo115879a() == null) {
            mo115658d(false);
        }
    }

    /* renamed from: c */
    public final void mo115657c() {
        C60870cx d = this.f381411f.mo115473d();
        C60826bg bgVar = C60826bg.f164896a;
        C69664n.m101060f(bgVar, "directExecutor()");
        C140989k.m228951i(d, bgVar, C140408c.f381393a);
        C60870cx b = C140989k.m228944b(this.f381415j.mo115435d(), new C140409d(this));
        C60826bg bgVar2 = C60826bg.f164896a;
        C69664n.m101060f(bgVar2, "directExecutor()");
        C140989k.m228951i(b, bgVar2, C140410e.f381395a);
        C60870cx c = this.f381414i.mo115460c();
        C60826bg bgVar3 = C60826bg.f164896a;
        C69664n.m101060f(bgVar3, "directExecutor()");
        C140989k.m228951i(c, bgVar3, C140411f.f381396a);
        C46778cv cvVar = this.f381407b;
        C140459au auVar = this.f381413h;
        auVar.mo115695t();
        cvVar.mo50787a(auVar.mo115676a(), C140192a.f380885a);
        this.f381412g.mo115840b(new C140412g(this));
        C46459k.m82829b(this.f381416k.f380561d.mo50395b(), "Download init failed.", new Object[0]);
    }

    /* renamed from: d */
    public final void mo115658d(boolean z) {
        C60870cx d = this.f381408c.mo115882d();
        C60870cx c = this.f381413h.mo115678c();
        C60870cx e = this.f381408c.mo115883e();
        C140989k.m228950h(C47638k.m84753d(c, e).mo51521b(new C140413h(c, e, this), C60826bg.f164896a), new C140414i(e, z, this, d, c));
    }

    /* renamed from: a */
    public static final void m228122a(C140415j jVar, C140787e eVar) {
        PlaybackStateCompat playbackStateCompat;
        Integer num = null;
        if (!(eVar == null || (playbackStateCompat = eVar.f382280a) == null)) {
            num = Integer.valueOf(playbackStateCompat.f994a);
        }
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 1)) {
            jVar.f381408c.mo115889k(true);
        }
    }
}
