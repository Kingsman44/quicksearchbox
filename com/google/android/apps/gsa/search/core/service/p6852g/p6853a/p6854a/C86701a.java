package com.google.android.apps.gsa.search.core.service.p6852g.p6853a.p6854a;

import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.p6853a.C86714l;
import com.google.android.apps.gsa.search.core.service.p6852g.p6853a.C86715m;
import com.google.common.base.C58839bc;
import com.google.common.p4522b.C58374cr;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.a.a.a */
/* compiled from: PG */
public final class C86701a {

    /* renamed from: a */
    public final C86724d f234197a;

    /* renamed from: b */
    public final C58839bc f234198b;

    /* renamed from: c */
    public final Queue f234199c;

    public C86701a(Collection collection, C86724d dVar, C86715m mVar) {
        this.f234197a = dVar;
        C86714l lVar = new C86714l(mVar, dVar);
        this.f234198b = lVar;
        this.f234199c = new ConcurrentLinkedQueue(C58374cr.m89410b(collection, lVar));
    }
}
