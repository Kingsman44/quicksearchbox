package com.google.android.apps.gsa.sidekick.main.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.location.r;
import com.google.android.apps.gsa.location.z;
import com.google.android.apps.gsa.search.core.p6513aj.C84539b;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91376f;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.p489g.p493c.C9129b;
import com.google.android.apps.p489g.p493c.C9133f;
import com.google.android.apps.p489g.p493c.C9135h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7798ki;
import com.google.p375ai.p378b.C7799kj;
import com.google.p375ai.p378b.C7874nd;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.r */
/* compiled from: PG */
public final class C91544r {

    /* renamed from: a */
    public static final C59071e f255331a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.notifications.r");

    /* renamed from: g */
    private static final C91543q f255332g = new C91543q();

    /* renamed from: b */
    public final C91500ao f255333b;

    /* renamed from: c */
    final Context f255334c;

    /* renamed from: d */
    public final C91533g f255335d;

    /* renamed from: e */
    public final C91520be f255336e;

    /* renamed from: f */
    protected final C84539b f255337f;

    /* renamed from: h */
    private final C21370a f255338h;

    /* renamed from: i */
    private final C91376f f255339i;

    /* renamed from: j */
    private final C86127w f255340j;

    public C91544r(C91500ao aoVar, C21370a aVar, C91376f fVar, C86127w wVar, Context context, C91533g gVar, C91520be beVar, C84539b bVar) {
        this.f255333b = aoVar;
        this.f255338h = aVar;
        this.f255339i = fVar;
        this.f255340j = wVar;
        this.f255334c = context;
        this.f255335d = gVar;
        this.f255336e = beVar;
        this.f255337f = bVar;
    }

