package com.google.android.apps.search.xblend.p10707b;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.xblend.p10708c.C142272b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.protobuf.contrib.android.ProtoParsers;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.xblend.b.b */
/* compiled from: PG */
public final class C142270b {
    /* renamed from: a */
    public static final Intent m230999a(Context context, AccountId accountId, C142272b bVar) {
        C69664n.m101061g(context, "applicationContext");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar, "params");
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.apps.search.xblend.xpane.XPaneActivity");
        intent.setFlags(268435456);
        ProtoParsers.m95531n(intent, "extra_open_xpane_params", bVar);
        C45963aa.m82131a(intent, accountId);
        return intent;
    }
}
