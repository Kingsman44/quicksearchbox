package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.apps.gsa.proactive.C84165c;
import com.google.common.p4537i.C59277b;
import com.google.common.p4537i.C59294s;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7874nd;
import java.nio.charset.Charset;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.aq */
/* compiled from: PG */
public final class C91502aq {

    /* renamed from: a */
    private static final Charset f255226a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static int m149663a(C84165c cVar) {
        C7746ik a = C7746ik.m22834a(cVar.f229114b.f26966g);
        if (a == null) {
            a = C7746ik.UNKNOWN;
        }
        if (a == C7746ik.REMINDER) {
            return 65544;
        }
        byte[] bytes = cVar.mo77615a().toString().getBytes(f255226a);
        return ((C59277b) C59294s.m92134d()).mo56761d(bytes, bytes.length).mo56771a();
    }

    /* renamed from: b */
    public static boolean m149664b(C7718hj hjVar) {
        C7874nd ndVar = hjVar.f26938J;
        if (ndVar == null) {
            ndVar = C7874nd.f27577J;
        }
        return m149665c(ndVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = com.google.p4283bv.p4345d.p4346a.p4347a.C56956f.m88243a(r2.f27591c);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m149665c(com.google.p375ai.p378b.C7874nd r2) {
        /*
            if (r2 == 0) goto L_0x0014
            int r0 = r2.f27589a
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0014
            int r2 = r2.f27591c
            int r2 = com.google.p4283bv.p4345d.p4346a.p4347a.C56956f.m88243a(r2)
            if (r2 != 0) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            if (r2 == r1) goto L_0x0014
            return r1
        L_0x0014:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.notifications.C91502aq.m149665c(com.google.ai.b.nd):boolean");
    }
}
