package org.p5633c.p5634a.p5638d;

import java.io.Serializable;
import java.util.Locale;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72233e;

/* renamed from: org.c.a.d.a */
/* compiled from: PG */
public abstract class C72211a implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo63525a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C72132a mo63526b() {
        throw null;
    }

    /* renamed from: d */
    public abstract C72233e mo63528d();

    /* renamed from: e */
    public final int mo63552e() {
        return mo63528d().mo63444a(mo63525a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72211a)) {
            return false;
        }
        C72211a aVar = (C72211a) obj;
        return mo63552e() == aVar.mo63552e() && mo63528d().mo63563z().equals(aVar.mo63528d().mo63563z()) && C72218h.m106362h(mo63526b(), aVar.mo63526b());
    }

    /* renamed from: f */
    public final String mo63554f(Locale locale) {
        return mo63528d().mo63471t(mo63525a(), locale);
    }

    /* renamed from: g */
    public final String mo63555g(Locale locale) {
        return mo63528d().mo63472w(mo63525a(), locale);
    }

    public final int hashCode() {
        return (mo63552e() * 17) + mo63528d().mo63563z().hashCode() + mo63526b().hashCode();
    }

    public final String toString() {
        String y = mo63528d().mo63562y();
        return "Property[" + y + "]";
    }
}
