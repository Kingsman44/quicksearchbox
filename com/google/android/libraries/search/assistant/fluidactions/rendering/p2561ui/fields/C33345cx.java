package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33230h;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3902c.p3907c.C51118ha;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52502uc;
import com.google.assistant.p3897e.p3921j.C52503ud;
import com.google.assistant.p3897e.p3921j.C52506ug;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.cx */
/* compiled from: PG */
public final /* synthetic */ class C33345cx implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ReceiptCardField f89385a;

    /* renamed from: b */
    public final /* synthetic */ C51118ha f89386b;

    public /* synthetic */ C33345cx(ReceiptCardField receiptCardField, C51118ha haVar) {
        this.f89385a = receiptCardField;
        this.f89386b = haVar;
    }

    public final void onClick(View view) {
        C51098gh ghVar;
        ReceiptCardField receiptCardField = this.f89385a;
        C51118ha haVar = this.f89386b;
        if (receiptCardField.f89154b == null || receiptCardField.f89155c == null || receiptCardField.f89156d == null) {
            ((C59052c) ((C59052c) ReceiptCardField.f89153a.mo56226d()).mo56372aa(51129)).mo56386p("Failed to handle OnClick due to invalid args");
            return;
        }
        C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
        String str = receiptCardField.f89154b.f136279g;
        tpVar.copyOnWrite();
        C52490tr trVar = (C52490tr) tpVar.instance;
        str.getClass();
        trVar.f137797a |= 1;
        trVar.f137800d = str;
        String str2 = receiptCardField.f89154b.f136280h;
        tpVar.copyOnWrite();
        C52490tr trVar2 = (C52490tr) tpVar.instance;
        str2.getClass();
        trVar2.f137797a |= 2;
        trVar2.f137801e = str2;
        tpVar.copyOnWrite();
        C52490tr trVar3 = (C52490tr) tpVar.instance;
        trVar3.f137797a |= 4;
        trVar3.f137802f = true;
        C52502uc ucVar = (C52502uc) C52503ud.f137830c.createBuilder();
        ucVar.copyOnWrite();
        C52503ud udVar = (C52503ud) ucVar.instance;
        udVar.f137832a |= 1;
        udVar.f137833b = true;
        tpVar.copyOnWrite();
        C52490tr trVar4 = (C52490tr) tpVar.instance;
        C52503ud udVar2 = (C52503ud) ucVar.build();
        udVar2.getClass();
        trVar4.f137799c = udVar2;
        trVar4.f137798b = 15;
        C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
        C51953ff a = receiptCardField.f89155c.mo38576a();
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
        int i = haVar.f133052b;
        if (i == 4) {
            Context context = receiptCardField.getContext();
            Fragment fragment = receiptCardField.f89157e;
            if (haVar.f133052b == 4) {
                ghVar = (C51098gh) haVar.f133053c;
            } else {
                ghVar = C51098gh.f133009e;
            }
            C33230h.m61622d(context, fragment, ghVar);
        } else if (i == 3) {
            receiptCardField.f89156d.mo38364a("FA Receipt", ttVar3, (C51016dg) haVar.f133053c);
        }
    }
}
