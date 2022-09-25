package com.google.android.apps.gsa.sidekick.main.notifications;

import android.app.Notification;
import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4522b.C58729pv;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.m */
/* compiled from: PG */
public final class C91539m extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C91540n f255296a;

    /* renamed from: b */
    private final C91530d f255297b;

    /* renamed from: c */
    private final Context f255298c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91539m(C91540n nVar, Context context, C91530d dVar) {
        super("ShowNotificationForReminders", 1, 0);
        this.f255296a = nVar;
        this.f255298c = context;
        this.f255297b = dVar;
    }

    public final void run() {
        Notification b = this.f255296a.f255304c.mo85860b(this.f255297b.mo85877c(), this.f255297b, C91544r.m149772b(this.f255298c.getApplicationContext(), this.f255297b.mo85892r(), this.f255297b.mo85877c()), false, C58729pv.f156485a);
        if (b != null) {
            this.f255296a.f255304c.mo85859a(this.f255297b.mo85877c(), b, this.f255297b);
        }
    }
}