    /* renamed from: l */
    private final void m149773l(int i, long j) {
        C58976aa aaVar = C58975e.f156826a;
        this.f255337f.mo78252b(i, j, mo85925d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PendingIntent mo85923a() {
        Intent intent = new Intent("com.google.android.apps.sidekick.notifications.NOTIFICATION_EXPIRE_NOTIFICATIONS");
        intent.setClassName(this.f255334c, "com.google.android.apps.gsa.sidekick.main.notifications.NotificationRefreshReceiver");
        return PendingIntent.getBroadcast(this.f255334c, 0, intent, 201326592);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final PendingIntent mo85924c(int i) {
        Intent intent = new Intent("com.google.android.apps.sidekick.notifications.SHOW_NOTIFICATIONS");
        intent.setClassName(this.f255334c, "com.google.android.apps.gsa.sidekick.main.notifications.NotificationRefreshReceiver");
        return PendingIntent.getBroadcast(this.f255334c, i, intent, 201326592);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final PendingIntent mo85925d() {
        Intent intent = new Intent("com.google.android.apps.sidekick.notifications.REFRESH");
        intent.setClassName(this.f255334c, "com.google.android.apps.gsa.sidekick.main.notifications.NotificationRefreshReceiver");
        return PendingIntent.getBroadcast(this.f255334c, 0, intent, 201326592);
    }

    /* renamed from: e */
    public final Set mo85926e(Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C91530d dVar = (C91530d) this.f255335d.mo85797j((C7718hj) it.next());
            if (dVar != null) {
                hashSet.add(Integer.valueOf(dVar.mo85877c()));
            }
        }
        return hashSet;
    }

    /* JADX WARNING: type inference failed for: r11v30, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r8v63, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85927f() {
        /*
            r19 = this;
            r1 = r19
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            com.google.android.apps.gsa.sidekick.main.notifications.ao r2 = r1.f255333b
            com.google.android.libraries.f.a r3 = r2.f255216b
            long r3 = r3.mo26870b()
            com.google.android.apps.gsa.sidekick.main.notifications.af r5 = new com.google.android.apps.gsa.sidekick.main.notifications.af
            r6 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r6
            r5.<init>(r2, r3)
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            com.google.common.b.gu r2 = r2.mo85838b(r5, r3)
            r2.size()
            java.util.Iterator r2 = r2.iterator()
        L_0x0024:
            boolean r3 = r2.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x00e4
            java.lang.Object r3 = r2.next()
            com.google.ai.b.hj r3 = (com.google.p375ai.p378b.C7718hj) r3
            int r8 = r3.f26966g
            com.google.ai.b.ik r8 = com.google.p375ai.p378b.C7746ik.m22834a(r8)
            if (r8 != 0) goto L_0x003c
            com.google.ai.b.ik r8 = com.google.p375ai.p378b.C7746ik.UNKNOWN
        L_0x003c:
            int r8 = r8.f27108J
            java.lang.Object r8 = r0.get(r8)
            if (r8 != 0) goto L_0x0058
            int r8 = r3.f26966g
            com.google.ai.b.ik r8 = com.google.p375ai.p378b.C7746ik.m22834a(r8)
            if (r8 != 0) goto L_0x004e
            com.google.ai.b.ik r8 = com.google.p375ai.p378b.C7746ik.UNKNOWN
        L_0x004e:
            int r8 = r8.f27108J
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0.put(r8, r9)
        L_0x0058:
            int r8 = r3.f26966g
            com.google.ai.b.ik r8 = com.google.p375ai.p378b.C7746ik.m22834a(r8)
            if (r8 != 0) goto L_0x0062
            com.google.ai.b.ik r8 = com.google.p375ai.p378b.C7746ik.UNKNOWN
        L_0x0062:
            int r8 = r8.f27108J
            java.lang.Object r8 = r0.get(r8)
            java.util.List r8 = (java.util.List) r8
            r8.add(r3)
            com.google.android.apps.gsa.sidekick.main.notifications.ao r8 = r1.f255333b
            boolean r9 = r8.mo85848n()
            if (r9 == 0) goto L_0x0024
            java.lang.Object r9 = r8.f255221g
            monitor-enter(r9)
            com.google.android.apps.g.c.b r10 = r8.f255220f     // Catch:{ all -> 0x00e1 }
            com.google.protobuf.bn r10 = r10.toBuilder()     // Catch:{ all -> 0x00e1 }
            com.google.android.apps.g.c.a r10 = (com.google.android.apps.p489g.p493c.C9128a) r10     // Catch:{ all -> 0x00e1 }
            r10.copyOnWrite()     // Catch:{ all -> 0x00e1 }
            com.google.protobuf.bv r11 = r10.instance     // Catch:{ all -> 0x00e1 }
            com.google.android.apps.g.c.b r11 = (com.google.android.apps.p489g.p493c.C9129b) r11     // Catch:{ all -> 0x00e1 }
            com.google.protobuf.cq r12 = com.google.android.apps.p489g.p493c.C9129b.emptyProtobufList()     // Catch:{ all -> 0x00e1 }
            r11.f31419b = r12     // Catch:{ all -> 0x00e1 }
            com.google.android.apps.g.c.b r11 = r8.f255220f     // Catch:{ all -> 0x00e1 }
            com.google.protobuf.cq r11 = r11.f31419b     // Catch:{ all -> 0x00e1 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x00e1 }
        L_0x0095:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x00e1 }
            if (r12 == 0) goto L_0x00d1
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x00e1 }
            com.google.android.apps.g.c.f r12 = (com.google.android.apps.p489g.p493c.C9133f) r12     // Catch:{ all -> 0x00e1 }
            com.google.ai.b.hj r13 = r12.f31432b     // Catch:{ all -> 0x00e1 }
            if (r13 != 0) goto L_0x00a7
            com.google.ai.b.hj r13 = com.google.p375ai.p378b.C7718hj.f26927af     // Catch:{ all -> 0x00e1 }
        L_0x00a7:
            boolean r13 = com.google.android.apps.gsa.sidekick.main.notifications.C91500ao.m149648m(r3, r13)     // Catch:{ all -> 0x00e1 }
            if (r13 == 0) goto L_0x00cd
            com.google.protobuf.bn r5 = r12.toBuilder()     // Catch:{ all -> 0x00e1 }
            com.google.android.apps.g.c.e r5 = (com.google.android.apps.p489g.p493c.C9132e) r5     // Catch:{ all -> 0x00e1 }
            r5.copyOnWrite()     // Catch:{ all -> 0x00e1 }
            com.google.protobuf.bv r12 = r5.instance     // Catch:{ all -> 0x00e1 }
            com.google.android.apps.g.c.f r12 = (com.google.android.apps.p489g.p493c.C9133f) r12     // Catch:{ all -> 0x00e1 }
            int r13 = r12.f31431a     // Catch:{ all -> 0x00e1 }
            r13 = r13 | 4
            r12.f31431a = r13     // Catch:{ all -> 0x00e1 }
            r12.f31434d = r4     // Catch:{ all -> 0x00e1 }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ all -> 0x00e1 }
            com.google.android.apps.g.c.f r5 = (com.google.android.apps.p489g.p493c.C9133f) r5     // Catch:{ all -> 0x00e1 }
            r10.mo17432d(r5)     // Catch:{ all -> 0x00e1 }
            r5 = 1
            goto L_0x0095
        L_0x00cd:
            r10.mo17432d(r12)     // Catch:{ all -> 0x00e1 }
            goto L_0x0095
        L_0x00d1:
            if (r5 == 0) goto L_0x00de
            com.google.protobuf.bv r3 = r10.build()     // Catch:{ all -> 0x00e1 }
            com.google.android.apps.g.c.b r3 = (com.google.android.apps.p489g.p493c.C9129b) r3     // Catch:{ all -> 0x00e1 }
            r8.f255220f = r3     // Catch:{ all -> 0x00e1 }
            r8.mo85842g()     // Catch:{ all -> 0x00e1 }
        L_0x00de:
            monitor-exit(r9)     // Catch:{ all -> 0x00e1 }
            goto L_0x0024
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00e1 }
            throw r0
        L_0x00e4:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 43
            java.lang.Object r8 = r0.get(r3)
            java.util.Collection r8 = (java.util.Collection) r8
            if (r8 == 0) goto L_0x01e1
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto L_0x01e1
            com.google.android.libraries.f.a r10 = r1.f255338h
            long r10 = r10.mo26870b()
            long r10 = r10 / r6
            java.util.Iterator r8 = r8.iterator()
            r12 = 0
        L_0x0105:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x0158
            java.lang.Object r13 = r8.next()
            com.google.ai.b.hj r13 = (com.google.p375ai.p378b.C7718hj) r13
            com.google.ai.b.pw r14 = r13.f26979t
            if (r14 != 0) goto L_0x0117
            com.google.ai.b.pw r14 = com.google.p375ai.p378b.C7947pw.f27896j
        L_0x0117:
            int r14 = r14.f27898a
            r14 = r14 & 8
            if (r14 == 0) goto L_0x0155
            com.google.ai.b.pw r14 = r13.f26979t
            if (r14 != 0) goto L_0x0123
            com.google.ai.b.pw r14 = com.google.p375ai.p378b.C7947pw.f27896j
        L_0x0123:
            long r14 = r14.f27902e
            long r14 = r10 - r14
            r16 = 300(0x12c, double:1.48E-321)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x0155
            com.google.common.f.e r12 = f255331a
            com.google.common.f.x r12 = r12.mo56225c()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "NotificationRefreshHlpr"
            r12.mo56378ag(r9, r3)
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            r3 = 11605(0x2d55, float:1.6262E-41)
            com.google.common.f.x r3 = r12.mo56372aa(r3)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.ai.b.pw r9 = r13.f26979t
            if (r9 != 0) goto L_0x014a
            com.google.ai.b.pw r9 = com.google.p375ai.p378b.C7947pw.f27896j
        L_0x014a:
            java.lang.String r12 = "Reminder entry %s notified late by %d seconds."
            java.lang.String r9 = r9.f27899b
            r3.mo56353F(r12, r9, r14)
            r3 = 43
            r12 = 1
            goto L_0x0105
        L_0x0155:
            r3 = 43
            goto L_0x0105
        L_0x0158:
            if (r12 == 0) goto L_0x0192
            com.google.android.apps.gsa.search.core.i.w r3 = r1.f255340j
            com.google.android.apps.gsa.search.core.i.aa r3 = r3.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r3 = r3.mo79722a()
            java.lang.String r8 = "NotificationRefreshService_last_refresh_time"
            r9 = 0
            long r11 = r3.getLong(r8, r9)
            int r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x0192
            com.google.android.libraries.f.a r3 = r1.f255338h
            long r8 = r3.mo26870b()
            com.google.common.f.e r3 = f255331a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r13 = "NotificationRefreshHlpr"
            r3.mo56378ag(r10, r13)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r10 = 11604(0x2d54, float:1.626E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r10)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.String r10 = "Last refresh was %d seconds ago."
            long r8 = r8 - r11
            long r8 = r8 / r6
            r3.mo56388r(r10, r8)
        L_0x0192:
            com.google.android.apps.gsa.sidekick.main.notifications.ao r3 = r1.f255333b
            com.google.common.b.gu r3 = r3.mo85837a()
            boolean r6 = r3.isEmpty()
            if (r6 != 0) goto L_0x01ba
            int r6 = r3.size()
            if (r6 <= r4) goto L_0x01ab
            com.google.android.apps.gsa.sidekick.main.notifications.g r6 = r1.f255335d
            com.google.android.apps.gsa.sidekick.main.notifications.d r3 = r6.mo85909c(r3)
            goto L_0x01bb
        L_0x01ab:
            com.google.android.apps.gsa.sidekick.main.notifications.g r6 = r1.f255335d
            java.lang.Object r3 = r3.get(r5)
            com.google.ai.b.hj r3 = (com.google.p375ai.p378b.C7718hj) r3
            java.lang.Object r3 = r6.mo85797j(r3)
            com.google.android.apps.gsa.sidekick.main.notifications.d r3 = (com.google.android.apps.gsa.sidekick.main.notifications.C91530d) r3
            goto L_0x01bb
        L_0x01ba:
            r3 = 0
        L_0x01bb:
            if (r3 == 0) goto L_0x01e1
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r7 = "com.google.android.apps.now.ENTRIES_UPDATED"
            r6.<init>(r7)
            java.lang.String r7 = "type"
            r8 = 12
            android.content.Intent r6 = r6.putExtra(r7, r8)
            android.content.Context r7 = r1.f255334c
            r7.sendBroadcast(r6)
            int r6 = r3.mo85877c()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.put(r6, r3)
            r3 = 43
            r0.remove(r3)
        L_0x01e1:
            r3 = 0
        L_0x01e2:
            int r6 = r0.size()
            if (r3 >= r6) goto L_0x0249
            java.lang.Object r6 = r0.get(r3)
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L_0x01f1
            goto L_0x0249
        L_0x01f1:
            java.util.Iterator r6 = r6.iterator()
        L_0x01f5:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0246
            java.lang.Object r7 = r6.next()
            com.google.ai.b.hj r7 = (com.google.p375ai.p378b.C7718hj) r7
            com.google.android.apps.gsa.sidekick.main.notifications.g r8 = r1.f255335d
            java.lang.Object r8 = r8.mo85797j(r7)
            com.google.android.apps.gsa.sidekick.main.notifications.d r8 = (com.google.android.apps.gsa.sidekick.main.notifications.C91530d) r8
            if (r8 == 0) goto L_0x021d
            int r7 = r8.mo85877c()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r9 = r2.containsKey(r7)
            if (r9 != 0) goto L_0x01f5
            r2.put(r7, r8)
            goto L_0x01f5
        L_0x021d:
            com.google.common.f.e r8 = f255331a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r10 = "NotificationRefreshHlpr"
            r8.mo56378ag(r9, r10)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            r9 = 11603(0x2d53, float:1.6259E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r9)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            int r7 = r7.f26966g
            com.google.ai.b.ik r7 = com.google.p375ai.p378b.C7746ik.m22834a(r7)
            if (r7 != 0) goto L_0x023e
            com.google.ai.b.ik r7 = com.google.p375ai.p378b.C7746ik.UNKNOWN
        L_0x023e:
            java.lang.String r9 = "Failed to get an EntryNotification for entry of type %d"
            int r7 = r7.f27108J
            r8.mo56387q(r9, r7)
            goto L_0x01f5
        L_0x0246:
            int r3 = r3 + 1
            goto L_0x01e2
        L_0x0249:
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0251:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0514
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            com.google.android.apps.gsa.sidekick.main.notifications.d r2 = (com.google.android.apps.gsa.sidekick.main.notifications.C91530d) r2
            com.google.android.apps.gsa.sidekick.main.notifications.be r6 = r1.f255336e
            int r7 = r2.mo85877c()
            android.content.Context r8 = r1.f255334c
            java.util.Collection r9 = r2.mo85892r()
            android.app.PendingIntent r9 = m149772b(r8, r9, r3)
            r10 = 1
            com.google.common.b.hd r11 = com.google.common.p4522b.C58729pv.f156485a
            r8 = r2
            android.app.Notification r3 = r6.mo85860b(r7, r8, r9, r10, r11)
            if (r3 != 0) goto L_0x029c
            com.google.common.f.e r2 = f255331a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "NotificationRefreshHlpr"
            r2.mo56378ag(r3, r6)
            java.lang.String r3 = "createNotification surprisingly returned null"
            r6 = 11622(0x2d66, float:1.6286E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r6)).mo56386p(r3)
            goto L_0x0251
        L_0x029c:
            com.google.android.apps.gsa.sidekick.main.notifications.be r6 = r1.f255336e
            int r7 = r2.mo85877c()
            r6.mo85859a(r7, r3, r2)
            boolean r3 = r2.mo85893s()
            if (r3 == 0) goto L_0x0321
            java.util.Collection r3 = r2.mo85892r()
            java.util.Iterator r3 = r3.iterator()
        L_0x02b3:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0321
            java.lang.Object r6 = r3.next()
            com.google.ai.b.hj r6 = (com.google.p375ai.p378b.C7718hj) r6
            com.google.android.apps.gsa.sidekick.main.notifications.be r7 = r1.f255336e
            com.google.android.apps.gsa.search.core.i.t r8 = r7.f255265h
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90081ef.f249848q
            boolean r8 = r8.mo79746e(r9)
            if (r8 != 0) goto L_0x02b3
            if (r6 == 0) goto L_0x02b3
            com.google.protobuf.cq r8 = r6.f26935G
            java.util.Iterator r8 = r8.iterator()
        L_0x02d3:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x02ee
            java.lang.Object r9 = r8.next()
            com.google.ai.b.h r9 = (com.google.p375ai.p378b.C7708h) r9
            int r10 = r9.f26897b
            com.google.ai.b.g r10 = com.google.p375ai.p378b.C7681g.m22802a(r10)
            if (r10 != 0) goto L_0x02e9
            com.google.ai.b.g r10 = com.google.p375ai.p378b.C7681g.INVALID
        L_0x02e9:
            com.google.ai.b.g r11 = com.google.p375ai.p378b.C7681g.DELIVER_ACTIVE_NOTIFICATION
            if (r10 != r11) goto L_0x02d3
            goto L_0x02ef
        L_0x02ee:
            r9 = 0
        L_0x02ef:
            if (r9 != 0) goto L_0x0312
            com.google.ai.b.h r8 = com.google.p375ai.p378b.C7708h.f26894n
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.ai.b.c r8 = (com.google.p375ai.p378b.C7573c) r8
            com.google.ai.b.g r9 = com.google.p375ai.p378b.C7681g.DELIVER_ACTIVE_NOTIFICATION
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.ai.b.h r10 = (com.google.p375ai.p378b.C7708h) r10
            int r9 = r9.f26835cv
            r10.f26897b = r9
            int r9 = r10.f26896a
            r9 = r9 | r4
            r10.f26896a = r9
            com.google.protobuf.bv r8 = r8.build()
            r9 = r8
            com.google.ai.b.h r9 = (com.google.p375ai.p378b.C7708h) r9
        L_0x0312:
            com.google.android.apps.gsa.sidekick.main.actions.l r8 = new com.google.android.apps.gsa.sidekick.main.actions.l
            com.google.android.apps.gsa.sidekick.main.f.f r10 = r7.f255262e
            com.google.android.libraries.f.a r7 = r7.f255260c
            r8.<init>(r10, r6, r9, r7)
            java.lang.Void[] r6 = new java.lang.Void[r5]
            r8.execute(r6)
            goto L_0x02b3
        L_0x0321:
            com.google.android.apps.gsa.sidekick.main.notifications.be r3 = r1.f255336e
            com.google.common.b.gp r6 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.gp r7 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.gp r8 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.Collection r2 = r2.mo85892r()
            java.util.Iterator r2 = r2.iterator()
        L_0x0337:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x03a6
            java.lang.Object r9 = r2.next()
            com.google.ai.b.hj r9 = (com.google.p375ai.p378b.C7718hj) r9
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a
            r9.getClass()
            android.content.Context r11 = r3.f255259b
            androidx.core.app.aq r12 = new androidx.core.app.aq
            r12.<init>(r11)
            android.app.NotificationManager r11 = r12.f5622a
            boolean r11 = androidx.core.app.C1793aj.m4937b(r11)
            if (r11 == 0) goto L_0x0337
            com.google.protobuf.cq r11 = r9.f26935G
            java.util.Iterator r11 = r11.iterator()
        L_0x035d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0378
            java.lang.Object r12 = r11.next()
            com.google.ai.b.h r12 = (com.google.p375ai.p378b.C7708h) r12
            int r13 = r12.f26897b
            com.google.ai.b.g r13 = com.google.p375ai.p378b.C7681g.m22802a(r13)
            if (r13 != 0) goto L_0x0373
            com.google.ai.b.g r13 = com.google.p375ai.p378b.C7681g.INVALID
        L_0x0373:
            com.google.ai.b.g r14 = com.google.p375ai.p378b.C7681g.DISPLAYED_NOTIFICATION
            if (r13 != r14) goto L_0x035d
            goto L_0x0379
        L_0x0378:
            r12 = 0
        L_0x0379:
            if (r12 != 0) goto L_0x039c
            com.google.ai.b.h r11 = com.google.p375ai.p378b.C7708h.f26894n
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.ai.b.c r11 = (com.google.p375ai.p378b.C7573c) r11
            com.google.ai.b.g r12 = com.google.p375ai.p378b.C7681g.DISPLAYED_NOTIFICATION
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.ai.b.h r13 = (com.google.p375ai.p378b.C7708h) r13
            int r12 = r12.f26835cv
            r13.f26897b = r12
            int r12 = r13.f26896a
            r12 = r12 | r4
            r13.f26896a = r12
            com.google.protobuf.bv r11 = r11.build()
            r12 = r11
            com.google.ai.b.h r12 = (com.google.p375ai.p378b.C7708h) r12
        L_0x039c:
            r6.mo55395g(r12)
            r7.mo55395g(r9)
            r8.mo55395g(r10)
            goto L_0x0337
        L_0x03a6:
            com.google.common.b.gu r2 = r7.mo55394f()
            com.google.common.b.gp r6 = com.google.common.p4522b.C58485gu.m89837e()
            r7 = 0
        L_0x03af:
            r8 = r2
            com.google.common.b.pq r8 = (com.google.common.p4522b.C58724pq) r8
            int r8 = r8.f156474d
            if (r7 >= r8) goto L_0x04e3
            com.google.android.apps.gsa.search.core.i.t r8 = r3.f255265h
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90081ef.f249829B
            boolean r8 = r8.mo79746e(r9)
            if (r8 == 0) goto L_0x04de
            java.lang.Object r8 = r2.get(r7)
            com.google.ai.b.hj r8 = (com.google.p375ai.p378b.C7718hj) r8
            com.google.ai.b.ha r9 = r8.f26972m
            if (r9 != 0) goto L_0x03cc
            com.google.ai.b.ha r9 = com.google.p375ai.p378b.C7709ha.f26910f
        L_0x03cc:
            int r9 = r9.f26912a
            r9 = r9 & 16
            if (r9 == 0) goto L_0x03e3
            com.google.ai.b.ha r8 = r8.f26972m
            if (r8 != 0) goto L_0x03d8
            com.google.ai.b.ha r8 = com.google.p375ai.p378b.C7709ha.f26910f
        L_0x03d8:
            com.google.common.o.l.t r8 = r8.f26916e
            if (r8 != 0) goto L_0x03de
            com.google.common.o.l.t r8 = com.google.common.p4552o.p4566l.C60220t.f162931e
        L_0x03de:
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r8)
            goto L_0x0401
        L_0x03e3:
            com.google.ai.b.ha r8 = r8.f26972m
            if (r8 != 0) goto L_0x03ea
            com.google.ai.b.ha r9 = com.google.p375ai.p378b.C7709ha.f26910f
            goto L_0x03eb
        L_0x03ea:
            r9 = r8
        L_0x03eb:
            int r9 = r9.f26912a
            r9 = r9 & r4
            if (r9 == 0) goto L_0x03ff
            if (r8 != 0) goto L_0x03f4
            com.google.ai.b.ha r8 = com.google.p375ai.p378b.C7709ha.f26910f
        L_0x03f4:
            com.google.common.o.l.t r8 = r8.f26913b
            if (r8 != 0) goto L_0x03fa
            com.google.common.o.l.t r8 = com.google.common.p4552o.p4566l.C60220t.f162931e
        L_0x03fa:
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r8)
            goto L_0x0401
        L_0x03ff:
            com.google.common.base.b r8 = com.google.common.base.C58836b.f156633a
        L_0x0401:
            boolean r9 = r8.mo56113h()
            if (r9 != 0) goto L_0x042c
            com.google.common.f.e r8 = com.google.android.apps.gsa.sidekick.main.notifications.C91520be.f255258a
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r10 = "NowNotificationManager"
            r8.mo56378ag(r9, r10)
            java.lang.String r9 = "Could not find event Id to log notification display action"
            r10 = 11674(0x2d9a, float:1.6359E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r10)).mo56386p(r9)
            com.google.android.apps.gsa.shared.logger.f r8 = r3.f255266i
            r9 = 162829336(0x9b49418, float:4.347269E-33)
            r10 = 29
            r11 = 0
            com.google.android.apps.gsa.shared.logger.e r8 = r8.mo83755a(r11, r9, r10)
            r8.mo83721a()
            goto L_0x04de
        L_0x042c:
            java.lang.Object r8 = r8.mo56107c()
            com.google.common.o.l.t r8 = (com.google.common.p4552o.p4566l.C60220t) r8
            com.google.common.o.uf r9 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.common.o.tz r9 = (com.google.common.p4552o.C60548tz) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.common.o.uf r10 = (com.google.common.p4552o.C60555uf) r10
            int r11 = r10.f164093a
            r11 = r11 | 2
            r10.f164093a = r11
            r11 = 105847(0x19d77, float:1.48323E-40)
            r10.f164258m = r11
            com.google.protos.ai.e.b r10 = com.google.protos.p4816ai.p4835e.C63277b.f171014e
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.protos.ai.e.a r10 = (com.google.protos.p4816ai.p4835e.C63276a) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.protos.ai.e.b r11 = (com.google.protos.p4816ai.p4835e.C63277b) r11
            r8.getClass()
            r11.f171017b = r8
            int r8 = r11.f171016a
            r8 = r8 | r4
            r11.f171016a = r8
            com.google.android.apps.gsa.sidekick.main.notifications.a r8 = new com.google.android.apps.gsa.sidekick.main.notifications.a
            r8.<init>()
            java.lang.Object r11 = r2.get(r7)
            com.google.ai.b.hj r11 = (com.google.p375ai.p378b.C7718hj) r11
            com.google.ai.b.nd r11 = r11.f26938J
            if (r11 != 0) goto L_0x0476
            com.google.ai.b.nd r11 = com.google.p375ai.p378b.C7874nd.f27577J
        L_0x0476:
            com.google.ai.b.fo r11 = r11.f27612x
            if (r11 != 0) goto L_0x047c
            com.google.ai.b.fo r11 = com.google.p375ai.p378b.C7669fo.f26633e
        L_0x047c:
            java.lang.Object r8 = r8.mo56070hd(r11)
            com.google.protos.ai.c.d r8 = (com.google.protos.p4816ai.p4819c.C63208d) r8
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.protos.ai.e.b r11 = (com.google.protos.p4816ai.p4835e.C63277b) r11
            r8.getClass()
            r11.f171018c = r8
            int r8 = r11.f171016a
            r8 = r8 | 2
            r11.f171016a = r8
            com.google.android.apps.gsa.search.core.i.t r8 = r3.f255265h
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90081ef.f249831D
            boolean r8 = r8.mo79746e(r11)
            if (r8 != 0) goto L_0x04aa
            com.google.android.apps.gsa.search.core.i.t r8 = r3.f255265h
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90081ef.f249830C
            boolean r8 = r8.mo79746e(r11)
            if (r8 != 0) goto L_0x04aa
            r8 = 1
            goto L_0x04ab
        L_0x04aa:
            r8 = 0
        L_0x04ab:
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.protos.ai.e.b r11 = (com.google.protos.p4816ai.p4835e.C63277b) r11
            int r12 = r11.f171016a
            r12 = r12 | 4
            r11.f171016a = r12
            r11.f171019d = r8
            com.google.protobuf.bv r8 = r10.build()
            com.google.protos.ai.e.b r8 = (com.google.protos.p4816ai.p4835e.C63277b) r8
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.common.o.uf r10 = (com.google.common.p4552o.C60555uf) r10
            r8.getClass()
            r10.f164207cH = r8
            int r8 = r10.f164255j
            r11 = 1073741824(0x40000000, float:2.0)
            r8 = r8 | r11
            r10.f164255j = r8
            com.google.protobuf.bv r8 = r9.build()
            com.google.common.o.uf r8 = (com.google.common.p4552o.C60555uf) r8
            r9 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r8, r9, r9, r9)
            goto L_0x04df
        L_0x04de:
            r9 = 0
        L_0x04df:
            int r7 = r7 + 1
            goto L_0x03af
        L_0x04e3:
            r9 = 0
            com.google.common.b.gu r2 = r6.mo55394f()
            com.google.common.util.concurrent.cx r2 = com.google.android.apps.gsa.p8883x.C118826c.m197212b(r2)
            com.google.common.util.concurrent.C60856cj.m92910s(r2)
            com.google.android.apps.gsa.sidekick.main.notifications.be r2 = r1.f255336e
            com.google.android.apps.gsa.search.core.i.w r3 = r2.f255263f
            com.google.android.apps.gsa.search.core.i.aa r3 = r3.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r3 = r3.mo79722a()
            com.google.android.apps.gsa.search.core.preferences.u r6 = new com.google.android.apps.gsa.search.core.preferences.u
            com.google.android.apps.gsa.search.core.preferences.z r3 = (com.google.android.apps.gsa.search.core.preferences.C86346z) r3
            r6.<init>(r3)
            java.lang.String r3 = "last_notification_time"
            com.google.android.libraries.f.a r2 = r2.f255260c
            long r7 = r2.mo26870b()
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r6.mo80085k(r3, r2)
            r6.mo80086l(r5)
            goto L_0x0251
        L_0x0514:
            r19.mo85931j()
            com.google.android.apps.gsa.sidekick.main.notifications.ao r0 = r1.f255333b
            com.google.common.base.bh r2 = com.google.common.base.C58844bh.ALWAYS_TRUE
            java.lang.Long r0 = r0.mo85840d(r2)
            com.google.android.apps.gsa.sidekick.main.notifications.ao r2 = r1.f255333b
            com.google.android.apps.gsa.sidekick.main.notifications.ae r3 = new com.google.android.apps.gsa.sidekick.main.notifications.ae
            r3.<init>()
            java.lang.Long r2 = r2.mo85840d(r3)
            com.google.android.libraries.f.a r3 = r1.f255338h
            long r6 = r3.mo26870b()
            android.app.PendingIntent r3 = r1.mo85924c(r4)
            r8 = 5000(0x1388, double:2.4703E-320)
            if (r0 == 0) goto L_0x055a
            if (r2 == 0) goto L_0x055a
            boolean r4 = r0.equals(r2)
            if (r4 != 0) goto L_0x0541
            goto L_0x055a
        L_0x0541:
            long r4 = r2.longValue()
            long r6 = r6 + r8
            long r4 = java.lang.Math.max(r4, r6)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.aj.b r2 = r1.f255337f
            long r4 = r0.longValue()
            r2.mo78254d(r4, r3)
            return
        L_0x055a:
            if (r2 != 0) goto L_0x0564
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.aj.b r2 = r1.f255337f
            r2.mo78251a(r3)
            goto L_0x057d
        L_0x0564:
            long r10 = r2.longValue()
            long r12 = r6 + r8
            long r10 = java.lang.Math.max(r10, r12)
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.aj.b r4 = r1.f255337f
            long r10 = r2.longValue()
            r4.mo78254d(r10, r3)
        L_0x057d:
            android.app.PendingIntent r2 = r1.mo85924c(r5)
            if (r0 != 0) goto L_0x0589
            com.google.android.apps.gsa.search.core.aj.b r0 = r1.f255337f
            r0.mo78251a(r2)
            return
        L_0x0589:
            long r3 = r0.longValue()
            long r6 = r6 + r8
            long r3 = java.lang.Math.max(r3, r6)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            com.google.android.apps.gsa.search.core.aj.b r3 = r1.f255337f
            long r6 = r0.longValue()
            r3.mo78252b(r5, r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.notifications.C91544r.mo85927f():void");
    }

    /* renamed from: g */
    public final void mo85928g(C63088z zVar) {
        C58485gu<C7799kj> guVar;
        C58976aa aaVar = C58975e.f156826a;
        C91500ao aoVar = this.f255333b;
        if (!aoVar.mo85848n()) {
            guVar = C58485gu.m89845m();
        } else if (aoVar.f255220f.f31419b.size() == 0) {
            guVar = C58485gu.m89845m();
        } else {
            HashSet hashSet = new HashSet();
            for (C9133f fVar : aoVar.f255220f.f31419b) {
                C7799kj kjVar = fVar.f31433c;
                if (kjVar == null) {
                    kjVar = C7799kj.f27263h;
                }
                int a = C7798ki.m22853a(kjVar.f27266b);
                if (a != 0 && a == 3) {
                    hashSet.add(kjVar);
                }
            }
            guVar = C58485gu.m89842j(hashSet);
        }
        if (guVar == null || guVar.isEmpty()) {
            z zVar2 = this.f255333b.f255217c.f255232e;
            zVar2.mo84765i(new r(zVar2, C39226b.TAG_CLASSIC_SEARCH_SIDEKICK_LO, C58485gu.m89846n("notification.ttl_geofence_id")), "removeGeofences");
            return;
        }
        ArrayList d = C58597ky.m90213d(guVar.size());
        for (C7799kj anVar : guVar) {
            d.add(new C91499an(anVar, zVar));
        }
        mo85929h(d);
    }

    /* JADX WARNING: type inference failed for: r7v14, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85929h(java.util.List r26) {
        /*
            r25 = this;
            r1 = r25
            if (r26 == 0) goto L_0x04c0
            boolean r0 = r26.isEmpty()
            if (r0 == 0) goto L_0x000c
            goto L_0x04c0
        L_0x000c:
            com.google.android.libraries.f.a r0 = r1.f255338h
            long r2 = r0.mo26870b()
            com.google.ai.b.hl r0 = com.google.p375ai.p378b.C7720hl.f26986e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.ai.b.hk r0 = (com.google.p375ai.p378b.C7719hk) r0
            com.google.ai.b.eo r4 = com.google.p375ai.p378b.C7642eo.NOTIFICATIONS
            com.google.ai.b.qa r4 = com.google.android.apps.gsa.sidekick.shared.p7244m.C91763c.m150327a(r4)
            com.google.protobuf.bn r4 = r4.toBuilder()
            com.google.ai.b.pz r4 = (com.google.p375ai.p378b.C7950pz) r4
            java.util.Iterator r5 = r26.iterator()
        L_0x002a:
            boolean r6 = r5.hasNext()
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L_0x008a
            java.lang.Object r6 = r5.next()
            com.google.android.apps.gsa.sidekick.main.notifications.an r6 = (com.google.android.apps.gsa.sidekick.main.notifications.C91499an) r6
            com.google.ai.b.kj r9 = r6.f255211a
            int r10 = r9.f27266b
            int r10 = com.google.p375ai.p378b.C7798ki.m22853a(r10)
            r11 = 3
            if (r10 != 0) goto L_0x0044
            goto L_0x0049
        L_0x0044:
            if (r10 != r11) goto L_0x0049
            r0.mo16939a(r9)
        L_0x0049:
            com.google.ai.b.qd r9 = com.google.p375ai.p378b.C7955qd.f27946e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.ai.b.qb r9 = (com.google.p375ai.p378b.C7953qb) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.ai.b.qd r10 = (com.google.p375ai.p378b.C7955qd) r10
            r10.f27949b = r11
            int r11 = r10.f27948a
            r8 = r8 | r11
            r10.f27948a = r8
            com.google.protobuf.z r6 = r6.f255212b
            if (r6 == 0) goto L_0x0071
            r9.copyOnWrite()
            com.google.protobuf.bv r8 = r9.instance
            com.google.ai.b.qd r8 = (com.google.p375ai.p378b.C7955qd) r8
            int r10 = r8.f27948a
            r7 = r7 | r10
            r8.f27948a = r7
            r8.f27950c = r6
        L_0x0071:
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.ai.b.qa r6 = (com.google.p375ai.p378b.C7952qa) r6
            com.google.protobuf.bv r7 = r9.build()
            com.google.ai.b.qd r7 = (com.google.p375ai.p378b.C7955qd) r7
            r7.getClass()
            r6.mo16997c()
            com.google.protobuf.cq r6 = r6.f27935p
            r6.add(r7)
            goto L_0x002a
        L_0x008a:
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.ai.b.qa r5 = (com.google.p375ai.p378b.C7952qa) r5
            com.google.protobuf.bv r6 = r0.build()
            com.google.ai.b.hl r6 = (com.google.p375ai.p378b.C7720hl) r6
            r6.getClass()
            r5.f27922c = r6
            int r6 = r5.f27920a
            r9 = 4
            r6 = r6 | r9
            r5.f27920a = r6
            com.google.protobuf.bv r5 = r0.instance
            com.google.ai.b.hl r5 = (com.google.p375ai.p378b.C7720hl) r5
            com.google.protobuf.cq r5 = r5.f26990c
            int r5 = r5.size()
            if (r5 != 0) goto L_0x00c3
            com.google.common.f.e r0 = f255331a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "NotificationRefreshHlpr"
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "Skipping notification refresh, no notification interests found"
            r3 = 11612(0x2d5c, float:1.6272E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x00c3:
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.sidekick.main.f.f r5 = r1.f255339i
            com.google.protobuf.bv r4 = r4.build()
            com.google.ai.b.qa r4 = (com.google.p375ai.p378b.C7952qa) r4
            com.google.android.apps.gsa.sidekick.main.f.h r6 = com.google.android.apps.gsa.sidekick.main.p7203f.C91376f.f254951b
            com.google.android.apps.gsa.sidekick.main.f.e r4 = r5.mo85696a(r4, r6)
            com.google.ai.b.ql r5 = r4.f254946a
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r5 == 0) goto L_0x0482
            int r6 = r5.f27971a
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0482
            com.google.android.apps.gsa.search.core.i.w r6 = r1.f255340j
            com.google.android.apps.gsa.search.core.i.aa r6 = r6.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r6 = r6.mo79722a()
            com.google.android.apps.gsa.search.core.preferences.u r9 = new com.google.android.apps.gsa.search.core.preferences.u
            com.google.android.apps.gsa.search.core.preferences.z r6 = (com.google.android.apps.gsa.search.core.preferences.C86346z) r6
            r9.<init>(r6)
            java.lang.String r6 = "NotificationRefreshService_last_refresh_time"
            com.google.android.libraries.f.a r12 = r1.f255338h
            long r12 = r12.mo26870b()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r9.mo80085k(r6, r12)
            r6 = 0
            r9.mo80086l(r6)
            com.google.android.apps.gsa.sidekick.main.notifications.q r9 = f255332g
            r12 = -1
            r9.f255330c = r12
            com.google.ai.b.hn r5 = r5.f27972b
            if (r5 != 0) goto L_0x010b
            com.google.ai.b.hn r5 = com.google.p375ai.p378b.C7722hn.f26993i
        L_0x010b:
            com.google.protobuf.cq r9 = r5.f26996b
            int r9 = r9.size()
            com.google.protobuf.bv r12 = r0.instance
            com.google.ai.b.hl r12 = (com.google.p375ai.p378b.C7720hl) r12
            com.google.protobuf.cq r12 = r12.f26990c
            int r12 = r12.size()
            if (r9 == r12) goto L_0x014b
            com.google.common.f.e r2 = f255331a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "NotificationRefreshHlpr"
            r2.mo56378ag(r3, r4)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r3 = 11611(0x2d5b, float:1.627E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r3 = "got back %d entry trees for %d interests"
            com.google.protobuf.cq r4 = r5.f26996b
            int r4 = r4.size()
            com.google.protobuf.bv r0 = r0.instance
            com.google.ai.b.hl r0 = (com.google.p375ai.p378b.C7720hl) r0
            com.google.protobuf.cq r0 = r0.f26990c
            int r0 = r0.size()
            r2.mo56393w(r3, r4, r0)
            goto L_0x047e
        L_0x014b:
            com.google.protobuf.cq r9 = r5.f26996b
            int r9 = r9.size()
            if (r9 == 0) goto L_0x047e
            r9 = 0
        L_0x0154:
            com.google.protobuf.cq r12 = r5.f26996b
            int r12 = r12.size()
            if (r9 >= r12) goto L_0x047b
            com.google.protobuf.bv r12 = r0.instance
            com.google.ai.b.hl r12 = (com.google.p375ai.p378b.C7720hl) r12
            com.google.protobuf.cq r12 = r12.f26990c
            java.lang.Object r12 = r12.get(r9)
            com.google.ai.b.kj r12 = (com.google.p375ai.p378b.C7799kj) r12
            com.google.protobuf.cq r13 = r5.f26996b
            java.lang.Object r13 = r13.get(r9)
            r14 = r13
            com.google.ai.b.ii r14 = (com.google.p375ai.p378b.C7744ii) r14
            int r13 = r14.f27056a
            r13 = r13 & r7
            if (r13 == 0) goto L_0x0194
            long r6 = r14.f27058c
            r15 = 300000(0x493e0, double:1.482197E-318)
            long r15 = r15 + r2
            r20 = r9
            long r8 = r15 / r10
            long r6 = java.lang.Math.max(r6, r8)
            com.google.android.apps.gsa.sidekick.main.notifications.ao r13 = r1.f255333b
            r17 = 1
            byte[] r8 = r4.f254948c
            r9 = r14
            r14 = r6
            r16 = r12
            r18 = r8
            r13.mo85846k(r14, r16, r17, r18)
            goto L_0x0197
        L_0x0194:
            r20 = r9
            r9 = r14
        L_0x0197:
            com.google.android.apps.gsa.sidekick.main.notifications.ao r6 = r1.f255333b
            boolean r7 = r6.mo85848n()
            if (r7 != 0) goto L_0x01a7
            r18 = r0
            r22 = r4
            r23 = r5
            goto L_0x03f9
        L_0x01a7:
            int r7 = r9.f27056a
            r8 = 1
            r7 = r7 & r8
            if (r7 == 0) goto L_0x01b8
            com.google.android.apps.gsa.sidekick.main.notifications.i r7 = new com.google.android.apps.gsa.sidekick.main.notifications.i
            r7.<init>()
            r7.mo86660l(r9)
            java.util.List r7 = r7.f255292a
            goto L_0x01bc
        L_0x01b8:
            com.google.common.b.gu r7 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x01bc:
            java.util.TreeMap r8 = new java.util.TreeMap
            com.google.android.apps.gsa.sidekick.main.notifications.as r9 = com.google.android.apps.gsa.sidekick.main.notifications.C91505at.f255229b
            r8.<init>(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r13 = 0
            r9.<init>(r13)
            java.lang.Object r14 = r6.f255221g
            monitor-enter(r14)
            com.google.android.apps.gsa.sidekick.main.notifications.am r15 = new com.google.android.apps.gsa.sidekick.main.notifications.am     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.b r13 = r6.f255220f     // Catch:{ all -> 0x0478 }
            long r10 = r13.f31421d     // Catch:{ all -> 0x0478 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0478 }
            r15.<init>(r10)     // Catch:{ all -> 0x0478 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0478 }
            r10.<init>()     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.b r11 = r6.f255220f     // Catch:{ all -> 0x0478 }
            com.google.protobuf.cq r11 = r11.f31419b     // Catch:{ all -> 0x0478 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0478 }
        L_0x01e6:
            boolean r13 = r11.hasNext()     // Catch:{ all -> 0x0478 }
            if (r13 == 0) goto L_0x02f7
            java.lang.Object r13 = r11.next()     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r13 = (com.google.android.apps.p489g.p493c.C9133f) r13     // Catch:{ all -> 0x0478 }
            r18 = r0
            com.google.ai.b.kj r0 = r13.f31433c     // Catch:{ all -> 0x0478 }
            if (r0 != 0) goto L_0x01fa
            com.google.ai.b.kj r0 = com.google.p375ai.p378b.C7799kj.f27263h     // Catch:{ all -> 0x0478 }
        L_0x01fa:
            boolean r0 = r12.equals(r0)     // Catch:{ all -> 0x0478 }
            if (r0 != 0) goto L_0x0206
            r10.add(r13)     // Catch:{ all -> 0x0478 }
            r0 = r18
            goto L_0x01e6
        L_0x0206:
            com.google.protobuf.bn r0 = r13.toBuilder()     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.e r0 = (com.google.android.apps.p489g.p493c.C9132e) r0     // Catch:{ all -> 0x0478 }
            java.util.Iterator r13 = r7.iterator()     // Catch:{ all -> 0x0478 }
            r21 = 0
            r22 = r4
            r4 = r21
        L_0x0216:
            boolean r21 = r13.hasNext()     // Catch:{ all -> 0x0478 }
            if (r21 == 0) goto L_0x02c9
            java.lang.Object r21 = r13.next()     // Catch:{ all -> 0x0478 }
            r23 = r5
            r5 = r21
            com.google.ai.b.hj r5 = (com.google.p375ai.p378b.C7718hj) r5     // Catch:{ all -> 0x0478 }
            r21 = r11
            com.google.protobuf.bv r11 = r0.instance     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r11 = (com.google.android.apps.p489g.p493c.C9133f) r11     // Catch:{ all -> 0x0478 }
            com.google.ai.b.hj r11 = r11.f31432b     // Catch:{ all -> 0x0478 }
            if (r11 != 0) goto L_0x0232
            com.google.ai.b.hj r11 = com.google.p375ai.p378b.C7718hj.f26927af     // Catch:{ all -> 0x0478 }
        L_0x0232:
            boolean r11 = com.google.android.apps.gsa.sidekick.main.notifications.C91500ao.m149648m(r5, r11)     // Catch:{ all -> 0x0478 }
            if (r11 == 0) goto L_0x02c3
            com.google.protobuf.bv r4 = r0.instance     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r4 = (com.google.android.apps.p489g.p493c.C9133f) r4     // Catch:{ all -> 0x0478 }
            com.google.ai.b.hj r4 = r4.f31432b     // Catch:{ all -> 0x0478 }
            if (r4 != 0) goto L_0x0242
            com.google.ai.b.hj r4 = com.google.p375ai.p378b.C7718hj.f26927af     // Catch:{ all -> 0x0478 }
        L_0x0242:
            r0.copyOnWrite()     // Catch:{ all -> 0x0478 }
            com.google.protobuf.bv r11 = r0.instance     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r11 = (com.google.android.apps.p489g.p493c.C9133f) r11     // Catch:{ all -> 0x0478 }
            r5.getClass()     // Catch:{ all -> 0x0478 }
            r11.f31432b = r5     // Catch:{ all -> 0x0478 }
            r24 = r5
            int r5 = r11.f31431a     // Catch:{ all -> 0x0478 }
            r19 = 1
            r5 = r5 | 1
            r11.f31431a = r5     // Catch:{ all -> 0x0478 }
            com.google.protobuf.bv r5 = r0.build()     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r5 = (com.google.android.apps.p489g.p493c.C9133f) r5     // Catch:{ all -> 0x0478 }
            com.google.ai.b.hj r5 = r5.f31432b     // Catch:{ all -> 0x0478 }
            if (r5 != 0) goto L_0x0264
            com.google.ai.b.hj r5 = com.google.p375ai.p378b.C7718hj.f26927af     // Catch:{ all -> 0x0478 }
        L_0x0264:
            com.google.ai.b.nd r5 = r5.f26938J     // Catch:{ all -> 0x0478 }
            if (r5 != 0) goto L_0x026a
            com.google.ai.b.nd r5 = com.google.p375ai.p378b.C7874nd.f27577J     // Catch:{ all -> 0x0478 }
        L_0x026a:
            com.google.android.apps.gsa.sidekick.main.notifications.bj r5 = com.google.android.apps.gsa.sidekick.main.notifications.C91525bj.m149693f(r5)     // Catch:{ all -> 0x0478 }
            com.google.protobuf.bv r11 = r0.instance     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r11 = (com.google.android.apps.p489g.p493c.C9133f) r11     // Catch:{ all -> 0x0478 }
            com.google.protobuf.ck r11 = r11.f31438h     // Catch:{ all -> 0x0478 }
            int r11 = r11.size()     // Catch:{ all -> 0x0478 }
            if (r11 == 0) goto L_0x02b6
            if (r5 == 0) goto L_0x02bb
            com.google.protobuf.bv r11 = r0.instance     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r11 = (com.google.android.apps.p489g.p493c.C9133f) r11     // Catch:{ all -> 0x0478 }
            com.google.ai.b.hj r11 = r11.f31432b     // Catch:{ all -> 0x0478 }
            if (r11 != 0) goto L_0x0286
            com.google.ai.b.hj r11 = com.google.p375ai.p378b.C7718hj.f26927af     // Catch:{ all -> 0x0478 }
        L_0x0286:
            com.google.ai.b.nd r11 = r11.f26938J     // Catch:{ all -> 0x0478 }
            if (r11 != 0) goto L_0x028c
            com.google.ai.b.nd r11 = com.google.p375ai.p378b.C7874nd.f27577J     // Catch:{ all -> 0x0478 }
        L_0x028c:
            com.google.ai.b.nd r4 = r4.f26938J     // Catch:{ all -> 0x0478 }
            if (r4 != 0) goto L_0x0292
            com.google.ai.b.nd r4 = com.google.p375ai.p378b.C7874nd.f27577J     // Catch:{ all -> 0x0478 }
        L_0x0292:
            boolean r4 = r5.mo85865d(r11, r4)     // Catch:{ all -> 0x0478 }
            if (r4 == 0) goto L_0x02bb
            com.google.protobuf.bv r4 = r0.instance     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r4 = (com.google.android.apps.p489g.p493c.C9133f) r4     // Catch:{ all -> 0x0478 }
            com.google.protobuf.ck r4 = r4.f31438h     // Catch:{ all -> 0x0478 }
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)     // Catch:{ all -> 0x0478 }
            com.google.android.apps.gsa.sidekick.main.notifications.C91500ao.m149647e(r9, r4)     // Catch:{ all -> 0x0478 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0478 }
            com.google.protobuf.bv r4 = r0.instance     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r4 = (com.google.android.apps.p489g.p493c.C9133f) r4     // Catch:{ all -> 0x0478 }
            com.google.protobuf.ck r11 = com.google.android.apps.p489g.p493c.C9133f.emptyLongList()     // Catch:{ all -> 0x0478 }
            r4.f31438h = r11     // Catch:{ all -> 0x0478 }
            r5.mo85864c(r0, r8, r15)     // Catch:{ all -> 0x0478 }
            goto L_0x02bb
        L_0x02b6:
            if (r5 == 0) goto L_0x02bb
            r5.mo85864c(r0, r8, r15)     // Catch:{ all -> 0x0478 }
        L_0x02bb:
            r11 = r21
            r5 = r23
            r4 = r24
            goto L_0x0216
        L_0x02c3:
            r11 = r21
            r5 = r23
            goto L_0x0216
        L_0x02c9:
            r23 = r5
            r21 = r11
            if (r4 != 0) goto L_0x02e1
            com.google.protobuf.bv r4 = r0.instance     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r4 = (com.google.android.apps.p489g.p493c.C9133f) r4     // Catch:{ all -> 0x0478 }
            boolean r5 = r4.f31434d     // Catch:{ all -> 0x0478 }
            if (r5 != 0) goto L_0x02e4
            com.google.protobuf.ck r0 = r4.f31438h     // Catch:{ all -> 0x0478 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x0478 }
            com.google.android.apps.gsa.sidekick.main.notifications.C91500ao.m149647e(r9, r0)     // Catch:{ all -> 0x0478 }
            goto L_0x02ed
        L_0x02e1:
            r7.remove(r4)     // Catch:{ all -> 0x0478 }
        L_0x02e4:
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r0 = (com.google.android.apps.p489g.p493c.C9133f) r0     // Catch:{ all -> 0x0478 }
            r10.add(r0)     // Catch:{ all -> 0x0478 }
        L_0x02ed:
            r0 = r18
            r11 = r21
            r4 = r22
            r5 = r23
            goto L_0x01e6
        L_0x02f7:
            r18 = r0
            r22 = r4
            r23 = r5
            com.google.android.libraries.f.a r0 = r6.f255216b     // Catch:{ all -> 0x0478 }
            long r4 = r0.mo26870b()     // Catch:{ all -> 0x0478 }
            r16 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r16
            java.util.Iterator r0 = r7.iterator()     // Catch:{ all -> 0x0478 }
        L_0x030b:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x0478 }
            if (r7 == 0) goto L_0x03aa
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x0478 }
            com.google.ai.b.hj r7 = (com.google.p375ai.p378b.C7718hj) r7     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r11 = com.google.android.apps.p489g.p493c.C9133f.f31429j     // Catch:{ all -> 0x0478 }
            com.google.protobuf.bn r11 = r11.createBuilder()     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.e r11 = (com.google.android.apps.p489g.p493c.C9132e) r11     // Catch:{ all -> 0x0478 }
            r11.copyOnWrite()     // Catch:{ all -> 0x0478 }
            com.google.protobuf.bv r13 = r11.instance     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r13 = (com.google.android.apps.p489g.p493c.C9133f) r13     // Catch:{ all -> 0x0478 }
            r21 = r0
            int r0 = r13.f31431a     // Catch:{ all -> 0x0478 }
            r0 = r0 | 64
            r13.f31431a = r0     // Catch:{ all -> 0x0478 }
            r13.f31437g = r4     // Catch:{ all -> 0x0478 }
            r11.copyOnWrite()     // Catch:{ all -> 0x0478 }
            com.google.protobuf.bv r0 = r11.instance     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r0 = (com.google.android.apps.p489g.p493c.C9133f) r0     // Catch:{ all -> 0x0478 }
            r7.getClass()     // Catch:{ all -> 0x0478 }
            r0.f31432b = r7     // Catch:{ all -> 0x0478 }
            int r13 = r0.f31431a     // Catch:{ all -> 0x0478 }
            r19 = 1
            r13 = r13 | 1
            r0.f31431a = r13     // Catch:{ all -> 0x0478 }
            r11.copyOnWrite()     // Catch:{ all -> 0x0478 }
            com.google.protobuf.bv r0 = r11.instance     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r0 = (com.google.android.apps.p489g.p493c.C9133f) r0     // Catch:{ all -> 0x0478 }
            r12.getClass()     // Catch:{ all -> 0x0478 }
            r0.f31433c = r12     // Catch:{ all -> 0x0478 }
            int r13 = r0.f31431a     // Catch:{ all -> 0x0478 }
            r24 = 2
            r13 = r13 | 2
            r0.f31431a = r13     // Catch:{ all -> 0x0478 }
            com.google.ai.b.nd r0 = r7.f26938J     // Catch:{ all -> 0x0478 }
            if (r0 != 0) goto L_0x035e
            com.google.ai.b.nd r0 = com.google.p375ai.p378b.C7874nd.f27577J     // Catch:{ all -> 0x0478 }
        L_0x035e:
            int r0 = r0.f27589a     // Catch:{ all -> 0x0478 }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x037b
            com.google.ai.b.nd r0 = r7.f26938J     // Catch:{ all -> 0x0478 }
            if (r0 != 0) goto L_0x036a
            com.google.ai.b.nd r0 = com.google.p375ai.p378b.C7874nd.f27577J     // Catch:{ all -> 0x0478 }
        L_0x036a:
            int r0 = r0.f27596h     // Catch:{ all -> 0x0478 }
            r11.copyOnWrite()     // Catch:{ all -> 0x0478 }
            com.google.protobuf.bv r7 = r11.instance     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r7 = (com.google.android.apps.p489g.p493c.C9133f) r7     // Catch:{ all -> 0x0478 }
            int r13 = r7.f31431a     // Catch:{ all -> 0x0478 }
            r13 = r13 | 128(0x80, float:1.794E-43)
            r7.f31431a = r13     // Catch:{ all -> 0x0478 }
            r7.f31439i = r0     // Catch:{ all -> 0x0478 }
        L_0x037b:
            com.google.protobuf.bv r0 = r11.build()     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r0 = (com.google.android.apps.p489g.p493c.C9133f) r0     // Catch:{ all -> 0x0478 }
            com.google.ai.b.hj r0 = r0.f31432b     // Catch:{ all -> 0x0478 }
            if (r0 != 0) goto L_0x0387
            com.google.ai.b.hj r0 = com.google.p375ai.p378b.C7718hj.f26927af     // Catch:{ all -> 0x0478 }
        L_0x0387:
            com.google.ai.b.nd r0 = r0.f26938J     // Catch:{ all -> 0x0478 }
            if (r0 != 0) goto L_0x038d
            com.google.ai.b.nd r0 = com.google.p375ai.p378b.C7874nd.f27577J     // Catch:{ all -> 0x0478 }
        L_0x038d:
            com.google.android.apps.gsa.sidekick.main.notifications.bj r0 = com.google.android.apps.gsa.sidekick.main.notifications.C91525bj.m149693f(r0)     // Catch:{ all -> 0x0478 }
            if (r0 == 0) goto L_0x039d
            com.google.protobuf.bn r7 = r11.clone()     // Catch:{ all -> 0x0478 }
            r11 = r7
            com.google.android.apps.g.c.e r11 = (com.google.android.apps.p489g.p493c.C9132e) r11     // Catch:{ all -> 0x0478 }
            r0.mo85864c(r11, r8, r15)     // Catch:{ all -> 0x0478 }
        L_0x039d:
            com.google.protobuf.bv r0 = r11.build()     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.f r0 = (com.google.android.apps.p489g.p493c.C9133f) r0     // Catch:{ all -> 0x0478 }
            r10.add(r0)     // Catch:{ all -> 0x0478 }
            r0 = r21
            goto L_0x030b
        L_0x03aa:
            com.google.android.apps.g.c.b r0 = r6.f255220f     // Catch:{ all -> 0x0478 }
            com.google.protobuf.bn r0 = r0.toBuilder()     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.a r0 = (com.google.android.apps.p489g.p493c.C9128a) r0     // Catch:{ all -> 0x0478 }
            java.lang.Long r4 = r15.f255210a     // Catch:{ all -> 0x0478 }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0478 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0478 }
            com.google.protobuf.bv r7 = r0.instance     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.b r7 = (com.google.android.apps.p489g.p493c.C9129b) r7     // Catch:{ all -> 0x0478 }
            int r11 = r7.f31418a     // Catch:{ all -> 0x0478 }
            r13 = 1
            r11 = r11 | r13
            r7.f31418a = r11     // Catch:{ all -> 0x0478 }
            r7.f31421d = r4     // Catch:{ all -> 0x0478 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0478 }
            com.google.protobuf.bv r4 = r0.instance     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.b r4 = (com.google.android.apps.p489g.p493c.C9129b) r4     // Catch:{ all -> 0x0478 }
            com.google.protobuf.cq r5 = com.google.android.apps.p489g.p493c.C9129b.emptyProtobufList()     // Catch:{ all -> 0x0478 }
            r4.f31419b = r5     // Catch:{ all -> 0x0478 }
            r0.mo17430b(r10)     // Catch:{ all -> 0x0478 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x0478 }
            com.google.android.apps.g.c.b r0 = (com.google.android.apps.p489g.p493c.C9129b) r0     // Catch:{ all -> 0x0478 }
            r6.f255220f = r0     // Catch:{ all -> 0x0478 }
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0478 }
            if (r0 != 0) goto L_0x03ea
            com.google.android.apps.gsa.sidekick.main.notifications.at r0 = r6.f255217c     // Catch:{ all -> 0x0478 }
            r0.mo85853d(r9)     // Catch:{ all -> 0x0478 }
        L_0x03ea:
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x0478 }
            if (r0 != 0) goto L_0x03f5
            com.google.android.apps.gsa.sidekick.main.notifications.at r0 = r6.f255217c     // Catch:{ all -> 0x0478 }
            r0.mo85851b(r8)     // Catch:{ all -> 0x0478 }
        L_0x03f5:
            r6.mo85842g()     // Catch:{ all -> 0x0478 }
            monitor-exit(r14)     // Catch:{ all -> 0x0478 }
        L_0x03f9:
            com.google.android.apps.gsa.sidekick.main.notifications.ao r0 = r1.f255333b
            r4 = 1000(0x3e8, double:4.94E-321)
            long r6 = r2 / r4
            boolean r4 = r0.mo85848n()
            if (r4 != 0) goto L_0x0406
            goto L_0x0466
        L_0x0406:
            java.lang.Object r4 = r0.f255221g
            monitor-enter(r4)
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0475 }
            com.google.android.apps.g.c.b r8 = r0.f255220f     // Catch:{ all -> 0x0475 }
            com.google.protobuf.cq r8 = r8.f31420c     // Catch:{ all -> 0x0475 }
            r5.<init>(r8)     // Catch:{ all -> 0x0475 }
            java.util.Iterator r8 = r5.iterator()     // Catch:{ all -> 0x0475 }
            r9 = 0
        L_0x0417:
            boolean r10 = r8.hasNext()     // Catch:{ all -> 0x0475 }
            if (r10 == 0) goto L_0x0440
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x0475 }
            com.google.android.apps.g.c.h r10 = (com.google.android.apps.p489g.p493c.C9135h) r10     // Catch:{ all -> 0x0475 }
            int r11 = r10.f31443a     // Catch:{ all -> 0x0475 }
            r13 = 1
            r11 = r11 & r13
            if (r11 == 0) goto L_0x0417
            com.google.ai.b.kj r11 = r10.f31444b     // Catch:{ all -> 0x0475 }
            if (r11 != 0) goto L_0x042f
            com.google.ai.b.kj r11 = com.google.p375ai.p378b.C7799kj.f27263h     // Catch:{ all -> 0x0475 }
        L_0x042f:
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0475 }
            if (r11 == 0) goto L_0x0417
            long r10 = r10.f31445c     // Catch:{ all -> 0x0475 }
            int r13 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r13 > 0) goto L_0x0417
            r8.remove()     // Catch:{ all -> 0x0475 }
            r9 = 1
            goto L_0x0417
        L_0x0440:
            if (r9 == 0) goto L_0x0465
            com.google.android.apps.g.c.b r6 = r0.f255220f     // Catch:{ all -> 0x0475 }
            com.google.protobuf.bn r6 = r6.toBuilder()     // Catch:{ all -> 0x0475 }
            com.google.android.apps.g.c.a r6 = (com.google.android.apps.p489g.p493c.C9128a) r6     // Catch:{ all -> 0x0475 }
            r6.copyOnWrite()     // Catch:{ all -> 0x0475 }
            com.google.protobuf.bv r7 = r6.instance     // Catch:{ all -> 0x0475 }
            com.google.android.apps.g.c.b r7 = (com.google.android.apps.p489g.p493c.C9129b) r7     // Catch:{ all -> 0x0475 }
            com.google.protobuf.cq r8 = com.google.android.apps.p489g.p493c.C9129b.emptyProtobufList()     // Catch:{ all -> 0x0475 }
            r7.f31420c = r8     // Catch:{ all -> 0x0475 }
            r6.mo17431c(r5)     // Catch:{ all -> 0x0475 }
            com.google.protobuf.bv r5 = r6.build()     // Catch:{ all -> 0x0475 }
            com.google.android.apps.g.c.b r5 = (com.google.android.apps.p489g.p493c.C9129b) r5     // Catch:{ all -> 0x0475 }
            r0.f255220f = r5     // Catch:{ all -> 0x0475 }
            r0.mo85842g()     // Catch:{ all -> 0x0475 }
        L_0x0465:
            monitor-exit(r4)     // Catch:{ all -> 0x0475 }
        L_0x0466:
            int r9 = r20 + 1
            r0 = r18
            r4 = r22
            r5 = r23
            r6 = 0
            r7 = 2
            r8 = 1
            r10 = 1000(0x3e8, double:4.94E-321)
            goto L_0x0154
        L_0x0475:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0475 }
            throw r0
        L_0x0478:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0478 }
            throw r0
        L_0x047b:
            r25.mo85927f()
        L_0x047e:
            r25.mo85930i()
            return
        L_0x0482:
            com.google.android.libraries.f.a r0 = r1.f255338h
            long r2 = r0.mo26871c()
            com.google.android.apps.gsa.sidekick.main.notifications.q r0 = f255332g
            int r4 = r0.f255330c
            r5 = 1
            int r4 = r4 + r5
            r0.f255330c = r4
            int r4 = java.lang.Math.min(r4, r9)
            int[] r5 = r0.f255328a
            r4 = r5[r4]
            long r4 = (long) r4
            r6 = 60000(0xea60, double:2.9644E-319)
            long r4 = r4 * r6
            int r0 = r0.f255329b
            long r6 = (long) r0
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            long r4 = r4 + r6
            long r2 = r2 + r4
            r0 = 2
            r1.m149773l(r0, r2)
            com.google.common.f.e r0 = f255331a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "NotificationRefreshHlpr"
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "Failed to get response for notification query from server"
            r3 = 11610(0x2d5a, float:1.6269E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x04c0:
            com.google.common.f.e r0 = f255331a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "NotificationRefreshHlpr"
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "Skipping notification refresh, no interests to query."
            r3 = 11608(0x2d58, float:1.6266E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.notifications.C91544r.mo85929h(java.util.List):void");
    }

    /* renamed from: i */
    public final void mo85930i() {
        C91500ao aoVar = this.f255333b;
        Long l = null;
        if (aoVar.mo85848n()) {
            long b = aoVar.f255216b.mo26870b() / 1000;
            long j = Long.MAX_VALUE;
            for (C9135h hVar : aoVar.f255220f.f31420c) {
                long j2 = hVar.f31445c;
                if (j2 >= b) {
                    j = Math.min(j, j2);
                }
            }
            if (j != Long.MAX_VALUE) {
                l = Long.valueOf(j * 1000);
            }
        }
        if (l != null) {
            m149773l(0, l.longValue());
        }
    }

    /* renamed from: j */
    public final void mo85931j() {
        C91500ao aoVar = this.f255333b;
        Long l = null;
        if (aoVar.mo85848n()) {
            long b = aoVar.f255216b.mo26870b() / 1000;
            long j = Long.MAX_VALUE;
            for (C9133f fVar : aoVar.f255220f.f31419b) {
                C7718hj hjVar = fVar.f31432b;
                if (hjVar == null) {
                    hjVar = C7718hj.f26927af;
                }
                C7874nd ndVar = hjVar.f26938J;
                if (ndVar == null) {
                    ndVar = C7874nd.f27577J;
                }
                if (C91525bj.m149693f(ndVar) != null) {
                    long k = C91525bj.m149698k(fVar, aoVar.f255219e.mo79746e(C90010bp.f246973ap), aoVar.f255219e.mo79746e(C90010bp.f246974aq));
                    if (k > b) {
                        j = Math.min(j, k);
                    }
                }
            }
            if (j != Long.MAX_VALUE) {
                l = Long.valueOf(j * 1000);
            }
        }
        PendingIntent a = mo85923a();
        if (l == null) {
            C58976aa aaVar = C58975e.f156826a;
            this.f255337f.mo78251a(a);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f255337f.mo78252b(1, l.longValue(), a);
    }

    /* renamed from: k */
    public final void mo85932k() {
        this.f255337f.mo78251a(mo85924c(0));
        this.f255337f.mo78251a(mo85924c(1));
        this.f255337f.mo78251a(mo85925d());
        this.f255337f.mo78251a(mo85923a());
        C91500ao aoVar = this.f255333b;
        C91018d.m148680c();
        if (aoVar.mo85848n()) {
            synchronized (aoVar.f255221g) {
                aoVar.f255220f = C9129b.f31416f;
                C60856cj.m92910s(aoVar.f255218d.mo77582a());
                C91505at atVar = aoVar.f255217c;
                synchronized (atVar.f255230c) {
                    atVar.f255231d.clear();
                }
                atVar.mo85854e();
            }
        }
    }

    /* renamed from: b */
    public static PendingIntent m149772b(Context context, Collection collection, int i) {
        collection.getClass();
        C58838bb.m90883r(!collection.isEmpty());
        Intent intent = new Intent("com.google.android.apps.sidekick.notifications.NOTIFICATION_DISMISS_ACTION", new Uri.Builder().scheme("notification_refresh_dismiss").authority(Integer.toString(i)).build());
        intent.setClassName(context, "com.google.android.apps.gsa.sidekick.main.notifications.NotificationRefreshReceiver");
        C91978bb.m150940f(intent, "notification_entries", collection);
        return PendingIntent.getBroadcast(context, 0, intent, 335544320);
    }
}
