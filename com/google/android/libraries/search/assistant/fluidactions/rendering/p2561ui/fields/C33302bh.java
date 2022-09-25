package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33178c;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33179d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ActionEditText;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2562a.C33241c;
import com.google.assistant.p3897e.p3902c.p3907c.C50996cn;
import com.google.assistant.p3897e.p3902c.p3907c.C50997co;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51141hx;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.bh */
/* compiled from: PG */
public final class C33302bh implements C33178c {
    /* renamed from: a */
    public final View mo38567a(C33179d dVar) {
        C50997co coVar;
        String str;
        C33241c cVar = null;
        EditableTextField editableTextField = (EditableTextField) LayoutInflater.from(dVar.f88738a).inflate(R.layout.fa_editable_text_field, (ViewGroup) null);
        editableTextField.f89095g = dVar.f88740c;
        editableTextField.f89096h = dVar.f88743f;
        editableTextField.f89097i = dVar.f88744g;
        editableTextField.f89098j = dVar.f88742e;
        editableTextField.f89099k = dVar.f88739b;
        editableTextField.f89100l = dVar.f88745h;
        if (editableTextField.f89095g == null || editableTextField.f89099k == null || editableTextField.f89096h == null || editableTextField.f89097i == null || editableTextField.f89100l == null || editableTextField.f89090b == null || editableTextField.f89091c == null || editableTextField.f89092d == null || editableTextField.f89093e == null || editableTextField.f89094f == null) {
            ((C59052c) ((C59052c) EditableTextField.f89089a.mo56226d()).mo56372aa(51071)).mo56386p("Unable to init FormField UI due to invalid args");
        } else {
            editableTextField.mo38564e(new C33180e((C51941eu) null, (C32951d) null));
            C51941eu euVar = editableTextField.f89095g;
            if (euVar.f136277e == 4) {
                coVar = (C50997co) euVar.f136278f;
            } else {
                coVar = C50997co.f132759h;
            }
            if ((coVar.f132761a & 16) != 0) {
                int a = C50996cn.m86005a(coVar.f132765e);
                if (a == 0) {
                    a = 1;
                }
                if (a - 1 == 1) {
                    editableTextField.f89092d.setInputType(3);
                }
            }
            if (editableTextField.f89096h.mo38383m()) {
                ActionEditText actionEditText = editableTextField.f89092d;
                String privateImeOptions = actionEditText.getPrivateImeOptions();
                if (privateImeOptions == null) {
                    privateImeOptions = "com.google.android.inputmethod.latin.canary.darkMode,com.google.android.inputmethod.latin.darkMode";
                } else if (!privateImeOptions.contains("com.google.android.inputmethod.latin.canary.darkMode,com.google.android.inputmethod.latin.darkMode")) {
                    privateImeOptions = privateImeOptions.concat(",").concat("com.google.android.inputmethod.latin.canary.darkMode,com.google.android.inputmethod.latin.darkMode");
                }
                actionEditText.setPrivateImeOptions(privateImeOptions);
            }
            if ((coVar.f132761a & 32) != 0) {
                editableTextField.f89092d.setOnClickListener(new C33298bd(editableTextField, coVar));
            }
            editableTextField.f89092d.addTextChangedListener(new C33301bg(editableTextField));
            editableTextField.f89092d.setOnFocusChangeListener(new C33299be(editableTextField));
            if ((coVar.f132761a & 128) != 0) {
                C51141hx hxVar = coVar.f132767g;
                if (hxVar == null) {
                    hxVar = C51141hx.f133119h;
                }
                if ((hxVar.f133121a & 16) != 0) {
                    C51141hx hxVar2 = coVar.f132767g;
                    if (hxVar2 == null) {
                        hxVar2 = C51141hx.f133119h;
                    }
                    C51012dc dcVar = hxVar2.f133126f;
                    if (dcVar == null) {
                        dcVar = C51012dc.f132813k;
                    }
                    if ((dcVar.f132815a & 2048) != 0) {
                        Context context = editableTextField.getContext();
                        String str2 = dcVar.f132824j;
                        cVar = C33241c.m61663a(context, str2, str2);
                    }
                    editableTextField.f89094f.mo38649b(dcVar, cVar);
                    editableTextField.f89094f.setVisibility(0);
                }
                C51141hx hxVar3 = coVar.f132767g;
                if ((hxVar3 == null ? C51141hx.f133119h : hxVar3).f133122b == 1) {
                    TextView textView = editableTextField.f89091c;
                    if (hxVar3 == null) {
                        hxVar3 = C51141hx.f133119h;
                    }
                    textView.setText(hxVar3.f133122b == 1 ? (String) hxVar3.f133123c : BuildConfig.FLAVOR);
                    editableTextField.f89091c.setVisibility(0);
                }
            }
            if (editableTextField.f89095g.f136275c == 22) {
                if (!coVar.f132764d.isEmpty()) {
                    editableTextField.f89093e.setText(coVar.f132764d);
                } else {
                    if (coVar.f132763c.isEmpty()) {
                        str = coVar.f132762b;
                    } else {
                        str = coVar.f132763c;
                    }
                    editableTextField.f89093e.setText(str);
                    editableTextField.f89093e.setTextColor(C19391a.m36980a(editableTextField.getContext(), R.attr.colorPrimary));
                }
                editableTextField.f89093e.setVisibility(0);
                editableTextField.setOnClickListener(new C33300bf(editableTextField));
            } else {
                editableTextField.f89092d.setVisibility(0);
            }
        }
        editableTextField.mo38706a();
        return editableTextField;
    }
}
