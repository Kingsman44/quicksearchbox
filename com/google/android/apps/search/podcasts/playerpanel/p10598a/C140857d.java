package com.google.android.apps.search.podcasts.playerpanel.p10598a;

import android.view.View;
import com.google.android.apps.search.podcasts.player.C140789g;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.apps.search.podcasts.playerpanel.C140853a;
import com.google.common.base.C58881cr;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.a.d */
/* compiled from: PG */
final class C140857d implements C58881cr {

    /* renamed from: a */
    final /* synthetic */ C140858e f382503a;

    /* renamed from: b */
    final /* synthetic */ C69648ae f382504b;

    public C140857d(C140858e eVar, C69648ae aeVar) {
        this.f382503a = eVar;
        this.f382504b = aeVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6453a() {
        C140790h hVar = this.f382503a.f382506b;
        C140789g gVar = C140789g.END_OF_TIME;
        Object obj = this.f382504b.f186027a;
        C69664n.m101060f(obj, "rootView");
        Duration ofMinutes = Duration.ofMinutes((long) ((Number) C140859f.m228764a((View) obj).f383575c.mo115955a()).intValue());
        C69664n.m101060f(ofMinutes, "ofMinutes(rootView.getSl…w().value.get().toLong())");
        hVar.mo115895q(gVar, ofMinutes);
        return new C140853a();
    }
}
