package com.google.android.libraries.search.p3005i;

import com.google.android.libraries.geller.portable.database.C21957e;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: com.google.android.libraries.search.i.z */
/* compiled from: PG */
public final /* synthetic */ class C38482z implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f101826a;

    /* renamed from: b */
    public final /* synthetic */ Map f101827b;

    /* renamed from: c */
    public final /* synthetic */ List f101828c;

    public /* synthetic */ C38482z(List list, Map map, List list2) {
        this.f101826a = list;
        this.f101827b = map;
        this.f101828c = list2;
    }

    public final Object call() {
        List list = this.f101826a;
        Map map = this.f101827b;
        List list2 = this.f101828c;
        for (int i = 0; i < list.size(); i++) {
            map.put((String) list.get(i), (C21957e) C60856cj.m92909r((Future) list2.get(i)));
        }
        return map;
    }
}
