package com.google.android.libraries.search.p2904c.p2911c;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.p2906aa.C37329d;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37827a;
import com.google.android.libraries.search.p2904c.p2985y.p2986a.C38281b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.c.c */
/* compiled from: PG */
public final class C37433c {

    /* renamed from: a */
    public final C37450t f99379a;

    /* renamed from: b */
    private final C37447q f99380b;

    /* renamed from: c */
    private final C37432b f99381c;

    public C37433c(C37447q qVar, C37432b bVar, C37450t tVar) {
        C69664n.m101061g(bVar, "audioAccessorAudioBufferFactory");
        this.f99380b = qVar;
        this.f99381c = bVar;
        this.f99379a = tVar;
    }

    /* renamed from: a */
    public final C37423a mo40955a(C37360ay ayVar) {
        C69664n.m101061g(ayVar, "params");
        return this.f99381c.mo40954a(C37827a.m66751b(ayVar));
    }

    /* renamed from: b */
    public final C37446p mo40956b(C37360ay ayVar) {
        C69664n.m101061g(ayVar, "params");
        return mo40957c(ayVar, C58836b.f156633a);
    }

    /* renamed from: c */
    public final C37446p mo40957c(C37360ay ayVar, C58833ax axVar) {
        int i;
        C69664n.m101061g(ayVar, "params");
        int c = C37329d.m66335c(ayVar);
        int b = C37827a.m66751b(ayVar);
        if (b % c == 0) {
            i = b / c;
        } else {
            i = (b / c) + 1;
        }
        int i2 = i;
        C37447q qVar = this.f99380b;
        C38281b bVar = (C38281b) qVar.f99418a.mo17428b();
        bVar.getClass();
        Executor executor = (Executor) qVar.f99419b.mo17428b();
        executor.getClass();
        return new C37446p(i2, c, axVar, bVar, executor);
    }
}
