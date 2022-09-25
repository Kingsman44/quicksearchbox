package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.assistant.p3897e.p3921j.p3926e.C51940et;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.s */
/* compiled from: PG */
public final /* synthetic */ class C11412s implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ChatMessageField f37167a;

    public /* synthetic */ C11412s(ChatMessageField chatMessageField) {
        this.f37167a = chatMessageField;
    }

    public final void onClick(View view) {
        C51940et etVar;
        ChatMessageField chatMessageField = this.f37167a;
        C11295c cVar = chatMessageField.f37153l;
        if (cVar != null && chatMessageField.f37152k != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136275c == 24) {
                etVar = (C51940et) euVar.f136276d;
            } else {
                etVar = C51940et.f136268b;
            }
            chatMessageField.mo19940g(C58485gu.m89842j(etVar.f136270a), false);
            chatMessageField.mo19825a();
        }
    }
}
