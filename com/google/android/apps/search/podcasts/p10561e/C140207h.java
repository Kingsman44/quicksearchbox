package com.google.android.apps.search.podcasts.p10561e;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.podcasts.p10561e.p10562a.C140200a;
import com.google.android.apps.search.podcasts.searchresults.C141040d;
import com.google.android.apps.search.podcasts.searchresults.C141041e;
import com.google.android.apps.search.podcasts.searchresults.C141044h;
import com.google.android.apps.search.podcasts.searchresults.C141045i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.contrib.p3629c.C46501v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4017at.p4082j.p4083a.C54297aa;
import com.google.p4017at.p4082j.p4083a.C54298ab;
import com.google.p4017at.p4082j.p4083a.C54299ac;
import com.google.p4017at.p4082j.p4083a.C54450o;
import com.google.p4017at.p4082j.p4083a.C54453r;
import com.google.p4017at.p4082j.p4083a.C54461z;
import com.google.p4225bm.p4229c.C56113b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4757ac.p4758a.C63109h;
import com.google.protos.p4757ac.p4758a.C63111j;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.Iterator;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.podcasts.e.h */
/* compiled from: PG */
public final class C140207h implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C63109h f380918a;

    /* renamed from: b */
    final /* synthetic */ Context f380919b;

    /* renamed from: c */
    final /* synthetic */ C140211l f380920c;

    public C140207h(C63109h hVar, Context context, C140211l lVar) {
        this.f380918a = hVar;
        this.f380919b = context;
        this.f380920c = lVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) this.f380920c.f380928c.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(41579));
        cVar.mo56386p("Failed to handle OpenPodcastsShow request.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        List list;
        Object obj2;
        Iterable iterable;
        AccountId accountId = (AccountId) obj;
        C69664n.m101061g(accountId, "accountId");
        if (!C69664n.m101066l(this.f380918a, C63109h.f170342e)) {
            C63109h a = C140202c.m227880a(this.f380918a);
            Context context = this.f380919b;
            String str = null;
            if (a.f170346c.size() > 1) {
                C62971cq cqVar = a.f170346c;
                C69664n.m101060f(cqVar, "playerData.episodeDataList");
                String str2 = ((C63111j) C69540x.m100819A(cqVar)).f170354e;
                C62971cq cqVar2 = a.f170346c;
                C69664n.m101060f(cqVar2, "playerData.episodeDataList");
                Iterator it = cqVar2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (!C69664n.m101066l(((C63111j) obj2).f170354e, str2)) {
                        break;
                    }
                }
                if (obj2 != null) {
                    C140200a aVar = this.f380920c.f380927b;
                    Context context2 = this.f380919b;
                    C63113l lVar = a.f170345b;
                    if (lVar == null) {
                        lVar = C63113l.f170365p;
                    }
                    String str3 = lVar.f170368b;
                    C69664n.m101060f(str3, "repairedData.showData.title");
                    C54461z zVar = (C54461z) C54297aa.f142650b.createBuilder();
                    C54298ab abVar = (C54298ab) C54299ac.f142653c.createBuilder();
                    C54450o oVar = (C54450o) C54453r.f142983d.createBuilder();
                    if (a.f170347d) {
                        C62971cq cqVar3 = a.f170346c;
                        C69664n.m101060f(cqVar3, "data.episodeDataList");
                        iterable = C69540x.m100816w(cqVar3);
                    } else {
                        iterable = a.f170346c;
                        C69664n.m101060f(iterable, "{\n                    da…aList\n                  }");
                    }
                    oVar.copyOnWrite();
                    C54453r rVar = (C54453r) oVar.instance;
                    C62971cq cqVar4 = rVar.f142987c;
                    if (!cqVar4.mo58948c()) {
                        rVar.f142987c = C62942bv.mutableCopy(cqVar4);
                    }
                    C62947c.addAll(iterable, (List) rVar.f142987c);
                    oVar.copyOnWrite();
                    C54453r rVar2 = (C54453r) oVar.instance;
                    rVar2.f142986b = 1;
                    rVar2.f142985a |= 2;
                    abVar.copyOnWrite();
                    C54299ac acVar = (C54299ac) abVar.instance;
                    C54453r rVar3 = (C54453r) oVar.build();
                    rVar3.getClass();
                    acVar.f142656b = rVar3;
                    acVar.f142655a = 1;
                    zVar.copyOnWrite();
                    C54297aa aaVar = (C54297aa) zVar.instance;
                    C54299ac acVar2 = (C54299ac) abVar.build();
                    acVar2.getClass();
                    C62971cq cqVar5 = aaVar.f142652a;
                    if (!cqVar5.mo58948c()) {
                        aaVar.f142652a = C62942bv.mutableCopy(cqVar5);
                    }
                    aaVar.f142652a.add(acVar2);
                    C62942bv build = zVar.build();
                    C69664n.m101060f(build, "newBuilder()\n        .ad…       )\n        .build()");
                    C54297aa aaVar2 = (C54297aa) build;
                    C56113b bVar = C56113b.OPA;
                    C69664n.m101061g(context2, "context");
                    C69664n.m101061g(accountId, "accountId");
                    C69664n.m101061g(str3, "title");
                    C69664n.m101061g(aaVar2, "feed");
                    C69664n.m101061g(bVar, "entryPointType");
                    C46501v a2 = aVar.f380905a.mo50515a(accountId).mo50512a().mo50511a(R.navigation.podcasts_home_tab_nav_graph);
                    C141044h hVar = (C141044h) C141045i.f382906c.createBuilder();
                    C141040d dVar = (C141040d) C141041e.f382899c.createBuilder();
                    dVar.copyOnWrite();
                    aaVar2.getClass();
                    ((C141041e) dVar.instance).f382902b = aaVar2;
                    dVar.copyOnWrite();
                    str3.getClass();
                    ((C141041e) dVar.instance).f382901a = str3;
                    hVar.copyOnWrite();
                    C141045i iVar = (C141045i) hVar.instance;
                    C141041e eVar = (C141041e) dVar.build();
                    eVar.getClass();
                    iVar.f382909b = eVar;
                    iVar.f382908a = 2;
                    a2.mo50514b(R.id.podcasts_search_results_fragment, C46490k.m82868a(hVar.build()).mo50504d());
                    list = a2.mo50513a();
                    C69664n.m101060f(list, "tiktokNavigationFactory\n… )\n      )\n      .intents");
                    C140200a.m227877d(list, bVar);
                    C140200a.m227875b(list, context2);
                    Object[] array = list.toArray(new Intent[0]);
                    C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    context.startActivities((Intent[]) array);
                    return;
                }
            }
            C140200a aVar2 = this.f380920c.f380927b;
            Context context3 = this.f380919b;
            C62971cq cqVar6 = a.f170346c;
            C69664n.m101060f(cqVar6, "playerData.episodeDataList");
            C63111j jVar = (C63111j) C69540x.m100821C(cqVar6);
            if (jVar != null) {
                str = jVar.f170354e;
            }
            if (str == null || C69764m.m101229h(str)) {
                C63113l lVar2 = a.f170345b;
                if (lVar2 == null) {
                    lVar2 = C63113l.f170365p;
                }
                str = lVar2.f170373g;
                C69664n.m101060f(str, "{\n        playerData.showData.feedUrl\n      }");
            }
            list = aVar2.mo115496a(context3, accountId, str, C56113b.OPA);
            Object[] array2 = list.toArray(new Intent[0]);
            C69664n.m101059e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            context.startActivities((Intent[]) array2);
            return;
        }
        Context context4 = this.f380919b;
        context4.startActivity(C140200a.m227876c(context4, C56113b.OPA).addFlags(268468224));
    }
}
