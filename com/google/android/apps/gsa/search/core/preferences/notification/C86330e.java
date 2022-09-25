package com.google.android.apps.gsa.search.core.preferences.notification;

import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.search.googleapp.notifications.webuisettings.C136808g;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.notification.e */
/* compiled from: PG */
public final /* synthetic */ class C86330e implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C86333h f233418a;

    /* renamed from: b */
    public final /* synthetic */ String f233419b;

    public /* synthetic */ C86330e(C86333h hVar, String str) {
        this.f233418a = hVar;
        this.f233419b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C86333h hVar = this.f233418a;
        Intent a = C136808g.m222483a(hVar.f233423b, this.f233419b, (AccountId) obj);
        a.setFlags(268435456);
        hVar.f233423b.startActivity(a);
        return C118826c.f331422a;
    }
}
