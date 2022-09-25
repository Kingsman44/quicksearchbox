package com.google.android.apps.gsa.staticplugins.nowcards.base;

import com.google.android.apps.gsa.shared.util.C91043j;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.ar */
/* compiled from: PG */
public final /* synthetic */ class C104316ar implements C91043j {

    /* renamed from: a */
    public final /* synthetic */ C104317as f290183a;

    public /* synthetic */ C104316ar(C104317as asVar) {
        this.f290183a = asVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cc, code lost:
        if (r6 == com.google.p375ai.p378b.C7915or.DISMISS_CARD) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00ea  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17709a(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.android.apps.gsa.staticplugins.nowcards.base.as r0 = r11.f290183a
            com.google.android.sidekick.shared.remoteapi.TrainingQuestion r12 = (com.google.android.sidekick.shared.remoteapi.TrainingQuestion) r12
            com.google.ai.b.z r1 = r0.f290185b
            if (r1 != 0) goto L_0x000a
            goto L_0x01b0
        L_0x000a:
            r2 = 1
            if (r12 != 0) goto L_0x0018
            com.google.android.apps.gsa.shared.ui.d r3 = r0.f290191h
            if (r3 != 0) goto L_0x0012
            goto L_0x0018
        L_0x0012:
            boolean r12 = r1.f28783e
            r3.mo84964a(r1, r12, r2)
            return
        L_0x0018:
            com.google.ai.b.ou r3 = r1.f28781c
            if (r3 != 0) goto L_0x001e
            com.google.ai.b.ou r3 = com.google.p375ai.p378b.C7918ou.f27824h
        L_0x001e:
            int r3 = r3.f27826a
            r4 = 2
            r3 = r3 & r4
            r5 = 4
            r6 = 0
            if (r3 == 0) goto L_0x00aa
            if (r12 == 0) goto L_0x00aa
            com.google.ai.b.ou r3 = r1.f28781c
            if (r3 != 0) goto L_0x002e
            com.google.ai.b.ou r3 = com.google.p375ai.p378b.C7918ou.f27824h
        L_0x002e:
            com.google.ai.b.oo r3 = r3.f27829d
            if (r3 != 0) goto L_0x0034
            com.google.ai.b.oo r3 = com.google.p375ai.p378b.C7912oo.f27797d
        L_0x0034:
            com.google.ai.b.or r7 = com.google.p375ai.p378b.C7915or.INVALID
            com.google.ai.b.pc r7 = r12.f118460a
            int r8 = r7.f27853c
            int r8 = com.google.p375ai.p378b.C7923oz.m22891a(r8)
            if (r8 != 0) goto L_0x0041
            goto L_0x006d
        L_0x0041:
            if (r8 == r2) goto L_0x006d
            if (r8 == r4) goto L_0x0046
            goto L_0x00aa
        L_0x0046:
            int r8 = r3.f27799a
            r8 = r8 & r4
            if (r8 == 0) goto L_0x0065
            int r3 = r3.f27801c
            com.google.protobuf.cq r7 = r7.f27859i
            java.lang.Object r3 = r7.get(r3)
            com.google.ai.b.ox r3 = (com.google.p375ai.p378b.C7921ox) r3
            int r7 = r3.f27836a
            r7 = r7 & r5
            if (r7 == 0) goto L_0x00aa
            int r3 = r3.f27838c
            com.google.ai.b.or r3 = com.google.p375ai.p378b.C7915or.m22889a(r3)
            if (r3 != 0) goto L_0x00ab
            com.google.ai.b.or r3 = com.google.p375ai.p378b.C7915or.INVALID
            goto L_0x00ab
        L_0x0065:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Answer was not a multiple choice answer."
            r12.<init>(r0)
            throw r12
        L_0x006d:
            int r8 = r3.f27799a
            r8 = r8 & r2
            if (r8 == 0) goto L_0x00a2
            int r8 = r7.f27851a
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x00aa
            com.google.ai.b.pb r7 = r7.f27857g
            if (r7 != 0) goto L_0x007e
            com.google.ai.b.pb r7 = com.google.p375ai.p378b.C7926pb.f27844d
        L_0x007e:
            boolean r3 = r3.f27800b
            if (r3 == 0) goto L_0x0092
            int r3 = r7.f27846a
            r3 = r3 & r2
            if (r3 == 0) goto L_0x00aa
            int r3 = r7.f27847b
            com.google.ai.b.or r3 = com.google.p375ai.p378b.C7915or.m22889a(r3)
            if (r3 != 0) goto L_0x00ab
            com.google.ai.b.or r3 = com.google.p375ai.p378b.C7915or.INVALID
            goto L_0x00ab
        L_0x0092:
            int r3 = r7.f27846a
            r3 = r3 & r4
            if (r3 == 0) goto L_0x00aa
            int r3 = r7.f27848c
            com.google.ai.b.or r3 = com.google.p375ai.p378b.C7915or.m22889a(r3)
            if (r3 != 0) goto L_0x00ab
            com.google.ai.b.or r3 = com.google.p375ai.p378b.C7915or.INVALID
            goto L_0x00ab
        L_0x00a2:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Answer was not a yes/no answer."
            r12.<init>(r0)
            throw r12
        L_0x00aa:
            r3 = r6
        L_0x00ab:
            if (r3 != 0) goto L_0x00c2
            if (r12 == 0) goto L_0x00c2
            com.google.ai.b.pc r3 = r12.f118460a
            int r7 = r3.f27851a
            r7 = r7 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x00c3
            int r3 = r3.f27858h
            com.google.ai.b.or r6 = com.google.p375ai.p378b.C7915or.m22889a(r3)
            if (r6 != 0) goto L_0x00c3
            com.google.ai.b.or r6 = com.google.p375ai.p378b.C7915or.INVALID
            goto L_0x00c3
        L_0x00c2:
            r6 = r3
        L_0x00c3:
            boolean r3 = r1.f28783e
            if (r3 != 0) goto L_0x00ce
            r3 = 0
            if (r6 == 0) goto L_0x00cf
            com.google.ai.b.or r7 = com.google.p375ai.p378b.C7915or.DISMISS_CARD
            if (r6 != r7) goto L_0x00cf
        L_0x00ce:
            r3 = 1
        L_0x00cf:
            boolean r7 = r0.f290188e
            if (r7 != 0) goto L_0x00e8
            if (r3 == 0) goto L_0x00e8
            com.google.ai.b.ou r7 = r1.f28781c
            if (r7 != 0) goto L_0x00db
            com.google.ai.b.ou r7 = com.google.p375ai.p378b.C7918ou.f27824h
        L_0x00db:
            int r7 = r7.f27826a
            r7 = r7 & r4
            if (r7 == 0) goto L_0x010e
            java.lang.Object r7 = r0.f290192i
            monitor-enter(r7)
            monitor-exit(r7)     // Catch:{ all -> 0x00e5 }
            goto L_0x010e
        L_0x00e5:
            r12 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00e5 }
            throw r12
        L_0x00e8:
            if (r3 != 0) goto L_0x010e
            com.google.ai.b.ou r7 = r1.f28781c
            if (r7 != 0) goto L_0x00f1
            com.google.ai.b.ou r8 = com.google.p375ai.p378b.C7918ou.f27824h
            goto L_0x00f2
        L_0x00f1:
            r8 = r7
        L_0x00f2:
            int r8 = r8.f27826a
            r8 = r8 & r4
            if (r8 == 0) goto L_0x010e
            com.google.android.apps.gsa.sidekick.shared.e.a.l r8 = r0.f290189f
            if (r7 != 0) goto L_0x00fe
            com.google.ai.b.ou r9 = com.google.p375ai.p378b.C7918ou.f27824h
            goto L_0x00ff
        L_0x00fe:
            r9 = r7
        L_0x00ff:
            if (r7 != 0) goto L_0x0103
            com.google.ai.b.ou r7 = com.google.p375ai.p378b.C7918ou.f27824h
        L_0x0103:
            com.google.ai.b.oo r7 = r7.f27829d
            if (r7 != 0) goto L_0x0109
            com.google.ai.b.oo r7 = com.google.p375ai.p378b.C7912oo.f27797d
        L_0x0109:
            com.google.ai.b.hj r10 = r0.f290186c
            r8.mo86225l(r9, r7, r10)
        L_0x010e:
            if (r6 == 0) goto L_0x01a7
            int r7 = r6.ordinal()
            if (r7 == r2) goto L_0x01a7
            if (r7 == r5) goto L_0x01a0
            r2 = 11
            if (r7 == r2) goto L_0x01a0
            if (r12 == 0) goto L_0x0190
            boolean r12 = com.google.android.apps.gsa.sidekick.shared.training.C91924d.m150801a(r6)
            if (r12 == 0) goto L_0x0190
            android.content.Context r12 = r0.f290187d
            com.google.ai.b.hj r2 = r0.f290186c
            boolean r5 = com.google.android.apps.gsa.sidekick.shared.training.C91924d.m150801a(r6)
            com.google.common.base.C58838bb.m90868c(r5)
            int r5 = r6.ordinal()
            if (r5 == r4) goto L_0x017b
            r4 = 3
            if (r5 == r4) goto L_0x0166
            r4 = 5
            if (r5 == r4) goto L_0x015c
            r12 = 7
            if (r5 == r12) goto L_0x0156
            r12 = 8
            if (r5 == r12) goto L_0x0150
            com.google.common.f.e r12 = com.google.android.apps.gsa.sidekick.shared.training.C91924d.f256347a
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r2 = "Unrecognized client action: %s"
            r4 = 11933(0x2e9d, float:1.6722E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r4)).mo56389s(r2, r6)
            goto L_0x01a7
        L_0x0150:
            com.google.ai.b.g r12 = com.google.p375ai.p378b.C7681g.DELETE_PLACE
            com.google.android.apps.gsa.sidekick.shared.training.C91924d.m150802b(r12, r2)
            goto L_0x01a7
        L_0x0156:
            com.google.ai.b.g r12 = com.google.p375ai.p378b.C7681g.RENAME_PLACE
            com.google.android.apps.gsa.sidekick.shared.training.C91924d.m150802b(r12, r2)
            goto L_0x01a7
        L_0x015c:
            java.lang.String r2 = "com.google.android.googlequicksearchbox.MY_PLACES"
            android.content.Intent r2 = com.google.android.apps.gsa.sidekick.shared.util.C91962am.m150919a(r2)
            r12.startActivity(r2)
            goto L_0x01a7
        L_0x0166:
            com.google.android.apps.gsa.sidekick.shared.training.InterestLauncherHelper$Options r2 = new com.google.android.apps.gsa.sidekick.shared.training.InterestLauncherHelper$Options
            r2.<init>()
            java.lang.String r4 = "stock_listings"
            r2.f256343a = r4
            com.google.android.apps.gsa.shared.s.a.a r4 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            android.content.Intent r2 = com.google.android.apps.gsa.sidekick.shared.training.InterestLauncherHelper.m150800a(r2)     // Catch:{ all -> 0x0179 }
            r12.startActivity(r2)     // Catch:{ all -> 0x0179 }
            goto L_0x01a7
        L_0x0179:
            r12 = move-exception
            throw r12
        L_0x017b:
            com.google.android.apps.gsa.sidekick.shared.training.InterestLauncherHelper$Options r2 = new com.google.android.apps.gsa.sidekick.shared.training.InterestLauncherHelper$Options
            r2.<init>()
            java.lang.String r4 = "sports_teams"
            r2.f256343a = r4
            com.google.android.apps.gsa.shared.s.a.a r4 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            android.content.Intent r2 = com.google.android.apps.gsa.sidekick.shared.training.InterestLauncherHelper.m150800a(r2)     // Catch:{ all -> 0x018e }
            r12.startActivity(r2)     // Catch:{ all -> 0x018e }
            goto L_0x01a7
        L_0x018e:
            r12 = move-exception
            throw r12
        L_0x0190:
            com.google.common.f.e r12 = com.google.android.apps.gsa.staticplugins.nowcards.base.C104317as.f290184a
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r2 = "Unrecognized client action: %s"
            r4 = 21945(0x55b9, float:3.0751E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r4)).mo56389s(r2, r6)
            int r12 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x01a7
        L_0x01a0:
            com.google.android.apps.gsa.sidekick.shared.d.a r12 = r0.f290190g
            com.google.ai.b.eo r2 = com.google.p375ai.p378b.C7642eo.TRAINING_QUESTION_ANSWER
            r12.mo86208b(r2)
        L_0x01a7:
            boolean r12 = r1.f28783e
            com.google.android.apps.gsa.shared.ui.d r0 = r0.f290191h
            if (r0 == 0) goto L_0x01b0
            r0.mo84964a(r1, r3, r12)
        L_0x01b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.base.C104316ar.mo17709a(java.lang.Object):void");
    }
}
