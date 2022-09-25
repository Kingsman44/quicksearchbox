package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import com.google.android.gms.common.api.C143712ae;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.g */
/* compiled from: PG */
final class C93275g implements C143712ae {

    /* renamed from: a */
    final /* synthetic */ C93276h f260104a;

    public C93275g(C93276h hVar) {
        this.f260104a = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x013f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo6030a(com.google.android.gms.common.api.C143711ad r10) {
        /*
            r9 = this;
            com.google.android.gms.appdatasearch.GetRecentContextCall$Response r10 = (com.google.android.gms.appdatasearch.GetRecentContextCall$Response) r10
            com.google.android.apps.gsa.staticplugins.actions.a.h r0 = r9.f260104a
            com.google.android.gms.common.api.w r0 = r0.f260107c
            r0.mo119132g()
            java.util.List r10 = r10.f387454b
            java.util.Iterator r10 = r10.iterator()
        L_0x000f:
            boolean r0 = r10.hasNext()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r10.next()
            com.google.android.gms.appdatasearch.UsageInfo r0 = (com.google.android.gms.appdatasearch.UsageInfo) r0
            com.google.android.gms.appdatasearch.DocumentContents r0 = r0.f387566e
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.appdatasearch.DocumentSection[] r0 = r0.f387430a
            if (r0 == 0) goto L_0x000f
            int r3 = r0.length
            r4 = 0
        L_0x0027:
            if (r4 >= r3) goto L_0x000f
            r5 = r0[r4]
            byte[] r6 = r5.f387445e
            if (r6 == 0) goto L_0x0041
            int r6 = r6.length
            if (r6 == 0) goto L_0x0041
            com.google.android.gms.appdatasearch.RegisterSectionInfo r6 = r5.f387443c
            if (r6 == 0) goto L_0x0041
            java.lang.String r7 = ".private:action"
            java.lang.String r6 = r6.f387526a
            boolean r6 = android.text.TextUtils.equals(r7, r6)
            if (r6 == 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            int r4 = r4 + 1
            goto L_0x0027
        L_0x0044:
            r5 = r2
        L_0x0045:
            if (r5 != 0) goto L_0x0055
            com.google.common.f.e r10 = com.google.android.apps.gsa.staticplugins.actions.p7353a.C93276h.f260105a
            com.google.common.f.x r10 = r10.mo56226d()
            java.lang.String r0 = "Got app indexing response. However there is no .private:action section."
            r1 = 13490(0x34b2, float:1.8904E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0055:
            byte[] r10 = r5.f387445e     // Catch:{ ct -> 0x010f }
            if (r10 == 0) goto L_0x010c
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x010f }
            n.a.a.d r3 = p5591n.p5592a.p5593a.C71853d.f191391b     // Catch:{ ct -> 0x010f }
            com.google.protobuf.bv r10 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r10, (com.google.protobuf.C62921ba) r0)     // Catch:{ ct -> 0x010f }
            n.a.a.d r10 = (p5591n.p5592a.p5593a.C71853d) r10     // Catch:{ ct -> 0x010f }
            com.google.protobuf.cq r10 = r10.f191393a     // Catch:{ ct -> 0x010f }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ ct -> 0x010f }
            r0 = r2
            r3 = r0
            r4 = r3
        L_0x006e:
            boolean r5 = r10.hasNext()     // Catch:{ ct -> 0x0109 }
            if (r5 == 0) goto L_0x0124
            java.lang.Object r5 = r10.next()     // Catch:{ ct -> 0x0109 }
            n.a.a.b r5 = (p5591n.p5592a.p5593a.C71851b) r5     // Catch:{ ct -> 0x0109 }
            int r6 = r5.f191388a     // Catch:{ ct -> 0x0109 }
            r6 = r6 & 2
            if (r6 == 0) goto L_0x006e
            java.lang.String r6 = "completionToken"
            java.lang.String r7 = r5.f191389b     // Catch:{ ct -> 0x0109 }
            boolean r6 = android.text.TextUtils.equals(r6, r7)     // Catch:{ ct -> 0x0109 }
            if (r6 == 0) goto L_0x0093
            n.a.a.f r5 = r5.f191390c     // Catch:{ ct -> 0x0109 }
            if (r5 != 0) goto L_0x0090
            n.a.a.f r5 = p5591n.p5592a.p5593a.C71855f.f191394d     // Catch:{ ct -> 0x0109 }
        L_0x0090:
            java.lang.String r4 = r5.f191397b     // Catch:{ ct -> 0x0109 }
            goto L_0x006e
        L_0x0093:
            java.lang.String r6 = "object"
            java.lang.String r7 = r5.f191389b     // Catch:{ ct -> 0x0109 }
            boolean r6 = android.text.TextUtils.equals(r6, r7)     // Catch:{ ct -> 0x0109 }
            if (r6 == 0) goto L_0x00f5
            n.a.a.f r5 = r5.f191390c     // Catch:{ ct -> 0x0109 }
            if (r5 != 0) goto L_0x00a3
            n.a.a.f r5 = p5591n.p5592a.p5593a.C71855f.f191394d     // Catch:{ ct -> 0x0109 }
        L_0x00a3:
            n.a.a.d r5 = r5.f191398c     // Catch:{ ct -> 0x0109 }
            if (r5 != 0) goto L_0x00a9
            n.a.a.d r5 = p5591n.p5592a.p5593a.C71853d.f191391b     // Catch:{ ct -> 0x0109 }
        L_0x00a9:
            if (r5 != 0) goto L_0x00ad
        L_0x00ab:
            r0 = r2
            goto L_0x006e
        L_0x00ad:
            com.google.protobuf.cq r5 = r5.f191393a     // Catch:{ ct -> 0x0109 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ ct -> 0x0109 }
        L_0x00b3:
            boolean r6 = r5.hasNext()     // Catch:{ ct -> 0x0109 }
            if (r6 == 0) goto L_0x00ab
            java.lang.Object r6 = r5.next()     // Catch:{ ct -> 0x0109 }
            n.a.a.b r6 = (p5591n.p5592a.p5593a.C71851b) r6     // Catch:{ ct -> 0x0109 }
            java.lang.String r7 = "url"
            java.lang.String r8 = r6.f191389b     // Catch:{ ct -> 0x0109 }
            boolean r7 = android.text.TextUtils.equals(r7, r8)     // Catch:{ ct -> 0x0109 }
            if (r7 == 0) goto L_0x00b3
            int r7 = r6.f191388a     // Catch:{ ct -> 0x0109 }
            r7 = r7 & 2
            if (r7 == 0) goto L_0x00b3
            n.a.a.f r7 = r6.f191390c     // Catch:{ ct -> 0x0109 }
            if (r7 != 0) goto L_0x00d5
            n.a.a.f r7 = p5591n.p5592a.p5593a.C71855f.f191394d     // Catch:{ ct -> 0x0109 }
        L_0x00d5:
            java.lang.String r7 = r7.f191397b     // Catch:{ ct -> 0x0109 }
            boolean r7 = r7.isEmpty()     // Catch:{ ct -> 0x0109 }
            if (r7 != 0) goto L_0x00b3
            n.a.a.f r6 = r6.f191390c     // Catch:{ ct -> 0x0109 }
            if (r6 != 0) goto L_0x00e3
            n.a.a.f r6 = p5591n.p5592a.p5593a.C71855f.f191394d     // Catch:{ ct -> 0x0109 }
        L_0x00e3:
            java.lang.String r6 = r6.f191397b     // Catch:{ ct -> 0x0109 }
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ ct -> 0x0109 }
            android.net.Uri r6 = com.google.android.apps.gsa.shared.util.p7157a.C90716a.m148158c(r6)     // Catch:{ ct -> 0x0109 }
            if (r6 == 0) goto L_0x00b3
            java.lang.String r0 = r6.toString()     // Catch:{ ct -> 0x0109 }
            goto L_0x006e
        L_0x00f5:
            java.lang.String r6 = "actionStatus"
            java.lang.String r7 = r5.f191389b     // Catch:{ ct -> 0x0109 }
            boolean r6 = android.text.TextUtils.equals(r6, r7)     // Catch:{ ct -> 0x0109 }
            if (r6 == 0) goto L_0x006e
            n.a.a.f r5 = r5.f191390c     // Catch:{ ct -> 0x0109 }
            if (r5 != 0) goto L_0x0105
            n.a.a.f r5 = p5591n.p5592a.p5593a.C71855f.f191394d     // Catch:{ ct -> 0x0109 }
        L_0x0105:
            java.lang.String r3 = r5.f191397b     // Catch:{ ct -> 0x0109 }
            goto L_0x006e
        L_0x0109:
            r10 = move-exception
            r2 = r4
            goto L_0x0112
        L_0x010c:
            r3 = r2
            r4 = r3
            goto L_0x0125
        L_0x010f:
            r10 = move-exception
            r0 = r2
            r3 = r0
        L_0x0112:
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.actions.p7353a.C93276h.f260105a
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r10 = r10.getMessage()
            r5 = 13491(0x34b3, float:1.8905E-41)
            java.lang.String r6 = "Malformed section in app indexing response provided: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r5)).mo56389s(r6, r10)
            r4 = r2
        L_0x0124:
            r2 = r0
        L_0x0125:
            com.google.android.apps.gsa.staticplugins.actions.a.h r10 = r9.f260104a
            com.google.android.apps.gsa.search.shared.actions.c r10 = r10.f260108d
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r10 = r10.mo80807f()
            boolean r0 = r10 instanceof com.google.android.apps.gsa.search.shared.actions.modular.ModularAction
            if (r0 != 0) goto L_0x0133
            goto L_0x01ba
        L_0x0133:
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r10 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r10
            if (r10 == 0) goto L_0x01ba
            java.lang.String r0 = r10.f236110p
            boolean r0 = android.text.TextUtils.equals(r4, r0)
            if (r0 == 0) goto L_0x01ba
            com.google.android.apps.gsa.staticplugins.actions.a.h r0 = r9.f260104a
            r0.mo87606a()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0178
            java.lang.String r0 = "http://schema.org/CompletedActionStatus"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x015c
            com.google.android.apps.gsa.staticplugins.actions.a.h r0 = r9.f260104a
            com.google.common.util.concurrent.SettableFuture r0 = r0.f260110f
            com.google.android.apps.gsa.search.shared.actions.i r3 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236079a
            r0.mo57356n(r3)
            goto L_0x0181
        L_0x015c:
            java.lang.String r0 = "http://schema.org/FailedActionStatus"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x016e
            com.google.android.apps.gsa.staticplugins.actions.a.h r0 = r9.f260104a
            com.google.common.util.concurrent.SettableFuture r0 = r0.f260110f
            com.google.android.apps.gsa.search.shared.actions.i r3 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            r0.mo57356n(r3)
            goto L_0x0181
        L_0x016e:
            com.google.android.apps.gsa.staticplugins.actions.a.h r0 = r9.f260104a
            com.google.common.util.concurrent.SettableFuture r0 = r0.f260110f
            com.google.android.apps.gsa.search.shared.actions.i r3 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236080b
            r0.mo57356n(r3)
            goto L_0x0181
        L_0x0178:
            com.google.android.apps.gsa.staticplugins.actions.a.h r0 = r9.f260104a
            com.google.common.util.concurrent.SettableFuture r0 = r0.f260110f
            com.google.android.apps.gsa.search.shared.actions.i r3 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236080b
            r0.mo57356n(r3)
        L_0x0181:
            com.google.android.apps.gsa.staticplugins.actions.a.h r0 = r9.f260104a
            com.google.android.apps.gsa.search.shared.actions.c r0 = r0.f260108d
            if (r0 == 0) goto L_0x01ba
            if (r2 == 0) goto L_0x01ba
            com.google.bb.a.lc r0 = com.google.p4152bb.p4153a.C55242lc.f145462c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.bb.a.lb r0 = (com.google.p4152bb.p4153a.C55241lb) r0
            java.lang.String r3 = "&"
            java.lang.String[] r2 = r2.split(r3)
            r1 = r2[r1]
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.bb.a.lc r2 = (com.google.p4152bb.p4153a.C55242lc) r2
            r1.getClass()
            int r3 = r2.f145464a
            r3 = r3 | 1
            r2.f145464a = r3
            r2.f145465b = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.bb.a.lc r0 = (com.google.p4152bb.p4153a.C55242lc) r0
            r10.f236109o = r0
            com.google.android.apps.gsa.staticplugins.actions.a.h r0 = r9.f260104a
            com.google.android.apps.gsa.search.shared.actions.c r0 = r0.f260108d
            r0.mo80769A(r10)
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7353a.C93275g.mo6030a(com.google.android.gms.common.api.ad):void");
    }
}
