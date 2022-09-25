package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C49860br;
import com.google.assistant.p3861at.C49863bu;
import com.google.assistant.p3861at.C50382v;
import com.google.assistant.p3861at.C50409w;
import com.google.assistant.p3861at.act;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.b */
/* compiled from: PG */
public final /* synthetic */ class C10340b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C10325al f35025a;

    /* renamed from: b */
    public final /* synthetic */ C49860br f35026b;

    public /* synthetic */ C10340b(C10325al alVar, C49860br brVar) {
        this.f35025a = alVar;
        this.f35026b = brVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C10325al alVar = this.f35025a;
        C49860br brVar = this.f35026b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C60856cj.m92900i(act.f128872P);
        }
        C51058ev evVar = (C51058ev) optional.get();
        brVar.copyOnWrite();
        C49863bu buVar = (C49863bu) brVar.instance;
        C49863bu buVar2 = C49863bu.f129572f;
        evVar.getClass();
        buVar.f129578e = evVar;
        buVar.f129574a |= 2;
        C49863bu buVar3 = (C49863bu) brVar.build();
        acu acu = (acu) acv.f128920X.createBuilder();
        C50382v vVar = (C50382v) C50409w.f131206c.createBuilder();
        vVar.copyOnWrite();
        C50409w wVar = (C50409w) vVar.instance;
        buVar3.getClass();
        wVar.f131209b = buVar3;
        wVar.f131208a = 3;
        C50409w wVar2 = (C50409w) vVar.build();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        wVar2.getClass();
        acv.f128937P = wVar2;
        acv.f128947c |= 1;
        return alVar.f34987b.mo17840e(acu, TimeUnit.SECONDS);
    }
}
