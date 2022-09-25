package com.google.android.apps.gsa.sidekick.shared.p7242k;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.p489g.p494d.C9178bn;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.k.a */
/* compiled from: PG */
public final class C91753a {
    /* renamed from: b */
    private static Intent m150312b(Context context, Intent intent) {
        return intent.addFlags(268435456).putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
    }

    /* renamed from: a */
    public static Intent m150311a(C9178bn bnVar, Context context) {
        if ((bnVar.f31699a & 1) != 0) {
            return m150312b(context, new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.CHANNEL_ID", bnVar.f31700b));
        }
        return m150312b(context, new Intent("android.settings.APP_NOTIFICATION_SETTINGS"));
    }
}
