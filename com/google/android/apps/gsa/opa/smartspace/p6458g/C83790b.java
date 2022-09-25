package com.google.android.apps.gsa.opa.smartspace.p6458g;

import android.graphics.drawable.Drawable;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.g.b */
/* compiled from: PG */
public final /* synthetic */ class C83790b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f228368a;

    public /* synthetic */ C83790b(List list) {
        this.f228368a = list;
    }

    public final Object call() {
        List<C60870cx> list = this.f228368a;
        ArrayList arrayList = new ArrayList();
        for (C60870cx r : list) {
            arrayList.add((Drawable) C60856cj.m92909r(r));
        }
        return arrayList;
    }
}
