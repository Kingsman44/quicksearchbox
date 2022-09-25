package com.google.android.apps.gsa.staticplugins.p7756cx;

import com.google.android.apps.gsa.sidekick.shared.p7243l.C91757c;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.cx.h */
/* compiled from: PG */
public final /* synthetic */ class C99229h implements C91757c {

    /* renamed from: a */
    public final /* synthetic */ C99233l f277596a;

    /* renamed from: b */
    public final /* synthetic */ Collection f277597b;

    public /* synthetic */ C99229h(C99233l lVar, Collection collection) {
        this.f277596a = lVar;
        this.f277597b = collection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x002a A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo86253a(com.google.android.gms.common.api.C143851w r13) {
        /*
            r12 = this;
            com.google.android.apps.gsa.staticplugins.cx.l r0 = r12.f277596a
            java.util.Collection r1 = r12.f277597b
            com.google.android.libraries.al.a.i r2 = r0.f277608f
            com.google.android.gms.reminders.h r3 = r0.f277609g
            com.google.common.util.concurrent.cx r1 = r2.mo124431b(r3, r13, r1)
            java.lang.Object r1 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r1)
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            if (r1 == 0) goto L_0x00de
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0021
            goto L_0x00de
        L_0x0021:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x002a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00c9
            java.lang.Object r5 = r1.next()
            com.google.android.gms.reminders.model.Task r5 = (com.google.android.gms.reminders.model.Task) r5
            com.google.android.gms.reminders.model.ab r6 = new com.google.android.gms.reminders.model.ab
            r6.<init>(r5)
            r7 = 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
            r6.f394346f = r8
            r6.f394343c = r3
            r6.f394345e = r3
            java.util.Calendar r8 = java.util.Calendar.getInstance()
            com.google.android.gms.reminders.model.DateTime r9 = r5.mo122071h()
            r10 = 0
            if (r9 == 0) goto L_0x006e
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            com.google.android.gms.reminders.model.DateTime r11 = r5.mo122071h()
            java.lang.Boolean r11 = r11.mo121993i()
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x006e
            r9 = 5
            r8.add(r9, r7)
            java.lang.Integer r5 = r5.mo122084z()
            com.google.android.gms.reminders.model.DateTime r5 = com.google.android.libraries.p11024al.p11025a.C147754j.m240813a(r8, r7, r5)
            goto L_0x00b5
        L_0x006e:
            com.google.android.gms.reminders.model.DateTime r9 = r5.mo122071h()
            if (r9 == 0) goto L_0x0086
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            com.google.android.gms.reminders.model.DateTime r11 = r5.mo122071h()
            java.lang.Boolean r11 = r11.mo121994j()
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0086
            r9 = 1
            goto L_0x0087
        L_0x0086:
            r9 = 0
        L_0x0087:
            com.google.android.gms.reminders.model.Location r11 = r5.mo122074k()
            if (r11 != 0) goto L_0x0096
            com.google.android.gms.reminders.model.LocationGroup r11 = r5.mo122075l()
            if (r11 == 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            r11 = 0
            goto L_0x0097
        L_0x0096:
            r11 = 1
        L_0x0097:
            if (r9 != 0) goto L_0x009d
            if (r11 != 0) goto L_0x009c
            goto L_0x00c2
        L_0x009c:
            r11 = 1
        L_0x009d:
            if (r9 == 0) goto L_0x00a4
            r9 = 11
            r8.add(r9, r7)
        L_0x00a4:
            if (r11 == 0) goto L_0x00ad
            r7 = 12
            r9 = 10
            r8.add(r7, r9)
        L_0x00ad:
            java.lang.Integer r5 = r5.mo122084z()
            com.google.android.gms.reminders.model.DateTime r5 = com.google.android.libraries.p11024al.p11025a.C147754j.m240813a(r8, r2, r5)
        L_0x00b5:
            r6.mo122170b(r5)
            r6.mo122171c(r10)
            r6.mo122172d(r10)
            com.google.android.gms.reminders.model.Task r10 = r6.mo122169a()
        L_0x00c2:
            if (r10 == 0) goto L_0x002a
            r4.add(r10)
            goto L_0x002a
        L_0x00c9:
            com.google.android.gms.reminders.h r0 = r0.f277609g
            com.google.android.gms.common.api.z r13 = r0.mo121948a(r13, r4)
            com.google.android.gms.common.api.ad r13 = r13.mo117316a()
            com.google.android.gms.common.api.Status r13 = (com.google.android.gms.common.api.Status) r13
            boolean r13 = r13.mo119097c()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r13)
            goto L_0x00f2
        L_0x00de:
            com.google.common.f.e r13 = com.google.android.apps.gsa.staticplugins.p7756cx.C99233l.f277603a
            com.google.common.f.x r13 = r13.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "GmsRemindersHelper"
            r13.mo56378ag(r0, r1)
            java.lang.String r0 = "No existing reminders found to snooze."
            r1 = 31666(0x7bb2, float:4.4374E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r1)).mo56386p(r0)
        L_0x00f2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7756cx.C99229h.mo86253a(com.google.android.gms.common.api.w):java.lang.Object");
    }
}
