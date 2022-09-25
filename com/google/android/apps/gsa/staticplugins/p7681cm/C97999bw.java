package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.bw */
/* compiled from: PG */
final class C97999bw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C98000bx f273636a;

    public C97999bw(C98000bx bxVar) {
        this.f273636a = bxVar;
    }

    public final void run() {
        Toast.makeText(this.f273636a.f273639a, R.string.icing_save_pref_failure, 1).show();
    }
}
