package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33230h;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.bf */
/* compiled from: PG */
public final /* synthetic */ class C33300bf implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditableTextField f89289a;

    public /* synthetic */ C33300bf(EditableTextField editableTextField) {
        this.f89289a = editableTextField;
    }

    public final void onClick(View view) {
        C51098gh ghVar;
        EditableTextField editableTextField = this.f89289a;
        if (editableTextField.f89095g != null && editableTextField.f89098j != null) {
            Context context = editableTextField.getContext();
            Fragment fragment = editableTextField.f89098j;
            C51941eu euVar = editableTextField.f89095g;
            if (euVar.f136275c == 22) {
                ghVar = (C51098gh) euVar.f136276d;
            } else {
                ghVar = C51098gh.f133009e;
            }
            C33230h.m61622d(context, fragment, ghVar);
        }
    }
}
