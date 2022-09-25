package org.p5610a.p5611a.p5618b.p5620b;

import java.io.Serializable;
import org.p5610a.p5611a.p5618b.p5619a.C71992a;
import p3186j$.util.Objects;

/* renamed from: org.a.a.b.b.d */
/* compiled from: PG */
public abstract class C71997d implements Comparable, Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public abstract Object mo63200a();

    /* renamed from: b */
    public abstract Object mo63201b();

    /* renamed from: c */
    public abstract Object mo63202c();

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C71997d dVar = (C71997d) obj;
        C71992a aVar = new C71992a();
        aVar.mo63193a(mo63200a(), dVar.mo63200a());
        aVar.mo63193a(mo63201b(), dVar.mo63201b());
        aVar.mo63193a(mo63202c(), dVar.mo63202c());
        return aVar.f191712a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C71997d) {
            C71997d dVar = (C71997d) obj;
            return Objects.equals(mo63200a(), dVar.mo63200a()) && Objects.equals(mo63201b(), dVar.mo63201b()) && Objects.equals(mo63202c(), dVar.mo63202c());
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(mo63200a());
        String valueOf2 = String.valueOf(mo63201b());
        String valueOf3 = String.valueOf(mo63202c());
        return "(" + valueOf + "," + valueOf2 + "," + valueOf3 + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (mo63200a() == null) {
            i = 0;
        } else {
            i = mo63200a().hashCode();
        }
        if (mo63201b() == null) {
            i2 = 0;
        } else {
            i2 = mo63201b().hashCode();
        }
        int i4 = i ^ i2;
        if (mo63202c() != null) {
            i3 = mo63202c().hashCode();
        }
        return i4 ^ i3;
    }
}
