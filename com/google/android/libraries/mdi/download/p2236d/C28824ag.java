package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2256k.C29667b;
import com.google.android.libraries.mdi.p2213d.p2218b.C28620a;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.mdi.download.d.ag */
/* compiled from: PG */
public final /* synthetic */ class C28824ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78300a;

    /* renamed from: b */
    public final /* synthetic */ Map f78301b;

    /* renamed from: c */
    public final /* synthetic */ C29392ep f78302c;

    /* renamed from: d */
    public final /* synthetic */ Set f78303d;

    public /* synthetic */ C28824ag(C29117fe feVar, Map map, C29392ep epVar, Set set) {
        this.f78300a = feVar;
        this.f78301b = map;
        this.f78302c = epVar;
        this.f78303d = set;
    }

    public final C60870cx apply(Object obj) {
        int a;
        C29117fe feVar = this.f78300a;
        Map map = this.f78301b;
        C29392ep epVar = this.f78302c;
        Set set = this.f78303d;
        C29334dr drVar = (C29334dr) obj;
        if (drVar == null) {
            return C60866ct.f164955a;
        }
        map.put(epVar, drVar);
        Iterator it = drVar.f79512n.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                break;
            }
            C29328dl dlVar = (C29328dl) it.next();
            int a2 = C29332dp.m54217a(drVar.f79507i);
            if (a2 != 0) {
                i = a2;
            }
            set.add(C29292lr.m54176a(dlVar, i));
        }
        if (!feVar.f78982k.mo56113h() || (a = C29667b.m54713a(drVar.f79515q)) == 0 || a == 1) {
            return C60866ct.f164955a;
        }
        return ((C28620a) ((C58881cr) feVar.f78982k.mo56107c()).mo6453a()).mo34293a();
    }
}
