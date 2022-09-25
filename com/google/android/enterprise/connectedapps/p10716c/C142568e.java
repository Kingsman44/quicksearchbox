package com.google.android.enterprise.connectedapps.p10716c;

import com.google.android.enterprise.connectedapps.C142546af;
import com.google.android.enterprise.connectedapps.C142555ao;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142581f;
import com.google.android.enterprise.connectedapps.internal.C142585j;
import com.google.android.enterprise.connectedapps.p10715b.C142562c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.enterprise.connectedapps.c.e */
/* compiled from: PG */
public final class C142568e extends C142546af {

    /* renamed from: a */
    public final SettableFuture f386859a = new SettableFuture();

    public C142568e(Bundler bundler, BundlerType bundlerType) {
        super(bundler, bundlerType);
    }

    /* renamed from: e */
    public static C60870cx m231169e(Map map) {
        SettableFuture settableFuture = new SettableFuture();
        int size = map.size();
        Objects.requireNonNull(settableFuture);
        C142581f fVar = new C142581f(size, new C142564a(settableFuture));
        for (Map.Entry entry : map.entrySet()) {
            C60856cj.m92911t(C60846c.m92878g(C60838bs.m92859i((C60870cx) entry.getValue()), C142562c.class, new C142565b(fVar, entry), C60826bg.f164896a), new C142567d((C142555ao) entry.getKey(), fVar), C60826bg.f164896a);
        }
        return settableFuture;
    }

    /* renamed from: f */
    public static void m231170f(C60870cx cxVar, C142585j jVar) {
        C60856cj.m92911t(C60838bs.m92859i(cxVar), new C142566c(jVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo117168c(Throwable th) {
        this.f386859a.mo57357o(th);
    }

    /* renamed from: d */
    public final void mo117169d(Object obj) {
        this.f386859a.mo57356n(obj);
    }
}
