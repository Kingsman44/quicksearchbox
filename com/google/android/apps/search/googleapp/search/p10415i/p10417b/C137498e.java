package com.google.android.apps.search.googleapp.search.p10415i.p10417b;

import com.google.android.gms.droidguard.C144112b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58495hd;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.googleapp.search.i.b.e */
/* compiled from: PG */
public final /* synthetic */ class C137498e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C137500g f373971a;

    /* renamed from: b */
    public final /* synthetic */ String f373972b;

    public /* synthetic */ C137498e(C137500g gVar, String str) {
        this.f373971a = gVar;
        this.f373972b = str;
    }

    public final Object apply(Object obj) {
        String a;
        C137500g gVar = this.f373971a;
        String str = this.f373972b;
        C144112b bVar = (C144112b) obj;
        synchronized (gVar.f373985l) {
            C144112b bVar2 = gVar.f373987n;
            if (bVar2 == null || !bVar2.mo119659b()) {
                gVar.f373987n = bVar;
                C46459k.m82829b(gVar.f373980g.mo29164d(C47810es.m84977q(new C137497d(gVar)), C137500g.f373978e.longValue(), TimeUnit.MILLISECONDS), "Fail to close DroidGuardProgram", new Object[0]);
            }
            gVar.f373988o = str;
            C144112b bVar3 = gVar.f373987n;
            bVar3.getClass();
            a = bVar3.mo119658a(C58495hd.m89900n("hallmonitor-challenge-binding-key", str));
        }
        return a;
    }
}
