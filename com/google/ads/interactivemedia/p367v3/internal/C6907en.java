package com.google.ads.interactivemedia.p367v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.ads.interactivemedia.v3.internal.en */
/* compiled from: PG */
final class C6907en extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C6908eo f22026a;

    public /* synthetic */ C6907en(C6908eo eoVar) {
        this.f22026a = eoVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f22026a.f22028b.post(new C6906em(this.f22026a));
    }
}
