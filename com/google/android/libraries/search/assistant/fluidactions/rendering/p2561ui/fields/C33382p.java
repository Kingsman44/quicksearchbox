package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33230h;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ButtonComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C50931ac;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52474tb;
import com.google.assistant.p3897e.p3921j.C52475tc;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52506ug;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.p */
/* compiled from: PG */
public final /* synthetic */ class C33382p implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ButtonField f89439a;

    /* renamed from: b */
    public final /* synthetic */ C50936ah f89440b;

    public /* synthetic */ C33382p(ButtonField buttonField, C50936ah ahVar) {
        this.f89439a = buttonField;
        this.f89440b = ahVar;
    }

    public final void onClick(View view) {
        C51016dg dgVar;
        ButtonComponent buttonComponent;
        C51098gh ghVar;
        ButtonField buttonField = this.f89439a;
        C50936ah ahVar = this.f89440b;
        if (buttonField.f89014b == null || buttonField.f89016d == null || buttonField.f89017e == null || buttonField.f89018f == null) {
            ((C59052c) ((C59052c) ButtonField.f89013a.mo56226d()).mo56372aa(51009)).mo56386p("OnClicked() failed due to invalid args");
            return;
        }
        C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
        String str = buttonField.f89014b.f136279g;
        tpVar.copyOnWrite();
        C52490tr trVar = (C52490tr) tpVar.instance;
        str.getClass();
        trVar.f137797a |= 1;
        trVar.f137800d = str;
        String str2 = buttonField.f89014b.f136280h;
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
        C52490tr trVar5 = (C52490tr) tpVar.build();
        if (ahVar.f132598d == 4) {
            Context context = buttonField.getContext();
            Fragment fragment = buttonField.f89016d;
            if (ahVar.f132598d == 4) {
                ghVar = (C51098gh) ahVar.f132599e;
            } else {
                ghVar = C51098gh.f133009e;
            }
            C33230h.m61622d(context, fragment, ghVar);
            return;
        }
        C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
        C51953ff a = buttonField.f89017e.mo38576a();
        tsVar.copyOnWrite();
        C52492tt ttVar = (C52492tt) tsVar.instance;
        a.getClass();
        ttVar.f137806b = a;
        ttVar.f137805a |= 1;
        C52506ug ugVar = (C52506ug) C52507uh.f137838b.createBuilder();
        ugVar.mo53877a(trVar5);
        tsVar.copyOnWrite();
        C52492tt ttVar2 = (C52492tt) tsVar.instance;
        C52507uh uhVar = (C52507uh) ugVar.build();
        uhVar.getClass();
        ttVar2.f137807c = uhVar;
        ttVar2.f137805a |= 2;
        C52492tt ttVar3 = (C52492tt) tsVar.build();
        C50931ac acVar = C50931ac.CONFIRM;
        C50931ac a2 = C50931ac.m85981a(ahVar.f132602h);
        if (a2 == null) {
            a2 = C50931ac.DEFAULT;
        }
        if (acVar == a2 && (buttonComponent = buttonField.f89019g) != null) {
            buttonComponent.setEnabled(false);
        }
        C51941eu euVar = buttonField.f89014b;
        if (euVar.f136275c == 1) {
            dgVar = (C51016dg) euVar.f136276d;
        } else if (ahVar.f132598d == 3) {
            dgVar = (C51016dg) ahVar.f132599e;
        } else {
            dgVar = C51016dg.f132827g;
        }
        buttonField.f89018f.mo38364a("FA Button", ttVar3, dgVar);
    }
}
