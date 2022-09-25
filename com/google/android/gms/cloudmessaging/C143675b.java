package com.google.android.gms.cloudmessaging;

import android.util.Log;

/* renamed from: com.google.android.gms.cloudmessaging.b */
/* compiled from: PG */
public final class C143675b extends ClassLoader {
    /* access modifiers changed from: protected */
    public final Class loadClass(String str, boolean z) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return CloudMessagingMessengerCompat.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return CloudMessagingMessengerCompat.class;
    }
}
