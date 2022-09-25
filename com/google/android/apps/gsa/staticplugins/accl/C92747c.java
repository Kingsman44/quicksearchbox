package com.google.android.apps.gsa.staticplugins.accl;

import com.google.android.apps.gsa.binaries.satin.app.bh;
import com.google.android.apps.gsa.search.core.p6491a.C84370p;
import com.google.android.apps.gsa.staticplugins.accl.p7330b.C92719a;
import com.google.android.libraries.gsa.conversation.p1855h.C22699c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c */
/* compiled from: PG */
final class C92747c implements C84370p {

    /* renamed from: a */
    private final C22699c f258821a;

    /* renamed from: b */
    private final C58833ax f258822b;

    public C92747c(C92719a aVar) {
        bh bhVar = (bh) aVar;
        this.f258821a = (C22699c) bhVar.i.mo17428b();
        this.f258822b = (C58833ax) bhVar.g.mo17428b();
    }

    /* renamed from: a */
    public final C60870cx mo77919a(C51805du duVar) {
        C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
        ejVar.copyOnWrite();
        C52078ek ekVar = (C52078ek) ejVar.instance;
        duVar.getClass();
        ekVar.f136675c = duVar;
        ekVar.f136674b = 5;
        return mo77920b((C52078ek) ejVar.build(), C58836b.f156633a);
    }

    /* renamed from: b */
    public final C60870cx mo77920b(C52078ek ekVar, C58833ax axVar) {
        return this.f258821a.mo27697a(ekVar, axVar);
    }

    /* renamed from: c */
    public final String mo77921c() {
        return this.f258821a.mo27698b();
    }

    /* renamed from: d */
    public final /* synthetic */ void mo77922d(C60870cx cxVar, C60870cx cxVar2, C58833ax axVar, C60870cx cxVar3, C60870cx cxVar4) {
        mo77923e(cxVar, cxVar2, axVar, C58836b.f156633a, cxVar3, cxVar4);
    }

    /* renamed from: e */
    public final void mo77923e(C60870cx cxVar, C60870cx cxVar2, C58833ax axVar, C58833ax axVar2, C60870cx cxVar3, C60870cx cxVar4) {
        this.f258821a.mo27701e(new C92856k(this.f258822b, cxVar, cxVar2, axVar, axVar2, cxVar3, cxVar4));
    }

    /* renamed from: f */
    public final void mo77924f(String str) {
        this.f258821a.mo27703g(str);
    }

    /* renamed from: g */
    public final void mo77925g() {
        this.f258821a.mo27704h();
    }

    /* renamed from: h */
    public final void mo77926h() {
        this.f258821a.mo27705i();
    }

    /* renamed from: i */
    public final void mo77927i(C51805du duVar, C58833ax axVar) {
        C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
        ejVar.copyOnWrite();
        C52078ek ekVar = (C52078ek) ejVar.instance;
        duVar.getClass();
        ekVar.f136675c = duVar;
        ekVar.f136674b = 5;
        mo77920b((C52078ek) ejVar.build(), axVar);
    }

    /* renamed from: j */
    public final void mo77928j(int i) {
        this.f258821a.mo27708l(i);
    }
}
