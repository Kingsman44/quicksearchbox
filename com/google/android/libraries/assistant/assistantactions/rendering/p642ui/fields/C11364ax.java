package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.text.Editable;
import android.text.TextWatcher;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.assistantactions.p636e.C11271a;
import com.google.android.libraries.assistant.assistantactions.p636e.C11278h;
import com.google.assistant.p3897e.p3902c.p3907c.C50994cl;
import com.google.assistant.p3897e.p3902c.p3907c.C50997co;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52486tn;
import com.google.assistant.p3897e.p3921j.C52487to;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ax */
/* compiled from: PG */
final class C11364ax implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ EditableTextField f37093a;

    public C11364ax(EditableTextField editableTextField) {
        this.f37093a = editableTextField;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C51016dg dgVar;
        C50997co coVar;
        String str;
        C51016dg dgVar2;
        EditableTextField editableTextField = this.f37093a;
        if (editableTextField.f36984b) {
            editableTextField.f36984b = false;
            return;
        }
        C51941eu euVar = editableTextField.f37153l.f36729a;
        if (euVar.f136275c == 1) {
            dgVar = (C51016dg) euVar.f136276d;
        } else {
            dgVar = C51016dg.f132827g;
        }
        if ((dgVar.f132829a & 8) != 0) {
            EditableTextField editableTextField2 = this.f37093a;
            C51941eu euVar2 = editableTextField2.f37153l.f36729a;
            if (euVar2.f136275c == 1) {
                dgVar2 = (C51016dg) euVar2.f136276d;
            } else {
                dgVar2 = C51016dg.f132827g;
            }
            C51805du duVar = dgVar2.f132833e;
            if (duVar == null) {
                duVar = C51805du.f135924e;
            }
            editableTextField2.mo19943j(C11278h.m26771a(duVar, C11271a.m26762f(this.f37093a.f36983a.getText().toString())));
            return;
        }
        EditableTextField editableTextField3 = this.f37093a;
        if (editableTextField3.f37153l != null) {
            Editable text = editableTextField3.f36983a.getText();
            C51941eu euVar3 = editableTextField3.f37153l.f36729a;
            C51937eq eqVar = (C51937eq) euVar3.toBuilder();
            if (euVar3.f136277e == 4) {
                coVar = (C50997co) euVar3.f136278f;
            } else {
                coVar = C50997co.f132759h;
            }
            C50994cl clVar = (C50994cl) coVar.toBuilder();
            String str2 = BuildConfig.FLAVOR;
            if (text == null) {
                str = str2;
            } else {
                str = text.toString();
            }
            clVar.copyOnWrite();
            C50997co coVar2 = (C50997co) clVar.instance;
            str.getClass();
            coVar2.f132761a |= 4;
            coVar2.f132764d = str;
            eqVar.copyOnWrite();
            C51941eu euVar4 = (C51941eu) eqVar.instance;
            C50997co coVar3 = (C50997co) clVar.build();
            coVar3.getClass();
            euVar4.f136278f = coVar3;
            euVar4.f136277e = 4;
            editableTextField3.f37153l.f36729a = (C51941eu) eqVar.build();
            C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
            String str3 = editableTextField3.f37153l.f36729a.f136279g;
            tpVar.copyOnWrite();
            C52490tr trVar = (C52490tr) tpVar.instance;
            str3.getClass();
            trVar.f137797a |= 1;
            trVar.f137800d = str3;
            String str4 = editableTextField3.f37153l.f36729a.f136280h;
            tpVar.copyOnWrite();
            C52490tr trVar2 = (C52490tr) tpVar.instance;
            str4.getClass();
            trVar2.f137797a |= 2;
            trVar2.f137801e = str4;
            tpVar.copyOnWrite();
            C52490tr trVar3 = (C52490tr) tpVar.instance;
            trVar3.f137797a = 4 | trVar3.f137797a;
            trVar3.f137802f = true;
            C52486tn tnVar = (C52486tn) C52487to.f137774c.createBuilder();
            if (text != null) {
                str2 = text.toString();
            }
            tnVar.copyOnWrite();
            C52487to toVar = (C52487to) tnVar.instance;
            str2.getClass();
            toVar.f137776a = 1 | toVar.f137776a;
            toVar.f137777b = str2;
            tpVar.copyOnWrite();
            C52490tr trVar4 = (C52490tr) tpVar.instance;
            C52487to toVar2 = (C52487to) tnVar.build();
            toVar2.getClass();
            trVar4.f137799c = toVar2;
            trVar4.f137798b = 3;
            editableTextField3.f37153l.f36730b = (C52490tr) tpVar.build();
        }
        EditableTextField editableTextField4 = this.f37093a;
        editableTextField4.mo19941h(editableTextField4.f37154m.mo19691a(editableTextField4.f37153l));
    }
}
