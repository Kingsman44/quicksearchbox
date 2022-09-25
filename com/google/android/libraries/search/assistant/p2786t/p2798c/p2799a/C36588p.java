package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a;

import com.google.android.libraries.search.assistant.p2786t.p2798c.C36608k;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36609l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.p */
/* compiled from: PG */
public final /* synthetic */ class C36588p implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C36591s f95407a;

    /* renamed from: b */
    public final /* synthetic */ C36608k f95408b;

    public /* synthetic */ C36588p(C36591s sVar, C36608k kVar) {
        this.f95407a = sVar;
        this.f95408b = kVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C36591s sVar = this.f95407a;
        C36608k kVar = this.f95408b;
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
            if (!map2.containsKey(a3)) {
                C36609l a4 = C36609l.m65137a(kVar.f95443b);
                if (a4 == null) {
                    a4 = C36609l.UNRECOGNIZED;
                }
                int number = a4.getNumber();
                return C60856cj.m92899h(new IllegalArgumentException("NotificationListenerEventObserver not found for ID: " + number));
            }
            C59052c cVar = (C59052c) ((C59052c) C36591s.f95415a.mo56226d()).mo56372aa(51504);
            C36609l a5 = C36609l.m65137a(kVar.f95443b);
            if (a5 == null) {
                a5 = C36609l.UNRECOGNIZED;
            }
            cVar.mo56387q("Observer was not registered for %d", a5.getNumber());
            return C60866ct.f164955a;
        }
        C60870cx i = acVar.mo40220i();
        C36582j jVar = new C36582j(acVar, kVar);
        return C60922j.m93044g(i, C47810es.m84963c(jVar), sVar.f95420f);
    }
}
