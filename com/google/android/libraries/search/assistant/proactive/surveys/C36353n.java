package com.google.android.libraries.search.assistant.proactive.surveys;

import android.accounts.Account;
import android.app.Activity;
import com.google.android.libraries.surveys.SurveyData;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.proactive.surveys.n */
/* compiled from: PG */
final class C36353n implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Account f94945a;

    /* renamed from: b */
    final /* synthetic */ Activity f94946b;

    /* renamed from: c */
    final /* synthetic */ List f94947c;

    /* renamed from: d */
    final /* synthetic */ C36357r f94948d;

    public C36353n(C36357r rVar, Account account, Activity activity, List list) {
        this.f94948d = rVar;
        this.f94945a = account;
        this.f94946b = activity;
        this.f94947c = list;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C36351l lVar = new C36351l(this, this.f94946b);
        C60856cj.m92903l(C47810es.m84977q(lVar), this.f94948d.f94958d);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            this.f94948d.mo40137e(this.f94945a, this.f94946b, (SurveyData) optional.get(), this.f94947c);
            return;
        }
        C36352m mVar = new C36352m(this, this.f94946b);
        C60856cj.m92903l(C47810es.m84977q(mVar), this.f94948d.f94958d);
    }
}
