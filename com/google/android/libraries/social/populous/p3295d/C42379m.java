package com.google.android.libraries.social.populous.p3295d;

import com.google.android.libraries.social.populous.core.C42321ct;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: com.google.android.libraries.social.populous.d.m */
/* compiled from: PG */
public final /* synthetic */ class C42379m implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f111135a;

    /* renamed from: b */
    public final /* synthetic */ C42374h f111136b;

    public /* synthetic */ C42379m(C58495hd hdVar, C42374h hVar) {
        this.f111135a = hdVar;
        this.f111136b = hVar;
    }

    public final Object call() {
        C58495hd hdVar = this.f111135a;
        C42374h hVar = this.f111136b;
        C58800sl lA = hdVar.keySet().iterator();
        while (lA.hasNext()) {
            C42321ct ctVar = (C42321ct) lA.next();
            hVar.mo45362e(ctVar, (C42405ab) C60856cj.m92909r((Future) hdVar.get(ctVar)));
        }
        return hVar.mo45358a();
    }
}
