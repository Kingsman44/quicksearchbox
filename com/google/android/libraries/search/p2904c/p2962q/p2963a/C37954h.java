package com.google.android.libraries.search.p2904c.p2962q.p2963a;

import com.google.android.libraries.search.p2904c.p2962q.C37946a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.c.q.a.h */
/* compiled from: PG */
public final class C37954h {

    /* renamed from: b */
    private static final C59071e f100568b = C59071e.m91332i("com.google.android.libraries.search.c.q.a.h");

    /* renamed from: a */
    public final Executor f100569a;

    /* renamed from: c */
    private final Set f100570c;

    /* renamed from: d */
    private final Map f100571d = new HashMap();

    public C37954h(Set set, Executor executor) {
        this.f100570c = set;
        this.f100569a = executor;
    }

    /* renamed from: c */
    private final synchronized C60836bq m66983c(C37946a aVar) {
        if (!this.f100571d.containsKey(aVar)) {
            this.f100571d.put(aVar, new C60836bq());
        }
        return (C60836bq) this.f100571d.get(aVar);
    }

    /* renamed from: a */
    public final void mo41164a(int i, C60870cx cxVar, C60870cx cxVar2) {
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C37953g(this, i, cxVar2)), this.f100569a);
    }

    /* renamed from: b */
    public final synchronized void mo41165b() {
        ((C59052c) ((C59052c) f100568b.mo56224b()).mo56372aa(52864)).mo56386p("#audio# reportMicUpdate");
        for (C37946a aVar : this.f100570c) {
            C46459k.m82829b(m66983c(aVar).mo57304a(C47810es.m84978r(new C37951e(aVar)), this.f100569a), "Failed to notify MicUpdateListener.", new Object[0]);
        }
    }
}
