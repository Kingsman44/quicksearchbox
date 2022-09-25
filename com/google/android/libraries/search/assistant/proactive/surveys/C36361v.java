package com.google.android.libraries.search.assistant.proactive.surveys;

import android.support.p031v4.app.C0154a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.search.assistant.proactive.surveys.v */
/* compiled from: PG */
final class C36361v implements C45987ay {

    /* renamed from: a */
    C36345f f94960a;

    /* renamed from: b */
    private final SurveyDialogParentActivity f94961b;

    public C36361v(SurveyDialogParentActivity surveyDialogParentActivity) {
        this.f94961b = surveyDialogParentActivity;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (awVar.f120815a.f120816a == null) {
            this.f94961b.finish();
            return;
        }
        C0154a aVar = new C0154a(this.f94961b.f727a.f739a.f744e);
        AccountId accountId = awVar.f120815a.f120816a;
        C36345f fVar = this.f94960a;
        C36340b bVar = new C36340b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        C47243l.m84039a(bVar, fVar);
        aVar.mo689v(R.id.prompt_parent_sheet, bVar, (String) null);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C59104x c = C36362w.f94962a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "NotificationHatsSurv");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(52310)).mo56386p("#onAccountChanged: Could not change account successfully.");
        this.f94961b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
