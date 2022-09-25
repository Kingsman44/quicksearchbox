package com.google.android.apps.search.fedora.p10106i;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.fedora.i.r */
/* compiled from: PG */
public final /* synthetic */ class C132944r implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f362626a;

    public /* synthetic */ C132944r(List list) {
        this.f362626a = list;
    }

    public final Object call() {
        List<C60870cx> list = this.f362626a;
        ArrayList arrayList = new ArrayList();
        for (C60870cx r : list) {
            Optional optional = (Optional) C60856cj.m92909r(r);
            if (optional.isPresent()) {
                arrayList.add((String) optional.get());
            }
        }
        return arrayList;
    }
}
