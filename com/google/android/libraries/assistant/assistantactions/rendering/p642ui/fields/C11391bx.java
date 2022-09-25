package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.C11339f;
import com.google.assistant.p3897e.p3902c.p3907c.C51145ia;
import com.google.assistant.p3897e.p3902c.p3907c.C51146ib;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bx */
/* compiled from: PG */
public final /* synthetic */ class C11391bx implements C11339f {

    /* renamed from: a */
    public final /* synthetic */ TimeSelectionField f37129a;

    public /* synthetic */ C11391bx(TimeSelectionField timeSelectionField) {
        this.f37129a = timeSelectionField;
    }

    /* renamed from: a */
    public final void mo19808a(int i) {
        TimeSelectionField timeSelectionField = this.f37129a;
        C51146ib ibVar = (C51146ib) timeSelectionField.f37044d.getItem(i);
        if (ibVar != null) {
            int a = C51145ia.m86043a(ibVar.f133138g);
            if (a != 0 && a == 2) {
                timeSelectionField.f37043c = i;
                timeSelectionField.mo19870c((C51146ib) timeSelectionField.f37044d.getItem(i));
            } else if (i != timeSelectionField.f37043c) {
                timeSelectionField.f37043c = i;
                timeSelectionField.mo19869a(ibVar);
            }
        }
    }
}
