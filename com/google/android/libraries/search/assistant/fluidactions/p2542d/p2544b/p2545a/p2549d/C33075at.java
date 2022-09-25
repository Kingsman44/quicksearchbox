package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x;
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
import com.google.common.p4526f.C59071e;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.at */
/* compiled from: PG */
public final /* synthetic */ class C33075at implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C51953ff f88543a;

    public /* synthetic */ C33075at(C51953ff ffVar) {
        this.f88543a = ffVar;
    }

    public final Object apply(Object obj) {
        C50997co coVar;
        C50997co coVar2;
        C50993ck ckVar;
        C50993ck ckVar2;
        C51953ff ffVar = this.f88543a;
        Optional optional = (Optional) obj;
        C59071e eVar = C33079ax.f88551a;
        C51593nl nlVar = (C51593nl) C51594nm.f134474f.createBuilder();
        Optional g = C33136x.m61490g("duration", ffVar);
        Optional g2 = C33136x.m61490g("label", ffVar);
        C51588ng ngVar = (C51588ng) C51592nk.f134462k.createBuilder();
        if (g.isPresent()) {
            C51941eu euVar = (C51941eu) g.get();
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
        if (g2.isPresent()) {
            C51941eu euVar2 = (C51941eu) g2.get();
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
        if (optional.isPresent()) {
            String str2 = (String) optional.get();
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
