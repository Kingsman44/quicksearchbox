package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.personalresults;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.C0816c;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.personalresults.g */
/* compiled from: PG */
public final class C125002g {

    /* renamed from: a */
    public static final C59071e f344907a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.personalresults.g");

    /* renamed from: b */
    public final PersonalResultsNotificationActivity f344908b;

    /* renamed from: c */
    public final C68214a f344909c;

    /* renamed from: d */
    public final C45989b f344910d;

    /* renamed from: e */
    public final C32158h f344911e;

    public C125002g(PersonalResultsNotificationActivity personalResultsNotificationActivity, C68214a aVar, C45989b bVar, C32158h hVar) {
        this.f344908b = personalResultsNotificationActivity;
        this.f344909c = aVar;
        this.f344910d = bVar;
        this.f344911e = hVar;
    }

    /* renamed from: b */
    public static void m204932b(C0816c cVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("assistant_surface", i);
        C18509a c = C18522b.m35986c();
        C18523c cVar2 = (C18523c) c;
        cVar2.f52492a = "personalization";
        cVar2.f52493b = bundle;
        Intent a = c.mo24020b().mo24031a();
        a.putExtra("highlight_pr_then_hpr", true);
        cVar.mo526b(a);
    }

    /* renamed from: a */
    public final void mo106772a() {
        this.f344908b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/assistant/?p=hp_personal_results")));
    }
}
