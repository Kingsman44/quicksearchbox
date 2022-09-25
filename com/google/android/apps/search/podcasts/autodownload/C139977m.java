package com.google.android.apps.search.podcasts.autodownload;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.google.android.apps.search.podcasts.p10549a.C139958c;
import com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10588n.C140690s;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5124m.p5125a.C65599b;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.autodownload.m */
/* compiled from: PG */
public final class C139977m {

    /* renamed from: a */
    public static final C59071e f380465a = C59071e.m91331h();

    /* renamed from: b */
    public final Executor f380466b;

    /* renamed from: c */
    public final ConnectivityManager f380467c;

    /* renamed from: d */
    public final C140690s f380468d;

    /* renamed from: e */
    public final C21370a f380469e;

    /* renamed from: f */
    public final C139958c f380470f;

    /* renamed from: g */
    public final C140022ao f380471g;

    /* renamed from: h */
    public final C140133ai f380472h;

    /* renamed from: i */
    public final TelephonyManager f380473i;

    /* renamed from: j */
    public final C65599b f380474j;

    /* renamed from: k */
    private final C140459au f380475k;

    public C139977m(Executor executor, ConnectivityManager connectivityManager, C140690s sVar, C21370a aVar, C139958c cVar, C140022ao aoVar, C140133ai aiVar, C140459au auVar, TelephonyManager telephonyManager, C65599b bVar) {
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(aoVar, "episodeDownloadManager");
        C69664n.m101061g(aiVar, "favoriteManager");
        C69664n.m101061g(auVar, "preferencesManager");
        C69664n.m101061g(telephonyManager, "telephonyManager");
        this.f380466b = executor;
        this.f380467c = connectivityManager;
        this.f380468d = sVar;
        this.f380469e = aVar;
        this.f380470f = cVar;
        this.f380471g = aoVar;
        this.f380472h = aiVar;
        this.f380475k = auVar;
        this.f380473i = telephonyManager;
        this.f380474j = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo115372a() {
        C60870cx c = this.f380475k.mo115678c();
        C69664n.m101060f(c, "preferencesManager.preference");
        return C140989k.m228947e(c, this.f380466b, new C139976l(this));
    }
}
