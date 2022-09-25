package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33233k;
import com.google.android.material.timepicker.C44989m;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C52402qk;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.C52476td;
import com.google.assistant.p3897e.p3921j.C52477te;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52506ug;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4526f.C59052c;
import java.util.Locale;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.w */
/* compiled from: PG */
public final /* synthetic */ class C33389w implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ChipCarouselField f89449a;

    /* renamed from: b */
    public final /* synthetic */ C44989m f89450b;

    public /* synthetic */ C33389w(ChipCarouselField chipCarouselField, C44989m mVar) {
        this.f89449a = chipCarouselField;
        this.f89450b = mVar;
    }

    public final void onClick(View view) {
        ChipCarouselField chipCarouselField = this.f89449a;
        C44989m mVar = this.f89450b;
        int a = mVar.mo48654a();
        int i = mVar.f117559f.f117515e;
        if (chipCarouselField.f89047h == null || chipCarouselField.f89048i == null || chipCarouselField.f89049j == null || chipCarouselField.f89043d == null || chipCarouselField.f89044e < 0) {
            ((C59052c) ((C59052c) ChipCarouselField.f89040a.mo56226d()).mo56372aa(51027)).mo56386p("Failed to handle onTimeSet due to invalid args");
            return;
        }
        C52402qk qkVar = (C52402qk) C52403ql.f137512f.createBuilder();
        qkVar.copyOnWrite();
        C52403ql qlVar = (C52403ql) qkVar.instance;
        qlVar.f137514a |= 1;
        qlVar.f137515b = a;
        qkVar.copyOnWrite();
        C52403ql qlVar2 = (C52403ql) qkVar.instance;
        qlVar2.f137514a |= 2;
        qlVar2.f137516c = i;
        C52403ql qlVar3 = (C52403ql) qkVar.build();
        String f = C33233k.m61640f(a, i, Locale.getDefault());
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
        int i2 = chipCarouselField.f89044e;
        tdVar.copyOnWrite();
        C52477te teVar = (C52477te) tdVar.instance;
        teVar.f137750a |= 1;
        teVar.f137753d = (long) i2;
        tdVar.copyOnWrite();
        C52477te teVar2 = (C52477te) tdVar.instance;
        teVar2.f137750a |= 2;
        teVar2.f137754e = true;
        tdVar.copyOnWrite();
        C52477te teVar3 = (C52477te) tdVar.instance;
        qlVar3.getClass();
        teVar3.f137752c = qlVar3;
        teVar3.f137751b = 5;
        tdVar.copyOnWrite();
        C52477te teVar4 = (C52477te) tdVar.instance;
        f.getClass();
        teVar4.f137750a |= 64;
        teVar4.f137756g = f;
        tpVar.copyOnWrite();
        C52490tr trVar4 = (C52490tr) tpVar.instance;
        C52477te teVar5 = (C52477te) tdVar.build();
        teVar5.getClass();
        trVar4.f137799c = teVar5;
        trVar4.f137798b = 16;
        C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
        C51953ff a2 = chipCarouselField.f89048i.mo38576a();
        tsVar.copyOnWrite();
        C52492tt ttVar = (C52492tt) tsVar.instance;
        a2.getClass();
        ttVar.f137806b = a2;
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
        C51016dg dgVar = chipCarouselField.f89043d.f132646f;
        if (dgVar == null) {
            dgVar = C51016dg.f132827g;
        }
        aVar.mo38364a("FA Chip TimeSet", ttVar3, dgVar);
    }
}
