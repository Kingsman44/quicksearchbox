package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.aw */
/* compiled from: PG */
public final /* synthetic */ class C11363aw implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditableTextField f37092a;

    public /* synthetic */ C11363aw(EditableTextField editableTextField) {
        this.f37092a = editableTextField;
    }

    public final void onClick(View view) {
        C51098gh ghVar;
        EditableTextField editableTextField = this.f37092a;
        C11295c cVar = editableTextField.f37153l;
        if (cVar != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136275c == 22) {
                ghVar = (C51098gh) euVar.f136276d;
            } else {
                ghVar = C51098gh.f133009e;
            }
            editableTextField.mo19944l(ghVar);
        }
    }
}
