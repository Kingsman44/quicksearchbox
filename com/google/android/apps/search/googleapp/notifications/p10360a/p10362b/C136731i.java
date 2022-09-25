package com.google.android.apps.search.googleapp.notifications.p10360a.p10362b;

import com.google.p4283bv.p4345d.C57033l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.notifications.a.b.i */
/* compiled from: PG */
public final class C136731i {

    /* renamed from: a */
    public final C57033l f372185a;

    /* renamed from: b */
    public final long f372186b;

    public C136731i(C57033l lVar, long j) {
        C69664n.m101061g(lVar, "notificationEvent");
        this.f372185a = lVar;
        this.f372186b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C136731i)) {
            return false;
        }
        C136731i iVar = (C136731i) obj;
        return C69664n.m101066l(this.f372185a, iVar.f372185a) && this.f372186b == iVar.f372186b;
    }

    public final int hashCode() {
        int hashCode = this.f372185a.hashCode();
        long j = this.f372186b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        C57033l lVar = this.f372185a;
        long j = this.f372186b;
        return "ActionUploadInfo(notificationEvent=" + lVar + ", id=" + j + ")";
    }
}
