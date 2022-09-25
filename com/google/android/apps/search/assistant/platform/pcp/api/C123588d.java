package com.google.android.apps.search.assistant.platform.pcp.api;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123745bl;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.api.d */
/* compiled from: PG */
public final /* synthetic */ class C123588d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f341475a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f341476b;

    public /* synthetic */ C123588d(C60870cx cxVar, C60870cx cxVar2) {
        this.f341475a = cxVar;
        this.f341476b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f341475a;
        C60870cx cxVar2 = this.f341476b;
        C123746bm bmVar = (C123746bm) C60856cj.m92909r(cxVar);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(bmVar.f341820a);
        arrayList.addAll(((C123746bm) C60856cj.m92909r(cxVar2)).f341820a);
        C123745bl blVar = (C123745bl) bmVar.toBuilder();
        blVar.copyOnWrite();
        ((C123746bm) blVar.instance).f341820a = C123746bm.emptyProtobufList();
        blVar.mo106124a(arrayList);
        return (C123746bm) blVar.build();
    }
}
