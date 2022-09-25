package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.support.p031v4.app.C0167am;
import android.text.format.Time;
import android.view.View;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11298f;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ChipComponent;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11317e;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11331s;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11333u;
import com.google.assistant.p3897e.p3902c.p3907c.C50949au;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C52392qa;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52476td;
import com.google.assistant.p3897e.p3921j.C52477te;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import java.util.Calendar;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.t */
/* compiled from: PG */
public final /* synthetic */ class C11413t implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ChipCarouselField f37168a;

    /* renamed from: b */
    public final /* synthetic */ ChipComponent f37169b;

    /* renamed from: c */
    public final /* synthetic */ C50954az f37170c;

    public /* synthetic */ C11413t(ChipCarouselField chipCarouselField, ChipComponent chipComponent, C50954az azVar) {
        this.f37168a = chipCarouselField;
        this.f37169b = chipComponent;
        this.f37170c = azVar;
    }

    public final void onClick(View view) {
        ChipCarouselField chipCarouselField = this.f37168a;
        ChipComponent chipComponent = this.f37169b;
        C50954az azVar = this.f37170c;
        if (chipCarouselField.f37153l != null && chipCarouselField.f37154m != null) {
            int a = C50949au.m85987a(azVar.f132650j);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                int i2 = chipComponent.f36826a;
                chipCarouselField.f36940a = azVar;
                chipCarouselField.f36941b = i2;
                C0167am amVar = chipCarouselField.f37156o;
                if (amVar != null) {
                    C11317e.m26930a(amVar, chipCarouselField).mo19752c();
                }
            } else if (i == 2) {
                int i3 = chipComponent.f36826a;
                chipCarouselField.f36942c = azVar;
                chipCarouselField.f36943d = i3;
                C0167am amVar2 = chipCarouselField.f37156o;
                if (amVar2 != null) {
                    C11333u.m26945a(amVar2, chipCarouselField).mo19765c();
                }
            } else if (i != 3) {
                C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
                String str = chipCarouselField.f37153l.f36729a.f136279g;
                tpVar.copyOnWrite();
                C52490tr trVar = (C52490tr) tpVar.instance;
                str.getClass();
                trVar.f137797a |= 1;
                trVar.f137800d = str;
                String str2 = chipCarouselField.f37153l.f36729a.f136280h;
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
                int i4 = chipComponent.f36826a;
                tdVar.copyOnWrite();
                C52477te teVar = (C52477te) tdVar.instance;
                teVar.f137750a |= 1;
                teVar.f137753d = (long) i4;
                tdVar.copyOnWrite();
                C52477te teVar2 = (C52477te) tdVar.instance;
                teVar2.f137750a = 2 | teVar2.f137750a;
                teVar2.f137754e = true;
                tpVar.copyOnWrite();
                C52490tr trVar4 = (C52490tr) tpVar.instance;
                C52477te teVar3 = (C52477te) tdVar.build();
                teVar3.getClass();
                trVar4.f137799c = teVar3;
                trVar4.f137798b = 16;
                C11295c cVar = chipCarouselField.f37153l;
                cVar.f36730b = (C52490tr) tpVar.build();
                C11298f a2 = chipCarouselField.f37154m.mo19691a(cVar);
                if ((azVar.f132641a & 128) != 0) {
                    C51016dg dgVar = azVar.f132646f;
                    if (dgVar == null) {
                        dgVar = C51016dg.f132827g;
                    }
                    chipCarouselField.mo19942i(dgVar, a2);
                    return;
                }
                chipCarouselField.mo19941h(a2);
            } else {
                int i5 = chipComponent.f36826a;
                chipCarouselField.f36944e = azVar;
                chipCarouselField.f36945f = i5;
                String currentTimezone = Time.getCurrentTimezone();
                Calendar instance = Calendar.getInstance();
                C52392qa qaVar = (C52392qa) C52393qb.f137479e.createBuilder();
                int i6 = instance.get(1);
                qaVar.copyOnWrite();
                C52393qb qbVar = (C52393qb) qaVar.instance;
                qbVar.f137481a |= 1;
                qbVar.f137482b = i6;
                int i7 = instance.get(2);
                qaVar.copyOnWrite();
                C52393qb qbVar2 = (C52393qb) qaVar.instance;
                qbVar2.f137481a = 2 | qbVar2.f137481a;
                qbVar2.f137483c = i7 + 1;
                int i8 = instance.get(5);
                qaVar.copyOnWrite();
                C52393qb qbVar3 = (C52393qb) qaVar.instance;
                qbVar3.f137481a |= 4;
                qbVar3.f137484d = i8;
                C52393qb qbVar4 = (C52393qb) qaVar.build();
                if (chipCarouselField.f37156o != null) {
                    C11331s.m26942b(currentTimezone, qbVar4, false, chipCarouselField).show(chipCarouselField.f37156o.getFragmentManager(), "chipCarouselRecurrencePickerTag");
                }
            }
        }
    }
}
