package com.google.android.apps.search.googleapp.customtabs.features.buttons.share;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.share.p */
/* compiled from: PG */
final class C133866p implements C46851e {

    /* renamed from: a */
    final /* synthetic */ C133867q f364602a;

    public C133866p(C133867q qVar) {
        this.f364602a = qVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C46691ai mo20330a() {
        return new C46885y("APP_CHOSEN_DATA_SOURCE_KEY");
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        C133867q qVar = this.f364602a;
        C133852b bVar = qVar.f364603a;
        AccountId accountId = qVar.f364604b;
        Intent intent = new Intent();
        intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.googleapp.customtabs.features.buttons.share.ShareAppChosenReceiver_Receiver");
        C60870cx b = bVar.f364582b.mo50182b(intent, accountId);
        C133851a aVar = new C133851a(bVar);
        return C60922j.m93044g(b, C47810es.m84963c(aVar), bVar.f364583c);
    }
}
