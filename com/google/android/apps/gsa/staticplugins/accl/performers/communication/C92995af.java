package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.content.Context;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.af */
/* compiled from: PG */
final class C92995af implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ChatPerformer f259426a;

    public C92995af(ChatPerformer chatPerformer) {
        this.f259426a = chatPerformer;
    }

    public final void run() {
        Context context = this.f259426a.f259391c;
        Toast.makeText(context, context.getString(R.string.send_message_failed), 1).show();
    }
}
