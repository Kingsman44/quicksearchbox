package com.google.android.apps.search.assistant.verticals.newsplayer.media;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p031v4.media.C0329x;
import android.support.p031v4.media.session.C0286ac;
import android.support.p031v4.media.session.C0298ao;
import android.support.p031v4.media.session.C0324z;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.support.p031v4.media.session.PlaybackStateCompat;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import androidx.core.app.C1793aj;
import androidx.core.app.C1800aq;
import androidx.core.app.C1831r;
import androidx.core.app.C1832s;
import androidx.core.app.C1839z;
import androidx.media.p130a.C2402b;
import com.bumptech.glide.C6007z;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.verticals.newsplayer.p10065b.C132408a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.media.C47449e;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.media.e */
/* compiled from: PG */
public final class C132450e implements C132448c {

    /* renamed from: a */
    public static final C59071e f361497a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.newsplayer.media.e");

    /* renamed from: b */
    public final C0329x f361498b = new C0329x();

    /* renamed from: c */
    private final Context f361499c;

    /* renamed from: d */
    private final C1832s f361500d;

    /* renamed from: e */
    private final C1832s f361501e;

    /* renamed from: f */
    private final C1832s f361502f;

    /* renamed from: g */
    private final C1832s f361503g;

    /* renamed from: h */
    private final C1832s f361504h;

    /* renamed from: i */
    private final C1832s f361505i;

    /* renamed from: j */
    private final PlaybackStateCompat.CustomAction f361506j;

    /* renamed from: k */
    private final PlaybackStateCompat.CustomAction f361507k;

    /* renamed from: l */
    private final PlaybackStateCompat.CustomAction f361508l;

    /* renamed from: m */
    private final C47449e f361509m;

    /* renamed from: n */
    private final MediaSessionCompat f361510n;

    /* renamed from: o */
    private final C0298ao f361511o = new C0298ao();

    /* renamed from: p */
    private final C1839z f361512p;

    /* renamed from: q */
    private final C46428ao f361513q;

    /* renamed from: r */
    private final C2402b f361514r;

    /* renamed from: s */
    private final C132446a f361515s;

