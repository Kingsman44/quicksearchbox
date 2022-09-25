package com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity;

import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.b */
/* compiled from: PG */
final class C127394b implements C45987ay {

    /* renamed from: a */
    final /* synthetic */ C127395c f350799a;

    public C127394b(C127395c cVar) {
        this.f350799a = cVar;
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.f] */
    /* JADX WARNING: type inference failed for: r1v15, types: [com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19982a(com.google.apps.tiktok.account.api.controller.C45985aw r11) {
        /*
            r10 = this;
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.c r0 = r10.f350799a
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.DeeplinkTrampolineActivity r0 = r0.f350801b
            android.content.Intent r0 = r0.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r1 = 0
            if (r0 != 0) goto L_0x001f
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.p9589a.C127389a.f350789a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "bundle is null."
            r3 = 37433(0x9239, float:5.2455E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            goto L_0x016a
        L_0x001f:
            java.lang.String r2 = "EXTRA_IS_SESSION_DEEPLINK"
            r3 = 0
            boolean r2 = r0.getBoolean(r2, r3)
            r3 = 1
            r4 = 2
            java.lang.String r5 = "EXTRA_CALLING_PACKAGE"
            java.lang.String r6 = "EXTRA_DEEPLINK_URL"
            if (r2 == 0) goto L_0x00ed
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.f r2 = com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127381f.f350765c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.e r2 = (com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127380e) r2
            boolean r7 = r0.containsKey(r6)
            if (r7 == 0) goto L_0x00dd
            boolean r7 = r0.containsKey(r5)
            if (r7 == 0) goto L_0x00dd
            java.lang.String r7 = "EXTRA_OPA_DEEPLINK_CONTEXT_DATA"
            boolean r8 = r0.containsKey(r7)
            if (r8 != 0) goto L_0x004c
            goto L_0x00dd
        L_0x004c:
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.h r8 = com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127383h.f350769e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.g r8 = (com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127382g) r8
            java.lang.String r6 = r0.getString(r6)
            java.lang.String r5 = r0.getString(r5)
            byte[] r0 = r0.getByteArray(r7)
            if (r0 == 0) goto L_0x0081
            com.google.protobuf.ba r7 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0070 }
            com.google.android.libraries.search.g.a.b.f r9 = com.google.android.libraries.search.p2998g.p2999a.p3001b.C38355f.f101543s     // Catch:{ ct -> 0x0070 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r9, (byte[]) r0, (com.google.protobuf.C62921ba) r7)     // Catch:{ ct -> 0x0070 }
            com.google.android.libraries.search.g.a.b.f r0 = (com.google.android.libraries.search.p2998g.p2999a.p3001b.C38355f) r0     // Catch:{ ct -> 0x0070 }
            r1 = r0
            goto L_0x0081
        L_0x0070:
            r0 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.p9589a.C127389a.f350789a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Trying to parse invalid OpaDeeplinkContextData."
            r4 = 37436(0x923c, float:5.2459E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
            goto L_0x016a
        L_0x0081:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0098
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.h r0 = (com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127383h) r0
            r6.getClass()
            int r7 = r0.f350771a
            r7 = r7 | r4
            r0.f350771a = r7
            r0.f350773c = r6
        L_0x0098:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x00af
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.h r0 = (com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127383h) r0
            r5.getClass()
            int r6 = r0.f350771a
            r3 = r3 | r6
            r0.f350771a = r3
            r0.f350772b = r5
        L_0x00af:
            if (r1 == 0) goto L_0x00c0
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.h r0 = (com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127383h) r0
            r0.f350774d = r1
            int r1 = r0.f350771a
            r1 = r1 | 4
            r0.f350771a = r1
        L_0x00c0:
            com.google.protobuf.bv r0 = r8.build()
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.h r0 = (com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127383h) r0
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.f r1 = (com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127381f) r1
            r0.getClass()
            r1.f350768b = r0
            r1.f350767a = r4
            com.google.protobuf.bv r0 = r2.build()
            r1 = r0
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.f r1 = (com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127381f) r1
            goto L_0x016a
        L_0x00dd:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.p9589a.C127389a.f350789a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "bundle does not contains required session deeplink data."
            r3 = 37435(0x923b, float:5.2458E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            goto L_0x016a
        L_0x00ed:
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.f r2 = com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127381f.f350765c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.e r2 = (com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127380e) r2
            boolean r7 = r0.containsKey(r6)
            if (r7 == 0) goto L_0x015c
            boolean r7 = r0.containsKey(r5)
            if (r7 != 0) goto L_0x0102
            goto L_0x015c
        L_0x0102:
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.d r1 = com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127379d.f350760d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.c r1 = (com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127378c) r1
            java.lang.String r6 = r0.getString(r6)
            java.lang.String r0 = r0.getString(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L_0x0129
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.d r5 = (com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127379d) r5
            r6.getClass()
            int r7 = r5.f350762a
            r4 = r4 | r7
            r5.f350762a = r4
            r5.f350764c = r6
        L_0x0129:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0140
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.d r4 = (com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127379d) r4
            r0.getClass()
            int r5 = r4.f350762a
            r5 = r5 | r3
            r4.f350762a = r5
            r4.f350763b = r0
        L_0x0140:
            com.google.protobuf.bv r0 = r1.build()
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.d r0 = (com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127379d) r0
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.f r1 = (com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127381f) r1
            r0.getClass()
            r1.f350768b = r0
            r1.f350767a = r3
            com.google.protobuf.bv r0 = r2.build()
            r1 = r0
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.f r1 = (com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127381f) r1
            goto L_0x016a
        L_0x015c:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.p9589a.C127389a.f350789a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "bundle does not contains required deeplink data."
            r3 = 37432(0x9238, float:5.2453E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
        L_0x016a:
            if (r1 != 0) goto L_0x0182
            com.google.common.f.e r11 = com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.C127395c.f350800a
            com.google.common.f.x r11 = r11.mo56225c()
            java.lang.String r0 = "No deeplink data was passed in through intent extras."
            r1 = 37427(0x9233, float:5.2446E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r1)).mo56386p(r0)
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.c r11 = r10.f350799a
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.DeeplinkTrampolineActivity r11 = r11.f350801b
            r11.finish()
            return
        L_0x0182:
            com.google.apps.tiktok.account.api.controller.ax r11 = r11.f120815a
            com.google.apps.tiktok.account.AccountId r11 = r11.f120816a
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.g r0 = new com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.g
            r0.<init>()
            dagger.hilt.android.internal.managers.C68324h.m98669f(r0)
            com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.m84047b(r0, r11)
            com.google.apps.tiktok.inject.p3659d.C47243l.m84039a(r0, r1)
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.c r11 = r10.f350799a
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.DeeplinkTrampolineActivity r11 = r11.f350801b
            android.support.v4.app.ar r11 = r11.f727a
            android.support.v4.app.at r11 = r11.f739a
            android.support.v4.app.FragmentManager r11 = r11.f744e
            android.support.v4.app.cc r11 = r11.f634a
            java.lang.String r1 = "deeplink_trampoline_fragment"
            android.support.v4.app.Fragment r11 = r11.mo671c(r1)
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.g r11 = (com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.C127399g) r11
            if (r11 == 0) goto L_0x01bf
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.c r2 = r10.f350799a
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.DeeplinkTrampolineActivity r2 = r2.f350801b
            android.support.v4.app.ar r2 = r2.f727a
            android.support.v4.app.at r2 = r2.f739a
            android.support.v4.app.FragmentManager r2 = r2.f744e
            android.support.v4.app.a r3 = new android.support.v4.app.a
            r3.<init>((android.support.p031v4.app.FragmentManager) r2)
            r3.mo516m(r11)
            r3.mo509f()
        L_0x01bf:
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.c r11 = r10.f350799a
            com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.DeeplinkTrampolineActivity r11 = r11.f350801b
            android.support.v4.app.ar r11 = r11.f727a
            android.support.v4.app.at r11 = r11.f739a
            android.support.v4.app.FragmentManager r11 = r11.f744e
            android.support.v4.app.a r2 = new android.support.v4.app.a
            r2.<init>((android.support.p031v4.app.FragmentManager) r11)
            r2.mo685r(r0, r1)
            r2.mo509f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.C127394b.mo19982a(com.google.apps.tiktok.account.api.controller.aw):void");
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C127395c.f350800a.mo56225c()).mo56382g(th)).mo56372aa(37428)).mo56386p("onAccountError");
        this.f350799a.f350801b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
