package com.google.apps.tiktok.account.api.controller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.p104d.p105a.C2164c;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47815ex;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.account.api.controller.cj */
/* compiled from: PG */
final class C46026cj extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C47816ey f120875a;

    /* renamed from: b */
    final /* synthetic */ C2164c f120876b;

    public C46026cj(C47816ey eyVar, C2164c cVar) {
        this.f120875a = eyVar;
        this.f120876b = cVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C47573bx a = this.f120875a.mo51644a();
        try {
            this.f120876b.mo5437b((Object) null);
            C47831fm.m85013h(((C47815ex) a).f123840a);
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
