package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3902c.p3907c.C50997co;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.be */
/* compiled from: PG */
public final /* synthetic */ class C33299be implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ EditableTextField f89288a;

    public /* synthetic */ C33299be(EditableTextField editableTextField) {
        this.f89288a = editableTextField;
    }

    public final void onFocusChange(View view, boolean z) {
        C50997co coVar;
        EditableTextField editableTextField = this.f89288a;
        if (editableTextField.f89092d != null) {
            if (z) {
                editableTextField.mo38707h(0);
                editableTextField.f89092d.setHint(BuildConfig.FLAVOR);
                editableTextField.f89101m = true;
                editableTextField.mo38706a();
                editableTextField.f89092d.callOnClick();
                return;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) editableTextField.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(editableTextField.f89092d.getWindowToken(), 0);
            }
            if (TextUtils.isEmpty(editableTextField.f89092d.getText())) {
                editableTextField.mo38707h(4);
                C51941eu euVar = editableTextField.f89095g;
                if (euVar != null) {
                    if (euVar.f136277e == 4) {
                        coVar = (C50997co) euVar.f136278f;
                    } else {
                        coVar = C50997co.f132759h;
                    }
                    String str = coVar.f132763c;
                    if (str.isEmpty()) {
                        str = coVar.f132762b;
                    }
                    editableTextField.f89092d.setHint(str);
                }
            } else {
                editableTextField.mo38707h(0);
            }
            editableTextField.f89101m = false;
            editableTextField.mo38706a();
        }
    }
}
