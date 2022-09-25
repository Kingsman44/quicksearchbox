package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83907bm;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.al */
/* compiled from: PG */
public final class C96081al extends C83907bm {
    public final void onActivityResult(int i, int i2, Intent intent) {
        mo77318iT().mo77312a();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = (Intent) getArguments().getParcelable("intent");
        intent.getClass();
        startActivityForResult(intent, 0);
    }
}
