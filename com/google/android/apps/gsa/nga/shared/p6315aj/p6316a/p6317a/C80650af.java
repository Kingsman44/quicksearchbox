package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.af */
/* compiled from: PG */
final class C80650af extends C80651ag {

    /* renamed from: a */
    private final String f221404a;

    public C80650af(String str) {
        this.f221404a = str;
    }

    /* renamed from: b */
    public final int mo74401b() {
        return 1;
    }

    /* renamed from: d */
    public final String mo74409d() {
        return this.f221404a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C80786fg) {
            C80786fg fgVar = (C80786fg) obj;
            if (fgVar.mo74401b() != 1 || !this.f221404a.equals(fgVar.mo74409d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f221404a.hashCode();
    }

    public final String toString() {
        String str = this.f221404a;
        return "ChipIcon{url=" + str + "}";
    }
}
