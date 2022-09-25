package com.google.android.libraries.lens.view.filecache;

import android.graphics.Bitmap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.filecache.e */
/* compiled from: PG */
public final /* synthetic */ class C25841e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C25848l f70198a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f70199b;

    /* renamed from: c */
    public final /* synthetic */ int f70200c;

    public /* synthetic */ C25841e(C25848l lVar, Bitmap bitmap, int i) {
        this.f70198a = lVar;
        this.f70199b = bitmap;
        this.f70200c = i;
    }

    public final Object call() {
        C25848l lVar = this.f70198a;
        return new C25837a(new C25846j(lVar.f70212c.mo32034a(this.f70199b, this.f70200c)));
    }
}
