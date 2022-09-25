package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import android.content.Context;
import android.net.Uri;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.notificationlistener.C83390g;
import com.google.android.apps.gsa.shared.bisto.C89622at;
import com.google.android.apps.gsa.shared.notificationlistening.collection.C90414u;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36599b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.az */
/* compiled from: PG */
public final class C95605az implements C36599b {

    /* renamed from: a */
    static final long f267551a = TimeUnit.HOURS.toMillis(1);

    /* renamed from: c */
    public static final /* synthetic */ int f267552c = 0;

    /* renamed from: d */
    private static final C59071e f267553d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.d.az");

    /* renamed from: b */
    public final C89622at f267554b;

    /* renamed from: e */
    private final Context f267555e;

    /* renamed from: f */
    private final C21370a f267556f;

    /* renamed from: g */
    private final C95589aj f267557g;

    /* renamed from: h */
    private final C95602aw f267558h;

    /* renamed from: i */
    private final Set f267559i;

    /* renamed from: j */
    private final AtomicBoolean f267560j = new AtomicBoolean();

    /* renamed from: k */
    private final AtomicBoolean f267561k = new AtomicBoolean();

    /* renamed from: l */
    private final AtomicLong f267562l = new AtomicLong(Long.MAX_VALUE);

    public C95605az(Context context, C21370a aVar, C89622at atVar, C95589aj ajVar, C95602aw awVar, Set set) {
        this.f267555e = context;
        this.f267556f = aVar;
        this.f267554b = atVar;
        this.f267557g = ajVar;
        this.f267558h = awVar;
        this.f267559i = set;
    }

