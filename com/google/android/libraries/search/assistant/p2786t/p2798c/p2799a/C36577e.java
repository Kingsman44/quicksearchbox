package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a;

import com.google.android.libraries.search.assistant.p2786t.p2790b.p2792b.C36476g;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36527a;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36603f;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36608k;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36609l;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36615r;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36541m;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36542n;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36543o;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36544p;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36549u;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36550v;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.e */
/* compiled from: PG */
public final /* synthetic */ class C36577e implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C36579g f95383a;

    /* renamed from: b */
    public final /* synthetic */ C36542n f95384b;

    /* renamed from: c */
    public final /* synthetic */ Optional f95385c;

    public /* synthetic */ C36577e(C36579g gVar, C36542n nVar, Optional optional) {
        this.f95383a = gVar;
        this.f95384b = nVar;
        this.f95385c = optional;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        String str;
        C36578f fVar;
        C36541m mVar;
        C36579g gVar = this.f95383a;
        C36542n nVar = this.f95384b;
        Optional optional = this.f95385c;
        int i = nVar.f95322b;
        if (i == 1) {
            C36541m mVar2 = (C36541m) nVar.f95323c;
            if ((mVar2.f95316a & 1) == 0) {
                return C60856cj.m92899h(new IllegalArgumentException("Missing observer config in request"));
            }
            C36608k kVar = mVar2.f95317b;
            if (kVar == null) {
                kVar = C36608k.f95440d;
            }
            C36609l a = C36609l.m65137a(kVar.f95443b);
            if (a == null) {
                a = C36609l.UNRECOGNIZED;
            }
            if (!gVar.f95389b.containsKey(a)) {
                return C60856cj.m92899h(new IllegalStateException("Processor has not been found for ID: " + a.getNumber()));
            }
            if (nVar.f95322b == 1) {
                mVar = (C36541m) nVar.f95323c;
            } else {
                mVar = C36541m.f95314d;
            }
            fVar = new C36578f(mVar);
            if (!nVar.f95324d) {
                str = UUID.randomUUID().toString();
                gVar.f95392e.put(str, fVar);
                C46459k.m82829b(C60856cj.m92902k(C47810es.m84965e(new C36574b(gVar, str)), C36579g.f95388a, TimeUnit.MILLISECONDS, gVar.f95390c), "Failed to schedule purge of RequestData", new Object[0]);
            } else {
                str = null;
            }
        } else if (i != 2) {
            return C60856cj.m92899h(new IllegalArgumentException("Invalid request"));
        } else {
            str = ((C36550v) nVar.f95323c).f95338b;
            fVar = (C36578f) gVar.f95392e.get(str);
            if (fVar == null) {
                return C60856cj.m92899h(new IllegalStateException("RequestData not found"));
            }
            if (nVar.f95324d) {
                gVar.f95392e.remove(str);
            }
        }
        if (optional.isPresent()) {
            fVar.f95387b.add((C36476g) optional.get());
        }
        if (!nVar.f95324d) {
            C36543o oVar = (C36543o) C36544p.f95325c.createBuilder();
            C36549u uVar = (C36549u) C36550v.f95335c.createBuilder();
            str.getClass();
            uVar.copyOnWrite();
            C36550v vVar = (C36550v) uVar.instance;
            vVar.f95337a |= 1;
            vVar.f95338b = str;
            C36550v vVar2 = (C36550v) uVar.build();
            oVar.copyOnWrite();
            C36544p pVar = (C36544p) oVar.instance;
            vVar2.getClass();
            pVar.f95328b = vVar2;
            pVar.f95327a = 1;
            return C60856cj.m92900i((C36544p) oVar.build());
        }
        C36541m mVar3 = fVar.f95386a;
        C36608k kVar2 = mVar3.f95317b;
        if (kVar2 == null) {
            kVar2 = C36608k.f95440d;
        }
        C36609l a2 = C36609l.m65137a(kVar2.f95443b);
        if (a2 == null) {
            a2 = C36609l.UNRECOGNIZED;
        }
        C69464a aVar = (C69464a) gVar.f95389b.get(a2);
        if (aVar == null) {
            return C60856cj.m92899h(new IllegalStateException("Processor has not been found for ID: " + a2.getNumber()));
        }
        C36603f fVar2 = mVar3.f95318c;
        if (fVar2 == null) {
            fVar2 = C36603f.f95436c;
        }
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(new C36528a((C36615r) aVar.mo17428b(), new C36527a(fVar2, C58485gu.m89842j(fVar.f95387b)))), gVar.f95390c)).mo51517j(C36579g.f95388a, TimeUnit.MILLISECONDS, gVar.f95390c).mo51515h(C36575c.f95380a, C60826bg.f164896a);
    }
}
