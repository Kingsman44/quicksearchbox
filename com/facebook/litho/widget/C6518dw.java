package com.facebook.litho.widget;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.litho.widget.dw */
/* compiled from: PG */
final class C6518dw implements TextWatcher {

    /* renamed from: a */
    private final List f19393a;

    public C6518dw(List list) {
        this.f19393a = new ArrayList(list);
    }

    public final void afterTextChanged(Editable editable) {
        for (TextWatcher afterTextChanged : this.f19393a) {
            afterTextChanged.afterTextChanged(editable);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        for (TextWatcher beforeTextChanged : this.f19393a) {
            beforeTextChanged.beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        for (TextWatcher onTextChanged : this.f19393a) {
            onTextChanged.onTextChanged(charSequence, i, i2, i3);
        }
    }
}
