package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.util.LruCache;
import com.google.android.libraries.gsa.p1876k.C22862b;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.v */
/* compiled from: PG */
public final /* synthetic */ class C113510v implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ Supplier f314271a;

    /* renamed from: b */
    public final /* synthetic */ LruCache f314272b;

    /* renamed from: c */
    public final /* synthetic */ String f314273c;

    public /* synthetic */ C113510v(Supplier supplier, LruCache lruCache, String str) {
        this.f314271a = supplier;
        this.f314272b = lruCache;
        this.f314273c = str;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        Supplier supplier = this.f314271a;
        LruCache lruCache = this.f314272b;
        String str = this.f314273c;
        Object obj = supplier.get();
        lruCache.put(str, obj);
        return obj;
    }
}
