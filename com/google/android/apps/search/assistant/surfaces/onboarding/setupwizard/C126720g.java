package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.support.p031v4.app.C0154a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.setupcompat.p3550b.C45250g;
import com.google.android.setupdesign.p3556e.C45304a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.g */
/* compiled from: PG */
final class C126720g implements C45987ay {

    /* renamed from: a */
    final /* synthetic */ C126721h f348995a;

    public C126720g(C126721h hVar) {
        this.f348995a = hVar;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        AccountId accountId = awVar.f120815a.f120816a;
        C126694ah ahVar = new C126694ah();
        C68324h.m98669f(ahVar);
        C47247a.m84047b(ahVar, accountId);
        C0154a aVar = new C0154a(this.f348995a.f348997b.f727a.f739a.f744e);
        aVar.mo689v(R.id.assistant_suw_fragment_container, ahVar, "root_fragment");
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C126721h.f348996a.mo56225c()).mo56382g(th)).mo56372aa(37105)).mo56386p("Account error.");
        this.f348995a.f348997b.setResult(1);
        C45304a.m80748d(this.f348995a.f348997b);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        int i = true != C45250g.m80607c(this.f348995a.f348997b.getIntent()) ? 120203 : 151221;
        C126721h hVar = this.f348995a;
        C28306ab abVar = hVar.f348998c;
        SuwActivity suwActivity = hVar.f348997b;
        C28313c a = hVar.f348999d.mo33805a(C28427h.m53115a(i));
        a.mo33859g(C28375ak.m53061c(57255));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        int i2 = C28485y.f77298f;
        abVar.mo33801b(suwActivity.mo1322k().mo1177e(16908290), a);
    }
}
