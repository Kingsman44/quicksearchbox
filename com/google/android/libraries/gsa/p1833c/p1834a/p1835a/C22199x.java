package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91010j;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.gsa.c.a.a.x */
/* compiled from: PG */
final class C22199x implements C91010j {

    /* renamed from: a */
    static final C22199x f61279a = new C22199x(-1, -1);

    /* renamed from: b */
    static final C22199x f61280b = new C22199x(-2, -2);

    /* renamed from: c */
    public final int f61281c;

    /* renamed from: d */
    public final int f61282d;

    public C22199x(int i, int i2) {
        this.f61281c = i;
        this.f61282d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22199x)) {
            return false;
        }
        C22199x xVar = (C22199x) obj;
        return this.f61281c == xVar.f61281c && this.f61282d == xVar.f61282d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f61281c), Integer.valueOf(this.f61282d)});
    }

    /* renamed from: g */
    public final void mo27451g(C91005e eVar) {
        int i = this.f61281c;
        eVar.mo85277b("%s, %s", C90752i.m148229c(i == -1 ? "NONE" : i == -2 ? "UNKNOWN" : i == 0 ? "MOBILE" : i == 1 ? "WIFI" : Integer.toString(i)), C90752i.m148230d(Integer.valueOf(this.f61282d)));
    }
}
