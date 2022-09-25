package com.google.android.libraries.search.assistant.p2868z.p2869a.p2870a;

import com.google.android.libraries.search.assistant.p2868z.p2869a.C37164b;
import com.google.android.libraries.search.assistant.p2868z.p2869a.C37165c;
import com.google.android.libraries.search.assistant.p2868z.p2869a.C37167e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.p3644h.C47117b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3861at.C50134lv;
import com.google.assistant.p3861at.C50135lw;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.C50148mi;
import com.google.assistant.p3861at.C50149mj;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.acx;
import com.google.assistant.p3861at.aeq;
import com.google.assistant.p3861at.aer;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66652ds;
import com.google.speech.p5208h.p5209a.C66531b;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.z.a.a.j */
/* compiled from: PG */
public final class C37160j implements C37165c {

    /* renamed from: a */
    public final C66652ds f96759a;

    /* renamed from: b */
    public final String f96760b = "https://www.googleapis.com/auth/assistant";

    /* renamed from: c */
    private final AccountId f96761c;

    /* renamed from: d */
    private final C47117b f96762d;

    public C37160j(AccountId accountId, C66652ds dsVar, C47117b bVar) {
        this.f96761c = accountId;
        this.f96759a = dsVar;
        this.f96762d = bVar;
    }

    /* renamed from: c */
    private final C60870cx m65917c(C66607ce ceVar, Function function, Optional optional) {
        return C60922j.m93045h(this.f96762d.mo51025b(this.f96761c), C47810es.m84966f(new C37154d(this, ceVar, function, optional)), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo40669a(C37164b bVar) {
        C50148mi miVar = (C50148mi) C50149mj.f130370k.createBuilder();
        String e = bVar.mo40675e();
        miVar.copyOnWrite();
        C50149mj mjVar = (C50149mj) miVar.instance;
        e.getClass();
        mjVar.f130372a |= 1048576;
        mjVar.f130381j = e;
        Optional d = bVar.mo40674d();
        Objects.requireNonNull(miVar);
        d.ifPresent(new C37151a(miVar));
        C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
        C62940bt btVar = C66531b.f180943a;
        C50134lv lvVar = (C50134lv) C50135lw.f130333e.createBuilder();
        lvVar.copyOnWrite();
        C50135lw lwVar = (C50135lw) lvVar.instance;
        C50149mj mjVar2 = (C50149mj) miVar.build();
        mjVar2.getClass();
        lwVar.f130336b = mjVar2;
        lwVar.f130335a |= 1;
        acv a = bVar.mo40671a();
        lvVar.copyOnWrite();
        C50135lw lwVar2 = (C50135lw) lvVar.instance;
        a.getClass();
        lwVar2.f130337c = a;
        lwVar2.f130335a |= 2;
        C50144me meVar = (C50144me) bVar.mo40672b().orElse(C50144me.f130361d);
        lvVar.copyOnWrite();
        C50135lw lwVar3 = (C50135lw) lvVar.instance;
        meVar.getClass();
        lwVar3.f130338d = meVar;
        lwVar3.f130335a |= 4;
        cdVar.mo58885m(btVar, (C50135lw) lvVar.build());
        return m65917c((C66607ce) cdVar.build(), C37155e.f96752a, bVar.mo40673c());
    }

    /* renamed from: b */
    public final C60870cx mo40670b(C37167e eVar) {
        C50148mi miVar = (C50148mi) C50149mj.f130370k.createBuilder();
        String d = eVar.mo40682d();
        miVar.copyOnWrite();
        C50149mj mjVar = (C50149mj) miVar.instance;
        d.getClass();
        mjVar.f130372a |= 1048576;
        mjVar.f130381j = d;
        Optional c = eVar.mo40681c();
        Objects.requireNonNull(miVar);
        c.ifPresent(new C37151a(miVar));
        C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
        C62940bt btVar = C66531b.f180947e;
        aeq aeq = (aeq) aer.f129124d.createBuilder();
        aeq.copyOnWrite();
        aer aer = (aer) aeq.instance;
        C50149mj mjVar2 = (C50149mj) miVar.build();
        mjVar2.getClass();
        aer.f129127b = mjVar2;
        aer.f129126a |= 1;
        acx a = eVar.mo40679a();
        aeq.copyOnWrite();
        aer aer2 = (aer) aeq.instance;
        a.getClass();
        aer2.f129128c = a;
        aer2.f129126a |= 2;
        cdVar.mo58885m(btVar, (aer) aeq.build());
        return m65917c((C66607ce) cdVar.build(), C37153c.f96747a, eVar.mo40680b());
    }
}
