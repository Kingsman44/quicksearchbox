package com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile;

import android.content.Context;
import com.google.android.enterprise.connectedapps.C142555ao;
import com.google.android.enterprise.connectedapps.C142563c;
import com.google.android.enterprise.connectedapps.C142570e;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.r */
/* compiled from: PG */
public final class C132000r implements C131982a {

    /* renamed from: a */
    public final C142570e f360337a;

    /* renamed from: b */
    private final Executor f360338b;

    /* renamed from: c */
    private final C131989h f360339c;

    public C132000r(C131989h hVar, C131991j jVar, Executor executor) {
        this.f360339c = hVar;
        this.f360337a = jVar.mo117178i();
        this.f360338b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo110365a() {
        Object obj;
        C131989h hVar = this.f360339c;
        hVar.f360328a.mo117178i();
        C142555ao[] aoVarArr = {C142570e.f386860a, C142570e.f386861b};
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 2; i++) {
            C142555ao aoVar = aoVarArr[i];
            if (aoVar.mo117171a()) {
                Context context = ((C142563c) hVar.f360328a).f386843a;
                C131986e eVar = C131986e.f360324a;
                obj = new C131984c(C131986e.m214434a(((C142563c) hVar.f360328a).f386843a));
            } else {
                obj = new C131987f(hVar.f360328a);
            }
            hashMap.put(aoVar, obj);
        }
        HashMap hashMap2 = new HashMap();
        for (C142555ao aoVar2 : hashMap.keySet()) {
            hashMap2.put(aoVar2, ((C131988g) hashMap.get(aoVar2)).mo110368a());
        }
        return C47633f.m84733g(C142568e.m231169e(hashMap2)).mo51515h(new C131996n(this), this.f360338b);
    }
}
