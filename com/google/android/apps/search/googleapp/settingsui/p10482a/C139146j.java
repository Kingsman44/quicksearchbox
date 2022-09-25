package com.google.android.apps.search.googleapp.settingsui.p10482a;

import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.a.j */
/* compiled from: PG */
public final class C139146j {

    /* renamed from: a */
    public final C62921ba f378442a;

    /* renamed from: b */
    private final Context f378443b;

    public C139146j(Context context, C62921ba baVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(baVar, "extensionRegistryLite");
        this.f378443b = context;
        this.f378442a = baVar;
    }

    /* renamed from: a */
    public final Intent mo114780a(C139143g gVar, AccountId accountId) {
        C69664n.m101061g(gVar, "options");
        C69664n.m101061g(accountId, "accountId");
        Intent intent = new Intent();
        intent.setClassName(this.f378443b, "com.google.android.apps.search.googleapp.settingsui.SettingsActivity");
        ProtoParsers.m95531n(intent, "SETTINGS_INTENT_OPTIONS", gVar);
        C45963aa.m82131a(intent, accountId);
        return intent;
    }
}
