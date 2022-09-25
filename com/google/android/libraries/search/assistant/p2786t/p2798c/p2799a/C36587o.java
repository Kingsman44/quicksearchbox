package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a;

import com.google.android.libraries.search.assistant.p2786t.p2798c.C36608k;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36609l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.Map;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.o */
/* compiled from: PG */
public final /* synthetic */ class C36587o implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C36591s f95405a;

    /* renamed from: b */
    public final /* synthetic */ C36608k f95406b;

    public /* synthetic */ C36587o(C36591s sVar, C36608k kVar) {
        this.f95405a = sVar;
        this.f95406b = kVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C36591s sVar = this.f95405a;
        C36608k kVar = this.f95406b;
        C36609l a = C36609l.m65137a(kVar.f95443b);
        if (a == null) {
            a = C36609l.UNRECOGNIZED;
        }
        a.getNumber();
        Map map = sVar.f95422h;
        C36609l a2 = C36609l.m65137a(kVar.f95443b);
        if (a2 == null) {
            a2 = C36609l.UNRECOGNIZED;
        }
        C36557ac acVar = (C36557ac) map.get(a2);
        if (acVar == null) {
            Map map2 = sVar.f95418d;
            C36609l a3 = C36609l.m65137a(kVar.f95443b);
            if (a3 == null) {
                a3 = C36609l.UNRECOGNIZED;
            }
            C69464a aVar = (C69464a) map2.get(a3);
            if (aVar == null) {
                acVar = null;
            } else {
                C36558ad adVar = sVar.f95419e;
                kVar.getClass();
                C36569ao aoVar = (C36569ao) adVar.f95355a.mo17428b();
                aoVar.getClass();
                Executor executor = (Executor) adVar.f95356b.mo17428b();
                executor.getClass();
                C36557ac acVar2 = new C36557ac(kVar, aVar, aoVar, executor);
                Map map3 = sVar.f95422h;
                C36609l a4 = C36609l.m65137a(kVar.f95443b);
                if (a4 == null) {
                    a4 = C36609l.UNRECOGNIZED;
                }
                map3.put(a4, acVar2);
                acVar = acVar2;
            }
        }
        if (acVar == null) {
            C36609l a5 = C36609l.m65137a(kVar.f95443b);
            if (a5 == null) {
                a5 = C36609l.UNRECOGNIZED;
            }
            int number = a5.getNumber();
            return C60856cj.m92899h(new IllegalArgumentException("NotificationListenerEventObserver not found for ID: " + number));
        }
        C60870cx i = acVar.mo40220i();
        C36581i iVar = new C36581i(sVar, kVar, acVar);
        return C60922j.m93045h(i, C47810es.m84966f(iVar), sVar.f95420f);
    }
}
