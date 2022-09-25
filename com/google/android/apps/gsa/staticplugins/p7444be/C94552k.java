package com.google.android.apps.gsa.staticplugins.p7444be;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.drawable.Icon;
import androidx.core.app.C1811ba;
import androidx.core.p097i.C1970e;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.handsfree.MessageSender;
import com.google.android.apps.gsa.handsfree.NamedMessageSender;
import com.google.android.apps.gsa.handsfree.PhoneMessageSender;
import com.google.android.apps.gsa.handsfree.h;
import com.google.android.apps.gsa.handsfree.i;
import com.google.android.apps.gsa.handsfree.k;
import com.google.android.apps.gsa.handsfree.notifications.CarRemoteNotification;
import com.google.android.apps.gsa.handsfree.notifications.CarRemoteSms;
import com.google.android.apps.gsa.handsfree.notifications.MessagingRemoteNotification;
import com.google.android.apps.gsa.handsfree.notifications.RemoteNotification;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6491a.C84370p;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6513aj.C84565y;
import com.google.android.apps.gsa.search.core.p6519al.p6556ar.C84725a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6848e.C86695q;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.core.state.C86978dd;
import com.google.android.apps.gsa.search.core.state.p6864a.C86787b;
import com.google.android.apps.gsa.search.core.state.p6864a.C86788c;
import com.google.android.apps.gsa.search.core.state.p6864a.C86792g;
import com.google.android.apps.gsa.search.core.state.p6864a.C86794i;
import com.google.android.apps.gsa.search.core.state.p6864a.C86795j;
import com.google.android.apps.gsa.search.shared.service.p6935b.aaj;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.staticplugins.nga.p8044a.p8046b.C102998a;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103320aa;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34121c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2685b.p2686a.C34664d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.be.k */
/* compiled from: PG */
public final class C94552k extends C86734a implements C84725a {

    /* renamed from: a */
    public static final C59071e f264451a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.be.k");

    /* renamed from: A */
    public final C58833ax f264452A;

    /* renamed from: B */
    public final C58833ax f264453B;

    /* renamed from: C */
    public final C34664d f264454C;

    /* renamed from: D */
    private final h f264455D;

    /* renamed from: E */
    private final C68214a f264456E;

    /* renamed from: F */
    private final C86792g f264457F;

    /* renamed from: G */
    private final C86787b f264458G;

    /* renamed from: H */
    private final C58833ax f264459H;

    /* renamed from: I */
    private final C58833ax f264460I;

    /* renamed from: J */
    private final C58833ax f264461J;

    /* renamed from: b */
    public final C86610af f264462b;

    /* renamed from: c */
    public final Context f264463c;

    /* renamed from: f */
    public final C84516aa f264464f;

    /* renamed from: g */
    public final C68214a f264465g;

    /* renamed from: h */
    public final C68214a f264466h;

    /* renamed from: i */
    public final C84565y f264467i;

    /* renamed from: j */
    public final C68214a f264468j;

    /* renamed from: k */
    public final C68214a f264469k;

    /* renamed from: l */
    public final C68214a f264470l;

    /* renamed from: m */
    public final C58833ax f264471m;

    /* renamed from: n */
    public final C90931ca f264472n;

    /* renamed from: o */
    public final C22871g f264473o;

    /* renamed from: p */
    public final C22871g f264474p;

    /* renamed from: q */
    public final C86978dd f264475q;

    /* renamed from: r */
    public final C68214a f264476r;

    /* renamed from: s */
    public final C86794i f264477s;

    /* renamed from: t */
    public final C68214a f264478t;

    /* renamed from: u */
    public final C68214a f264479u;

    /* renamed from: v */
    public final C89859i f264480v;

    /* renamed from: w */
    public final C86124t f264481w;

    /* renamed from: x */
    public final C68214a f264482x;

    /* renamed from: y */
    public final C86695q f264483y;

