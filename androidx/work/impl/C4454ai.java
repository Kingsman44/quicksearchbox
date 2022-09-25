package androidx.work.impl;

import androidx.work.impl.p207b.C4470ae;
import androidx.work.impl.p207b.C4471af;
import androidx.work.impl.p207b.C4488aw;
import androidx.work.impl.utils.C4601h;
import java.util.List;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.ai */
/* compiled from: PG */
public final /* synthetic */ class C4454ai implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ WorkDatabase f14153a;

    /* renamed from: b */
    public final /* synthetic */ C4470ae f14154b;

    /* renamed from: c */
    public final /* synthetic */ C4470ae f14155c;

    /* renamed from: d */
    public final /* synthetic */ List f14156d;

    /* renamed from: e */
    public final /* synthetic */ String f14157e;

    /* renamed from: f */
    public final /* synthetic */ Set f14158f;

    /* renamed from: g */
    public final /* synthetic */ boolean f14159g;

    public /* synthetic */ C4454ai(WorkDatabase workDatabase, C4470ae aeVar, C4470ae aeVar2, List list, String str, Set set, boolean z) {
        this.f14153a = workDatabase;
        this.f14154b = aeVar;
        this.f14155c = aeVar2;
        this.f14156d = list;
        this.f14157e = str;
        this.f14158f = set;
        this.f14159g = z;
    }

    public final void run() {
        WorkDatabase workDatabase = this.f14153a;
        C4470ae aeVar = this.f14154b;
        C4470ae aeVar2 = this.f14155c;
        List list = this.f14156d;
        String str = this.f14157e;
        Set set = this.f14158f;
        boolean z = this.f14159g;
        C69664n.m101061g(workDatabase, "$workDatabase");
        C69664n.m101061g(list, "$schedulers");
        C69664n.m101061g(str, "$workSpecId");
        C69664n.m101061g(set, "$tags");
        C4471af F = workDatabase.mo9364F();
        C4488aw G = workDatabase.mo9365G();
        C4470ae g = C4470ae.m12718g(aeVar, (String) null, aeVar2.f14218c, aeVar2.f14227l, aeVar2.f14230o, aeVar2.f14236u + 1, 515069);
        C4601h.m12996a(list, g);
        F.mo9438r(g);
        G.mo9447b(str);
        G.mo9448c(str, set);
        if (!z) {
            F.mo9442v(str, -1);
            workDatabase.mo9363E().mo9405a(str);
        }
    }
}
