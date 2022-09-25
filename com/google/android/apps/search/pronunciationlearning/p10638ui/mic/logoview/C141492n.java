package com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview;

import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141476a;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141477b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.logoview.n */
/* compiled from: PG */
public abstract class C141492n {

    /* renamed from: a */
    public static final C141492n f384061a = new C141484f();

    /* renamed from: b */
    public static final C141492n f384062b = new C141485g();

    /* renamed from: c */
    public static final C141492n f384063c = new C141486h();

    /* renamed from: d */
    public static final C141492n f384064d = new C141487i();

    /* renamed from: e */
    public static final C141492n f384065e = new C141488j();

    /* renamed from: f */
    public static final C141492n f384066f = new C141489k();

    /* renamed from: g */
    public static final C141492n f384067g = new C141490l();

    /* renamed from: h */
    public static final C141492n f384068h = new C141491m();

    /* renamed from: i */
    private final String f384069i;

    public C141492n(String str) {
        this.f384069i = str;
    }

    /* renamed from: e */
    public static void m229650e(C141477b bVar, C141476a aVar, long j) {
        int a = bVar.mo116485a(aVar);
        if (aVar == bVar.f384025e) {
            a = 3;
        }
        aVar.f384014e.f384006a.mo116478c((float) Math.sin((double) ((((((float) j) - (((float) a) * 200.0f)) % 1667.0f) / 1667.0f) * 6.2831855f)));
    }

    /* renamed from: f */
    public static void m229651f(C141477b bVar, long j) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            m229650e(bVar, (C141476a) it.next(), j);
        }
    }

    /* renamed from: g */
    public static void m229652g(C141477b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C141476a aVar = (C141476a) it.next();
            aVar.f384018i.mo116478c(1.0f);
            aVar.f384014e.f384006a.mo116478c(-6.0f);
            if (aVar == bVar.f384023c) {
                aVar.f384013d.f384006a.mo116478c(-2.0f);
            }
            if (aVar == bVar.f384024d) {
                aVar.f384013d.f384006a.mo116478c(2.0f);
            }
        }
    }

    /* renamed from: h */
    public static void m229653h(C141477b bVar) {
        C141476a aVar = bVar.f384022b;
        aVar.f384010a.f384006a.mo116478c(12.0f);
        aVar.f384011b.f383996a.f384006a.mo116478c(3.1415927f);
        C141476a aVar2 = bVar.f384023c;
        aVar2.f384010a.f384006a.mo116478c(4.0f);
        aVar2.f384011b.f383996a.f384006a.mo116478c(3.1415927f);
        C141476a aVar3 = bVar.f384024d;
        aVar3.f384010a.f384006a.mo116478c(4.0f);
        aVar3.f384011b.f383996a.f384006a.mo116478c(0.0f);
        C141476a aVar4 = bVar.f384025e;
        aVar4.f384010a.f384006a.mo116478c(12.0f);
        aVar4.f384011b.f383996a.f384006a.mo116478c(0.0f);
    }

    /* renamed from: i */
    public static boolean m229654i(C141477b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            float f = ((C141476a) it.next()).f384011b.f383996a.f384006a.f383998b;
            if (f > 0.3926991f && f < 2.7488937f) {
                return false;
            }
            if (f > 3.5342917f && f < 5.8904862f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m229655j(C141477b bVar) {
        return bVar.f384022b.f384011b.f383996a.f384006a.f383997a == 3.1415927f && bVar.f384023c.f384011b.f383996a.f384006a.f383997a == 3.1415927f && bVar.f384024d.f384011b.f383996a.f384006a.f383997a == 0.0f && bVar.f384025e.f384011b.f383996a.f384006a.f383997a == 0.0f;
    }

    /* renamed from: a */
    public abstract void mo116501a(C141477b bVar);

    /* renamed from: b */
    public abstract void mo116502b(C141477b bVar);

    /* renamed from: c */
    public abstract boolean mo116503c(long j, long j2, C141477b bVar);

    public final String toString() {
        return this.f384069i;
    }
}
