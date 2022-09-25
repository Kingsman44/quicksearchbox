package com.google.android.apps.search.podcasts.p10561e;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.podcasts.p10561e.p10562a.C140200a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.account.data.p3614c.C46194e;
import com.google.apps.tiktok.account.p3604b.C46064e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4757ac.p4758a.C63109h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.e.l */
/* compiled from: PG */
public final class C140211l implements C140212m {

    /* renamed from: a */
    public final C46194e f380926a;

    /* renamed from: b */
    public final C140200a f380927b;

    /* renamed from: c */
    public final C59071e f380928c = C59071e.m91331h();

    /* renamed from: d */
    private final C46064e f380929d;

    /* renamed from: e */
    private final C46128f f380930e;

    public C140211l(C46064e eVar, Context context, C46128f fVar, C46194e eVar2, C140200a aVar) {
        C69664n.m101061g(eVar, "externalAccountIntents");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(fVar, "gcoreAccountName");
        this.f380929d = eVar;
        this.f380930e = fVar;
        this.f380926a = eVar2;
        this.f380927b = aVar;
    }

    /* renamed from: e */
    private final C47633f m227887e(String str) {
        if (str == null) {
            C47633f g = C47633f.m84733g(this.f380926a.mo50254a());
            C69664n.m101060f(g, "{\n      PropagatedFluent…tIdFetcher.fetch())\n    }");
            return g;
        }
        return C47633f.m84733g(this.f380930e.mo50216c(str)).mo51514f(Throwable.class, new C140203d(this), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo115497a(Context context, AccountId accountId, C140201b bVar) {
        Intent className = new Intent("com.google.android.googlequicksearchbox.PODCASTS_PLAY_EPISODE_IN_BACKGROUND").setClassName(context, "com.google.android.apps.search.podcasts.player.receiver.PlayInBackgroundReceiver_Receiver");
        C140199a aVar = (C140199a) bVar.toBuilder();
        C63109h hVar = bVar.f380909b;
        if (hVar == null) {
            hVar = C63109h.f170342e;
        }
        C69664n.m101060f(hVar, "playEpisodeInBackgroundRequest.playerData");
        C63109h a = C140202c.m227880a(hVar);
        aVar.copyOnWrite();
        C140201b bVar2 = (C140201b) aVar.instance;
        a.getClass();
        bVar2.f380909b = a;
        bVar2.f380908a |= 1;
        Intent putExtra = className.putExtra("play_episode_in_background", ((C140201b) aVar.build()).toByteArray());
        C69664n.m101060f(putExtra, "Intent(PODCASTS_PLAY_EPI… .toByteArray()\n        )");
        return C60922j.m93044g(this.f380929d.mo50182b(putExtra, accountId), C47810es.m84963c(new C140210k(context)), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo115498b(Context context, String str, C63109h hVar, C140201b bVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(hVar, "playerDataToOpen");
        C47633f i = m227887e(str).mo51516i(new C140206g(bVar, this, context), C60826bg.f164896a);
        C140207h hVar2 = new C140207h(hVar, context, this);
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(hVar2), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo115499c(Context context, AccountId accountId, C140201b bVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar, "playEpisodeInBackgroundRequest");
        C60870cx a = mo115497a(context, accountId, bVar);
        C140209j jVar = new C140209j(this);
        C60856cj.m92911t(a, C47810es.m84974n(jVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo115500d(Context context, String str, C140201b bVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(bVar, "playEpisodeInBackgroundRequest");
        C47633f e = m227887e(str);
        C140208i iVar = new C140208i(this, context, bVar);
        C60856cj.m92911t(e.f164926b, C47810es.m84974n(iVar), C60826bg.f164896a);
    }
}
