package com.google.android.enterprise.connectedapps;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142577b;

/* renamed from: com.google.android.enterprise.connectedapps.af */
/* compiled from: PG */
public abstract class C142546af implements C142553am {

    /* renamed from: a */
    private final Bundler f386829a;

    /* renamed from: b */
    private final BundlerType f386830b;

    protected C142546af(Bundler bundler, BundlerType bundlerType) {
        bundler.getClass();
        this.f386829a = bundler;
        this.f386830b = bundlerType;
    }

    /* renamed from: a */
    public final void mo106921a(Bundle bundle) {
        mo117168c(C142577b.m231205a(bundle));
    }

    /* renamed from: b */
    public final void mo106922b(int i, Bundle bundle) {
        mo117169d(this.f386829a.mo86969a(bundle, "result", this.f386830b));
    }

    /* renamed from: c */
    public abstract void mo117168c(Throwable th);

    /* renamed from: d */
    public abstract void mo117169d(Object obj);
}
