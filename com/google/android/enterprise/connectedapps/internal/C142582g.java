package com.google.android.enterprise.connectedapps.internal;

import android.os.Bundle;
import android.util.Log;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.p10715b.C142562c;

/* renamed from: com.google.android.enterprise.connectedapps.internal.g */
/* compiled from: PG */
public final class C142582g implements C142585j {

    /* renamed from: a */
    private final C142549ai f386890a;

    /* renamed from: b */
    private final Bundler f386891b;

    /* renamed from: c */
    private final BundlerType f386892c;

    public C142582g(C142549ai aiVar, Bundler bundler, BundlerType bundlerType) {
        if (aiVar == null || bundler == null) {
            throw null;
        }
        this.f386890a = aiVar;
        this.f386891b = bundler;
        this.f386892c = bundlerType;
    }

    /* renamed from: a */
    public final void mo117213a(Throwable th) {
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        bundle.putSerializable("throwable", th);
        try {
            new C142580e(this.f386890a).makeBundleCall(bundle);
        } catch (C142562c unused) {
            Log.e("FutureResult", "Connection was dropped before response");
        }
    }

    /* renamed from: b */
    public final void mo117214b(Object obj) {
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        this.f386891b.mo86971c(bundle, "result", obj, this.f386892c);
        try {
            new C142579d(this.f386890a, 0).makeBundleCall(bundle);
        } catch (C142562c unused) {
            Log.e("FutureResult", "Connection was dropped before response");
        } catch (RuntimeException e) {
            mo117213a(new C142562c("Error when writing result of future", e));
        }
    }
}
