package com.google.android.apps.gsa.sidekick.shared.util;

import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8194z;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.n */
/* compiled from: PG */
public final class C91995n {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r1 = com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150937c(r1, com.google.p375ai.p378b.C7681g.DISMISS, new com.google.p375ai.p378b.C7681g[0]);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m151000a(com.google.p375ai.p378b.C7718hj r1, java.lang.String r2, java.lang.String r3) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0007
            return r2
        L_0x0007:
            if (r1 == 0) goto L_0x001f
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.DISMISS
            r0 = 0
            com.google.ai.b.g[] r0 = new com.google.p375ai.p378b.C7681g[r0]
            com.google.ai.b.h r1 = com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150937c(r1, r2, r0)
            if (r1 == 0) goto L_0x001f
            java.lang.String r2 = r1.f26899d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x001f
            java.lang.String r1 = r1.f26899d
            return r1
        L_0x001f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.util.C91995n.m151000a(com.google.ai.b.hj, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static boolean m151001b(C7718hj hjVar) {
        C8194z zVar;
        if (hjVar == null) {
            return false;
        }
        Iterator it = hjVar.f26932D.iterator();
        while (true) {
            if (!it.hasNext()) {
                zVar = null;
                break;
            }
            zVar = (C8194z) it.next();
            if (zVar.f28784f) {
                break;
            }
        }
        if (zVar == null || C91978bb.m150937c(hjVar, C7681g.DISMISS_COLLECTION, new C7681g[0]) == null) {
            return false;
        }
        return zVar.f28784f;
    }
}
