package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11298f;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11301i;
import com.google.assistant.p3897e.p3902c.p3907c.C50931ac;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52474tb;
import com.google.assistant.p3897e.p3921j.C52475tc;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.p3926e.C51940et;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.q */
/* compiled from: PG */
public final /* synthetic */ class C11410q implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ButtonField f37163a;

    /* renamed from: b */
    public final /* synthetic */ C50936ah f37164b;

    public /* synthetic */ C11410q(ButtonField buttonField, C50936ah ahVar) {
        this.f37163a = buttonField;
        this.f37164b = ahVar;
    }

    public final void onClick(View view) {
        C51016dg dgVar;
        ButtonField buttonField = this.f37163a;
        C50936ah ahVar = this.f37164b;
        if (buttonField.f37153l != null && buttonField.f37154m != null) {
            C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
            String str = buttonField.f37153l.f36729a.f136279g;
            tpVar.copyOnWrite();
            C52490tr trVar = (C52490tr) tpVar.instance;
            str.getClass();
            trVar.f137797a |= 1;
            trVar.f137800d = str;
            String str2 = buttonField.f37153l.f36729a.f136280h;
            tpVar.copyOnWrite();
            C52490tr trVar2 = (C52490tr) tpVar.instance;
            str2.getClass();
            trVar2.f137797a |= 2;
            trVar2.f137801e = str2;
            tpVar.copyOnWrite();
            C52490tr trVar3 = (C52490tr) tpVar.instance;
            trVar3.f137797a |= 4;
            trVar3.f137802f = true;
            C52474tb tbVar = (C52474tb) C52475tc.f137744c.createBuilder();
            tbVar.copyOnWrite();
            C52475tc tcVar = (C52475tc) tbVar.instance;
            tcVar.f137746a |= 1;
            tcVar.f137747b = true;
            tpVar.copyOnWrite();
            C52490tr trVar4 = (C52490tr) tpVar.instance;
            C52475tc tcVar2 = (C52475tc) tbVar.build();
            tcVar2.getClass();
            trVar4.f137799c = tcVar2;
            trVar4.f137798b = 9;
            C11295c cVar = buttonField.f37153l;
            cVar.f36730b = (C52490tr) tpVar.build();
            C11298f a = buttonField.f37154m.mo19691a(cVar);
            C51941eu euVar = buttonField.f37153l.f36729a;
            if (euVar.f136275c == 24) {
                buttonField.mo19940g(C58485gu.m89842j(((C51940et) euVar.f136276d).f136270a), false);
            } else if (ahVar.f132598d == 4) {
                buttonField.mo19944l((C51098gh) ahVar.f132599e);
            } else {
                C50931ac acVar = C50931ac.CONFIRM;
                C50931ac a2 = C50931ac.m85981a(ahVar.f132602h);
                if (a2 == null) {
                    a2 = C50931ac.DEFAULT;
                }
                if (acVar == a2) {
                    buttonField.f36919b.setEnabled(false);
                    buttonField.f36920c.mo19778b();
                    buttonField.f36920c.setEnabled(false);
                    C11301i iVar = buttonField.f37152k;
                    if (iVar != null) {
                        iVar.mo19724g();
                    }
                }
                C51941eu euVar2 = buttonField.f37153l.f36729a;
                if (euVar2.f136275c == 1) {
                    dgVar = (C51016dg) euVar2.f136276d;
                } else {
                    dgVar = C51016dg.f132827g;
                }
                if ((dgVar.f132829a & 8) != 0) {
                    C51941eu euVar3 = buttonField.f37153l.f36729a;
                    buttonField.mo19942i(euVar3.f136275c == 1 ? (C51016dg) euVar3.f136276d : C51016dg.f132827g, a);
                } else if (ahVar.f132598d == 3) {
                    buttonField.mo19942i((C51016dg) ahVar.f132599e, a);
                } else {
                    buttonField.mo19941h(a);
                }
            }
        }
    }
}
