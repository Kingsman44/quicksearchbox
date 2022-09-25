package com.google.android.libraries.assistant.pcp.p1579n.p1580a;

import com.google.android.libraries.assistant.pcp.C18997n;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18712d;
import com.google.android.libraries.assistant.pcp.p1578m.C18981k;
import com.google.android.libraries.assistant.pcp.p1579n.C19001b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.pcp.n.a.b */
/* compiled from: PG */
public final class C19000b implements C19001b {

    /* renamed from: a */
    public static final C59071e f53374a = C59071e.m91332i("com.google.android.libraries.assistant.pcp.n.a.b");

    /* renamed from: b */
    private final Executor f53375b;

    public C19000b(Executor executor) {
        this.f53375b = executor;
    }

    /* renamed from: a */
    public final C18997n mo24238a(C18718c cVar) {
        return C18997n.m36420b().mo24092a();
    }

    /* renamed from: b */
    public final C18981k mo24239b() {
        return C18981k.PROACTIVE_BACKEND;
    }

    /* renamed from: c */
    public final C60870cx mo24240c(Set set, C18718c cVar) {
        C60870cx a = cVar.mo24114a(C18712d.f52788d);
        C18999a aVar = C18999a.f53373a;
        return C60922j.m93044g(a, C47810es.m84963c(aVar), this.f53375b);
    }
}
