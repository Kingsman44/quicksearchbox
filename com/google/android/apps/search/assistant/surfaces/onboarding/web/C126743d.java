package com.google.android.apps.search.assistant.surfaces.onboarding.web;

import android.net.Uri;
import android.support.p031v4.app.C0154a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.C43265p;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.web.d */
/* compiled from: PG */
final class C126743d implements C45987ay {

    /* renamed from: a */
    final /* synthetic */ C126744e f349044a;

    public C126743d(C126744e eVar) {
        this.f349044a = eVar;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        Uri data = this.f349044a.f349046b.getIntent().getData();
        if (data == null) {
            ((C59052c) ((C59052c) C126744e.f349045a.mo56226d()).mo56372aa(37124)).mo56386p("Uri is null.");
            this.f349044a.f349046b.finish();
            return;
        }
        AccountId accountId = awVar.f120815a.f120816a;
        String uri = data.toString();
        C126748i iVar = new C126748i();
        C68324h.m98669f(iVar);
        C47247a.m84047b(iVar, accountId);
        C47243l.m84040b(iVar, uri);
        C43264o a = C43265p.m76349a(awVar.f120815a.f120816a, this.f349044a.f349048d);
        C0154a aVar = new C0154a(this.f349044a.f349046b.f727a.f739a.f744e);
        aVar.mo689v(R.id.assistant_onboarding_web_fragment_container, a, "OnboardingWebFragment");
        aVar.mo509f();
        a.mo17754z().mo46380b(iVar);
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C126744e.f349045a.mo56225c()).mo56382g(th)).mo56372aa(37125)).mo56386p("Account error.");
        this.f349044a.f349046b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28313c a = this.f349044a.f349047c.f76997b.mo33800a(C28427h.m53115a(117721));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        a.mo33810c(this.f349044a.f349046b);
    }
}
