package com.google.android.apps.gsa.staticplugins.nga.p8047b;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.b.c */
/* compiled from: PG */
final class C103007c extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C103009e f287594a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103007c(C103009e eVar) {
        super((Handler) null);
        this.f287594a = eVar;
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z) {
        this.f287594a.mo93561b();
    }

    public final void onChange(boolean z, Uri uri) {
        this.f287594a.mo93561b();
    }
}
