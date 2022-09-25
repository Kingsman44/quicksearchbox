package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29035b;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.hq */
/* compiled from: PG */
public final /* synthetic */ class C29183hq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29211ir f79136a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f79137b;

    /* renamed from: c */
    public final /* synthetic */ long f79138c;

    /* renamed from: d */
    public final /* synthetic */ String f79139d;

    /* renamed from: e */
    public final /* synthetic */ C58485gu f79140e;

    /* renamed from: f */
    public final /* synthetic */ C58495hd f79141f;

    /* renamed from: g */
    public final /* synthetic */ C58833ax f79142g;

    /* renamed from: h */
    public final /* synthetic */ C60931s f79143h;

    public /* synthetic */ C29183hq(C29211ir irVar, C29392ep epVar, long j, String str, C58485gu guVar, C58495hd hdVar, C58833ax axVar, C60931s sVar) {
        this.f79136a = irVar;
        this.f79137b = epVar;
        this.f79138c = j;
        this.f79139d = str;
        this.f79140e = guVar;
        this.f79141f = hdVar;
        this.f79142g = axVar;
        this.f79143h = sVar;
    }

    public final C60870cx apply(Object obj) {
        C29211ir irVar = this.f79136a;
        C29392ep epVar = this.f79137b;
        long j = this.f79138c;
        String str = this.f79139d;
        C58485gu guVar = this.f79140e;
        C58495hd hdVar = this.f79141f;
        C58833ax axVar = this.f79142g;
        C60931s sVar = this.f79143h;
        Void voidR = (Void) obj;
        C29117fe feVar = irVar.f79194d;
        C58485gu a = C29211ir.m54132a(guVar);
        C29035b bVar = new C29035b(feVar.f78973b, 2);
        C60870cx c = feVar.f78975d.mo34598c();
        C28841ax axVar2 = new C28841ax(epVar, j, str, axVar);
        C60870cx g = C60922j.m93044g(c, C47810es.m84963c(axVar2), feVar.f78980i);
        C28898bm bmVar = new C28898bm(epVar, j, str);
        C60870cx h = C60922j.m93045h(g, C47810es.m84966f(bmVar), feVar.f78980i);
        C29117fe feVar2 = feVar;
        return C29670b.m54719g(h).mo34822i(new C28899bn(feVar, a, bVar), feVar.f78980i).mo34822i(new C28900bo(feVar2, h, epVar, hdVar, sVar, bVar), feVar.f78980i).mo34820f(Exception.class, new C28901bp(feVar2, epVar, j, str), feVar.f78980i);
    }
}
