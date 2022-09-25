package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import com.google.android.apps.gsa.assistant.settings.p516d.C9525a;
import com.google.android.apps.gsa.assistant.settings.shared.p5795f.C73748d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C50283ri;
import com.google.assistant.p3861at.C50284rj;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.p4522b.C58526ih;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.a */
/* compiled from: PG */
public final class C9858a {

    /* renamed from: a */
    private final C9525a f33890a;

    /* renamed from: b */
    private final Set f33891b;

    /* renamed from: c */
    private final Set f33892c;

    /* renamed from: d */
    private final C86124t f33893d;

    public C9858a(C9525a aVar, Set set, Set set2, C86124t tVar) {
        this.f33890a = aVar;
        this.f33891b = set;
        this.f33892c = set2;
        this.f33893d = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo18081a() {
        acu acu = (acu) acv.f128920X.createBuilder();
        C50283ri riVar = (C50283ri) C50284rj.f130766f.createBuilder();
        C58526ih ihVar = new C58526ih();
        for (C73748d b : this.f33892c) {
            ihVar.mo55373c(b.mo65220b());
        }
        riVar.mo53389a(ihVar.mo55486f());
        Set<C49875cf> set = this.f33891b;
        riVar.copyOnWrite();
        C50284rj rjVar = (C50284rj) riVar.instance;
        C62961ch chVar = rjVar.f130771d;
        if (!chVar.mo58948c()) {
            rjVar.f130771d = C62942bv.mutableCopy(chVar);
        }
        for (C49875cf cfVar : set) {
            rjVar.f130771d.mo58916g(cfVar.f129621v);
        }
        boolean e = this.f33893d.mo79746e(C90059dk.f249061aX);
        riVar.copyOnWrite();
        C50284rj rjVar2 = (C50284rj) riVar.instance;
        rjVar2.f130768a |= 2;
        rjVar2.f130772e = e;
        riVar.copyOnWrite();
        C50284rj rjVar3 = (C50284rj) riVar.instance;
        rjVar3.f130768a |= 1;
        rjVar3.f130770c = true;
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        C50284rj rjVar4 = (C50284rj) riVar.build();
        rjVar4.getClass();
        acv.f128931J = rjVar4;
        acv.f128946b |= 65536;
        acu.copyOnWrite();
        acv acv2 = (acv) acu.instance;
        acv2.f128945a |= 128;
        acv2.f128952h = true;
        return this.f33890a.mo17840e(acu, TimeUnit.SECONDS);
    }
}
