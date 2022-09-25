package com.google.android.apps.gsa.staticplugins.p8163o.p8165b;

import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.b.n */
/* compiled from: PG */
public final /* synthetic */ class C105819n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C105820o f295203a;

    /* renamed from: b */
    public final /* synthetic */ Integer f295204b;

    public /* synthetic */ C105819n(C105820o oVar, Integer num) {
        this.f295203a = oVar;
        this.f295204b = num;
    }

    public final void run() {
        C105820o oVar = this.f295203a;
        Integer num = this.f295204b;
        C105823r rVar = oVar.f295205a;
        if (!rVar.f295214h) {
            int intValue = num.intValue();
            if (!rVar.f295214h) {
                int n = rVar.f295209c.mo7121n();
                if (n < intValue) {
                    for (int i = rVar.f295212f; i < intValue; i++) {
                        C105830y yVar = new C105830y(rVar.f295208b, rVar.f295211e, i, rVar.f295217k);
                        rVar.f295209c.mo7111E(yVar);
                        rVar.f295210d.add(yVar);
                    }
                } else if (n > intValue) {
                    rVar.f295209c.mo7118L(intValue, n);
                    while (rVar.f295210d.size() > intValue) {
                        ArrayList arrayList = rVar.f295210d;
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
            C105823r rVar2 = oVar.f295205a;
            rVar2.mo7104k((Object) null, rVar2.f295209c);
        }
    }
}
