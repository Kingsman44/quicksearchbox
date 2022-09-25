package com.google.android.apps.gsa.shared.notificationlistening.collection;

import android.app.Notification;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.u */
/* compiled from: PG */
public final class C90414u {

    /* renamed from: a */
    public static final C59071e f252506a = C59071e.m91332i("com.google.android.apps.gsa.shared.notificationlistening.collection.u");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification} */
    /* JADX WARNING: type inference failed for: r4v9, types: [com.google.android.apps.gsa.shared.notificationlistening.collection.s, com.google.android.apps.gsa.shared.notificationlistening.collection.a.ad] */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02ed, code lost:
        if (((com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r5).f252535E.toString().equalsIgnoreCase(((com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r6).f252535E.toString()) == false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03ce, code lost:
        if (r3.contains(r31.getPackageName()) == false) goto L_0x03d0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0351 A[Catch:{ m | Exception -> 0x042d }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03e1 A[Catch:{ m | Exception -> 0x0429 }, LOOP:9: B:194:0x03db->B:196:0x03e1, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List m147052a(android.content.Context r28, com.google.android.apps.gsa.shared.bisto.C89656k r29, com.google.android.libraries.p1730f.C21370a r30, java.util.List r31, java.util.List r32, java.util.List r33, boolean r34, java.util.List r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40, boolean r41, int r42, boolean r43, java.util.List r44) {
        /*
            r15 = r28
            r14 = r33
            r13 = r35
            java.lang.String r12 = "NotifProcessUtils"
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r21 = r31.iterator()
            r7 = 0
        L_0x0012:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x048c
            java.lang.Object r0 = r21.next()
            com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper r0 = (com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper) r0
            android.service.notification.StatusBarNotification r6 = r0.f252550a
            r22 = 0
            if (r6 != 0) goto L_0x012e
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.util.List r2 = r0.f252551b
            if (r2 == 0) goto L_0x00f6
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0032
            goto L_0x00f6
        L_0x0032:
            java.lang.String r3 = r0.f252552c
            java.lang.String r4 = "sms"
            boolean r6 = r4.equals(r3)
            if (r6 == 0) goto L_0x003f
            java.lang.String r6 = "SMS"
            goto L_0x004a
        L_0x003f:
            r6 = 2132093336(0x7f152998, float:1.9827094E38)
            java.lang.String r6 = r15.getString(r6)
            java.lang.String r6 = com.google.android.apps.gsa.shared.bisto.p7029b.C89641l.m145913b(r15, r3, r6)
        L_0x004a:
            com.google.android.apps.gsa.shared.notificationlistening.common.d r10 = new com.google.android.apps.gsa.shared.notificationlistening.common.d
            r10.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0053:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x00c1
            java.lang.Object r11 = r2.next()
            com.google.android.apps.gsa.shared.notificationlistening.common.l r11 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90431l) r11
            java.lang.String r5 = r11.f252633d
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x006a
            java.lang.String r5 = r11.f252633d
            goto L_0x006c
        L_0x006a:
            java.lang.String r5 = "text/plain"
        L_0x006c:
            com.google.android.apps.gsa.shared.notificationlistening.common.j r8 = new com.google.android.apps.gsa.shared.notificationlistening.common.j
            r1 = r30
            r8.<init>(r1)
            java.lang.String r1 = r11.f252631b
            r8.f252622s = r1
            r8.f252623t = r5
            java.lang.String r1 = r0.f252555f
            r8.f252620q = r1
            java.lang.String r1 = r11.f252630a
            r8.f252615D = r1
            r5 = r2
            long r1 = r11.f252632c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r8.f252576m = r1
            r8.f252575l = r3
            r6.getClass()
            r8.f252565b = r6
            java.lang.String r1 = "msg"
            r8.f252568e = r1
            java.lang.String r1 = r0.f252553d
            r8.f252573j = r1
            java.lang.String r1 = r11.f252635f
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00a5
            java.lang.String r1 = r11.f252635f
            r8.f252625v = r1
        L_0x00a5:
            android.net.Uri r1 = r11.f252634e
            if (r1 == 0) goto L_0x00ab
            r8.f252624u = r1
        L_0x00ab:
            long r1 = r11.f252636g
            int r11 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r11 <= 0) goto L_0x00b7
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r8.f252578o = r1
        L_0x00b7:
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r1 = new com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification
            r1.<init>(r8)
            r10.mo84150b(r1)
            r2 = r5
            goto L_0x0053
        L_0x00c1:
            com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification r1 = new com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification
            r1.<init>((com.google.android.apps.gsa.shared.notificationlistening.common.C90423d) r10)
            if (r34 == 0) goto L_0x00d1
            if (r13 == 0) goto L_0x00dd
            boolean r2 = r13.contains(r3)
            if (r2 != 0) goto L_0x00da
            goto L_0x00dd
        L_0x00d1:
            if (r14 == 0) goto L_0x00dd
            boolean r2 = r14.contains(r3)
            if (r2 == 0) goto L_0x00da
            goto L_0x00dd
        L_0x00da:
            r17 = 0
            goto L_0x00df
        L_0x00dd:
            r17 = 1
        L_0x00df:
            boolean r2 = r4.equals(r3)
            if (r2 != 0) goto L_0x00e7
            if (r17 == 0) goto L_0x00ee
        L_0x00e7:
            androidx.core.app.s r2 = r0.mo84139b()
            r1.mo84122l(r2)
        L_0x00ee:
            androidx.core.app.s r2 = r0.mo84138a()
            r1.mo84121k(r2)
            goto L_0x00f7
        L_0x00f6:
            r1 = 0
        L_0x00f7:
            long r2 = r0.f252556g
            int r0 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x0128
            if (r1 != 0) goto L_0x0101
            r1 = 0
            goto L_0x0128
        L_0x0101:
            com.google.android.apps.gsa.shared.notificationlistening.common.d r0 = new com.google.android.apps.gsa.shared.notificationlistening.common.d
            r0.<init>()
            com.google.common.b.gu r1 = r1.mo84113d()
            int r4 = r1.size()
            r5 = 0
        L_0x010f:
            if (r5 >= r4) goto L_0x0123
            java.lang.Object r6 = r1.get(r5)
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r6 = (com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r6
            long r10 = r6.f252593n
            int r8 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x0120
            r0.mo84150b(r6)
        L_0x0120:
            int r5 = r5 + 1
            goto L_0x010f
        L_0x0123:
            com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification r1 = new com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification
            r1.<init>((com.google.android.apps.gsa.shared.notificationlistening.common.C90423d) r0)
        L_0x0128:
            if (r1 == 0) goto L_0x0165
            r9.add(r1)
            goto L_0x0165
        L_0x012e:
            android.app.Notification r1 = r6.getNotification()
            if (r1 == 0) goto L_0x0158
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L_0x0158
            android.app.Notification r1 = r6.getNotification()
            int r1 = r1.flags
            r2 = 4096(0x1000, float:5.74E-42)
            r1 = r1 & r2
            if (r1 != r2) goto L_0x0158
            android.app.Notification r1 = r6.getNotification()
            android.app.Notification$BubbleMetadata r1 = r1.getBubbleMetadata()
            if (r1 == 0) goto L_0x0158
            boolean r1 = r1.isNotificationSuppressed()
            if (r1 == 0) goto L_0x0158
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0165
        L_0x0158:
            if (r7 == 0) goto L_0x016f
            java.lang.String r1 = r6.getPackageName()
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0165
            goto L_0x016f
        L_0x0165:
            r24 = r7
            r2 = r9
            r4 = r12
            r1 = r13
            r3 = r14
            r25 = 0
            goto L_0x043d
        L_0x016f:
            android.app.Notification r1 = r6.getNotification()
            if (r1 == 0) goto L_0x017f
            android.app.Notification r1 = r6.getNotification()
            int r1 = r1.flags
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 != 0) goto L_0x0165
        L_0x017f:
            boolean r1 = m147055d(r6)     // Catch:{ Exception -> 0x0463, m -> 0x0461 }
            if (r1 != 0) goto L_0x0198
            com.google.common.f.e r1 = f252506a     // Catch:{ Exception -> 0x0463, m -> 0x0461 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ Exception -> 0x0463, m -> 0x0461 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x0463, m -> 0x0461 }
            r1.mo56378ag(r2, r12)     // Catch:{ Exception -> 0x0463, m -> 0x0461 }
            java.lang.String r2 = "Not handling notification."
            r3 = 10835(0x2a53, float:1.5183E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ Exception -> 0x0463, m -> 0x0461 }
            goto L_0x01a7
        L_0x0198:
            android.app.Notification r1 = r6.getNotification()     // Catch:{ Exception -> 0x0463, m -> 0x0461 }
            m147053b(r1)     // Catch:{ Exception -> 0x0463, m -> 0x0461 }
            boolean r1 = m147054c(r15, r6)     // Catch:{ Exception -> 0x0463, m -> 0x0461 }
            if (r1 == 0) goto L_0x01b4
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x0463, m -> 0x0461 }
        L_0x01a7:
            r31 = r6
            r24 = r7
            r26 = r9
            r4 = r12
            r2 = 0
            r8 = 0
            r25 = 0
            goto L_0x034f
        L_0x01b4:
            com.google.android.apps.gsa.shared.notificationlistening.collection.s r4 = com.google.android.apps.gsa.shared.notificationlistening.collection.C90412s.f252505a     // Catch:{ Exception -> 0x0463, m -> 0x0461 }
            r1 = 1
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.af[] r1 = new com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af[r1]     // Catch:{ Exception -> 0x0463, m -> 0x0461 }
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.af r2 = new com.google.android.apps.gsa.shared.notificationlistening.collection.a.af     // Catch:{ Exception -> 0x0463, m -> 0x0461 }
            r8 = 0
            r2.<init>(r6, r8, r8)     // Catch:{ Exception -> 0x0455, m -> 0x0453 }
            r5 = 0
            r1[r5] = r2     // Catch:{ Exception -> 0x0455, m -> 0x0453 }
            java.util.List r16 = java.util.Arrays.asList(r1)     // Catch:{ Exception -> 0x0455, m -> 0x0453 }
            r10 = 0
            r11 = 0
            r1 = r28
            r2 = r29
            r3 = r30
            r5 = r16
            r31 = r6
            r6 = r32
            r24 = r7
            r7 = r33
            r25 = r8
            r8 = r34
            r26 = r9
            r9 = r35
            r27 = r12
            r12 = r36
            r13 = r37
            r14 = r38
            r15 = r39
            r16 = r40
            r17 = r41
            r18 = r42
            r19 = r43
            r20 = r44
            java.util.List r1 = com.google.android.apps.gsa.shared.notificationlistening.collection.C90409p.m147040a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0449, m -> 0x0447 }
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x0449, m -> 0x0447 }
            if (r2 != 0) goto L_0x029d
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch:{ Exception -> 0x0298, m -> 0x0296 }
            com.google.android.apps.gsa.shared.notificationlistening.common.b r3 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r3     // Catch:{ Exception -> 0x0298, m -> 0x0296 }
            java.lang.String r3 = r3.f252589j     // Catch:{ Exception -> 0x0298, m -> 0x0296 }
            boolean r3 = com.google.android.apps.gsa.shared.notificationlistening.collection.C90394ab.m147004b(r3)     // Catch:{ Exception -> 0x0298, m -> 0x0296 }
            if (r3 == 0) goto L_0x0293
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x0298, m -> 0x0296 }
            r3.<init>()     // Catch:{ Exception -> 0x0298, m -> 0x0296 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0298, m -> 0x0296 }
        L_0x0216:
            boolean r4 = r1.hasNext()     // Catch:{ Exception -> 0x0298, m -> 0x0296 }
            if (r4 == 0) goto L_0x026a
            java.lang.Object r4 = r1.next()     // Catch:{ Exception -> 0x0298, m -> 0x0296 }
            com.google.android.apps.gsa.shared.notificationlistening.common.b r4 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r4     // Catch:{ Exception -> 0x0298, m -> 0x0296 }
            boolean r5 = r4 instanceof com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification     // Catch:{ Exception -> 0x0298, m -> 0x0296 }
            if (r5 == 0) goto L_0x024e
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r4 = (com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r4     // Catch:{ Exception -> 0x0449, m -> 0x0447 }
            java.lang.String r5 = r4.f252589j     // Catch:{ Exception -> 0x0449, m -> 0x0447 }
            long r5 = com.google.android.apps.gsa.shared.notificationlistening.collection.C90394ab.m147003a(r5)     // Catch:{ Exception -> 0x0449, m -> 0x0447 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0449, m -> 0x0447 }
            boolean r6 = r3.containsKey(r5)     // Catch:{ Exception -> 0x0449, m -> 0x0447 }
            if (r6 == 0) goto L_0x023f
            java.lang.Object r5 = r3.get(r5)     // Catch:{ Exception -> 0x0449, m -> 0x0447 }
            com.google.android.apps.gsa.shared.notificationlistening.common.d r5 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90423d) r5     // Catch:{ Exception -> 0x0449, m -> 0x0447 }
            goto L_0x0248
        L_0x023f:
            com.google.android.apps.gsa.shared.notificationlistening.common.d r6 = new com.google.android.apps.gsa.shared.notificationlistening.common.d     // Catch:{ Exception -> 0x0449, m -> 0x0447 }
            r6.<init>()     // Catch:{ Exception -> 0x0449, m -> 0x0447 }
            r3.put(r5, r6)     // Catch:{ Exception -> 0x0449, m -> 0x0447 }
            r5 = r6
        L_0x0248:
            if (r5 == 0) goto L_0x0216
            r5.mo84150b(r4)     // Catch:{ Exception -> 0x0449, m -> 0x0447 }
            goto L_0x0216
        L_0x024e:
            com.google.common.f.e r0 = f252506a     // Catch:{ Exception -> 0x0298, m -> 0x0296 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ Exception -> 0x0298, m -> 0x0296 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x0298, m -> 0x0296 }
            r4 = r27
            r0.mo56378ag(r1, r4)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            java.lang.String r1 = "bundleSmsNotifications should only receive MessageNotifications"
            r2 = 10833(0x2a51, float:1.518E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            java.lang.String r1 = "SMS notification is not a MessageNotification"
            r0.<init>(r1)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            throw r0     // Catch:{ Exception -> 0x042f, m -> 0x042d }
        L_0x026a:
            r4 = r27
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r8.<init>()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            java.util.Collection r1 = r3.values()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
        L_0x0279:
            boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            if (r3 == 0) goto L_0x028e
            java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            com.google.android.apps.gsa.shared.notificationlistening.common.d r3 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90423d) r3     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification r5 = new com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r5.<init>((com.google.android.apps.gsa.shared.notificationlistening.common.C90423d) r3)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r8.add(r5)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            goto L_0x0279
        L_0x028e:
            java.util.Collections.reverse(r8)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            goto L_0x034f
        L_0x0293:
            r4 = r27
            goto L_0x02a0
        L_0x0296:
            r0 = move-exception
            goto L_0x0299
        L_0x0298:
            r0 = move-exception
        L_0x0299:
            r4 = r27
            goto L_0x0430
        L_0x029d:
            r4 = r27
            r2 = 0
        L_0x02a0:
            java.lang.String r3 = r31.getPackageName()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            java.lang.String r5 = "com.verizon.messaging.vzmsgs"
            boolean r3 = com.google.common.base.C58890d.m90990e(r3, r5)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            if (r3 == 0) goto L_0x031d
            java.util.Collections.reverse(r1)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            com.google.android.apps.gsa.shared.notificationlistening.collection.t r3 = new com.google.android.apps.gsa.shared.notificationlistening.collection.t     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r3.<init>()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            java.util.Collections.sort(r1, r3)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            com.google.android.apps.gsa.shared.notificationlistening.common.d r3 = new com.google.android.apps.gsa.shared.notificationlistening.common.d     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r3.<init>()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r8.<init>()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r5 = r25
        L_0x02c7:
            boolean r6 = r1.hasNext()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            if (r6 == 0) goto L_0x030e
            java.lang.Object r6 = r1.next()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            com.google.android.apps.gsa.shared.notificationlistening.common.b r6 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r6     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            if (r5 == 0) goto L_0x02ef
            if (r6 != 0) goto L_0x02d8
            goto L_0x02ef
        L_0x02d8:
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r5 = (com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r5     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            java.lang.CharSequence r5 = r5.f252535E     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r7 = r6
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r7 = (com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r7     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            java.lang.CharSequence r7 = r7.f252535E     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            boolean r5 = r5.equalsIgnoreCase(r7)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            if (r5 != 0) goto L_0x0302
        L_0x02ef:
            boolean r5 = r3.mo84149a()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            if (r5 != 0) goto L_0x02fd
            com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification r5 = new com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r5.<init>((com.google.android.apps.gsa.shared.notificationlistening.common.C90423d) r3)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r8.add(r5)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
        L_0x02fd:
            com.google.android.apps.gsa.shared.notificationlistening.common.d r3 = new com.google.android.apps.gsa.shared.notificationlistening.common.d     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r3.<init>()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
        L_0x0302:
            boolean r5 = r6 instanceof com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            if (r5 == 0) goto L_0x030c
            r5 = r6
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r5 = (com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r5     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r3.mo84150b(r5)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
        L_0x030c:
            r5 = r6
            goto L_0x02c7
        L_0x030e:
            boolean r1 = r3.mo84149a()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            if (r1 != 0) goto L_0x034f
            com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification r1 = new com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r1.<init>((com.google.android.apps.gsa.shared.notificationlistening.common.C90423d) r3)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r8.add(r1)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            goto L_0x034f
        L_0x031d:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r8.<init>()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            com.google.android.apps.gsa.shared.notificationlistening.common.d r3 = new com.google.android.apps.gsa.shared.notificationlistening.common.d     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r3.<init>()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
        L_0x032b:
            boolean r5 = r1.hasNext()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            if (r5 == 0) goto L_0x0341
            java.lang.Object r5 = r1.next()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            com.google.android.apps.gsa.shared.notificationlistening.common.b r5 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r5     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            boolean r6 = r5 instanceof com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            if (r6 == 0) goto L_0x032b
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r5 = (com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r5     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r3.mo84150b(r5)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            goto L_0x032b
        L_0x0341:
            boolean r1 = r3.mo84149a()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            if (r1 != 0) goto L_0x034f
            com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification r1 = new com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r1.<init>((com.google.android.apps.gsa.shared.notificationlistening.common.C90423d) r3)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r8.add(r1)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
        L_0x034f:
            if (r8 == 0) goto L_0x0437
            long r5 = r0.f252556g     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            int r1 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r1 <= 0) goto L_0x0398
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r1.<init>()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            java.util.Iterator r3 = r8.iterator()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
        L_0x0360:
            boolean r7 = r3.hasNext()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            if (r7 == 0) goto L_0x0397
            java.lang.Object r7 = r3.next()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification r7 = (com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification) r7     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            com.google.android.apps.gsa.shared.notificationlistening.common.d r8 = new com.google.android.apps.gsa.shared.notificationlistening.common.d     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r8.<init>()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            com.google.common.b.gu r7 = r7.mo84113d()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            int r9 = r7.size()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r10 = 0
        L_0x037a:
            if (r10 >= r9) goto L_0x038e
            java.lang.Object r11 = r7.get(r10)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r11 = (com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r11     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            long r12 = r11.f252593n     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x038b
            r8.mo84150b(r11)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
        L_0x038b:
            int r10 = r10 + 1
            goto L_0x037a
        L_0x038e:
            com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification r7 = new com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r7.<init>((com.google.android.apps.gsa.shared.notificationlistening.common.C90423d) r8)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            r1.add(r7)     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            goto L_0x0360
        L_0x0397:
            r8 = r1
        L_0x0398:
            boolean r1 = r8.isEmpty()     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            if (r1 != 0) goto L_0x0437
            boolean r1 = r0.f252554e     // Catch:{ Exception -> 0x042f, m -> 0x042d }
            if (r1 == 0) goto L_0x03f2
            if (r34 == 0) goto L_0x03c0
            r1 = r35
            if (r1 == 0) goto L_0x03bd
            java.lang.String r3 = r31.getPackageName()     // Catch:{ Exception -> 0x03b8, m -> 0x03b6 }
            boolean r3 = r1.contains(r3)     // Catch:{ Exception -> 0x03b8, m -> 0x03b6 }
            if (r3 != 0) goto L_0x03b3
            goto L_0x03bd
        L_0x03b3:
            r3 = r33
            goto L_0x03d0
        L_0x03b6:
            r0 = move-exception
            goto L_0x03b9
        L_0x03b8:
            r0 = move-exception
        L_0x03b9:
            r3 = r33
            goto L_0x0434
        L_0x03bd:
            r3 = r33
            goto L_0x03d3
        L_0x03c0:
            r3 = r33
            r1 = r35
            if (r3 == 0) goto L_0x03d3
            java.lang.String r5 = r31.getPackageName()     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
            boolean r5 = r3.contains(r5)     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
            if (r5 != 0) goto L_0x03d3
        L_0x03d0:
            r5 = r25
            goto L_0x03d7
        L_0x03d3:
            androidx.core.app.s r5 = r0.mo84139b()     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
        L_0x03d7:
            java.util.Iterator r6 = r8.iterator()     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
        L_0x03db:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
            if (r7 == 0) goto L_0x03f6
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
            com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification r7 = (com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification) r7     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
            r7.mo84122l(r5)     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
            androidx.core.app.s r9 = r0.mo84138a()     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
            r7.mo84121k(r9)     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
            goto L_0x03db
        L_0x03f2:
            r3 = r33
            r1 = r35
        L_0x03f6:
            java.lang.Object r0 = r8.get(r2)     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
            com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification r0 = (com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification) r0     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
            com.google.common.b.gu r0 = r0.mo84113d()     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
            boolean r5 = r0.isEmpty()     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
            if (r5 != 0) goto L_0x041a
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r0 = (com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r0     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
            java.lang.String r0 = r0.f252589j     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
            boolean r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.C90394ab.m147004b(r0)     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
            if (r0 == 0) goto L_0x041a
            java.lang.String r0 = r31.getPackageName()     // Catch:{ Exception -> 0x042b, m -> 0x0429 }
            r7 = r0
            goto L_0x041c
        L_0x041a:
            r7 = r24
        L_0x041c:
            r2 = r26
            r2.addAll(r8)     // Catch:{ Exception -> 0x0426, m -> 0x0423 }
            goto L_0x0484
        L_0x0423:
            r0 = move-exception
            goto L_0x0470
        L_0x0426:
            r0 = move-exception
            goto L_0x0470
        L_0x0429:
            r0 = move-exception
            goto L_0x0434
        L_0x042b:
            r0 = move-exception
            goto L_0x0434
        L_0x042d:
            r0 = move-exception
            goto L_0x0430
        L_0x042f:
            r0 = move-exception
        L_0x0430:
            r3 = r33
            r1 = r35
        L_0x0434:
            r2 = r26
            goto L_0x046e
        L_0x0437:
            r3 = r33
            r1 = r35
            r2 = r26
        L_0x043d:
            r15 = r28
            r13 = r1
            r9 = r2
            r14 = r3
            r12 = r4
            r7 = r24
            goto L_0x0012
        L_0x0447:
            r0 = move-exception
            goto L_0x044a
        L_0x0449:
            r0 = move-exception
        L_0x044a:
            r3 = r33
            r1 = r35
            r2 = r26
            r4 = r27
            goto L_0x046e
        L_0x0453:
            r0 = move-exception
            goto L_0x0456
        L_0x0455:
            r0 = move-exception
        L_0x0456:
            r31 = r6
            r24 = r7
            r25 = r8
            r2 = r9
            r4 = r12
            r1 = r13
            r3 = r14
            goto L_0x046e
        L_0x0461:
            r0 = move-exception
            goto L_0x0464
        L_0x0463:
            r0 = move-exception
        L_0x0464:
            r31 = r6
            r24 = r7
            r2 = r9
            r4 = r12
            r1 = r13
            r3 = r14
            r25 = 0
        L_0x046e:
            r7 = r24
        L_0x0470:
            com.google.common.f.e r5 = f252506a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r4)
            java.lang.String r6 = "Failed to parse notification: %s"
            r8 = 10836(0x2a54, float:1.5184E-41)
            r9 = r31
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r8)).mo56389s(r6, r9)
        L_0x0484:
            r15 = r28
            r13 = r1
            r9 = r2
            r14 = r3
            r12 = r4
            goto L_0x0012
        L_0x048c:
            r2 = r9
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.notificationlistening.collection.C90414u.m147052a(android.content.Context, com.google.android.apps.gsa.shared.bisto.k, com.google.android.libraries.f.a, java.util.List, java.util.List, java.util.List, boolean, java.util.List, boolean, boolean, boolean, boolean, boolean, boolean, int, boolean, java.util.List):java.util.List");
    }

    /* renamed from: b */
    public static void m147053b(Notification notification) {
        notification.bigContentView = null;
        notification.contentView = null;
        notification.headsUpContentView = null;
        notification.tickerView = null;
        notification.audioAttributes = null;
        notification.fullScreenIntent = null;
        notification.contentIntent = null;
        notification.deleteIntent = null;
        notification.extras.remove("android.largeIcon");
        notification.extras.remove("android.largeIcon.big");
    }

    /* renamed from: c */
    public static boolean m147054c(Context context, StatusBarNotification statusBarNotification) {
        if (context.getPackageName().equals(statusBarNotification.getPackageName())) {
            return false;
        }
        if ("call".equals(statusBarNotification.getNotification().category) || "event".equals(statusBarNotification.getNotification().category)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m147055d(StatusBarNotification statusBarNotification) {
        return (statusBarNotification == null || statusBarNotification.getNotification() == null || C58837ba.m90859h(statusBarNotification.getPackageName())) ? false : true;
    }
}
