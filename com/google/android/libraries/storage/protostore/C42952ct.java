package com.google.android.libraries.storage.protostore;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.storage.protostore.ct */
/* compiled from: PG */
public final /* synthetic */ class C42952ct implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42966db f112355a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f112356b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f112357c;

    /* renamed from: d */
    public final /* synthetic */ C42955cw f112358d;

    public /* synthetic */ C42952ct(C42966db dbVar, C60870cx cxVar, C60870cx cxVar2, C42955cw cwVar) {
        this.f112355a = dbVar;
        this.f112356b = cxVar;
        this.f112357c = cxVar2;
        this.f112358d = cwVar;
    }

    public final C60870cx apply(Object obj) {
        C42966db dbVar = this.f112355a;
        C60870cx cxVar = this.f112356b;
        C60870cx cxVar2 = this.f112357c;
        return C60856cj.m92909r(cxVar).equals(C60856cj.m92909r(cxVar2)) ? C60866ct.f164955a : dbVar.mo46027i(cxVar2, this.f112358d);
    }
}
