package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.gsa.nga.engine.am.h.cu;
import com.google.android.apps.gsa.nga.engine.p5900ag.C74820be;
import com.google.android.apps.gsa.nga.engine.warmactions.call.p6251a.C79499b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.au */
/* compiled from: PG */
final class C79425au implements C79421aq {

    /* renamed from: a */
    public static final C58974d f218078a = C58974d.m91136j();

    /* renamed from: c */
    private static final C58528ij f218079c = C58528ij.m90011K(C79570b.ALARM, C79570b.TIMER);

    /* renamed from: d */
    private static final C58528ij f218080d = C58528ij.m90014N(C79570b.CALL, C79570b.CALL_CONTACT, C79570b.CALL_NUMBER, C79570b.CALL_CONTACT_V2, C79570b.CALL_NUMBER_V2);

    /* renamed from: e */
    private static final C58528ij f218081e = C58528ij.m90011K(C79570b.CALL_CONTACT, C79570b.CALL_CONTACT_V2);

    /* renamed from: b */
    public final cu f218082b;

    /* renamed from: f */
    private final Context f218083f;

    /* renamed from: g */
    private final NotificationManager f218084g;

    /* renamed from: h */
    private final C79499b f218085h;

    /* renamed from: i */
    private final BroadcastReceiver f218086i;

    /* renamed from: j */
    private final AtomicInteger f218087j = new AtomicInteger(1);

    /* renamed from: k */
    private final AtomicReference f218088k = new AtomicReference(new NotificationManager.Policy(0, 0, 0, 0));

    /* renamed from: l */
    private final C74820be f218089l;

    public C79425au(Context context, NotificationManager notificationManager, C74820be beVar, cu cuVar, C79499b bVar) {
        this.f218083f = context;
        this.f218084g = notificationManager;
        this.f218089l = beVar;
        this.f218082b = cuVar;
        this.f218085h = bVar;
        this.f218086i = new C79424at(this);
    }

    /* renamed from: a */
    public final void mo74044a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.app.action.INTERRUPTION_FILTER_CHANGED");
        intentFilter.addAction("android.app.action.NOTIFICATION_POLICY_CHANGED");
        this.f218083f.registerReceiver(this.f218086i, intentFilter);
        mo74049e();
    }

    /* renamed from: b */
    public final void mo74045b() {
        this.f218083f.unregisterReceiver(this.f218086i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008f, code lost:
        if (((java.lang.Integer) r6.f218085h.mo74100d().map(new com.google.android.apps.gsa.nga.engine.warmactions.p6248a.C79422ar(r6)).map(com.google.android.apps.gsa.nga.engine.warmactions.p6248a.C79423as.f218076a).orElse(0)).intValue() > 0) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        if (f218081e.contains(r7) != false) goto L_0x00b6;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo74046c(com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a.C128461e r7) {
        /*
            r6 = this;
            com.google.android.apps.search.assistant.surfaces.voice.o.a.d r0 = r7.mo108450d()
            com.google.android.apps.search.assistant.surfaces.voice.o.a.d r1 = com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a.C128460d.START
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f218087j
            int r0 = r0.get()
            r2 = 4
            r3 = 2
            r4 = 1
            if (r0 == r3) goto L_0x002e
            r3 = 3
            if (r0 == r3) goto L_0x002d
            if (r0 == r2) goto L_0x001f
            return r1
        L_0x001f:
            com.google.common.b.ij r0 = f218079c
            com.google.android.apps.gsa.nga.engine.warmactions.g.b r7 = r7.mo108448b()
            boolean r7 = r0.contains(r7)
            if (r7 != 0) goto L_0x002c
            return r4
        L_0x002c:
            return r1
        L_0x002d:
            return r4
        L_0x002e:
            java.util.concurrent.atomic.AtomicReference r0 = r6.f218088k
            java.lang.Object r0 = r0.get()
            android.app.NotificationManager$Policy r0 = (android.app.NotificationManager.Policy) r0
            com.google.android.apps.gsa.nga.engine.warmactions.g.b r7 = r7.mo108448b()
            com.google.common.b.ij r5 = f218079c
            boolean r5 = r5.contains(r7)
            if (r5 == 0) goto L_0x0048
            int r5 = r0.priorityCategories
            r5 = r5 & 32
            if (r5 != 0) goto L_0x00b6
        L_0x0048:
            com.google.common.b.ij r5 = f218080d
            boolean r5 = r5.contains(r7)
            if (r5 == 0) goto L_0x009b
            int r5 = r0.priorityCategories
            r5 = r5 & 8
            if (r5 == 0) goto L_0x009b
            int r5 = r0.priorityCallSenders
            if (r5 == 0) goto L_0x00b6
            if (r5 == r4) goto L_0x0092
            if (r5 == r3) goto L_0x006c
            com.google.common.f.a.d r7 = f218078a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r3 = "Wrong priority call senders value in the notification policy."
            r5 = 5651(0x1613, float:7.919E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r7).mo56372aa(r5)).mo56386p(r3)
            goto L_0x009b
        L_0x006c:
            com.google.android.apps.gsa.nga.engine.warmactions.call.a.b r7 = r6.f218085h
            j$.util.Optional r7 = r7.mo74100d()
            com.google.android.apps.gsa.nga.engine.warmactions.a.ar r3 = new com.google.android.apps.gsa.nga.engine.warmactions.a.ar
            r3.<init>(r6)
            j$.util.Optional r7 = r7.map(r3)
            com.google.android.apps.gsa.nga.engine.warmactions.a.as r3 = com.google.android.apps.gsa.nga.engine.warmactions.p6248a.C79423as.f218076a
            j$.util.Optional r7 = r7.map(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Object r7 = r7.orElse(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 <= 0) goto L_0x009b
            goto L_0x00b6
        L_0x0092:
            com.google.common.b.ij r3 = f218081e
            boolean r7 = r3.contains(r7)
            if (r7 == 0) goto L_0x009b
            goto L_0x00b6
        L_0x009b:
            com.google.android.apps.gsa.nga.engine.ag.be r7 = r6.f218089l
            boolean r7 = r7.mo71220e()
            if (r7 == 0) goto L_0x00aa
            int r7 = r0.suppressedVisualEffects
            r7 = r7 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x00b6
            return r4
        L_0x00aa:
            int r7 = r0.suppressedVisualEffects
            r7 = r7 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x00b6
            int r7 = r0.suppressedVisualEffects
            r7 = r7 & r2
            if (r7 == 0) goto L_0x00b6
            return r4
        L_0x00b6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.warmactions.p6248a.C79425au.mo74046c(com.google.android.apps.search.assistant.surfaces.voice.o.a.e):boolean");
    }

    /* renamed from: d */
    public final boolean mo74047d() {
        int i = this.f218087j.get();
        return i != 2 ? i == 3 || i == 4 : (((NotificationManager.Policy) this.f218088k.get()).priorityCategories & 64) == 0;
    }

    /* renamed from: e */
    public final void mo74049e() {
        this.f218087j.set(this.f218084g.getCurrentInterruptionFilter());
        this.f218088k.set(this.f218084g.getNotificationPolicy());
    }
}
