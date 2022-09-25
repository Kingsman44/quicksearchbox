package com.google.android.apps.search.assistant.verticals.newsplayer.p10066c;

import com.google.android.libraries.search.p3005i.p3007b.C38424a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65813cq;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.c.a */
/* compiled from: PG */
final class C132409a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C132412d f361406a;

    public C132409a(C132412d dVar) {
        this.f361406a = dVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C132412d.f361408a.mo56226d()).mo56382g(th)).mo56372aa(39634)).mo56386p("Failed to log News Playback Footprints corpus via Geller");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        ((C59052c) ((C59052c) C132412d.f361408a.mo56224b()).mo56372aa(39635)).mo56386p("Logged News Playback Footprints corpus via Geller");
        C132412d dVar = this.f361406a;
        AccountId accountId = dVar.f361414g;
        if (accountId == null) {
            ((C59052c) ((C59052c) C132412d.f361408a.mo56226d()).mo56372aa(39645)).mo56386p("accountId is null");
            return;
        }
        C38424a aVar = dVar.f361413f;
        if (aVar == null) {
            ((C59052c) ((C59052c) C132412d.f361408a.mo56226d()).mo56372aa(39644)).mo56386p("gellerBatchRefreshExecutor is null");
            return;
        }
        C60870cx a = aVar.mo41418a(accountId, "assistant", new C58759qy(C65753ak.PLAYBACK), C65813cq.ON_DEMAND);
        C132411c cVar = new C132411c();
        C60856cj.m92911t(a, C47810es.m84974n(cVar), dVar.f361409b);
    }
}
