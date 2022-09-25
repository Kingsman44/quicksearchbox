package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n;

import android.content.Context;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.a */
/* compiled from: PG */
public final /* synthetic */ class C116991a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C117009b f324782a;

    public /* synthetic */ C116991a(C117009b bVar) {
        this.f324782a = bVar;
    }

    public final void run() {
        Context context = this.f324782a.f324828b;
        Toast.makeText(context, context.getResources().getString(R.string.suggest_toast_shortcut_not_supported), 0).show();
    }
}
