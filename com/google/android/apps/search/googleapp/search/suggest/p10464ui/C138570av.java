package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.content.Intent;
import com.google.android.apps.search.googleapp.search.settings.personalresults.PersonalResultsSettingActivity;
import com.google.android.apps.search.googleapp.search.suggest.plugins.p10454a.C138146l;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4552o.aod;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.av */
/* compiled from: PG */
final class C138570av implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C138558am f376897a;

    public C138570av(C138558am amVar) {
        this.f376897a = amVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C138558am amVar = this.f376897a;
        Intent intent = new Intent(amVar.f376861b.getContext(), PersonalResultsSettingActivity.class);
        C45963aa.m82131a(intent, amVar.f376863d);
        amVar.f376861b.startActivityForResult(intent, 1);
        amVar.f376868i.mo114119i(((C138146l) bVar).f375861a);
        amVar.f376873n.mo114102a(amVar.f376868i.mo114113b(amVar.f376854A.mo114315d(), aod.CLICKED_SUGGESTION));
        return C47392e.f123115a;
    }
}
