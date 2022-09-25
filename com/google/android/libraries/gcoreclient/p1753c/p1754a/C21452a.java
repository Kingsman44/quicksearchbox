package com.google.android.libraries.gcoreclient.p1753c.p1754a;

import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.c.a.a */
/* compiled from: PG */
public class C21452a {

    /* renamed from: a */
    public final GlobalSearchApplicationInfo f59903a;

    public C21452a(GlobalSearchApplicationInfo globalSearchApplicationInfo) {
        this.f59903a = globalSearchApplicationInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21452a)) {
            return false;
        }
        return this.f59903a.equals(((C21452a) obj).f59903a);
    }

    public final int hashCode() {
        return this.f59903a.hashCode();
    }
}
