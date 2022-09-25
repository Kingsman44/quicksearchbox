package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9234c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.tracing.C47810es;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.c.j */
/* compiled from: PG */
final class C121521j extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C121525n f337234a;

    public C121521j(C121525n nVar) {
        this.f337234a = nVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f337234a.f337239b.execute(C47810es.m84977q(new C121520i(this, intent.getLongExtra("request_id", 0))));
    }
}
