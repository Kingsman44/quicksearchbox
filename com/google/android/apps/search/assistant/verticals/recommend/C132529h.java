package com.google.android.apps.search.assistant.verticals.recommend;

import android.net.Uri;
import android.support.p031v4.app.C0154a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2476a.p2477a.C32151a;
import com.google.android.libraries.search.p2476a.p2479c.C32209j;
import com.google.android.libraries.search.p2476a.p2479c.p2480a.C32169d;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.C43265p;
import com.google.android.libraries.web.base.WebConfig;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.api.controller.C46054v;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4522b.C58485gu;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.assistant.verticals.recommend.h */
/* compiled from: PG */
public final class C132529h implements C45987ay {

    /* renamed from: a */
    private final C45989b f361690a;

    /* renamed from: b */
    private final RecommendActivity f361691b;

    /* renamed from: c */
    private final WebConfig f361692c;

    public C132529h(RecommendActivity recommendActivity, C45989b bVar, WebConfig webConfig) {
        this.f361691b = recommendActivity;
        this.f361692c = webConfig;
        this.f361690a = bVar;
        C32151a.m59929e(recommendActivity, this, bVar, C58485gu.m89845m());
        recommendActivity.setContentView((int) R.layout.assistant_recommend_activity);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C132533l lVar;
        C43264o oVar = (C43264o) this.f361691b.f727a.f739a.f744e.f634a.mo671c("WebCoordinator");
        if (oVar == null) {
            lVar = null;
        } else {
            lVar = (C132533l) oVar.mo17754z().mo46379a();
        }
        if (lVar == null) {
            C43264o a = C43265p.m76349a(awVar.f120815a.f120816a, this.f361692c);
            C0154a aVar = new C0154a(this.f361691b.f727a.f739a.f744e);
            aVar.mo511h(R.id.assistant_recommend_fragment_container, a, "WebCoordinator", 1);
            aVar.mo509f();
            String stringExtra = this.f361691b.getIntent().getStringExtra("tabindex");
            String stringExtra2 = this.f361691b.getIntent().getStringExtra("filter");
            String stringExtra3 = this.f361691b.getIntent().getStringExtra("entryPoint");
            Uri.Builder path = new Uri.Builder().scheme("https").authority("assistant.google.com").path("/recommend");
            if (stringExtra != null) {
                path.appendQueryParameter("tabindex", stringExtra);
            }
            if (stringExtra2 != null) {
                path.appendQueryParameter("filter", stringExtra2);
            }
            if (stringExtra3 != null) {
                path.appendQueryParameter("entryPoint", stringExtra3);
            }
            AccountId accountId = awVar.f120815a.f120816a;
            String uri = path.build().toString();
            C132533l lVar2 = new C132533l();
            C68324h.m98669f(lVar2);
            C47247a.m84047b(lVar2, accountId);
            C47243l.m84040b(lVar2, uri);
            a.mo17754z().mo46380b(lVar2);
        }
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        if (!(th instanceof C46054v) || !(th.getCause() instanceof C32209j)) {
            this.f361691b.finish();
        } else {
            this.f361690a.mo50081d(C58485gu.m89846n(C32169d.class));
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
