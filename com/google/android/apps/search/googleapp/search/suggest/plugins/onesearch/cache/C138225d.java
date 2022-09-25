package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.OneSearchAppSearchWriter$Companion", mo61344c = "OneSearchAppSearchWriter.kt", mo61345d = "writeZeroPrefixCache", mo61346e = {82, 97, 111})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.d */
/* compiled from: PG */
final class C138225d extends C69565c {

    /* renamed from: a */
    Object f376081a;

    /* renamed from: b */
    Object f376082b;

    /* renamed from: c */
    Object f376083c;

    /* renamed from: d */
    long f376084d;

    /* renamed from: e */
    /* synthetic */ Object f376085e;

    /* renamed from: f */
    final /* synthetic */ C138226e f376086f;

    /* renamed from: g */
    int f376087g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138225d(C138226e eVar, C69577g gVar) {
        super(gVar);
        this.f376086f = eVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f376085e = obj;
        this.f376087g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f376086f.mo114206a((Context) null, (C138317r) null, (C138240s) null, 0, this);
    }
}
