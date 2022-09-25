package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10999c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10996a.C147500d;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10998b.C147520b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.libraries.af.a.b.c.c.b */
/* compiled from: PG */
public final class C147523b extends BroadcastReceiver {

    /* renamed from: a */
    public final C147520b f398171a;

    /* renamed from: b */
    public final C21370a f398172b;

    /* renamed from: c */
    private final C147500d f398173c;

    public C147523b(C147500d dVar, C147520b bVar, C21370a aVar) {
        this.f398173c = dVar;
        this.f398171a = bVar;
        this.f398172b = aVar;
    }

    public final void onReceive(Context context, Intent intent) {
        long c = this.f398172b.mo26871c();
        if ("com.google.android.gms.udc.action.FACS_CACHE_UPDATED".equals(intent.getAction())) {
            C60856cj.m92911t(this.f398173c.mo124268c(), new C147522a(this, c, goAsync()), C60826bg.f164896a);
        }
    }
}
