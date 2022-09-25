package com.google.android.libraries.lens.ondevice.p2031h;

import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24269a;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2024d.C24424r;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.lens.ondevice.h.a */
/* compiled from: PG */
public final /* synthetic */ class C24505a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C24509e f67117a;

    /* renamed from: b */
    public final /* synthetic */ C24424r f67118b;

    /* renamed from: c */
    public final /* synthetic */ C24280f f67119c;

    public /* synthetic */ C24505a(C24509e eVar, C24424r rVar, C24280f fVar) {
        this.f67117a = eVar;
        this.f67118b = rVar;
        this.f67119c = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C24509e eVar = this.f67117a;
        C24424r rVar = this.f67118b;
        C24280f fVar = this.f67119c;
        C24519o oVar = (C24519o) eVar.f67131e.get(rVar);
        if (oVar != null) {
            eVar.f67129c.mo29944c(rVar.mo29861a(), oVar.f67160k, C24805p.CASCADE_RUN_START);
            return oVar.mo29930b(fVar);
        }
        eVar.f67129c.mo29943b(rVar.mo29861a(), C24805p.CASCADE_RUN_START);
        eVar.f67129c.mo29946e(rVar.mo29861a(), C24805p.CASCADE_RUN_ERROR);
        throw new C24269a();
    }
}
