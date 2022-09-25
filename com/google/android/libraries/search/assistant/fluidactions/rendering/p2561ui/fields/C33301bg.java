package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.text.Editable;
import android.text.TextWatcher;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ActionEditText;
import com.google.assistant.p3897e.p3902c.p3907c.C50994cl;
import com.google.assistant.p3897e.p3902c.p3907c.C50997co;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C52486tn;
import com.google.assistant.p3897e.p3921j.C52487to;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52506ug;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.bg */
/* compiled from: PG */
final class C33301bg implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ EditableTextField f89290a;

    public C33301bg(EditableTextField editableTextField) {
        this.f89290a = editableTextField;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ActionEditText actionEditText;
        String str;
        C50997co coVar;
        C51016dg dgVar;
        EditableTextField editableTextField = this.f89290a;
        if (editableTextField.f89095g != null && editableTextField.f89099k != null && editableTextField.f89100l != null && (actionEditText = editableTextField.f89092d) != null) {
            Editable text = actionEditText.getText();
            if (text == null) {
                str = BuildConfig.FLAVOR;
            } else {
                str = text.toString();
            }
            EditableTextField editableTextField2 = this.f89290a;
            C51937eq eqVar = (C51937eq) editableTextField2.f89095g.toBuilder();
            C51941eu euVar = this.f89290a.f89095g;
            if (euVar.f136277e == 4) {
                coVar = (C50997co) euVar.f136278f;
            } else {
                coVar = C50997co.f132759h;
            }
            C50994cl clVar = (C50994cl) coVar.toBuilder();
            clVar.copyOnWrite();
            C50997co coVar2 = (C50997co) clVar.instance;
            str.getClass();
            coVar2.f132761a |= 4;
            coVar2.f132764d = str;
            eqVar.copyOnWrite();
            C51941eu euVar2 = (C51941eu) eqVar.instance;
            C50997co coVar3 = (C50997co) clVar.build();
            coVar3.getClass();
            euVar2.f136278f = coVar3;
            euVar2.f136277e = 4;
            editableTextField2.f89095g = (C51941eu) eqVar.build();
            EditableTextField editableTextField3 = this.f89290a;
            editableTextField3.f89099k.mo38581f(editableTextField3.f89095g);
            C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
            String str2 = this.f89290a.f89095g.f136279g;
            tpVar.copyOnWrite();
            C52490tr trVar = (C52490tr) tpVar.instance;
            str2.getClass();
            trVar.f137797a |= 1;
            trVar.f137800d = str2;
            String str3 = this.f89290a.f89095g.f136280h;
            tpVar.copyOnWrite();
            C52490tr trVar2 = (C52490tr) tpVar.instance;
            str3.getClass();
            trVar2.f137797a |= 2;
            trVar2.f137801e = str3;
            tpVar.copyOnWrite();
            C52490tr trVar3 = (C52490tr) tpVar.instance;
            trVar3.f137797a |= 4;
            trVar3.f137802f = true;
            C52486tn tnVar = (C52486tn) C52487to.f137774c.createBuilder();
            tnVar.copyOnWrite();
            C52487to toVar = (C52487to) tnVar.instance;
            str.getClass();
            toVar.f137776a |= 1;
            toVar.f137777b = str;
            tpVar.copyOnWrite();
            C52490tr trVar4 = (C52490tr) tpVar.instance;
            C52487to toVar2 = (C52487to) tnVar.build();
            toVar2.getClass();
            trVar4.f137799c = toVar2;
            trVar4.f137798b = 3;
            C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
            C51953ff a = this.f89290a.f89099k.mo38576a();
            tsVar.copyOnWrite();
            C52492tt ttVar = (C52492tt) tsVar.instance;
            a.getClass();
            ttVar.f137806b = a;
            ttVar.f137805a |= 1;
            C52506ug ugVar = (C52506ug) C52507uh.f137838b.createBuilder();
            ugVar.mo53877a((C52490tr) tpVar.build());
            tsVar.copyOnWrite();
            C52492tt ttVar2 = (C52492tt) tsVar.instance;
            C52507uh uhVar = (C52507uh) ugVar.build();
            uhVar.getClass();
            ttVar2.f137807c = uhVar;
            ttVar2.f137805a |= 2;
            C52492tt ttVar3 = (C52492tt) tsVar.build();
            EditableTextField editableTextField4 = this.f89290a;
            C32942a aVar = editableTextField4.f89100l;
            C51941eu euVar3 = editableTextField4.f89095g;
            if (euVar3.f136275c == 1) {
                dgVar = (C51016dg) euVar3.f136276d;
            } else {
                dgVar = C51016dg.f132827g;
            }
            aVar.mo38364a("FA TextEdit Change", ttVar3, dgVar);
        }
    }
}
