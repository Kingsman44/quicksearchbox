package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;

/* renamed from: com.google.android.gms.common.f */
/* compiled from: PG */
final class C143874f extends C144861c {

    /* renamed from: a */
    final /* synthetic */ C143875g f389985a;

    /* renamed from: b */
    private final Context f389986b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143874f(C143875g gVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f389985a = gVar;
        this.f389986b = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        if (message.what != 1) {
            int i = message.what;
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int j = this.f389985a.mo119362j(this.f389986b, C143876h.f389990c);
        if (C143700ab.m233447i(j)) {
            this.f389985a.mo119359g(this.f389986b, j);
        }
    }
}
