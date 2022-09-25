package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import android.service.notification.StatusBarNotification;
import androidx.core.app.C1791ah;
import com.google.android.apps.gsa.shared.bisto.C89619aq;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.C89683v;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90382p;
import com.google.android.apps.gsa.shared.notificationlistening.common.GroupDataKey;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.aj */
/* compiled from: PG */
public final class C95589aj implements C89683v {

    /* renamed from: a */
    public static final C59071e f267501a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.d.aj");

    /* renamed from: b */
    public final C60888db f267502b;

    /* renamed from: c */
    public final C89656k f267503c;

    /* renamed from: d */
    public final C95609e f267504d;

    /* renamed from: e */
    public final C95598as f267505e;

    /* renamed from: f */
    public final C95626v f267506f;

    /* renamed from: g */
    public final Object f267507g = new Object();

    /* renamed from: h */
    public final boolean f267508h;

    /* renamed from: i */
    public C60870cx f267509i;

    /* renamed from: j */
    public Long f267510j;

    /* renamed from: k */
    public final C60836bq f267511k = new C60836bq();

    /* renamed from: l */
    private final C21370a f267512l;

    /* renamed from: m */
    private final Map f267513m = new HashMap(8);

    public C95589aj(C60888db dbVar, C21370a aVar, C89656k kVar, C95609e eVar, C95598as asVar, C95626v vVar, boolean z) {
        this.f267502b = dbVar;
        this.f267512l = aVar;
        this.f267503c = kVar;
        this.f267504d = eVar;
        this.f267505e = asVar;
        this.f267506f = vVar;
        this.f267508h = z;
    }

    /* renamed from: e */
    public static boolean m158252e(StatusBarNotification statusBarNotification) {
        return statusBarNotification.getNotification().getGroup() != null && C1791ah.m4935c(statusBarNotification.getNotification());
    }

