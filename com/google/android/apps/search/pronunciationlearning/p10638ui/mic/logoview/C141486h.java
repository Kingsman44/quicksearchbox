package com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview;

import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141476a;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141477b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.logoview.h */
/* compiled from: PG */
final class C141486h extends C141492n {
    public C141486h() {
        super("THINKING");
    }

    /* renamed from: a */
    public final void mo116501a(C141477b bVar) {
        bVar.f384026f.mo116490b(3.0f);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C141476a aVar = (C141476a) it.next();
            aVar.f384010a.f384006a.mo116478c(5.656f);
            aVar.f384014e.f384006a.mo116478c(0.0f);
        }
        bVar.mo116486b(4.712389f, bVar.f384022b);
        bVar.f384022b.f384011b.f383996a.f384006a.mo116478c(4.712389f);
        bVar.f384023c.f384011b.f383996a.f384006a.mo116478c(0.0f);
        bVar.f384024d.f384011b.f383996a.f384006a.mo116478c(1.5707964f);
        bVar.f384025e.f384011b.f383996a.f384006a.mo116478c(3.1415927f);
    }

    /* renamed from: b */
    public final void mo116502b(C141477b bVar) {
        bVar.mo116486b(0.0f, bVar.f384022b);
        C141476a aVar = bVar.f384022b;
        float f = aVar.f384011b.f383996a.f384006a.f383997a;
        C141476a aVar2 = bVar.f384023c;
        float f2 = aVar2.f384011b.f383996a.f384006a.f383997a;
        C141476a aVar3 = bVar.f384024d;
        float f3 = aVar3.f384011b.f383996a.f384006a.f383997a;
        C141476a aVar4 = bVar.f384025e;
        float f4 = f3 - f2;
        float f5 = aVar4.f384011b.f383996a.f384006a.f383997a - f3;
        if (f2 - f > 1.5707964f) {
            bVar.mo116486b(0.0f, aVar2);
        } else if (f4 > 1.5707964f) {
            bVar.mo116486b(1.5707964f, aVar3);
        } else if (f5 > 1.5707964f) {
            bVar.mo116486b(3.1415927f, aVar4);
        } else {
            bVar.mo116486b(4.712389f, aVar);
        }
        bVar.f384022b.f384011b.f383996a.f384006a.mo116478c(4.712389f);
        bVar.f384023c.f384011b.f383996a.f384006a.mo116478c(0.0f);
        bVar.f384024d.f384011b.f383996a.f384006a.mo116478c(1.5707964f);
        bVar.f384025e.f384011b.f383996a.f384006a.mo116478c(3.1415927f);
    }

    /* renamed from: c */
    public final boolean mo116503c(long j, long j2, C141477b bVar) {
        float f;
        C141477b bVar2 = bVar;
        float f2 = ((float) (j2 - j)) / 6000.0f;
        float f3 = f2 - ((float) ((int) f2));
        C141476a aVar = bVar2.f384022b;
        C141476a aVar2 = bVar2.f384023c;
        C141476a aVar3 = bVar2.f384024d;
        C141476a aVar4 = bVar2.f384025e;
        if (f3 < 0.16749999f) {
            aVar.f384011b.f383996a.f384006a.mo116478c(4.712389f);
            aVar2.f384011b.f383996a.f384006a.mo116478c(0.0f);
            aVar3.f384011b.f383996a.f384006a.mo116478c(1.5707964f);
            aVar4.f384011b.f383996a.f384006a.mo116478c(3.1415927f);
        } else {
            double d = (double) f3;
            if (d < 0.25d) {
                aVar.f384011b.f383996a.f384006a.mo116478c(4.712389f);
                aVar2.f384011b.f383996a.f384006a.mo116478c(1.5707964f);
                aVar3.f384011b.f383996a.f384006a.mo116478c(2.6179938f);
                aVar4.f384011b.f383996a.f384006a.mo116478c(3.6651917f);
            } else if (f3 < 0.4175f) {
                aVar.f384011b.f383996a.f384006a.mo116478c(0.0f);
                aVar2.f384011b.f383996a.f384006a.mo116478c(1.5707964f);
                aVar3.f384011b.f383996a.f384006a.mo116478c(3.1415927f);
                aVar4.f384011b.f383996a.f384006a.mo116478c(4.712389f);
            } else if (d < 0.5d) {
                aVar.f384011b.f383996a.f384006a.mo116478c(0.5235988f);
                aVar2.f384011b.f383996a.f384006a.mo116478c(1.5707964f);
                aVar3.f384011b.f383996a.f384006a.mo116478c(4.712389f);
                aVar4.f384011b.f383996a.f384006a.mo116478c(5.759587f);
            } else if (f3 < 0.6675f) {
                aVar.f384011b.f383996a.f384006a.mo116478c(1.5707964f);
                aVar2.f384011b.f383996a.f384006a.mo116478c(3.1415927f);
                aVar3.f384011b.f383996a.f384006a.mo116478c(4.712389f);
                aVar4.f384011b.f383996a.f384006a.mo116478c(0.0f);
            } else if (d < 0.75d) {
                aVar.f384011b.f383996a.f384006a.mo116478c(2.6179938f);
                aVar2.f384011b.f383996a.f384006a.mo116478c(3.6651917f);
                aVar3.f384011b.f383996a.f384006a.mo116478c(4.712389f);
                aVar4.f384011b.f383996a.f384006a.mo116478c(1.5707964f);
            } else if (f3 < 0.9175f) {
                aVar.f384011b.f383996a.f384006a.mo116478c(3.1415927f);
                aVar2.f384011b.f383996a.f384006a.mo116478c(4.712389f);
                aVar3.f384011b.f383996a.f384006a.mo116478c(0.0f);
                aVar4.f384011b.f383996a.f384006a.mo116478c(1.5707964f);
            } else if (f3 < 1.0f) {
                aVar.f384011b.f383996a.f384006a.mo116478c(4.712389f);
                aVar2.f384011b.f383996a.f384006a.mo116478c(5.759587f);
                aVar3.f384011b.f383996a.f384006a.mo116478c(0.5235988f);
                aVar4.f384011b.f383996a.f384006a.mo116478c(1.5707964f);
            }
            f = 2.0f;
            bVar2.f384026f.mo116490b(f * 3.0f);
            return true;
        }
        f = 1.0f;
        bVar2.f384026f.mo116490b(f * 3.0f);
        return true;
    }
}
