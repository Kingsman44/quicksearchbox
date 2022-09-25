package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33233k;
import com.google.android.material.datepicker.C44609ae;
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
import com.google.common.p4526f.C59052c;
import java.util.Locale;
import p3186j$.time.Instant;
import p3186j$.time.LocalDate;
import p3186j$.time.ZoneOffset;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.t */
/* compiled from: PG */
public final /* synthetic */ class C33386t implements C44609ae {

    /* renamed from: a */
    public final /* synthetic */ ChipCarouselField f89442a;

    public /* synthetic */ C33386t(ChipCarouselField chipCarouselField) {
        this.f89442a = chipCarouselField;
    }

    /* renamed from: a */
    public final void mo19885a(Object obj) {
        ChipCarouselField chipCarouselField = this.f89442a;
        LocalDate localDate = Instant.ofEpochMilli(((Long) obj).longValue()).atZone(ZoneOffset.UTC).toLocalDate();
        int year = localDate.getYear();
        int monthValue = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();
        if (chipCarouselField.f89047h == null || chipCarouselField.f89048i == null || chipCarouselField.f89049j == null || chipCarouselField.f89041b == null || chipCarouselField.f89042c < 0) {
            ((C59052c) ((C59052c) ChipCarouselField.f89040a.mo56226d()).mo56372aa(51023)).mo56386p("Failed to handle onDateSet due to invalid args");
            return;
        }
        C52392qa qaVar = (C52392qa) C52393qb.f137479e.createBuilder();
        qaVar.copyOnWrite();
        C52393qb qbVar = (C52393qb) qaVar.instance;
        qbVar.f137481a |= 1;
        qbVar.f137482b = year;
        qaVar.copyOnWrite();
        C52393qb qbVar2 = (C52393qb) qaVar.instance;
        qbVar2.f137481a |= 2;
        qbVar2.f137483c = monthValue;
        qaVar.copyOnWrite();
        C52393qb qbVar3 = (C52393qb) qaVar.instance;
        qbVar3.f137481a |= 4;
        qbVar3.f137484d = dayOfMonth;
        C52393qb qbVar4 = (C52393qb) qaVar.build();
        String g = C33233k.m61641g(year, monthValue, dayOfMonth, Locale.getDefault());
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
        int i = chipCarouselField.f89042c;
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
        qbVar4.getClass();
        teVar3.f137752c = qbVar4;
        teVar3.f137751b = 4;
        tdVar.copyOnWrite();
        C52477te teVar4 = (C52477te) tdVar.instance;
        g.getClass();
        teVar4.f137750a |= 64;
        teVar4.f137756g = g;
        tpVar.copyOnWrite();
        C52490tr trVar4 = (C52490tr) tpVar.instance;
        C52477te teVar5 = (C52477te) tdVar.build();
        teVar5.getClass();
        trVar4.f137799c = teVar5;
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
        C51016dg dgVar = chipCarouselField.f89041b.f132646f;
        if (dgVar == null) {
            dgVar = C51016dg.f132827g;
        }
        aVar.mo38364a("FA Chip DateSet", ttVar3, dgVar);
    }
}
