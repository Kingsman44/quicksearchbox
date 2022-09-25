package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.content.BroadcastReceiver;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.al */
/* compiled from: PG */
final class C95721al extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C95724ao f267977a;

    public C95721al(C95724ao aoVar) {
        this.f267977a = aoVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd A[Catch:{ SecurityException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e2 A[Catch:{ SecurityException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0128 A[Catch:{ SecurityException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0154 A[Catch:{ SecurityException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0158 A[Catch:{ SecurityException -> 0x0160 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r13, android.content.Intent r14) {
        /*
            r12 = this;
            java.lang.String r13 = "com.google.android.apps.hotline.action.BIND_CONVERSATION_MODE"
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95724ao.f267982a
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r14 == 0) goto L_0x0175
            java.lang.String r0 = r14.getAction()
            if (r0 != 0) goto L_0x0010
            goto L_0x0175
        L_0x0010:
            java.lang.String r0 = r14.getAction()
            int r1 = r0.hashCode()
            r2 = 1289849543(0x4ce18ac7, float:1.18249016E8)
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x002f
            r2 = 1800263552(0x6b4dd780, float:2.4884746E26)
            if (r1 == r2) goto L_0x0025
            goto L_0x0039
        L_0x0025:
            java.lang.String r1 = "com.google.android.apps.gsa.shared.bisto.action.BIND_EXTERNAL_VOICE_SERVICE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            r0 = 0
            goto L_0x003a
        L_0x002f:
            java.lang.String r1 = "com.google.android.apps.gsa.shared.bisto.action.UNBIND_EXTERNAL_VOICE_SERVICE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x0039:
            r0 = -1
        L_0x003a:
            if (r0 == 0) goto L_0x0047
            if (r0 == r4) goto L_0x0040
            goto L_0x0175
        L_0x0040:
            com.google.android.apps.gsa.staticplugins.bisto.o.ao r13 = r12.f267977a
            r0 = 6
            r13.mo89687I(r14, r0)
            return
        L_0x0047:
            java.lang.String r0 = "external_voice_service_use_local_mic"
            boolean r0 = r14.getBooleanExtra(r0, r3)
            com.google.android.apps.gsa.staticplugins.bisto.o.ao r1 = r12.f267977a
            boolean r2 = r1.mo89686H()
            if (r0 != r2) goto L_0x0175
            java.lang.Class<androidx.annotation.b> r0 = androidx.annotation.C0826b.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42742b(r0)
            java.util.concurrent.atomic.AtomicReference r0 = r1.f267985c
            java.lang.Object r0 = r0.get()
            com.google.android.apps.gsa.staticplugins.bisto.ae.c r0 = (com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95110c) r0
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.mo89040g()
            if (r0 != 0) goto L_0x0175
        L_0x006a:
            java.util.concurrent.atomic.AtomicReference r0 = r1.f267985c     // Catch:{ SecurityException -> 0x0160 }
            android.content.Context r2 = r1.f267984b     // Catch:{ SecurityException -> 0x0160 }
            com.google.android.apps.gsa.staticplugins.bisto.f.ae r5 = r1.f267990h     // Catch:{ SecurityException -> 0x0160 }
            boolean r6 = r1.f267986d     // Catch:{ SecurityException -> 0x0160 }
            com.google.android.apps.gsa.shared.bisto.k r7 = r1.f267987e     // Catch:{ SecurityException -> 0x0160 }
            java.lang.String r8 = "external_voice_service_type"
            int r8 = r14.getIntExtra(r8, r3)     // Catch:{ SecurityException -> 0x0160 }
            com.google.android.d.hq r8 = com.google.android.p10712d.C142500hq.m231092a(r8)     // Catch:{ SecurityException -> 0x0160 }
            int r9 = r8.ordinal()     // Catch:{ SecurityException -> 0x0160 }
            r10 = 0
            if (r9 == r4) goto L_0x00ac
            r6 = 2
            r11 = 12
            if (r9 == r6) goto L_0x009f
            r13 = 3
            if (r9 == r13) goto L_0x008f
        L_0x008d:
            r13 = r10
            goto L_0x00cb
        L_0x008f:
            boolean r13 = r7.mo83555j(r11)     // Catch:{ SecurityException -> 0x0160 }
            if (r13 == 0) goto L_0x008d
            com.google.android.apps.gsa.staticplugins.bisto.ae.b r13 = new com.google.android.apps.gsa.staticplugins.bisto.ae.b     // Catch:{ SecurityException -> 0x0160 }
            java.lang.String r6 = "com.google.android.apps.tachyon.action.BIND_CONVERSATION_MODE"
            java.lang.String r7 = "com.google.android.apps.tachyon"
            r13.<init>(r6, r7)     // Catch:{ SecurityException -> 0x0160 }
            goto L_0x00cb
        L_0x009f:
            boolean r6 = r7.mo83555j(r11)     // Catch:{ SecurityException -> 0x0160 }
            if (r6 == 0) goto L_0x008d
            com.google.android.apps.gsa.staticplugins.bisto.ae.b r6 = new com.google.android.apps.gsa.staticplugins.bisto.ae.b     // Catch:{ SecurityException -> 0x0160 }
            r6.<init>(r13, r13)     // Catch:{ SecurityException -> 0x0160 }
        L_0x00aa:
            r13 = r6
            goto L_0x00cb
        L_0x00ac:
            com.google.common.b.ih r13 = new com.google.common.b.ih     // Catch:{ SecurityException -> 0x0160 }
            r13.<init>()     // Catch:{ SecurityException -> 0x0160 }
            java.lang.String r7 = "com.google.android.apps.translate"
            r13.mo55373c(r7)     // Catch:{ SecurityException -> 0x0160 }
            if (r6 == 0) goto L_0x00bd
            java.lang.String r6 = "com.google.android.apps.translatedebug"
            r13.mo55373c(r6)     // Catch:{ SecurityException -> 0x0160 }
        L_0x00bd:
            com.google.android.apps.gsa.staticplugins.bisto.ae.b r6 = new com.google.android.apps.gsa.staticplugins.bisto.ae.b     // Catch:{ SecurityException -> 0x0160 }
            java.lang.String r7 = "com.google.android.apps.translate.action.BIND_CONVERSATION_MODE"
            com.google.common.b.ij r13 = r13.mo55486f()     // Catch:{ SecurityException -> 0x0160 }
            r9 = 22
            r6.<init>(r7, r13, r9)     // Catch:{ SecurityException -> 0x0160 }
            goto L_0x00aa
        L_0x00cb:
            if (r13 != 0) goto L_0x00e2
            com.google.common.f.e r13 = com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95121n.f266130d     // Catch:{ SecurityException -> 0x0160 }
            com.google.common.f.x r13 = r13.mo56226d()     // Catch:{ SecurityException -> 0x0160 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ SecurityException -> 0x0160 }
            java.lang.String r5 = "ExtVoiceServiceConn"
            r13.mo56378ag(r3, r5)     // Catch:{ SecurityException -> 0x0160 }
            java.lang.String r3 = "Missing definition for %s"
            r5 = 17929(0x4609, float:2.5124E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r5)).mo56389s(r3, r8)     // Catch:{ SecurityException -> 0x0160 }
            goto L_0x0147
        L_0x00e2:
            android.content.Intent r6 = new android.content.Intent     // Catch:{ SecurityException -> 0x0160 }
            java.lang.String r7 = r13.f266004a     // Catch:{ SecurityException -> 0x0160 }
            r6.<init>(r7)     // Catch:{ SecurityException -> 0x0160 }
            com.google.common.b.ij r7 = r13.f266005b     // Catch:{ SecurityException -> 0x0160 }
            boolean r9 = r7.isEmpty()     // Catch:{ SecurityException -> 0x0160 }
            if (r9 != 0) goto L_0x0125
            android.content.pm.PackageManager r9 = r2.getPackageManager()     // Catch:{ SecurityException -> 0x0160 }
            java.util.List r3 = r9.queryIntentServices(r6, r3)     // Catch:{ SecurityException -> 0x0160 }
            if (r3 == 0) goto L_0x0125
            boolean r6 = r3.isEmpty()     // Catch:{ SecurityException -> 0x0160 }
            if (r6 != 0) goto L_0x0125
            java.util.Iterator r3 = r3.iterator()     // Catch:{ SecurityException -> 0x0160 }
        L_0x0105:
            boolean r6 = r3.hasNext()     // Catch:{ SecurityException -> 0x0160 }
            if (r6 == 0) goto L_0x0125
            java.lang.Object r6 = r3.next()     // Catch:{ SecurityException -> 0x0160 }
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6     // Catch:{ SecurityException -> 0x0160 }
            android.content.pm.ServiceInfo r9 = r6.serviceInfo     // Catch:{ SecurityException -> 0x0160 }
            java.lang.String r9 = r9.packageName     // Catch:{ SecurityException -> 0x0160 }
            android.content.pm.ServiceInfo r6 = r6.serviceInfo     // Catch:{ SecurityException -> 0x0160 }
            java.lang.String r6 = r6.name     // Catch:{ SecurityException -> 0x0160 }
            boolean r11 = r7.contains(r9)     // Catch:{ SecurityException -> 0x0160 }
            if (r11 == 0) goto L_0x0105
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch:{ SecurityException -> 0x0160 }
            r3.<init>(r9, r6)     // Catch:{ SecurityException -> 0x0160 }
            goto L_0x0126
        L_0x0125:
            r3 = r10
        L_0x0126:
            if (r3 == 0) goto L_0x0147
            android.content.Intent r6 = new android.content.Intent     // Catch:{ SecurityException -> 0x0160 }
            r6.<init>()     // Catch:{ SecurityException -> 0x0160 }
            r6.setComponent(r3)     // Catch:{ SecurityException -> 0x0160 }
            r6.putExtras(r14)     // Catch:{ SecurityException -> 0x0160 }
            int r13 = r13.f266006c     // Catch:{ SecurityException -> 0x0160 }
            if (r13 < 0) goto L_0x013b
            java.lang.String r10 = r5.mo89216i(r2, r13)     // Catch:{ SecurityException -> 0x0160 }
        L_0x013b:
            boolean r13 = com.google.common.base.C58837ba.m90859h(r10)     // Catch:{ SecurityException -> 0x0160 }
            if (r13 != 0) goto L_0x0146
            java.lang.String r13 = "external_voice_service_instruction"
            r6.putExtra(r13, r10)     // Catch:{ SecurityException -> 0x0160 }
        L_0x0146:
            r10 = r6
        L_0x0147:
            com.google.android.apps.gsa.staticplugins.bisto.ae.n r13 = new com.google.android.apps.gsa.staticplugins.bisto.ae.n     // Catch:{ SecurityException -> 0x0160 }
            r13.<init>(r2, r8, r1, r14)     // Catch:{ SecurityException -> 0x0160 }
            if (r10 == 0) goto L_0x0158
            boolean r14 = r2.bindService(r10, r13, r4)     // Catch:{ SecurityException -> 0x0160 }
            if (r14 == 0) goto L_0x0158
            r0.set(r13)     // Catch:{ SecurityException -> 0x0160 }
            return
        L_0x0158:
            java.lang.SecurityException r13 = new java.lang.SecurityException     // Catch:{ SecurityException -> 0x0160 }
            java.lang.String r14 = "could not bind to remote service"
            r13.<init>(r14)     // Catch:{ SecurityException -> 0x0160 }
            throw r13     // Catch:{ SecurityException -> 0x0160 }
        L_0x0160:
            r13 = move-exception
            com.google.common.f.e r14 = com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95724ao.f267982a
            com.google.common.f.x r14 = r14.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "ExtVoiceInHandler"
            r14.mo56378ag(r0, r1)
            java.lang.String r0 = "cannot bind to external voice service"
            r1 = 15260(0x3b9c, float:2.1384E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56382g(r13)).mo56372aa(r1)).mo56386p(r0)
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95721al.onReceive(android.content.Context, android.content.Intent):void");
    }
}
