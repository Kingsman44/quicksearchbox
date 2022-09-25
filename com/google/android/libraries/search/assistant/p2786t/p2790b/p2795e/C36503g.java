package com.google.android.libraries.search.assistant.p2786t.p2790b.p2795e;

import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.libraries.search.assistant.t.b.e.g */
/* compiled from: PG */
final class C36503g implements C36501e {

    /* renamed from: a */
    private final C68214a f95269a;

    /* renamed from: b */
    private final Executor f95270b;

    public C36503g(C68214a aVar, Executor executor) {
        this.f95269a = aVar;
        this.f95270b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo40204a(C36499c cVar, Supplier supplier) {
        return mo40205b(cVar, supplier, 0);
    }

    /* renamed from: b */
    public final C60870cx mo40205b(C36499c cVar, Supplier supplier, int i) {
        C58872ci d = C58872ci.m90947d(C58274c.f155808a);
        C60870cx cxVar = (C60870cx) supplier.get();
        C36502f fVar = new C36502f(this, cVar, d, i);
        C60856cj.m92911t(cxVar, C47810es.m84974n(fVar), this.f95270b);
        return cxVar;
    }

    /* renamed from: c */
    public final void mo40206c(C36498b bVar, C58872ci ciVar, int i) {
        long a = ciVar.mo56158a(TimeUnit.MILLISECONDS);
        ((C19569f) ((C39141kp) this.f95269a.mo27525b()).f102791B.mo6453a()).mo24824b((double) a, bVar.mo40203c(), String.valueOf(i));
        ((C19567d) ((C39141kp) this.f95269a.mo27525b()).f102790A.mo6453a()).mo24822a(1, bVar.mo40203c(), String.valueOf(i));
    }
}
