package androidx.appsearch.p047a;

import android.os.Bundle;
import androidx.appsearch.p053e.C0880a;

/* renamed from: androidx.appsearch.a.z */
/* compiled from: PG */
public final class C0861z {

    /* renamed from: a */
    public final Bundle f2852a;

    public C0861z(byte[] bArr) {
        Bundle bundle = new Bundle();
        this.f2852a = bundle;
        bundle.putString("packageName", "com.google.android.apps.nexuslauncher");
        bundle.putByteArray("sha256Certificate", bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0861z)) {
            return false;
        }
        return C0880a.m2763b(this.f2852a, ((C0861z) obj).f2852a);
    }

    public final int hashCode() {
        return C0880a.m2762a(this.f2852a);
    }
}
