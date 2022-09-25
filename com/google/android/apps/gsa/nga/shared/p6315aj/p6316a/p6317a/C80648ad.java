package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.graphics.drawable.Icon;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.ad */
/* compiled from: PG */
final class C80648ad extends C80651ag {

    /* renamed from: a */
    private final Icon f221402a;

    public C80648ad(Icon icon) {
        this.f221402a = icon;
    }

    /* renamed from: a */
    public final Icon mo74400a() {
        return this.f221402a;
    }

    /* renamed from: b */
    public final int mo74401b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C80786fg) {
            C80786fg fgVar = (C80786fg) obj;
            if (fgVar.mo74401b() != 2 || !this.f221402a.equals(fgVar.mo74400a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f221402a.hashCode();
    }

    public final String toString() {
        String obj = this.f221402a.toString();
        return "ChipIcon{icon=" + obj + "}";
    }
}
