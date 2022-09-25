package androidx.work.impl;

import android.content.Context;
import androidx.work.C4380ad;
import androidx.work.C4409e;
import androidx.work.impl.background.systemjob.C4535b;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.p207b.C4470ae;
import androidx.work.impl.p207b.C4471af;
import androidx.work.impl.utils.C4609p;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.work.impl.u */
/* compiled from: PG */
public final class C4565u {

    /* renamed from: a */
    private static final String f14411a = C4380ad.m12561i("Schedulers");

    /* renamed from: a */
    static C4564t m12951a(Context context, C4452ag agVar) {
        C4535b bVar = new C4535b(context, agVar);
        C4609p.m13004a(context, SystemJobService.class, true);
        C4380ad.m12560h().mo9309a(f14411a, "Created SystemJobScheduler and enabled SystemJobService");
        return bVar;
    }

    /* renamed from: b */
    public static void m12952b(C4409e eVar, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            C4471af F = workDatabase.mo9364F();
            workDatabase.mo8181p();
            try {
                List<C4470ae> c = F.mo9423c(eVar.f14070j);
                List t = F.mo9440t();
                if (c != null && c.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (C4470ae aeVar : c) {
                        F.mo9442v(aeVar.f14217b, currentTimeMillis);
                    }
                }
                workDatabase.mo8188w();
                if (c != null && c.size() > 0) {
                    C4470ae[] aeVarArr = (C4470ae[]) c.toArray(new C4470ae[c.size()]);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C4564t tVar = (C4564t) it.next();
                        if (tVar.mo9476d()) {
                            tVar.mo9475c(aeVarArr);
                        }
                    }
                }
                if (t != null && t.size() > 0) {
                    C4470ae[] aeVarArr2 = (C4470ae[]) t.toArray(new C4470ae[t.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C4564t tVar2 = (C4564t) it2.next();
                        if (!tVar2.mo9476d()) {
                            tVar2.mo9475c(aeVarArr2);
                        }
                    }
                }
            } finally {
                workDatabase.mo8183r();
            }
        }
    }
}
