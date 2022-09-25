package com.google.android.apps.search.podcasts.p10571i;

import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.search.podcasts.p10549a.C139958c;
import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p4757ac.p4758a.C63111j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.i.h */
/* compiled from: PG */
final class C140413h implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C60870cx f381398a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f381399b;

    /* renamed from: c */
    final /* synthetic */ C140415j f381400c;

    public C140413h(C60870cx cxVar, C60870cx cxVar2, C140415j jVar) {
        this.f381398a = cxVar;
        this.f381399b = cxVar2;
        this.f381400c = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        PlaybackStateCompat playbackStateCompat;
        C140450al alVar = (C140450al) C60856cj.m92909r(this.f381398a);
        C140787e eVar = (C140787e) C60856cj.m92909r(this.f381399b);
        Integer num = null;
        if (!(eVar == null || (playbackStateCompat = eVar.f382280a) == null)) {
            num = Integer.valueOf(playbackStateCompat.f994a);
        }
        if ((num == null || num.intValue() != 3) && (num == null || num.intValue() != 6)) {
            C63111j jVar = C63111j.f170348p;
            C63111j jVar2 = alVar.f381522h;
            if (jVar2 == null) {
                jVar2 = jVar;
            }
            if (!jVar.equals(jVar2)) {
                C139958c cVar = this.f381400c.f381409d;
                C63111j jVar3 = alVar.f381522h;
                if (jVar3 == null) {
                    jVar3 = C63111j.f170348p;
                }
                C69664n.m101060f(jVar3, "preference.lastPlayedEpisodeData");
                return cVar.mo115361a(jVar3);
            }
        }
        return C60856cj.m92898g();
    }
}
