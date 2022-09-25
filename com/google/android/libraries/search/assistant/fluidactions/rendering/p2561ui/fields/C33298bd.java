package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.assistant.p3897e.p3902c.p3907c.C50997co;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.bd */
/* compiled from: PG */
public final /* synthetic */ class C33298bd implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditableTextField f89286a;

    /* renamed from: b */
    public final /* synthetic */ C50997co f89287b;

    public /* synthetic */ C33298bd(EditableTextField editableTextField, C50997co coVar) {
        this.f89286a = editableTextField;
        this.f89287b = coVar;
    }

    public final void onClick(View view) {
        EditableTextField editableTextField = this.f89286a;
        C50997co coVar = this.f89287b;
        if (editableTextField.f89095g != null && editableTextField.f89099k != null && editableTextField.f89100l != null && (coVar.f132761a & 32) != 0) {
            C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
            C51953ff a = editableTextField.f89099k.mo38576a();
            tsVar.copyOnWrite();
            C52492tt ttVar = (C52492tt) tsVar.instance;
            a.getClass();
            ttVar.f137806b = a;
            ttVar.f137805a |= 1;
            C52492tt ttVar2 = (C52492tt) tsVar.build();
            C32942a aVar = editableTextField.f89100l;
            C51016dg dgVar = coVar.f132766f;
            if (dgVar == null) {
                dgVar = C51016dg.f132827g;
            }
            aVar.mo38364a("FA EditText", ttVar2, dgVar);
        }
    }
}
