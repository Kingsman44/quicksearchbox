package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.w */
/* compiled from: PG */
public final /* synthetic */ class C130793w implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C130739ac f358025a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f358026b;

    public /* synthetic */ C130793w(C130739ac acVar, C58485gu guVar) {
        this.f358025a = acVar;
        this.f358026b = guVar;
    }

    public final Object call() {
        C130739ac acVar = this.f358025a;
        C58485gu guVar = this.f358026b;
        C58526ih ihVar = new C58526ih();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            try {
                ihVar.mo55489i((Iterable) C60856cj.m92909r((Future) guVar.get(i)));
            } catch (ExecutionException e) {
                ((C58970a) ((C58970a) ((C58970a) acVar.f357931b.mo56226d()).mo56382g(e)).mo56372aa(38963)).mo56386p("Error getting personalized locations.");
            }
        }
        return ihVar.mo55486f();
    }
}
