package com.google.android.libraries.componentview.components.p1682a;

import android.view.View;

/* renamed from: com.google.android.libraries.componentview.components.a.be */
/* compiled from: PG */
final class C19813be implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C19814bf f55376a;

    public C19813be(C19814bf bfVar) {
        this.f55376a = bfVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            java.lang.String r11 = "B.component_level_click_logging_enabled"
            com.google.android.libraries.componentview.components.a.bf r0 = r10.f55376a
            r1 = 4
            r2 = 0
            r0.mo25421J(r1, r2)
            com.google.android.libraries.componentview.components.a.bf r0 = r10.f55376a
            java.lang.String r4 = r0.mo25097c()
            r0 = 5
            r1 = 0
            java.lang.String r3 = "ZeroStateActionComp"
            if (r4 == 0) goto L_0x011e
            com.google.android.libraries.componentview.components.a.bf r5 = r10.f55376a
            com.google.android.libraries.componentview.components.a.a.ab r6 = r5.f55377a
            int r6 = r6.f55179a
            r6 = r6 & 2
            r7 = 3
            if (r6 == 0) goto L_0x00c1
            com.google.common.l.i r6 = com.google.common.p4541l.C59326i.f157516d     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x00ba }
            com.google.android.libraries.componentview.components.a.a.ab r8 = r5.f55377a     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x00ba }
            java.lang.String r8 = r8.f55181c     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x00ba }
            byte[] r6 = r6.mo56836k(r8)     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x00ba }
            java.io.ObjectInputStream r8 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x00ba }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x00ba }
            r9.<init>(r6)     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x00ba }
            r8.<init>(r9)     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x00ba }
            java.lang.Object r6 = r8.readObject()     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x00ba }
            r8.close()     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x00ba }
            boolean r8 = r6 instanceof java.util.Map     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x00ba }
            if (r8 == 0) goto L_0x00c1
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x00ba }
            boolean r8 = r6.containsKey(r11)     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x00ba }
            if (r8 == 0) goto L_0x00c1
            java.lang.Object r11 = r6.get(r11)     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x00ba }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x00ba }
            boolean r11 = java.lang.Boolean.parseBoolean(r11)     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x00ba }
            if (r11 != 0) goto L_0x0054
            goto L_0x00c1
        L_0x0054:
            com.google.bq.h r11 = r5.f55379c
            com.google.common.o.l.n r11 = r11.f150550b
            if (r11 != 0) goto L_0x005c
            com.google.common.o.l.n r11 = com.google.common.p4552o.p4566l.C60214n.f162914g
        L_0x005c:
            int r11 = r11.f162916a
            r11 = r11 & 8
            if (r11 == 0) goto L_0x00b2
            com.google.android.libraries.componentview.services.a.b r11 = r5.f55380d
            java.util.Random r11 = r11.f57684a
            long r8 = r11.nextLong()
            com.google.android.libraries.componentview.components.a.a.ab r11 = r5.f55377a
            java.lang.String r11 = r11.f55182d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "ZeroState click action: "
            r0.<init>(r6)
            r0.append(r11)
            java.lang.String r6 = ", click id: "
            r0.append(r6)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r6 = new java.lang.Object[r1]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r7, r3, r2, r0, r6)
            com.google.android.libraries.componentview.services.application.ca r0 = r5.f55671g
            com.google.android.libraries.componentview.services.application.d r6 = new com.google.android.libraries.componentview.services.application.d
            r6.<init>()
            r6.mo25529b(r11)
            com.google.bq.h r11 = r5.f55379c
            java.lang.String r11 = r11.f150556h
            r6.mo25530c(r11)
            com.google.bq.h r11 = r5.f55379c
            java.lang.String r5 = r11.f150555g
            r6.f57816c = r5
            java.lang.String r11 = r11.f150558j
            r6.f57817d = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r8)
            r6.f57820g = r11
            com.google.android.libraries.componentview.services.application.LogData r11 = r6.mo25528a()
            r0.mo21037a(r11)
            goto L_0x00c8
        L_0x00b2:
            java.lang.String r11 = "Skipping click logging: no VE is specified"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r7, r3, r2, r11, r0)
            goto L_0x00c8
        L_0x00ba:
            java.lang.String r11 = "Could not Base64-decode Zero state action data."
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r0, r3, r2, r11, r5)
        L_0x00c1:
            java.lang.String r11 = "Skipping click logging: component level click is not enabled"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r7, r3, r2, r11, r0)
        L_0x00c8:
            java.lang.String r11 = "#onClick(): notify clients about Zero state action event"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r7, r3, r2, r11, r0)
            com.google.android.libraries.componentview.components.a.bf r11 = r10.f55376a
            com.google.bq.h r11 = r11.f55379c
            com.google.common.o.l.n r11 = r11.f150550b
            if (r11 != 0) goto L_0x00d9
            com.google.common.o.l.n r11 = com.google.common.p4552o.p4566l.C60214n.f162914g
        L_0x00d9:
            int r11 = r11.f162916a
            r11 = r11 & 8
            if (r11 == 0) goto L_0x00f0
            com.google.android.libraries.componentview.components.a.bf r11 = r10.f55376a
            com.google.bq.h r11 = r11.f55379c
            com.google.common.o.l.n r11 = r11.f150550b
            if (r11 != 0) goto L_0x00e9
            com.google.common.o.l.n r11 = com.google.common.p4552o.p4566l.C60214n.f162914g
        L_0x00e9:
            int r11 = r11.f162918c
            java.lang.String r11 = java.lang.String.valueOf(r11)
            goto L_0x00f2
        L_0x00f0:
            java.lang.String r11 = ""
        L_0x00f2:
            r8 = r11
            com.google.android.libraries.componentview.components.a.bf r11 = r10.f55376a
            com.google.android.libraries.componentview.services.application.cj r0 = r11.f55378b
            com.google.android.libraries.componentview.components.a.a.ab r11 = r11.f55377a
            java.lang.String r11 = r11.f55182d
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x0108
            com.google.android.libraries.componentview.components.a.bf r11 = r10.f55376a
            com.google.android.libraries.componentview.components.a.a.ab r11 = r11.f55377a
            java.lang.String r11 = r11.f55182d
            goto L_0x010a
        L_0x0108:
            java.lang.String r11 = "ZeroStateAction"
        L_0x010a:
            java.lang.String r3 = "CardId"
            java.lang.String r5 = "ZeroStateActionData"
            com.google.android.libraries.componentview.components.a.bf r1 = r10.f55376a
            com.google.android.libraries.componentview.components.a.a.ab r1 = r1.f55377a
            java.lang.String r6 = r1.f55181c
            java.lang.String r7 = "ContainerVeId"
            com.google.common.b.hd r1 = com.google.common.p4522b.C58495hd.m89902p(r3, r4, r5, r6, r7, r8)
            r0.mo25491a(r11, r1)
            return
        L_0x011e:
            java.lang.String r11 = "Card id for Zero state action component is not specified."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r0, r3, r2, r11, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.components.p1682a.C19813be.onClick(android.view.View):void");
    }
}
