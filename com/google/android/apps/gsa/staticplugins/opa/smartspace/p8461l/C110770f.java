package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import android.util.Pair;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.f */
/* compiled from: PG */
public final /* synthetic */ class C110770f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f308640a;

    /* renamed from: b */
    public final /* synthetic */ List f308641b;

    public /* synthetic */ C110770f(List list, List list2) {
        this.f308640a = list;
        this.f308641b = list2;
    }

    public final Object call() {
        List<C60870cx> list = this.f308640a;
        List list2 = this.f308641b;
        HashMap hashMap = new HashMap();
        for (C60870cx s : list) {
            Pair pair = (Pair) C60856cj.m92910s(s);
            hashMap.put((C50794cr) pair.first, (Boolean) pair.second);
        }
        return (List) Collection.EL.stream(list2).filter(new C110755b(hashMap)).collect(Collectors.toCollection(C110767c.f308636a));
    }
}
