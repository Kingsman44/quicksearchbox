package com.facebook.litho;

import android.content.res.Configuration;

/* renamed from: com.facebook.litho.fj */
/* compiled from: PG */
public class C6267fj {

    /* renamed from: a */
    private static C6267fj f18508a;

    /* renamed from: b */
    private final Configuration f18509b;

    protected C6267fj(Configuration configuration) {
        this.f18509b = configuration;
    }

    /* renamed from: a */
    static synchronized C6267fj m16815a(Configuration configuration) {
        C6267fj fjVar;
        synchronized (C6267fj.class) {
            C6267fj fjVar2 = f18508a;
            if (fjVar2 == null || !fjVar2.f18509b.equals(configuration)) {
                f18508a = new C6233eg(new Configuration(configuration));
            }
            fjVar = f18508a;
        }
        return fjVar;
    }
}
