package com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor;

import android.content.Context;
import android.widget.Toast;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.b */
/* compiled from: PG */
final class C22416b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f61927a;

    /* renamed from: b */
    final /* synthetic */ String f61928b;

    public C22416b(Context context, String str) {
        this.f61927a = context;
        this.f61928b = str;
    }

    public final void run() {
        Toast.makeText(this.f61927a, this.f61928b, 1).show();
    }
}
