package com.google.android.apps.search.podcasts.p10560d;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.search.podcasts.episode.C140236o;
import com.google.android.apps.search.podcasts.episode.C140237p;
import com.google.android.apps.search.podcasts.episode.C140238q;
import com.google.android.apps.search.podcasts.episode.C140239r;
import com.google.android.apps.search.podcasts.library.showsubscriptions.C140616a;
import com.google.android.apps.search.podcasts.library.showsubscriptions.C140621b;
import com.google.android.apps.search.podcasts.p10561e.p10562a.C140200a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2476a.p2477a.C32151a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.contrib.p3629c.C46501v;
import com.google.apps.tiktok.nav.gateway.C47505k;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4225bm.p4229c.C56113b;
import java.util.Iterator;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.podcasts.d.c */
/* compiled from: PG */
public final class C140196c implements C47506l {

    /* renamed from: a */
    final /* synthetic */ C140197d f380892a;

    /* renamed from: b */
    final /* synthetic */ C56113b f380893b;

    /* renamed from: c */
    final /* synthetic */ Uri f380894c;

    public C140196c(C140197d dVar, C56113b bVar, Uri uri) {
        this.f380892a = dVar;
        this.f380893b = bVar;
        this.f380894c = uri;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo20002a() {
        return 0;
    }

    /* renamed from: b */
    public final /* synthetic */ int mo20003b() {
        return 0;
    }

    /* renamed from: c */
    public final C58833ax mo20004c() {
        return !C69664n.m101066l(this.f380894c.toString(), "https://podcasts.google.com/?ep=10") ? C32151a.m59928d(C58485gu.m89845m()) : C58836b.f156633a;
    }

    /* renamed from: e */
    public final /* synthetic */ GatewayHandler.GatewayDestination mo20006e() {
        return GatewayHandler.GatewayDestination.m84513a((String) null);
    }

    /* renamed from: d */
    public final C60870cx mo20005d(C47505k kVar) {
        GatewayHandler.GatewayDestination gatewayDestination;
        C140197d dVar = this.f380892a;
        if (dVar.f380896b) {
            return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84517e());
        }
        AccountId accountId = kVar.f123336a;
        if (accountId == null) {
            gatewayDestination = GatewayHandler.GatewayDestination.m84514b(C140200a.m227876c(dVar.f380895a, this.f380893b));
        } else {
            Uri uri = this.f380894c;
            C69664n.m101060f(uri, "data");
            C56113b bVar = this.f380893b;
            String g = C58837ba.m90858g(uri.getPath());
            Iterator it = C140195b.f380890a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C69764m.m101234m(g, (String) it.next())) {
                        gatewayDestination = GatewayHandler.GatewayDestination.m84517e();
                        break;
                    }
                } else {
                    String c = C140195b.m227865c(uri);
                    String b = C140195b.m227864b(uri);
                    if (C140195b.m227866d(uri)) {
                        C140200a aVar = dVar.f380897c;
                        Context context = dVar.f380895a;
                        C69664n.m101061g(context, "context");
                        C69664n.m101061g(bVar, "entryPointType");
                        C46501v a = aVar.f380905a.mo50515a(accountId).mo50512a().mo50511a(R.navigation.podcasts_explore_tab_nav_graph);
                        a.mo50514b(R.id.podcasts_explore_fragment, new Bundle());
                        List a2 = a.mo50513a();
                        C69664n.m101060f(a2, "tiktokNavigationFactory\n…_fragment)\n      .intents");
                        C140200a.m227877d(a2, bVar);
                        C140200a.m227875b(a2, context);
                        gatewayDestination = GatewayHandler.GatewayDestination.m84515c(a2);
                    } else if (C140195b.m227867e(uri)) {
                        C140200a aVar2 = dVar.f380897c;
                        Context context2 = dVar.f380895a;
                        C69664n.m101061g(context2, "context");
                        C69664n.m101061g(bVar, "entryPointType");
                        C46501v a3 = aVar2.f380905a.mo50515a(accountId).mo50512a().mo50511a(R.navigation.podcasts_home_tab_nav_graph);
                        C140616a aVar3 = (C140616a) C140621b.f381913c.createBuilder();
                        aVar3.copyOnWrite();
                        ((C140621b) aVar3.instance).f381916b = true;
                        if (c != null && !C69764m.m101229h(c)) {
                            aVar3.copyOnWrite();
                            ((C140621b) aVar3.instance).f381915a = c;
                        }
                        a3.mo50514b(R.id.podcasts_library_show_subscriptions_fragment, C46490k.m82868a(aVar3.build()).mo50504d());
                        List a4 = a3.mo50513a();
                        C69664n.m101060f(a4, "tiktokNavigationFactory\n… )\n      )\n      .intents");
                        C140200a.m227877d(a4, bVar);
                        C140200a.m227875b(a4, context2);
                        gatewayDestination = GatewayHandler.GatewayDestination.m84515c(a4);
                    } else if (c == null || C69764m.m101229h(c)) {
                        gatewayDestination = GatewayHandler.GatewayDestination.m84514b(C140200a.m227876c(dVar.f380895a, bVar));
                    } else if (b == null || C69764m.m101229h(b)) {
                        gatewayDestination = GatewayHandler.GatewayDestination.m84515c(dVar.f380897c.mo115496a(dVar.f380895a, accountId, c, bVar));
                    } else {
                        C140200a aVar4 = dVar.f380897c;
                        Context context3 = dVar.f380895a;
                        C69664n.m101061g(context3, "context");
                        C69664n.m101061g(bVar, "entryPointType");
                        C46501v a5 = aVar4.f380905a.mo50515a(accountId).mo50512a().mo50511a(R.navigation.podcasts_home_tab_nav_graph);
                        C140236o oVar = (C140236o) C140237p.f380980c.createBuilder();
                        C140238q qVar = (C140238q) C140239r.f380984c.createBuilder();
                        qVar.copyOnWrite();
                        ((C140239r) qVar.instance).f380987b = c;
                        qVar.copyOnWrite();
                        ((C140239r) qVar.instance).f380986a = b;
                        oVar.copyOnWrite();
                        C140237p pVar = (C140237p) oVar.instance;
                        C140239r rVar = (C140239r) qVar.build();
                        rVar.getClass();
                        pVar.f380983b = rVar;
                        pVar.f380982a = 1;
                        a5.mo50514b(R.id.podcasts_episode_fragment, C46490k.m82868a(oVar.build()).mo50504d());
                        List a6 = a5.mo50513a();
                        C69664n.m101060f(a6, "tiktokNavigationFactory\n… )\n      )\n      .intents");
                        C140200a.m227877d(a6, bVar);
                        C140200a.m227875b(a6, context3);
                        gatewayDestination = GatewayHandler.GatewayDestination.m84515c(a6);
                    }
                }
            }
        }
        return C60856cj.m92900i(gatewayDestination);
    }
}
