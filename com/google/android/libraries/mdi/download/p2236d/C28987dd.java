package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.dd */
/* compiled from: PG */
public final /* synthetic */ class C28987dd implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78700a;

    /* renamed from: b */
    public final /* synthetic */ List f78701b;

    /* renamed from: c */
    public final /* synthetic */ C60931s f78702c;

    public /* synthetic */ C28987dd(C29117fe feVar, List list, C60931s sVar) {
        this.f78700a = feVar;
        this.f78701b = list;
        this.f78702c = sVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78700a;
        List list = this.f78701b;
        C60931s sVar = this.f78702c;
        for (C29392ep epVar : (List) obj) {
            C60870cx g = feVar.f78975d.mo34602g(epVar);
            C28819ab abVar = new C28819ab(sVar, epVar);
            list.add(C60922j.m93045h(g, C47810es.m84966f(abVar), feVar.f78980i));
        }
        return C29672d.m54726a(list).mo34823a(C28905bt.f78518a, feVar.f78980i);
    }
}
