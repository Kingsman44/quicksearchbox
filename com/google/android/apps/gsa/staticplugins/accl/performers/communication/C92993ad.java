package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.content.Context;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.ad */
/* compiled from: PG */
final class C92993ad implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ChatPerformer f259424a;

    public C92993ad(ChatPerformer chatPerformer) {
        this.f259424a = chatPerformer;
    }

    public final void run() {
        Context context = this.f259424a.f259391c;
        Toast.makeText(context, context.getString(R.string.send_message_failed), 1).show();
    }
}
