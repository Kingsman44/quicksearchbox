package com.google.android.libraries.gsa.actionusermodel.p1831d;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.d.f */
/* compiled from: PG */
public final /* synthetic */ class C22126f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C22131k f60967a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f60968b;

    /* renamed from: c */
    public final /* synthetic */ C58872ci f60969c;

    public /* synthetic */ C22126f(C22131k kVar, C60870cx cxVar, C58872ci ciVar) {
        this.f60967a = kVar;
        this.f60968b = cxVar;
        this.f60969c = ciVar;
    }

    public final C60870cx apply(Object obj) {
        C22131k kVar = this.f60967a;
        C60870cx cxVar = this.f60968b;
        C58872ci ciVar = this.f60969c;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(false);
        }
        return C47633f.m84733g(cxVar).mo51516i(new C22127g(axVar), kVar.f60975a).mo51515h(new C22128h(kVar, ciVar), kVar.f60975a);
    }
}
