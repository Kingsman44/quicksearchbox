package com.google.android.apps.search.googleapp.customtabs.features.buttons.share;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58893dc;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.share.a */
/* compiled from: PG */
public final /* synthetic */ class C133851a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C133852b f364580a;

    public /* synthetic */ C133851a(C133852b bVar) {
        this.f364580a = bVar;
    }

    public final Object apply(Object obj) {
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f364580a.f364581a, 0, C147798a.m240896b((Intent) obj, 201326592, 0), 201326592);
        C58893dc.m90996a(broadcast);
        return broadcast.getIntentSender();
    }
}
