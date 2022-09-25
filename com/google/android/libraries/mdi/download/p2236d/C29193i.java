package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29090d;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.mdi.download.d.i */
/* compiled from: PG */
public final /* synthetic */ class C29193i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29314z f79154a;

    /* renamed from: b */
    public final /* synthetic */ Set f79155b;

    public /* synthetic */ C29193i(C29314z zVar, Set set) {
        this.f79154a = zVar;
        this.f79155b = set;
    }

    public final C60870cx apply(Object obj) {
        C29314z zVar = this.f79154a;
        Set set = this.f79155b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ArrayList arrayList3 = new ArrayList();
        for (C29398ev evVar : (List) obj) {
            if (!set.contains(evVar)) {
                C60870cx e = zVar.f79443d.mo34620e(evVar);
                C29247k kVar = new C29247k(zVar, arrayList2, evVar, atomicInteger);
                arrayList3.add(C60922j.m93045h(e, C47810es.m84966f(kVar), zVar.f79449j));
            } else {
                C60870cx e2 = zVar.f79442c.mo34641e(evVar);
                C29274l lVar = new C29274l(arrayList);
                arrayList3.add(C60922j.m93044g(e2, C47810es.m84963c(lVar), zVar.f79449j));
            }
        }
        if (zVar.f79450k.mo34444x()) {
            ArrayList arrayList4 = new ArrayList();
            C60870cx c = zVar.f79441b.mo34598c();
            C29307s sVar = new C29307s(zVar, arrayList4);
            C60870cx g = C60922j.m93044g(c, C47810es.m84963c(sVar), zVar.f79449j);
            C29301m mVar = new C29301m(arrayList);
            arrayList3.add(C60922j.m93044g(g, C47810es.m84963c(mVar), zVar.f79449j));
        } else {
            arrayList.add(C29090d.m53981b(zVar.f79440a, zVar.f79447h));
        }
        return C29672d.m54726a(arrayList3).mo34823a(new C29302n(zVar, atomicInteger, arrayList2, arrayList), zVar.f79449j);
    }
}
