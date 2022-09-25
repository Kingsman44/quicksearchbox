package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.C11339f;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11317e;
import com.google.android.material.datepicker.C44607ac;
import com.google.android.material.datepicker.C44608ad;
import com.google.android.material.datepicker.C44625au;
import com.google.assistant.p3897e.p3902c.p3907c.C50975bt;
import com.google.assistant.p3897e.p3902c.p3907c.C50976bu;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.common.p4526f.C59052c;
import java.util.Calendar;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.aj */
/* compiled from: PG */
public final /* synthetic */ class C11350aj implements C11339f {

    /* renamed from: a */
    public final /* synthetic */ DateSelectionField f37079a;

    public /* synthetic */ C11350aj(DateSelectionField dateSelectionField) {
        this.f37079a = dateSelectionField;
    }

    /* renamed from: a */
    public final void mo19808a(int i) {
        DateSelectionField dateSelectionField = this.f37079a;
        C50976bu buVar = (C50976bu) dateSelectionField.f36972d.getItem(i);
        if (buVar != null) {
            int a = C50975bt.m85998a(buVar.f132711g);
            if (a != 0 && a == 2) {
                dateSelectionField.f36971c = i;
                C50976bu buVar2 = (C50976bu) dateSelectionField.f36972d.getItem(i);
                if (dateSelectionField.f37156o == null) {
                    ((C59052c) ((C59052c) DateSelectionField.f36969a.mo56226d()).mo56372aa(43250)).mo56386p("fragmentActivity is null.");
                } else if (dateSelectionField.f37155n.mo19521b(30)) {
                    long timeInMillis = C44625au.m79085f().getTimeInMillis();
                    if (!(buVar2 == null || (buVar2.f132705a & 4) == 0)) {
                        C52393qb qbVar = buVar2.f132707c;
                        if (qbVar == null) {
                            qbVar = C52393qb.f137479e;
                        }
                        Calendar instance = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        instance.set(qbVar.f137482b, qbVar.f137483c - 1, qbVar.f137484d);
                        timeInMillis = instance.getTimeInMillis();
                    }
                    C44607ac a2 = C44607ac.m79052a();
                    a2.f116212e = Long.valueOf(timeInMillis);
                    C44608ad b = a2.mo47838b();
                    b.f116213a.add(new C11353am(dateSelectionField));
                    b.showNow(dateSelectionField.f37156o.mo545jw(), "MaterialDatePickerFragment");
                } else if (buVar2 == null || (buVar2.f132705a & 4) == 0) {
                    C11317e.m26930a(dateSelectionField.f37156o, dateSelectionField).mo19752c();
                } else {
                    C52393qb qbVar2 = buVar2.f132707c;
                    if (qbVar2 == null) {
                        qbVar2 = C52393qb.f137479e;
                    }
                    C11317e.m26931b(dateSelectionField.f37156o, dateSelectionField, qbVar2.f137482b, qbVar2.f137483c, qbVar2.f137484d).mo19752c();
                }
            } else if (i != dateSelectionField.f36971c) {
                dateSelectionField.f36971c = i;
                dateSelectionField.mo19839c(buVar);
            }
        }
    }
}
