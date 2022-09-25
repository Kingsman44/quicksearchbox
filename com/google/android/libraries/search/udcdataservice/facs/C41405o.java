package com.google.android.libraries.search.udcdataservice.facs;

import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41388d;
import com.google.android.libraries.search.udcdataservice.C41389e;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.udcdataservice.facs.o */
/* compiled from: PG */
public final /* synthetic */ class C41405o implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C41387c f108167a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f108168b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f108169c;

    public /* synthetic */ C41405o(C41387c cVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f108167a = cVar;
        this.f108168b = cxVar;
        this.f108169c = cxVar2;
    }

    public final Object call() {
        C41387c cVar = this.f108167a;
        C60870cx cxVar = this.f108168b;
        C60870cx cxVar2 = this.f108169c;
        C58495hd hdVar = C41406p.f108170a;
        C41388d dVar = (C41388d) C41389e.f108143e.createBuilder();
        dVar.copyOnWrite();
        C41389e eVar = (C41389e) dVar.instance;
        eVar.f108146b = cVar.f108142h;
        eVar.f108145a |= 1;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        int i = 3;
        int i2 = true != booleanValue ? 3 : 2;
        dVar.copyOnWrite();
        C41389e eVar2 = (C41389e) dVar.instance;
        eVar2.f108147c = i2 - 1;
        eVar2.f108145a |= 2;
        if (true == ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue()) {
            i = 2;
        }
        dVar.copyOnWrite();
        C41389e eVar3 = (C41389e) dVar.instance;
        eVar3.f108148d = i - 1;
        eVar3.f108145a |= 4;
        return (C41389e) dVar.build();
    }
}
