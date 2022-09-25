package com.google.android.apps.gsa.staticplugins.opa.p8306at;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.at.k */
/* compiled from: PG */
final class C107568k implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C107572o f299239a;

    /* renamed from: b */
    final /* synthetic */ C107570m f299240b;

    /* renamed from: c */
    final /* synthetic */ C107571n f299241c;

    public C107568k(C107571n nVar, C107572o oVar, C107570m mVar) {
        this.f299241c = nVar;
        this.f299239a = oVar;
        this.f299240b = mVar;
    }

    public final void afterTextChanged(Editable editable) {
        if (this.f299239a instanceof C107558a) {
            this.f299241c.f299272c.mo96219b(new C88489j(C87739bu.STOP_LISTENING).mo82013a());
            ((C107558a) this.f299239a).f299216a = editable.toString();
            if (!editable.toString().isEmpty()) {
                this.f299241c.mo96029f((Button) this.f299240b.f299246b.findViewById(R.id.send_btn));
            } else {
                this.f299241c.mo96027d((Button) this.f299240b.f299246b.findViewById(R.id.send_btn));
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
