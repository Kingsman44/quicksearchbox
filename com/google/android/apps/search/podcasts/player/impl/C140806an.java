package com.google.android.apps.search.podcasts.player.impl;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0286ac;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.support.p031v4.media.session.PlaybackStateCompat;
import androidx.media3.common.C2646bh;
import androidx.media3.exoplayer.C2759ad;
import androidx.media3.exoplayer.p137a.C2725bn;
import androidx.media3.p174ui.C3648l;
import androidx.media3.p174ui.C3649m;
import androidx.media3.p174ui.C3652p;
import androidx.mediarouter.p175a.C3687aw;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.podcasts.p10550b.p10553c.C140050b;
import com.google.android.apps.search.podcasts.p10550b.p10555e.C140084z;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai;
import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10572j.C140418b;
import com.google.android.apps.search.podcasts.p10572j.C140419c;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10588n.C140676e;
import com.google.android.apps.search.podcasts.p10591p.C140749o;
import com.google.android.apps.search.podcasts.p10591p.C140751q;
import com.google.android.apps.search.podcasts.p10601r.C140985g;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.player.C140784d;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.apps.search.podcasts.player.C140788f;
import com.google.android.apps.search.podcasts.player.C140789g;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.apps.search.podcasts.player.p10592a.C140756d;
import com.google.android.apps.search.podcasts.player.p10592a.C140770r;
import com.google.android.apps.search.podcasts.player.p10593b.C140774b;
import com.google.android.apps.search.podcasts.player.p10593b.C140775c;
import com.google.android.apps.search.podcasts.player.p10593b.p10594a.C140773a;
import com.google.android.apps.search.podcasts.player.p10595c.C140777a;
import com.google.android.apps.search.podcasts.player.p10595c.C140779b;
import com.google.android.apps.search.podcasts.player.p10595c.C140780c;
import com.google.android.apps.search.podcasts.player.p10595c.C140783f;
import com.google.android.gms.cast.framework.C143466m;
import com.google.android.gms.cast.framework.media.C143500bf;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.p10890h.p10891a.p10892a.C146555j;
import com.google.android.p10890h.p10891a.p10893b.C146574e;
import com.google.android.p10890h.p10891a.p10893b.C146577h;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3702d.C47655p;
import com.google.apps.tiktok.tracing.contrib.p3702d.C47656q;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.an */
/* compiled from: PG */
public final class C140806an implements C140790h {

    /* renamed from: A */
    public boolean f382326A;

    /* renamed from: B */
    public C140509u f382327B;

    /* renamed from: C */
    public C140784d f382328C;

    /* renamed from: D */
    public boolean f382329D;

    /* renamed from: E */
    public volatile C60870cx f382330E;

    /* renamed from: F */
    public C140788f f382331F;

    /* renamed from: G */
    public C60870cx f382332G;

    /* renamed from: H */
    public final long f382333H;

    /* renamed from: I */
    public boolean f382334I;

    /* renamed from: J */
    public long f382335J;

    /* renamed from: K */
    public long f382336K;

    /* renamed from: L */
    public final C58974d f382337L;

    /* renamed from: M */
    public final C69613f f382338M;

    /* renamed from: N */
    public C140418b f382339N;

    /* renamed from: O */
    private final C46778cv f382340O;

    /* renamed from: P */
    private final C69464a f382341P;

    /* renamed from: Q */
    private final C140823bd f382342Q;

    /* renamed from: R */
    private final C68214a f382343R;

    /* renamed from: S */
    private final C140783f f382344S;

    /* renamed from: T */
    private final C47656q f382345T;

    /* renamed from: U */
    private final C140817ay f382346U;

    /* renamed from: V */
    private final C140811as f382347V;

    /* renamed from: W */
    private final boolean f382348W;

    /* renamed from: X */
    private final C140819b f382349X;

    /* renamed from: Y */
    private final boolean f382350Y;

