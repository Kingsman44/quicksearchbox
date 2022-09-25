package com.google.android.apps.search.googleapp.search.suggest.feedback;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133155c;
import com.google.android.apps.search.googleapp.incognito.C136226a;
import com.google.android.apps.search.googleapp.p10122ab.C133148g;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.feedback.p */
/* compiled from: PG */
public final class C138114p implements C45987ay {

    /* renamed from: a */
    public final SuggestionFeedbackActivity f375777a;

    /* renamed from: b */
    public final C133148g f375778b;

    /* renamed from: c */
    public final C138098ao f375779c;

    /* renamed from: d */
    private final C136226a f375780d;

    public C138114p(SuggestionFeedbackActivity suggestionFeedbackActivity, C62921ba baVar, C45989b bVar, C136226a aVar, C133155c cVar, C133148g gVar) {
        C138098ao aoVar;
        this.f375777a = suggestionFeedbackActivity;
        this.f375780d = aVar;
        this.f375778b = gVar;
        try {
            aoVar = (C138098ao) ProtoParsers.m95520c(suggestionFeedbackActivity.getIntent().getExtras(), "feedback_info", C138098ao.f375725f, baVar);
        } catch (C62974ct unused) {
            aoVar = null;
        }
        this.f375779c = aoVar;
        cVar.mo110998a(suggestionFeedbackActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        this.f375780d.mo112853b(awVar);
        C0154a aVar = new C0154a(this.f375777a.f727a.f739a.f744e);
        AccountId accountId = awVar.f120815a.f120816a;
        C138098ao aoVar = this.f375779c;
        aoVar.getClass();
        C138120v vVar = new C138120v();
        C68324h.m98669f(vVar);
        C47247a.m84047b(vVar, accountId);
        C47243l.m84039a(vVar, aoVar);
        aVar.mo689v(R.id.googleapp_suggest_root_view, vVar, (String) null);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        this.f375777a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
