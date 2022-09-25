package com.google.android.libraries.search.rendering.xuikit.p3130c;

import android.support.p033v7.widget.LinearLayoutManager;
import java.util.Map;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.libraries.search.rendering.xuikit.prefetch.DiskCache", mo61344c = "DiskCache.kt", mo61345d = "updateIndexForCleanup", mo61346e = {421})
/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.u */
/* compiled from: PG */
final class C40297u extends C69565c {

    /* renamed from: a */
    /* synthetic */ Object f105865a;

    /* renamed from: b */
    final /* synthetic */ C40301y f105866b;

    /* renamed from: c */
    int f105867c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40297u(C40301y yVar, C69577g gVar) {
        super(gVar);
        this.f105866b = yVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f105865a = obj;
        this.f105867c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f105866b.mo42388e((Map) null, 0, 0, (Duration) null, this);
    }
}
