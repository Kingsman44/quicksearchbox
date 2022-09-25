package com.google.android.apps.gsa.search.shared.service.p6940d;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C87678af;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.apps.gsa.shared.util.C91070p;
import com.google.android.apps.gsa.shared.util.p7159c.C90886at;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.search.shared.service.d.e */
/* compiled from: PG */
public final class C88483e {

    /* renamed from: a */
    public static final C59071e f239194a = C59071e.m91332i("com.google.android.apps.gsa.search.shared.service.d.e");

    /* renamed from: b */
    private final C90929bz f239195b;

    /* renamed from: c */
    private final C87677ae f239196c;

    public C88483e(C90929bz bzVar, C87677ae aeVar) {
        this.f239195b = bzVar;
        this.f239196c = aeVar;
    }

    /* renamed from: a */
    public static PendingIntent m142827a(Context context, String str, C88431bb bbVar, int i) {
        return PendingIntent.getService(context, 0, new Intent("com.google.android.search.core.action.ACTION_START_SESSION").setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.search.core.service.SearchService").setData(new Uri.Builder().scheme("searchservice").path("/session").appendQueryParameter("sessionType", str).appendQueryParameter("sessionContext", Base64.encodeToString(bbVar.toByteArray(), 11)).build()), 1140850688 | i);
    }

    /* renamed from: c */
    public static void m142828c(Context context, ClientEventData clientEventData) {
        C91070p.m148777b(context, new Intent("com.google.android.search.core.action.ACTION_PROCESS_GENERIC_CLIENT_EVENT").setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.search.core.service.SearchService").putExtra("com.google.android.search.core.extra.EXTRA_GENERIC_CLIENT_EVENT", clientEventData));
    }

    /* renamed from: e */
    private final C60870cx m142829e(C87682aj ajVar, SettableFuture settableFuture, ClientConfig clientConfig, ClientEventData clientEventData, long j) {
        C88486g gVar = new C88486g(clientConfig);
        gVar.f239199a |= 562949953421312L;
        C87673aa a = this.f239196c.mo81958a(ajVar, (C90757ba) null, new ClientConfig(gVar));
        a.f236998n = true;
        this.f239195b.mo85151p(new C88481c(a, clientEventData));
        C60870cx a2 = C90886at.m148484a(settableFuture, j, this.f239195b);
        this.f239195b.mo85147l(a2, new C88482d(clientEventData, a, settableFuture));
        return a2;
    }

    /* renamed from: f */
    private static boolean m142830f(ClientConfig clientConfig) {
        return !C87678af.f237028d.contains(clientConfig.f236953f);
    }

    /* renamed from: b */
    public final C60870cx mo82004b(ClientConfig clientConfig, ClientEventData clientEventData, long j) {
        if (m142830f(clientConfig)) {
            C58528ij ijVar = C87678af.f237026b;
            C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
            if (a == null) {
                a = C87739bu.UNKNOWN;
            }
            boolean contains = ijVar.contains(a);
            C87739bu a2 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
            if (a2 == null) {
                a2 = C87739bu.UNKNOWN;
            }
            C58838bb.m90873h(contains, "Client event id %s should be present in SearchServiceContract#BACKGROUND_CLIENT_EVENT_IDS", a2);
        }
        SettableFuture settableFuture = new SettableFuture();
        return m142829e(new C88480b(settableFuture), settableFuture, clientConfig, clientEventData, j);
    }

    /* renamed from: d */
    public final C60870cx mo82005d(ClientConfig clientConfig, ClientEventData clientEventData, C88244um umVar, long j) {
        if (m142830f(clientConfig)) {
            C58528ij ijVar = C87678af.f237026b;
            C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
            if (a == null) {
                a = C87739bu.UNKNOWN;
            }
            boolean contains = ijVar.contains(a);
            C87739bu a2 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
            if (a2 == null) {
                a2 = C87739bu.UNKNOWN;
            }
            C58838bb.m90873h(contains, "Client event id %s should be present in SearchServiceContract#BACKGROUND_CLIENT_EVENT_IDS", a2);
        }
        SettableFuture settableFuture = new SettableFuture();
        return m142829e(new C88479a(umVar, settableFuture), settableFuture, clientConfig, clientEventData, j);
    }
}
