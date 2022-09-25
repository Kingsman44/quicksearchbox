package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.z */
/* compiled from: PG */
public final /* synthetic */ class C124501z implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124437ah f343552a;

    public /* synthetic */ C124501z(C124437ah ahVar) {
        this.f343552a = ahVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124437ah ahVar = this.f343552a;
        C124436ag agVar = ahVar.f343431f;
        if (agVar != null) {
            return ahVar.mo106420f(agVar.f343425b.mo106405b(), C124477bt.STOP_REQUEST);
        }
        ahVar.f343427b.mo20122b(new IllegalStateException("There is no active connection to stop the interaction on"));
        return C60866ct.f164955a;
    }
}
