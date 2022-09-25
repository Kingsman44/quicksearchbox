package com.google.android.libraries.search.assistant.proactive.surveys;

import android.app.Activity;
import com.google.android.libraries.surveys.C43026c;
import com.google.android.libraries.surveys.C43028e;
import com.google.android.libraries.surveys.SurveyMetadata;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.assistant.proactive.surveys.q */
/* compiled from: PG */
final class C36356q implements C43028e {

    /* renamed from: a */
    final /* synthetic */ Activity f94952a;

    /* renamed from: b */
    final /* synthetic */ C36357r f94953b;

    public C36356q(C36357r rVar, Activity activity) {
        this.f94953b = rVar;
        this.f94952a = activity;
    }

    /* renamed from: g */
    public final void mo33739g(SurveyMetadata surveyMetadata) {
        C58976aa aaVar = C58975e.f156826a;
        this.f94953b.f94956b.mo40138a();
        Activity activity = this.f94952a;
        Objects.requireNonNull(activity);
        C36355p pVar = new C36355p(activity);
        C60856cj.m92903l(C47810es.m84977q(pVar), this.f94953b.f94958d);
    }

    /* renamed from: h */
    public final void mo33740h(SurveyMetadata surveyMetadata) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: l */
    public final void mo33743l(C43026c cVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (cVar != null) {
            cVar.toString();
        }
        this.f94953b.f94956b.mo40138a();
        C36354o oVar = new C36354o(this, this.f94952a);
        C60856cj.m92903l(C47810es.m84977q(oVar), this.f94953b.f94958d);
    }
}