    /* renamed from: Z */
    private final C140837p f382351Z = new C140837p(this);

    /* renamed from: a */
    public final C140749o f382352a;

    /* renamed from: aa */
    private final C140814av f382353aa;

    /* renamed from: ab */
    private C146577h f382354ab;

    /* renamed from: ac */
    private final int f382355ac;

    /* renamed from: ad */
    private final long f382356ad;

    /* renamed from: ae */
    private long f382357ae;

    /* renamed from: af */
    private C60870cx f382358af;

    /* renamed from: ag */
    private final C3649m f382359ag;

    /* renamed from: ah */
    private final C69613f f382360ah;

    /* renamed from: ai */
    private C140825d f382361ai;

    /* renamed from: aj */
    private C140816ax f382362aj;

    /* renamed from: ak */
    private C140824c f382363ak;

    /* renamed from: b */
    public final Context f382364b;

    /* renamed from: c */
    public final C47770dh f382365c;

    /* renamed from: d */
    public final Optional f382366d;

    /* renamed from: e */
    public final C140812at f382367e;

    /* renamed from: f */
    public final Optional f382368f;

    /* renamed from: g */
    public final C140775c f382369g;

    /* renamed from: h */
    public final C60888db f382370h;

    /* renamed from: i */
    public final C60888db f382371i;

    /* renamed from: j */
    public final C21370a f382372j;

    /* renamed from: k */
    public final C68214a f382373k;

    /* renamed from: l */
    public final Executor f382374l;

    /* renamed from: m */
    public final C140770r f382375m;

    /* renamed from: n */
    public final C140459au f382376n;

    /* renamed from: o */
    public final C140133ai f382377o;

    /* renamed from: p */
    public final C140419c f382378p;

    /* renamed from: q */
    public final boolean f382379q;

    /* renamed from: r */
    public final C140050b f382380r;

    /* renamed from: s */
    public final boolean f382381s;

    /* renamed from: t */
    public final boolean f382382t;

    /* renamed from: u */
    public MediaSessionCompat f382383u;

    /* renamed from: v */
    public C146555j f382384v;

    /* renamed from: w */
    public C2646bh f382385w;

    /* renamed from: x */
    public C3652p f382386x;

    /* renamed from: y */
    public C140822bc f382387y;

    /* renamed from: z */
    public C140641b f382388z;

