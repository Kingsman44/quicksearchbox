package com.google.android.apps.search.assistant.verticals.p9880a.p9887d;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33884b;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33885c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.d.c */
/* compiled from: PG */
public final class C130358c implements C33884b {

    /* renamed from: a */
    public final C2164c f357273a;

    /* renamed from: b */
    public final String f357274b;

    /* renamed from: c */
    public final String f357275c;

    /* renamed from: d */
    public final ConcurrentHashMap f357276d = new ConcurrentHashMap();

    /* renamed from: e */
    private final C33885c f357277e;

    /* renamed from: f */
    private final Executor f357278f;

    public C130358c(C2164c cVar, String str, String str2, C33885c cVar2, Executor executor) {
        this.f357273a = cVar;
        this.f357274b = str;
        this.f357275c = str2;
        this.f357277e = cVar2;
        this.f357278f = new C60904dr(executor);
    }

    /* renamed from: a */
    public final void mo39111a(String str) {
        this.f357276d.remove(str);
    }

    /* renamed from: b */
    public final void mo39112b(String str) {
        C60870cx e = this.f357277e.mo39117e(str);
        C130357b bVar = new C130357b(this, str);
        C60856cj.m92911t(e, C47810es.m84974n(bVar), this.f357278f);
    }
}
