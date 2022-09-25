package com.google.android.libraries.lens.view.gallery.data;

import android.os.Bundle;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.libraries.lens.view.gallery.data.h */
/* compiled from: PG */
public final /* synthetic */ class C26389h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26393l f71800a;

    public /* synthetic */ C26389h(C26393l lVar) {
        this.f71800a = lVar;
    }

    public final void run() {
        C26393l lVar = this.f71800a;
        if (lVar.f71809f == null) {
            C26398q qVar = lVar.f71811h;
            Bundle bundle = new Bundle();
            bundle.putStringArray("android:query-arg-sort-columns", new String[]{"date_modified"});
            bundle.putInt("android:query-arg-sort-direction", 1);
            bundle.putInt("android:query-arg-limit", 1);
            C60838bs g = qVar.f71819c.mo50871a(qVar.f71821e, new String[]{"_id", "_size"}, bundle).f121591a.mo57272e(new C26396o(qVar), qVar.f71820d).mo57275g();
            lVar.f71809f = g;
            C47633f g2 = C47633f.m84733g(g);
            C26391j jVar = new C26391j(lVar);
            C60856cj.m92911t(g2.f164926b, C47810es.m84974n(jVar), lVar.f71807d);
        }
    }
}
