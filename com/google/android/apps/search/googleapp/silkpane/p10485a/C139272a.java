package com.google.android.apps.search.googleapp.silkpane.p10485a;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.googleapp.silkpane.p10486b.C139280b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.search.googleapp.silkpane.a.a */
/* compiled from: PG */
public final class C139272a {

    /* renamed from: a */
    public final C62921ba f378804a;

    /* renamed from: b */
    private final Context f378805b;

    public C139272a(Context context, C62921ba baVar) {
        this.f378805b = context;
        this.f378804a = baVar;
    }

    /* renamed from: a */
    public final Intent mo114864a(C139280b bVar, AccountId accountId) {
        Intent intent = new Intent();
        intent.setClassName(this.f378805b, "com.google.android.apps.search.googleapp.silkpane.SilkPaneActivity");
        ProtoParsers.m95531n(intent, "EXTRA_OPEN_SILK_PANE_PARAMS", bVar);
        C45963aa.m82131a(intent, accountId);
        return intent;
    }
}
