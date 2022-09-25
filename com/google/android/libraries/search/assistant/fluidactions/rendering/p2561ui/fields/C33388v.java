package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.databinding.C0118a;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ChipComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C52476td;
import com.google.assistant.p3897e.p3921j.C52477te;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52506ug;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4526f.C58979ad;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.v */
/* compiled from: PG */
public final /* synthetic */ class C33388v implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ChipCarouselField f89446a;

    /* renamed from: b */
    public final /* synthetic */ ChipComponent f89447b;

    /* renamed from: c */
    public final /* synthetic */ C50954az f89448c;

    public /* synthetic */ C33388v(ChipCarouselField chipCarouselField, ChipComponent chipComponent, C50954az azVar) {
        this.f89446a = chipCarouselField;
        this.f89447b = chipComponent;
        this.f89448c = azVar;
    }

    public final void onClick(View view) {
        ChipCarouselField chipCarouselField = this.f89446a;
        ChipComponent chipComponent = this.f89447b;
        C50954az azVar = this.f89448c;
        if (chipCarouselField.f89047h == null || chipCarouselField.f89048i == null || chipCarouselField.f89049j == null) {
            C0118a.m96d(ChipCarouselField.f89040a.mo56226d(), "Failed to handle chip onClick due to invalid args", 51020, C58979ad.SMALL);
            return;
        }
        C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
        String str = chipCarouselField.f89047h.f136279g;
        tpVar.copyOnWrite();
        C52490tr trVar = (C52490tr) tpVar.instance;
        str.getClass();
        trVar.f137797a |= 1;
        trVar.f137800d = str;
        String str2 = chipCarouselField.f89047h.f136280h;
        tpVar.copyOnWrite();
        C52490tr trVar2 = (C52490tr) tpVar.instance;
        str2.getClass();
        trVar2.f137797a |= 2;
        trVar2.f137801e = str2;
        tpVar.copyOnWrite();
        C52490tr trVar3 = (C52490tr) tpVar.instance;
        trVar3.f137797a |= 4;
        trVar3.f137802f = true;
        C52476td tdVar = (C52476td) C52477te.f137748h.createBuilder();
        int i = chipComponent.f88944b;
        tdVar.copyOnWrite();
        C52477te teVar = (C52477te) tdVar.instance;
        teVar.f137750a |= 1;
        teVar.f137753d = (long) i;
        tdVar.copyOnWrite();
        C52477te teVar2 = (C52477te) tdVar.instance;
        teVar2.f137750a |= 2;
        teVar2.f137754e = true;
        tdVar.copyOnWrite();
        C52477te teVar3 = (C52477te) tdVar.instance;
        teVar3.f137750a |= 4;
        teVar3.f137755f = true;
        tpVar.copyOnWrite();
        C52490tr trVar4 = (C52490tr) tpVar.instance;
        C52477te teVar4 = (C52477te) tdVar.build();
        teVar4.getClass();
        trVar4.f137799c = teVar4;
        trVar4.f137798b = 16;
        C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
        C51953ff a = chipCarouselField.f89048i.mo38576a();
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
        C32942a aVar = chipCarouselField.f89049j;
        C51016dg dgVar = azVar.f132648h;
        if (dgVar == null) {
            dgVar = C51016dg.f132827g;
        }
        aVar.mo38364a("FA Chip Cancel", ttVar3, dgVar);
    }
}
