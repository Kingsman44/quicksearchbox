package com.google.android.apps.search.podcasts.player.p10592a;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.android.apps.search.podcasts.p10550b.p10555e.C140084z;
import com.google.android.apps.search.podcasts.p10550b.p10556f.C140097al;
import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10576l.C140511w;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10588n.C140648a;
import com.google.android.apps.search.podcasts.p10588n.C140659ah;
import com.google.android.apps.search.podcasts.p10588n.C140665an;
import com.google.android.apps.search.podcasts.p10588n.C140676e;
import com.google.android.apps.search.podcasts.p10601r.C140968d;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.apps.search.podcasts.player.C140788f;
import com.google.android.apps.search.podcasts.player.C140789g;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.a.r */
/* compiled from: PG */
public final class C140770r {

    /* renamed from: a */
    public final C140097al f382246a;

    /* renamed from: b */
    public final C140659ah f382247b;

    /* renamed from: c */
    public final C140459au f382248c;

    /* renamed from: d */
    public final C140084z f382249d;

    /* renamed from: e */
    public final C140665an f382250e;

    /* renamed from: f */
    public final C140648a f382251f;

    /* renamed from: g */
    private final C140676e f382252g;

    public C140770r(C140097al alVar, C140659ah ahVar, C140459au auVar, C140084z zVar, C140665an anVar, C140648a aVar, C140676e eVar) {
        C69664n.m101061g(alVar, "queueManager");
        C69664n.m101061g(auVar, "preferenceManager");
        C69664n.m101061g(zVar, "progressManager");
        C69664n.m101061g(eVar, "episodeProvider");
        this.f382246a = alVar;
        this.f382247b = ahVar;
        this.f382248c = auVar;
        this.f382249d = zVar;
        this.f382250e = anVar;
        this.f382251f = aVar;
        this.f382252g = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo115861a(C140787e eVar) {
        return C140989k.m228945c(this.f382247b.mo115816a(), new C140758f(eVar, this));
    }

    /* renamed from: b */
    public final C60870cx mo115862b(C140787e eVar) {
        C97920j a = C140968d.m228923a(eVar.f382282c);
        C140676e eVar2 = this.f382252g;
        String str = a.f273429b;
        C69664n.m101060f(str, "currentlyPlayingEpisodeId.feedUrl");
        String str2 = a.f273431d;
        C69664n.m101060f(str2, "currentlyPlayingEpisodeId.guid");
        return C140989k.m228945c(eVar2.mo115825a(str, str2), new C140766n(this, a));
    }

    /* renamed from: c */
    public final C60870cx mo115863c(C140790h hVar, C140787e eVar, C140450al alVar) {
        C140788f fVar = eVar.f382284e;
        if ((fVar != null ? fVar.f382287a : null) == C140789g.END_OF_EPISODE) {
            hVar.mo115896r();
            return C60856cj.m92900i(new C140753a((C140641b) null, C140509u.AUTOPLAY_DEFAULT));
        }
        C140511w wVar = alVar.f381524j;
        if (wVar == null) {
            wVar = C140511w.f381636b;
        }
        if (wVar.f381638a) {
            return mo115861a(eVar);
        }
        return C60856cj.m92900i(new C140753a((C140641b) null, C140509u.AUTOPLAY_DEFAULT));
    }

    /* renamed from: d */
    public final void mo115864d(C140790h hVar) {
        C60870cx e = hVar.mo115883e();
        hVar.mo115897s(false);
        C46459k.m82829b(C140989k.m228944b(C140989k.m228945c(C140989k.m228945c(e, new C140760h(this)), new C140762j(e, this, hVar)), new C140759g(e, hVar)), "Failed to play the next episode.", new Object[0]);
    }
}
