package com.google.android.apps.gsa.staticplugins.nga.p8087s;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.s.af */
/* compiled from: PG */
final class C103785af extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C103787ah f288982a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103785af(C103787ah ahVar) {
        super((Handler) null);
        this.f288982a = ahVar;
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z) {
        this.f288982a.mo93850g();
    }

    public final void onChange(boolean z, Uri uri) {
        this.f288982a.mo93850g();
    }
}