    /* renamed from: z */
    public final k f264484z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94552k(Context context, C86610af afVar, C84516aa aaVar, h hVar, C84565y yVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, k kVar, C58833ax axVar, C90931ca caVar, C22871g gVar, C22871g gVar2, C86978dd ddVar, C68214a aVar7, C86792g gVar3, C86794i iVar, C86787b bVar, C68214a aVar8, C68214a aVar9, C89859i iVar2, C86124t tVar, C68214a aVar10, C86695q qVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6, C34664d dVar) {
        super(C118575h.WORKER_HANDS_FREE, "handsfree");
        this.f264463c = context;
        this.f264462b = afVar;
        this.f264464f = aaVar;
        this.f264455D = hVar;
        this.f264467i = yVar;
        this.f264465g = aVar;
        this.f264466h = aVar2;
        this.f264456E = aVar3;
        this.f264468j = aVar4;
        this.f264469k = aVar5;
        this.f264470l = aVar6;
        this.f264484z = kVar;
        this.f264471m = axVar;
        this.f264472n = caVar;
        this.f264473o = gVar;
        this.f264474p = gVar2;
        this.f264475q = ddVar;
        this.f264476r = aVar7;
        this.f264457F = gVar3;
        this.f264477s = iVar;
        this.f264458G = bVar;
        this.f264478t = aVar8;
        this.f264479u = aVar9;
        this.f264480v = iVar2;
        this.f264481w = tVar;
        this.f264482x = aVar10;
        this.f264483y = qVar;
        this.f264452A = axVar2;
        this.f264459H = axVar3;
        this.f264453B = axVar4;
        this.f264460I = axVar5;
        this.f264461J = axVar6;
        this.f264454C = dVar;
    }

    /* renamed from: g */
    private final void m155925g(MessageSender messageSender, List list, PendingIntent pendingIntent) {
        C94551j jVar = new C94551j(pendingIntent);
        h hVar = this.f264455D;
        synchronized (hVar.l) {
            if (!hVar.l.containsKey(messageSender)) {
                hVar.l.put(messageSender, new ArrayList());
            }
            ((List) hVar.l.get(messageSender)).add(jVar);
        }
        if (hVar.b.f(messageSender, list, !((C86788c) hVar.j.mo27525b()).mo80440n())) {
            hVar.e(true);
            hVar.b(messageSender, true);
        }
    }

