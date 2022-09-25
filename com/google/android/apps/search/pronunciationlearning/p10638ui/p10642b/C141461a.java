package com.google.android.apps.search.pronunciationlearning.p10638ui.p10642b;

import android.accounts.Account;
import androidx.core.p097i.C1970e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.C43025b;
import com.google.android.libraries.surveys.C43169j;
import com.google.android.libraries.surveys.C43171l;
import com.google.android.libraries.surveys.SurveyData;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.b.a */
/* compiled from: PG */
final class C141461a implements C43169j {

    /* renamed from: a */
    final /* synthetic */ C141462b f383973a;

    /* renamed from: b */
    private final Account f383974b;

    public C141461a(C141462b bVar, Account account) {
        this.f383973a = bVar;
        this.f383974b = account;
    }

    /* renamed from: a */
    public final void mo33737a(SurveyData surveyData) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1970e("trigger_source", this.f383973a.f383978d.name()));
        C43025b bVar = new C43025b(this.f383973a.f383976b, surveyData);
        bVar.mo46052b(R.id.pronunciationlearning_survey_parent_sheet, 500);
        bVar.f112520b = this.f383974b;
        bVar.f112521c = arrayList;
        C43171l.m75929a(bVar.mo46051a());
    }

    /* renamed from: b */
    public final void mo33738b() {
    }
}
