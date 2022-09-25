package com.google.android.libraries.appdoctor;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.libraries.appdoctor.e */
/* compiled from: PG */
public final class C10477e implements AutoCloseable, C10480h {

    /* renamed from: a */
    public static final Uri f35244a = Uri.parse("content://com.google.android.gms.common.appdoctor/fixes");

    /* renamed from: b */
    public final ContentProviderClient f35245b;

    /* renamed from: c */
    private final String f35246c;

    public C10477e(Context context) {
        this.f35246c = context.getPackageName();
        ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(f35244a);
        this.f35245b = acquireContentProviderClient;
        if (acquireContentProviderClient == null) {
            throw new RemoteException("Unable to acquire ContentProviderClient");
        }
    }

    /* renamed from: b */
    public static boolean m25456b(Context context) {
        return context.checkUriPermission(f35244a, 0, context.getApplicationInfo().uid, 1) == 0;
    }

    /* renamed from: a */
    public final Bundle mo18514a() {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.common.appdoctor.package_name", this.f35246c);
        return bundle;
    }

    public final void close() {
        this.f35245b.close();
    }
}
