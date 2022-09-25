package com.google.android.apps.gsa.search.core.p6807j;

import android.content.Intent;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.j.d */
/* compiled from: PG */
public abstract class C86135d {
    /* renamed from: c */
    public static C86135d m138540c(C60870cx cxVar) {
        return new C86132a(true, cxVar);
    }

    /* renamed from: d */
    public static C86135d m138541d(Intent intent) {
        return new C86132a(false, C60856cj.m92900i(intent));
    }

    /* renamed from: a */
    public abstract C60870cx mo79773a();

    /* renamed from: b */
    public abstract boolean mo79774b();
}
