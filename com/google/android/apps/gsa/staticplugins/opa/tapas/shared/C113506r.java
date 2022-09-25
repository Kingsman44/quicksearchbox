package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.util.LruCache;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.r */
/* compiled from: PG */
public final /* synthetic */ class C113506r implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C113250ac f314264a;

    /* renamed from: b */
    public final /* synthetic */ LruCache f314265b;

    /* renamed from: c */
    public final /* synthetic */ String f314266c;

    public /* synthetic */ C113506r(C113250ac acVar, LruCache lruCache, String str) {
        this.f314264a = acVar;
        this.f314265b = lruCache;
        this.f314266c = str;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C113250ac acVar = this.f314264a;
        LruCache lruCache = this.f314265b;
        String str = this.f314266c;
        Object a = acVar.mo99923a();
        lruCache.put(str, a);
        return a;
    }
}
