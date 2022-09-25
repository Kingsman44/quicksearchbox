package androidx.appsearch.p049c;

import androidx.core.p097i.C1968c;
import java.util.Collections;
import java.util.Set;

/* renamed from: androidx.appsearch.c.a */
/* compiled from: PG */
public final class C0864a {

    /* renamed from: a */
    public final String f2924a;

    /* renamed from: b */
    private final String f2925b;

    /* renamed from: c */
    private final String f2926c;

    /* renamed from: d */
    private final String f2927d;

    /* renamed from: e */
    private final Set f2928e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0864a)) {
            return false;
        }
        C0864a aVar = (C0864a) obj;
        return this.f2924a.equals(aVar.f2924a) && this.f2925b.equals(aVar.f2925b) && this.f2926c.equals(aVar.f2926c) && this.f2927d.equals(aVar.f2927d) && this.f2928e.equals(aVar.f2928e);
    }

    public final int hashCode() {
        return C1968c.m5304a(this.f2924a, this.f2925b, this.f2926c, this.f2927d, this.f2928e);
    }

    public final String toString() {
        return "DocumentChangeInfo{packageName='" + this.f2924a + "', database='" + this.f2925b + "', namespace='" + this.f2926c + "', schemaName='" + this.f2927d + "', changedDocumentIds='" + this.f2928e + "'}";
    }

    public C0864a(String str, String str2, String str3, String str4, Set set) {
        str.getClass();
        this.f2924a = str;
        str2.getClass();
        this.f2925b = str2;
        str3.getClass();
        this.f2926c = str3;
        str4.getClass();
        this.f2927d = str4;
        set.getClass();
        this.f2928e = Collections.unmodifiableSet(set);
    }
}
