package com.google.android.gms.cast.framework.media.internal;

import android.os.RemoteException;
import com.google.android.gms.cast.framework.media.C143505g;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.internal.C143566ae;
import java.util.List;

/* renamed from: com.google.android.gms.cast.framework.media.internal.o */
/* compiled from: PG */
public final class C143522o {

    /* renamed from: a */
    private static final C143566ae f389177a = new C143566ae("MediaSessionUtils");

    /* renamed from: a */
    public static int m233067a(NotificationOptions notificationOptions, long j) {
        return j == 10000 ? notificationOptions.f389066n : j != 30000 ? notificationOptions.f389065m : notificationOptions.f389067o;
    }

    /* renamed from: b */
    public static int m233068b(NotificationOptions notificationOptions, long j) {
        return j == 10000 ? notificationOptions.f389046B : j != 30000 ? notificationOptions.f389045A : notificationOptions.f389047C;
    }

    /* renamed from: c */
    public static int m233069c(NotificationOptions notificationOptions, long j) {
        return j == 10000 ? notificationOptions.f389069q : j != 30000 ? notificationOptions.f389068p : notificationOptions.f389070r;
    }

    /* renamed from: d */
    public static int m233070d(NotificationOptions notificationOptions, long j) {
        return j == 10000 ? notificationOptions.f389049E : j != 30000 ? notificationOptions.f389048D : notificationOptions.f389050F;
    }

    /* renamed from: e */
    public static List m233071e(C143505g gVar) {
        try {
            return gVar.mo118803e();
        } catch (RemoteException e) {
            f389177a.mo118887e(e, "Unable to call %s on %s.", "getNotificationActions", C143505g.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: f */
    public static int[] m233072f(C143505g gVar) {
        try {
            return gVar.mo118804f();
        } catch (RemoteException e) {
            f389177a.mo118887e(e, "Unable to call %s on %s.", "getCompactViewActionIndices", C143505g.class.getSimpleName());
            return null;
        }
    }
}
