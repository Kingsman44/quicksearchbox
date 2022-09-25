package org.p5633c.p5634a.p5635a;

import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.p5638d.C72218h;

/* renamed from: org.c.a.a.d */
/* compiled from: PG */
public abstract class C72136d implements Comparable, C72151ai {
    protected C72136d() {
    }

    /* renamed from: a */
    public int compareTo(C72151ai aiVar) {
        if (this == aiVar) {
            return 0;
        }
        if (mo63438e() == aiVar.mo63438e()) {
            int e = mo63438e();
            int i = 0;
            while (i < e) {
                if (mo63399r(i) == aiVar.mo63399r(i)) {
                    i++;
                } else {
                    throw new ClassCastException("ReadablePartial objects must have matching field types");
                }
            }
            int e2 = mo63438e();
            for (int i2 = 0; i2 < e2; i2++) {
                if (mo63437c(i2) > aiVar.mo63437c(i2)) {
                    return 1;
                }
                if (mo63437c(i2) < aiVar.mo63437c(i2)) {
                    return -1;
                }
            }
            return 0;
        }
        throw new ClassCastException("ReadablePartial objects must have matching field types");
    }

    /* renamed from: b */
    public int mo63392b(C72283g gVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72151ai)) {
            return false;
        }
        C72151ai aiVar = (C72151ai) obj;
        if (mo63438e() != aiVar.mo63438e()) {
            return false;
        }
        int e = mo63438e();
        for (int i = 0; i < e; i++) {
            if (mo63437c(i) != aiVar.mo63437c(i) || mo63399r(i) != aiVar.mo63399r(i)) {
                return false;
            }
        }
        return C72218h.m106362h(mo63439f(), aiVar.mo63439f());
    }

    /* renamed from: h */
    public abstract C72233e mo63395h(int i, C72132a aVar);

    public int hashCode() {
        int e = mo63438e();
        int i = 157;
        for (int i2 = 0; i2 < e; i2++) {
            i = (((i * 23) + mo63437c(i2)) * 23) + mo63399r(i2).hashCode();
        }
        return i + mo63439f().hashCode();
    }

    /* renamed from: i */
    public boolean mo63397i(C72283g gVar) {
        throw null;
    }

    /* renamed from: q */
    public final C72233e mo63398q(int i) {
        return mo63395h(i, mo63439f());
    }

    /* renamed from: r */
    public final C72283g mo63399r(int i) {
        return mo63395h(i, mo63439f()).mo63563z();
    }

    /* renamed from: s */
    public final boolean mo63400s(C72151ai aiVar) {
        if (aiVar != null) {
            return compareTo(aiVar) > 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    /* renamed from: t */
    public final boolean mo63401t(C72151ai aiVar) {
        if (aiVar != null) {
            return compareTo(aiVar) < 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }
}
