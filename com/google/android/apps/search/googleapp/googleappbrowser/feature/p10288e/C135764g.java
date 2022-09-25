package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e;

import com.google.android.libraries.web.p3353c.C43378w;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.e.g */
/* compiled from: PG */
public final /* synthetic */ class C135764g implements C43378w {

    /* renamed from: a */
    public final /* synthetic */ C135766i f369791a;

    /* renamed from: b */
    public final /* synthetic */ boolean f369792b;

    /* renamed from: c */
    public final /* synthetic */ boolean f369793c;

    public /* synthetic */ C135764g(C135766i iVar, boolean z, boolean z2) {
        this.f369791a = iVar;
        this.f369792b = z;
        this.f369793c = z2;
    }

    /* renamed from: a */
    public final C60870cx mo46481a(Object obj) {
        C135766i iVar = this.f369791a;
        boolean z = this.f369792b;
        if (!this.f369793c) {
            String str = (String) obj;
            if (!C58837ba.m90859h(str)) {
                C46407v vVar = iVar.f369804h;
                C135774q a = C135766i.m220268a(str, z);
                C135762e eVar = new C135762e(iVar, str);
                C60870cx f = vVar.mo50346f(a, C47633f.m84733g(C60856cj.m92902k(C47810es.m84965e(eVar), iVar.f369802f.toMillis(), TimeUnit.MILLISECONDS, iVar.f369800d)).mo51515h(C135763f.f369790a, iVar.f369800d));
                C135761d dVar = C135761d.f369787a;
                return C60922j.m93044g(f, C47810es.m84963c(dVar), iVar.f369800d);
            }
        }
        return C60866ct.f164955a;
    }
}
