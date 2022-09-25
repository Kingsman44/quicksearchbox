package com.google.android.libraries.mdi.download.p2236d.p2239c;

import android.net.Uri;

/* renamed from: com.google.android.libraries.mdi.download.d.c.r */
/* compiled from: PG */
public final /* synthetic */ class C28930r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C28933u f78586a;

    /* renamed from: b */
    public final /* synthetic */ Uri f78587b;

    public /* synthetic */ C28930r(C28933u uVar, Uri uri) {
        this.f78586a = uVar;
        this.f78587b = uri;
    }

    public final void run() {
        C28933u uVar = this.f78586a;
        uVar.f78593e.remove(this.f78587b);
    }
}
