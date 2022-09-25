package com.google.android.apps.search.assistant.verticals.reminders.p10076c.p10077a;

import android.content.Context;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.MonthlyPattern;
import com.google.assistant.p3897e.p3921j.C52392qa;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52396qe;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.protobuf.C62947c;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.reminders.c.a.g */
/* compiled from: PG */
public final class C132549g {

    /* renamed from: a */
    public final Executor f361727a;

    /* renamed from: b */
    public final Context f361728b;

    public C132549g(Context context, Executor executor) {
        this.f361728b = context;
        this.f361727a = executor;
    }

    /* renamed from: a */
    public static C52393qb m215472a(DateTime dateTime) {
        C52392qa qaVar = (C52392qa) C52393qb.f137479e.createBuilder();
        int intValue = dateTime.mo121999o().intValue();
        qaVar.copyOnWrite();
        C52393qb qbVar = (C52393qb) qaVar.instance;
        qbVar.f137481a |= 1;
        qbVar.f137482b = intValue;
        int intValue2 = dateTime.mo121997m().intValue();
        qaVar.copyOnWrite();
        C52393qb qbVar2 = (C52393qb) qaVar.instance;
        qbVar2.f137481a |= 2;
        qbVar2.f137483c = intValue2;
        int intValue3 = dateTime.mo121996l().intValue();
        qaVar.copyOnWrite();
        C52393qb qbVar3 = (C52393qb) qaVar.instance;
        qbVar3.f137481a |= 4;
        qbVar3.f137484d = intValue3;
        return (C52393qb) qaVar.build();
    }

    /* renamed from: b */
    public static void m215473b(MonthlyPattern monthlyPattern, C52396qe qeVar) {
        if (monthlyPattern.mo122030j() == null || monthlyPattern.mo122030j().isEmpty()) {
            qeVar.mo53854e(monthlyPattern.mo122029i().intValue());
            qeVar.mo53852c(monthlyPattern.mo122028h().intValue() % 7);
            return;
        }
        List j = monthlyPattern.mo122030j();
        qeVar.copyOnWrite();
        C52397qf qfVar = (C52397qf) qeVar.instance;
        C52397qf qfVar2 = C52397qf.f137491j;
        qfVar.mo53856b();
        C62947c.addAll((Iterable) j, (List) qfVar.f137497e);
    }
}
