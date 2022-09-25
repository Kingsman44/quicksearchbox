package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11626b;
import com.google.android.libraries.assistant.auto.tng.common.p933q.C13336t;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15488n;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.g */
/* compiled from: PG */
public final class C11605g implements C11626b {

    /* renamed from: a */
    public static final C59071e f37539a = C59071e.m91332i("com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.g");

    /* renamed from: b */
    public final Executor f37540b;

    /* renamed from: c */
    public final C15488n f37541c;

    /* renamed from: d */
    private final Set f37542d;

    public C11605g(Executor executor, C15488n nVar, Set set) {
        this.f37540b = executor;
        this.f37541c = nVar;
        this.f37542d = set;
    }

    /* renamed from: a */
    public final C60870cx mo20077a() {
        return C13336t.m29581d(this.f37542d, new C11581b(this), this.f37540b).mo51515h(C11601c.f37535a, this.f37540b).mo51513e(Throwable.class, C11602d.f37536a, this.f37540b);
    }

    /* renamed from: b */
    public final void mo20078b() {
        this.f37541c.mo19974a(C37179a.f97626dm);
        C60870cx e = C60856cj.m92896e((Iterable) Collection.EL.stream(this.f37542d).map(C11554a.f37463a).collect(C58370cn.f155946a));
        C11604f fVar = new C11604f(this);
        C60856cj.m92911t(e, C47810es.m84974n(fVar), this.f37540b);
    }
}
