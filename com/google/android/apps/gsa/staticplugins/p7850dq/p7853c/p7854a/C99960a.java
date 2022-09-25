package com.google.android.apps.gsa.staticplugins.p7850dq.p7853c.p7854a;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85343l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.dq.c.a.a */
/* compiled from: PG */
final class C99960a {

    /* renamed from: a */
    public C58833ax f279620a = C58836b.f156633a;

    /* renamed from: b */
    public SettableFuture f279621b = new SettableFuture();

    /* renamed from: c */
    public C85343l f279622c = C85343l.f231127h;

    /* renamed from: d */
    public final Map f279623d = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C58485gu mo91685a() {
        return C58485gu.m89842j(this.f279623d.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo91686b() {
        if (!this.f279620a.mo56113h()) {
            return this.f279621b;
        }
        return (C60870cx) this.f279620a.mo56107c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo91687c(Object obj) {
        this.f279623d.remove(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo91688d() {
        this.f279620a = C58836b.f156633a;
        this.f279621b = new SettableFuture();
    }
}
