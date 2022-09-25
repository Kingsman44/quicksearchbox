package com.google.android.apps.search.podcasts.p10550b.p10552b;

import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97874a;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.podcasts.b.b.t */
/* compiled from: PG */
public final /* synthetic */ class C140042t implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Map f380610a;

    public /* synthetic */ C140042t(Map map) {
        this.f380610a = map;
    }

    public final Object call() {
        Map map = this.f380610a;
        C58480gp e = C58485gu.m89837e();
        for (C97920j jVar : map.keySet()) {
            if (!new File(Uri.parse(((C97914d) ((C97874a) map.get(jVar)).instance).f273400f).getPath()).exists()) {
                e.mo55395g(jVar);
            }
        }
        return e.mo55394f();
    }
}
