package com.google.android.apps.gsa.shared.bisto;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.notificationlistener.C83390g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36600c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.bisto.at */
/* compiled from: PG */
public final class C89622at {

    /* renamed from: a */
    static final long f242699a = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: d */
    private static final C59071e f242700d = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.at");

    /* renamed from: b */
    public final Object f242701b = new Object();

    /* renamed from: c */
    public C83390g f242702c;

    /* renamed from: e */
    private final C22871g f242703e;

    public C89622at(C22871g gVar) {
        this.f242703e = gVar;
    }

    /* renamed from: a */
    public final int mo83486a() {
        synchronized (this.f242701b) {
            int i = 0;
            try {
                C83390g gVar = this.f242702c;
                if (gVar != null) {
                    i = gVar.mo76690a().getCurrentInterruptionFilter();
                }
                return i;
            } catch (C36600c e) {
                e = e;
                C59104x c = f242700d.mo56225c();
                c.mo56378ag(C58975e.f156826a, "NotifListenerAccessor");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10278)).mo56386p("Fail to getCurrentInterruptionFilter");
                return 0;
            } catch (SecurityException e2) {
                e = e2;
                C59104x c2 = f242700d.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "NotifListenerAccessor");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(10278)).mo56386p("Fail to getCurrentInterruptionFilter");
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final NotificationListenerService.RankingMap mo83487b() {
        synchronized (this.f242701b) {
            NotificationListenerService.RankingMap rankingMap = null;
            try {
                C83390g gVar = this.f242702c;
                if (gVar != null) {
                    rankingMap = gVar.mo76690a().getCurrentRanking();
                }
                return rankingMap;
            } catch (C36600c e) {
                e = e;
                C59104x c = f242700d.mo56225c();
                c.mo56378ag(C58975e.f156826a, "NotifListenerAccessor");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10279)).mo56386p("Fail to getCurrentRanking");
                return null;
            } catch (SecurityException e2) {
                e = e2;
                C59104x c2 = f242700d.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "NotifListenerAccessor");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(10279)).mo56386p("Fail to getCurrentRanking");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void mo83488c() {
        synchronized (this.f242701b) {
            C83390g gVar = this.f242702c;
            if (gVar != null) {
                gVar.mo76691b();
                this.f242702c = null;
            }
        }
    }

    /* renamed from: d */
    public final void mo83489d() {
        synchronized (this.f242701b) {
            this.f242702c = null;
        }
    }

    /* renamed from: e */
    public final void mo83490e(int i, int i2) {
        if (i2 <= 0) {
            C59104x d = f242700d.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotifListenerAccessor");
            ((C59052c) ((C59052c) d).mo56372aa(10281)).mo56386p("Ran out of retries when requesting listener hints!");
            return;
        }
        synchronized (this.f242701b) {
            C83390g gVar = this.f242702c;
            if (gVar != null) {
                try {
                    gVar.mo76690a().requestListenerHints(i);
                } catch (C36600c | SecurityException e) {
                    C59104x c = f242700d.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "NotifListenerAccessor");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10280)).mo56386p("Fail to requestListenerHints");
                }
            } else {
                this.f242703e.mo28213m("request-hints", f242699a, new C89621as(this, i, i2));
            }
        }
    }

    /* renamed from: f */
    public final boolean mo83491f(String str, NotificationListenerService.RankingMap rankingMap) {
        if (rankingMap != null) {
            NotificationListenerService.Ranking ranking = new NotificationListenerService.Ranking();
            if (rankingMap.getRanking(str, ranking)) {
                return ranking.matchesInterruptionFilter();
            }
        }
        int a = mo83486a();
        return a == 1 || a == 0;
    }

    /* renamed from: g */
    public final StatusBarNotification[] mo83492g() {
        synchronized (this.f242701b) {
            StatusBarNotification[] statusBarNotificationArr = null;
            try {
                C83390g gVar = this.f242702c;
                if (gVar != null) {
                    statusBarNotificationArr = gVar.mo76690a().getActiveNotifications();
                }
                return statusBarNotificationArr;
            } catch (C36600c e) {
                e = e;
                C59104x c = f242700d.mo56225c();
                c.mo56378ag(C58975e.f156826a, "NotifListenerAccessor");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10283)).mo56386p("Fail to getActiveNotifications");
                return null;
            } catch (SecurityException e2) {
                e = e2;
                C59104x c2 = f242700d.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "NotifListenerAccessor");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(10283)).mo56386p("Fail to getActiveNotifications");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: h */
    public final void mo83493h(C83390g gVar) {
        synchronized (this.f242701b) {
            this.f242702c = gVar;
        }
    }
}
