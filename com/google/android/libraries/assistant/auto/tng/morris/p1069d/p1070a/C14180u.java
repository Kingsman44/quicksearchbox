package com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a;

import android.app.Notification;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.notificationlistener.C83390g;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36477a;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36478b;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36479c;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36480d;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36481e;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36482f;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36485i;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f.C36505a;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f.C36506b;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f.C36507c;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f.C36508d;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f.C36510f;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f.C36511g;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36527a;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36600c;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36601d;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36603f;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36606i;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36608k;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36609l;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36618u;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Executor;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.d.a.u */
/* compiled from: PG */
public final class C14180u implements C36606i {

    /* renamed from: b */
    private static final C59071e f42949b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.d.a.u");

    /* renamed from: a */
    public final C36618u f42950a;

    /* renamed from: c */
    private final C36608k f42951c;

    /* renamed from: d */
    private final C36477a f42952d;

    /* renamed from: e */
    private final C36505a f42953e;

    /* renamed from: f */
    private final Executor f42954f;

    /* renamed from: g */
    private C83390g f42955g;

    public C14180u(C36608k kVar, C36618u uVar, C36477a aVar, C36505a aVar2, Executor executor) {
        this.f42951c = kVar;
        this.f42950a = uVar;
        this.f42952d = aVar;
        this.f42953e = aVar2;
        this.f42954f = executor;
    }

    /* renamed from: h */
    public static boolean m30543h(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        Notification.BubbleMetadata bubbleMetadata;
        if ("ranker_group".equals(statusBarNotification.getTag())) {
            return true;
        }
        NotificationListenerService.Ranking ranking = new NotificationListenerService.Ranking();
        if (rankingMap.getRanking(statusBarNotification.getKey(), ranking) && ranking.isSuspended()) {
            return true;
        }
        if ((statusBarNotification.getNotification().flags & 4096) != 4096 || (bubbleMetadata = statusBarNotification.getNotification().getBubbleMetadata()) == null || !bubbleMetadata.isNotificationSuppressed()) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        return true;
    }

    /* renamed from: i */
    private final void m30544i(int i) {
        C36618u uVar = this.f42950a;
        C36601d dVar = (C36601d) C36603f.f95436c.createBuilder();
        dVar.copyOnWrite();
        C36603f fVar = (C36603f) dVar.instance;
        fVar.f95439b = i - 2;
        fVar.f95438a |= 1;
        C46459k.m82829b(uVar.mo40221a(new C36527a((C36603f) dVar.build(), C58485gu.m89845m())), "Failed to send notification events to clear cache.", new Object[0]);
    }

