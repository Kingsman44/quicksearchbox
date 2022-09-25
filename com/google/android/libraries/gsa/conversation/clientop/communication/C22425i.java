package com.google.android.libraries.gsa.conversation.clientop.communication;

import android.content.Context;
import android.widget.Toast;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.communication.i */
/* compiled from: PG */
final class C22425i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f61938a;

    /* renamed from: b */
    final /* synthetic */ String f61939b;

    public C22425i(Context context, String str) {
        this.f61938a = context;
        this.f61939b = str;
    }

    public final void run() {
        Toast.makeText(this.f61938a, this.f61939b, 1).show();
    }
}
