package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.fp */
/* compiled from: PG */
final class C109046fp implements C91096f {

    /* renamed from: a */
    final /* synthetic */ C109065gb f303596a;

    public C109046fp(C109065gb gbVar) {
        this.f303596a = gbVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        this.f303596a.f303628b.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        return true;
    }
}
