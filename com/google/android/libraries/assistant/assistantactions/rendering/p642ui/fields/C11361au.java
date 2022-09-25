package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11296d;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11298f;
import com.google.assistant.p3897e.p3902c.p3907c.C50997co;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.au */
/* compiled from: PG */
public final /* synthetic */ class C11361au implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditableTextField f37089a;

    /* renamed from: b */
    public final /* synthetic */ C50997co f37090b;

    public /* synthetic */ C11361au(EditableTextField editableTextField, C50997co coVar) {
        this.f37089a = editableTextField;
        this.f37090b = coVar;
    }

    public final void onClick(View view) {
        C11296d dVar;
        EditableTextField editableTextField = this.f37089a;
        C50997co coVar = this.f37090b;
        C11295c cVar = editableTextField.f37153l;
        if (cVar != null && (dVar = editableTextField.f37154m) != null) {
            C11298f a = dVar.mo19691a(cVar);
            if ((coVar.f132761a & 32) != 0) {
                C51016dg dgVar = coVar.f132766f;
                if (dgVar == null) {
                    dgVar = C51016dg.f132827g;
                }
                editableTextField.mo19942i(dgVar, a);
            }
        }
    }
}
