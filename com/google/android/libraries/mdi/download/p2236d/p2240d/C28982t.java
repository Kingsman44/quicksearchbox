package com.google.android.libraries.mdi.download.p2236d.p2240d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2237a.C28816c;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p5570k.p5571a.C71334c;
import p5570k.p5571a.C71336e;
import p5570k.p5571a.C71337f;

/* renamed from: com.google.android.libraries.mdi.download.d.d.t */
/* compiled from: PG */
public final /* synthetic */ class C28982t implements C58817ah {
    public final Object apply(Object obj) {
        C58833ax axVar;
        HashMap hashMap = new HashMap();
        for (C28816c cVar : (Iterable) obj) {
            C29334dr a = cVar.mo34483a();
            if ((a.f79499a & 65536) != 0) {
                HashSet hashSet = new HashSet();
                C71337f fVar = a.f79519u;
                if (fVar == null) {
                    fVar = C71337f.f190517c;
                }
                int i = true != cVar.mo34484b().f79685e ? 3 : 4;
                Iterator it = fVar.f190519a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        axVar = C58836b.f156633a;
                        break;
                    }
                    C71334c cVar2 = (C71334c) it.next();
                    int a2 = C71336e.m103960a(cVar2.f190513a);
                    if (a2 == 0) {
                        a2 = 1;
                        continue;
                    }
                    if (a2 == i) {
                        axVar = C58833ax.m90834k(Integer.valueOf((int) cVar2.f190514b));
                        break;
                    }
                }
                if (axVar.mo56113h()) {
                    hashSet.add((Integer) axVar.mo56107c());
                } else {
                    C29045l.m53942n();
                }
                C71337f fVar2 = a.f79519u;
                if (fVar2 == null) {
                    fVar2 = C71337f.f190517c;
                }
                if (fVar2.f190520b.size() < 10) {
                    C71337f fVar3 = a.f79519u;
                    if (fVar3 == null) {
                        fVar3 = C71337f.f190517c;
                    }
                    hashSet.addAll(fVar3.f190520b);
                } else {
                    C71337f fVar4 = a.f79519u;
                    if (fVar4 == null) {
                        fVar4 = C71337f.f190517c;
                    }
                    C29045l.m53944p("Found more experiment ids than mendel experiment ids for logging than allowed. Found %d, limit is %d", Integer.valueOf(fVar4.f190520b.size()), 10);
                }
                if (!hashSet.isEmpty()) {
                    C28983u.m53871f(hashMap, Long.valueOf(a.f79516r)).addAll(hashSet);
                }
            }
        }
        return hashMap;
    }
}
