package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.kb */
/* compiled from: PG */
public final /* synthetic */ class C96341kb implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C96342kc f269555a;

    /* renamed from: b */
    public final /* synthetic */ String f269556b;

    public /* synthetic */ C96341kb(C96342kc kcVar, String str) {
        this.f269555a = kcVar;
        this.f269556b = str;
    }

    public final void onClick(View view) {
        C96342kc kcVar = this.f269555a;
        kcVar.mo89948n(R.string.herbie_skip_ota_dialog_title, String.format(kcVar.getString(R.string.herbie_skip_ota_dialog_message, new Object[]{this.f269556b}), new Object[0]), C96091av.f269025a, new C96092aw(kcVar), R.string.bisto_try_again);
    }
}
