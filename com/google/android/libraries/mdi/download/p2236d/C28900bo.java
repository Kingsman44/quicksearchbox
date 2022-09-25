package com.google.android.libraries.mdi.download.p2236d;

import android.util.Pair;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29035b;
import com.google.android.libraries.mdi.download.p2257l.C29671c;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.mdi.download.d.bo */
/* compiled from: PG */
public final /* synthetic */ class C28900bo implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78494a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f78495b;

    /* renamed from: c */
    public final /* synthetic */ C29392ep f78496c;

    /* renamed from: d */
    public final /* synthetic */ C58495hd f78497d;

    /* renamed from: e */
    public final /* synthetic */ C60931s f78498e;

    /* renamed from: f */
    public final /* synthetic */ C29035b f78499f;

    public /* synthetic */ C28900bo(C29117fe feVar, C60870cx cxVar, C29392ep epVar, C58495hd hdVar, C60931s sVar, C29035b bVar) {
        this.f78494a = feVar;
        this.f78495b = cxVar;
        this.f78496c = epVar;
        this.f78497d = hdVar;
        this.f78498e = sVar;
        this.f78499f = bVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78494a;
        C60870cx cxVar = this.f78495b;
        C29392ep epVar = this.f78496c;
        C58495hd hdVar = this.f78497d;
        C60931s sVar = this.f78498e;
        C29035b bVar = this.f78499f;
        C29334dr drVar = (C29334dr) obj;
        boolean booleanValue = ((Boolean) ((Pair) C60856cj.m92909r(cxVar)).first).booleanValue();
        boolean z = !booleanValue;
        ArrayList arrayList = new ArrayList();
        for (C29328dl dlVar : drVar.f79512n) {
            if (dlVar.f79474c.startsWith("inlinefile")) {
                int a = C29332dp.m54217a(drVar.f79507i);
                if (a == 0) {
                    a = 1;
                }
                C29398ev a2 = C29292lr.m54176a(dlVar, a);
                C58495hd hdVar2 = hdVar;
                ArrayList arrayList2 = arrayList;
                arrayList2.add(C60922j.m93045h(feVar.f78976e.mo34640d(a2), C47810es.m84966f(new C28834aq(feVar, hdVar, dlVar, epVar, a2, drVar)), feVar.f78980i));
                arrayList = arrayList2;
                hdVar = hdVar2;
            }
        }
        ArrayList arrayList3 = arrayList;
        C29671c a3 = C29672d.m54726a(arrayList3);
        C29117fe feVar2 = feVar;
        C60931s sVar2 = sVar;
        C29066eg egVar = r1;
        C29066eg egVar2 = new C29066eg(feVar2, epVar, drVar, z, sVar2, bVar);
        return C60922j.m93045h(a3.mo34824b(egVar, feVar.f78980i), C47810es.m84966f(new C29077er(feVar2, arrayList3, epVar, drVar, booleanValue)), feVar.f78980i);
    }
}
