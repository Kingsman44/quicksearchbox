package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33258q;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.assistant.p3897e.p3902c.p3907c.C51125hh;
import com.google.assistant.p3897e.p3921j.C52392qa;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.LocalDate;
import p3186j$.time.ZoneId;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.df */
/* compiled from: PG */
public final /* synthetic */ class C33354df implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ RecurrenceSelectionField f89396a;

    public /* synthetic */ C33354df(RecurrenceSelectionField recurrenceSelectionField) {
        this.f89396a = recurrenceSelectionField;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C51125hh hhVar;
        C51125hh hhVar2;
        C51125hh hhVar3;
        C51125hh hhVar4;
        C51125hh hhVar5;
        RecurrenceSelectionField recurrenceSelectionField = this.f89396a;
        if (motionEvent.getAction() == 0) {
            if (recurrenceSelectionField.f89175c == null || recurrenceSelectionField.f89179g == null) {
                C59104x d = RecurrenceSelectionField.f89173a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "RepeatSelectionField");
                ((C59052c) ((C59052c) d).mo56372aa(51143)).mo56386p("Failed to show RecurrencePicker due to invalid args");
            } else {
                String zoneId = ZoneId.systemDefault().toString();
                C33259r rVar = (C33259r) recurrenceSelectionField.f89179g.getChildFragmentManager().f634a.mo671c(C33259r.f88929b);
                C51941eu euVar = recurrenceSelectionField.f89175c;
                if (euVar.f136277e == 7) {
                    hhVar = (C51125hh) euVar.f136278f;
                } else {
                    hhVar = C51125hh.f133077g;
                }
                boolean z = hhVar.f133083e;
                C51941eu euVar2 = recurrenceSelectionField.f89175c;
                int i = euVar2.f136277e;
                if (i == 7) {
                    hhVar2 = (C51125hh) euVar2.f136278f;
                } else {
                    hhVar2 = C51125hh.f133077g;
                }
                if ((hhVar2.f133079a & 2) != 0) {
                    if (i == 7) {
                        hhVar5 = (C51125hh) euVar2.f136278f;
                    } else {
                        hhVar5 = C51125hh.f133077g;
                    }
                    C52397qf qfVar = hhVar5.f133081c;
                    if (qfVar == null) {
                        qfVar = C52397qf.f137491j;
                    }
                    if (rVar == null) {
                        rVar = C33259r.m61672b(zoneId, qfVar, z, recurrenceSelectionField);
                    } else {
                        rVar.mo38637d(new C33258q(zoneId, qfVar, z), recurrenceSelectionField);
                    }
                } else {
                    LocalDate now = LocalDate.now(ZoneId.systemDefault());
                    C52392qa qaVar = (C52392qa) C52393qb.f137479e.createBuilder();
                    int year = now.getYear();
                    qaVar.copyOnWrite();
                    C52393qb qbVar = (C52393qb) qaVar.instance;
                    qbVar.f137481a |= 1;
                    qbVar.f137482b = year;
                    int monthValue = now.getMonthValue();
                    qaVar.copyOnWrite();
                    C52393qb qbVar2 = (C52393qb) qaVar.instance;
                    qbVar2.f137481a |= 2;
                    qbVar2.f137483c = monthValue;
                    int dayOfMonth = now.getDayOfMonth();
                    qaVar.copyOnWrite();
                    C52393qb qbVar3 = (C52393qb) qaVar.instance;
                    qbVar3.f137481a |= 4;
                    qbVar3.f137484d = dayOfMonth;
                    C52393qb qbVar4 = (C52393qb) qaVar.build();
                    C51941eu euVar3 = recurrenceSelectionField.f89175c;
                    int i2 = euVar3.f136277e;
                    if (i2 == 7) {
                        hhVar3 = (C51125hh) euVar3.f136278f;
                    } else {
                        hhVar3 = C51125hh.f133077g;
                    }
                    if ((hhVar3.f133079a & 4) != 0) {
                        if (i2 == 7) {
                            hhVar4 = (C51125hh) euVar3.f136278f;
                        } else {
                            hhVar4 = C51125hh.f133077g;
                        }
                        C52397qf qfVar2 = hhVar4.f133082d;
                        if (qfVar2 == null) {
                            qfVar2 = C52397qf.f137491j;
                        }
                        if ((qfVar2.f137493a & 2) != 0 && (qbVar4 = qfVar2.f137501i) == null) {
                            qbVar4 = C52393qb.f137479e;
                        }
                    }
                    if (rVar == null) {
                        rVar = C33259r.m61673c(zoneId, qbVar4, z, recurrenceSelectionField);
                    } else {
                        rVar.mo38637d(new C33258q(zoneId, qbVar4, z), recurrenceSelectionField);
                    }
                }
                rVar.showNow(recurrenceSelectionField.f89179g.getChildFragmentManager(), C33259r.f88929b);
            }
        }
        return true;
    }
}
