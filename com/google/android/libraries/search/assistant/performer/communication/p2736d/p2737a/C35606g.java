package com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.a.g */
/* compiled from: PG */
public final class C35606g {

    /* renamed from: a */
    public final Executor f93449a;

    /* renamed from: b */
    public final Executor f93450b;

    /* renamed from: c */
    public final Set f93451c;

    /* renamed from: d */
    public final AtomicReference f93452d = new AtomicReference(C58836b.f156633a);

    public C35606g(Executor executor, Executor executor2, Set set) {
        this.f93449a = executor;
        this.f93450b = new C60904dr(executor2);
        this.f93451c = set;
    }

    /* renamed from: a */
    public final C60870cx mo39738a() {
        return C60856cj.m92900i((C58833ax) this.f93452d.get());
    }
}
