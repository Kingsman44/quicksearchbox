package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.aq */
/* compiled from: PG */
public final /* synthetic */ class C35828aq implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35830as f93886a;

    /* renamed from: b */
    public final /* synthetic */ C35841bc f93887b;

    /* renamed from: c */
    public final /* synthetic */ C52115fu f93888c;

    /* renamed from: d */
    public final /* synthetic */ String f93889d;

    public /* synthetic */ C35828aq(C35830as asVar, C35841bc bcVar, C52115fu fuVar, String str) {
        this.f93886a = asVar;
        this.f93887b = bcVar;
        this.f93888c = fuVar;
        this.f93889d = str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        if ((r3 & 32) != 0) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cc, code lost:
        r4 = r9.mo39874c(r1, r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.android.libraries.search.assistant.performer.deviceactions.a.a.as r0 = r8.f93886a
            com.google.android.libraries.search.assistant.performer.deviceactions.a.a.bc r1 = r8.f93887b
            com.google.assistant.e.j.fu r2 = r8.f93888c
            java.lang.String r3 = r8.f93889d
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r4 = 0
            if (r9 == 0) goto L_0x0119
            com.google.android.libraries.search.assistant.performer.deviceactions.a.a.w r9 = r0.f93895c
            if (r2 == 0) goto L_0x010a
            java.lang.String r0 = r2.f136760f     // Catch:{ IllegalArgumentException -> 0x001c }
            com.google.protos.an.d.b.p r0 = com.google.protos.p4850an.p4855d.p4857b.C63490p.m96249a(r0)     // Catch:{ IllegalArgumentException -> 0x001c }
            goto L_0x002c
        L_0x001c:
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35866w.f93973a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r3 = "Unspecified device setting."
            r5 = 51917(0xcacd, float:7.2751E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r3)
            com.google.protos.an.d.b.p r0 = com.google.protos.p4850an.p4855d.p4857b.C63490p.UNSPECIFIED
        L_0x002c:
            int r3 = r2.f136755a
            r5 = r3 & 2
            if (r5 == 0) goto L_0x00e1
            int r5 = r2.f136757c
            int r6 = com.google.assistant.p3897e.p3921j.C52112fr.m86508b(r5)
            r7 = 1
            if (r6 != 0) goto L_0x003c
            r6 = 1
        L_0x003c:
            int r6 = r6 + -1
            switch(r6) {
                case 1: goto L_0x00c2;
                case 2: goto L_0x00b2;
                case 3: goto L_0x007b;
                case 4: goto L_0x0062;
                case 5: goto L_0x0062;
                case 6: goto L_0x005c;
                default: goto L_0x0041;
            }
        L_0x0041:
            com.google.common.f.e r9 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35866w.f93973a
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            r0 = 51914(0xcaca, float:7.2747E-41)
            com.google.common.f.x r9 = r9.mo56372aa(r0)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            int r0 = r2.f136757c
            int r0 = com.google.assistant.p3897e.p3921j.C52112fr.m86508b(r0)
            if (r0 != 0) goto L_0x00d6
            goto L_0x00d7
        L_0x005c:
            r9 = r3 & 32
            if (r9 == 0) goto L_0x0062
            goto L_0x0127
        L_0x0062:
            int r9 = com.google.assistant.p3897e.p3921j.C52112fr.m86508b(r5)
            if (r9 != 0) goto L_0x0069
            r9 = 1
        L_0x0069:
            int r0 = r2.f136759e
            int r0 = com.google.assistant.p3897e.p3921j.C52114ft.m86509a(r0)
            if (r0 != 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r7 = r0
        L_0x0073:
            double r2 = r2.f136758d
            boolean r4 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35866w.m64266d(r1, r9, r7, r2)
            goto L_0x0127
        L_0x007b:
            androidx.slice.Slice r9 = r1.f93925f
            if (r9 != 0) goto L_0x0081
            goto L_0x0127
        L_0x0081:
            android.content.Context r0 = r1.f93921b
            androidx.slice.i r2 = new androidx.slice.i
            r2.<init>(r0, r9)
            java.util.List r9 = r2.mo8619h()
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0094
            goto L_0x0127
        L_0x0094:
            java.lang.Object r9 = r9.get(r4)
            androidx.slice.a.a r9 = (androidx.slice.p194a.C4094a) r9
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            boolean r2 = r9.f13111f
            java.lang.String r3 = "android.app.slice.extra.TOGGLE_STATE"
            r2 = r2 ^ r7
            android.content.Intent r0 = r0.putExtra(r3, r2)
            android.app.PendingIntent r9 = r9.mo8605b()
            boolean r4 = r1.mo39865c(r9, r0)
            goto L_0x0127
        L_0x00b2:
            com.google.common.b.ij r2 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35787a.f93745a
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L_0x00bd
            r2 = -100
            goto L_0x00cc
        L_0x00bd:
            boolean r4 = r1.mo39866d(r4)
            goto L_0x0127
        L_0x00c2:
            com.google.common.b.ij r2 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35787a.f93745a
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L_0x00d1
            r2 = 100
        L_0x00cc:
            boolean r4 = r9.mo39874c(r1, r0, r2)
            goto L_0x0127
        L_0x00d1:
            boolean r4 = r1.mo39866d(r7)
            goto L_0x0127
        L_0x00d6:
            r7 = r0
        L_0x00d7:
            java.lang.String r0 = "Unsupported change type %s"
            java.lang.String r2 = com.google.assistant.p3897e.p3921j.C52112fr.m86507a(r7)
            r9.mo56389s(r0, r2)
            goto L_0x0127
        L_0x00e1:
            com.google.common.f.e r9 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35866w.f93973a
            com.google.common.f.x r9 = r9.mo56224b()
            java.lang.String r0 = "no change provided in the args."
            r2 = 51916(0xcacc, float:7.275E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r2)).mo56386p(r0)
            androidx.slice.Slice r9 = r1.f93925f
            if (r9 != 0) goto L_0x00f4
            goto L_0x0127
        L_0x00f4:
            android.content.Context r0 = r1.f93921b
            androidx.slice.i r2 = new androidx.slice.i
            r2.<init>(r0, r9)
            androidx.slice.a.a r9 = r2.f13140f
            if (r9 != 0) goto L_0x0100
            goto L_0x0127
        L_0x0100:
            android.app.PendingIntent r9 = r9.mo8605b()
            r0 = 0
            boolean r4 = r1.mo39865c(r9, r0)
            goto L_0x0127
        L_0x010a:
            com.google.common.f.e r9 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35866w.f93973a
            com.google.common.f.x r9 = r9.mo56226d()
            java.lang.String r0 = "args or slice writer is null, skip modify slice setting."
            r2 = 51913(0xcac9, float:7.2746E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r2)).mo56386p(r0)
            goto L_0x0127
        L_0x0119:
            com.google.common.f.e r9 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35830as.f93893a
            com.google.common.f.x r9 = r9.mo56226d()
            java.lang.String r0 = "Failed to load slice for setting %s."
            r2 = 51952(0xcaf0, float:7.28E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r2)).mo56389s(r0, r3)
        L_0x0127:
            r1.mo39863a()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35828aq.apply(java.lang.Object):java.lang.Object");
    }
}
