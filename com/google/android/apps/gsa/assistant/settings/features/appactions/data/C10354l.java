package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C49852bj;
import com.google.assistant.p3861at.C49853bk;
import com.google.assistant.p3861at.C50382v;
import com.google.assistant.p3861at.C50409w;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.l */
/* compiled from: PG */
public final /* synthetic */ class C10354l implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C10325al f35040a;

    public /* synthetic */ C10354l(C10325al alVar) {
        this.f35040a = alVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C10325al alVar = this.f35040a;
        List list = (List) obj;
        C49852bj bjVar = (C49852bj) C49853bk.f129556b.createBuilder();
        bjVar.copyOnWrite();
        C49853bk bkVar = (C49853bk) bjVar.instance;
        C62971cq cqVar = bkVar.f129558a;
        if (!cqVar.mo58948c()) {
            bkVar.f129558a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) bkVar.f129558a);
        C49853bk bkVar2 = (C49853bk) bjVar.build();
        acu acu = (acu) acv.f128920X.createBuilder();
        C50382v vVar = (C50382v) C50409w.f131206c.createBuilder();
        vVar.copyOnWrite();
        C50409w wVar = (C50409w) vVar.instance;
        bkVar2.getClass();
        wVar.f131209b = bkVar2;
        wVar.f131208a = 1;
        C50409w wVar2 = (C50409w) vVar.build();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        wVar2.getClass();
        acv.f128937P = wVar2;
        acv.f128947c = 1 | acv.f128947c;
        return alVar.f34987b.mo17840e(acu, TimeUnit.SECONDS);
    }
}
