package com.google.android.apps.gsa.staticplugins.opa;

import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.fe */
/* compiled from: PG */
public final /* synthetic */ class C109035fe implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C109036ff f303200a;

    /* renamed from: b */
    public final /* synthetic */ String f303201b;

    public /* synthetic */ C109035fe(C109036ff ffVar, String str) {
        this.f303200a = ffVar;
        this.f303201b = str;
    }

    public final void run() {
        C109036ff ffVar = this.f303200a;
        String str = this.f303201b;
        View view = ffVar.f303202a;
        if (view != null) {
            ((TextView) view.findViewById(R.id.loading_message)).setText(str);
        }
    }
}
