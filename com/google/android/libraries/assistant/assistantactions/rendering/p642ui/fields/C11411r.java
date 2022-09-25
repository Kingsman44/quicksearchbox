package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11296d;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11298f;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.r */
/* compiled from: PG */
public final /* synthetic */ class C11411r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ButtonsField f37165a;

    /* renamed from: b */
    public final /* synthetic */ C50936ah f37166b;

    public /* synthetic */ C11411r(ButtonsField buttonsField, C50936ah ahVar) {
        this.f37165a = buttonsField;
        this.f37166b = ahVar;
    }

    public final void onClick(View view) {
        C11296d dVar;
        ButtonsField buttonsField = this.f37165a;
        C50936ah ahVar = this.f37166b;
        C11295c cVar = buttonsField.f37153l;
        if (cVar != null && (dVar = buttonsField.f37154m) != null) {
            C11298f a = dVar.mo19691a(cVar);
            int i = ahVar.f132598d;
            if (i == 3) {
                buttonsField.mo19942i((C51016dg) ahVar.f132599e, a);
            } else if (i == 4) {
                buttonsField.mo19824a((C51098gh) ahVar.f132599e);
            }
        }
    }
}
