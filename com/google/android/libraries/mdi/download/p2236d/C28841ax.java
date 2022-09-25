package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29392ep;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.mdi.download.d.ax */
/* compiled from: PG */
public final /* synthetic */ class C28841ax implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29392ep f78346a;

    /* renamed from: b */
    public final /* synthetic */ long f78347b;

    /* renamed from: c */
    public final /* synthetic */ String f78348c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f78349d;

    public /* synthetic */ C28841ax(C29392ep epVar, long j, String str, C58833ax axVar) {
        this.f78346a = epVar;
        this.f78347b = j;
        this.f78348c = str;
        this.f78349d = axVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0012 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            com.google.android.libraries.mdi.download.ep r1 = r0.f78346a
            long r2 = r0.f78347b
            java.lang.String r4 = r0.f78348c
            com.google.common.base.ax r5 = r0.f78349d
            r6 = r18
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0012:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00f1
            java.lang.Object r7 = r6.next()
            com.google.android.libraries.mdi.download.d.a.c r7 = (com.google.android.libraries.mdi.download.p2236d.p2237a.C28816c) r7
            java.lang.String r8 = r1.f79684d
            com.google.android.libraries.mdi.download.dr r9 = r7.mo34483a()
            com.google.android.libraries.mdi.download.ep r10 = r7.mo34484b()
            java.lang.String r10 = r10.f79684d
            boolean r8 = r10.equals(r8)
            r12 = 4
            r13 = 1
            java.lang.String r14 = "FileGroupManager"
            r15 = 0
            if (r8 != 0) goto L_0x003e
            java.lang.String r8 = "%s: verifyGroupPairMatchesIdentifiers failed for group %s due to mismatched account"
            java.lang.String r9 = r9.f79501c
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53940l(r8, r14, r9)
        L_0x003c:
            r9 = 0
            goto L_0x00ac
        L_0x003e:
            long r10 = r9.f79516r
            int r16 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r16 == 0) goto L_0x0060
            java.lang.Object[] r8 = new java.lang.Object[r12]
            r8[r15] = r14
            java.lang.String r9 = r9.f79501c
            r8[r13] = r9
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            r10 = 2
            r8[r10] = r9
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            r11 = 3
            r8[r11] = r9
            java.lang.String r9 = "%s: verifyGroupPairMatchesIdentifiers failed for group %s due to mismatched buildId: existing = %d, expected = %d"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53941m(r9, r8)
            goto L_0x003c
        L_0x0060:
            java.lang.String r8 = r9.f79517s
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x007e
            java.lang.Object[] r11 = new java.lang.Object[r12]
            r11[r15] = r14
            java.lang.String r8 = r9.f79501c
            r11[r13] = r8
            java.lang.String r8 = r9.f79517s
            r9 = 2
            r11[r9] = r8
            r9 = 3
            r11[r9] = r4
            java.lang.String r9 = "%s: verifyGroupPairMatchesIdentifiers failed for group %s due to mismatched variantId: existing = %s, expected = %s"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53941m(r9, r11)
            goto L_0x003c
        L_0x007e:
            int r10 = r9.f79499a
            r10 = r10 & 16
            if (r10 == 0) goto L_0x008f
            com.google.protobuf.h r10 = r9.f79504f
            if (r10 != 0) goto L_0x008a
            com.google.protobuf.h r10 = com.google.protobuf.C63070h.f170215c
        L_0x008a:
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)
            goto L_0x0091
        L_0x008f:
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a
        L_0x0091:
            boolean r11 = r10.equals(r5)
            if (r11 != 0) goto L_0x00ab
            java.lang.Object[] r11 = new java.lang.Object[r12]
            r11[r15] = r14
            java.lang.String r9 = r9.f79501c
            r11[r13] = r9
            r8 = 2
            r11[r8] = r10
            r9 = 3
            r11[r9] = r5
            java.lang.String r9 = "%s: verifyGroupPairMatchesIdentifiers failed for group %s due to mismatched custom property optional: existing = %s, expected = %s"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53941m(r9, r11)
            goto L_0x003c
        L_0x00ab:
            r9 = 1
        L_0x00ac:
            if (r9 == 0) goto L_0x0012
            java.lang.String r9 = r1.f79682b
            com.google.android.libraries.mdi.download.ep r10 = r7.mo34484b()
            java.lang.String r10 = r10.f79682b
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00de
            r9 = 5
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r15] = r14
            com.google.android.libraries.mdi.download.ep r7 = r7.mo34484b()
            java.lang.String r7 = r7.f79682b
            r9[r13] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            r8 = 2
            r9[r8] = r7
            r7 = 3
            r9[r7] = r4
            java.lang.String r7 = r1.f79682b
            r9[r12] = r7
            java.lang.String r7 = "%s: getGroupPairById: Group %s matches the given buildId = %d and variantId = %s, but does not match the given group name %s"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53937i(r7, r9)
            goto L_0x0012
        L_0x00de:
            com.google.android.libraries.mdi.download.ep r1 = r7.mo34484b()
            boolean r1 = r1.f79685e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.android.libraries.mdi.download.dr r2 = r7.mo34483a()
            android.util.Pair r1 = android.util.Pair.create(r1, r2)
            goto L_0x00f2
        L_0x00f1:
            r1 = 0
        L_0x00f2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.mdi.download.p2236d.C28841ax.apply(java.lang.Object):java.lang.Object");
    }
}
