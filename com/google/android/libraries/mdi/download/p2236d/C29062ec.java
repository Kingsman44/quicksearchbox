package com.google.android.libraries.mdi.download.p2236d;

import android.os.Build;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29380ed;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.mdi.download.d.ec */
/* compiled from: PG */
public final /* synthetic */ class C29062ec implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78874a;

    /* renamed from: b */
    public final /* synthetic */ C29380ed f78875b;

    /* renamed from: c */
    public final /* synthetic */ C29392ep f78876c;

    /* renamed from: d */
    public final /* synthetic */ C60931s f78877d;

    public /* synthetic */ C29062ec(C29117fe feVar, C29380ed edVar, C29392ep epVar, C60931s sVar) {
        this.f78874a = feVar;
        this.f78875b = edVar;
        this.f78876c = epVar;
        this.f78877d = sVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C29117fe feVar = this.f78874a;
        C29380ed edVar = this.f78875b;
        C29392ep epVar = this.f78876c;
        C60931s sVar = this.f78877d;
        C29334dr drVar = (C29334dr) obj;
        if (edVar == null && (edVar = drVar.f79510l) == null) {
            edVar = C29380ed.f79641f;
        }
        C29380ed edVar2 = edVar;
        ArrayList arrayList = new ArrayList();
        for (C29328dl dlVar : drVar.f79512n) {
            if (!C29099m.m54015k(dlVar)) {
                int a = C29332dp.m54217a(drVar.f79507i);
                if (a == 0) {
                    a = 1;
                }
                C29398ev a2 = C29292lr.m54176a(dlVar, a);
                if (Build.VERSION.SDK_INT >= 30) {
                    C60870cx f = feVar.f78976e.mo34642f(a2);
                    C28896bk bkVar = new C28896bk(feVar, a2, drVar, dlVar);
                    Class<C29291lq> cls = C29291lq.class;
                    C60870cx h = C60846c.m92879h(f, cls, C47810es.m84966f(bkVar), feVar.f78980i);
                    C28897bl blVar = new C28897bl(feVar, drVar, dlVar, a2);
                    C28988de deVar = new C28988de(feVar, epVar, dlVar, a2, edVar2, drVar);
                    cxVar = C60922j.m93045h(C60922j.m93045h(h, C47810es.m84966f(blVar), feVar.f78980i), C47810es.m84966f(deVar), feVar.f78980i);
                } else {
                    try {
                        cxVar = feVar.f78976e.mo34643g(epVar, dlVar, a2, edVar2, drVar.f79513o, drVar.f79514p);
                    } catch (RuntimeException e) {
                        C28736bn bnVar = new C28736bn();
                        bnVar.f78062a = C28737bo.UNKNOWN_ERROR;
                        bnVar.f78064c = e;
                        cxVar = C60856cj.m92899h(bnVar.mo34334a());
                    }
                }
                arrayList.add(cxVar);
            }
        }
        return C29672d.m54726a(arrayList).mo34824b(new C28945cj(feVar, epVar, drVar, sVar, arrayList), feVar.f78980i);
    }
}
