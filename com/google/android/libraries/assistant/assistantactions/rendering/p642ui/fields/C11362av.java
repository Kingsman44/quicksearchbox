package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.assistant.p3897e.p3902c.p3907c.C50997co;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.av */
/* compiled from: PG */
public final /* synthetic */ class C11362av implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ EditableTextField f37091a;

    public /* synthetic */ C11362av(EditableTextField editableTextField) {
        this.f37091a = editableTextField;
    }

    public final void onFocusChange(View view, boolean z) {
        C50997co coVar;
        EditableTextField editableTextField = this.f37091a;
        if (z) {
            editableTextField.mo19851d(0);
            editableTextField.f36983a.setHint(BuildConfig.FLAVOR);
            editableTextField.mo19853q(true);
        } else {
            ((InputMethodManager) editableTextField.f37159r.getSystemService("input_method")).hideSoftInputFromWindow(editableTextField.f36983a.getWindowToken(), 0);
            if (TextUtils.isEmpty(editableTextField.f36983a.getText())) {
                editableTextField.mo19851d(4);
                C11295c cVar = editableTextField.f37153l;
                if (cVar != null) {
                    C51941eu euVar = cVar.f36729a;
                    if (euVar.f136277e == 4) {
                        coVar = (C50997co) euVar.f136278f;
                    } else {
                        coVar = C50997co.f132759h;
                    }
                    String str = coVar.f132763c;
                    if (str.isEmpty()) {
                        str = coVar.f132762b;
                    }
                    editableTextField.f36983a.setHint(str);
                }
            } else {
                editableTextField.mo19851d(0);
            }
            editableTextField.mo19853q(false);
        }
        editableTextField.mo19849a();
    }
}
