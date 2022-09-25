package com.google.android.libraries.search.assistant.p2511d.p2512a;

import androidx.p104d.p105a.C2153a;
import androidx.p104d.p105a.C2168g;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.libraries.search.assistant.d.a.h */
/* compiled from: PG */
public final /* synthetic */ class C32515h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32519l f87104a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f87105b;

    /* renamed from: c */
    public final /* synthetic */ long f87106c;

    public /* synthetic */ C32515h(C32519l lVar, C60870cx cxVar, long j) {
        this.f87104a = lVar;
        this.f87105b = cxVar;
        this.f87106c = j;
    }

    public final void run() {
        C32519l lVar = this.f87104a;
        C60870cx cxVar = this.f87105b;
        long j = this.f87106c;
        if ((((C2168g) cxVar).f6144b.value instanceof C2153a.C2155b) && lVar.f87115e.remove(Long.valueOf(j)) != null) {
            C32518k kVar = lVar.f87112b;
            C32509b bVar = (C32509b) C32510c.f87086e.createBuilder();
            bVar.copyOnWrite();
            C32510c cVar = (C32510c) bVar.instance;
            cVar.f87088a |= 1;
            cVar.f87091d = j;
            C62912at atVar = C62912at.f169862a;
            bVar.copyOnWrite();
            C32510c cVar2 = (C32510c) bVar.instance;
            atVar.getClass();
            cVar2.f87090c = atVar;
            cVar2.f87089b = 3;
            kVar.mo38118a((C32510c) bVar.build());
        }
    }
}
