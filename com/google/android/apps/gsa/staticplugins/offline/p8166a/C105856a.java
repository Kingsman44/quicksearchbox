package com.google.android.apps.gsa.staticplugins.offline.p8166a;

import android.content.Context;
import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import com.google.common.p4522b.C58495hd;
import com.google.p4152bb.p4153a.C55130gz;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55292mz;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.a.a */
/* compiled from: PG */
public final class C105856a {

    /* renamed from: a */
    private final Map f295443a;

    public C105856a(Context context) {
        this.f295443a = C58495hd.m89900n(C55133hb.FORMATTED_TIME_DURATION, new C105857b(context));
    }

    /* renamed from: a */
    public final List mo95110a(List list, List list2, boolean z) {
        Object obj;
        HashMap hashMap = new HashMap();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C55213ka kaVar = (C55213ka) it.next();
            hashMap.put(Integer.valueOf(kaVar.f145359b), kaVar);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C55134hc hcVar = (C55134hc) it2.next();
            if (!hashMap.containsKey(Integer.valueOf(hcVar.f145122b))) {
                arrayList.add(hcVar);
            } else {
                C55213ka kaVar2 = (C55213ka) hashMap.get(Integer.valueOf(hcVar.f145122b));
                if (!((hcVar.f145121a & 2) == 0 || kaVar2 == null)) {
                    Map map = this.f295443a;
                    C55133hb a = C55133hb.m87600a(hcVar.f145123c);
                    if (a == null) {
                        a = C55133hb.NONE;
                    }
                    C105857b bVar = (C105857b) map.get(a);
                    if (bVar != null) {
                        C62940bt r4 = C62942bv.checkIsLite(C55292mz.f145644f);
                        kaVar2.mo58887l(r4);
                        if (kaVar2.f169962ag.mo58857o(r4.f169971d)) {
                            C62940bt r1 = C62942bv.checkIsLite(C55292mz.f145644f);
                            kaVar2.mo58887l(r1);
                            Object l = kaVar2.f169962ag.mo58854l(r1.f169971d);
                            if (l == null) {
                                obj = r1.f169969b;
                            } else {
                                obj = r1.mo58889c(l);
                            }
                            C55130gz gzVar = (C55130gz) C55134hc.f145119i.createBuilder();
                            String c = C89407a.m145420c(bVar.f295444a.getResources(), TimeUnit.MILLISECONDS.toSeconds(((C55292mz) obj).f145647b), z);
                            gzVar.copyOnWrite();
                            C55134hc hcVar2 = (C55134hc) gzVar.instance;
                            c.getClass();
                            hcVar2.f145121a |= 4;
                            hcVar2.f145124d = c;
                            hcVar = (C55134hc) gzVar.build();
                        }
                    }
                }
                arrayList.add(hcVar);
            }
        }
        return arrayList;
    }
}
