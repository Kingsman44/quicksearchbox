package com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.db.c */
/* compiled from: PG */
public final class C30576c implements Cloneable {

    /* renamed from: a */
    public final String f82598a;

    /* renamed from: b */
    public boolean f82599b;

    /* renamed from: c */
    public int f82600c;

    /* renamed from: d */
    public int f82601d;

    /* renamed from: e */
    public long f82602e;

    /* renamed from: f */
    public long f82603f;

    /* renamed from: g */
    public long f82604g;

    /* renamed from: h */
    public boolean f82605h;

    public C30576c(String str) {
        this.f82598a = str;
    }

    /* renamed from: a */
    public static C30576c m57147a(C30576c cVar) {
        try {
            return (C30576c) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Clone not supported", e);
        }
    }

    /* renamed from: b */
    public final boolean mo36259b() {
        return this.f82600c != 0;
    }

    public final Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30576c)) {
            return false;
        }
        C30576c cVar = (C30576c) obj;
        return this.f82599b == cVar.f82599b && this.f82600c == cVar.f82600c && this.f82601d == cVar.f82601d && this.f82602e == cVar.f82602e && this.f82603f == cVar.f82603f && this.f82604g == cVar.f82604g && this.f82605h == cVar.f82605h && C58832aw.m90831a(this.f82598a, cVar.f82598a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f82598a, Boolean.valueOf(this.f82599b), Integer.valueOf(this.f82600c), Integer.valueOf(this.f82601d), Long.valueOf(this.f82602e), Long.valueOf(this.f82603f), Long.valueOf(this.f82604g), Boolean.valueOf(this.f82605h)});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("name", this.f82598a);
        b.mo56103c("enabled", String.valueOf(this.f82599b));
        b.mo56103c("numImpressions", String.valueOf(this.f82600c));
        b.mo56103c("numInteractions", String.valueOf(this.f82601d));
        b.mo56103c("activatedTimestampMs", String.valueOf(this.f82602e));
        b.mo56103c("lastImpressionTimestampMs", String.valueOf(this.f82603f));
        b.mo56103c("lastInteractionTimestampMs", String.valueOf(this.f82604g));
        b.mo56103c("completed", String.valueOf(this.f82605h));
        return b.toString();
    }
}
