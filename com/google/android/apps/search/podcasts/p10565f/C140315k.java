package com.google.android.apps.search.podcasts.p10565f;

import com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e;
import com.google.android.apps.search.podcasts.player.C140776c;
import com.google.android.apps.search.podcasts.player.C140784d;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.k */
/* compiled from: PG */
final class C140315k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C60870cx f381173a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f381174b;

    /* renamed from: c */
    final /* synthetic */ C140291al f381175c;

    /* renamed from: d */
    final /* synthetic */ C140285af f381176d;

    public C140315k(C60870cx cxVar, C60870cx cxVar2, C140291al alVar, C140285af afVar) {
        this.f381173a = cxVar;
        this.f381174b = cxVar2;
        this.f381175c = alVar;
        this.f381176d = afVar;
    }

    public final void run() {
        long j;
        Object r = C60856cj.m92909r(this.f381173a);
        C69664n.m101060f(r, "getDone(maybeShowGdprDialogFuture)");
        if (!((Boolean) r).booleanValue()) {
            Object r2 = C60856cj.m92909r(this.f381174b);
            C69664n.m101060f(r2, "getDone(playbackParamsFuture)");
            C140784d dVar = (C140784d) r2;
            C140644e eVar = this.f381175c.f381143a.f381984k;
            if (eVar == null) {
                eVar = C140644e.f381988d;
            }
            if (eVar.f381990a >= 1.0f) {
                j = 0;
            } else {
                C140644e eVar2 = this.f381175c.f381143a.f381984k;
                if (eVar2 == null) {
                    eVar2 = C140644e.f381988d;
                }
                j = eVar2.f381992c;
            }
            long j2 = j;
            C140790h hVar = this.f381176d.f381118b;
            C140291al alVar = this.f381175c;
            C140776c.m228582b(hVar, alVar.f381143a, dVar, j2, false, alVar.f381144b, 24);
            this.f381176d.f381118b.mo115888j();
        }
    }
}
