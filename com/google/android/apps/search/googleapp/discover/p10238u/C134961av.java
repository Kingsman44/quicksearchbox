package com.google.android.apps.search.googleapp.discover.p10238u;

import android.net.Uri;
import android.support.p033v7.widget.LinearLayoutManager;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.DiscoverUrlFetcher", mo61344c = "DiscoverUrlFetcher.kt", mo61345d = "getCookies", mo61346e = {217})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.av */
/* compiled from: PG */
final class C134961av extends C69565c {

    /* renamed from: a */
    /* synthetic */ Object f367467a;

    /* renamed from: b */
    final /* synthetic */ C134962aw f367468b;

    /* renamed from: c */
    int f367469c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134961av(C134962aw awVar, C69577g gVar) {
        super(gVar);
        this.f367468b = awVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f367467a = obj;
        this.f367469c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f367468b.mo112095e((Uri) null, this);
    }
}
