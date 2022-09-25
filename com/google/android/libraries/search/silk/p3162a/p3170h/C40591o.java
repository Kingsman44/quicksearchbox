package com.google.android.libraries.search.silk.p3162a.p3170h;

import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.android.libraries.silk.p3238b.C41749b;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.silk.a.h.o */
/* compiled from: PG */
public final /* synthetic */ class C40591o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C40595s f106531a;

    /* renamed from: b */
    public final /* synthetic */ C39226b f106532b;

    /* renamed from: c */
    public final /* synthetic */ C47215a f106533c;

    public /* synthetic */ C40591o(C40595s sVar, C39226b bVar, C47215a aVar) {
        this.f106531a = sVar;
        this.f106532b = bVar;
        this.f106533c = aVar;
    }

    public final C60870cx apply(Object obj) {
        C40595s sVar = this.f106531a;
        C39226b bVar = this.f106532b;
        C47215a aVar = this.f106533c;
        if (((C40594r) obj) == C40594r.CANNOT_ACCESS_LOCATION) {
            return C60856cj.m92899h(new C41742a(C41749b.m73222a("permission_denied", "User doesn't consent to share device location.")));
        }
        if (sVar.f106541c.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || sVar.f106541c.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            C40589m mVar = new C40589m(sVar, bVar);
            return C60856cj.m92905n(C47810es.m84965e(mVar), sVar.f106539a);
        }
        C60870cx a = sVar.f106542d.mo42583a(aVar, 10002, "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
        C40590n nVar = new C40590n(sVar, bVar);
        return C60922j.m93045h(a, C47810es.m84966f(nVar), sVar.f106539a);
    }
}
