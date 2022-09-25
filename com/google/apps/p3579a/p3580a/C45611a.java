package com.google.apps.p3579a.p3580a;

import com.google.common.base.C58890d;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import java.util.Iterator;

/* renamed from: com.google.apps.a.a.a */
/* compiled from: PG */
public final class C45611a {

    /* renamed from: a */
    public static final C45611a f119974a;

    /* renamed from: c */
    private static final C58528ij f119975c;

    /* renamed from: d */
    private static final C58528ij f119976d;

    /* renamed from: b */
    public final C58528ij f119977b;

    /* renamed from: e */
    private final boolean f119978e;

    static {
        C58528ij K = C58528ij.m90011K("google.com", "www.google.com");
        f119975c = K;
        C58528ij K2 = C58528ij.m90011K("gmail.com", "www.gmail.com");
        f119976d = K2;
        C58528ij.m90011K("googlemail.com", "www.googlemail.com");
        C45611a aVar = new C45611a(K, false);
        f119974a = aVar;
        new C45611a(K2, false);
        new C45611a(C58431eu.m89653c(K2, aVar.f119977b), aVar.f119978e);
    }

    public C45611a(Iterable iterable, boolean z) {
        C58526ih ihVar = new C58526ih();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            ihVar.mo55373c(C58890d.m90988c(str));
        }
        this.f119977b = ihVar.mo55486f();
        this.f119978e = z;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49710a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Authority doesn't match web pattern: "
            r1 = 0
            com.google.common.q.s r7 = com.google.common.p4574q.C60740s.m92701a(r7)     // Catch:{ IllegalStateException -> 0x00a9 }
            java.lang.String r2 = r7.f164763c     // Catch:{ IllegalStateException -> 0x00a9 }
            boolean r2 = com.google.common.base.C58837ba.m90859h(r2)     // Catch:{ IllegalStateException -> 0x00a9 }
            r3 = 1
            r2 = r2 ^ r3
            java.lang.String r4 = "Uri has no authority: %s"
            com.google.common.base.C58838bb.m90887v(r2, r4, r7)     // Catch:{ IllegalStateException -> 0x00a9 }
            java.util.regex.Pattern r2 = com.google.common.p4574q.C60739r.f164760a     // Catch:{ IllegalStateException -> 0x00a9 }
            java.lang.String r4 = r7.f164763c     // Catch:{ IllegalStateException -> 0x00a9 }
            java.lang.Object r4 = p3186j$.util.Objects.requireNonNull(r4)     // Catch:{ IllegalStateException -> 0x00a9 }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ IllegalStateException -> 0x00a9 }
            java.util.regex.Matcher r2 = r2.matcher(r4)     // Catch:{ IllegalStateException -> 0x00a9 }
            boolean r4 = r2.matches()     // Catch:{ IllegalStateException -> 0x00a9 }
            if (r4 == 0) goto L_0x0093
            java.lang.String r0 = r2.group(r3)     // Catch:{ IllegalStateException -> 0x00a9 }
            com.google.common.q.o r2 = new com.google.common.q.o     // Catch:{ IllegalArgumentException -> 0x007f }
            r0.getClass()
            r2.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x007f }
            java.lang.String r7 = r2.f164753a     // Catch:{ IllegalStateException -> 0x00a9 }
            java.lang.String r7 = com.google.common.base.C58890d.m90988c(r7)     // Catch:{ IllegalStateException -> 0x00a9 }
            com.google.common.b.ij r0 = r6.f119977b     // Catch:{ IllegalStateException -> 0x00a9 }
            boolean r0 = r0.contains(r7)     // Catch:{ IllegalStateException -> 0x00a9 }
            if (r0 == 0) goto L_0x0044
        L_0x0042:
            r1 = 1
            goto L_0x007e
        L_0x0044:
            boolean r0 = r6.f119978e     // Catch:{ IllegalStateException -> 0x00a9 }
            if (r0 == 0) goto L_0x007e
            com.google.common.b.ij r0 = r6.f119977b     // Catch:{ IllegalStateException -> 0x00a9 }
            com.google.common.b.sl r0 = r0.iterator()     // Catch:{ IllegalStateException -> 0x00a9 }
        L_0x004e:
            boolean r2 = r0.hasNext()     // Catch:{ IllegalStateException -> 0x00a9 }
            if (r2 == 0) goto L_0x007e
            java.lang.Object r2 = r0.next()     // Catch:{ IllegalStateException -> 0x00a9 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IllegalStateException -> 0x00a9 }
            int r4 = r7.length()     // Catch:{ IllegalStateException -> 0x00a9 }
            int r5 = r2.length()     // Catch:{ IllegalStateException -> 0x00a9 }
            if (r4 <= r5) goto L_0x004e
            boolean r4 = r7.endsWith(r2)     // Catch:{ IllegalStateException -> 0x00a9 }
            if (r4 == 0) goto L_0x004e
            int r4 = r7.length()     // Catch:{ IllegalStateException -> 0x00a9 }
            int r2 = r2.length()     // Catch:{ IllegalStateException -> 0x00a9 }
            int r4 = r4 - r2
            int r4 = r4 + -1
            char r2 = r7.charAt(r4)     // Catch:{ IllegalStateException -> 0x00a9 }
            r4 = 46
            if (r2 != r4) goto L_0x004e
            goto L_0x0042
        L_0x007e:
            return r1
        L_0x007f:
            r2 = move-exception
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x00a9 }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ IllegalStateException -> 0x00a9 }
            r5[r1] = r0     // Catch:{ IllegalStateException -> 0x00a9 }
            r5[r3] = r7     // Catch:{ IllegalStateException -> 0x00a9 }
            java.lang.String r7 = "Invalid domain '%s' found in URI '%s'"
            java.lang.String r7 = java.lang.String.format(r7, r5)     // Catch:{ IllegalStateException -> 0x00a9 }
            r4.<init>(r7, r2)     // Catch:{ IllegalStateException -> 0x00a9 }
            throw r4     // Catch:{ IllegalStateException -> 0x00a9 }
        L_0x0093:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x00a9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x00a9 }
            r3.<init>(r0)     // Catch:{ IllegalStateException -> 0x00a9 }
            r3.append(r7)     // Catch:{ IllegalStateException -> 0x00a9 }
            java.lang.String r7 = r7.toString()     // Catch:{ IllegalStateException -> 0x00a9 }
            java.lang.String r7 = r0.concat(r7)     // Catch:{ IllegalStateException -> 0x00a9 }
            r2.<init>(r7)     // Catch:{ IllegalStateException -> 0x00a9 }
            throw r2     // Catch:{ IllegalStateException -> 0x00a9 }
        L_0x00a9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.p3579a.p3580a.C45611a.mo49710a(java.lang.String):boolean");
    }
}
