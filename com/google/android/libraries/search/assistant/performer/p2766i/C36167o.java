package com.google.android.libraries.search.assistant.performer.p2766i;

import com.google.android.gms.reminders.model.C145834f;
import com.google.android.gms.reminders.model.C145841m;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.MonthlyPattern;
import com.google.android.gms.reminders.model.Time;
import com.google.android.gms.reminders.model.TimeEntity;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.p3924c.C51739j;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.o */
/* compiled from: PG */
public final class C36167o implements C35472h {

    /* renamed from: a */
    public static final C59071e f94518a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.i.o");

    /* renamed from: b */
    public final AccountId f94519b;

    /* renamed from: c */
    public final C46128f f94520c;

    /* renamed from: d */
    public final C39141kp f94521d;

    /* renamed from: e */
    public final C60950i f94522e;

    /* renamed from: f */
    public final C36129ah f94523f;

    public C36167o(C36129ah ahVar, AccountId accountId, C46128f fVar, C39141kp kpVar, C60950i iVar) {
        this.f94523f = ahVar;
        this.f94519b = accountId;
        this.f94520c = fVar;
        this.f94521d = kpVar;
        this.f94522e = iVar;
    }

    /* renamed from: b */
    public static DateTime m64565b(C52393qb qbVar) {
        C145834f fVar = new C145834f();
        fVar.f394367a = Integer.valueOf(qbVar.f137482b);
        fVar.f394368b = Integer.valueOf(qbVar.f137483c);
        fVar.f394369c = Integer.valueOf(qbVar.f137484d);
        return fVar.mo122198a();
    }

    /* renamed from: c */
    public static MonthlyPattern m64566c(C52397qf qfVar) {
        C145841m mVar = new C145841m();
        boolean z = !qfVar.f137497e.isEmpty();
        if (z != (!qfVar.f137498f.isEmpty())) {
            if (z) {
                for (Integer intValue : qfVar.f137497e) {
                    mVar.mo122212b(Integer.valueOf(intValue.intValue()));
                }
            } else if (qfVar.f137496d.size() == 1) {
                mVar.mo122213c(Integer.valueOf(qfVar.f137496d.mo58914d(0)));
                if (qfVar.f137498f.size() == 1) {
                    mVar.f394383a = Integer.valueOf(qfVar.f137498f.mo58914d(0));
                } else {
                    throw new IllegalArgumentException("ARP can only create monthly reminder with one single week-of-month");
                }
            } else {
                throw new IllegalArgumentException("ARP can only create monthly reminder with one single day-of-week");
            }
            return mVar.mo122211a();
        }
        throw new IllegalArgumentException(String.format("A monthly recurring pattern must be EITHER by by-day or by-week, but not both or none. Got recurrence: %s", new Object[]{qfVar}));
    }

    /* renamed from: d */
    public static Time m64567d(C52403ql qlVar) {
        return new TimeEntity(Integer.valueOf(qlVar.f137515b), Integer.valueOf(qlVar.f137516c), Integer.valueOf(qlVar.f137517d));
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        return C36183e.m64583a(dyVar, "args", C51739j.f135736i.getParserForType(), new C36160h(this));
    }
}
