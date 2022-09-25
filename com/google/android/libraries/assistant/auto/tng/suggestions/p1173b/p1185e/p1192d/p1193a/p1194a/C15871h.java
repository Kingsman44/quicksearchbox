package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1192d.p1193a.p1194a;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.notificationlistener.C83390g;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16338al;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16340an;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36477a;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36478b;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36479c;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36480d;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36485i;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f.C36505a;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f.C36506b;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f.C36507c;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f.C36508d;
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
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import java.util.concurrent.Executor;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.e.d.a.a.h */
/* compiled from: PG */
public final class C15871h implements C36606i {

    /* renamed from: b */
    private static final C59071e f47133b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.b.e.d.a.a.h");

    /* renamed from: a */
    public final C36618u f47134a;

    /* renamed from: c */
    private final C36608k f47135c;

    /* renamed from: d */
    private final Executor f47136d;

    /* renamed from: e */
    private final C36477a f47137e;

    /* renamed from: f */
    private final C36505a f47138f;

    /* renamed from: g */
    private C83390g f47139g;

    public C15871h(C36608k kVar, C36618u uVar, Executor executor, C36477a aVar, C36505a aVar2) {
        this.f47135c = kVar;
        this.f47134a = uVar;
        this.f47136d = executor;
        this.f47137e = aVar;
        this.f47138f = aVar2;
    }

    /* renamed from: h */
    public static boolean m32660h(StatusBarNotification statusBarNotification) {
        return "ranker_group".equals(statusBarNotification.getTag());
    }

    /* renamed from: i */
    private final void m32661i(int i) {
        C36618u uVar = this.f47134a;
        C36601d dVar = (C36601d) C36603f.f95436c.createBuilder();
        dVar.copyOnWrite();
        C36603f fVar = (C36603f) dVar.instance;
        fVar.f95439b = i - 2;
        fVar.f95438a |= 1;
        C46459k.m82829b(uVar.mo40221a(new C36527a((C36603f) dVar.build(), C58485gu.m89845m())), "Failed to send notification events to clear cache.", new Object[0]);
    }

    /* renamed from: j */
    private final void m32662j(int i) {
        C83390g gVar = this.f47139g;
        if (gVar != null) {
            try {
                StatusBarNotification[] activeNotifications = gVar.mo76690a().getActiveNotifications();
                if (activeNotifications != null) {
                    C58485gu guVar = (C58485gu) DesugarArrays.stream((T[]) activeNotifications).filter(C15870g.f47132a).collect(C58370cn.f155946a);
                    C36608k kVar = this.f47135c;
                    C58485gu m = C58485gu.m89845m();
                    C63070h hVar = kVar.f95444c;
                    if (hVar != null) {
                        try {
                            m = C58485gu.m89842j(new C62963cj(((C16340an) C62942bv.parseFrom((C62942bv) C16340an.f48110c, hVar.f170218b, C62921ba.m95368a())).f48112a, C16340an.f48109b));
                        } catch (C62974ct e) {
                            C59104x d = f47133b.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "SuggestionNotifObserver");
                            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(46467)).mo56386p("Failed to parse NotificationListenerEventObserverConfig.");
                        }
                    }
                    C36478b bVar = (C36478b) C36485i.f95232e.createBuilder();
                    C36506b bVar2 = (C36506b) C36511g.f95278c.createBuilder();
                    if (m.contains(C16338al.NOTIFICATION_CATEGORY_MESSAGE)) {
                        C36479c cVar = (C36479c) C36480d.f95218d.createBuilder();
                        cVar.mo40192a();
                        C36480d dVar = (C36480d) cVar.build();
                        bVar.copyOnWrite();
                        C36485i iVar = (C36485i) bVar.instance;
                        dVar.getClass();
                        iVar.f95236c = dVar;
                        iVar.f95234a |= 2;
                        C36507c cVar2 = (C36507c) C36508d.f95271d.createBuilder();
                        String b = C39227c.m68658b(C39226b.TAG_ASSISTANT_AUTO_TNG_SUGGESTIONS);
                        cVar2.copyOnWrite();
                        C36508d dVar2 = (C36508d) cVar2.instance;
                        b.getClass();
                        dVar2.f95273a |= 1;
                        dVar2.f95274b = b;
                        C36508d dVar3 = (C36508d) cVar2.build();
                        bVar2.copyOnWrite();
                        C36511g gVar2 = (C36511g) bVar2.instance;
                        dVar3.getClass();
                        gVar2.f95281b = dVar3;
                        gVar2.f95280a = 1;
                    } else {
                        C58976aa aaVar = C58975e.f156826a;
                        guVar = C58485gu.m89845m();
                    }
                    C46459k.m82829b(C47633f.m84733g(this.f47138f.mo40207a(this.f47137e.mo40191a(guVar, (C36485i) bVar.build()), (C36511g) bVar2.build())).mo51516i(new C15869f(this, i), this.f47136d), "Failed to send notification events.", new Object[0]);
                }
            } catch (C36600c e2) {
                C59104x d2 = f47133b.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "SuggestionNotifObserver");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(46471)).mo56386p("Failed to get active notifications");
            }
        } else {
            C59104x d3 = f47133b.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "SuggestionNotifObserver");
            ((C59052c) ((C59052c) d3).mo56372aa(46472)).mo56386p("Listener not connected.");
        }
    }

    /* renamed from: a */
    public final void mo21529a() {
        C58976aa aaVar = C58975e.f156826a;
        C83390g gVar = this.f47139g;
        if (gVar != null) {
            gVar.mo76691b();
        }
        m32661i(6);
    }

    /* renamed from: b */
    public final void mo21530b(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        this.f47139g = null;
        m32661i(7);
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
        if (!m32660h(statusBarNotification)) {
            m32662j(3);
        }
    }

    /* renamed from: f */
    public final void mo21534f(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        C58976aa aaVar = C58975e.f156826a;
        if (!m32660h(statusBarNotification)) {
            m32662j(4);
        }
    }

    /* renamed from: g */
    public final void mo21535g(C83390g gVar) {
        C58976aa aaVar = C58975e.f156826a;
        C36609l a = C36609l.m65137a(this.f47135c.f95443b);
        if (a == null) {
            a = C36609l.UNRECOGNIZED;
        }
        a.name();
        this.f47139g = gVar;
        m32662j(5);
    }
}
