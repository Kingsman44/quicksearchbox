package com.google.android.apps.gsa.assistant.settings.features.appactions.p570f;

import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.f.k */
/* compiled from: PG */
final class C10393k extends C10382ad {

    /* renamed from: a */
    private final C10273r f35099a;

    /* renamed from: b */
    private final long f35100b;

    public C10393k(C10273r rVar, long j) {
        if (rVar != null) {
            this.f35099a = rVar;
            this.f35100b = j;
            return;
        }
        throw new NullPointerException("Null shortcutData");
    }

    /* renamed from: a */
    public final long mo18463a() {
        return this.f35100b;
    }

    /* renamed from: b */
    public final C10273r mo18464b() {
        return this.f35099a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10382ad) {
            C10382ad adVar = (C10382ad) obj;
            return this.f35099a.equals(adVar.mo18464b()) && this.f35100b == adVar.mo18463a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f35099a.hashCode();
        long j = this.f35100b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String obj = this.f35099a.toString();
        long j = this.f35100b;
        return "ShortcutRankEntry{shortcutData=" + obj + ", appForegroundTime=" + j + "}";
    }
}
