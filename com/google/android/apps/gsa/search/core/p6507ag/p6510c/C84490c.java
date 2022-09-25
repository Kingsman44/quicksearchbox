package com.google.android.apps.gsa.search.core.p6507ag.p6510c;

import android.app.NotificationManager;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;

/* renamed from: com.google.android.apps.gsa.search.core.ag.c.c */
/* compiled from: PG */
public final class C84490c {

    /* renamed from: a */
    private final C118561t f229951a;

    /* renamed from: b */
    private final NotificationManager f229952b;

    public C84490c(C118561t tVar, NotificationManager notificationManager) {
        this.f229951a = tVar;
        this.f229952b = notificationManager;
    }

    /* renamed from: a */
    public final void mo78209a() {
        if (this.f229952b.getNotificationChannels().isEmpty()) {
            C118561t tVar = this.f229951a;
            C118522by byVar = C118522by.LEGACY_NOW_SYNC;
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328824d = 1;
            agVar.f328821a |= 4;
            tVar.mo103754e(byVar, (C118472ag) afVar.build());
        }
    }
}
