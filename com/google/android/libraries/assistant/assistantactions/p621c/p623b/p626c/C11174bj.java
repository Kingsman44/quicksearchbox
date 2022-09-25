package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q;
import com.google.assistant.p3897e.p3902c.p3907c.C50991ci;
import com.google.assistant.p3897e.p3902c.p3907c.C50993ck;
import com.google.assistant.p3897e.p3902c.p3907c.C50997co;
import com.google.assistant.p3897e.p3917i.p3918a.C51588ng;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import com.google.assistant.p3897e.p3917i.p3918a.C51593nl;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.assistant.p3897e.p3921j.C52460so;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.bj */
/* compiled from: PG */
public final /* synthetic */ class C11174bj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C51953ff f36551a;

    public /* synthetic */ C11174bj(C51953ff ffVar) {
        this.f36551a = ffVar;
    }

    public final Object apply(Object obj) {
        C50997co coVar;
        C50997co coVar2;
        C50993ck ckVar;
        C50993ck ckVar2;
        C51953ff ffVar = this.f36551a;
        C58833ax axVar = (C58833ax) obj;
        C59071e eVar = C11178bn.f36558a;
        C51593nl nlVar = (C51593nl) C51594nm.f134474f.createBuilder();
        C58833ax g = C11222q.m26610g("duration", ffVar);
        C58833ax g2 = C11222q.m26610g("label", ffVar);
        C51588ng ngVar = (C51588ng) C51592nk.f134462k.createBuilder();
        if (g.mo56113h()) {
            C51941eu euVar = (C51941eu) g.mo56107c();
            if (euVar.f136277e == 21) {
                ckVar = (C50993ck) euVar.f136278f;
            } else {
                ckVar = C50993ck.f132751e;
            }
            if ((ckVar.f132753a & 2) != 0) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (euVar.f136277e == 21) {
                    ckVar2 = (C50993ck) euVar.f136278f;
                } else {
                    ckVar2 = C50993ck.f132751e;
                }
                C50991ci ciVar = ckVar2.f132756d;
                if (ciVar == null) {
                    ciVar = C50991ci.f132741h;
                }
                C52460so soVar = ciVar.f132749g;
                if (soVar == null) {
                    soVar = C52460so.f137714d;
                }
                long millis = timeUnit.toMillis(soVar.f137717b);
                ngVar.copyOnWrite();
                C51592nk nkVar = (C51592nk) ngVar.instance;
                nkVar.f134464a |= 4;
                nkVar.f134469f = millis;
            }
        }
        if (g2.mo56113h()) {
            C51941eu euVar2 = (C51941eu) g2.mo56107c();
            if (euVar2.f136277e == 4) {
                coVar = (C50997co) euVar2.f136278f;
            } else {
                coVar = C50997co.f132759h;
            }
            if ((coVar.f132761a & 4) != 0) {
                if (euVar2.f136277e == 4) {
                    coVar2 = (C50997co) euVar2.f136278f;
                } else {
                    coVar2 = C50997co.f132759h;
                }
                String str = coVar2.f132764d;
                ngVar.copyOnWrite();
                C51592nk nkVar2 = (C51592nk) ngVar.instance;
                str.getClass();
                nkVar2.f134464a |= 32;
                nkVar2.f134470g = str;
            }
        }
        if (axVar.mo56113h()) {
            String str2 = (String) axVar.mo56107c();
            nlVar.copyOnWrite();
            C51594nm nmVar = (C51594nm) nlVar.instance;
            str2.getClass();
            nmVar.f134476a |= 4;
            nmVar.f134480e = str2;
        }
        nlVar.mo53650d((C51592nk) ngVar.build());
        return (C51594nm) nlVar.build();
    }
}
