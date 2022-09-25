package com.google.android.libraries.mdi.download.p2248h;

import com.google.android.libraries.mdi.download.C28707am;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.mdi.download.h.h */
/* compiled from: PG */
public final /* synthetic */ class C29611h implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f80201a;

    /* renamed from: b */
    public final /* synthetic */ C28708an f80202b;

    public /* synthetic */ C29611h(C58485gu guVar, C28708an anVar) {
        this.f80201a = guVar;
        this.f80202b = anVar;
    }

    public final Object call() {
        C58485gu guVar = this.f80201a;
        C28708an anVar = this.f80202b;
        C58526ih ihVar = new C58526ih();
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            ihVar.mo55489i((Iterable) C60856cj.m92909r((C60870cx) guVar.get(i2)));
        }
        C28707am amVar = (C28707am) anVar.toBuilder();
        amVar.copyOnWrite();
        ((C28708an) amVar.instance).f78003h = C28708an.emptyProtobufList();
        amVar.mo34327a(ihVar.mo55486f());
        return (C28708an) amVar.build();
    }
}
