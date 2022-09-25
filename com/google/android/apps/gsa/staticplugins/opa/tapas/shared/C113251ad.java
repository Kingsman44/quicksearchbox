package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.LruCache;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113206m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ad */
/* compiled from: PG */
public final class C113251ad {

    /* renamed from: a */
    public final LruCache f313608a = new LruCache(20);

    /* renamed from: b */
    public final LruCache f313609b = new LruCache(10);

    /* renamed from: c */
    public final LruCache f313610c = new LruCache(50);

    /* renamed from: d */
    public final LruCache f313611d = new LruCache(50);

    /* renamed from: e */
    public final PackageManager f313612e;

    /* renamed from: f */
    public final C113206m f313613f;

    /* renamed from: g */
    private final LruCache f313614g = new LruCache(200);

    /* renamed from: h */
    private final C22871g f313615h;

    /* renamed from: i */
    private final C22871g f313616i;

    /* renamed from: j */
    private final C86124t f313617j;

    public C113251ad(C22871g gVar, Context context, C113206m mVar, C22871g gVar2, C86124t tVar) {
        this.f313615h = gVar;
        this.f313616i = gVar2;
        this.f313612e = context.getPackageManager();
        this.f313613f = mVar;
        this.f313617j = tVar;
    }

    /* renamed from: f */
    private final C60870cx m187293f(String str, Function function) {
        return C60922j.m93045h(mo99928e(this.f313608a, str, new C113504p(this, str)), new C113507s(function), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo99924a(String str) {
        return m187293f(str, new C113508t(this));
    }

    /* renamed from: b */
    public final C60870cx mo99925b(String str) {
        return m187293f(str, new C113512x(this));
    }

    /* renamed from: c */
    public final C60870cx mo99926c(String str) {
        if (this.f313617j.mo79746e(C90063do.f249326bS)) {
            return mo99928e(this.f313614g, str, new C113249ab(this, str));
        }
        LruCache lruCache = this.f313614g;
        C113505q qVar = new C113505q(this, str);
        Object obj = lruCache.get(str);
        if (obj != null) {
            return C60856cj.m92900i(obj);
        }
        return this.f313616i.mo28201a("Fetching item missing from cache in lightweight runner", new C113510v(qVar, lruCache, str));
    }

    /* renamed from: d */
    public final C60870cx mo99927d(String str) {
        if (this.f313617j.mo79746e(C90063do.f249497ee)) {
            return mo99926c(str);
        }
        return mo99925b(str);
    }

    /* renamed from: e */
    public final C60870cx mo99928e(LruCache lruCache, String str, C113250ac acVar) {
        Object obj = lruCache.get(str);
        if (obj != null) {
            return C60856cj.m92900i(obj);
        }
        return this.f313615h.mo28201a("Fetching item missing from cache in background runner", new C113506r(acVar, lruCache, str));
    }
}
