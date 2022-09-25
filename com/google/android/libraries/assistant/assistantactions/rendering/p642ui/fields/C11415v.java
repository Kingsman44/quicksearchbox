package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import com.google.assistant.p3897e.p3921j.C52479tg;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.v */
/* compiled from: PG */
public final /* synthetic */ class C11415v implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ContactSelectionField f37174a;

    public /* synthetic */ C11415v(ContactSelectionField contactSelectionField) {
        this.f37174a = contactSelectionField;
    }

    public final void onClick(View view) {
        ContactSelectionField contactSelectionField = this.f37174a;
        if (contactSelectionField.f37154m != null && contactSelectionField.f37153l != null) {
            contactSelectionField.mo19834r(C52479tg.f137757d);
            contactSelectionField.mo19941h(contactSelectionField.f37154m.mo19691a(contactSelectionField.f37153l));
        }
    }
}
