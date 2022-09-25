package com.google.android.apps.search.sceneviewer.p10649d;

import android.accounts.Account;
import android.app.Activity;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.C43025b;
import com.google.android.libraries.surveys.C43169j;
import com.google.android.libraries.surveys.C43171l;
import com.google.android.libraries.surveys.SurveyData;
import java.util.List;

/* renamed from: com.google.android.apps.search.sceneviewer.d.d */
/* compiled from: PG */
final class C141544d implements C43169j {

    /* renamed from: a */
    final /* synthetic */ Activity f384183a;

    /* renamed from: b */
    final /* synthetic */ Account f384184b;

    /* renamed from: c */
    final /* synthetic */ List f384185c;

    public C141544d(Activity activity, Account account, List list) {
        this.f384183a = activity;
        this.f384184b = account;
        this.f384185c = list;
    }

    /* renamed from: a */
    public final void mo33737a(SurveyData surveyData) {
        C43025b bVar = new C43025b(this.f384183a, surveyData);
        bVar.mo46052b(R.id.sceneviewer_hats_overlay_layout, 500);
        bVar.f112520b = this.f384184b;
        bVar.f112521c = this.f384185c;
        C43171l.m75929a(bVar.mo46051a());
    }

    /* renamed from: b */
    public final void mo33738b() {
    }
}
