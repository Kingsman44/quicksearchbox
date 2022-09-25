package com.google.apps.tiktok.dataservice;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.apps.tiktok.dataservice.cq */
/* compiled from: PG */
public final /* synthetic */ class C46773cq implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C46776ct f122124a;

    public /* synthetic */ C46773cq(C46776ct ctVar) {
        this.f122124a = ctVar;
    }

    public final Object apply(Object obj) {
        C58485gu j;
        C46776ct ctVar = this.f122124a;
        synchronized (ctVar.f122130a) {
            j = C58485gu.m89842j(ctVar.f122130a);
        }
        int size = j.size();
        for (int i = 0; i < size; i++) {
            obj = ((C58817ah) j.get(i)).apply(obj);
        }
        return obj;
    }
}
