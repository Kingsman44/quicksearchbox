package com.google.android.apps.gsa.notificationlistener;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;

/* renamed from: com.google.android.apps.gsa.notificationlistener.o */
/* compiled from: PG */
public final class C83399o implements C83382ab, C90991b {

    /* renamed from: a */
    public final C91022f f227294a;

    /* renamed from: b */
    private final Context f227295b;

    /* renamed from: c */
    private final C83387d f227296c;

    public C83399o(Context context, C91022f fVar, C83387d dVar) {
        this.f227295b = context;
        this.f227294a = fVar;
        this.f227296c = dVar;
    }

    /* renamed from: a */
    public final void mo40164a() {
        Intent intent = new Intent("com.google.android.apps.gsa.notificationlistener.NOTIFICATION_LISTENER_SERVICE_CONNECTED");
        intent.setPackage(this.f227295b.getPackageName());
        this.f227295b.sendBroadcast(intent);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("GsaNotiListenerService");
        fVar.mo85292s(C90752i.m148229c(C83391h.m132724c(this.f227296c.f227268a)));
    }
}
