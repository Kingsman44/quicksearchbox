package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.arguments.w */
/* compiled from: PG */
final class C87459w extends C87439c {

    /* renamed from: a */
    final /* synthetic */ RecurrenceArgument f236224a;

    public C87459w(RecurrenceArgument recurrenceArgument) {
        this.f236224a = recurrenceArgument;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b8 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81346a() {
        /*
            r12 = this;
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.RecurrenceArgument r0 = r12.f236224a
            java.lang.Object r1 = r0.f236203n
            com.android.b.s r1 = (com.android.p256b.C5033s) r1
            long r2 = r0.mo81328a()
            r0 = 6
            r4 = 5
            r5 = -1
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L_0x008b
            int r8 = r1.f15889d
            if (r8 == r0) goto L_0x0017
            goto L_0x008b
        L_0x0017:
            int r8 = r1.f15902q
            if (r8 != r6) goto L_0x008b
            int[] r8 = r1.f15900o
            if (r8 == 0) goto L_0x008b
            int[] r8 = r1.f15901p
            if (r8 != 0) goto L_0x0025
            goto L_0x008b
        L_0x0025:
            java.util.Calendar r8 = java.util.Calendar.getInstance()
            r8.setTimeInMillis(r2)
            r9 = 7
            int r9 = r8.get(r9)
            switch(r9) {
                case 1: goto L_0x0048;
                case 2: goto L_0x0045;
                case 3: goto L_0x0042;
                case 4: goto L_0x003f;
                case 5: goto L_0x003c;
                case 6: goto L_0x0039;
                case 7: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            r9 = -1
            goto L_0x004a
        L_0x0036:
            r9 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x004a
        L_0x0039:
            r9 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x004a
        L_0x003c:
            r9 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x004a
        L_0x003f:
            r9 = 524288(0x80000, float:7.34684E-40)
            goto L_0x004a
        L_0x0042:
            r9 = 262144(0x40000, float:3.67342E-40)
            goto L_0x004a
        L_0x0045:
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x004a
        L_0x0048:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x004a:
            if (r9 >= 0) goto L_0x005a
            com.google.common.f.e r8 = com.google.android.apps.gsa.search.shared.actions.util.C87495q.f236322a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r9 = "Failed to convert Calendar weekday:%d to EventRecurrence.Weekday."
            r10 = 9584(0x2570, float:1.343E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r10)).mo56387q(r9, r5)
            goto L_0x008b
        L_0x005a:
            int[] r10 = r1.f15900o
            r10[r7] = r9
            r9 = 8
            int r10 = r8.get(r9)
            if (r10 == r5) goto L_0x0085
            int r8 = r8.getActualMaximum(r9)
            if (r10 != r8) goto L_0x006d
            goto L_0x0085
        L_0x006d:
            if (r10 <= 0) goto L_0x0077
            if (r10 <= r4) goto L_0x0072
            goto L_0x0077
        L_0x0072:
            int[] r8 = r1.f15901p
            r8[r7] = r10
            goto L_0x0089
        L_0x0077:
            com.google.common.f.e r8 = com.google.android.apps.gsa.search.shared.actions.util.C87495q.f236322a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r9 = "weekdayNumber should be -1 or in range [1,5] but was %d"
            r11 = 9583(0x256f, float:1.3429E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r11)).mo56387q(r9, r10)
            goto L_0x008b
        L_0x0085:
            int[] r8 = r1.f15901p
            r8[r7] = r5
        L_0x0089:
            r8 = 1
            goto L_0x008c
        L_0x008b:
            r8 = 0
        L_0x008c:
            if (r1 == 0) goto L_0x00b5
            int r9 = r1.f15889d
            if (r9 == r0) goto L_0x0093
            goto L_0x00b5
        L_0x0093:
            int r0 = r1.f15904s
            if (r0 != r6) goto L_0x00b5
            int[] r0 = r1.f15903r
            r0 = r0[r7]
            if (r0 == r5) goto L_0x009e
            goto L_0x00b5
        L_0x009e:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTimeInMillis(r2)
            int r2 = r0.get(r4)
            int r0 = r0.getActualMaximum(r4)
            if (r0 != r2) goto L_0x00b0
            goto L_0x00b5
        L_0x00b0:
            int[] r0 = r1.f15903r
            r0[r7] = r2
            goto L_0x00b6
        L_0x00b5:
            r6 = 0
        L_0x00b6:
            if (r8 != 0) goto L_0x00bc
            if (r6 == 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            return
        L_0x00bc:
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.RecurrenceArgument r0 = r12.f236224a
            r0.mo81288w()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87459w.mo81346a():void");
    }
}
