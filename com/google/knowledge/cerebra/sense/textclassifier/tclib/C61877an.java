package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.an */
/* compiled from: PG */
final class C61877an extends ContentObserver {

    /* renamed from: a */
    public final ContentResolver f167319a;

    /* renamed from: b */
    private final C61914bx f167320b;

    public C61877an(ContentResolver contentResolver, C61914bx bxVar) {
        super((Handler) null);
        this.f167319a = contentResolver;
        this.f167320b = bxVar;
    }

    public final void onChange(boolean z, Uri uri) {
        this.f167320b.mo58352b();
    }
}
