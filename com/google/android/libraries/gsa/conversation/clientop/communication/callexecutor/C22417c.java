package com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor;

import android.content.Context;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.c */
/* compiled from: PG */
final class C22417c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f61929a;

    public C22417c(Context context) {
        this.f61929a = context;
    }

    public final void run() {
        Context context = this.f61929a;
        Toast.makeText(context, context.getString(R.string.third_party_call_failed), 1).show();
    }
}
