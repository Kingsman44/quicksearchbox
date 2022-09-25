package com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126292aa;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.p.e */
/* compiled from: PG */
public final /* synthetic */ class C126176e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126178g f347675a;

    /* renamed from: b */
    public final /* synthetic */ long f347676b;

    /* renamed from: c */
    public final /* synthetic */ C63122a f347677c;

    /* renamed from: d */
    public final /* synthetic */ C126292aa f347678d;

    public /* synthetic */ C126176e(C126178g gVar, long j, C63122a aVar, C126292aa aaVar) {
        this.f347675a = gVar;
        this.f347676b = j;
        this.f347677c = aVar;
        this.f347678d = aaVar;
    }

    public final void run() {
        C126178g gVar = this.f347675a;
        long j = this.f347676b;
        C63122a aVar = this.f347677c;
        C126292aa aaVar = this.f347678d;
        if (gVar.f347687e.compareAndSet(j, 0)) {
            if (gVar.f347686d.get()) {
                aVar = C63122a.SUCCESS_SEND_DELAYED;
            }
            gVar.mo107447F(j, aVar, aaVar);
        }
    }
}
