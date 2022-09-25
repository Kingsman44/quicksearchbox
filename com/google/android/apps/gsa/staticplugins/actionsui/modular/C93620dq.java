package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.dq */
/* compiled from: PG */
final class C93620dq implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ StringArgumentView f261356a;

    public C93620dq(StringArgumentView stringArgumentView) {
        this.f261356a = stringArgumentView;
    }

    public final void afterTextChanged(Editable editable) {
        ((StringArgument) this.f261356a.f261447m).mo81334P(editable.toString());
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
