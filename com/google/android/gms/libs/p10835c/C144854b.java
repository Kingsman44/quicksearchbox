package com.google.android.gms.libs.p10835c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.C1882h;

/* renamed from: com.google.android.gms.libs.c.b */
/* compiled from: PG */
public final class C144854b extends C1882h {
    @Deprecated
    /* renamed from: a */
    public static Intent m235443a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (!C144853a.m235442a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, true != C144853a.m235442a() ? 0 : 2);
    }
}