    public C132450e(Context context, C132447b bVar, C47449e eVar, C46428ao aoVar) {
        this.f361499c = context;
        this.f361509m = eVar;
        this.f361513q = aoVar;
        MediaSessionCompat mediaSessionCompat = bVar.f361494a;
        this.f361510n = mediaSessionCompat;
        C2402b bVar2 = new C2402b();
        bVar2.f6643b = ((C0286ac) mediaSessionCompat.f982b).f1014b;
        this.f361514r = bVar2;
        mediaSessionCompat.mo872d(false);
        NotificationChannel notificationChannel = new NotificationChannel("com.google.android.apps.gsa.plugins.podcastplayer.channel", "Audio Playback", 2);
        context.getClass();
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        Intent a = C132408a.m215227a(context);
        C1839z zVar = new C1839z(context, "com.google.android.apps.gsa.plugins.podcastplayer.channel");
        zVar.f5679J.icon = R.drawable.quantum_gm_ic_newsmode_vd_theme_24;
        zVar.mo5022k(bVar2);
        zVar.f5687g = C147798a.m240895a(context, 0, a, 0);
        this.f361512p = zVar;
        this.f361515s = bVar.f361495b;
        this.f361500d = m215351f(R.drawable.quantum_gm_ic_play_arrow_vd_theme_24, "com.google.android.apps.search.assistant.verticals.newsplayer.PLAY");
        this.f361501e = m215351f(R.drawable.quantum_gm_ic_pause_vd_theme_24, "com.google.android.apps.search.assistant.verticals.newsplayer.PAUSE");
        this.f361502f = m215351f(R.drawable.quantum_gm_ic_skip_next_vd_theme_24, "com.google.android.apps.search.assistant.verticals.newsplayer.SKIP_TO_NEXT");
        this.f361503g = m215351f(R.drawable.quantum_gm_ic_skip_previous_vd_theme_24, "com.google.android.apps.search.assistant.verticals.newsplayer.SKIP_TO_PREVIOUS");
        this.f361504h = m215351f(R.drawable.quantum_gm_ic_forward_10_vd_theme_24, "com.google.android.apps.search.assistant.verticals.newsplayer.SEEK_FORWARD");
        this.f361505i = m215351f(R.drawable.quantum_gm_ic_replay_10_vd_theme_24, "com.google.android.apps.search.assistant.verticals.newsplayer.SEEK_BACKWARD");
        String string = context.getResources().getString(R.string.assistant_news_player_replay_button_descriptor);
        if (TextUtils.isEmpty("com.google.android.apps.search.assistant.verticals.newsplayer.SEEK_BACKWARD")) {
            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
        } else if (!TextUtils.isEmpty(string)) {
            this.f361507k = new PlaybackStateCompat.CustomAction("com.google.android.apps.search.assistant.verticals.newsplayer.SEEK_BACKWARD", string, R.drawable.quantum_gm_ic_replay_10_vd_theme_24, (Bundle) null);
            String string2 = context.getResources().getString(R.string.assistant_news_player_forward_button_descriptor);
            if (TextUtils.isEmpty("com.google.android.apps.search.assistant.verticals.newsplayer.SEEK_FORWARD")) {
                throw new IllegalArgumentException("You must specify an action to build a CustomAction");
            } else if (!TextUtils.isEmpty(string2)) {
                this.f361506j = new PlaybackStateCompat.CustomAction("com.google.android.apps.search.assistant.verticals.newsplayer.SEEK_FORWARD", string2, R.drawable.quantum_gm_ic_forward_10_vd_theme_24, (Bundle) null);
                String string3 = context.getResources().getString(R.string.assistant_news_player_skip_next_button_descriptor);
                if (TextUtils.isEmpty("com.google.android.apps.search.assistant.verticals.newsplayer.SKIP_TO_NEXT")) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                } else if (!TextUtils.isEmpty(string3)) {
                    this.f361508l = new PlaybackStateCompat.CustomAction("com.google.android.apps.search.assistant.verticals.newsplayer.SKIP_TO_NEXT", string3, R.drawable.quantum_gm_ic_skip_next_vd_theme_24, (Bundle) null);
                } else {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
            } else {
                throw new IllegalArgumentException("You must specify a name to build a CustomAction");
            }
        } else {
            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
        }
    }

    /* renamed from: f */
    private final C1832s m215351f(int i, String str) {
        Context context = this.f361499c;
        context.getClass();
        Intent intent = new Intent(context, NewsPlayerNotificationBroadcastReceiver_Receiver.class);
        intent.setAction(str);
        Context context2 = this.f361499c;
        context2.getClass();
        return new C1831r(i, (CharSequence) null, PendingIntent.getBroadcast(context2, 0, C147798a.m240896b(intent, 335544320, 0), 335544320)).mo5008a();
    }

    /* renamed from: a */
    public final void mo110731a() {
        this.f361510n.mo872d(false);
        Context context = this.f361499c;
        context.getClass();
        new C1800aq(context).f5622a.cancel((String) null, C89885b.S3REQUEST_BUILD_S3_CLIENT_INFO_FAILED_VALUE);
    }

    /* renamed from: b */
    public final void mo110732b(C0324z zVar) {
        this.f361510n.mo873e(zVar, this.f361513q);
    }

