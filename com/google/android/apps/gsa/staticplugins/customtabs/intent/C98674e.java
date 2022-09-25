package com.google.android.apps.gsa.staticplugins.customtabs.intent;

import android.content.Context;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.intent.e */
/* compiled from: PG */
public final /* synthetic */ class C98674e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C98682m f275638a;

    public /* synthetic */ C98674e(C98682m mVar) {
        this.f275638a = mVar;
    }

    public final void run() {
        Context context = this.f275638a.f275648c;
        Toast.makeText(context, context.getResources().getString(R.string.toast_custom_tabs_first_run_experience), 1).show();
    }
}
