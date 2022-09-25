package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.bf */
/* compiled from: PG */
public final /* synthetic */ class C101047bf implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f282177a;

    public /* synthetic */ C101047bf(List list) {
        this.f282177a = list;
    }

    public final Object call() {
        List<C60870cx> list = this.f282177a;
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
