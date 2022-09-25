package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3902c.p3907c.C51156m;
import com.google.assistant.p3897e.p3902c.p3907c.C51159p;
import com.google.assistant.p3897e.p3921j.C52469sx;
import com.google.assistant.p3897e.p3921j.C52470sy;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52506ug;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.d */
/* compiled from: PG */
public final /* synthetic */ class C33348d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C33375i f89390a;

    public /* synthetic */ C33348d(C33375i iVar) {
        this.f89390a = iVar;
    }

    public final void onClick(View view) {
        C51159p pVar;
        C33375i iVar = this.f89390a;
        C51941eu euVar = iVar.f89426j;
        if (euVar == null || iVar.f89427k == null || iVar.f89428l == null) {
            ((C59052c) ((C59052c) C33375i.f89417a.mo56226d()).mo56372aa(50997)).mo56386p("Failed to handle delete button onClick due to invalid args");
            return;
        }
        C51937eq eqVar = (C51937eq) euVar.toBuilder();
        C51156m mVar = (C51156m) C51159p.f133168f.createBuilder();
        C51941eu euVar2 = iVar.f89426j;
        if (euVar2.f136277e == 23) {
            pVar = (C51159p) euVar2.f136278f;
        } else {
            pVar = C51159p.f133168f;
        }
        String str = pVar.f133171b;
        mVar.copyOnWrite();
        C51159p pVar2 = (C51159p) mVar.instance;
        str.getClass();
        pVar2.f133170a |= 1;
        pVar2.f133171b = str;
        mVar.copyOnWrite();
        C51159p pVar3 = (C51159p) mVar.instance;
        pVar3.f133170a |= 2;
        pVar3.f133172c = BuildConfig.FLAVOR;
        mVar.copyOnWrite();
        C51159p pVar4 = (C51159p) mVar.instance;
        pVar4.f133173d = 0;
        pVar4.f133170a |= 4;
        eqVar.copyOnWrite();
        C51941eu euVar3 = (C51941eu) eqVar.instance;
        C51159p pVar5 = (C51159p) mVar.build();
        pVar5.getClass();
        euVar3.f136278f = pVar5;
        euVar3.f136277e = 23;
        iVar.f89426j = (C51941eu) eqVar.build();
        iVar.f89427k.mo38581f(iVar.f89426j);
        C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
        String str2 = iVar.f89426j.f136279g;
        tpVar.copyOnWrite();
        C52490tr trVar = (C52490tr) tpVar.instance;
        str2.getClass();
        trVar.f137797a |= 1;
        trVar.f137800d = str2;
        String str3 = iVar.f89426j.f136280h;
        tpVar.copyOnWrite();
        C52490tr trVar2 = (C52490tr) tpVar.instance;
        str3.getClass();
        trVar2.f137797a |= 2;
        trVar2.f137801e = str3;
        tpVar.copyOnWrite();
        C52490tr trVar3 = (C52490tr) tpVar.instance;
        trVar3.f137797a |= 4;
        trVar3.f137802f = true;
        C52469sx sxVar = (C52469sx) C52470sy.f137736c.createBuilder();
        sxVar.copyOnWrite();
        C52470sy syVar = (C52470sy) sxVar.instance;
        syVar.f137738a |= 1;
        syVar.f137739b = BuildConfig.FLAVOR;
        tpVar.copyOnWrite();
        C52490tr trVar4 = (C52490tr) tpVar.instance;
        C52470sy syVar2 = (C52470sy) sxVar.build();
        syVar2.getClass();
        trVar4.f137799c = syVar2;
        trVar4.f137798b = 13;
        C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
        C51953ff a = iVar.f89427k.mo38576a();
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
        iVar.f89428l.mo38366c("FA AudioRecorder Delete", (C52492tt) tsVar.build());
    }
}
