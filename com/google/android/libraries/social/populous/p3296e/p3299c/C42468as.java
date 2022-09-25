package com.google.android.libraries.social.populous.p3296e.p3299c;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.social.populous.e.c.as */
/* compiled from: PG */
public final class C42468as {

    /* renamed from: a */
    public static final String[] f111396a = {"_id", "displayName", "accountName", "accountType", "packageName"};

    /* renamed from: b */
    public final long f111397b;

    /* renamed from: c */
    public final String f111398c;

    /* renamed from: d */
    public final String f111399d;

    /* renamed from: e */
    public final String f111400e;

    /* renamed from: f */
    public final String f111401f;

    public C42468as(long j, String str, String str2, String str3, String str4) {
        this.f111397b = j;
        this.f111398c = str;
        this.f111399d = str2;
        this.f111400e = str3;
        this.f111401f = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42468as) {
            C42468as asVar = (C42468as) obj;
            return this.f111397b == asVar.f111397b && C58832aw.m90831a(this.f111398c, asVar.f111398c) && C58832aw.m90831a(this.f111399d, asVar.f111399d) && C58832aw.m90831a(this.f111400e, asVar.f111400e) && C58832aw.m90831a(this.f111401f, asVar.f111401f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f111397b), this.f111398c, this.f111399d, this.f111400e, this.f111401f});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56103c("id", String.valueOf(this.f111397b));
        b.mo56102b("displayName", this.f111398c);
        b.mo56102b("accountName", this.f111399d);
        b.mo56102b("accountType", this.f111400e);
        b.mo56102b("packageName", this.f111401f);
        return b.toString();
    }
}
