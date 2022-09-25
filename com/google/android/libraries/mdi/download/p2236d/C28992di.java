package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29392ep;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.di */
/* compiled from: PG */
public final /* synthetic */ class C28992di implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78717a;

    /* renamed from: b */
    public final /* synthetic */ boolean f78718b;

    /* renamed from: c */
    public final /* synthetic */ C29392ep f78719c;

    public /* synthetic */ C28992di(C29117fe feVar, boolean z, C29392ep epVar) {
        this.f78717a = feVar;
        this.f78718b = z;
        this.f78719c = epVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78717a;
        boolean z = this.f78718b;
        C29392ep epVar = this.f78719c;
        C58833ax axVar = (C58833ax) obj;
        if (!z) {
            return C60856cj.m92900i(axVar);
        }
        C60870cx i = feVar.f78975d.mo34604i(epVar);
        C29085ez ezVar = new C29085ez(feVar, axVar);
        return C60922j.m93044g(i, C47810es.m84963c(ezVar), feVar.f78980i);
    }
}
