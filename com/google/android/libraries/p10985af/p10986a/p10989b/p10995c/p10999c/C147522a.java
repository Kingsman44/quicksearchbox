package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10999c;

import android.content.BroadcastReceiver;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4184bj.p4193c.p4197c.C55931ae;

/* renamed from: com.google.android.libraries.af.a.b.c.c.a */
/* compiled from: PG */
final class C147522a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ long f398168a;

    /* renamed from: b */
    final /* synthetic */ BroadcastReceiver.PendingResult f398169b;

    /* renamed from: c */
    final /* synthetic */ C147523b f398170c;

    public C147522a(C147523b bVar, long j, BroadcastReceiver.PendingResult pendingResult) {
        this.f398170c = bVar;
        this.f398168a = j;
        this.f398169b = pendingResult;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C147523b bVar = this.f398170c;
        bVar.f398171a.mo124279b(3009, false, bVar.f398172b.mo26871c() - this.f398168a, (C55912b) null, (C55931ae) null, (Boolean) null, (Boolean) null);
        this.f398169b.finish();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C147523b bVar = this.f398170c;
        bVar.f398171a.mo124279b(3009, true, bVar.f398172b.mo26871c() - this.f398168a, (C55912b) null, (C55931ae) null, (Boolean) null, (Boolean) null);
        this.f398169b.finish();
    }
}
