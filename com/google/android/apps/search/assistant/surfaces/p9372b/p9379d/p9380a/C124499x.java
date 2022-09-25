package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.x */
/* compiled from: PG */
public final /* synthetic */ class C124499x implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C124437ah f343549a;

    /* renamed from: b */
    public final /* synthetic */ C124477bt f343550b;

    public /* synthetic */ C124499x(C124437ah ahVar, C124477bt btVar) {
        this.f343549a = ahVar;
        this.f343550b = btVar;
    }

    public final Object apply(Object obj) {
        C124437ah ahVar = this.f343549a;
        C124477bt btVar = this.f343550b;
        Throwable th = (Throwable) obj;
        C59104x c = C124437ah.f343426a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "RequestObserver");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(37059)).mo56389s("Future for requestType=%s did not complete", btVar.name());
        ahVar.f343427b.mo20122b(th);
        return null;
    }
}
