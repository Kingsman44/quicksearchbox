package com.google.android.apps.gsa.sidekick.main.notifications;

import android.content.Intent;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.az */
/* compiled from: PG */
final class C91511az implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C91520be f255246a;

    public C91511az(C91520be beVar) {
        this.f255246a = beVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C91520be.f255258a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "NowNotificationManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(11673)).mo56386p("Exception encountered");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f255246a.f255259b.sendBroadcast(new Intent("com.google.android.apps.now.cards_remote_broadcast"));
        }
    }
}
