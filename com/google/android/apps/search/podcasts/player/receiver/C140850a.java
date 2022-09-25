package com.google.android.apps.search.podcasts.player.receiver;

import com.google.android.apps.search.podcasts.p10561e.C140201b;
import com.google.android.apps.search.podcasts.p10576l.C140447ai;
import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.player.C140776c;
import com.google.android.apps.search.podcasts.player.C140784d;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.receiver.a */
/* compiled from: PG */
final class C140850a implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C60870cx f382482a;

    /* renamed from: b */
    final /* synthetic */ C140851b f382483b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f382484c;

    /* renamed from: d */
    final /* synthetic */ C140201b f382485d;

    public C140850a(C60870cx cxVar, C140851b bVar, C60870cx cxVar2, C140201b bVar2) {
        this.f382482a = cxVar;
        this.f382483b = bVar;
        this.f382484c = cxVar2;
        this.f382485d = bVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C140447ai aiVar = ((C140450al) C60856cj.m92909r(this.f382482a)).f381521g;
        if (aiVar == null) {
            aiVar = C140447ai.f381502c;
        }
        C69664n.m101060f(aiVar, "getDone(preferencesFuture).playbackPreferences");
        C140790h hVar = this.f382483b.f382486a;
        Object r = C60856cj.m92909r(this.f382484c);
        C69664n.m101060f(r, "getDone(episodeConverterFuture)");
        C140776c.m228582b(hVar, (C140641b) r, new C140784d(aiVar.f381504a, aiVar.f381505b), this.f382485d.f380911d, false, (C140509u) null, 56);
        this.f382483b.f382486a.mo115888j();
        return C60866ct.f164955a;
    }
}
