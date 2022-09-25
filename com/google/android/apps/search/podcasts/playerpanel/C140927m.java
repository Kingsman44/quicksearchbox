package com.google.android.apps.search.podcasts.playerpanel;

import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.search.podcasts.p10549a.C139958c;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10601r.p10603b.C140962c;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.m */
/* compiled from: PG */
public final class C140927m {

    /* renamed from: a */
    public final C140790h f382671a;

    /* renamed from: b */
    public final C140962c f382672b;

    /* renamed from: c */
    public final C140459au f382673c;

    /* renamed from: d */
    public final C139958c f382674d;

    /* renamed from: e */
    public final C46778cv f382675e;

    /* renamed from: f */
    public final C60888db f382676f;

    /* renamed from: g */
    private final C21370a f382677g;

    /* renamed from: h */
    private final AtomicReference f382678h = new AtomicReference((Object) null);

    public C140927m(C140790h hVar, C140962c cVar, C140459au auVar, C139958c cVar2, C21370a aVar, C46778cv cvVar, C60888db dbVar) {
        C69664n.m101061g(hVar, "podcastAudioPlayer");
        C69664n.m101061g(auVar, "preferencesManager");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(dbVar, "lightweightExecutor");
        this.f382671a = hVar;
        this.f382672b = cVar;
        this.f382673c = auVar;
        this.f382674d = cVar2;
        this.f382677g = aVar;
        this.f382675e = cvVar;
        this.f382676f = dbVar;
    }

    /* renamed from: a */
    public final boolean mo116023a(C140787e eVar) {
        PlaybackStateCompat playbackStateCompat;
        if (eVar == null || (playbackStateCompat = eVar.f382280a) == null || playbackStateCompat.f994a != 6) {
            this.f382678h.set((Object) null);
            return false;
        }
        Instant ofEpochMilli = Instant.ofEpochMilli(this.f382677g.mo26870b());
        Instant instant = (Instant) this.f382678h.get();
        if (instant == null) {
            this.f382678h.set(ofEpochMilli.plusMillis(500));
            return false;
        } else if (ofEpochMilli.compareTo(instant) >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
