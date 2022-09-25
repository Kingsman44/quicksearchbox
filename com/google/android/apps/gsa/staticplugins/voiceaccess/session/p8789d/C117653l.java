package com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8789d;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.dialogactivity.VoiceAccessDialogActivity;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.d.l */
/* compiled from: PG */
public final /* synthetic */ class C117653l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f326581a;

    public /* synthetic */ C117653l(Context context) {
        this.f326581a = context;
    }

    public final void run() {
        Context context = this.f326581a;
        Intent intent = new Intent(context, VoiceAccessDialogActivity.class);
        intent.setFlags(268435456);
        if (context != null) {
            context.startActivity(intent);
        }
    }
}
