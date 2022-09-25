package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.app.PendingIntent;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bs */
/* compiled from: PG */
public final class C80690bs extends C80788fi {

    /* renamed from: a */
    public final PendingIntent f221553a;

    public C80690bs(PendingIntent pendingIntent) {
        this.f221553a = pendingIntent;
    }

    @Deprecated
    /* renamed from: a */
    public final PendingIntent mo74614a() {
        return this.f221553a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C80788fi)) {
            return false;
        }
        C80788fi fiVar = (C80788fi) obj;
        PendingIntent pendingIntent = this.f221553a;
        if (pendingIntent == null) {
            return fiVar.mo74614a() == null;
        }
        return pendingIntent.equals(fiVar.mo74614a());
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.f221553a;
        return (pendingIntent == null ? 0 : pendingIntent.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f221553a);
        return "TakeScreenshot{onFinish=" + valueOf + "}";
    }
}
