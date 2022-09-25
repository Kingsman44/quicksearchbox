package com.google.android.apps.gsa.unifiedime;

import android.content.Context;
import android.widget.Toast;

/* renamed from: com.google.android.apps.gsa.unifiedime.ae */
/* compiled from: PG */
final class C118581ae implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f330842a;

    /* renamed from: b */
    final /* synthetic */ String f330843b;

    public C118581ae(Context context, String str) {
        this.f330842a = context;
        this.f330843b = str;
    }

    public final void run() {
        Toast.makeText(this.f330842a, this.f330843b, 0).show();
    }
}
