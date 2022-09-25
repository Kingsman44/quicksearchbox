package com.google.android.libraries.assistant.auto.tng.p1028l;

import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.bo */
/* compiled from: PG */
public final /* synthetic */ class C13762bo implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13811cj f41941a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f41942b;

    public /* synthetic */ C13762bo(C13811cj cjVar, C60870cx cxVar) {
        this.f41941a = cjVar;
        this.f41942b = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C13811cj cjVar = this.f41941a;
        C60870cx cxVar = this.f41942b;
        Exception exc = (Exception) obj;
        cjVar.f42082z = Optional.m71637of(exc);
        C58976aa aaVar = C58975e.f156826a;
        C2164c cVar = cjVar.f42075s;
        cVar.getClass();
        cVar.mo5437b((Object) null);
        C2164c cVar2 = cjVar.f42076t;
        cVar2.getClass();
        cVar2.mo5437b((Object) null);
        if (!cjVar.f42040A.isPresent()) {
            return cxVar;
        }
        cjVar.mo21263d(cjVar.f42081y);
        throw exc;
    }
}
