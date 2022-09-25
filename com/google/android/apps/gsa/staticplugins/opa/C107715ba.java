package com.google.android.apps.gsa.staticplugins.opa;

import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ba */
/* compiled from: PG */
public final /* synthetic */ class C107715ba implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C109040fj f299744a;

    public /* synthetic */ C107715ba(C109040fj fjVar) {
        this.f299744a = fjVar;
    }

    public final void run() {
        C109040fj fjVar = this.f299744a;
        Toast.makeText(fjVar.f303346c, fjVar.mo97534f().getString(R.string.remind_learn_opa_later_toast_text), 0).show();
    }
}
