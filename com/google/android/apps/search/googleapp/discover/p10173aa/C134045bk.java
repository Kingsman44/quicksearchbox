package com.google.android.apps.search.googleapp.discover.p10173aa;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.search.googleapp.discover.p10238u.C135050dx;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncWorker", mo61344c = "FeedSyncWorker.kt", mo61345d = "refreshSession", mo61346e = {246})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.bk */
/* compiled from: PG */
final class C134045bk extends C69565c {

    /* renamed from: a */
    /* synthetic */ Object f365118a;

    /* renamed from: b */
    final /* synthetic */ C134053bs f365119b;

    /* renamed from: c */
    int f365120c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134045bk(C134053bs bsVar, C69577g gVar) {
        super(gVar);
        this.f365119b = bsVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f365118a = obj;
        this.f365120c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f365119b.mo111537d((C135050dx) null, false, this);
    }
}
