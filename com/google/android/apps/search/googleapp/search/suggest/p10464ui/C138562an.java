package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.search.googleapp.search.settings.locationconsent.LocationConsentSettingActivity;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.an */
/* compiled from: PG */
final class C138562an implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C138558am f376889a;

    public C138562an(C138558am amVar) {
        this.f376889a = amVar;
    }

    public final void onClick(View view) {
        Intent intent = new Intent(this.f376889a.f376861b.getContext(), LocationConsentSettingActivity.class);
        C45963aa.m82131a(intent, this.f376889a.f376863d);
        C47709i.m84861a(this.f376889a.f376861b, intent);
    }
}
