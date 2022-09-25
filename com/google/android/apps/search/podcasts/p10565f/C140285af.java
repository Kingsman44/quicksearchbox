package com.google.android.apps.search.podcasts.p10565f;

import android.view.View;
import com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao;
import com.google.android.apps.search.podcasts.p10550b.p10555e.C140084z;
import com.google.android.apps.search.podcasts.p10550b.p10556f.C140097al;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai;
import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10573k.p10575b.C140436c;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10590o.C140705af;
import com.google.android.apps.search.podcasts.p10590o.C140706ag;
import com.google.android.apps.search.podcasts.p10590o.C140709b;
import com.google.android.apps.search.podcasts.p10590o.C140727t;
import com.google.android.apps.search.podcasts.p10590o.C140728u;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.p10601r.p10605c.C140967d;
import com.google.android.apps.search.podcasts.p10601r.p10607e.C140978b;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.apps.search.podcasts.player.p10592a.C140770r;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4082j.p4083a.C54394ct;
import com.google.p4017at.p4082j.p4083a.C54397cw;
import com.google.p4017at.p4082j.p4083a.C54455t;
import com.google.p4017at.p4082j.p4083a.C54458w;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.af */
/* compiled from: PG */
public final class C140285af {

    /* renamed from: a */
    public static final C59071e f381117a = C59071e.m91331h();

    /* renamed from: b */
    public final C140790h f381118b;

    /* renamed from: c */
    public final C140133ai f381119c;

    /* renamed from: d */
    public final C140097al f381120d;

    /* renamed from: e */
    public final C46778cv f381121e;

    /* renamed from: f */
    public final C140084z f381122f;

    /* renamed from: g */
    public final C140978b f381123g;

    /* renamed from: h */
    public final C47770dh f381124h;

    /* renamed from: i */
    public final C140022ao f381125i;

    /* renamed from: j */
    public final C140770r f381126j;

    /* renamed from: k */
    public final C140459au f381127k;

    /* renamed from: l */
    public final C140967d f381128l;

    /* renamed from: m */
    public final C140436c f381129m;

    /* renamed from: n */
    private final C140709b f381130n;

    public C140285af(C140790h hVar, C140133ai aiVar, C140097al alVar, C140709b bVar, C46778cv cvVar, C140084z zVar, C140978b bVar2, C47770dh dhVar, C140022ao aoVar, C140770r rVar, C140459au auVar, C140967d dVar, C140436c cVar) {
        C69664n.m101061g(hVar, "podcastAudioPlayer");
        C69664n.m101061g(aiVar, "favoriteManager");
        C69664n.m101061g(alVar, "queueManager");
        C69664n.m101061g(bVar, "reactionManager");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(zVar, "progressManager");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(aoVar, "episodeDownloadManager");
        C69664n.m101061g(auVar, "preferencesManager");
        C69664n.m101061g(cVar, "notificationPermissionRequester");
        this.f381118b = hVar;
        this.f381119c = aiVar;
        this.f381120d = alVar;
        this.f381130n = bVar;
        this.f381121e = cvVar;
        this.f381122f = zVar;
        this.f381123g = bVar2;
        this.f381124h = dhVar;
        this.f381125i = aoVar;
        this.f381126j = rVar;
        this.f381127k = auVar;
        this.f381128l = dVar;
        this.f381129m = cVar;
    }

    /* renamed from: c */
    public static final void m228000c(C140285af afVar, C60870cx cxVar) {
        afVar.f381121e.mo50787a(cxVar, C140192a.f380885a);
        C60826bg bgVar = C60826bg.f164896a;
        C69664n.m101060f(bgVar, "directExecutor()");
        C140989k.m228951i(cxVar, bgVar, new C140320p(afVar));
    }

    /* renamed from: d */
    public static final void m228001d(View view, int i, View.OnClickListener onClickListener) {
        Snackbar p = Snackbar.m79660p(view, i, 0);
        p.mo48353t(R.string.podcasts_snackbar_undo, onClickListener);
        p.mo48343h();
    }

    /* renamed from: a */
    public final void mo115554a(C54455t tVar, C54458w wVar) {
        C140709b bVar = this.f381130n;
        C140727t tVar2 = (C140727t) C140728u.f382156c.createBuilder();
        tVar2.copyOnWrite();
        tVar.getClass();
        ((C140728u) tVar2.instance).f382158a = tVar;
        tVar2.copyOnWrite();
        ((C140728u) tVar2.instance).f382159b = wVar.getNumber();
        bVar.mo115841c((C140728u) tVar2.build(), new C140306b(this));
    }

    /* renamed from: b */
    public final void mo115555b(C54394ct ctVar, C54397cw cwVar) {
        C140709b bVar = this.f381130n;
        C140705af afVar = (C140705af) C140706ag.f382121c.createBuilder();
        afVar.copyOnWrite();
        ctVar.getClass();
        ((C140706ag) afVar.instance).f382123a = ctVar;
        afVar.copyOnWrite();
        ((C140706ag) afVar.instance).f382124b = cwVar.getNumber();
        bVar.mo115842d((C140706ag) afVar.build(), new C140307c(this));
    }
}
