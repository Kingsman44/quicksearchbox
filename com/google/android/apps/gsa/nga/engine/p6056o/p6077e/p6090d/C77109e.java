package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import android.service.notification.StatusBarNotification;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.e */
/* compiled from: PG */
final class C77109e extends C77125f {

    /* renamed from: a */
    private final StatusBarNotification f212808a;

    public C77109e(StatusBarNotification statusBarNotification) {
        this.f212808a = statusBarNotification;
    }

    /* renamed from: a */
    public final int mo72383a() {
        return 2;
    }

    /* renamed from: d */
    public final StatusBarNotification mo72423d() {
        return this.f212808a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C77143x) {
            C77143x xVar = (C77143x) obj;
            if (xVar.mo72383a() != 2 || !this.f212808a.equals(xVar.mo72423d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f212808a.hashCode();
    }

    public final String toString() {
        String obj = this.f212808a.toString();
        return "MessagingTarget{notification=" + obj + "}";
    }
}
