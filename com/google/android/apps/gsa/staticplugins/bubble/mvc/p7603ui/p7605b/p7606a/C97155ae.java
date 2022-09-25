package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7605b.p7606a;

import android.view.View;
import android.widget.CheckBox;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C97155ae implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C97158ah f271465a;

    public /* synthetic */ C97155ae(C97158ah ahVar) {
        this.f271465a = ahVar;
    }

    public final void onClick(View view) {
        CheckBox checkBox = (CheckBox) this.f271465a.f271472f.findViewById(R.id.bubble_subscription_checkbox);
        checkBox.setChecked(!checkBox.isChecked());
    }
}
