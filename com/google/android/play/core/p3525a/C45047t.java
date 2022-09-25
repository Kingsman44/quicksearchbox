package com.google.android.play.core.p3525a;

/* renamed from: com.google.android.play.core.a.t */
/* compiled from: PG */
final class C45047t extends C45038k {
    /* renamed from: a */
    public final int mo48868a() {
        return 1;
    }

    /* renamed from: b */
    public final boolean mo48869b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45038k) {
            C45038k kVar = (C45038k) obj;
            return kVar.mo48868a() == 1 && !kVar.mo48869b();
        }
    }

    public final int hashCode() {
        return -722378861;
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=1, allowAssetPackDeletion=false}";
    }
}
