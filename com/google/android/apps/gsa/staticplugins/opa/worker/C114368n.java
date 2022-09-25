package com.google.android.apps.gsa.staticplugins.opa.worker;

import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.n */
/* compiled from: PG */
public final /* synthetic */ class C114368n implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C114507v f317105a;

    public /* synthetic */ C114368n(C114507v vVar) {
        this.f317105a = vVar;
    }

    public final void run() {
        Toast.makeText(this.f317105a.f317520f, R.string.opa_pre_upgrade_notifs_disabled_toast_text, 0).show();
    }
}
