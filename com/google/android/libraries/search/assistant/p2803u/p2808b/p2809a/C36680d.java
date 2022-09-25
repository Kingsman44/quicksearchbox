package com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a;

import com.google.android.libraries.search.assistant.p2803u.p2804a.p2806b.C36635i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4184bj.p4193c.p4201f.C56002b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.u.b.a.d */
/* compiled from: PG */
public final class C36680d {

    /* renamed from: a */
    public final C36635i f95566a;

    /* renamed from: b */
    private final Executor f95567b;

    public C36680d(C36635i iVar, Executor executor) {
        this.f95566a = iVar;
        this.f95567b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo40315a(C56002b bVar, C60870cx cxVar) {
        C36679c cVar = new C36679c(bVar);
        return C60922j.m93044g(cxVar, C47810es.m84963c(cVar), this.f95567b);
    }

    /* renamed from: b */
    public final C60870cx mo40316b(String str) {
        C60870cx b = this.f95566a.mo40294b(str);
        C36672b bVar = new C36672b(this, str);
        return C60922j.m93045h(b, C47810es.m84966f(bVar), this.f95567b);
    }
}
