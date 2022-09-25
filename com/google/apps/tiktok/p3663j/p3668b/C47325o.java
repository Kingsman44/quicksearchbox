package com.google.apps.tiktok.p3663j.p3668b;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.j.b.o */
/* compiled from: PG */
public final /* synthetic */ class C47325o implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C47333w f123005a;

    /* renamed from: b */
    public final /* synthetic */ Map f123006b;

    public /* synthetic */ C47325o(C47333w wVar, Map map) {
        this.f123005a = wVar;
        this.f123006b = map;
    }

    public final Object call() {
        C47333w wVar = this.f123005a;
        Map map = this.f123006b;
        synchronized (wVar.f123024h) {
            for (C47304al remove : map.keySet()) {
                wVar.f123024h.remove(remove);
            }
        }
        return null;
    }
}
