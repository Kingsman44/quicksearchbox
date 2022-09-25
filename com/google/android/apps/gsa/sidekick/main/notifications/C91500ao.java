package com.google.android.apps.gsa.sidekick.main.notifications;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.BadParcelableException;
import com.google.android.apps.gsa.proactive.p6474a.C84156a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.sidekick.main.p7199b.C91261a;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91732b;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91734d;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91737g;
import com.google.android.apps.gsa.sidekick.shared.util.C91966aq;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.p489g.p493c.C9128a;
import com.google.android.apps.p489g.p493c.C9129b;
import com.google.android.apps.p489g.p493c.C9132e;
import com.google.android.apps.p489g.p493c.C9133f;
import com.google.android.apps.p489g.p493c.C9135h;
import com.google.android.gms.location.C144870aa;
import com.google.android.gms.location.C144877ah;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58839bc;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58570jy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7805kp;
import com.google.p375ai.p378b.C7874nd;
import com.google.p375ai.p378b.C7947pw;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.ao */
/* compiled from: PG */
public final class C91500ao implements C91737g {

    /* renamed from: a */
    public static final C59071e f255213a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.notifications.ao");

    /* renamed from: h */
    private static final C58839bc f255214h = new C91488ac();

    /* renamed from: i */
    private static final C58817ah f255215i = new C91489ad();

    /* renamed from: b */
    public final C21370a f255216b;

    /* renamed from: c */
    public final C91505at f255217c;

    /* renamed from: d */
    public final C84156a f255218d;

    /* renamed from: e */
    public final C86124t f255219e;

    /* renamed from: f */
    public volatile C9129b f255220f;

    /* renamed from: g */
    public final Object f255221g = new Object();

    /* renamed from: j */
    private final Context f255222j;

    /* renamed from: k */
    private final C90931ca f255223k;

    /* renamed from: l */
    private final AtomicBoolean f255224l = new AtomicBoolean();

    /* renamed from: m */
    private final CountDownLatch f255225m = new CountDownLatch(1);

    public C91500ao(C21370a aVar, Context context, C90931ca caVar, C91505at atVar, C84156a aVar2, C86124t tVar) {
        this.f255216b = aVar;
        this.f255222j = context;
        this.f255223k = caVar;
        this.f255217c = atVar;
        this.f255218d = aVar2;
        this.f255219e = tVar;
    }

