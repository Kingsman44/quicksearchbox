package com.google.android.apps.search.podcasts.playerpanel.p10598a;

import com.google.android.apps.search.podcasts.p10601r.C140997s;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.apps.search.podcasts.player.C140788f;
import com.google.android.apps.search.podcasts.player.C140789g;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.a.m */
/* compiled from: PG */
public final class C140866m {

    /* renamed from: a */
    public final C140861h f382517a;

    /* renamed from: b */
    public final C46855i f382518b;

    /* renamed from: c */
    public final C47400m f382519c;

    /* renamed from: d */
    public final C140790h f382520d;

    /* renamed from: e */
    public final C21370a f382521e;

    /* renamed from: f */
    public final C28306ab f382522f;

    /* renamed from: g */
    public final C140997s f382523g;

    /* renamed from: h */
    public C140787e f382524h;

    /* renamed from: i */
    public final C46852f f382525i = new C140862i(this);

    public C140866m(C140861h hVar, C46855i iVar, C47400m mVar, C140790h hVar2, C21370a aVar, C28306ab abVar, C140997s sVar) {
        C69664n.m101061g(iVar, "localSubscriptionMixin");
        C69664n.m101061g(mVar, "events");
        C69664n.m101061g(hVar2, "podcastAudioPlayer");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(sVar, "veLoggedEvents");
        this.f382517a = hVar;
        this.f382518b = iVar;
        this.f382519c = mVar;
        this.f382520d = hVar2;
        this.f382521e = aVar;
        this.f382522f = abVar;
        this.f382523g = sVar;
    }

    /* renamed from: a */
    public final void mo115954a(Duration duration) {
        C140788f fVar;
        Instant instant;
        C140787e eVar = this.f382524h;
        if (eVar != null && (fVar = eVar.f382284e) != null && (instant = fVar.f382288b) != null) {
            Duration plus = Duration.between(Instant.ofEpochMilli(this.f382521e.mo26870b()), instant).plus(duration);
            if (!plus.isNegative()) {
                C140790h hVar = this.f382520d;
                C140789g gVar = C140789g.END_OF_TIME;
                C69664n.m101060f(plus, "newDuration");
                hVar.mo115895q(gVar, plus);
            }
        }
    }
}
