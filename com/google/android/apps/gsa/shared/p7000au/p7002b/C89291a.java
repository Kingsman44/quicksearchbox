package com.google.android.apps.gsa.shared.p7000au.p7002b;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.au.b.a */
/* compiled from: PG */
public final class C89291a {

    /* renamed from: b */
    private static final C59071e f242095b = C59071e.m91332i("com.google.android.apps.gsa.shared.au.b.a");

    /* renamed from: a */
    protected final C21370a f242096a;

    public C89291a(C21370a aVar) {
        this.f242096a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0081 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo83231a(android.content.Context r12, com.google.p375ai.p378b.C8150xj r13) {
        /*
            r11 = this;
            r0 = 0
            if (r13 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r13.f28659a
            r2 = 1
            r1 = r1 & r2
            java.lang.String r3 = "TemplatedStringEvaluato"
            if (r1 == 0) goto L_0x00aa
            com.google.protobuf.cq r1 = r13.f28661c
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0017
            java.lang.String r12 = r13.f28660b
            return r12
        L_0x0017:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.protobuf.cq r4 = r13.f28661c
            java.util.Iterator r4 = r4.iterator()
        L_0x0022:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0085
            java.lang.Object r5 = r4.next()
            com.google.ai.b.xi r5 = (com.google.p375ai.p378b.C8149xi) r5
            int r6 = r5.f28655b
            int r6 = com.google.p375ai.p378b.C8148xh.m22957a(r6)
            if (r6 != 0) goto L_0x0037
            goto L_0x0050
        L_0x0037:
            if (r6 == r2) goto L_0x0050
            r5 = 3
            if (r6 == r5) goto L_0x003d
            goto L_0x007c
        L_0x003d:
            com.google.common.f.e r5 = f242095b
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r3)
            java.lang.String r6 = "QUERY template parameter had no given parameters"
            r7 = 11077(0x2b45, float:1.5522E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            goto L_0x007c
        L_0x0050:
            int r6 = r5.f28654a
            r6 = r6 & 2
            if (r6 == 0) goto L_0x006a
            com.google.android.libraries.f.a r6 = r11.f242096a
            long r6 = r6.mo26870b()
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            long r9 = r5.f28656c
            long r8 = r8.toMillis(r9)
            long r6 = r6 - r8
            java.lang.String r5 = com.google.android.apps.gsa.shared.p7019bc.C89407a.m145426i(r12, r6)
            goto L_0x007d
        L_0x006a:
            com.google.common.f.e r5 = f242095b
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r3)
            java.lang.String r6 = "ELAPSED_TIME template parameter had no timestamp"
            r7 = 11076(0x2b44, float:1.5521E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
        L_0x007c:
            r5 = r0
        L_0x007d:
            if (r5 != 0) goto L_0x0081
            java.lang.String r5 = "(invalid param)"
        L_0x0081:
            r1.add(r5)
            goto L_0x0022
        L_0x0085:
            java.lang.String r12 = r13.f28660b
            int r13 = r1.size()     // Catch:{ IllegalFormatException -> 0x0096 }
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ IllegalFormatException -> 0x0096 }
            java.lang.Object[] r13 = r1.toArray(r13)     // Catch:{ IllegalFormatException -> 0x0096 }
            java.lang.String r12 = java.lang.String.format(r12, r13)     // Catch:{ IllegalFormatException -> 0x0096 }
            return r12
        L_0x0096:
            r13 = move-exception
            com.google.common.f.e r0 = f242095b
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r3)
            java.lang.String r1 = "Error formatting display string \"%s\""
            r2 = 11074(0x2b42, float:1.5518E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r13)).mo56372aa(r2)).mo56389s(r1, r12)
            return r12
        L_0x00aa:
            com.google.common.f.e r12 = f242095b
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r13, r3)
            java.lang.String r13 = "Got templated string with no display string"
            r1 = 11075(0x2b43, float:1.552E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a.mo83231a(android.content.Context, com.google.ai.b.xj):java.lang.String");
    }
}
