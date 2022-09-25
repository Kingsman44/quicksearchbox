package com.google.android.libraries.p1975k.p1977b;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: com.google.android.libraries.k.b.m */
/* compiled from: PG */
final class C23992m extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C23993n f65588a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23992m(C23993n nVar, Handler handler) {
        super(handler);
        this.f65588a = nVar;
    }

    public final void onChange(boolean z, Uri uri) {
        this.f65588a.mo29403b();
    }
}
