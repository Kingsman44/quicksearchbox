package com.google.android.apps.gsa.staticplugins.chime;

import android.app.Notification;
import android.graphics.Bitmap;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.aa */
/* compiled from: PG */
public final class C97658aa {
    /* renamed from: a */
    public static Bitmap m161901a(Notification notification) {
        if (notification.extras != null) {
            return (Bitmap) notification.extras.getParcelable("android.picture");
        }
        return null;
    }
}
