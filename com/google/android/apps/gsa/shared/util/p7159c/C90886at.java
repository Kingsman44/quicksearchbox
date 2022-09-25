package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Future;

@Deprecated
/* renamed from: com.google.android.apps.gsa.shared.util.c.at */
/* compiled from: PG */
public final class C90886at {

    /* renamed from: a */
    public static final C59071e f254095a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.c.at");

    @Deprecated
    /* renamed from: a */
    public static C60870cx m148484a(C60870cx cxVar, long j, C90931ca caVar) {
        SettableFuture settableFuture = new SettableFuture();
        C60856cj.m92911t(cxVar, new C90885as(settableFuture), C60826bg.f164896a);
        m148485b(settableFuture, j, caVar);
        return settableFuture;
    }

    @Deprecated
    /* renamed from: b */
    public static void m148485b(Future future, long j, C90931ca caVar) {
        caVar.mo85137b(new C90884ar(future, j), j);
    }
}
