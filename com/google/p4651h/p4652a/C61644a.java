package com.google.p4651h.p4652a;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import java.io.Serializable;
import java.util.Date;
import p3186j$.util.Objects;

/* renamed from: com.google.h.a.a */
/* compiled from: PG */
public final class C61644a implements Serializable {
    private static final long serialVersionUID = -8514239465808977353L;

    /* renamed from: a */
    public final String f166542a;

    /* renamed from: b */
    public final Long f166543b;

    public C61644a(String str, Date date) {
        this.f166542a = str;
        this.f166543b = date == null ? null : Long.valueOf(date.getTime());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C61644a)) {
            return false;
        }
        C61644a aVar = (C61644a) obj;
        if (!Objects.equals(this.f166542a, aVar.f166542a) || !Objects.equals(this.f166543b, aVar.f166543b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f166542a, this.f166543b);
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("tokenValue", this.f166542a);
        b.mo56102b("expirationTimeMillis", this.f166543b);
        return b.toString();
    }
}
