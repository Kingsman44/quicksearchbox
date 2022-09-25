package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.mdi.download.d.ew */
/* compiled from: PG */
public final /* synthetic */ class C29082ew implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78930a;

    /* renamed from: b */
    public final /* synthetic */ C29334dr f78931b;

    public /* synthetic */ C29082ew(C29117fe feVar, C29334dr drVar) {
        this.f78930a = feVar;
        this.f78931b = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78930a;
        C29334dr drVar = this.f78931b;
        C58528ij ijVar = (C58528ij) obj;
        ArrayList arrayList = new ArrayList();
        for (C29328dl dlVar : drVar.f79512n) {
            if (!C29099m.m54015k(dlVar)) {
                int a = C29332dp.m54217a(drVar.f79507i);
                if (a == 0) {
                    a = 1;
                }
                C29398ev a2 = C29292lr.m54176a(dlVar, a);
                if (!ijVar.contains(a2)) {
                    arrayList.add(feVar.f78976e.mo34637a(a2));
                }
            }
        }
        return C29672d.m54726a(arrayList).mo34823a(C28936ca.f78599a, feVar.f78980i);
    }
}
