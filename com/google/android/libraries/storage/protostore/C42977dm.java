package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.p3307c.C42750c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.io.IOException;

/* renamed from: com.google.android.libraries.storage.protostore.dm */
/* compiled from: PG */
public final /* synthetic */ class C42977dm implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C42981dq f112411a;

    public /* synthetic */ C42977dm(C42981dq dqVar) {
        this.f112411a = dqVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C42981dq dqVar = this.f112411a;
        try {
            return C60856cj.m92900i(dqVar.mo46030b((Uri) C60856cj.m92909r(dqVar.f112415a)));
        } catch (IOException e) {
            C42980dp dpVar = new C42980dp(dqVar);
            if ((e instanceof C42750c) || (e.getCause() instanceof C42750c)) {
                return C60856cj.m92899h(e);
            }
            return C60922j.m93045h(dqVar.f112418d.mo45985a(e, dpVar), C47810es.m84966f(new C42974dj(dqVar)), dqVar.f112416b);
        }
    }
}
