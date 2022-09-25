package com.google.android.apps.gsa.shared.notificationlistening.collection;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.i */
/* compiled from: PG */
public final class C90402i extends C90399f {
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo84092d(android.content.Context r8, com.google.android.apps.gsa.shared.bisto.C89656k r9, com.google.android.libraries.p1730f.C21370a r10, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af r11, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90381o r12, com.google.common.p4552o.C60242lp r13, boolean r14) {
        /*
            r7 = this;
            android.service.notification.StatusBarNotification r0 = r11.f252393a
            android.app.Notification r1 = r0.getNotification()
            r2 = 0
            if (r1 != 0) goto L_0x000c
        L_0x0009:
            r5 = r2
            goto L_0x00a0
        L_0x000c:
            android.app.Notification r1 = r0.getNotification()
            android.os.Bundle r1 = r1.extras
            java.lang.String r3 = "android.subText"
            java.lang.CharSequence r1 = r1.getCharSequence(r3)
            java.lang.String r1 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.m146997d(r1)
            if (r1 == 0) goto L_0x0009
            java.lang.String r3 = r1.toString()
            boolean r3 = com.google.common.base.C58837ba.m90859h(r3)
            if (r3 == 0) goto L_0x0029
            goto L_0x0009
        L_0x0029:
            android.app.Notification r3 = r0.getNotification()
            java.lang.CharSequence r3 = r3.tickerText
            if (r3 != 0) goto L_0x003b
            if (r12 == 0) goto L_0x003b
            long r3 = r0.getPostTime()
            java.lang.CharSequence r3 = r12.mo84081a(r3)
        L_0x003b:
            if (r3 != 0) goto L_0x003e
            goto L_0x0009
        L_0x003e:
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = " : "
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            r5 = 2
            if (r4 == r5) goto L_0x004d
            goto L_0x0009
        L_0x004d:
            r4 = 0
            r4 = r3[r4]
            java.lang.String r4 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.m146997d(r4)
            r5 = 1
            r3 = r3[r5]
            java.lang.String r3 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.m146997d(r3)
            boolean r5 = com.google.common.base.C58837ba.m90859h(r4)
            if (r5 != 0) goto L_0x0009
            boolean r5 = com.google.common.base.C58837ba.m90859h(r3)
            if (r5 == 0) goto L_0x0068
            goto L_0x0009
        L_0x0068:
            android.app.Notification r5 = r0.getNotification()
            android.os.Bundle r5 = r5.extras
            java.lang.String r6 = "android.title"
            java.lang.CharSequence r5 = r5.getCharSequence(r6)
            if (r5 == 0) goto L_0x0009
            java.lang.String r5 = r5.toString()
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x0081
            goto L_0x0009
        L_0x0081:
            android.app.Notification r5 = r0.getNotification()
            android.os.Bundle r5 = r5.extras
            java.lang.String r6 = "android.text"
            java.lang.CharSequence r5 = r5.getCharSequence(r6)
            if (r5 == 0) goto L_0x0009
            java.lang.String r5 = r5.toString()
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x009b
            goto L_0x0009
        L_0x009b:
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.u r5 = new com.google.android.apps.gsa.shared.notificationlistening.collection.a.u
            r5.<init>(r1, r4, r3)
        L_0x00a0:
            if (r5 != 0) goto L_0x00a7
            java.util.List r8 = super.mo84092d(r8, r9, r10, r11, r12, r13, r14)
            return r8
        L_0x00a7:
            java.lang.CharSequence r1 = r5.f252441b
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146969h(r8, r1, r14)
            if (r1 != 0) goto L_0x00b8
            java.util.List r8 = super.mo84092d(r8, r9, r10, r11, r12, r13, r14)
            return r8
        L_0x00b8:
            com.google.android.apps.gsa.shared.notificationlistening.common.j r13 = new com.google.android.apps.gsa.shared.notificationlistening.common.j
            r13.<init>(r10)
            com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146971j(r8, r9, r11, r12, r13)
            java.lang.CharSequence r8 = r5.f252442c
            r13.f252622s = r8
            java.lang.CharSequence r8 = r5.f252442c
            if (r8 != 0) goto L_0x00c9
            goto L_0x00cb
        L_0x00c9:
            java.lang.String r2 = "text/plain"
        L_0x00cb:
            r13.f252623t = r2
            java.lang.CharSequence r8 = r5.f252440a
            r13.f252620q = r8
            r13.f252615D = r1
            android.app.Notification r8 = r0.getNotification()
            androidx.core.app.s r8 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146964c(r8)
            r13.mo84160c(r8)
            android.app.Notification r8 = r0.getNotification()
            androidx.core.app.s r8 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146963b(r8)
            r13.mo84159b(r8)
            android.app.Notification r8 = r0.getNotification()
            r13.f252614C = r8
            java.lang.String r8 = "msg"
            r13.f252568e = r8
            java.lang.String r8 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146966e(r0)
            r13.mo84143a(r8, r1)
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r8 = new com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification
            r8.<init>(r13)
            java.util.List r8 = java.util.Collections.singletonList(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.notificationlistening.collection.C90402i.mo84092d(android.content.Context, com.google.android.apps.gsa.shared.bisto.k, com.google.android.libraries.f.a, com.google.android.apps.gsa.shared.notificationlistening.collection.a.af, com.google.android.apps.gsa.shared.notificationlistening.collection.a.o, com.google.common.o.lp, boolean):java.util.List");
    }
}
