package com.google.android.libraries.search.p3005i;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.i.x */
/* compiled from: PG */
public final /* synthetic */ class C38480x implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f101824a;

    public /* synthetic */ C38480x(List list) {
        this.f101824a = list;
    }

    public final Object call() {
        List<C60870cx> list = this.f101824a;
        HashMap hashMap = new HashMap();
        for (C60870cx r : list) {
            hashMap.putAll((Map) C60856cj.m92909r(r));
        }
        return hashMap;
    }
}
