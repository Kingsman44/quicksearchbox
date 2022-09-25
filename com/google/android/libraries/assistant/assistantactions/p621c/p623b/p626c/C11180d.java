package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q;
import com.google.assistant.p3897e.p3902c.p3907c.C50997co;
import com.google.assistant.p3897e.p3902c.p3907c.C51125hh;
import com.google.assistant.p3897e.p3902c.p3907c.C51146ib;
import com.google.assistant.p3897e.p3902c.p3907c.C51148id;
import com.google.assistant.p3897e.p3917i.p3918a.C51446i;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3917i.p3918a.C51500k;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import java.util.Random;
import java.util.UUID;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.d */
/* compiled from: PG */
public final /* synthetic */ class C11180d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C11182f f36572a;

    /* renamed from: b */
    public final /* synthetic */ C51953ff f36573b;

    public /* synthetic */ C11180d(C11182f fVar, C51953ff ffVar) {
        this.f36572a = fVar;
        this.f36573b = ffVar;
    }

    public final Object apply(Object obj) {
        C50997co coVar;
        C50997co coVar2;
        C51125hh hhVar;
        C51125hh hhVar2;
        C51148id idVar;
        C51148id idVar2;
        C11182f fVar = this.f36572a;
        C51953ff ffVar = this.f36573b;
        C58833ax axVar = (C58833ax) obj;
        C51500k kVar = (C51500k) C51527l.f134273f.createBuilder();
        C58833ax g = C11222q.m26610g("datetime", ffVar);
        C58833ax g2 = C11222q.m26610g("recurrence", ffVar);
        C58833ax g3 = C11222q.m26610g("label", ffVar);
        C51446i iVar = (C51446i) C51473j.f134090i.createBuilder();
        if (g.mo56113h()) {
            C51941eu euVar = (C51941eu) g.mo56107c();
            if (euVar.f136277e == 9) {
                idVar = (C51148id) euVar.f136278f;
            } else {
                idVar = C51148id.f133140f;
            }
            if ((idVar.f133142a & 2) != 0) {
                if (euVar.f136277e == 9) {
                    idVar2 = (C51148id) euVar.f136278f;
                } else {
                    idVar2 = C51148id.f133140f;
                }
                C51146ib ibVar = idVar2.f133144c;
                if (ibVar == null) {
                    ibVar = C51146ib.f133130h;
                }
                C52403ql qlVar = ibVar.f133134c;
                if (qlVar == null) {
                    qlVar = C52403ql.f137512f;
                }
                iVar.copyOnWrite();
                C51473j jVar = (C51473j) iVar.instance;
                qlVar.getClass();
                jVar.f134096e = qlVar;
                jVar.f134092a |= 2;
            }
        }
        if (g2.mo56113h()) {
            C51941eu euVar2 = (C51941eu) g2.mo56107c();
            if (euVar2.f136277e == 7) {
                hhVar = (C51125hh) euVar2.f136278f;
            } else {
                hhVar = C51125hh.f133077g;
            }
            if ((hhVar.f133079a & 2) != 0) {
                if (euVar2.f136277e == 7) {
                    hhVar2 = (C51125hh) euVar2.f136278f;
                } else {
                    hhVar2 = C51125hh.f133077g;
                }
                C52397qf qfVar = hhVar2.f133081c;
                if (qfVar == null) {
                    qfVar = C52397qf.f137491j;
                }
                iVar.copyOnWrite();
                C51473j jVar2 = (C51473j) iVar.instance;
                qfVar.getClass();
                jVar2.f134094c = qfVar;
                jVar2.f134093b = 4;
            }
        }
        if (g3.mo56113h()) {
            C51941eu euVar3 = (C51941eu) g3.mo56107c();
            if (euVar3.f136277e == 4) {
                coVar = (C50997co) euVar3.f136278f;
            } else {
                coVar = C50997co.f132759h;
            }
            if ((coVar.f132761a & 4) != 0) {
                if (euVar3.f136277e == 4) {
                    coVar2 = (C50997co) euVar3.f136278f;
                } else {
                    coVar2 = C50997co.f132759h;
                }
                String str = coVar2.f132764d;
                iVar.copyOnWrite();
                C51473j jVar3 = (C51473j) iVar.instance;
                str.getClass();
                jVar3.f134092a |= 64;
                jVar3.f134099h = str;
            }
        }
        if (axVar.mo56113h()) {
            String str2 = (String) axVar.mo56107c();
            kVar.copyOnWrite();
            C51527l lVar = (C51527l) kVar.instance;
            str2.getClass();
            lVar.f134275a |= 8;
            lVar.f134279e = str2;
            if (fVar.f36581h == C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY && ((String) axVar.mo56107c()).equals("com.google.android.deskclock")) {
                Random random = new Random();
                String uuid = new UUID((random.nextLong() & -61441) | 16384, (random.nextLong() & 4611686018427387903L) | Long.MIN_VALUE).toString();
                iVar.copyOnWrite();
                C51473j jVar4 = (C51473j) iVar.instance;
                uuid.getClass();
                jVar4.f134092a |= 1;
                jVar4.f134095d = uuid;
            }
        }
        kVar.mo53629a((C51473j) iVar.build());
        return (C51527l) kVar.build();
    }
}
