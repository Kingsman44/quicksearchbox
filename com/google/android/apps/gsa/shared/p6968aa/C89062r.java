package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.aa.r */
/* compiled from: PG */
public final class C89062r implements C90964a {

    /* renamed from: a */
    public static final C89062r f241369a = new C89062r(2, false, false, -2, -2);

    /* renamed from: b */
    public final int f241370b;

    /* renamed from: c */
    public final boolean f241371c;

    /* renamed from: d */
    public final boolean f241372d;

    /* renamed from: e */
    public final int f241373e;

    /* renamed from: f */
    public final int f241374f;

    public C89062r(int i, boolean z, boolean z2, int i2, int i3) {
        this.f241370b = i;
        this.f241371c = z;
        this.f241372d = z2;
        this.f241373e = i2;
        this.f241374f = i3;
    }

    /* renamed from: a */
    public final boolean mo83040a() {
        int i = this.f241370b;
        return i == 1 || i == 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89062r)) {
            return false;
        }
        C89062r rVar = (C89062r) obj;
        return this.f241370b == rVar.f241370b && this.f241371c == rVar.f241371c && this.f241373e == rVar.f241373e;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        if (equals(f241369a)) {
            fVar.mo85291r("ConnectivityInfo[UNKNOWN]");
            return;
        }
        fVar.mo85291r("ConnectivityInfo");
        fVar.mo85279c("connectivityStatus").mo85276a(C90752i.m148230d(Integer.valueOf(this.f241370b)));
        fVar.mo85279c("metered").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f241371c)));
        fVar.mo85279c("type").mo85276a(C90752i.m148230d(Integer.valueOf(this.f241373e)));
        fVar.mo85279c("subtype").mo85276a(C90752i.m148230d(Integer.valueOf(this.f241374f)));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f241370b), Boolean.valueOf(this.f241371c), Integer.valueOf(this.f241373e)});
    }

    public final String toString() {
        int i = this.f241370b;
        boolean z = this.f241371c;
        int i2 = this.f241373e;
        int i3 = this.f241374f;
        return "ConnectivityInfo(connectivityStatus=" + i + " metered=" + z + " type=" + i2 + " subtype=" + i3 + ")";
    }
}
