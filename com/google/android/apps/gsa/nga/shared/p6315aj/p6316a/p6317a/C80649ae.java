package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.graphics.drawable.Icon;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.ae */
/* compiled from: PG */
final class C80649ae extends C80651ag {

    /* renamed from: a */
    private final Icon f221403a;

    public C80649ae(Icon icon) {
        this.f221403a = icon;
    }

    /* renamed from: b */
    public final int mo74401b() {
        return 3;
    }

    /* renamed from: c */
    public final Icon mo74405c() {
        return this.f221403a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C80786fg) {
            C80786fg fgVar = (C80786fg) obj;
            if (fgVar.mo74401b() != 3 || !this.f221403a.equals(fgVar.mo74405c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f221403a.hashCode();
    }

    public final String toString() {
        String obj = this.f221403a.toString();
        return "ChipIcon{tintableIcon=" + obj + "}";
    }
}
