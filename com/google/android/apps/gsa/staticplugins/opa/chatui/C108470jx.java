package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.jx */
/* compiled from: PG */
public final /* synthetic */ class C108470jx implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C108474ka f301704a;

    public /* synthetic */ C108470jx(C108474ka kaVar) {
        this.f301704a = kaVar;
    }

    public final void run() {
        Context context = this.f301704a.f301714D;
        Toast.makeText(context, context.getText(R.string.error_media_info), 0).show();
    }
}
