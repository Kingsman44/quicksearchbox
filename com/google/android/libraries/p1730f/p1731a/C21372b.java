package com.google.android.libraries.p1730f.p1731a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.f.a.b */
/* compiled from: PG */
final class C21372b extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C21373c f59761a;

    public C21372b(C21373c cVar) {
        this.f59761a = cVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C58528ij<Object> F;
        synchronized (this.f59761a.f59762a) {
            F = C58528ij.m90006F(this.f59761a.f59762a);
        }
        for (Object a : F) {
            this.f59761a.f59763b.mo26875a(a);
        }
    }
}
