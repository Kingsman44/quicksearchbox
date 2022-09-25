package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33233k;
import com.google.android.material.datepicker.C44609ae;
import com.google.assistant.p3897e.p3902c.p3907c.C50973br;
import com.google.assistant.p3897e.p3902c.p3907c.C50976bu;
import com.google.assistant.p3897e.p3921j.C52392qa;
import com.google.assistant.p3897e.p3921j.C52393qb;
import java.util.Locale;
import p3186j$.time.Instant;
import p3186j$.time.LocalDate;
import p3186j$.time.ZoneOffset;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ai */
/* compiled from: PG */
public final /* synthetic */ class C33276ai implements C44609ae {

    /* renamed from: a */
    public final /* synthetic */ DateSelectionField f89249a;

    public /* synthetic */ C33276ai(DateSelectionField dateSelectionField) {
        this.f89249a = dateSelectionField;
    }

    /* renamed from: a */
    public final void mo19885a(Object obj) {
        DateSelectionField dateSelectionField = this.f89249a;
        LocalDate localDate = Instant.ofEpochMilli(((Long) obj).longValue()).atZone(ZoneOffset.UTC).toLocalDate();
        int year = localDate.getYear();
        int monthValue = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();
        if (dateSelectionField.f89061c >= 0 && dateSelectionField.f89062d != null) {
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
            C50976bu buVar = (C50976bu) dateSelectionField.f89062d.getItem(dateSelectionField.f89061c);
            if (buVar != null) {
                String g = C33233k.m61641g(year, monthValue, dayOfMonth, Locale.getDefault());
                C50973br brVar = (C50973br) buVar.toBuilder();
                brVar.copyOnWrite();
                C50976bu buVar2 = (C50976bu) brVar.instance;
                g.getClass();
                buVar2.f132705a |= 32;
                buVar2.f132710f = g;
                brVar.copyOnWrite();
                C50976bu buVar3 = (C50976bu) brVar.instance;
                qbVar4.getClass();
                buVar3.f132707c = qbVar4;
                buVar3.f132705a |= 4;
                C50976bu buVar4 = (C50976bu) brVar.build();
                dateSelectionField.f89062d.insert(buVar4, dateSelectionField.f89061c);
                C33280am amVar = dateSelectionField.f89062d;
                amVar.remove((C50976bu) amVar.getItem(dateSelectionField.f89061c + 1));
                dateSelectionField.f89062d.notifyDataSetChanged();
                dateSelectionField.mo38694a(buVar4);
            }
        }
    }
}
