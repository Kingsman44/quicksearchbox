package com.google.android.libraries.search.assistant.p2828y.p2838g.p2841c.p2842a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.common.p4522b.C58758qx;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.assistant.y.g.c.a.c */
/* compiled from: PG */
public final class C36946c {

    /* renamed from: a */
    public final Set f96208a = C58758qx.m90653k();

    /* renamed from: b */
    private final Context f96209b;

    /* renamed from: c */
    private final BroadcastReceiver f96210c;

    public C36946c(Context context) {
        this.f96209b = context;
        C36945b bVar = new C36945b(this);
        this.f96210c = bVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        context.registerReceiver(bVar, intentFilter);
    }

    /* renamed from: a */
    public final void mo40491a(C36944a aVar) {
        this.f96208a.add(aVar);
    }

    /* renamed from: b */
    public final void mo40492b(C36944a aVar) {
        if (this.f96208a.remove(aVar) && this.f96208a.isEmpty()) {
            this.f96209b.unregisterReceiver(this.f96210c);
        }
    }
}
