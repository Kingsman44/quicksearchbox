package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j;

import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50795cs;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.common.base.C58817ah;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.j.d */
/* compiled from: PG */
public final /* synthetic */ class C131394d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131401k f359186a;

    /* renamed from: b */
    public final /* synthetic */ C50818do f359187b;

    /* renamed from: c */
    public final /* synthetic */ long f359188c;

    public /* synthetic */ C131394d(C131401k kVar, C50818do doVar, long j) {
        this.f359186a = kVar;
        this.f359187b = doVar;
        this.f359188c = j;
    }

    public final Object apply(Object obj) {
        C131401k kVar = this.f359186a;
        C50818do doVar = this.f359187b;
        long j = this.f359188c;
        C50729n nVar = (C50729n) obj;
        Instant a = kVar.f359200c.mo57444a();
        Instant plus = a.plus(kVar.f359204g);
        C50790cn cnVar = (C50790cn) doVar.toBuilder();
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        nVar.getClass();
        doVar2.f132314k = nVar;
        doVar2.f132304a |= 512;
        C50701am amVar = C131393c.f359185a;
        int hashCode = C131392b.m213858a(j).hashCode();
        cnVar.copyOnWrite();
        C50818do doVar3 = (C50818do) cnVar.instance;
        doVar3.f132304a |= 4;
        doVar3.f132307d = hashCode;
        long epochMilli = a.toEpochMilli();
        cnVar.copyOnWrite();
        C50818do doVar4 = (C50818do) cnVar.instance;
        doVar4.f132304a |= 4096;
        doVar4.f132317n = epochMilli;
        long epochMilli2 = a.toEpochMilli();
        cnVar.copyOnWrite();
        C50818do doVar5 = (C50818do) cnVar.instance;
        doVar5.f132304a |= 8192;
        doVar5.f132318o = epochMilli2;
        long millis = kVar.f359204g.toMillis();
        cnVar.copyOnWrite();
        C50818do doVar6 = (C50818do) cnVar.instance;
        doVar6.f132304a |= 16384;
        doVar6.f132319p = millis;
        C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
        long epochMilli3 = plus.toEpochMilli();
        csVar.copyOnWrite();
        C50796ct ctVar = (C50796ct) csVar.instance;
        ctVar.f132225a |= 1;
        ctVar.f132226b = epochMilli3;
        cnVar.copyOnWrite();
        C50818do doVar7 = (C50818do) cnVar.instance;
        C50796ct ctVar2 = (C50796ct) csVar.build();
        ctVar2.getClass();
        doVar7.f132320q = ctVar2;
        doVar7.f132304a |= 32768;
        return (C50818do) cnVar.build();
    }
}
