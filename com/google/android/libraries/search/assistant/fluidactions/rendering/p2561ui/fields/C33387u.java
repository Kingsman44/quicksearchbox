package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.databinding.C0118a;
import android.text.format.DateFormat;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ChipComponent;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.material.datepicker.C44607ac;
import com.google.android.material.datepicker.C44608ad;
import com.google.android.material.datepicker.C44625au;
import com.google.android.material.timepicker.C44988l;
import com.google.android.material.timepicker.C44989m;
import com.google.assistant.p3897e.p3902c.p3907c.C50949au;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C52392qa;
import com.google.assistant.p3897e.p3921j.C52393qb;
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
import com.google.common.p4526f.C59052c;
import p3186j$.time.LocalDate;
import p3186j$.time.LocalDateTime;
import p3186j$.time.ZoneId;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.u */
/* compiled from: PG */
public final /* synthetic */ class C33387u implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ChipCarouselField f89443a;

    /* renamed from: b */
    public final /* synthetic */ ChipComponent f89444b;

    /* renamed from: c */
    public final /* synthetic */ C50954az f89445c;

    public /* synthetic */ C33387u(ChipCarouselField chipCarouselField, ChipComponent chipComponent, C50954az azVar) {
        this.f89443a = chipCarouselField;
        this.f89444b = chipComponent;
        this.f89445c = azVar;
    }

    public final void onClick(View view) {
        ChipCarouselField chipCarouselField = this.f89443a;
        ChipComponent chipComponent = this.f89444b;
        C50954az azVar = this.f89445c;
        int a = C50949au.m85987a(azVar.f132650j);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            int i2 = chipComponent.f88944b;
            chipCarouselField.f89041b = azVar;
            chipCarouselField.f89042c = i2;
            if (chipCarouselField.f89050k == null) {
                ((C59052c) ((C59052c) ChipCarouselField.f89040a.mo56226d()).mo56372aa(51028)).mo56386p("Failed to show DatePicker due to invalid args");
                return;
            }
            C44607ac a2 = C44607ac.m79052a();
            a2.mo47839c();
            a2.f116212e = Long.valueOf(C44625au.m79085f().getTimeInMillis());
            C44608ad b = a2.mo47838b();
            b.f116213a.add(new C33386t(chipCarouselField));
            b.showNow(chipCarouselField.f89050k.getChildFragmentManager(), "MaterialDatePickerFragment");
        } else if (i == 2) {
            int i3 = chipComponent.f88944b;
            chipCarouselField.f89043d = azVar;
            chipCarouselField.f89044e = i3;
            if (chipCarouselField.f89050k == null) {
                ((C59052c) ((C59052c) ChipCarouselField.f89040a.mo56226d()).mo56372aa(51029)).mo56386p("Failed to show DatePicker due to invalid args");
                return;
            }
            LocalDateTime now = LocalDateTime.now(ZoneId.systemDefault());
            C44988l lVar = new C44988l();
            lVar.f117552a.mo48632e(now.getHour());
            lVar.f117552a.f117515e = now.getMinute() % 60;
            lVar.mo48652a();
            lVar.mo48653b(DateFormat.is24HourFormat(chipCarouselField.getContext()) ? 1 : 0);
            C44989m b2 = C44989m.m79968b(lVar);
            b2.mo48656d(new C33389w(chipCarouselField, b2));
            b2.showNow(chipCarouselField.f89050k.getChildFragmentManager(), "MaterialTimePickerFragment");
        } else if (i != 3) {
            if (chipCarouselField.f89047h == null || chipCarouselField.f89048i == null || chipCarouselField.f89049j == null) {
                C0118a.m96d(ChipCarouselField.f89040a.mo56226d(), "Failed to handle chip onClick due to invalid args", 51018, C58979ad.SMALL);
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
            int i4 = chipComponent.f88944b;
            tdVar.copyOnWrite();
            C52477te teVar = (C52477te) tdVar.instance;
            teVar.f137750a |= 1;
            teVar.f137753d = (long) i4;
            tdVar.copyOnWrite();
            C52477te teVar2 = (C52477te) tdVar.instance;
            teVar2.f137750a |= 2;
            teVar2.f137754e = true;
            tpVar.copyOnWrite();
            C52490tr trVar4 = (C52490tr) tpVar.instance;
            C52477te teVar3 = (C52477te) tdVar.build();
            teVar3.getClass();
            trVar4.f137799c = teVar3;
            trVar4.f137798b = 16;
            C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
            C51953ff a3 = chipCarouselField.f89048i.mo38576a();
            tsVar.copyOnWrite();
            C52492tt ttVar = (C52492tt) tsVar.instance;
            a3.getClass();
            ttVar.f137806b = a3;
            ttVar.f137805a = 1 | ttVar.f137805a;
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
            C51016dg dgVar = azVar.f132646f;
            if (dgVar == null) {
                dgVar = C51016dg.f132827g;
            }
            aVar.mo38364a("FA Chip", ttVar3, dgVar);
        } else if (chipCarouselField.f89050k == null) {
            C0118a.m96d(ChipCarouselField.f89040a.mo56226d(), "Failed to handle chip onClick due to invalid args", 51019, C58979ad.SMALL);
        } else {
            int i5 = chipComponent.f88944b;
            chipCarouselField.f89045f = azVar;
            chipCarouselField.f89046g = i5;
            String zoneId = ZoneId.systemDefault().toString();
            LocalDate now2 = LocalDate.now(ZoneId.systemDefault());
            C52392qa qaVar = (C52392qa) C52393qb.f137479e.createBuilder();
            int year = now2.getYear();
            qaVar.copyOnWrite();
            C52393qb qbVar = (C52393qb) qaVar.instance;
            qbVar.f137481a = 1 | qbVar.f137481a;
            qbVar.f137482b = year;
            int monthValue = now2.getMonthValue();
            qaVar.copyOnWrite();
            C52393qb qbVar2 = (C52393qb) qaVar.instance;
            qbVar2.f137481a = 2 | qbVar2.f137481a;
            qbVar2.f137483c = monthValue;
            int dayOfMonth = now2.getDayOfMonth();
            qaVar.copyOnWrite();
            C52393qb qbVar3 = (C52393qb) qaVar.instance;
            qbVar3.f137481a |= 4;
            qbVar3.f137484d = dayOfMonth;
            C33259r.m61673c(zoneId, (C52393qb) qaVar.build(), false, chipCarouselField).showNow(chipCarouselField.f89050k.getChildFragmentManager(), "chipCarouselRecurrencePickerTag");
        }
    }
}