    /* renamed from: i */
    private static C90367af m158286i(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        Uri uri = null;
        if (rankingMap == null) {
            return new C90367af(statusBarNotification, (Integer) null, (Uri) null);
        }
        NotificationListenerService.Ranking ranking = new NotificationListenerService.Ranking();
        if (!rankingMap.getRanking(statusBarNotification.getKey(), ranking)) {
            C59104x b = f267553d.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SharedNotifListener");
            ((C59052c) ((C59052c) b).mo56372aa(16291)).mo56386p("No ranking for notification");
            return new C90367af(statusBarNotification, (Integer) null, (Uri) null);
        }
        int importance = ranking.getImportance();
        if (ranking.getChannel() != null) {
            uri = ranking.getChannel().getSound();
        }
        return new C90367af(statusBarNotification, Integer.valueOf(importance), uri);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x003e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0019  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m158287j(android.service.notification.NotificationListenerService.RankingMap r9, android.service.notification.StatusBarNotification... r10) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r10.length
            r2 = 0
        L_0x0007:
            if (r2 >= r1) goto L_0x0098
            r3 = r10[r2]
            java.util.Set r4 = r8.f267559i
            java.util.Iterator r4 = r4.iterator()
        L_0x0011:
            boolean r5 = r4.hasNext()
            java.lang.String r6 = "SharedNotifListener"
            if (r5 == 0) goto L_0x003e
            java.lang.Object r5 = r4.next()
            com.google.android.apps.gsa.staticplugins.bisto.notifications.c.b r5 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7501c.C95554b) r5
            boolean r7 = r5.mo89447b(r3)
            if (r7 != 0) goto L_0x002b
            boolean r5 = r5.mo89446a(r3)
            if (r5 == 0) goto L_0x0011
        L_0x002b:
            com.google.common.f.e r3 = f267553d
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r6)
            java.lang.String r4 = "Ignoring call."
            r5 = 16296(0x3fa8, float:2.2836E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0094
        L_0x003e:
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.aw r4 = r8.f267558h
            boolean r4 = r4.mo89556f(r3)
            if (r4 == 0) goto L_0x0059
            com.google.common.f.e r3 = f267553d
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r6)
            java.lang.String r4 = "Ignoring alarm."
            r5 = 16295(0x3fa7, float:2.2834E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0094
        L_0x0059:
            boolean r4 = com.google.android.apps.gsa.shared.notificationlistening.collection.C90414u.m147055d(r3)
            if (r4 != 0) goto L_0x0072
            com.google.common.f.e r3 = f267553d
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r6)
            java.lang.String r4 = "Not handling notification."
            r5 = 16294(0x3fa6, float:2.2833E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0094
        L_0x0072:
            android.content.Context r4 = r8.f267555e
            boolean r4 = com.google.android.apps.gsa.shared.notificationlistening.collection.C90414u.m147054c(r4, r3)
            if (r4 == 0) goto L_0x007d
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0094
        L_0x007d:
            boolean r4 = r3.isOngoing()
            if (r4 == 0) goto L_0x0086
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0094
        L_0x0086:
            android.app.Notification r4 = r3.getNotification()
            com.google.android.apps.gsa.shared.notificationlistening.collection.C90414u.m147053b(r4)
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.af r3 = m158286i(r3, r9)
            r0.add(r3)
        L_0x0094:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0098:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95605az.m158287j(android.service.notification.NotificationListenerService$RankingMap, android.service.notification.StatusBarNotification[]):java.util.List");
    }

    /* renamed from: a */
    public final void mo21529a() {
        this.f267554b.mo83488c();
    }

    /* renamed from: b */
    public final void mo21530b(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        this.f267560j.set(false);
        this.f267554b.mo83489d();
        if (!z) {
            this.f267562l.set(this.f267556f.mo26870b());
            C95589aj ajVar = this.f267557g;
            ajVar.mo89528b();
            ajVar.f267506f.mo89579c();
            ajVar.f267505e.mo89544h();
        }
    }

    /* renamed from: c */
    public final void mo21531c(int i) {
    }

    /* renamed from: d */
    public final void mo21532d(int i) {
    }

    /* renamed from: e */
    public final void mo21533e(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        C59104x b = f267553d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SharedNotifListener");
        ((C59052c) ((C59052c) b).mo56372aa(16302)).mo56389s("onNotificationPosted with key: %s", new C95604ay(statusBarNotification));
        this.f267557g.mo89529c(m158287j(rankingMap, statusBarNotification));
    }

    /* renamed from: f */
    public final void mo21534f(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        C59104x b = f267553d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SharedNotifListener");
        ((C59052c) ((C59052c) b).mo56372aa(16303)).mo56389s("onNotificationRemoved with key: %s", new C95603ax(statusBarNotification));
        C90414u.m147053b(statusBarNotification.getNotification());
        if (!this.f267558h.mo89557g(statusBarNotification)) {
            C95589aj ajVar = this.f267557g;
            C90367af i = m158286i(statusBarNotification, rankingMap);
            if (ajVar.f267503c.mo83555j(155)) {
                ajVar.mo89532g(i);
            } else {
                ajVar.f267511k.mo57304a(new C95585af(ajVar, i), ajVar.f267502b);
            }
        }
    }

    /* renamed from: g */
    public final void mo21535g(C83390g gVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f267554b.mo83493h(gVar);
        this.f267560j.set(true);
        mo89558h();
    }

    /* renamed from: h */
    public final void mo89558h() {
        StatusBarNotification[] statusBarNotificationArr;
        if (!this.f267560j.get()) {
            C59104x b = f267553d.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SharedNotifListener");
            ((C59052c) ((C59052c) b).mo56372aa(16298)).mo56386p("Listener not connected, not adding existing notifications.");
            return;
        }
        StatusBarNotification[] g = this.f267554b.mo83492g();
        NotificationListenerService.RankingMap b2 = this.f267554b.mo83487b();
        long b3 = this.f267556f.mo26870b() - f267551a;
        long j = this.f267562l.get();
        if (g == null) {
            statusBarNotificationArr = new StatusBarNotification[0];
        } else {
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : g) {
                if (statusBarNotification != null && statusBarNotification.getPostTime() >= b3 && statusBarNotification.getPostTime() <= j) {
                    arrayList.add(statusBarNotification);
                }
            }
            statusBarNotificationArr = new StatusBarNotification[arrayList.size()];
            arrayList.toArray(statusBarNotificationArr);
        }
        List<C90367af> j2 = m158287j(b2, statusBarNotificationArr);
        C58976aa aaVar = C58975e.f156826a;
        this.f267561k.get();
        j2.size();
        if (this.f267561k.getAndSet(true)) {
            this.f267557g.mo89529c(j2);
            return;
        }
        C95589aj ajVar = this.f267557g;
        ArrayList arrayList2 = new ArrayList(j2.size());
        for (C90367af afVar : j2) {
            if (!C95589aj.m158252e(afVar.f252393a)) {
                arrayList2.add(afVar);
            }
        }
        C95598as asVar = ajVar.f267505e;
        asVar.f267533d.mo89592o(new C95590ak(asVar, new C95586ag(ajVar, arrayList2)));
    }
}
