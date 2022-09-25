package com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter;

import android.support.p031v4.app.C0154a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter.b */
/* compiled from: PG */
final class C127845b implements C45987ay {

    /* renamed from: a */
    final /* synthetic */ C127848c f351877a;

    public C127845b(C127848c cVar) {
        this.f351877a = cVar;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        AccountId accountId = awVar.f120815a.f120816a;
        C127852g gVar = new C127852g();
        C68324h.m98669f(gVar);
        C47247a.m84047b(gVar, accountId);
        gVar.setArguments(this.f351877a.f351888b.getIntent().getExtras());
        C0154a aVar = new C0154a(this.f351877a.f351888b.f727a.f739a.f744e);
        aVar.mo689v(R.id.assistant_learning_center_detailed_page_fragment_container, gVar, "detailedPageFragment");
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C59104x c = C127848c.f351887a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DpActivityPeer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(37619)).mo56386p("Account error");
        this.f351877a.f351888b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
