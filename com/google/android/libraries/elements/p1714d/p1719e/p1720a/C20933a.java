package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import p5488io.p5490b.p5496d.C69821c;

/* renamed from: com.google.android.libraries.elements.d.e.a.a */
/* compiled from: PG */
public final /* synthetic */ class C20933a implements C69821c {

    /* renamed from: a */
    public final /* synthetic */ C20971c f58702a;

    /* renamed from: b */
    public final /* synthetic */ C20963b f58703b;

    /* renamed from: c */
    public final /* synthetic */ boolean f58704c;

    public /* synthetic */ C20933a(C20971c cVar, C20963b bVar, boolean z) {
        this.f58702a = cVar;
        this.f58703b = bVar;
        this.f58704c = z;
    }

    /* renamed from: a */
    public final void mo25818a(Object obj) {
        C20971c cVar = this.f58702a;
        C20963b bVar = this.f58703b;
        boolean z = this.f58704c;
        Long l = (Long) obj;
        C20974f fVar = cVar.f58784e;
        if (fVar.f58790a.mIsAttached) {
            fVar.mo26085b(bVar.f58758c.get(), z);
            if (bVar.f58758c.addAndGet(bVar.f58759d) >= bVar.f58756a) {
                bVar.f58758c.set(0);
                if (!bVar.f58757b) {
                    cVar.mo26082a();
                    return;
                }
                return;
            }
            return;
        }
        cVar.mo26082a();
    }
}
