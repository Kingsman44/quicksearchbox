package com.google.android.libraries.lens.ondevice.p2031h;

import com.google.android.libraries.lens.ondevice.p2024d.C24424r;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.lens.p4701g.C62331d;

/* renamed from: com.google.android.libraries.lens.ondevice.h.c */
/* compiled from: PG */
public final /* synthetic */ class C24507c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C24509e f67121a;

    /* renamed from: b */
    public final /* synthetic */ C24424r f67122b;

    /* renamed from: c */
    public final /* synthetic */ C62331d f67123c;

    /* renamed from: d */
    public final /* synthetic */ C24795f f67124d;

    public /* synthetic */ C24507c(C24509e eVar, C24424r rVar, C62331d dVar, C24795f fVar) {
        this.f67121a = eVar;
        this.f67122b = rVar;
        this.f67123c = dVar;
        this.f67124d = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C24519o oVar;
        C24509e eVar = this.f67121a;
        C24424r rVar = this.f67122b;
        C62331d dVar = this.f67123c;
        C24795f fVar = this.f67124d;
        ((C58970a) ((C58970a) C24509e.f67127a.mo56224b()).mo56372aa(48816)).mo56389s("Loading cascade %s", rVar);
        if (eVar.f67131e.containsKey(rVar)) {
            oVar = (C24519o) eVar.f67131e.get(rVar);
        } else {
            C24519o a = eVar.f67128b.mo29932a(dVar);
            eVar.f67131e.put(rVar, a);
            oVar = a;
        }
        oVar.getClass();
        return oVar.mo29929a(fVar);
    }
}
