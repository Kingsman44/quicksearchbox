package org.chromium.net.impl;

import android.content.Context;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* renamed from: org.chromium.net.impl.cj */
/* compiled from: PG */
public final class C72504cj extends C72503ci {

    /* renamed from: n */
    private C72516cv f192917n;

    public C72504cj(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final C72516cv mo64255b() {
        return this.f192917n;
    }

    /* renamed from: f */
    public final void mo64256f(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.f192917n = new C72516cv(libraryLoader);
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        mo64256f(libraryLoader);
        return this;
    }
}
