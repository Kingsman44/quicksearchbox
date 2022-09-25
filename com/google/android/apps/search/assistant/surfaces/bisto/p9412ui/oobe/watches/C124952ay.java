package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import com.google.apps.tiktok.dataservice.local.C46852f;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.ay */
/* compiled from: PG */
final class C124952ay implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C124955ba f344772a;

    public C124952ay(C124955ba baVar) {
        this.f344772a = baVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        this.f344772a.mo106752a(th, "VerifyJwt failed!");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053 A[SYNTHETIC, Splitter:B:14:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d8  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo20961j(java.lang.Object r8) {
        /*
            r7 = this;
            com.google.e.a.b.b.e r8 = (com.google.p4591e.p4592a.p4594b.p4596b.C61026e) r8
            com.google.apps.tiktok.dataservice.ai r0 = com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches.C124955ba.f344775a
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0 = 0
            if (r8 == 0) goto L_0x00e0
            java.lang.String r1 = "fgak"
            java.lang.Object r8 = r8.get(r1)
            java.lang.String r2 = "JwtParser"
            if (r8 == 0) goto L_0x0048
            java.lang.String r3 = r8.toString()
            boolean r3 = com.google.common.base.C58837ba.m90859h(r3)
            if (r3 != 0) goto L_0x0048
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.ai r3 = new com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.ai     // Catch:{ v -> 0x0034 }
            r3.<init>()     // Catch:{ v -> 0x0034 }
            java.lang.reflect.Type r3 = r3.f29214b     // Catch:{ v -> 0x0034 }
            com.google.ak.i r4 = new com.google.ak.i     // Catch:{ v -> 0x0034 }
            r4.<init>()     // Catch:{ v -> 0x0034 }
            java.lang.String r8 = r8.toString()     // Catch:{ v -> 0x0034 }
            java.lang.Object r8 = r4.mo17147e(r8, r3)     // Catch:{ v -> 0x0034 }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ v -> 0x0034 }
            goto L_0x0049
        L_0x0034:
            r8 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches.C124937aj.f344726a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r2)
            java.lang.String r4 = "Couldn't parse %s"
            r5 = 36391(0x8e27, float:5.0995E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r8)).mo56372aa(r5)).mo56389s(r4, r1)
        L_0x0048:
            r8 = r0
        L_0x0049:
            if (r8 == 0) goto L_0x0095
            java.lang.String r1 = "k"
            boolean r3 = r8.containsKey(r1)
            if (r3 == 0) goto L_0x0095
            java.lang.Object r3 = r8.get(r1)     // Catch:{ IllegalArgumentException -> 0x0060 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IllegalArgumentException -> 0x0060 }
            r4 = 8
            byte[] r8 = android.util.Base64.decode(r3, r4)     // Catch:{ IllegalArgumentException -> 0x0060 }
            goto L_0x00a9
        L_0x0060:
            r3 = move-exception
            com.google.common.f.e r4 = com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches.C124937aj.f344726a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r2)
            java.lang.String r5 = "Invalid URL_SAFE PSK"
            r6 = 36393(0x8e29, float:5.0997E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r3)).mo56372aa(r6)).mo56386p(r5)
            java.lang.Object r8 = r8.get(r1)     // Catch:{ IllegalArgumentException -> 0x0080 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IllegalArgumentException -> 0x0080 }
            r1 = 0
            byte[] r8 = android.util.Base64.decode(r8, r1)     // Catch:{ IllegalArgumentException -> 0x0080 }
            goto L_0x00a9
        L_0x0080:
            r8 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches.C124937aj.f344726a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            java.lang.String r2 = "Invalid PSK"
            r3 = 36394(0x8e2a, float:5.0999E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r8)).mo56372aa(r3)).mo56386p(r2)
            goto L_0x00a8
        L_0x0095:
            com.google.common.f.e r8 = com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches.C124937aj.f344726a
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r1, r2)
            java.lang.String r1 = "Missing PSK"
            r2 = 36392(0x8e28, float:5.0996E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r2)).mo56386p(r1)
        L_0x00a8:
            r8 = r0
        L_0x00a9:
            if (r8 == 0) goto L_0x00d8
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.ba r0 = r7.f344772a
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.OobeActivityViewModel r0 = r0.f344779d
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.z r1 = r0.f344277d
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.y r1 = (com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches.C124978y) r1
            com.google.protobuf.z r8 = com.google.protobuf.C63088z.m96139A(r8)
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.z r2 = (com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches.C124979z) r2
            int r3 = r2.f344849a
            r3 = r3 | 1
            r2.f344849a = r3
            r2.f344850b = r8
            com.google.protobuf.bv r8 = r1.build()
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.z r8 = (com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches.C124979z) r8
            r0.f344277d = r8
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.ba r8 = r7.f344772a
            r8.mo106753b()
            return
        L_0x00d8:
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.ba r8 = r7.f344772a
            java.lang.String r1 = "gacsPsk is null!"
            r8.mo106752a(r0, r1)
            return
        L_0x00e0:
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.ba r8 = r7.f344772a
            java.lang.String r1 = "jsonWebSignature payload is null!"
            r8.mo106752a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches.C124952ay.mo20961j(java.lang.Object):void");
    }
}