    public C140806an(C140749o oVar, Context context, C46778cv cvVar, C47770dh dhVar, C69464a aVar, Optional optional, C140812at atVar, C140823bd bdVar, Optional optional2, C140775c cVar, C60888db dbVar, C60888db dbVar2, C21370a aVar2, C68214a aVar3, C68214a aVar4, Executor executor, C140783f fVar, C140770r rVar, C47656q qVar, C140459au auVar, C140133ai aiVar, C140817ay ayVar, C140811as asVar, C140419c cVar2, boolean z, C140050b bVar, boolean z2, boolean z3, boolean z4, C140819b bVar2, boolean z5) {
        C140749o oVar2 = oVar;
        Context context2 = context;
        C46778cv cvVar2 = cvVar;
        C47770dh dhVar2 = dhVar;
        C69464a aVar5 = aVar;
        Optional optional3 = optional;
        C140812at atVar2 = atVar;
        Optional optional4 = optional2;
        C60888db dbVar3 = dbVar;
        C60888db dbVar4 = dbVar2;
        C21370a aVar6 = aVar2;
        C68214a aVar7 = aVar3;
        C68214a aVar8 = aVar4;
        Executor executor2 = executor;
        C140133ai aiVar2 = aiVar;
        C69664n.m101061g(oVar2, "streamz");
        C69664n.m101061g(context2, "context");
        C69664n.m101061g(cvVar2, "resultPropagator");
        C69664n.m101061g(dhVar2, "traceCreation");
        C69664n.m101061g(aVar5, "exoPlayerProvider");
        C69664n.m101061g(optional3, "castPlayerProvider");
        C69664n.m101061g(atVar2, "podcastForegroundManager");
        C69664n.m101061g(optional4, "castSessionManager");
        C69664n.m101061g(dbVar3, "scheduledExecutorService");
        C69664n.m101061g(dbVar4, "uiThreadScheduledExecutorService");
        C69664n.m101061g(aVar6, "clock");
        C69664n.m101061g(aVar7, "progressManager");
        C69664n.m101061g(aVar8, "episodeDownloadManager");
        C69664n.m101061g(executor2, "uiThreadExecutor");
        C69664n.m101061g(auVar, "preferenceManager");
        C69664n.m101061g(aiVar, "favoriteManager");
        C69664n.m101061g(bVar, "mediaSourceErrorManager");
        C69664n.m101061g(bVar2, "mediaSessionContainer");
        this.f382352a = oVar2;
        this.f382364b = context2;
        this.f382340O = cvVar2;
        this.f382365c = dhVar2;
        this.f382341P = aVar5;
        this.f382366d = optional3;
        this.f382367e = atVar2;
        this.f382342Q = bdVar;
        this.f382368f = optional4;
        this.f382369g = cVar;
        this.f382370h = dbVar3;
        this.f382371i = dbVar4;
        this.f382372j = aVar6;
        this.f382343R = aVar7;
        this.f382373k = aVar8;
        this.f382374l = executor2;
        this.f382344S = fVar;
        this.f382375m = rVar;
        this.f382345T = qVar;
        this.f382376n = auVar;
        this.f382377o = aiVar;
        this.f382346U = ayVar;
        this.f382347V = asVar;
        this.f382378p = cVar2;
        this.f382379q = z;
        this.f382380r = bVar;
        this.f382381s = z2;
        this.f382382t = z3;
        boolean z6 = z4;
        this.f382348W = z6;
        this.f382349X = bVar2;
        this.f382350Y = z5;
        this.f382353aa = new C140814av(this, dbVar4, aVar6, z6);
        this.f382327B = C140509u.AUTOPLAY_DEFAULT;
        this.f382355ac = 1000;
        this.f382356ad = 60000;
        this.f382333H = 10000;
        this.f382337L = C58974d.m91134h("PodcastAudioPlayer");
        this.f382359ag = new C140827f(this);
        this.f382360ah = new C69747m(new C140847z(this));
        this.f382338M = new C69747m(new C140826e(this));
    }

    /* renamed from: F */
    private final C2646bh m228659F() {
        C2646bh bhVar = this.f382385w;
        if (bhVar != null) {
            return new C140805am(bhVar, this);
        }
        return null;
    }

    /* renamed from: A */
    public final void mo115911A() {
        C140985g.m228940a(this.f382374l, new C140797ae(this));
    }

