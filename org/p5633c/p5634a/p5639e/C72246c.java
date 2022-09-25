package org.p5633c.p5634a.p5639e;

import java.util.Locale;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.e.c */
/* compiled from: PG */
final class C72246c implements C72265v, C72261r {

    /* renamed from: a */
    private final char f192236a;

    public C72246c(char c) {
        this.f192236a = c;
    }

    /* renamed from: a */
    public final int mo63604a() {
        return 1;
    }

    /* renamed from: b */
    public final int mo63605b() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r1 = java.lang.Character.toUpperCase(r1);
        r2 = java.lang.Character.toUpperCase(r2);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo63606c(org.p5633c.p5634a.p5639e.C72264u r1, java.lang.String r2, int r3) {
        /*
            r0 = this;
            int r1 = r2.length()
            if (r3 < r1) goto L_0x0009
            r1 = r3 ^ -1
            return r1
        L_0x0009:
            char r1 = r2.charAt(r3)
            char r2 = r0.f192236a
            if (r1 == r2) goto L_0x0028
            char r1 = java.lang.Character.toUpperCase(r1)
            char r2 = java.lang.Character.toUpperCase(r2)
            if (r1 == r2) goto L_0x0028
            char r1 = java.lang.Character.toLowerCase(r1)
            char r2 = java.lang.Character.toLowerCase(r2)
            if (r1 == r2) goto L_0x0028
            r1 = r3 ^ -1
            return r1
        L_0x0028:
            int r3 = r3 + 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5633c.p5634a.p5639e.C72246c.mo63606c(org.c.a.e.u, java.lang.String, int):int");
    }

    /* renamed from: d */
    public final void mo63607d(StringBuffer stringBuffer, C72151ai aiVar, Locale locale) {
        stringBuffer.append(this.f192236a);
    }

    /* renamed from: e */
    public final void mo63608e(StringBuffer stringBuffer, long j, C72132a aVar, int i, C72288l lVar, Locale locale) {
        stringBuffer.append(this.f192236a);
    }
}