    /* renamed from: h */
    private final void m158253h(C95587ah ahVar, boolean z, C95588ai aiVar) {
        if (ahVar.f267490c == null) {
            C59104x d = f267501a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotificationStaging");
            ((C59052c) ((C59052c) d).mo56372aa(16223)).mo56386p("associate with no group key");
            int i = C90755l.f253831a;
            return;
        }
        synchronized (this.f267507g) {
            for (Map.Entry value : this.f267513m.entrySet()) {
                for (C95587ah ahVar2 : (List) value.getValue()) {
                    if (z == m158252e(ahVar2.f267488a.f252393a) && ahVar.f267490c.equals(ahVar2.f267490c)) {
                        if (z) {
                            C58976aa aaVar = C58975e.f156826a;
                            ahVar2.mo89522b();
                            ahVar.mo89523c();
                        } else {
                            C58976aa aaVar2 = C58975e.f156826a;
                            ahVar2.mo89523c();
                            ahVar.mo89522b();
                        }
                        aiVar.mo89526a(ahVar2);
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private final void m158254i() {
        synchronized (this.f267507g) {
            this.f267510j = null;
            C60870cx cxVar = this.f267509i;
            if (cxVar != null) {
                cxVar.cancel(false);
            }
            this.f267509i = null;
        }
    }

    /* renamed from: j */
    private final void m158255j(C95588ai aiVar) {
        long j;
        synchronized (this.f267507g) {
            if (!aiVar.mo89527b()) {
                if (aiVar.f267498a == null) {
                    synchronized (this.f267507g) {
                        if (this.f267513m.isEmpty()) {
                            m158254i();
                            return;
                        }
                        return;
                    }
                }
            }
            if (aiVar.mo89527b()) {
                this.f267502b.execute(new C95582ac(this));
                return;
            }
            Long l = aiVar.f267498a;
            if (l == null) {
                C59104x d = f267501a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "NotificationStaging");
                ((C59052c) ((C59052c) d).mo56372aa(16219)).mo56386p("no expiry time");
                int i = C90755l.f253831a;
                j = 0;
            } else {
                j = l.longValue();
            }
            Long l2 = this.f267510j;
            if (l2 == null || l2.longValue() > j) {
                m158254i();
                long max = Math.max(0, j - this.f267512l.mo26871c());
                C58976aa aaVar = C58975e.f156826a;
                this.f267510j = Long.valueOf(j);
                this.f267509i = this.f267502b.mo29164d(new C95583ad(this), max, TimeUnit.MILLISECONDS);
                return;
            }
            C58976aa aaVar2 = C58975e.f156826a;
        }
    }

    /* renamed from: b */
    public final void mo89528b() {
        synchronized (this.f267507g) {
            this.f267513m.clear();
        }
        m158254i();
    }

    /* renamed from: c */
    public final void mo89529c(List list) {
        if (this.f267503c.mo83555j(155)) {
            mo89531f(list);
        } else {
            this.f267511k.mo57304a(new C95584ae(this, list), this.f267502b);
        }
    }

    /* renamed from: d */
    public final void mo89530d() {
        synchronized (this.f267507g) {
            ArrayList arrayList = new ArrayList(1);
            HashSet hashSet = new HashSet(1);
            ArrayList<C90367af> arrayList2 = new ArrayList<>(1);
            HashSet<GroupDataKey> hashSet2 = new HashSet<>(1);
            C95588ai aiVar = new C95588ai(this.f267512l);
            Iterator it = this.f267513m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                ArrayList arrayList3 = new ArrayList(1);
                for (C95587ah ahVar : (List) entry.getValue()) {
                    if (!ahVar.mo89524d(this.f267512l)) {
                        if (ahVar.mo89521a() == null) {
                            C59104x d = f267501a.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "NotificationStaging");
                            ((C59052c) ((C59052c) d).mo56372aa(16226)).mo56386p("event with no expiry");
                            int i = C90755l.f253831a;
                        } else {
                            aiVar.mo89526a(ahVar);
                            arrayList3.add(ahVar);
                        }
                    } else if (!ahVar.f267492e || !ahVar.f267495h) {
                        if (ahVar.f267489b) {
                            arrayList.add(ahVar.f267488a);
                        } else {
                            hashSet.add(ahVar.f267488a.f252393a.getKey());
                        }
                    } else if (ahVar.f267489b) {
                        arrayList2.add(ahVar.f267488a);
                    } else {
                        GroupDataKey groupDataKey = ahVar.f267490c;
                        if (groupDataKey == null) {
                            C59104x d2 = f267501a.mo56226d();
                            d2.mo56378ag(C58975e.f156826a, "NotificationStaging");
                            ((C59052c) ((C59052c) d2).mo56372aa(16225)).mo56386p("event with no group");
                            int i2 = C90755l.f253831a;
                        } else {
                            hashSet2.add(groupDataKey);
                        }
                    }
                }
                if (arrayList3.isEmpty()) {
                    it.remove();
                } else {
                    this.f267513m.put((String) entry.getKey(), arrayList3);
                }
            }
            C58976aa aaVar = C58975e.f156826a;
            hashSet.size();
            hashSet2.size();
            arrayList.size();
            arrayList2.size();
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (hashSet2.contains(new GroupDataKey(((C90367af) arrayList2.get(size)).f252393a))) {
                    arrayList2.remove(size);
                }
            }
            if (!arrayList2.isEmpty()) {
                C95626v vVar = this.f267506f;
                for (C90367af afVar : arrayList2) {
                    StatusBarNotification statusBarNotification = afVar.f252393a;
                    GroupDataKey groupDataKey2 = new GroupDataKey(statusBarNotification);
                    C90382p pVar = (C90382p) vVar.f267627b.get(groupDataKey2);
                    if (pVar == null) {
                        vVar.mo89580d(statusBarNotification.getKey());
                        pVar = new C90382p(vVar.f267631f, vVar.f267629d, vVar.f267630e, afVar);
                    } else {
                        if (!pVar.f252434e.equals(statusBarNotification.getKey())) {
                            vVar.mo89580d(statusBarNotification.getKey());
                        }
                        pVar.mo84085a(vVar.f267631f, vVar.f267629d, afVar);
                        vVar.f267628c.mo89577c(vVar, C95626v.f267626a);
                    }
                    vVar.f267627b.put(groupDataKey2, pVar);
                }
            }
            int size2 = arrayList.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                } else if (hashSet.contains(((C90367af) arrayList.get(size2)).f252393a.getKey())) {
                    arrayList.remove(size2);
                }
            }
            if (!arrayList.isEmpty()) {
                C95609e eVar = this.f267504d;
                List a = eVar.mo89562a(arrayList, this.f267508h);
                if (!a.isEmpty()) {
                    eVar.f267570a.mo89542f(a);
                }
            }
            if (!hashSet2.isEmpty()) {
                C95626v vVar2 = this.f267506f;
                for (GroupDataKey remove : hashSet2) {
                    vVar2.f267627b.remove(remove);
                }
            }
            if (!hashSet.isEmpty()) {
                C95598as asVar = this.f267505e;
                asVar.f267533d.mo89592o(new C95592am(asVar, hashSet));
            }
            m158255j(aiVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0125  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89531f(java.util.List r11) {
        /*
            r10 = this;
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.ai r0 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.d.ai
            com.google.android.libraries.f.a r1 = r10.f267512l
            r0.<init>(r1)
            java.lang.Object r1 = r10.f267507g
            monitor-enter(r1)
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x015e }
        L_0x0015:
            boolean r2 = r11.hasNext()     // Catch:{ all -> 0x015e }
            if (r2 == 0) goto L_0x0157
            java.lang.Object r2 = r11.next()     // Catch:{ all -> 0x015e }
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.af r2 = (com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af) r2     // Catch:{ all -> 0x015e }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.ah r9 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.d.ah     // Catch:{ all -> 0x015e }
            r6 = 1
            com.google.android.libraries.f.a r3 = r10.f267512l     // Catch:{ all -> 0x015e }
            long r7 = r3.mo26871c()     // Catch:{ all -> 0x015e }
            r3 = r9
            r4 = r10
            r5 = r2
            r3.<init>(r4, r5, r6, r7)     // Catch:{ all -> 0x015e }
            boolean r3 = r9.f267492e     // Catch:{ all -> 0x015e }
            if (r3 != 0) goto L_0x0035
            goto L_0x0096
        L_0x0035:
            com.google.android.apps.gsa.shared.notificationlistening.common.GroupDataKey r3 = r9.f267490c     // Catch:{ all -> 0x015e }
            if (r3 != 0) goto L_0x0050
            com.google.common.f.e r3 = f267501a     // Catch:{ all -> 0x015e }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x015e }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015e }
            java.lang.String r5 = "NotificationStaging"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x015e }
            java.lang.String r4 = "tryAndAssociateWithChild with no group key"
            r5 = 16231(0x3f67, float:2.2744E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)     // Catch:{ all -> 0x015e }
            int r3 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x015e }
            goto L_0x0096
        L_0x0050:
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.as r4 = r10.f267505e     // Catch:{ all -> 0x015e }
            java.util.Map r4 = r4.f267532c     // Catch:{ all -> 0x015e }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x015e }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x015e }
        L_0x005c:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x015e }
            if (r5 == 0) goto L_0x0090
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x015e }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.aq r5 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95596aq) r5     // Catch:{ all -> 0x015e }
            java.util.List r5 = r5.f267524b     // Catch:{ all -> 0x015e }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x015e }
        L_0x006e:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x015e }
            if (r6 == 0) goto L_0x005c
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x015e }
            com.google.android.apps.gsa.shared.notificationlistening.common.b r6 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r6     // Catch:{ all -> 0x015e }
            boolean r7 = r6.f252596q     // Catch:{ all -> 0x015e }
            if (r7 != 0) goto L_0x006e
            boolean r7 = r6.f252583d     // Catch:{ all -> 0x015e }
            if (r7 == 0) goto L_0x006e
            com.google.android.apps.gsa.shared.notificationlistening.common.GroupDataKey r6 = r6.f252588i     // Catch:{ all -> 0x015e }
            boolean r6 = r3.equals(r6)     // Catch:{ all -> 0x015e }
            if (r6 == 0) goto L_0x006e
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015e }
            r9.mo89522b()     // Catch:{ all -> 0x015e }
            goto L_0x0096
        L_0x0090:
            r3 = 0
            r10.m158253h(r9, r3, r0)     // Catch:{ all -> 0x015e }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015e }
        L_0x0096:
            boolean r3 = r9.f267493f     // Catch:{ all -> 0x015e }
            r4 = 1
            if (r3 != 0) goto L_0x009c
            goto L_0x00d2
        L_0x009c:
            com.google.android.apps.gsa.shared.notificationlistening.common.GroupDataKey r3 = r9.f267490c     // Catch:{ all -> 0x015e }
            if (r3 != 0) goto L_0x00b7
            com.google.common.f.e r3 = f267501a     // Catch:{ all -> 0x015e }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x015e }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015e }
            java.lang.String r6 = "NotificationStaging"
            r3.mo56378ag(r5, r6)     // Catch:{ all -> 0x015e }
            java.lang.String r5 = "tryAndAssociateWithParent with no group key"
            r6 = 16234(0x3f6a, float:2.2749E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r6)).mo56386p(r5)     // Catch:{ all -> 0x015e }
            int r3 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x015e }
            goto L_0x00d2
        L_0x00b7:
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.v r5 = r10.f267506f     // Catch:{ all -> 0x015e }
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.af r6 = r9.f267488a     // Catch:{ all -> 0x015e }
            android.service.notification.StatusBarNotification r6 = r6.f252393a     // Catch:{ all -> 0x015e }
            long r6 = r6.getPostTime()     // Catch:{ all -> 0x015e }
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.o r3 = r5.mo84075a(r3, r6)     // Catch:{ all -> 0x015e }
            if (r3 == 0) goto L_0x00cd
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015e }
            r9.mo89523c()     // Catch:{ all -> 0x015e }
            goto L_0x00d2
        L_0x00cd:
            r10.m158253h(r9, r4, r0)     // Catch:{ all -> 0x015e }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015e }
        L_0x00d2:
            boolean r3 = r9.f267489b     // Catch:{ all -> 0x015e }
            if (r3 == 0) goto L_0x00df
            boolean r5 = r9.f267492e     // Catch:{ all -> 0x015e }
            if (r5 == 0) goto L_0x00df
            boolean r5 = r9.f267495h     // Catch:{ all -> 0x015e }
            if (r5 != 0) goto L_0x00df
            goto L_0x00ea
        L_0x00df:
            if (r3 == 0) goto L_0x00f9
            boolean r3 = r9.f267493f     // Catch:{ all -> 0x015e }
            if (r3 == 0) goto L_0x00f9
            boolean r3 = r9.f267496i     // Catch:{ all -> 0x015e }
            if (r3 == 0) goto L_0x00ea
            goto L_0x00f9
        L_0x00ea:
            com.google.android.apps.gsa.shared.bisto.k r3 = r10.f267503c     // Catch:{ all -> 0x015e }
            java.lang.String r5 = "ann_wait_for_parent_or_child_time_msec"
            long r5 = r3.mo83546a(r5)     // Catch:{ all -> 0x015e }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x015e }
            r9.f267494g = r3     // Catch:{ all -> 0x015e }
            goto L_0x010f
        L_0x00f9:
            android.service.notification.StatusBarNotification r3 = r2.f252393a     // Catch:{ all -> 0x015e }
            boolean r3 = m158252e(r3)     // Catch:{ all -> 0x015e }
            if (r3 != 0) goto L_0x010f
            com.google.android.apps.gsa.shared.bisto.k r3 = r10.f267503c     // Catch:{ all -> 0x015e }
            java.lang.String r5 = "ann_add_delay_time_msec"
            long r5 = r3.mo83546a(r5)     // Catch:{ all -> 0x015e }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x015e }
            r9.f267494g = r3     // Catch:{ all -> 0x015e }
        L_0x010f:
            android.service.notification.StatusBarNotification r2 = r2.f252393a     // Catch:{ all -> 0x015e }
            java.lang.String r2 = r2.getKey()     // Catch:{ all -> 0x015e }
            java.util.Map r3 = r10.f267513m     // Catch:{ all -> 0x015e }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x015e }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x015e }
            if (r3 != 0) goto L_0x0125
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x015e }
            r3.<init>(r4)     // Catch:{ all -> 0x015e }
            goto L_0x014a
        L_0x0125:
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x015e }
            if (r4 != 0) goto L_0x014a
            int r4 = r3.size()     // Catch:{ all -> 0x015e }
            int r4 = r4 + -1
            java.lang.Object r4 = r3.get(r4)     // Catch:{ all -> 0x015e }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.ah r4 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95587ah) r4     // Catch:{ all -> 0x015e }
            boolean r4 = r4.mo89525e()     // Catch:{ all -> 0x015e }
            if (r4 == 0) goto L_0x014a
            int r4 = r3.size()     // Catch:{ all -> 0x015e }
            int r4 = r4 + -1
            java.lang.Object r4 = r3.get(r4)     // Catch:{ all -> 0x015e }
            r3.remove(r4)     // Catch:{ all -> 0x015e }
        L_0x014a:
            r3.add(r9)     // Catch:{ all -> 0x015e }
            java.util.Map r4 = r10.f267513m     // Catch:{ all -> 0x015e }
            r4.put(r2, r3)     // Catch:{ all -> 0x015e }
            r0.mo89526a(r9)     // Catch:{ all -> 0x015e }
            goto L_0x0015
        L_0x0157:
            monitor-exit(r1)     // Catch:{ all -> 0x015e }
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.m158255j(r0)
            return
        L_0x015e:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x015e }
            goto L_0x0162
        L_0x0161:
            throw r11
        L_0x0162:
            goto L_0x0161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95589aj.mo89531f(java.util.List):void");
    }

    /* renamed from: g */
    public final void mo89532g(C90367af afVar) {
        C95587ah ahVar = new C95587ah(this, afVar, false, this.f267512l.mo26871c());
        ahVar.f267494g = Long.valueOf(this.f267503c.mo83546a("ann_remove_delay_time_msec"));
        String key = afVar.f252393a.getKey();
        C95588ai aiVar = new C95588ai(this.f267512l);
        synchronized (this.f267507g) {
            List list = (List) this.f267513m.get(key);
            if (list == null || list.size() != 1 || !((C95587ah) list.get(0)).mo89525e()) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(ahVar);
                aiVar.mo89526a(ahVar);
                this.f267513m.put(key, arrayList);
                C58976aa aaVar = C58975e.f156826a;
                m158255j(aiVar);
                return;
            }
            C58976aa aaVar2 = C58975e.f156826a;
        }
    }

    /* renamed from: iq */
    public final void mo83403iq(C89619aq aqVar, boolean z) {
        boolean z2;
        Long l;
        Set<Map.Entry> entrySet;
        synchronized (this.f267507g) {
            z2 = this.f267509i != null;
            l = this.f267510j;
            entrySet = this.f267513m.entrySet();
        }
        aqVar.println("Staging: has nextProcessingFuture=" + z2 + ", nextProcessingTimestamp=" + l);
        for (Map.Entry entry : entrySet) {
            int size = ((List) entry.getValue()).size();
            aqVar.println("  Entry: key=" + ((String) entry.getKey()) + ", # events=" + size);
            for (C95587ah ahVar : (List) entry.getValue()) {
                boolean z3 = ahVar.f267489b;
                String valueOf = String.valueOf(ahVar.f267490c);
                long j = ahVar.f267491d;
                Long l2 = ahVar.f267494g;
                boolean z4 = ahVar.f267492e;
                boolean z5 = ahVar.f267495h;
                boolean z6 = ahVar.f267493f;
                boolean z7 = ahVar.f267496i;
                aqVar.println("    Event: isAdd=" + z3 + ", groupKey=" + valueOf + ", eventCreationTime=" + j + ", delayTime=" + l2 + ", wantsChild=" + z4 + ", foundChild=" + z5 + ", wantsParent=" + z6 + ", foundParent=" + z7);
            }
        }
    }
}
