package org.p5610a.p5611a.p5618b.p5620b;

import java.io.Serializable;
import java.util.Map;
import org.p5610a.p5611a.p5618b.p5619a.C71992a;
import p3186j$.util.Objects;

/* renamed from: org.a.a.b.b.c */
/* compiled from: PG */
public abstract class C71996c implements Map.Entry, Comparable, Serializable {
    private static final long serialVersionUID = 4954918890077093841L;

    /* renamed from: a */
    public abstract Object mo63197a();

    /* renamed from: b */
    public abstract Object mo63198b();

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C71996c cVar = (C71996c) obj;
        C71992a aVar = new C71992a();
        aVar.mo63193a(mo63197a(), cVar.mo63197a());
        aVar.mo63193a(mo63198b(), cVar.mo63198b());
        return aVar.f191712a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return Objects.equals(mo63197a(), entry.getKey()) && Objects.equals(mo63198b(), entry.getValue());
        }
    }

    public final Object getKey() {
        return mo63197a();
    }

    public final Object getValue() {
        return mo63198b();
    }

    public final String toString() {
        String valueOf = String.valueOf(mo63197a());
        String valueOf2 = String.valueOf(mo63198b());
        return "(" + valueOf + "," + valueOf2 + ")";
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (mo63197a() == null) {
            i = 0;
        } else {
            i = mo63197a().hashCode();
        }
        if (mo63198b() != null) {
            i2 = mo63198b().hashCode();
        }
        return i ^ i2;
    }
}
