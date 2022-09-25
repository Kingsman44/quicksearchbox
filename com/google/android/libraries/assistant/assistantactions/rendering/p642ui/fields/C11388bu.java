package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.app.FragmentManager;
import android.support.p031v4.app.C0167am;
import android.text.format.Time;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11330r;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11331s;
import com.google.assistant.p3897e.p3902c.p3907c.C51125hh;
import com.google.assistant.p3897e.p3921j.C52392qa;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.Calendar;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bu */
/* compiled from: PG */
final class C11388bu implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ RecurrenceSelectionField f37125a;

    public C11388bu(RecurrenceSelectionField recurrenceSelectionField) {
        this.f37125a = recurrenceSelectionField;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0167am amVar;
        FragmentManager fragmentManager;
        C51125hh hhVar;
        C58833ax axVar;
        C51125hh hhVar2;
        C51125hh hhVar3;
        C51125hh hhVar4;
        C51125hh hhVar5;
        if (!(this.f37125a.f37153l == null || motionEvent.getAction() != 0 || (amVar = this.f37125a.f37156o) == null || (fragmentManager = amVar.getFragmentManager()) == null)) {
            String currentTimezone = Time.getCurrentTimezone();
            C58833ax axVar2 = C58836b.f156633a;
            C51941eu euVar = this.f37125a.f37153l.f36729a;
            if (euVar.f136277e == 7) {
                hhVar = (C51125hh) euVar.f136278f;
            } else {
                hhVar = C51125hh.f133077g;
            }
            if ((hhVar.f133079a & 2) != 0) {
                C51941eu euVar2 = this.f37125a.f37153l.f36729a;
                if (euVar2.f136277e == 7) {
                    hhVar5 = (C51125hh) euVar2.f136278f;
                } else {
                    hhVar5 = C51125hh.f133077g;
                }
                C52397qf qfVar = hhVar5.f133081c;
                if (qfVar == null) {
                    qfVar = C52397qf.f137491j;
                }
                C58833ax k = C58833ax.m90834k(qfVar);
                axVar = axVar2;
                axVar2 = k;
            } else {
                Calendar instance = Calendar.getInstance();
                C52392qa qaVar = (C52392qa) C52393qb.f137479e.createBuilder();
                int i = instance.get(1);
                qaVar.copyOnWrite();
                C52393qb qbVar = (C52393qb) qaVar.instance;
                qbVar.f137481a |= 1;
                qbVar.f137482b = i;
                int i2 = instance.get(2);
                qaVar.copyOnWrite();
                C52393qb qbVar2 = (C52393qb) qaVar.instance;
                qbVar2.f137481a |= 2;
                qbVar2.f137483c = i2 + 1;
                int i3 = instance.get(5);
                qaVar.copyOnWrite();
                C52393qb qbVar3 = (C52393qb) qaVar.instance;
                qbVar3.f137481a |= 4;
                qbVar3.f137484d = i3;
                axVar = C58833ax.m90834k((C52393qb) qaVar.build());
                C51941eu euVar3 = this.f37125a.f37153l.f36729a;
                int i4 = euVar3.f136277e;
                if (i4 == 7) {
                    hhVar3 = (C51125hh) euVar3.f136278f;
                } else {
                    hhVar3 = C51125hh.f133077g;
                }
                if ((hhVar3.f133079a & 4) != 0) {
                    if (i4 == 7) {
                        hhVar4 = (C51125hh) euVar3.f136278f;
                    } else {
                        hhVar4 = C51125hh.f133077g;
                    }
                    C52397qf qfVar2 = hhVar4.f133082d;
                    if (qfVar2 == null) {
                        qfVar2 = C52397qf.f137491j;
                    }
                    if ((2 & qfVar2.f137493a) != 0) {
                        C52393qb qbVar4 = qfVar2.f137501i;
                        if (qbVar4 == null) {
                            qbVar4 = C52393qb.f137479e;
                        }
                        axVar = C58833ax.m90834k(qbVar4);
                    }
                }
            }
            C11331s sVar = (C11331s) fragmentManager.findFragmentByTag("recurrencePickerTag");
            C51941eu euVar4 = this.f37125a.f37153l.f36729a;
            if (euVar4.f136277e == 7) {
                hhVar2 = (C51125hh) euVar4.f136278f;
            } else {
                hhVar2 = C51125hh.f133077g;
            }
            boolean z = hhVar2.f133083e;
            if (sVar == null) {
                if (axVar2.mo56113h()) {
                    C11387bt btVar = new C11387bt(this.f37125a);
                    C11330r rVar = new C11330r(currentTimezone, (C52397qf) axVar2.mo56107c(), z);
                    sVar = new C11331s();
                    sVar.mo19763c(rVar, btVar);
                } else if (axVar.mo56113h()) {
                    sVar = C11331s.m26942b(currentTimezone, (C52393qb) axVar.mo56107c(), z, new C11387bt(this.f37125a));
                }
            } else if (axVar2.mo56113h()) {
                sVar.mo19763c(new C11330r(currentTimezone, (C52397qf) axVar2.mo56107c(), z), new C11387bt(this.f37125a));
            } else if (axVar.mo56113h()) {
                sVar.mo19763c(new C11330r(currentTimezone, (C52393qb) axVar.mo56107c(), z), new C11387bt(this.f37125a));
            }
            C0167am amVar2 = this.f37125a.f37156o;
            if (amVar2 != null) {
                sVar.show(amVar2.getFragmentManager(), "recurrencePickerTag");
            }
        }
        return true;
    }
}
