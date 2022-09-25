package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.C33266g;
import com.google.android.material.datepicker.C44607ac;
import com.google.android.material.datepicker.C44608ad;
import com.google.android.material.datepicker.C44625au;
import com.google.assistant.p3897e.p3902c.p3907c.C50975bt;
import com.google.assistant.p3897e.p3902c.p3907c.C50976bu;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.common.p4526f.C59052c;
import p3186j$.time.LocalDate;
import p3186j$.time.ZoneOffset;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.aj */
/* compiled from: PG */
public final /* synthetic */ class C33277aj implements C33266g {

    /* renamed from: a */
    public final /* synthetic */ DateSelectionField f89250a;

    public /* synthetic */ C33277aj(DateSelectionField dateSelectionField) {
        this.f89250a = dateSelectionField;
    }

    /* renamed from: a */
    public final void mo38673a(int i) {
        C50976bu buVar;
        DateSelectionField dateSelectionField = this.f89250a;
        C33280am amVar = dateSelectionField.f89062d;
        if (amVar != null && (buVar = (C50976bu) amVar.getItem(i)) != null) {
            int a = C50975bt.m85998a(buVar.f132711g);
            if (a != 0 && a == 2) {
                dateSelectionField.f89061c = i;
                C50976bu buVar2 = (C50976bu) dateSelectionField.f89062d.getItem(i);
                if (dateSelectionField.f89068j != null) {
                    long timeInMillis = C44625au.m79085f().getTimeInMillis();
                    if (!(buVar2 == null || (buVar2.f132705a & 4) == 0)) {
                        C52393qb qbVar = buVar2.f132707c;
                        if (qbVar == null) {
                            qbVar = C52393qb.f137479e;
                        }
                        timeInMillis = LocalDate.m71157of(qbVar.f137482b, qbVar.f137483c, qbVar.f137484d).atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();
                    }
                    C44607ac a2 = C44607ac.m79052a();
                    a2.mo47839c();
                    a2.f116212e = Long.valueOf(timeInMillis);
                    C44608ad b = a2.mo47838b();
                    b.f116213a.add(new C33276ai(dateSelectionField));
                    b.showNow(dateSelectionField.f89068j.getChildFragmentManager(), "MaterialDatePickerFragment");
                    return;
                }
                ((C59052c) ((C59052c) DateSelectionField.f89059a.mo56226d()).mo56372aa(51047)).mo56386p("Failed to show DatePicker due to invalid args.");
            } else if (i != dateSelectionField.f89061c) {
                dateSelectionField.f89061c = i;
                dateSelectionField.mo38694a(buVar);
            }
        }
    }
}
