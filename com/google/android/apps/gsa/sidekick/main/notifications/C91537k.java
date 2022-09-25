package com.google.android.apps.gsa.sidekick.main.notifications;

import android.app.PendingIntent;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.k */
/* compiled from: PG */
public final class C91537k extends C90888av {

    /* renamed from: a */
    final /* synthetic */ PendingIntent f255294a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91537k(PendingIntent pendingIntent) {
        super("SendContentPendingIntent", 1, 8);
        this.f255294a = pendingIntent;
    }

    public final void run() {
        try {
            this.f255294a.send();
        } catch (PendingIntent.CanceledException unused) {
            C59071e eVar = C91540n.f255299a;
            C58976aa aaVar = C58975e.f156826a;
        }
    }
}
