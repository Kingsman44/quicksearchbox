package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130696a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.assistant.p3860as.C49783bs;
import com.google.assistant.p3860as.C49784bt;
import com.google.assistant.p3860as.C49789c;
import com.google.assistant.p3860as.C49790d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.b */
/* compiled from: PG */
public final /* synthetic */ class C130763b implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f357971a;

    public /* synthetic */ C130763b(int i) {
        this.f357971a = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = this.f357971a;
        C49790d dVar = (C49790d) obj;
        C130696a b = C130701b.m213087b();
        b.mo109786b(dVar.f128574a);
        b.mo109787c(C130786p.m213158a(dVar));
        double a = C130786p.m213158a(dVar);
        C49783bs bsVar = (C49783bs) C49784bt.f128552i.createBuilder();
        int a2 = C49789c.m85712a(dVar.f128577d);
        if (a2 != 0 && a2 == 3 && ((double) dVar.f128576c) < 1.0d) {
            bsVar.copyOnWrite();
            C49784bt btVar = (C49784bt) bsVar.instance;
            btVar.f128554a |= 128;
            btVar.f128561h = true;
        }
        if (i - 1 != 1) {
            bsVar.copyOnWrite();
            C49784bt btVar2 = (C49784bt) bsVar.instance;
            btVar2.f128554a |= 32;
            btVar2.f128559f = a;
        } else {
            bsVar.copyOnWrite();
            C49784bt btVar3 = (C49784bt) bsVar.instance;
            btVar3.f128554a |= 64;
            btVar3.f128560g = a;
        }
        b.mo109788d((C49784bt) bsVar.build());
        return b.mo109785a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