    /* renamed from: e */
    public static void m149647e(List list, List list2) {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            list.add("notification_" + longValue);
        }
    }

    /* renamed from: m */
    public static boolean m149648m(C7718hj hjVar, C7718hj hjVar2) {
        C7746ik a = C7746ik.m22834a(hjVar.f26966g);
        if (a == null) {
            a = C7746ik.UNKNOWN;
        }
        C7746ik a2 = C7746ik.m22834a(hjVar2.f26966g);
        if (a2 == null) {
            a2 = C7746ik.UNKNOWN;
        }
        if (a != a2) {
            return false;
        }
        if ((hjVar.f26955a & 8) != 0 && (hjVar2.f26955a & 8) != 0) {
            return hjVar.f26969j == hjVar2.f26969j;
        }
        C7746ik a3 = C7746ik.m22834a(hjVar.f26966g);
        if (a3 == null) {
            a3 = C7746ik.UNKNOWN;
        }
        if (a3.ordinal() != 9) {
            return true;
        }
        if ((hjVar.f26955a & 32768) == 0) {
            return (hjVar2.f26955a & 32768) == 0;
        }
        if ((hjVar2.f26955a & 32768) == 0) {
            return false;
        }
        C7947pw pwVar = hjVar.f26979t;
        if (pwVar == null) {
            pwVar = C7947pw.f27896j;
        }
        C7947pw pwVar2 = hjVar2.f26979t;
        if (pwVar2 == null) {
            pwVar2 = C7947pw.f27896j;
        }
        if ((pwVar.f27898a & 1) == 0) {
            return (pwVar2.f27898a & 1) == 0;
        }
        if ((pwVar2.f27898a & 1) != 0) {
            return pwVar.f27899b.equals(pwVar2.f27899b);
        }
        return false;
    }

    /* renamed from: a */
    public final C58485gu mo85837a() {
        return mo85838b(new C91493ah(new C91497al(this.f255216b.mo26870b() / 1000, false, false)), C58833ax.m90834k(C91487ab.f255196a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C58485gu mo85838b(C58839bc bcVar, C58833ax axVar) {
        if (!mo85848n()) {
            return C58485gu.m89845m();
        }
        ArrayList arrayList = new ArrayList();
        for (C9133f add : C58557jl.m90124e(this.f255220f.f31419b, bcVar)) {
            arrayList.add(add);
        }
        if (axVar.mo56113h()) {
            Collections.sort(arrayList, (Comparator) axVar.mo56107c());
        }
        C58480gp gpVar = new C58480gp(4);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C9133f fVar = (C9133f) arrayList.get(i);
            if ((fVar.f31431a & 1) != 0) {
                C7718hj hjVar = fVar.f31432b;
                if (hjVar == null) {
                    hjVar = C7718hj.f26927af;
                }
                gpVar.mo55395g(hjVar);
            }
        }
        return gpVar.mo55394f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038 A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p375ai.p378b.C7718hj mo85839c(com.google.p375ai.p378b.C7718hj r5) {
        /*
            r4 = this;
            boolean r0 = r4.mo85848n()
            r1 = 0
            if (r0 != 0) goto L_0x0009
        L_0x0007:
            r2 = r1
            goto L_0x0029
        L_0x0009:
            com.google.android.apps.g.c.b r0 = r4.f255220f
            com.google.protobuf.cq r0 = r0.f31419b
            java.util.Iterator r0 = r0.iterator()
        L_0x0011:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0007
            java.lang.Object r2 = r0.next()
            com.google.android.apps.g.c.f r2 = (com.google.android.apps.p489g.p493c.C9133f) r2
            com.google.ai.b.hj r3 = r2.f31432b
            if (r3 != 0) goto L_0x0023
            com.google.ai.b.hj r3 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x0023:
            boolean r3 = m149648m(r5, r3)
            if (r3 == 0) goto L_0x0011
        L_0x0029:
            if (r2 == 0) goto L_0x0038
            int r5 = r2.f31431a
            r5 = r5 & 1
            if (r5 == 0) goto L_0x0038
            com.google.ai.b.hj r5 = r2.f31432b
            if (r5 != 0) goto L_0x0037
            com.google.ai.b.hj r5 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x0037:
            return r5
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.notifications.C91500ao.mo85839c(com.google.ai.b.hj):com.google.ai.b.hj");
    }

    /* renamed from: d */
    public final Long mo85840d(C58839bc bcVar) {
        long j;
        if (!mo85848n()) {
            return null;
        }
        long b = this.f255216b.mo26870b() / 1000;
        long j2 = Long.MAX_VALUE;
        for (C9133f fVar : this.f255220f.f31419b) {
            if (bcVar.mo5941a(fVar)) {
                C7718hj hjVar = fVar.f31432b;
                if (hjVar == null) {
                    hjVar = C7718hj.f26927af;
                }
                C7874nd ndVar = hjVar.f26938J;
                if (ndVar == null) {
                    ndVar = C7874nd.f27577J;
                }
                C91525bj f = C91525bj.m149693f(ndVar);
                if (f != null) {
                    j = j2;
                    long e = f.mo85866e(fVar, b, this.f255219e.mo79746e(C90010bp.f246973ap), this.f255219e.mo79746e(C90010bp.f246974aq));
                    if (e > b) {
                        j2 = Math.min(j, e);
                    }
                    j2 = j;
                }
            }
            j = j2;
            j2 = j;
        }
        long j3 = j2;
        if (j3 == Long.MAX_VALUE) {
            return null;
        }
        return Long.valueOf(j3 * 1000);
    }

    /* renamed from: f */
    public final void mo85841f(Collection collection) {
        C58485gu a = mo85837a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a);
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C7718hj c = mo85839c((C7718hj) it.next());
            if (c != null) {
                hashSet.add(c);
                C7746ik a2 = C7746ik.m22834a(c.f26966g);
                if (a2 == null) {
                    a2 = C7746ik.UNKNOWN;
                }
                if (a2 == C7746ik.REMINDER && (c.f26955a & 1073741824) != 0) {
                    int size = a.size();
                    for (int i = 0; i < size; i++) {
                        C7718hj hjVar = (C7718hj) a.get(i);
                        if (m149648m(c, hjVar)) {
                            arrayList.remove(hjVar);
                        }
                    }
                    z = true;
                }
            }
        }
        if (!hashSet.isEmpty()) {
            Intent className = new Intent("com.google.android.apps.sidekick.DISMISS_ENTRY_ACTION").setClassName(this.f255222j, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver");
            C91978bb.m150940f(className, "notification_entries", hashSet);
            try {
                this.f255222j.sendBroadcast(className);
                if (z && !arrayList.isEmpty()) {
                    Intent className2 = new Intent("com.google.android.apps.sidekick.SHOW_FOR_REMINDERS_ACTION").setClassName(this.f255222j, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver");
                    C91978bb.m150940f(className2, "notification_entries", arrayList);
                    this.f255222j.sendBroadcast(className2);
                }
            } catch (BadParcelableException e) {
                ((C59052c) ((C59052c) ((C59052c) f255213a.mo56226d()).mo56382g(e)).mo56372aa(11633)).mo56386p("Failed to dismiss notifications for entry");
            }
        }
    }

    /* renamed from: g */
    public final void mo85842g() {
        C90748e.m148224b();
        C60856cj.m92910s(this.f255218d.mo77586e(this.f255220f));
    }

    /* renamed from: h */
    public final void mo85843h(C7718hj hjVar) {
        if (mo85848n()) {
            synchronized (this.f255221g) {
                C9128a aVar = (C9128a) this.f255220f.toBuilder();
                aVar.copyOnWrite();
                ((C9129b) aVar.instance).f31419b = C9129b.emptyProtobufList();
                boolean z = false;
                for (C9133f fVar : this.f255220f.f31419b) {
                    C7718hj hjVar2 = fVar.f31432b;
                    if (hjVar2 == null) {
                        hjVar2 = C7718hj.f26927af;
                    }
                    if (m149648m(hjVar, hjVar2)) {
                        C9132e eVar = (C9132e) fVar.toBuilder();
                        eVar.copyOnWrite();
                        C9133f fVar2 = (C9133f) eVar.instance;
                        fVar2.f31431a |= 8;
                        fVar2.f31435e = true;
                        aVar.mo17432d((C9133f) eVar.build());
                        z = true;
                    } else {
                        aVar.mo17432d(fVar);
                    }
                }
                if (z) {
                    this.f255220f = (C9129b) aVar.build();
                    mo85842g();
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo85844i(C91732b bVar) {
        if (bVar.f255836b) {
            this.f255223k.mo85139d(new C91494ai(this));
        }
        for (C91734d dVar : bVar.f255842h) {
            if (dVar.f255853d) {
                this.f255223k.mo85139d(new C91495aj(this, dVar));
            } else {
                this.f255223k.mo85139d(new C91496ak(this, dVar));
            }
        }
    }

    /* renamed from: j */
    public final void mo85845j() {
        if (mo85848n()) {
            synchronized (this.f255221g) {
                TreeMap treeMap = new TreeMap(C91505at.f255229b);
                ArrayList arrayList = new ArrayList(0);
                C91498am amVar = new C91498am(Long.valueOf(this.f255220f.f31421d));
                C62971cq<C9133f> cqVar = this.f255220f.f31419b;
                ArrayList arrayList2 = new ArrayList();
                for (C9133f fVar : cqVar) {
                    C7718hj hjVar = fVar.f31432b;
                    if (hjVar == null) {
                        hjVar = C7718hj.f26927af;
                    }
                    C7874nd ndVar = hjVar.f26938J;
                    if (ndVar == null) {
                        ndVar = C7874nd.f27577J;
                    }
                    C91525bj f = C91525bj.m149693f(ndVar);
                    if (fVar.f31438h.size() != 0) {
                        C9132e eVar = (C9132e) fVar.toBuilder();
                        m149647e(arrayList, fVar.f31438h);
                        eVar.copyOnWrite();
                        ((C9133f) eVar.instance).f31438h = C9133f.emptyLongList();
                        arrayList2.add((C9133f) eVar.build());
                        fVar = (C9133f) eVar.build();
                    } else {
                        arrayList2.add(fVar);
                    }
                    if (f != null) {
                        C9132e eVar2 = (C9132e) fVar.toBuilder();
                        f.mo85864c(eVar2, treeMap, amVar);
                        arrayList2.set(arrayList2.size() - 1, (C9133f) eVar2.build());
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f255217c.mo85853d(arrayList);
                }
                if (!treeMap.isEmpty()) {
                    this.f255217c.mo85851b(treeMap);
                }
                if (!arrayList.isEmpty() || !treeMap.isEmpty()) {
                    C9128a aVar = (C9128a) this.f255220f.toBuilder();
                    long longValue = amVar.f255210a.longValue();
                    aVar.copyOnWrite();
                    C9129b bVar = (C9129b) aVar.instance;
                    bVar.f31418a |= 1;
                    bVar.f31421d = longValue;
                    aVar.copyOnWrite();
                    ((C9129b) aVar.instance).f31419b = C9129b.emptyProtobufList();
                    aVar.mo17430b(arrayList2);
                    this.f255220f = (C9129b) aVar.build();
                    mo85842g();
                }
            }
            if ((this.f255220f.f31418a & 2) != 0) {
                C7805kp kpVar = this.f255220f.f31422e;
                if (kpVar == null) {
                    kpVar = C7805kp.f27284h;
                }
                Location a = C91966aq.m150921a(kpVar);
                if (mo85848n()) {
                    synchronized (this.f255221g) {
                        C9128a aVar2 = (C9128a) this.f255220f.toBuilder();
                        C7805kp b = C91966aq.m150922b(a);
                        aVar2.copyOnWrite();
                        C9129b bVar2 = (C9129b) aVar2.instance;
                        b.getClass();
                        bVar2.f31422e = b;
                        bVar2.f31418a |= 2;
                        this.f255220f = (C9129b) aVar2.build();
                        mo85842g();
                    }
                }
                C91505at atVar = this.f255217c;
                C91261a aVar3 = new C91261a(atVar.f255234g.mo26870b(), a.getLatitude(), a.getLongitude());
                C144870aa aaVar = new C144870aa();
                aaVar.mo120364b(aVar3.f254704a, aVar3.f254705b, 10000.0f);
                aaVar.mo120365c(-1);
                aaVar.f391809a = 2;
                aaVar.mo120366d("notification.ttl_geofence_id");
                ParcelableGeofence a2 = aaVar.mo120363a();
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(a2);
                GeofencingRequest b2 = C144877ah.m235475b(arrayList3, 2);
                C58976aa aaVar2 = C58975e.f156826a;
                atVar.f255232e.a(b2, atVar.f255235h, C39226b.TAG_CLASSIC_SEARCH_SIDEKICK_LO);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0110, code lost:
        if (r10 != false) goto L_0x0112;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85846k(long r16, com.google.p375ai.p378b.C7799kj r18, boolean r19, byte[] r20) {
        /*
            r15 = this;
            r1 = r15
            r2 = r16
            r0 = r18
            boolean r4 = r15.mo85848n()
            if (r4 != 0) goto L_0x000c
            return
        L_0x000c:
            com.google.android.libraries.f.a r4 = r1.f255216b
            long r4 = r4.mo26870b()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            java.lang.Object r6 = r1.f255221g
            monitor-enter(r6)
            com.google.android.apps.g.c.b r7 = r1.f255220f     // Catch:{ all -> 0x011f }
            com.google.protobuf.bn r7 = r7.toBuilder()     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.a r7 = (com.google.android.apps.p489g.p493c.C9128a) r7     // Catch:{ all -> 0x011f }
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0023:
            com.google.protobuf.bv r11 = r7.instance     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.b r11 = (com.google.android.apps.p489g.p493c.C9129b) r11     // Catch:{ all -> 0x011f }
            com.google.protobuf.cq r11 = r11.f31420c     // Catch:{ all -> 0x011f }
            int r11 = r11.size()     // Catch:{ all -> 0x011f }
            r12 = 1
            if (r8 >= r11) goto L_0x00b8
            com.google.protobuf.bv r11 = r7.instance     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.b r11 = (com.google.android.apps.p489g.p493c.C9129b) r11     // Catch:{ all -> 0x011f }
            com.google.protobuf.cq r11 = r11.f31420c     // Catch:{ all -> 0x011f }
            java.lang.Object r11 = r11.get(r8)     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.h r11 = (com.google.android.apps.p489g.p493c.C9135h) r11     // Catch:{ all -> 0x011f }
            int r13 = r11.f31443a     // Catch:{ all -> 0x011f }
            r13 = r13 & r12
            if (r13 == 0) goto L_0x00b4
            com.google.ai.b.kj r13 = r11.f31444b     // Catch:{ all -> 0x011f }
            if (r13 != 0) goto L_0x0047
            com.google.ai.b.kj r13 = com.google.p375ai.p378b.C7799kj.f27263h     // Catch:{ all -> 0x011f }
        L_0x0047:
            boolean r13 = r0.equals(r13)     // Catch:{ all -> 0x011f }
            if (r13 == 0) goto L_0x00b4
            com.google.protobuf.bn r9 = r11.toBuilder()     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.g r9 = (com.google.android.apps.p489g.p493c.C9134g) r9     // Catch:{ all -> 0x011f }
            if (r19 != 0) goto L_0x0062
            long r13 = r11.f31445c     // Catch:{ all -> 0x011f }
            int r11 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r11 < 0) goto L_0x0062
            int r11 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r9 = 1
            goto L_0x00b4
        L_0x0062:
            r9.copyOnWrite()     // Catch:{ all -> 0x011f }
            com.google.protobuf.bv r10 = r9.instance     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.h r10 = (com.google.android.apps.p489g.p493c.C9135h) r10     // Catch:{ all -> 0x011f }
            int r11 = r10.f31443a     // Catch:{ all -> 0x011f }
            r11 = r11 | 2
            r10.f31443a = r11     // Catch:{ all -> 0x011f }
            r10.f31445c = r2     // Catch:{ all -> 0x011f }
            if (r20 == 0) goto L_0x0087
            com.google.protobuf.z r10 = com.google.protobuf.C63088z.m96139A(r20)     // Catch:{ all -> 0x011f }
            r9.copyOnWrite()     // Catch:{ all -> 0x011f }
            com.google.protobuf.bv r11 = r9.instance     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.h r11 = (com.google.android.apps.p489g.p493c.C9135h) r11     // Catch:{ all -> 0x011f }
            int r13 = r11.f31443a     // Catch:{ all -> 0x011f }
            r13 = r13 | 4
            r11.f31443a = r13     // Catch:{ all -> 0x011f }
            r11.f31446d = r10     // Catch:{ all -> 0x011f }
            goto L_0x009a
        L_0x0087:
            r9.copyOnWrite()     // Catch:{ all -> 0x011f }
            com.google.protobuf.bv r10 = r9.instance     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.h r10 = (com.google.android.apps.p489g.p493c.C9135h) r10     // Catch:{ all -> 0x011f }
            int r11 = r10.f31443a     // Catch:{ all -> 0x011f }
            r11 = r11 & -5
            r10.f31443a = r11     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.h r11 = com.google.android.apps.p489g.p493c.C9135h.f31441e     // Catch:{ all -> 0x011f }
            com.google.protobuf.z r11 = r11.f31446d     // Catch:{ all -> 0x011f }
            r10.f31446d = r11     // Catch:{ all -> 0x011f }
        L_0x009a:
            r7.copyOnWrite()     // Catch:{ all -> 0x011f }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.b r10 = (com.google.android.apps.p489g.p493c.C9129b) r10     // Catch:{ all -> 0x011f }
            com.google.protobuf.bv r9 = r9.build()     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.h r9 = (com.google.android.apps.p489g.p493c.C9135h) r9     // Catch:{ all -> 0x011f }
            r9.getClass()     // Catch:{ all -> 0x011f }
            r10.mo17435b()     // Catch:{ all -> 0x011f }
            com.google.protobuf.cq r10 = r10.f31420c     // Catch:{ all -> 0x011f }
            r10.set(r8, r9)     // Catch:{ all -> 0x011f }
            r9 = 1
            r10 = 1
        L_0x00b4:
            int r8 = r8 + 1
            goto L_0x0023
        L_0x00b8:
            if (r9 != 0) goto L_0x0110
            com.google.android.apps.g.c.h r4 = com.google.android.apps.p489g.p493c.C9135h.f31441e     // Catch:{ all -> 0x011f }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.g r4 = (com.google.android.apps.p489g.p493c.C9134g) r4     // Catch:{ all -> 0x011f }
            r4.copyOnWrite()     // Catch:{ all -> 0x011f }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.h r5 = (com.google.android.apps.p489g.p493c.C9135h) r5     // Catch:{ all -> 0x011f }
            int r8 = r5.f31443a     // Catch:{ all -> 0x011f }
            r8 = r8 | 2
            r5.f31443a = r8     // Catch:{ all -> 0x011f }
            r5.f31445c = r2     // Catch:{ all -> 0x011f }
            r4.copyOnWrite()     // Catch:{ all -> 0x011f }
            com.google.protobuf.bv r2 = r4.instance     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.h r2 = (com.google.android.apps.p489g.p493c.C9135h) r2     // Catch:{ all -> 0x011f }
            r18.getClass()     // Catch:{ all -> 0x011f }
            r2.f31444b = r0     // Catch:{ all -> 0x011f }
            int r0 = r2.f31443a     // Catch:{ all -> 0x011f }
            r0 = r0 | r12
            r2.f31443a = r0     // Catch:{ all -> 0x011f }
            if (r20 == 0) goto L_0x00f7
            com.google.protobuf.z r0 = com.google.protobuf.C63088z.m96139A(r20)     // Catch:{ all -> 0x011f }
            r4.copyOnWrite()     // Catch:{ all -> 0x011f }
            com.google.protobuf.bv r2 = r4.instance     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.h r2 = (com.google.android.apps.p489g.p493c.C9135h) r2     // Catch:{ all -> 0x011f }
            int r3 = r2.f31443a     // Catch:{ all -> 0x011f }
            r3 = r3 | 4
            r2.f31443a = r3     // Catch:{ all -> 0x011f }
            r2.f31446d = r0     // Catch:{ all -> 0x011f }
        L_0x00f7:
            r7.copyOnWrite()     // Catch:{ all -> 0x011f }
            com.google.protobuf.bv r0 = r7.instance     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.b r0 = (com.google.android.apps.p489g.p493c.C9129b) r0     // Catch:{ all -> 0x011f }
            com.google.protobuf.bv r2 = r4.build()     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.h r2 = (com.google.android.apps.p489g.p493c.C9135h) r2     // Catch:{ all -> 0x011f }
            r2.getClass()     // Catch:{ all -> 0x011f }
            r0.mo17435b()     // Catch:{ all -> 0x011f }
            com.google.protobuf.cq r0 = r0.f31420c     // Catch:{ all -> 0x011f }
            r0.add(r2)     // Catch:{ all -> 0x011f }
            goto L_0x0112
        L_0x0110:
            if (r10 == 0) goto L_0x011d
        L_0x0112:
            com.google.protobuf.bv r0 = r7.build()     // Catch:{ all -> 0x011f }
            com.google.android.apps.g.c.b r0 = (com.google.android.apps.p489g.p493c.C9129b) r0     // Catch:{ all -> 0x011f }
            r1.f255220f = r0     // Catch:{ all -> 0x011f }
            r15.mo85842g()     // Catch:{ all -> 0x011f }
        L_0x011d:
            monitor-exit(r6)     // Catch:{ all -> 0x011f }
            return
        L_0x011f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x011f }
            goto L_0x0123
        L_0x0122:
            throw r0
        L_0x0123:
            goto L_0x0122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.notifications.C91500ao.mo85846k(long, com.google.ai.b.kj, boolean, byte[]):void");
    }

    /* renamed from: l */
    public final boolean mo85847l(C7718hj hjVar) {
        boolean z = false;
        if (!mo85848n()) {
            return false;
        }
        synchronized (this.f255221g) {
            ArrayList arrayList = new ArrayList(this.f255220f.f31419b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C7718hj hjVar2 = ((C9133f) it.next()).f31432b;
                if (hjVar2 == null) {
                    hjVar2 = C7718hj.f26927af;
                }
                if (m149648m(hjVar, hjVar2)) {
                    it.remove();
                    z = true;
                }
            }
            if (z) {
                C9128a aVar = (C9128a) this.f255220f.toBuilder();
                aVar.copyOnWrite();
                ((C9129b) aVar.instance).f31419b = C9129b.emptyProtobufList();
                aVar.mo17430b(arrayList);
                this.f255220f = (C9129b) aVar.build();
                mo85842g();
            }
        }
        return z;
    }

    /* renamed from: n */
    public final boolean mo85848n() {
        C90748e.m148224b();
        if (!this.f255224l.getAndSet(true)) {
            C90748e.m148224b();
            C58833ax axVar = (C58833ax) C60856cj.m92910s(this.f255218d.mo77585d());
            if (!axVar.mo56113h()) {
                ((C59052c) ((C59052c) f255213a.mo56226d()).mo56372aa(11644)).mo56386p("Error reading notifications from disk");
                this.f255220f = C9129b.f31416f;
            } else {
                C9128a aVar = (C9128a) ((C9129b) axVar.mo56107c()).toBuilder();
                ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((C9129b) aVar.instance).f31419b));
                C58570jy.m90171w(C58570jy.m90161m(arrayList.iterator(), f255215i), f255214h);
                if (arrayList.size() != ((C9129b) aVar.instance).f31419b.size()) {
                    aVar.copyOnWrite();
                    ((C9129b) aVar.instance).f31419b = C9129b.emptyProtobufList();
                    aVar.mo17430b(arrayList);
                }
                ArrayList arrayList2 = new ArrayList(0);
                long b = this.f255216b.mo26870b() / 1000;
                ArrayList arrayList3 = new ArrayList(Collections.unmodifiableList(((C9129b) aVar.instance).f31419b));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    C9133f fVar = (C9133f) it.next();
                    C7718hj hjVar = fVar.f31432b;
                    if (hjVar == null) {
                        hjVar = C7718hj.f26927af;
                    }
                    C7874nd ndVar = hjVar.f26938J;
                    if (ndVar == null) {
                        ndVar = C7874nd.f27577J;
                    }
                    C91525bj f = C91525bj.m149693f(ndVar);
                    if (f != null && f.mo85863b(fVar, b, Collections.unmodifiableList(((C9129b) aVar.instance).f31420c))) {
                        it.remove();
                        m149647e(arrayList2, fVar.f31438h);
                    }
                }
                if (arrayList3.size() != ((C9129b) aVar.instance).f31419b.size()) {
                    aVar.copyOnWrite();
                    ((C9129b) aVar.instance).f31419b = C9129b.emptyProtobufList();
                    aVar.mo17430b(arrayList3);
                }
                if (!arrayList2.isEmpty()) {
                    this.f255217c.mo85853d(arrayList2);
                }
                long b2 = this.f255216b.mo26870b();
                ArrayList arrayList4 = new ArrayList(Collections.unmodifiableList(((C9129b) aVar.instance).f31420c));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    if (((C9135h) it2.next()).f31445c * 1000 < b2) {
                        it2.remove();
                    }
                }
                if (arrayList4.size() != ((C9129b) aVar.instance).f31420c.size()) {
                    aVar.copyOnWrite();
                    ((C9129b) aVar.instance).f31420c = C9129b.emptyProtobufList();
                    aVar.mo17431c(arrayList4);
                }
                this.f255220f = (C9129b) aVar.build();
            }
            this.f255225m.countDown();
        } else {
            try {
                this.f255225m.await();
            } catch (InterruptedException unused) {
                ((C59052c) ((C59052c) f255213a.mo56226d()).mo56372aa(11653)).mo56386p("Initialization latch wait interrupted");
                Thread.currentThread().interrupt();
                return false;
            }
        }
        return true;
    }
}
