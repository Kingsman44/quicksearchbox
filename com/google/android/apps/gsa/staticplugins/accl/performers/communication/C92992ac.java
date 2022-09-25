package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.content.Context;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.ac */
/* compiled from: PG */
final class C92992ac implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ChatPerformer f259423a;

    public C92992ac(ChatPerformer chatPerformer) {
        this.f259423a = chatPerformer;
    }

    public final void run() {
        Context context = this.f259423a.f259391c;
        Toast.makeText(context, context.getString(R.string.screenshot_failed), 1).show();
    }
}
