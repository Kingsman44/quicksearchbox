package com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.h.a.b.k */
/* compiled from: PG */
public final class C21543k implements C21551h {

    /* renamed from: a */
    public static final C21545m f59945a = new C21542j();

    /* renamed from: b */
    public final Status f59946b;

    public C21543k(Status status) {
        this.f59946b = status;
    }

    /* renamed from: a */
    public final int mo26998a() {
        return this.f59946b.f389621g;
    }

    /* renamed from: b */
    public final PendingIntent mo26999b() {
        return this.f59946b.f389623i;
    }

    /* renamed from: c */
    public final C21551h mo26997c() {
        return this;
    }

    /* renamed from: d */
    public final String mo27000d() {
        return this.f59946b.f389622h;
    }

    /* renamed from: e */
    public final boolean mo27001e() {
        return this.f59946b.mo119096b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21543k)) {
            return false;
        }
        return this.f59946b.equals(((C21543k) obj).f59946b);
    }

    /* renamed from: f */
    public final boolean mo27003f() {
        return this.f59946b.mo119097c();
    }

    public final int hashCode() {
        return this.f59946b.hashCode();
    }

    public final String toString() {
        return this.f59946b.toString();
    }
}
