package com.google.android.libraries.assistant.p1363c.p1364a.p1368b.p1369a;

import android.content.Context;
import android.support.p031v4.media.session.C0286ac;
import android.support.p031v4.media.session.MediaSessionCompat;
import androidx.media3.common.C2663g;
import androidx.media3.common.C2664h;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.exoplayer.C2758ac;
import androidx.media3.p174ui.C3648l;
import androidx.media3.p174ui.C3649m;
import com.google.android.apps.search.podcasts.player.impl.C140836o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16940c;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16942e;
import com.google.android.p10890h.p10891a.p10892a.C146548c;
import com.google.android.p10890h.p10891a.p10892a.C146555j;
import com.google.apps.tiktok.tracing.contrib.p3702d.C47655p;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.a.b.a.i */
/* compiled from: PG */
public final /* synthetic */ class C16959i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C16972v f49550a;

    /* renamed from: b */
    public final /* synthetic */ C16940c f49551b;

    /* renamed from: c */
    public final /* synthetic */ MediaSessionCompat f49552c;

    /* renamed from: d */
    public final /* synthetic */ C16942e f49553d;

    public /* synthetic */ C16959i(C16972v vVar, C16940c cVar, MediaSessionCompat mediaSessionCompat, C16942e eVar) {
        this.f49550a = vVar;
        this.f49551b = cVar;
        this.f49552c = mediaSessionCompat;
        this.f49553d = eVar;
    }

    public final void run() {
        C16972v vVar = this.f49550a;
        C16940c cVar = this.f49551b;
        MediaSessionCompat mediaSessionCompat = this.f49552c;
        C16942e eVar = this.f49553d;
        C2664h a = C2663g.m7201a(2, 1);
        C2758ac acVar = new C2758ac(vVar.f49580k.mo23116b().getApplicationContext());
        acVar.mo6457d(vVar.f49580k.mo23116b().getMainLooper());
        acVar.mo6455b(a);
        boolean m = vVar.f49580k.mo23127m();
        C2601a.m6832d(!acVar.f7660w);
        acVar.f7658u = m;
        vVar.f49580k.mo23128n();
        Optional empty = Optional.empty();
        Objects.requireNonNull(acVar);
        empty.ifPresent(new C16956f(acVar));
        vVar.f49576g = acVar.mo6454a();
        vVar.f49577h = new C146555j(mediaSessionCompat);
        C146555j jVar = vVar.f49577h;
        jVar.f395785k = true;
        jVar.mo123346e(vVar.f49576g);
        vVar.f49580k.mo23128n();
        Optional empty2 = Optional.empty();
        if (empty2.isPresent()) {
            vVar.f49577h.mo123344c((C146548c[]) empty2.get());
        }
        vVar.f49578i = new C16954d(vVar.f49576g, vVar.f49580k.mo23118d(), vVar.f49572c);
        vVar.f49577h.mo123345d(vVar.f49578i);
        if (!vVar.f49580k.mo23126l()) {
            Context applicationContext = vVar.f49580k.mo23116b().getApplicationContext();
            int a2 = vVar.f49580k.mo23115a();
            String h = vVar.f49580k.mo23122h();
            vVar.f49580k.mo23128n();
            C3649m mVar = (C3649m) Optional.empty().orElse(vVar.f49574e);
            C2601a.m6830b(a2 > 0);
            vVar.f49579j = C3648l.m10561a(applicationContext, a2, h, mVar, 0, R.drawable.exo_notification_rewind, R.drawable.exo_notification_play, R.drawable.exo_notification_pause, R.drawable.exo_notification_fastforward, R.drawable.exo_notification_next, (String) null, (C140836o) null);
            vVar.f49579j.mo7700d(vVar.f49576g);
            vVar.f49579j.mo7699c(((C0286ac) mediaSessionCompat.f982b).f1014b);
            vVar.f49579j.mo7705i();
            vVar.f49579j.mo7702f(true);
            if (vVar.f49580k.mo23120f().isPresent()) {
                vVar.f49579j.mo7701e(((Integer) vVar.f49580k.mo23120f().get()).intValue());
            }
        }
        vVar.f49577h.mo123347f(new C16967q(mediaSessionCompat));
        vVar.f49576g.mo6016w(new C47655p(vVar.f49573d, new C16970t(vVar, eVar)));
        if (cVar.mo23125k()) {
            mediaSessionCompat.mo872d(true);
        }
    }
}
