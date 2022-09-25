package com.google.android.apps.gsa.languagepack;

import android.view.View;
import android.widget.RadioButton;

/* renamed from: com.google.android.apps.gsa.languagepack.bj */
/* compiled from: PG */
final class C74606bj implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f208774a;

    /* renamed from: b */
    final /* synthetic */ C74607bk f208775b;

    public C74606bj(C74607bk bkVar, int i) {
        this.f208775b = bkVar;
        this.f208774a = i;
    }

    public final void onClick(View view) {
        if (((RadioButton) view).isChecked()) {
            this.f208775b.f208776a.mo83904ax(this.f208774a);
        }
    }
}