    /* renamed from: j */
    private final void m30545j(int i, C58485gu guVar) {
        if (this.f42955g == null) {
            C59104x d = f42949b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.NotifObserver");
            ((C59052c) ((C59052c) d).mo56372aa(45854)).mo56386p("Listener not connected.");
            return;
        }
        C36478b bVar = (C36478b) C36485i.f95232e.createBuilder();
        C36479c cVar = (C36479c) C36480d.f95218d.createBuilder();
        cVar.mo40192a();
        bVar.copyOnWrite();
        C36485i iVar = (C36485i) bVar.instance;
        C36480d dVar = (C36480d) cVar.build();
        dVar.getClass();
        iVar.f95236c = dVar;
        iVar.f95234a |= 2;
        C36481e eVar = (C36481e) C36482f.f95223d.createBuilder();
        eVar.mo40193a();
        eVar.copyOnWrite();
        C36482f fVar = (C36482f) eVar.instance;
        fVar.f95225a |= 1;
        fVar.f95227c = true;
        bVar.copyOnWrite();
        C36485i iVar2 = (C36485i) bVar.instance;
        C36482f fVar2 = (C36482f) eVar.build();
        fVar2.getClass();
        iVar2.f95235b = fVar2;
        iVar2.f95234a |= 1;
        C36485i iVar3 = (C36485i) bVar.build();
        C36478b bVar2 = (C36478b) C36485i.f95232e.createBuilder();
        C36479c cVar2 = (C36479c) C36480d.f95218d.createBuilder();
        cVar2.mo40192a();
        cVar2.copyOnWrite();
        C36480d dVar2 = (C36480d) cVar2.instance;
        dVar2.f95220a |= 1;
        dVar2.f95222c = true;
        bVar2.copyOnWrite();
        C36485i iVar4 = (C36485i) bVar2.instance;
        C36480d dVar3 = (C36480d) cVar2.build();
        dVar3.getClass();
        iVar4.f95236c = dVar3;
        iVar4.f95234a |= 2;
        C36481e eVar2 = (C36481e) C36482f.f95223d.createBuilder();
        eVar2.mo40193a();
        bVar2.copyOnWrite();
        C36485i iVar5 = (C36485i) bVar2.instance;
        C36482f fVar3 = (C36482f) eVar2.build();
        fVar3.getClass();
        iVar5.f95235b = fVar3;
        iVar5.f95234a |= 1;
        C36485i iVar6 = (C36485i) bVar2.build();
        C36506b bVar3 = (C36506b) C36511g.f95278c.createBuilder();
        if (i == 4) {
            C36510f fVar4 = C36510f.f95276a;
            bVar3.copyOnWrite();
            C36511g gVar = (C36511g) bVar3.instance;
            fVar4.getClass();
            gVar.f95281b = fVar4;
            gVar.f95280a = 2;
        } else {
            C36507c cVar3 = (C36507c) C36508d.f95271d.createBuilder();
            String b = C39227c.m68658b(C39226b.TAG_ASSISTANT_AUTO_TNG_MORRIS);
            cVar3.copyOnWrite();
            C36508d dVar4 = (C36508d) cVar3.instance;
            b.getClass();
            dVar4.f95273a |= 1;
            dVar4.f95274b = b;
            bVar3.copyOnWrite();
            C36511g gVar2 = (C36511g) bVar3.instance;
            C36508d dVar5 = (C36508d) cVar3.build();
            dVar5.getClass();
            gVar2.f95281b = dVar5;
            gVar2.f95280a = 1;
        }
        C58485gu a = this.f42952d.mo40191a(guVar, iVar3);
        C58485gu a2 = this.f42952d.mo40191a(guVar, iVar6);
        C36505a aVar = this.f42953e;
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(a);
        e.mo55396h(a2);
        C46459k.m82829b(C47633f.m84733g(aVar.mo40207a(e.mo55394f(), (C36511g) bVar3.build())).mo51516i(new C14179t(this, i), this.f42954f), "Failed to send notification events.", new Object[0]);
    }

    /* renamed from: a */
    public final void mo21529a() {
        C58976aa aaVar = C58975e.f156826a;
        C83390g gVar = this.f42955g;
        if (gVar != null) {
            gVar.mo76691b();
        }
        m30544i(6);
    }

    /* renamed from: b */
    public final void mo21530b(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        this.f42955g = null;
        m30544i(7);
    }

    /* renamed from: c */
    public final void mo21531c(int i) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: d */
    public final void mo21532d(int i) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: e */
    public final void mo21533e(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        C58976aa aaVar = C58975e.f156826a;
        if (!m30543h(statusBarNotification, rankingMap)) {
            m30545j(3, C58485gu.m89846n(statusBarNotification));
        }
    }

    /* renamed from: f */
    public final void mo21534f(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        C58976aa aaVar = C58975e.f156826a;
        if (!m30543h(statusBarNotification, rankingMap)) {
            m30545j(4, C58485gu.m89846n(statusBarNotification));
        }
    }

    /* renamed from: g */
    public final void mo21535g(C83390g gVar) {
        C58976aa aaVar = C58975e.f156826a;
        C36609l a = C36609l.m65137a(this.f42951c.f95443b);
        if (a == null) {
            a = C36609l.UNRECOGNIZED;
        }
        a.name();
        this.f42955g = gVar;
        if (gVar != null) {
            try {
                StatusBarNotification[] activeNotifications = gVar.mo76690a().getActiveNotifications();
                NotificationListenerService.RankingMap currentRanking = this.f42955g.mo76690a().getCurrentRanking();
                if (activeNotifications != null) {
                    m30545j(5, (C58485gu) DesugarArrays.stream((T[]) activeNotifications).filter(new C14178s(currentRanking)).collect(C58370cn.f155946a));
                }
            } catch (C36600c e) {
                C59104x d = f42949b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Morris.NotifObserver");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(45852)).mo56386p("Failed to get active notifications");
            }
        } else {
            C59104x d2 = f42949b.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Morris.NotifObserver");
            ((C59052c) ((C59052c) d2).mo56372aa(45853)).mo56386p("Listener not connected.");
        }
    }
}
