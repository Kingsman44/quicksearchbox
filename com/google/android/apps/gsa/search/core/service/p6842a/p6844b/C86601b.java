package com.google.android.apps.gsa.search.core.service.p6842a.p6844b;

import com.google.android.libraries.gsa.p1876k.C22872h;

/* renamed from: com.google.android.apps.gsa.search.core.service.a.b.b */
/* compiled from: PG */
public final /* synthetic */ class C86601b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Class f233950a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f233951b;

    public /* synthetic */ C86601b(Class cls, Runnable runnable) {
        this.f233950a = cls;
        this.f233951b = runnable;
    }

    public final void run() {
        Class cls = this.f233950a;
        Runnable runnable = this.f233951b;
        Class a = C22872h.m42741a(cls);
        try {
            runnable.run();
        } finally {
            C22872h.m42741a(a);
        }
    }
}
