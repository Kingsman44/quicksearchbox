package com.google.apps.tiktok.dataservice;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.apps.tiktok.dataservice.x */
/* compiled from: PG */
final class C46884x extends C46786dc {

    /* renamed from: a */
    private final C58528ij f122326a;

    public C46884x(C58528ij ijVar) {
        if (ijVar != null) {
            this.f122326a = ijVar;
            return;
        }
        throw new NullPointerException("Null notificationKeys");
    }

    /* renamed from: b */
    public final C58528ij mo50742b() {
        return this.f122326a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46786dc) {
            return this.f122326a.equals(((C46786dc) obj).mo50742b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f122326a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f122326a.toString();
        return "SetKey{notificationKeys=" + obj + "}";
    }
}
