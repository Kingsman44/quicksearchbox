package com.google.android.apps.search.googleapp.discover.fullcoverage;

import android.support.p031v4.app.C0154a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.nav.C47490a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57062ad;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.fullcoverage.d */
/* compiled from: PG */
public final class C134317d implements C45987ay {

    /* renamed from: b */
    private static final C59071e f365857b = C59071e.m91331h();

    /* renamed from: a */
    public final FullCoverageActivity f365858a;

    /* renamed from: c */
    private final C32158h f365859c;

    /* renamed from: d */
    private final C28310af f365860d;

    /* renamed from: e */
    private final C134316c f365861e;

    public C134317d(FullCoverageActivity fullCoverageActivity, C32158h hVar, C28310af afVar, C45989b bVar, C47490a aVar) {
        C69664n.m101061g(hVar, "accountHandler");
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(bVar, "accountController");
        this.f365858a = fullCoverageActivity;
        this.f365859c = hVar;
        this.f365860d = afVar;
        C134316c cVar = (C134316c) aVar.mo51343a(C134316c.f365851d);
        cVar = cVar == null ? C134316c.f365851d : cVar;
        C69664n.m101060f(cVar, "activityParams.get(FullC…Args.getDefaultInstance()");
        this.f365861e = cVar;
        if (cVar.f365855c) {
            fullCoverageActivity.mo1322k().mo1191s(2);
        } else {
            fullCoverageActivity.mo1322k().mo1191s(1);
        }
        hVar.mo37971b(fullCoverageActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C59071e eVar = f365857b;
        C59052c cVar = (C59052c) eVar.mo56224b();
        cVar.mo56379ah(new C59094n(40344));
        cVar.mo56389s("onAccountChanged %s", awVar);
        if ((this.f365861e.f365853a & 1) != 0) {
            C0154a aVar = new C0154a(this.f365858a.f727a.f739a.f744e);
            AccountId accountId = awVar.f120815a.f120816a;
            C57062ad adVar = this.f365861e.f365854b;
            if (adVar == null) {
                adVar = C57062ad.f152328c;
            }
            C134321h hVar = new C134321h();
            C68324h.m98669f(hVar);
            C47247a.m84047b(hVar, accountId);
            C47243l.m84039a(hVar, adVar);
            aVar.mo689v(R.id.googleapp_full_coverage_content, hVar, (String) null);
            aVar.mo505b(false);
            return;
        }
        C59052c cVar2 = (C59052c) eVar.mo56225c();
        cVar2.mo56379ah(new C59094n(40345));
        cVar2.mo56386p("openStoryData is null in fullcoverage");
        this.f365858a.finish();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C69664n.m101061g(th, "reason");
        C59052c cVar = (C59052c) ((C59052c) f365857b.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(40346));
        cVar.mo56386p("Account exception.");
        this.f365858a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C59052c cVar = (C59052c) f365857b.mo56224b();
        cVar.mo56379ah(new C59094n(40347));
        cVar.mo56389s("onActivityAccountReady %s", axVar);
        C28313c a = this.f365860d.f76997b.mo33800a(C28427h.m53115a(119931));
        a.mo33861i(C28439i.f77216b);
        a.mo33859g(C28375ak.m53061c(119932));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        a.mo33810c(this.f365858a);
    }
}
