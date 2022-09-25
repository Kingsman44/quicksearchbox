package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29090d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.mdi.download.d.k */
/* compiled from: PG */
public final /* synthetic */ class C29247k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29314z f79252a;

    /* renamed from: b */
    public final /* synthetic */ List f79253b;

    /* renamed from: c */
    public final /* synthetic */ C29398ev f79254c;

    /* renamed from: d */
    public final /* synthetic */ AtomicInteger f79255d;

    public /* synthetic */ C29247k(C29314z zVar, List list, C29398ev evVar, AtomicInteger atomicInteger) {
        this.f79252a = zVar;
        this.f79253b = list;
        this.f79254c = evVar;
        this.f79255d = atomicInteger;
    }

    public final C60870cx apply(Object obj) {
        C29314z zVar = this.f79252a;
        List list = this.f79253b;
        C29398ev evVar = this.f79254c;
        AtomicInteger atomicInteger = this.f79255d;
        C29402ez ezVar = (C29402ez) obj;
        if (ezVar != null && ezVar.f79716d) {
            list.add(C29090d.m53982c(zVar.f79440a, ezVar.f79718f));
        }
        C29290lp lpVar = zVar.f79442c;
        C60870cx e = lpVar.f79387c.mo34620e(evVar);
        C29263kp kpVar = new C29263kp(lpVar, evVar);
        C60870cx h = C60922j.m93045h(e, C47810es.m84966f(kpVar), lpVar.f79395k);
        C29311w wVar = new C29311w(zVar, atomicInteger, evVar);
        return C60922j.m93044g(h, C47810es.m84963c(wVar), zVar.f79449j);
    }
}
