package com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.p10162a;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133714af;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58893dc;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.a.f */
/* compiled from: PG */
public final /* synthetic */ class C133878f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C133880h f364635a;

    /* renamed from: b */
    public final /* synthetic */ C133714af f364636b;

    public /* synthetic */ C133878f(C133880h hVar, C133714af afVar) {
        this.f364635a = hVar;
        this.f364636b = afVar;
    }

    public final Object apply(Object obj) {
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f364635a.f364643b, this.f364636b.f364210b, C147798a.m240896b((Intent) obj, 201326592, 0), 201326592);
        C58893dc.m90996a(broadcast);
        return broadcast;
    }
}