    /* renamed from: c */
    public final void mo110733c(C52174hz hzVar) {
        C0329x xVar = this.f361498b;
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        xVar.mo1093d("android.media.metadata.DISPLAY_TITLE", woVar.f137998e);
        C0329x xVar2 = this.f361498b;
        C52568wo woVar2 = hzVar.f136897d;
        if (woVar2 == null) {
            woVar2 = C52568wo.f137992v;
        }
        xVar2.mo1093d("android.media.metadata.DISPLAY_SUBTITLE", woVar2.f138000g);
        C0329x xVar3 = this.f361498b;
        C52568wo woVar3 = hzVar.f136897d;
        if (woVar3 == null) {
            woVar3 = C52568wo.f137992v;
        }
        C51012dc dcVar = woVar3.f138004k;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        xVar3.mo1093d("android.media.metadata.DISPLAY_ICON_URI", dcVar.f132817c);
        C0329x xVar4 = this.f361498b;
        C52568wo woVar4 = hzVar.f136897d;
        if (woVar4 == null) {
            woVar4 = C52568wo.f137992v;
        }
        C51012dc dcVar2 = woVar4.f138004k;
        if (dcVar2 == null) {
            dcVar2 = C51012dc.f132813k;
        }
        xVar4.mo1093d("android.media.metadata.ART_URI", dcVar2.f132817c);
        C0329x xVar5 = this.f361498b;
        C52568wo woVar5 = hzVar.f136897d;
        if (woVar5 == null) {
            woVar5 = C52568wo.f137992v;
        }
        xVar5.mo1093d("android.media.metadata.TITLE", woVar5.f137998e);
        C0329x xVar6 = this.f361498b;
        C52568wo woVar6 = hzVar.f136897d;
        if (woVar6 == null) {
            woVar6 = C52568wo.f137992v;
        }
        xVar6.mo1093d("android.media.metadata.ARTIST", woVar6.f138000g);
        this.f361498b.mo1091b("android.media.metadata.ART", Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565));
        this.f361510n.mo875g(this.f361498b.mo1090a());
        this.f361510n.mo872d(true);
        C52568wo woVar7 = hzVar.f136897d;
        if (woVar7 == null) {
            woVar7 = C52568wo.f137992v;
        }
        C51012dc dcVar3 = woVar7.f138004k;
        if (dcVar3 == null) {
            dcVar3 = C51012dc.f132813k;
        }
        if (!dcVar3.f132817c.isEmpty()) {
            C6007z b = this.f361509m.mo51286a().mo11864b();
            C52568wo woVar8 = hzVar.f136897d;
            if (woVar8 == null) {
                woVar8 = C52568wo.f137992v;
            }
            C51012dc dcVar4 = woVar8.f138004k;
            if (dcVar4 == null) {
                dcVar4 = C51012dc.f132813k;
            }
            b.mo12448j(dcVar4.f132817c).mo12439a(new C132449d(this)).mo12453q(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
        }
    }

    /* renamed from: d */
    public final void mo110734d(boolean z, C62910ar arVar, C62910ar arVar2, float f, boolean z2) {
        long j;
        if (this.f361498b.mo1090a().mo816a("android.media.metadata.DURATION") != C62948a.m95453d(arVar2)) {
            this.f361498b.mo1092c("android.media.metadata.DURATION", C62948a.m95453d(arVar2));
            this.f361510n.mo875g(this.f361498b.mo1090a());
        }
        this.f361511o.mo984c(true != z ? 2 : 3, C62948a.m95453d(arVar), f, SystemClock.elapsedRealtime());
        Bundle bundle = new Bundle();
        bundle.putBoolean("isCasting", z2);
        this.f361511o.f1029f = bundle;
        this.f361512p.f5682b.clear();
        this.f361512p.mo5017f(this.f361503g);
        this.f361512p.mo5017f(this.f361505i);
        if (z) {
            this.f361512p.mo5017f(this.f361501e);
            j = 514;
        } else {
            this.f361512p.mo5017f(this.f361500d);
            j = 516;
        }
        if (arVar2.f169860a > 0) {
            j |= 256;
        }
        C0298ao aoVar = this.f361511o;
        aoVar.f1025b = j | 16;
        if (aoVar.mo982a().f1002i.isEmpty()) {
            this.f361511o.mo983b(this.f361507k);
            this.f361511o.mo983b(this.f361506j);
            this.f361511o.mo983b(this.f361508l);
        }
        this.f361512p.mo5017f(this.f361504h);
        this.f361512p.mo5017f(this.f361502f);
        this.f361510n.mo876h(this.f361511o.mo982a());
        this.f361514r.f6642a = new int[]{2, 3, 4};
        Context context = this.f361499c;
        context.getClass();
        C1800aq aqVar = new C1800aq(context);
        if (C1793aj.m4937b(aqVar.f5622a)) {
            C1839z zVar = this.f361512p;
            zVar.getClass();
            aqVar.mo5003b((String) null, C89885b.S3REQUEST_BUILD_S3_CLIENT_INFO_FAILED_VALUE, zVar.mo5013a());
        }
    }

    /* renamed from: e */
    public final C132446a mo110735e() {
        return this.f361515s;
    }
}