    /* renamed from: a */
    public final C60870cx mo78443a(aaj aaj) {
        C94547f fVar = new C94547f(this, aaj);
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(fVar), C60826bg.f164896a)).mo51515h(C94548g.f264446a, C60826bg.f164896a).mo51514f(C34121c.class, new C94549h(this, aaj), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo78444b(RemoteNotification remoteNotification) {
        C58976aa aaVar = C58975e.f156826a;
        PendingIntent pendingIntent = null;
        if ((remoteNotification instanceof CarRemoteNotification) || (remoteNotification instanceof MessagingRemoteNotification)) {
            String k = remoteNotification.mo70924k();
            if (k.isEmpty()) {
                C59104x d = f264451a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "HandsFreeWorker");
                ((C59052c) ((C59052c) d).mo56372aa(20166)).mo56386p("handleDeviceTriggeredImMessage. Missing title.");
                return;
            }
            List m = remoteNotification.mo70926m();
            if (m.isEmpty()) {
                C59104x d2 = f264451a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "HandsFreeWorker");
                ((C59052c) ((C59052c) d2).mo56372aa(20165)).mo56386p("handleDeviceTriggeredImMessage. Missing texts.");
                return;
            }
            Icon c = remoteNotification.mo70918c();
            com.google.android.apps.gsa.handsfree.notifications.k kVar = null;
            for (com.google.android.apps.gsa.handsfree.notifications.k kVar2 : remoteNotification.mo70925l()) {
                if (kVar2.a.equals("com.google.android.googlequicksearchbox.READ_NOTIFICATION")) {
                    pendingIntent = kVar2.b;
                } else if (kVar2.a.equals("com.google.android.googlequicksearchbox.CHAT_MESSAGE")) {
                    kVar = kVar2;
                }
            }
            if (pendingIntent == null) {
                C59104x d3 = f264451a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "HandsFreeWorker");
                ((C59052c) ((C59052c) d3).mo56372aa(20164)).mo56386p("handleDeviceTriggeredImMessage. Missing read PendingIntent.");
            } else if (kVar == null) {
                C59104x d4 = f264451a.mo56226d();
                d4.mo56378ag(C58975e.f156826a, "HandsFreeWorker");
                ((C59052c) ((C59052c) d4).mo56372aa(20163)).mo56386p("handleDeviceTriggeredImMessage. Missing reply action.");
            } else {
                PendingIntent pendingIntent2 = kVar.b;
                if (pendingIntent2 == null) {
                    C59104x d5 = f264451a.mo56226d();
                    d5.mo56378ag(C58975e.f156826a, "HandsFreeWorker");
                    ((C59052c) ((C59052c) d5).mo56372aa(20162)).mo56386p("handleDeviceTriggeredImMessage. Missing reply PendingIntent.");
                } else if (kVar.a() != 1) {
                    C59104x d6 = f264451a.mo56226d();
                    d6.mo56378ag(C58975e.f156826a, "HandsFreeWorker");
                    ((C59052c) ((C59052c) d6).mo56372aa(20161)).mo56386p("handleDeviceTriggeredImMessage. Wrong number of reply RemoteInputs.");
                } else {
                    C1811ba baVar = kVar.b(0).b;
                    if (baVar == null) {
                        C59104x d7 = f264451a.mo56226d();
                        d7.mo56378ag(C58975e.f156826a, "HandsFreeWorker");
                        ((C59052c) ((C59052c) d7).mo56372aa(20160)).mo56386p("handleDeviceTriggeredImMessage. Missing reply RemoteInput.");
                        return;
                    }
                    C89949q.m146523g(528);
                    NamedMessageSender namedMessageSender = new NamedMessageSender(k, baVar.f5636a);
                    ((i) this.f264456E.mo27525b()).f(baVar.f5636a, baVar);
                    ((i) this.f264456E.mo27525b()).e(namedMessageSender.a, pendingIntent2);
                    ((i) this.f264456E.mo27525b()).g(namedMessageSender.a, c);
                    m155925g(namedMessageSender, m, pendingIntent);
                }
            }
        } else if (remoteNotification instanceof CarRemoteSms) {
            CarRemoteSms carRemoteSms = (CarRemoteSms) remoteNotification;
            String j = carRemoteSms.j();
            if (j.isEmpty()) {
                C59104x d8 = f264451a.mo56226d();
                d8.mo56378ag(C58975e.f156826a, "HandsFreeWorker");
                ((C59052c) ((C59052c) d8).mo56372aa(20169)).mo56386p("handleDeviceTriggeredSmsMessage. Missing senders phone number.");
                return;
            }
            List m2 = carRemoteSms.m();
            if (m2.isEmpty()) {
                C59104x d9 = f264451a.mo56226d();
                d9.mo56378ag(C58975e.f156826a, "HandsFreeWorker");
                ((C59052c) ((C59052c) d9).mo56372aa(20168)).mo56386p("handleDeviceTriggeredSmsMessage. Missing texts.");
                return;
            }
            for (com.google.android.apps.gsa.handsfree.notifications.k kVar3 : carRemoteSms.l()) {
                if (kVar3.a.equals("com.google.android.googlequicksearchbox.READ_NOTIFICATION")) {
                    pendingIntent = kVar3.b;
                }
            }
            if (pendingIntent == null) {
                C59104x d10 = f264451a.mo56226d();
                d10.mo56378ag(C58975e.f156826a, "HandsFreeWorker");
                ((C59052c) ((C59052c) d10).mo56372aa(20167)).mo56386p("handleDeviceTriggeredSmsMessage. Missing read PendingIntent.");
                return;
            }
            C89949q.m146523g(529);
            m155925g(new PhoneMessageSender(j), m2, pendingIntent);
        } else {
            C59104x d11 = f264451a.mo56226d();
            d11.mo56378ag(C58975e.f156826a, "HandsFreeWorker");
            ((C59052c) ((C59052c) d11).mo56372aa(20148)).mo56386p("handleTouchTriggeredMessageList. Unknown message type.");
        }
    }

    /* renamed from: c */
    public final void mo78445c() {
        h hVar = this.f264455D;
        C1970e a = hVar.b.a();
        if (a != null) {
            hVar.b((MessageSender) a.f5888a, ((Boolean) a.f5889b).booleanValue());
        }
    }

    /* renamed from: e */
    public final boolean mo88496e(Query query, boolean z) {
        e eVar;
        if (!query.mo84403cj() || !this.f264460I.mo56113h() || !this.f264461J.mo56113h() || !((C74720bx) this.f264460I.mo56107c()).mo71089f().a()) {
            return false;
        }
        if (query.mo84450de()) {
            eVar = e.ak;
        } else {
            eVar = e.bL;
        }
        ((C102998a) this.f264461J.mo56107c()).f287577a.f288119a.mo93770d(new C103320aa(eVar, z));
        return true;
    }

    /* renamed from: f */
    public final boolean mo88497f() {
        this.f264458G.mo80435i();
        C58833ax b = this.f264459H.mo56106b(C94545d.f264441a);
        if (b.mo56113h()) {
            C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
            dsVar.copyOnWrite();
            C51805du duVar = (C51805du) dsVar.instance;
            duVar.f135926a |= 1;
            duVar.f135927b = "tts.CANCEL";
            ((C84370p) b.mo56107c()).mo77919a((C51805du) dsVar.build());
        }
        C86795j b2 = this.f264462b.f233970e.mo80560b(this.f264457F.mo80447f().mo81992b());
        if (b2.mo80457K()) {
            C59104x b3 = f264451a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "HandsFreeWorker");
            ((C59052c) ((C59052c) b3).mo56372aa(20171)).mo56386p("stopTtsAndCancelVoiceSession(): Canceling ongoing voice session");
            b2.mo80461o();
            return true;
        }
        C58976aa aaVar = C58975e.f156826a;
        return false;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("HandsFreeWorker");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
