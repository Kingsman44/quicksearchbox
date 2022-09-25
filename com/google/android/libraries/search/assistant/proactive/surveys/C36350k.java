package com.google.android.libraries.search.assistant.proactive.surveys;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.surveys.C43169j;
import com.google.android.libraries.surveys.SurveyData;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.proactive.surveys.k */
/* compiled from: PG */
final class C36350k implements C43169j {

    /* renamed from: a */
    final /* synthetic */ C2164c f94938a;

    /* renamed from: b */
    final /* synthetic */ String f94939b;

    /* renamed from: c */
    final /* synthetic */ C36357r f94940c;

    public C36350k(C36357r rVar, C2164c cVar, String str) {
        this.f94940c = rVar;
        this.f94938a = cVar;
        this.f94939b = str;
    }

    /* renamed from: a */
    public final void mo33737a(SurveyData surveyData) {
        this.f94938a.mo5437b(Optional.m71637of(surveyData));
        C36358s sVar = this.f94940c.f94956b;
        sVar.f94959a.put(this.f94939b, surveyData);
    }

    /* renamed from: b */
    public final void mo33738b() {
        C58976aa aaVar = C58975e.f156826a;
        this.f94938a.mo5437b(Optional.empty());
    }
}
