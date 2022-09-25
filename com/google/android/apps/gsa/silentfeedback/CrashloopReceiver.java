package com.google.android.apps.gsa.silentfeedback;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;

/* compiled from: PG */
public class CrashloopReceiver extends C92012e {

    /* renamed from: a */
    public static final C59071e f256523a = C59071e.m91332i("com.google.android.apps.gsa.silentfeedback.CrashloopReceiver");

    /* renamed from: b */
    public C22871g f256524b;

    /* renamed from: c */
    public C92011d f256525c;

    public final void onReceive(Context context, Intent intent) {
        C74507e.m120467c(29);
        if (intent != null) {
            mo86674a(context);
            this.f256524b.mo28212l("Silent Feedback Processing", new C92008a(this, context, goAsync()));
        }
    }
}
