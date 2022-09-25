package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.C33266g;
import com.google.assistant.p3897e.p3902c.p3907c.C51145ia;
import com.google.assistant.p3897e.p3902c.p3907c.C51146ib;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.dp */
/* compiled from: PG */
public final /* synthetic */ class C33364dp implements C33266g {

    /* renamed from: a */
    public final /* synthetic */ TimeSelectionField f89408a;

    public /* synthetic */ C33364dp(TimeSelectionField timeSelectionField) {
        this.f89408a = timeSelectionField;
    }

    /* renamed from: a */
    public final void mo38673a(int i) {
        C51146ib ibVar;
        TimeSelectionField timeSelectionField = this.f89408a;
        C33368dt dtVar = timeSelectionField.f89192c;
        if (dtVar != null && (ibVar = (C51146ib) dtVar.getItem(i)) != null) {
            int a = C51145ia.m86043a(ibVar.f133138g);
            if (a != 0 && a == 2) {
                timeSelectionField.f89193d = i;
                timeSelectionField.mo38728h((C51146ib) timeSelectionField.f89192c.getItem(i));
            } else if (i != timeSelectionField.f89193d) {
                timeSelectionField.f89193d = i;
                timeSelectionField.mo38727a(ibVar);
            }
        }
    }
}