    /* renamed from: B */
    public final void mo115912B() {
        C2759ad adVar;
        MediaSessionCompat mediaSessionCompat;
        this.f382329D = ((Boolean) this.f382338M.mo5768a()).booleanValue() && ((C140773a) ((C68214a) this.f382368f.get()).mo27525b()).mo115865a();
        if (!((Boolean) this.f382338M.mo5768a()).booleanValue() || !((C140773a) ((C68214a) this.f382368f.get()).mo27525b()).mo115865a()) {
            Object b = this.f382341P.mo17428b();
            C69664n.m101060f(b, "exoPlayerProvider.get()");
            C2759ad adVar2 = (C2759ad) b;
            adVar2.mo6466Y(C140807ao.f382389a, true);
            C140783f fVar = this.f382344S;
            C146577h hVar = new C146577h(fVar.f382271a, new C146574e(Collections.emptyMap(), fVar.f382273c, new C140780c(fVar)), C140779b.f382266a, new C140777a(fVar), new C2725bn((byte[]) null));
            adVar2.mo6462M(hVar);
            this.f382354ab = hVar;
            adVar = adVar2;
        } else {
            Object b2 = ((C69464a) this.f382366d.get()).mo17428b();
            C69664n.m101060f(b2, "castPlayerProvider.get().get()");
            adVar = (C2646bh) b2;
        }
        this.f382385w = adVar;
        if (adVar != null) {
            adVar.mo6016w(new C47655p(this.f382345T, new C140798af(this)));
        }
        if (this.f382350Y) {
            mediaSessionCompat = this.f382349X.mo115927a(this.f382364b, this);
        } else {
            mediaSessionCompat = new MediaSessionCompat(this.f382364b, "PodcastPlayer", (ComponentName) null, (PendingIntent) null);
        }
        mediaSessionCompat.mo872d(true);
        mediaSessionCompat.f983c.mo1040h(this.f382351Z, (Handler) null);
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        try {
            if (this.f382364b.getPackageManager().getServiceInfo(new ComponentName(this.f382364b, "com.google.android.apps.search.podcasts.browser.PodcastBrowserService"), 0).isEnabled()) {
                bundle.putString("android.media.session.BROWSE_SERVICE", "com.google.android.apps.search.podcasts.browser.PodcastBrowserService");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        mediaSessionCompat.mo874f(bundle);
        this.f382361ai = new C140825d(this, mediaSessionCompat);
        C140817ay ayVar = this.f382346U;
        C47770dh dhVar = (C47770dh) ayVar.f382429a.mo17428b();
        dhVar.getClass();
        C140676e eVar = (C140676e) ayVar.f382430b.mo17428b();
        eVar.getClass();
        Executor executor = (Executor) ayVar.f382431c.mo17428b();
        executor.getClass();
        this.f382362aj = new C140816ax(dhVar, eVar, executor, this);
        C0320v vVar = mediaSessionCompat.f983c;
        C69664n.m101060f(vVar, "mediaSession.controller");
        this.f382363ak = new C140824c(this, vVar);
        C146555j jVar = new C146555j(mediaSessionCompat);
        jVar.mo123346e(m228659F());
        jVar.mo123347f(this.f382361ai);
        jVar.mo123345d(this.f382362aj);
        C140824c cVar = this.f382363ak;
        if (jVar.f395780f != cVar) {
            jVar.f395780f = cVar;
            jVar.mo123342a();
        }
        C140811as asVar = this.f382347V;
        jVar.mo123344c(new C140809aq(asVar, this), new C140808ap(asVar, this), new C140810ar(asVar, this));
        jVar.f395784j = this.f382353aa;
        jVar.f395786l = true;
        jVar.f395787m = false;
        jVar.f395788n = true;
        C140823bd bdVar = this.f382342Q;
        C47449e eVar2 = (C47449e) bdVar.f382445a.mo17428b();
        eVar2.getClass();
        Executor executor2 = (Executor) bdVar.f382446b.mo17428b();
        executor2.getClass();
        this.f382387y = new C140822bc(eVar2, executor2, jVar);
        this.f382384v = jVar;
        this.f382383u = mediaSessionCompat;
        if (this.f382329D) {
            C3687aw.m10683e(this.f382364b).mo7776l(this.f382383u);
        }
        if (((Boolean) this.f382338M.mo5768a()).booleanValue()) {
            Object a = this.f382360ah.mo5768a();
            C69664n.m101060f(a, "sessionManagerListener.value");
            C140774b bVar = (C140774b) a;
            C69664n.m101061g(bVar, "listener");
            ((C140773a) ((C68214a) this.f382368f.get()).mo27525b()).f382253a.mo118623c(bVar, C143466m.class);
        }
    }

    /* renamed from: C */
    public final void mo115913C(boolean z) {
        C2646bh bhVar;
        C19559g.m37304c();
        C140641b bVar = this.f382388z;
        if (bVar != null && (bhVar = this.f382385w) != null) {
            this.f382357ae = bhVar.mo6004k();
            C140084z zVar = (C140084z) this.f382343R.mo27525b();
            long l = bhVar.mo6005l();
            long j = this.f382357ae;
            boolean z2 = true;
            if (!z && !mo115914D(bhVar.mo5998e())) {
                z2 = false;
            }
            C46459k.m82829b(zVar.mo115434c(bVar, l, j, z2), "Failed to store active episode progress.", new Object[0]);
        }
    }

    /* renamed from: D */
    public final boolean mo115914D(int i) {
        if (this.f382329D) {
            if (i != 1) {
                return false;
            }
            C143466m a = ((C140773a) ((C68214a) this.f382368f.get()).mo27525b()).f382253a.mo118621a();
            C143500bf c = a != null ? a.mo118720c() : null;
            if (c != null && c.mo118775c() == 1 && c.mo118774b() == 1) {
                return true;
            }
            return false;
        } else if (i == 4) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: E */
    public final boolean mo115915E() {
        return this.f382372j.mo26871c() - this.f382335J > this.f382356ad;
    }

    /* renamed from: a */
    public final C140787e mo115879a() {
        C19559g.m37304c();
        MediaSessionCompat mediaSessionCompat = this.f382383u;
        if (mediaSessionCompat == null || this.f382388z == null || this.f382385w == null) {
            return null;
        }
        PlaybackStateCompat f = mediaSessionCompat.f983c.mo1038f();
        MediaSessionCompat mediaSessionCompat2 = this.f382383u;
        C69664n.m101058d(mediaSessionCompat2);
        MediaMetadataCompat d = mediaSessionCompat2.f983c.mo1036d();
        C140641b bVar = this.f382388z;
        C69664n.m101058d(bVar);
        C140784d dVar = this.f382328C;
        C69664n.m101058d(dVar);
        C140788f fVar = this.f382331F;
        C2646bh bhVar = this.f382385w;
        C69664n.m101058d(bhVar);
        return new C140787e(f, d, bVar, dVar, fVar, bhVar.mo6004k(), this.f382327B);
    }

    /* renamed from: b */
    public final C46851e mo115880b() {
        return new C140831j(this);
    }

    /* renamed from: c */
    public final C60870cx mo115881c() {
        ((C58970a) this.f382337L.mo56224b()).mo56386p("getOrCreateMediaSessionToken");
        C140829h hVar = new C140829h(this);
        return C60856cj.m92904m(C47810es.m84978r(hVar), this.f382374l);
    }

    /* renamed from: d */
    public final C60870cx mo115882d() {
        C140833l lVar = new C140833l(this);
        return C60856cj.m92905n(C47810es.m84965e(lVar), this.f382374l);
    }

    /* renamed from: e */
    public final C60870cx mo115883e() {
        C140834m mVar = new C140834m(this);
        return C60856cj.m92904m(C47810es.m84978r(mVar), this.f382374l);
    }

    /* renamed from: f */
    public final C60870cx mo115884f(float f) {
        ((C58970a) this.f382337L.mo56224b()).mo56389s("setPlaybackSpeed %.2f", Float.valueOf(f));
        C140794ab abVar = new C140794ab(this, f);
        return C60856cj.m92903l(C47810es.m84977q(abVar), this.f382374l);
    }

    /* renamed from: g */
    public final C60870cx mo115885g(boolean z) {
        ((C58970a) this.f382337L.mo56224b()).mo56389s("setTrimSlience %s", Boolean.valueOf(z));
        C140795ac acVar = new C140795ac(this, z);
        return C60856cj.m92903l(C47810es.m84977q(acVar), this.f382374l);
    }

    /* renamed from: h */
    public final void mo115886h() {
        ((C58970a) this.f382337L.mo56224b()).mo56386p("fastForward");
        C140985g.m228940a(this.f382374l, new C140828g(this));
    }

    /* renamed from: i */
    public final void mo115887i() {
        ((C58970a) this.f382337L.mo56224b()).mo56386p("pause");
        C140985g.m228940a(this.f382374l, new C140838q(this));
    }

    /* renamed from: j */
    public final void mo115888j() {
        ((C58970a) this.f382337L.mo56224b()).mo56386p("play");
        C140985g.m228940a(this.f382374l, new C140839r(this));
    }

    /* renamed from: k */
    public final void mo115889k(boolean z) {
        if (C69664n.m101066l(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            C47810es.m84977q(new C140840s(this, z)).run();
        } else {
            C140985g.m228940a(this.f382374l, new C140841t(this, z));
        }
    }

    /* renamed from: l */
    public final void mo115890l() {
        ((C58970a) this.f382337L.mo56224b()).mo56386p("rewind");
        C140985g.m228940a(this.f382374l, new C140842u(this));
    }

    /* renamed from: m */
    public final void mo115891m() {
        C140985g.m228940a(this.f382374l, new C140844w(this));
    }

    /* renamed from: n */
    public final void mo115892n(long j) {
        ((C58970a) this.f382337L.mo56224b()).mo56388r("seekTo %d", j);
        C140985g.m228940a(this.f382374l, new C140845x(this, j));
    }

    /* renamed from: o */
    public final void mo115893o(C140641b bVar, C140784d dVar, long j, boolean z, boolean z2, C140509u uVar) {
        C140641b bVar2 = bVar;
        C69664n.m101061g(bVar, "episode");
        C140784d dVar2 = dVar;
        C69664n.m101061g(dVar, "playbackParameters");
        C69664n.m101061g(uVar, "autoplay");
        ((C58970a) this.f382337L.mo56224b()).mo56359L("setEpisode guid: %s, mediaUrl: %s, autoplay: %s", bVar2.f381975b, bVar2.f381978e, uVar.name());
        if (z2) {
            C140749o oVar = this.f382352a;
            C140751q qVar = C140751q.PLAYBACK_REQUESTED;
            C69664n.m101061g(qVar, "eventCode");
            C39141kp kpVar = oVar.f382198a;
            ((C19567d) kpVar.f102833aQ.mo6453a()).mo24822a(1, oVar.mo115852a(), qVar.name());
        }
        C140985g.m228940a(this.f382374l, new C140793aa(this, bVar, z, uVar, dVar, j));
    }

    /* renamed from: p */
    public final void mo115894p(String str, Optional optional) {
        C69664n.m101061g(str, "feedUrl");
        C69664n.m101061g(optional, "guid");
        C140985g.m228940a(this.f382374l, new C140796ad(this, str, optional));
    }

    /* renamed from: q */
    public final void mo115895q(C140789g gVar, Duration duration) {
        C69664n.m101061g(gVar, "type");
        C69664n.m101061g(duration, "duration");
        ((C58970a) this.f382337L.mo56224b()).mo56353F("startSleepTimer: %s, %d", gVar, duration.toMillis());
        C140985g.m228940a(this.f382374l, new C140800ah(this, duration, gVar));
    }

    /* renamed from: r */
    public final void mo115896r() {
        ((C58970a) this.f382337L.mo56224b()).mo56386p("stopSleepTimer");
        C140985g.m228940a(this.f382374l, new C140801ai(this));
    }

    /* renamed from: s */
    public final void mo115897s(boolean z) {
        C140985g.m228940a(this.f382374l, new C140802aj(this, z));
    }

    /* renamed from: t */
    public final void mo115898t() {
        C140989k.m228951i(C140989k.m228945c(mo115883e(), new C140756d(this.f382375m)), this.f382374l, new C140804al(this));
    }

    /* renamed from: u */
    public final String mo115916u() {
        C140641b bVar;
        String str;
        if (this.f382381s && (bVar = this.f382388z) != null) {
            C140646b bVar2 = bVar.f381974a;
            if (bVar2 == null) {
                bVar2 = C140646b.f381993r;
            }
            if (!(bVar2 == null || (str = bVar2.f381999e) == null || str.length() <= 0)) {
                C140641b bVar3 = this.f382388z;
                if (bVar3 == null) {
                    return null;
                }
                C140646b bVar4 = bVar3.f381974a;
                if (bVar4 == null) {
                    bVar4 = C140646b.f381993r;
                }
                if (bVar4 != null) {
                    return bVar4.f381999e;
                }
                return null;
            }
        }
        C140641b bVar5 = this.f382388z;
        if (bVar5 == null) {
            return null;
        }
        C140646b bVar6 = bVar5.f381974a;
        if (bVar6 == null) {
            bVar6 = C140646b.f381993r;
        }
        if (bVar6 != null) {
            return bVar6.f381998d;
        }
        return null;
    }

    /* renamed from: v */
    public final void mo115917v() {
        C0320v vVar;
        PlaybackStateCompat f;
        C2646bh bhVar = this.f382385w;
        if (bhVar != null) {
            MediaSessionCompat mediaSessionCompat = this.f382383u;
            Integer num = null;
            if (!(mediaSessionCompat == null || (vVar = mediaSessionCompat.f983c) == null || (f = vVar.mo1038f()) == null)) {
                num = Integer.valueOf(f.f994a);
            }
            C140418b bVar = this.f382339N;
            if (bVar != null) {
                bVar.mo115659a(C140418b.m228130b(num), bhVar.mo6004k());
            }
            if ((num != null && num.intValue() == 2) || ((num != null && num.intValue() == 6) || (num != null && num.intValue() == 3))) {
                C2646bh bhVar2 = this.f382385w;
                if (bhVar2 != null && Math.abs(bhVar2.mo6004k() - this.f382357ae) >= ((long) this.f382355ac)) {
                    mo115897s(false);
                }
            } else if (!(num == null || num.intValue() != 1 || bhVar.mo5998e() == 1)) {
                mo115897s(false);
            }
            if (bhVar.mo6277aw()) {
                this.f382334I = false;
                C140835n nVar = new C140835n(this);
                this.f382358af = C60856cj.m92902k(C47810es.m84965e(nVar), 1, TimeUnit.MINUTES, this.f382371i);
            }
        }
    }

    /* renamed from: w */
    public final void mo115918w() {
        MediaSessionCompat mediaSessionCompat = this.f382383u;
        MediaSessionCompat.Token token = mediaSessionCompat != null ? ((C0286ac) mediaSessionCompat.f982b).f1014b : null;
        if (this.f382386x == null && token != null) {
            C3652p a = C3648l.m10561a(this.f382364b, C89885b.S3REQUEST_BUILD_S3_CLIENT_INFO_FAILED_VALUE, "com.google.android.apps.gsa.plugins.podcastplayer.channel", this.f382359ag, R.string.podcasts_audio_player_notification_channel, R.drawable.quantum_gm_ic_replay_10_white_24, R.drawable.quantum_ic_play_circle_filled_white_36, R.drawable.quantum_ic_pause_circle_filled_white_36, R.drawable.quantum_gm_ic_forward_30_white_24, R.drawable.quantum_gm_ic_skip_next_white_24, "com.google.android.apps.gsa.plugins.podcastplayer.channel", new C140836o(this));
            this.f382386x = a;
            if (a != null) {
                a.mo7700d(m228659F());
                a.mo7701e(R.drawable.product_logo_podcasts_color_24);
                a.mo7699c(token);
                a.mo7705i();
                a.mo7702f(false);
                if (!a.f11729f) {
                    a.f11729f = true;
                    a.mo7697a();
                }
                if (!a.f11730g) {
                    a.f11730g = true;
                    a.mo7697a();
                }
            }
        }
    }

    /* renamed from: x */
    public final void mo115919x(boolean z) {
        this.f382340O.mo50787a(C60866ct.f164955a, C140192a.f380886b);
        if (!z) {
            this.f382340O.mo50787a(C60866ct.f164955a, C140192a.f380885a);
        }
    }

    /* renamed from: y */
    public final void mo115920y() {
        C2646bh bhVar;
        C19559g.m37304c();
        C2646bh bhVar2 = this.f382385w;
        if (!(bhVar2 == null || bhVar2.mo5998e() != 1 || (bhVar = this.f382385w) == null)) {
            bhVar.mo6017x();
        }
        if (!this.f382334I && mo115915E()) {
            this.f382334I = true;
            C2646bh bhVar3 = this.f382385w;
            if (bhVar3 != null) {
                bhVar3.mo6261af();
            }
        }
        C2646bh bhVar4 = this.f382385w;
        if (bhVar4 != null) {
            bhVar4.mo6260ae();
        }
    }

    /* renamed from: z */
    public final void mo115921z(boolean z) {
        ((C58970a) this.f382337L.mo56224b()).mo56386p(BuildConfig.BUILD_TYPE);
        C2646bh bhVar = this.f382385w;
        if (bhVar != null) {
            C140418b bVar = this.f382339N;
            if (bVar != null) {
                bVar.mo115659a(3, bhVar.mo6004k());
            }
            this.f382339N = null;
        }
        if (((Boolean) this.f382338M.mo5768a()).booleanValue()) {
            Object a = this.f382360ah.mo5768a();
            C69664n.m101060f(a, "sessionManagerListener.value");
            C140774b bVar2 = (C140774b) a;
            C69664n.m101061g(bVar2, "listener");
            ((C140773a) ((C68214a) this.f382368f.get()).mo27525b()).f382253a.mo118625e(bVar2, C143466m.class);
        }
        this.f382388z = null;
        this.f382327B = C140509u.AUTOPLAY_DEFAULT;
        C140822bc bcVar = this.f382387y;
        if (bcVar != null) {
            bcVar.mo115930c();
        }
        C146555j jVar = this.f382384v;
        if (jVar != null) {
            jVar.mo123346e((C2646bh) null);
        }
        C3652p pVar = this.f382386x;
        if (pVar != null) {
            pVar.mo7700d((C2646bh) null);
        }
        this.f382386x = null;
        C146577h hVar = this.f382354ab;
        if (hVar != null) {
            C2646bh bhVar2 = this.f382385w;
            C69664n.m101059e(bhVar2, "null cannot be cast to non-null type androidx.media3.exoplayer.ExoPlayer");
            ((C2759ad) bhVar2).mo6464R(hVar);
            hVar.mo123371z();
            this.f382354ab = null;
        }
        C2646bh bhVar3 = this.f382385w;
        if (bhVar3 != null) {
            bhVar3.mo6018y();
        }
        this.f382385w = null;
        this.f382362aj = null;
        this.f382363ak = null;
        MediaSessionCompat mediaSessionCompat = this.f382383u;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.f983c.mo1041i(this.f382351Z);
            mediaSessionCompat.mo872d(false);
            if (!this.f382350Y) {
                mediaSessionCompat.mo871c();
            } else if (z) {
                mediaSessionCompat.mo871c();
                C140819b bVar3 = this.f382349X;
                bVar3.f382432a = null;
                bVar3.f382433b = null;
            }
        }
        this.f382383u = null;
        this.f382328C = null;
        C60870cx cxVar = this.f382330E;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
        this.f382330E = null;
        C60870cx cxVar2 = this.f382332G;
        if (cxVar2 != null) {
            cxVar2.cancel(true);
        }
        this.f382332G = null;
        this.f382331F = null;
        C60870cx cxVar3 = this.f382358af;
        if (cxVar3 != null) {
            cxVar3.cancel(true);
        }
        this.f382358af = null;
        this.f382334I = false;
        mo115919x(false);
    }
}
