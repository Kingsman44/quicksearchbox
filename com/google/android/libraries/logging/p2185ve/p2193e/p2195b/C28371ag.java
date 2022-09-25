package com.google.android.libraries.logging.p2185ve.p2193e.p2195b;

import com.google.android.libraries.logging.p2185ve.p2193e.p2194a.C28359f;
import com.google.common.p4552o.aqp;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63000ds;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.logging.ve.e.b.ag */
/* compiled from: PG */
public final /* synthetic */ class C28371ag implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f77099a;

    /* renamed from: b */
    public final /* synthetic */ aqp[] f77100b;

    public /* synthetic */ C28371ag(List list, aqp[] aqpArr) {
        this.f77099a = list;
        this.f77100b = aqpArr;
    }

    public final Object call() {
        List<C60870cx> list = this.f77099a;
        aqp[] aqpArr = this.f77100b;
        for (C60870cx r : list) {
            ((C28359f) C60856cj.m92909r(r)).mo30786a((C63000ds) null);
        }
        return aqpArr;
    }
}
