package com.google.android.libraries.search.udcdataservice.facs;

import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41388d;
import com.google.android.libraries.search.udcdataservice.C41389e;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.udcdataservice.facs.j */
/* compiled from: PG */
public final /* synthetic */ class C41400j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C41406p f108159a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f108160b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f108161c;

    /* renamed from: d */
    public final /* synthetic */ C41387c f108162d;

    public /* synthetic */ C41400j(C41406p pVar, C60870cx cxVar, C60870cx cxVar2, C41387c cVar) {
        this.f108159a = pVar;
        this.f108160b = cxVar;
        this.f108161c = cxVar2;
        this.f108162d = cVar;
    }

    public final Object call() {
        C41406p pVar = this.f108159a;
        C60870cx cxVar = this.f108160b;
        C60870cx cxVar2 = this.f108161c;
        C41387c cVar = this.f108162d;
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar);
        C58833ax axVar2 = (C58833ax) C60856cj.m92909r(cxVar2);
        if (!axVar.mo56113h() || !axVar2.mo56113h()) {
            ((C19567d) pVar.f108175f.f102947cY.mo6453a()).mo24822a(1, new Object[0]);
        }
        C41388d dVar = (C41388d) C41389e.f108143e.createBuilder();
        dVar.copyOnWrite();
        C41389e eVar = (C41389e) dVar.instance;
        eVar.f108146b = cVar.f108142h;
        int i = 1;
        eVar.f108145a |= 1;
        int i2 = axVar.mo56113h() ? ((Boolean) axVar.mo56107c()).booleanValue() ? 2 : 3 : 1;
        dVar.copyOnWrite();
        C41389e eVar2 = (C41389e) dVar.instance;
        eVar2.f108147c = i2 - 1;
        eVar2.f108145a |= 2;
        if (axVar2.mo56113h()) {
            i = ((Boolean) axVar2.mo56107c()).booleanValue() ? 2 : 3;
        }
        dVar.copyOnWrite();
        C41389e eVar3 = (C41389e) dVar.instance;
        eVar3.f108148d = i - 1;
        eVar3.f108145a |= 4;
        return (C41389e) dVar.build();
    }
}
