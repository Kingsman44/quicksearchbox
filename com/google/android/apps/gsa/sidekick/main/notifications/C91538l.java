package com.google.android.apps.gsa.sidekick.main.notifications;

import android.content.Context;
import com.google.android.apps.gsa.shared.search.p7138b.C90491g;
import com.google.android.apps.gsa.sidekick.shared.p7230a.C91645c;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91752h;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.l */
/* compiled from: PG */
final class C91538l extends C91645c {

    /* renamed from: a */
    final /* synthetic */ C91540n f255295a;

    public C91538l(C91540n nVar) {
        this.f255295a = nVar;
    }

    /* renamed from: a */
    public final void mo85916a(String str, C90491g gVar) {
        Context context = this.f255295a.f255310i;
        context.startActivity(C91752h.m150310a(context, str, gVar, true));
    }
}
