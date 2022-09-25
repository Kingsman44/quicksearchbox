package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n;

import android.content.Context;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.d */
/* compiled from: PG */
public final /* synthetic */ class C117017d implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C117018e f324857a;

    public /* synthetic */ C117017d(C117018e eVar) {
        this.f324857a = eVar;
    }

    public final void run() {
        Context context = this.f324857a.f324859b;
        Toast.makeText(context, context.getResources().getString(R.string.suggest_toast_cannot_open_app), 0).show();
    }
}
