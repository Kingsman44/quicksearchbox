package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import com.google.assistant.p3897e.p3921j.C52098fd;
import com.google.common.base.C58817ah;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C35812aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35817af f93822a;

    /* renamed from: b */
    public final /* synthetic */ Set f93823b;

    /* renamed from: c */
    public final /* synthetic */ C52098fd f93824c;

    /* renamed from: d */
    public final /* synthetic */ List f93825d;

    public /* synthetic */ C35812aa(C35817af afVar, Set set, C52098fd fdVar, List list) {
        this.f93822a = afVar;
        this.f93823b = set;
        this.f93824c = fdVar;
        this.f93825d = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r19
            com.google.android.libraries.search.assistant.performer.deviceactions.a.a.af r2 = r1.f93822a
            java.util.Set r0 = r1.f93823b
            com.google.assistant.e.j.fd r3 = r1.f93824c
            java.util.List r4 = r1.f93825d
            r5 = r20
            j$.util.Optional r5 = (p3186j$.util.Optional) r5
            boolean r6 = r5.isPresent()
            java.lang.String r8 = "GetSettingPhoneBuddy"
            if (r6 == 0) goto L_0x011e
            java.lang.Object r6 = r5.get()
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r9 = "noe_battery_usage_names"
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x002a
        L_0x0024:
            r18 = r2
            r16 = r4
            goto L_0x0107
        L_0x002a:
            java.lang.Object r0 = r6.get(r9)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r9 = "noe_battery_usage_percentages"
            java.lang.Object r9 = r6.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = ""
            if (r0 == 0) goto L_0x0100
            if (r9 == 0) goto L_0x0100
            boolean r11 = r0.isEmpty()
            if (r11 != 0) goto L_0x0100
            boolean r11 = r9.isEmpty()
            if (r11 == 0) goto L_0x004c
            goto L_0x0100
        L_0x004c:
            java.lang.String r11 = ","
            java.lang.String[] r0 = r0.split(r11)
            java.util.List r12 = java.util.Arrays.asList(r0)
            java.lang.String[] r0 = r9.split(r11)
            java.util.List r9 = java.util.Arrays.asList(r0)
            int r0 = r12.size()
            int r13 = r9.size()
            if (r0 == r13) goto L_0x006c
            com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35817af.m64225a(r6, r10, r10, r10)
            goto L_0x0024
        L_0x006c:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r7 = 0
        L_0x007c:
            int r0 = r12.size()
            if (r7 >= r0) goto L_0x00e2
            android.content.pm.PackageManager r0 = r2.f93840b     // Catch:{ NameNotFoundException -> 0x00a0 }
            java.lang.Object r16 = r12.get(r7)     // Catch:{ NameNotFoundException -> 0x00a0 }
            r1 = r16
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NameNotFoundException -> 0x00a0 }
            r16 = r4
            r4 = 0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r4)     // Catch:{ NameNotFoundException -> 0x009e }
            android.content.pm.PackageManager r1 = r2.f93840b     // Catch:{ NameNotFoundException -> 0x009e }
            java.lang.CharSequence r0 = r0.loadLabel(r1)     // Catch:{ NameNotFoundException -> 0x009e }
            r18 = r2
            r17 = r8
            goto L_0x00c0
        L_0x009e:
            r0 = move-exception
            goto L_0x00a4
        L_0x00a0:
            r0 = move-exception
            r16 = r4
            r4 = 0
        L_0x00a4:
            com.google.common.f.e r1 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35817af.f93839a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r4, r8)
            java.lang.Object r4 = r12.get(r7)
            r17 = r8
            r8 = 51934(0xcade, float:7.2775E-41)
            r18 = r2
            java.lang.String r2 = "Unable to get app name for package: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r8)).mo56389s(r2, r4)
            r0 = 0
        L_0x00c0:
            if (r0 == 0) goto L_0x00d7
            r13.add(r0)
            java.lang.Object r0 = r12.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            r14.add(r0)
            java.lang.Object r0 = r9.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            r15.add(r0)
        L_0x00d7:
            int r7 = r7 + 1
            r1 = r19
            r4 = r16
            r8 = r17
            r2 = r18
            goto L_0x007c
        L_0x00e2:
            r18 = r2
            r16 = r4
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x00f0
            com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35817af.m64225a(r6, r10, r10, r10)
            goto L_0x0107
        L_0x00f0:
            java.lang.String r0 = android.text.TextUtils.join(r11, r13)
            java.lang.String r1 = android.text.TextUtils.join(r11, r14)
            java.lang.String r2 = android.text.TextUtils.join(r11, r15)
            com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35817af.m64225a(r6, r0, r1, r2)
            goto L_0x0107
        L_0x0100:
            r18 = r2
            r16 = r4
            com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35817af.m64225a(r6, r10, r10, r10)
        L_0x0107:
            java.lang.Object r0 = r5.get()
            java.util.Map r0 = (java.util.Map) r0
            r3.mo53797a(r0)
            r1 = r18
            com.google.android.libraries.search.assistant.performer.deviceactions.c.c r0 = r1.f93843e
            java.lang.String r1 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35845bg.m64244d(r16)
            com.google.net.a.a.b r2 = com.google.net.p4726a.p4727a.C62722b.OK
            r0.mo39894b(r1, r2)
            goto L_0x0143
        L_0x011e:
            r1 = r2
            r16 = r4
            r17 = r8
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35817af.f93839a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3 = r17
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "signalsResult is empty."
            r3 = 51933(0xcadd, float:7.2774E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            com.google.android.libraries.search.assistant.performer.deviceactions.c.c r0 = r1.f93843e
            java.lang.String r1 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35845bg.m64244d(r16)
            com.google.net.a.a.b r2 = com.google.net.p4726a.p4727a.C62722b.UNAVAILABLE
            r0.mo39894b(r1, r2)
        L_0x0143:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35812aa.apply(java.lang.Object):java.lang.Object");
    }
}
