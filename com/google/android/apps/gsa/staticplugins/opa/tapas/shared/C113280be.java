package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.os.UserHandle;
import com.android.launcher3.compat.LauncherActivityInfoCompat;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.be */
/* compiled from: PG */
public final class C113280be extends C113424fe {

    /* renamed from: a */
    private final LauncherActivityInfoCompat f313725a;

    /* renamed from: b */
    private final UserHandle f313726b;

    public C113280be(LauncherActivityInfoCompat launcherActivityInfoCompat, UserHandle userHandle) {
        this.f313725a = launcherActivityInfoCompat;
        this.f313726b = userHandle;
    }

    /* renamed from: a */
    public final UserHandle mo100071a() {
        return this.f313726b;
    }

    /* renamed from: b */
    public final LauncherActivityInfoCompat mo100072b() {
        return this.f313725a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C113424fe) {
            C113424fe feVar = (C113424fe) obj;
            return this.f313725a.equals(feVar.mo100072b()) && this.f313726b.equals(feVar.mo100071a());
        }
    }

    public final int hashCode() {
        return ((this.f313725a.hashCode() ^ 1000003) * 1000003) ^ this.f313726b.hashCode();
    }

    public final String toString() {
        String obj = this.f313725a.toString();
        String obj2 = this.f313726b.toString();
        return "UserBadgedIconParams{activityInfoCompat=" + obj + ", userHandle=" + obj2 + "}";
    }
}
