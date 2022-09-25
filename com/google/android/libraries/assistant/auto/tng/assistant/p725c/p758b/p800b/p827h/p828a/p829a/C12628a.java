package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a.p829a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p797c.p798a.p799a.C12395b;
import com.google.android.libraries.assistant.auto.tng.common.p931p.C13314n;
import com.google.android.libraries.assistant.auto.tng.p1349x.C16905d;
import com.google.android.libraries.assistant.auto.tng.p1349x.C16906e;
import com.google.android.libraries.assistant.auto.tng.p1349x.C16912k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import dagger.p5294a.C68221g;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C12628a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f39613a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f39614b;

    /* renamed from: c */
    public final /* synthetic */ Executor f39615c;

    /* renamed from: d */
    public final /* synthetic */ C69464a f39616d;

    /* renamed from: e */
    public final /* synthetic */ C12395b f39617e;

    public /* synthetic */ C12628a(boolean z, C60870cx cxVar, Executor executor, C69464a aVar, C12395b bVar) {
        this.f39613a = z;
        this.f39614b = cxVar;
        this.f39615c = executor;
        this.f39616d = aVar;
        this.f39617e = bVar;
    }

    public final void run() {
        boolean z = this.f39613a;
        C60870cx cxVar = this.f39614b;
        Executor executor = this.f39615c;
        C69464a aVar = this.f39616d;
        C12395b bVar = this.f39617e;
        if (z) {
            C57981b a = C13314n.m29569a(cxVar, executor);
            C16906e eVar = (C16906e) aVar.mo17428b();
            int i = bVar.f39246c;
            int i2 = bVar.f39247d;
            Executor executor2 = (Executor) eVar.f49421a.mo17428b();
            executor2.getClass();
            C16912k kVar = (C16912k) eVar.f49422b.mo17428b();
            kVar.getClass();
            C58833ax axVar = (C58833ax) ((C68221g) eVar.f49423c).f184583a;
            axVar.getClass();
            C58833ax axVar2 = (C58833ax) ((C68221g) eVar.f49424d).f184583a;
            axVar2.getClass();
            a.mo20440jJ(new C16905d(executor2, kVar, axVar, axVar2, i, i2));
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
    }
}
