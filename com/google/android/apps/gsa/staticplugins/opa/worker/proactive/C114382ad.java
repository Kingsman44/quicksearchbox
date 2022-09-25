package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ad */
/* compiled from: PG */
public final /* synthetic */ class C114382ad implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C114384af f317130a;

    public /* synthetic */ C114382ad(C114384af afVar) {
        this.f317130a = afVar;
    }

    public final void run() {
        Toast makeText = Toast.makeText(this.f317130a.f317142d, R.string.opa_notifications_feedback_response_message, 0);
        makeText.setGravity(49, 0, 0);
        makeText.show();
    }
}
