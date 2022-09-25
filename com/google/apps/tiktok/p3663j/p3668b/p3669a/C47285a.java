package com.google.apps.tiktok.p3663j.p3668b.p3669a;

import androidx.work.C4381ae;
import androidx.work.C4410f;
import androidx.work.C4634o;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.p3663j.C47350h;
import com.google.apps.tiktok.p3663j.p3668b.C47305am;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.apps.tiktok.j.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C47285a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C47287c f122938a;

    public /* synthetic */ C47285a(C47287c cVar) {
        this.f122938a = cVar;
    }

    public final C60870cx apply(Object obj) {
        C47287c cVar = this.f122938a;
        Map map = (Map) obj;
        if (map.isEmpty()) {
            return C60866ct.f164955a;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : map.entrySet()) {
            C47305am amVar = (C47305am) value.getValue();
            C46578l lVar = cVar.f122940a;
            C46582p j = C46586t.m83063j(C47289e.class);
            Set c = amVar.mo51170c();
            StringBuilder sb = new StringBuilder("SyncTask");
            Iterator it = new TreeSet(c).iterator();
            while (it.hasNext()) {
                sb.append(((C47350h) it.next()).f123073d);
                sb.append('_');
            }
            C46570d dVar = (C46570d) j;
            dVar.f121757f = C58833ax.m90834k(new C46574h(sb.toString(), C4634o.REPLACE));
            dVar.f121754c = new C46573g(Math.max(0, amVar.mo51168a() - cVar.f122941b.mo26870b()), TimeUnit.MILLISECONDS);
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (C47350h hVar : amVar.mo51170c()) {
                boolean z4 = true;
                z |= hVar == C47350h.ON_CHARGER;
                z3 |= hVar == C47350h.ON_NETWORK_CONNECTED;
                if (hVar != C47350h.ON_NETWORK_UNMETERED) {
                    z4 = false;
                }
                z2 |= z4;
            }
            C4410f fVar = new C4410f();
            fVar.f14071a = z;
            if (z2) {
                fVar.mo9351c(C4381ae.UNMETERED);
            } else if (z3) {
                fVar.mo9351c(C4381ae.CONNECTED);
            }
            dVar.f121753b = fVar.mo9349a();
            arrayList.add(lVar.mo50546b(j.mo50561a()));
        }
        return C60856cj.m92894c(arrayList).mo57334a(C47286b.f122939a, C60826bg.f164896a);
    }
}
