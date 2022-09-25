package org.p5633c.p5634a.p5635a;

import org.p5633c.p5634a.C72148af;
import org.p5633c.p5634a.p5639e.C72266w;

/* renamed from: org.c.a.a.b */
/* compiled from: PG */
public abstract class C72134b implements C72148af {
    protected C72134b() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C72148af) && mo63412g() == ((C72148af) obj).mo63412g();
    }

    /* renamed from: h */
    public final int compareTo(C72148af afVar) {
        long g = mo63412g();
        long g2 = afVar.mo63412g();
        if (g < g2) {
            return -1;
        }
        return g > g2 ? 1 : 0;
    }

    public final int hashCode() {
        long g = mo63412g();
        return (int) (g ^ (g >>> 32));
    }

    public final String toString() {
        long g = mo63412g();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        C72266w.m106678f(stringBuffer, g);
        while (true) {
            if (stringBuffer.length() >= (g < 0 ? 7 : 6)) {
                break;
            }
            stringBuffer.insert(g < 0 ? 3 : 2, "0");
        }
        if ((g / 1000) * 1000 == g) {
            stringBuffer.setLength(stringBuffer.length() - 3);
        } else {
            stringBuffer.insert(stringBuffer.length() - 3, ".");
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }
}
