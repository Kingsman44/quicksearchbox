package com.google.android.libraries.search.p2904c.p2928g;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.p2906aa.C37329d;
import com.google.android.libraries.search.p2904c.p2911c.C37423a;
import com.google.android.libraries.search.p2904c.p2911c.C37433c;
import com.google.android.libraries.search.p2904c.p2911c.C37446p;
import com.google.android.libraries.search.p2904c.p2985y.p2986a.C38281b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.c.g.f */
/* compiled from: PG */
public final class C37621f {

    /* renamed from: a */
    private final C37620e f99974a;

    /* renamed from: b */
    private final C37433c f99975b;

    public C37621f(C37620e eVar, C37433c cVar) {
        this.f99974a = eVar;
        this.f99975b = cVar;
    }

    /* renamed from: a */
    public final C37619d mo41034a(C37360ay ayVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        int c = C37329d.m66335c(ayVar);
        if (ayVar.f99236k) {
            C37620e eVar = this.f99974a;
            C37446p c2 = this.f99975b.mo40957c(ayVar, axVar3);
            C38281b bVar = (C38281b) eVar.f99972a.mo17428b();
            bVar.getClass();
            Executor executor = (Executor) eVar.f99973b.mo17428b();
            executor.getClass();
            return new C37619d(c, C58833ax.m90834k(c2), C58836b.f156633a, axVar, axVar2, bVar, executor);
        }
        C37620e eVar2 = this.f99974a;
        C37423a a = this.f99975b.mo40955a(ayVar);
        C38281b bVar2 = (C38281b) eVar2.f99972a.mo17428b();
        bVar2.getClass();
        Executor executor2 = (Executor) eVar2.f99973b.mo17428b();
        executor2.getClass();
        return new C37619d(c, C58836b.f156633a, C58833ax.m90834k(a), axVar, axVar2, bVar2, executor2);
    }
}
