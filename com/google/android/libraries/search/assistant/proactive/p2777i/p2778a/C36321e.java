package com.google.android.libraries.search.assistant.proactive.p2777i.p2778a;

import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.proactive.i.a.e */
/* compiled from: PG */
public final class C36321e {

    /* renamed from: a */
    private static final C59071e f94834a = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.i.a.e");

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ff  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.base.C58833ax m64808a(java.lang.String r9, java.lang.String r10) {
        /*
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0117
            java.lang.String r0 = "assistant-transactions://order-history"
            boolean r0 = r9.startsWith(r0)
            if (r0 != 0) goto L_0x0010
            goto L_0x0117
        L_0x0010:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            java.lang.String r0 = "view"
            java.lang.String r0 = r9.getQueryParameter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0031
            com.google.common.f.e r9 = f94834a
            com.google.common.f.x r9 = r9.mo56225c()
            java.lang.String r10 = "Order URI must specify 'view' param"
            r0 = 52329(0xcc69, float:7.3329E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r0)).mo56386p(r10)
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
            return r9
        L_0x0031:
            int r1 = r0.hashCode()
            r2 = -1210894809(0xffffffffb7d33627, float:-2.5178377E-5)
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == r2) goto L_0x005c
            r2 = 926934164(0x373fe494, float:1.1437707E-5)
            if (r1 == r2) goto L_0x0052
            r2 = 1557721666(0x5cd8f242, float:4.88519682E17)
            if (r1 == r2) goto L_0x0048
            goto L_0x0066
        L_0x0048:
            java.lang.String r1 = "details"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0066
            r1 = 2
            goto L_0x0067
        L_0x0052:
            java.lang.String r1 = "history"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0066
            r1 = 0
            goto L_0x0067
        L_0x005c:
            java.lang.String r1 = "reservations"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0066
            r1 = 1
            goto L_0x0067
        L_0x0066:
            r1 = -1
        L_0x0067:
            java.lang.String r2 = "extra.accountName"
            java.lang.String r6 = "extra.screenId"
            java.lang.String r7 = "com.google.android.gms"
            java.lang.String r8 = "com.google.android.gms.accountsettings.action.VIEW_SETTINGS"
            if (r1 == 0) goto L_0x00ff
            if (r1 == r5) goto L_0x00e7
            if (r1 == r4) goto L_0x0086
            com.google.common.f.e r9 = f94834a
            com.google.common.f.x r9 = r9.mo56225c()
            java.lang.String r10 = "Unknown order view type %s"
            r1 = 52327(0xcc67, float:7.3326E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r1)).mo56389s(r10, r0)
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
            return r9
        L_0x0086:
            java.lang.String r0 = "orderid"
            java.lang.String r0 = r9.getQueryParameter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x00a3
            com.google.common.f.e r9 = f94834a
            com.google.common.f.x r9 = r9.mo56225c()
            java.lang.String r10 = "Order URI for details must specify the 'orderid' to start"
            r0 = 52328(0xcc68, float:7.3327E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r0)).mo56386p(r10)
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
            return r9
        L_0x00a3:
            java.lang.String r1 = "pid"
            java.lang.String r1 = r9.getQueryParameter(r1)
            java.lang.String r4 = "sandbox"
            boolean r9 = r9.getBooleanQueryParameter(r4, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r3 = r3 ^ r5
            java.lang.String r4 = "orderId should not be an empty string"
            com.google.common.base.C58838bb.m90869d(r3, r4)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r8)
            android.content.Intent r3 = r3.setPackage(r7)
            r4 = 311(0x137, float:4.36E-43)
            android.content.Intent r3 = r3.putExtra(r6, r4)
            android.content.Intent r10 = r3.putExtra(r2, r10)
            java.lang.String r2 = "extra.screen.order_id"
            android.content.Intent r10 = r10.putExtra(r2, r0)
            if (r1 == 0) goto L_0x00d9
            java.lang.String r0 = "extra.screen.pid"
            r10.putExtra(r0, r1)
        L_0x00d9:
            if (r9 == 0) goto L_0x00e2
            java.lang.String r9 = "extra.screen.sandbox"
            java.lang.String r0 = "1"
            r10.putExtra(r9, r0)
        L_0x00e2:
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r10)
            return r9
        L_0x00e7:
            android.content.Intent r9 = new android.content.Intent
            r9.<init>(r8)
            android.content.Intent r9 = r9.setPackage(r7)
            r0 = 310(0x136, float:4.34E-43)
            android.content.Intent r9 = r9.putExtra(r6, r0)
            android.content.Intent r9 = r9.putExtra(r2, r10)
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r9)
            return r9
        L_0x00ff:
            android.content.Intent r9 = new android.content.Intent
            r9.<init>(r8)
            android.content.Intent r9 = r9.setPackage(r7)
            r0 = 309(0x135, float:4.33E-43)
            android.content.Intent r9 = r9.putExtra(r6, r0)
            android.content.Intent r9 = r9.putExtra(r2, r10)
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r9)
            return r9
        L_0x0117:
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.proactive.p2777i.p2778a.C36321e.m64808a(java.lang.String, java.lang.String):com.google.common.base.ax");
    }
}
