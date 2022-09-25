package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.content.Context;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.ae */
/* compiled from: PG */
final class C92994ae implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ChatPerformer f259425a;

    public C92994ae(ChatPerformer chatPerformer) {
        this.f259425a = chatPerformer;
    }

    public final void run() {
        Context context = this.f259425a.f259391c;
        Toast.makeText(context, context.getString(R.string.send_message_failed), 1).show();
    }
}
