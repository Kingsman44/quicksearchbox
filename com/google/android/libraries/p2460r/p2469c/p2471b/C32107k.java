package com.google.android.libraries.p2460r.p2469c.p2471b;

import android.util.LruCache;

/* renamed from: com.google.android.libraries.r.c.b.k */
/* compiled from: PG */
final class C32107k extends LruCache {

    /* renamed from: a */
    final /* synthetic */ C32109m f86206a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32107k(C32109m mVar) {
        super(8);
        this.f86206a = mVar;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        int intValue = ((Integer) obj).intValue();
        C32109m mVar = this.f86206a;
        return new C32108l(intValue, mVar.f86211a, mVar.f86213c);
    }
}
