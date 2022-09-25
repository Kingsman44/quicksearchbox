package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.assistant.verticals.newsplayer.p10068e.C132416a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.android.material.p3505b.C44534d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.hilt.android.internal.managers.C68324h;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.i */
/* compiled from: PG */
public final class C132491i implements C45987ay {

    /* renamed from: c */
    private static final C59071e f361625c = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.newsplayer.ui.i");

    /* renamed from: a */
    public final NewsPlayerActivity f361626a;

    /* renamed from: b */
    public final C132416a f361627b;

    public C132491i(NewsPlayerActivity newsPlayerActivity, C45989b bVar, C32158h hVar, C132416a aVar, C69464a aVar2) {
        this.f361626a = newsPlayerActivity;
        this.f361627b = aVar;
        if (newsPlayerActivity.getResources().getBoolean(R.bool.assistant_news_player_should_lock_portrait_orientation)) {
            try {
                newsPlayerActivity.setRequestedOrientation(1);
            } catch (IllegalStateException e) {
                ((C59052c) ((C59052c) ((C59052c) f361625c.mo56226d()).mo56382g(e)).mo56372aa(39670)).mo56386p("safeSetRequestedOrientation: Unable to setRequestedOrientation.");
            }
        }
        if (((Boolean) aVar2.mo17428b()).booleanValue()) {
            this.f361626a.setShowWhenLocked(true);
        }
        hVar.mo37971b(newsPlayerActivity, this, bVar);
        C44534d.m78714a(newsPlayerActivity);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        AccountId accountId = awVar.f120815a.f120816a;
        C132495m mVar = new C132495m();
        C68324h.m98669f(mVar);
        C47247a.m84047b(mVar, accountId);
        C0154a aVar = new C0154a(this.f361626a.f727a.f739a.f744e);
        aVar.mo689v(16908290, mVar, (String) null);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        this.f361626a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
