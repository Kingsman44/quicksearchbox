package androidx.work.impl.utils;

import androidx.work.C4380ad;
import androidx.work.C4384ah;
import androidx.work.C4388al;
import androidx.work.C4394ar;
import androidx.work.impl.C4452ag;
import androidx.work.impl.C4463ar;
import androidx.work.impl.C4558n;
import androidx.work.impl.C4562r;
import androidx.work.impl.C4564t;
import androidx.work.impl.C4565u;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p207b.C4471af;
import androidx.work.impl.p207b.C4492b;
import java.util.LinkedList;

/* renamed from: androidx.work.impl.utils.e */
/* compiled from: PG */
public abstract class C4598e implements Runnable {

    /* renamed from: d */
    public final C4558n f14494d = new C4558n();

    /* renamed from: b */
    static final void m12992b(C4452ag agVar, String str) {
        C4463ar arVar;
        C4463ar arVar2;
        WorkDatabase workDatabase = agVar.f14143e;
        C4471af F = workDatabase.mo9364F();
        C4492b z = workDatabase.mo9366z();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C4394ar a = F.mo9421a(str2);
            if (!(a == C4394ar.SUCCEEDED || a == C4394ar.FAILED)) {
                F.mo9445y(C4394ar.CANCELLED, str2);
            }
            linkedList.addAll(z.mo9449a(str2));
        }
        C4562r rVar = agVar.f14145g;
        synchronized (rVar.f14405i) {
            C4380ad h = C4380ad.m12560h();
            String str3 = C4562r.f14397a;
            h.mo9309a(str3, "Processor cancelling " + str);
            rVar.f14404h.add(str);
            arVar = (C4463ar) rVar.f14401e.remove(str);
            arVar2 = arVar == null ? (C4463ar) rVar.f14402f.remove(str) : arVar;
            if (arVar2 != null) {
                rVar.f14403g.remove(str);
            }
        }
        C4562r.m12939e(str, arVar2);
        if (arVar != null) {
            rVar.mo9516d();
        }
        for (C4564t b : agVar.f14144f) {
            b.mo9474b(str);
        }
    }

    /* renamed from: c */
    static final void m12993c(C4452ag agVar) {
        C4565u.m12952b(agVar.f14142d, agVar.f14143e, agVar.f14144f);
    }

    /* renamed from: a */
    public abstract void mo9548a();

    public final void run() {
        try {
            mo9548a();
            this.f14494d.mo9510b(C4388al.f14014a);
        } catch (Throwable th) {
            this.f14494d.mo9510b(new C4384ah(th));
        }
    }
}
