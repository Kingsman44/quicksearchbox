package com.google.android.apps.gsa.staticplugins.avocado;

import android.app.Activity;
import android.widget.Toast;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.ab */
/* compiled from: PG */
final class C94158ab implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Activity f263031a;

    /* renamed from: b */
    final /* synthetic */ String f263032b = "Failed";

    public C94158ab(Activity activity) {
        this.f263031a = activity;
    }

    public final void run() {
        Toast.makeText(this.f263031a, this.f263032b, 0).show();
    }
}
