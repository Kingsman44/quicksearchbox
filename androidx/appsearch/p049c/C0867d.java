package androidx.appsearch.p049c;

import androidx.core.p097i.C1968c;
import java.util.Collections;
import java.util.Set;

/* renamed from: androidx.appsearch.c.d */
/* compiled from: PG */
public final class C0867d {

    /* renamed from: a */
    public final String f2933a;

    /* renamed from: b */
    private final String f2934b;

    /* renamed from: c */
    private final Set f2935c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0867d)) {
            return false;
        }
        C0867d dVar = (C0867d) obj;
        return this.f2933a.equals(dVar.f2933a) && this.f2934b.equals(dVar.f2934b) && this.f2935c.equals(dVar.f2935c);
    }

    public final int hashCode() {
        return C1968c.m5304a(this.f2933a, this.f2934b, this.f2935c);
    }

    public final String toString() {
        return "SchemaChangeInfo{packageName='" + this.f2933a + "', databaseName='" + this.f2934b + "', changedSchemaNames='" + this.f2935c + "'}";
    }

    public C0867d(String str, String str2, Set set) {
        str.getClass();
        this.f2933a = str;
        str2.getClass();
        this.f2934b = str2;
        set.getClass();
        this.f2935c = Collections.unmodifiableSet(set);
    }
}
