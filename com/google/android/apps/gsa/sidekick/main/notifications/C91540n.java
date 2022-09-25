package com.google.android.apps.gsa.sidekick.main.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.proactive.C84165c;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7000au.p7001a.C89290a;
import com.google.android.apps.gsa.shared.p7066m.C90081ef;
import com.google.android.apps.gsa.shared.search.p7138b.C90485a;
import com.google.android.apps.gsa.shared.search.p7138b.C90486b;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.sidekick.main.entry.C91306ak;
import com.google.android.apps.gsa.sidekick.shared.cards.C91692g;
import com.google.android.apps.gsa.sidekick.shared.cards.C91702q;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91788al;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91863e;
import com.google.android.apps.gsa.sidekick.shared.p7231b.C91648b;
import com.google.android.apps.gsa.sidekick.shared.p7232c.C91656e;
import com.google.android.apps.gsa.sidekick.shared.p7232c.C91660i;
import com.google.android.apps.gsa.sidekick.shared.p7234d.C91715c;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91727k;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91728l;
import com.google.android.apps.gsa.sidekick.shared.p7239h.C91739b;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91748d;
import com.google.android.apps.gsa.sidekick.shared.p7255p.C91901c;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7682ga;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7874nd;
import com.google.p375ai.p378b.C8142xb;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import dagger.C68214a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p5535j.p5536a.p5545c.p5548c.p5550b.C71141a;
import p5535j.p5536a.p5545c.p5548c.p5550b.C71142b;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.n */
/* compiled from: PG */
public final class C91540n {

    /* renamed from: a */
    public static final C59071e f255299a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.notifications.n");

    /* renamed from: b */
    public static final C8142xb f255300b = C8142xb.PLATFORM_NOTIFICATION;

    /* renamed from: p */
    private static final C58528ij f255301p = C58528ij.m90015O(C7681g.MANAGE_NOTIFICATIONS, C7681g.NOTIFICATION_FEEDBACK_CLICKED, C7681g.NOTIFICATION_FEEDBACK_THUMBS_UP, C7681g.DISAMBIGUATION_QUESTION_CLICKED, C7681g.DISAMBIGUATION_QUESTION_HERE, C7681g.SHARE_NOTIFICATION, new C7681g[0]);

    /* renamed from: q */
    private static final C58528ij f255302q = C58528ij.m90011K(C7681g.NOTIFICATION_FEEDBACK_THUMBS_UP, C7681g.DISAMBIGUATION_QUESTION_HERE);

    /* renamed from: r */
    private static final C58528ij f255303r = C58528ij.m90011K(C7681g.NOTIFICATION_FEEDBACK_THUMBS_DOWN, C7681g.DISAMBIGUATION_QUESTION_NOT_HERE);

    /* renamed from: c */
    public final C91520be f255304c;

    /* renamed from: d */
    public final C91541o f255305d;

    /* renamed from: e */
    public final C90931ca f255306e;

    /* renamed from: f */
    public final C91306ak f255307f;

    /* renamed from: g */
    public final C91533g f255308g;

    /* renamed from: h */
    public final C86124t f255309h;

    /* renamed from: i */
    public final Context f255310i;

    /* renamed from: j */
    public final C89859i f255311j;

    /* renamed from: k */
    public final C91863e f255312k;

    /* renamed from: l */
    public final C86106b f255313l;

    /* renamed from: m */
    public final C91660i f255314m;

    /* renamed from: n */
    public final C91656e f255315n;

    /* renamed from: o */
    public final C68214a f255316o;

    /* renamed from: s */
    private final C91728l f255317s;

    /* renamed from: t */
    private final C91727k f255318t;

    /* renamed from: u */
    private final C91748d f255319u;

    /* renamed from: v */
    private final C91534h f255320v;

    /* renamed from: w */
    private final C89290a f255321w;

    /* renamed from: x */
    private final C21370a f255322x;

    /* renamed from: y */
    private final C68214a f255323y;

    public C91540n(C91520be beVar, C91728l lVar, C91727k kVar, C91541o oVar, C90931ca caVar, C91748d dVar, C91306ak akVar, C91533g gVar, C91534h hVar, C89290a aVar, C86124t tVar, C21370a aVar2, Context context, C68214a aVar3, C89859i iVar, C91863e eVar, C86106b bVar, C91660i iVar2, C91656e eVar2, C68214a aVar4) {
        this.f255304c = beVar;
        this.f255317s = lVar;
        this.f255318t = kVar;
        this.f255305d = oVar;
        this.f255306e = caVar;
        this.f255319u = dVar;
        this.f255307f = akVar;
        this.f255308g = gVar;
        this.f255320v = hVar;
        this.f255321w = aVar;
        this.f255309h = tVar;
        this.f255322x = aVar2;
        this.f255310i = context;
        this.f255323y = aVar3;
        this.f255311j = iVar;
        this.f255312k = eVar;
        this.f255313l = bVar;
        this.f255314m = iVar2;
        this.f255315n = eVar2;
        this.f255316o = aVar4;
        C58833ax.m90834k(tVar);
    }

    /* renamed from: a */
    public static C89857g m149759a(C89849ae aeVar, C60220t tVar, String str) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.f246203c = m149760b(tVar, str);
        return fVar.mo83699a();
    }

    /* renamed from: b */
    public static C59687cb m149760b(C60220t tVar, String str) {
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        if (tVar != null) {
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            cbVar.f160088aZ = tVar;
            cbVar.f160123d |= 1048576;
        }
        if (str != null) {
            ajVar.copyOnWrite();
            C59687cb cbVar2 = (C59687cb) ajVar.instance;
            cbVar2.f160123d |= C89885b.NOW_VALUE;
            cbVar2.f160116ba = str;
        }
        return (C59687cb) ajVar.build();
    }

    /* renamed from: c */
    public static C60220t m149761c(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return (C60220t) C90734ar.m148199b(extras, "notification_event_id", C60220t.f162931e.getParserForType());
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.ai.b.fo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m149762g(android.content.Intent r3) {
        /*
            android.os.Bundle r3 = r3.getExtras()
            if (r3 == 0) goto L_0x003f
            com.google.ai.b.fo r0 = com.google.p375ai.p378b.C7669fo.f26633e
            com.google.protobuf.eb r0 = r0.getParserForType()
            java.lang.String r1 = "notificationContentId"
            java.lang.Object r0 = com.google.android.apps.gsa.shared.util.C90734ar.m148199b(r3, r1, r0)
            com.google.ai.b.fo r0 = (com.google.p375ai.p378b.C7669fo) r0
            if (r0 != 0) goto L_0x0025
            com.google.ai.b.fo r0 = com.google.p375ai.p378b.C7669fo.f26633e
            com.google.protobuf.eb r0 = r0.getParserForType()
            java.lang.String r1 = "notification_target_content_id"
            java.lang.Object r3 = com.google.android.apps.gsa.shared.util.C90734ar.m148199b(r3, r1, r0)
            r0 = r3
            com.google.ai.b.fo r0 = (com.google.p375ai.p378b.C7669fo) r0
        L_0x0025:
            if (r0 == 0) goto L_0x003f
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1 = 0
            java.lang.String r2 = r0.f26636b
            r3[r1] = r2
            long r0 = r0.f26638d
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 1
            r3[r1] = r0
            java.lang.String r0 = "%s:0x%x"
            java.lang.String r3 = java.lang.String.format(r0, r3)
            return r3
        L_0x003f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.notifications.C91540n.m149762g(android.content.Intent):java.lang.String");
    }

    /* renamed from: i */
    private final C60870cx m149763i(C7718hj hjVar, C7681g gVar, boolean z, C7669fo foVar) {
        C60870cx a = this.f255305d.mo85922a(hjVar, gVar, foVar);
        return (!z || gVar == C7681g.DISMISS_NOTIFICATION) ? a : C118826c.m197212b(C58485gu.m89847o(a, this.f255305d.mo85922a(hjVar, C7681g.DISMISS_NOTIFICATION, foVar)));
    }

    /* renamed from: j */
    private final boolean m149764j(Intent intent) {
        if (intent.getBooleanExtra("notification_is_sticky", false)) {
            return intent.getLongExtra("notification_expiration_seconds", 0) < TimeUnit.MILLISECONDS.toSeconds(this.f255322x.mo26870b());
        }
        return intent.getBooleanExtra("action_dismisses_notification", true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a9, code lost:
        if (f255303r.contains(r4) != false) goto L_0x00ad;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo85918d(android.content.Intent r12) {
        /*
            r11 = this;
            java.lang.String r0 = "extra_voice_reply"
            java.lang.String r1 = "notification_entries"
            java.util.List r1 = com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150939e(r12, r1)
            boolean r2 = r1.isEmpty()
            java.lang.String r3 = "NotificationReceiver"
            if (r2 == 0) goto L_0x0025
            com.google.common.f.e r12 = f255299a
            com.google.common.f.x r12 = r12.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r0, r3)
            java.lang.String r0 = "Received notification action press without entries!"
            r1 = 11588(0x2d44, float:1.6238E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
            com.google.common.util.concurrent.cx r12 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r12
        L_0x0025:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r2 >= r4) goto L_0x0037
            android.content.Context r2 = r11.f255310i
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.CLOSE_SYSTEM_DIALOGS"
            r4.<init>(r5)
            r2.sendBroadcast(r4)
        L_0x0037:
            java.lang.String r2 = "notificationIdKey"
            r4 = -1
            int r2 = r12.getIntExtra(r2, r4)
            if (r2 != r4) goto L_0x0055
            com.google.common.f.e r12 = f255299a
            com.google.common.f.x r12 = r12.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r0, r3)
            java.lang.String r0 = "Received notification click without notification type!"
            r1 = 11587(0x2d43, float:1.6237E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
            com.google.common.util.concurrent.cx r12 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r12
        L_0x0055:
            java.lang.String r4 = "notification_callback_action"
            r5 = 24
            int r4 = r12.getIntExtra(r4, r5)
            com.google.ai.b.g r4 = com.google.p375ai.p378b.C7681g.m22802a(r4)
            com.google.common.b.gp r5 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.ij r6 = f255302q
            boolean r6 = r6.contains(r4)
            r7 = 1
            if (r6 == 0) goto L_0x008f
            java.util.Iterator r6 = r1.iterator()
        L_0x0072:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x008f
            java.lang.Object r8 = r6.next()
            com.google.ai.b.hj r8 = (com.google.p375ai.p378b.C7718hj) r8
            com.google.android.apps.gsa.sidekick.main.entry.ak r9 = r11.f255307f
            com.google.android.apps.gsa.sidekick.main.notifications.bk r10 = new com.google.android.apps.gsa.sidekick.main.notifications.bk
            r10.<init>(r8)
            java.lang.String r8 = "NowNotificationManager"
            com.google.common.util.concurrent.cx r8 = r9.mo85597j(r10, r7, r8)
            r5.mo55395g(r8)
            goto L_0x0072
        L_0x008f:
            com.google.common.b.ij r6 = f255301p
            boolean r6 = r6.contains(r4)
            r8 = 0
            if (r6 != 0) goto L_0x00ac
            boolean r6 = r11.m149764j(r12)
            if (r6 == 0) goto L_0x00ac
            com.google.android.apps.gsa.sidekick.main.notifications.be r6 = r11.f255304c
            r6.mo85861c(r2)
            com.google.common.b.ij r2 = f255303r
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r7 = 0
        L_0x00ad:
            com.google.common.b.gp r2 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.Iterator r1 = r1.iterator()
        L_0x00b5:
            boolean r6 = r1.hasNext()
            r9 = 0
            if (r6 == 0) goto L_0x00ca
            java.lang.Object r6 = r1.next()
            com.google.ai.b.hj r6 = (com.google.p375ai.p378b.C7718hj) r6
            com.google.common.util.concurrent.cx r6 = r11.m149763i(r6, r4, r7, r9)
            r2.mo55395g(r6)
            goto L_0x00b5
        L_0x00ca:
            com.google.common.b.gu r1 = r2.mo55394f()
            com.google.common.util.concurrent.cx r1 = com.google.android.apps.gsa.p8883x.C118826c.m197212b(r1)
            r5.mo55395g(r1)
            android.os.Bundle r1 = r12.getExtras()
            if (r1 == 0) goto L_0x011b
            java.lang.String r2 = "reminderSmartActionAssistType"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x011b
            int r1 = r12.getIntExtra(r2, r8)
            if (r1 == 0) goto L_0x011b
            com.google.common.o.uf r2 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.common.o.tz r2 = (com.google.common.p4552o.C60548tz) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            int r6 = r4.f164093a
            r6 = r6 | 2
            r4.f164093a = r6
            r6 = 896(0x380, float:1.256E-42)
            r4.f164258m = r6
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            int r6 = r4.f164252g
            r7 = 8388608(0x800000, float:1.17549435E-38)
            r6 = r6 | r7
            r4.f164252g = r6
            r4.f164188bp = r1
            com.google.protobuf.bv r1 = r2.build()
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r1, r9, r9, r9)
        L_0x011b:
            java.lang.String r1 = "notification_callback"
            android.os.Parcelable r1 = r12.getParcelableExtra(r1)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            if (r1 != 0) goto L_0x0138
            com.google.common.f.e r12 = f255299a
            com.google.common.f.x r12 = r12.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r0, r3)
            java.lang.String r0 = "Callback is null"
            r1 = 11586(0x2d42, float:1.6235E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
            goto L_0x016a
        L_0x0138:
            android.os.Bundle r12 = androidx.core.app.C1806aw.m4968b(r12)     // Catch:{ CanceledException -> 0x0157 }
            if (r12 == 0) goto L_0x0153
            java.lang.String r12 = r12.getString(r0)     // Catch:{ CanceledException -> 0x0157 }
            if (r12 == 0) goto L_0x016a
            android.content.Intent r2 = new android.content.Intent     // Catch:{ CanceledException -> 0x0157 }
            r2.<init>()     // Catch:{ CanceledException -> 0x0157 }
            android.content.Intent r12 = r2.putExtra(r0, r12)     // Catch:{ CanceledException -> 0x0157 }
            android.content.Context r0 = r11.f255310i     // Catch:{ CanceledException -> 0x0157 }
            r1.send(r0, r8, r12)     // Catch:{ CanceledException -> 0x0157 }
            goto L_0x016a
        L_0x0153:
            r1.send()     // Catch:{ CanceledException -> 0x0157 }
            goto L_0x016a
        L_0x0157:
            r12 = move-exception
            com.google.common.f.e r0 = f255299a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r3)
            java.lang.String r1 = "The callback PendingIntent was already canceled."
            r2 = 11585(0x2d41, float:1.6234E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r12)).mo56372aa(r2)).mo56386p(r1)
        L_0x016a:
            com.google.common.b.gu r12 = r5.mo55394f()
            com.google.common.util.concurrent.cx r12 = com.google.android.apps.gsa.p8883x.C118826c.m197212b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.notifications.C91540n.mo85918d(android.content.Intent):com.google.common.util.concurrent.cx");
    }

    /* renamed from: e */
    public final C60870cx mo85919e(Intent intent) {
        List e = C91978bb.m150939e(intent, "notification_entries");
        if (e.isEmpty()) {
            C59104x c = f255299a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NotificationReceiver");
            ((C59052c) ((C59052c) c).mo56372aa(11591)).mo56386p("Received notification dismiss without entries!");
            return C118826c.f331423b;
        }
        int intExtra = intent.getIntExtra("notificationIdKey", -1);
        if (intExtra == -1) {
            C59104x c2 = f255299a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "NotificationReceiver");
            ((C59052c) ((C59052c) c2).mo56372aa(11590)).mo56386p("Received notification dismiss without notification type!");
            return C118826c.f331423b;
        }
        mo85921h(intExtra, true);
        String[] strArr = {"notificationDismissCallback", "notificationClientDismissCallback"};
        for (int i = 0; i < 2; i++) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(strArr[i]);
            if (pendingIntent != null) {
                try {
                    pendingIntent.send();
                } catch (PendingIntent.CanceledException unused) {
                    C58976aa aaVar = C58975e.f156826a;
                }
            }
        }
        if (!this.f255309h.mo79746e(C90081ef.f249852u)) {
            return C118826c.f331423b;
        }
        Uri uri = null;
        if (!e.isEmpty()) {
            C7718hj hjVar = (C7718hj) e.get(0);
            if ((hjVar.f26955a & 1073741824) != 0) {
                C7874nd ndVar = hjVar.f26938J;
                if (ndVar == null) {
                    ndVar = C7874nd.f27577J;
                }
                uri = new C84165c(ndVar, hjVar).mo77615a();
            }
        }
        if (!intent.getBooleanExtra("notificationAutoCancel", true) || uri == null) {
            return C118826c.f331423b;
        }
        return this.f255307f.mo85593f(uri);
    }

    /* renamed from: f */
    public final C60870cx mo85920f(Intent intent, C7681g gVar) {
        C58833ax axVar;
        C58833ax axVar2;
        C58833ax axVar3;
        C58833ax axVar4;
        Intent intent2 = intent;
        List e = C91978bb.m150939e(intent2, "notification_entries");
        if (e.isEmpty()) {
            C59104x c = f255299a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NotificationReceiver");
            ((C59052c) ((C59052c) c).mo56372aa(11594)).mo56386p("Received notification client action without entries!");
            return C118826c.f331423b;
        }
        if (Build.VERSION.SDK_INT < 31) {
            this.f255310i.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        int intExtra = intent2.getIntExtra("notificationIdKey", -1);
        if (intExtra == -1) {
            C59104x c2 = f255299a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "NotificationReceiver");
            ((C59052c) ((C59052c) c2).mo56372aa(11593)).mo56386p("Received notification client action without notification type!");
            return C118826c.f331423b;
        }
        if (m149764j(intent)) {
            this.f255304c.mo85861c(intExtra);
        }
        C71141a aVar = (C71141a) C71142b.f189780d.createBuilder();
        C60220t c3 = m149761c(intent);
        String g = m149762g(intent);
        if (c3 != null) {
            aVar.copyOnWrite();
            C71142b bVar = (C71142b) aVar.instance;
            bVar.f189783b = c3;
            bVar.f189782a |= 1;
        }
        if (g != null) {
            aVar.copyOnWrite();
            C71142b bVar2 = (C71142b) aVar.instance;
            bVar2.f189782a |= 2;
            bVar2.f189784c = g;
        }
        Bundle bundle = intent.getExtras() == null ? new Bundle() : intent.getExtras();
        bundle.getClass();
        C9141ad adVar = (C9141ad) C90734ar.m148199b(bundle, "clientActionKey", C9141ad.f31521K.getParserForType());
        C7718hj hjVar = (C7718hj) e.get(0);
        if (adVar == null) {
            return C118826c.f331423b;
        }
        C60870cx i = m149763i(hjVar, (adVar.f31535a & 2) != 0 ? C7681g.m22802a(adVar.f31538d) : gVar, false, (C7669fo) C90734ar.m148199b(bundle, "notificationContentId", C7669fo.f26633e.getParserForType()));
        C91715c cVar = new C91715c(this.f255317s);
        C90485a aVar2 = (C90485a) C90486b.f252864g.createBuilder();
        long c4 = this.f255322x.mo26871c();
        aVar2.copyOnWrite();
        C90486b bVar3 = (C90486b) aVar2.instance;
        bVar3.f252866a |= 16;
        bVar3.f252869d = c4;
        aVar2.copyOnWrite();
        C90486b bVar4 = (C90486b) aVar2.instance;
        bVar4.f252870e = 1;
        bVar4.f252866a |= 32;
        C71142b bVar5 = (C71142b) aVar.build();
        aVar2.copyOnWrite();
        C90486b bVar6 = (C90486b) aVar2.instance;
        bVar5.getClass();
        bVar6.f252871f = bVar5;
        bVar6.f252866a |= 128;
        C90486b bVar7 = (C90486b) aVar2.build();
        C58833ax axVar5 = C58836b.f156633a;
        if (intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            extras.getClass();
            C91788al alVar = (C91788al) C90734ar.m148199b(extras, "notification_survey_info", C91788al.f255957d.getParserForType());
            if (alVar == null || (alVar.f255959a & 1) == 0) {
                axVar3 = C58836b.f156633a;
            } else {
                C7682ga gaVar = alVar.f255960b;
                if (gaVar == null) {
                    gaVar = C7682ga.f26836d;
                }
                axVar3 = C58833ax.m90834k(gaVar);
            }
            if (alVar == null || (alVar.f255959a & 2) == 0) {
                axVar4 = C58836b.f156633a;
            } else {
                C57057b bVar8 = alVar.f255961c;
                if (bVar8 == null) {
                    bVar8 = C57057b.f152311e;
                }
                axVar4 = C58833ax.m90834k(bVar8);
            }
            axVar = axVar4;
            axVar2 = axVar3;
        } else {
            axVar2 = axVar5;
            axVar = axVar2;
        }
        C91748d dVar = this.f255319u;
        C91648b bVar9 = r1;
        C91728l lVar = this.f255317s;
        C8142xb xbVar = f255300b;
        C8142xb xbVar2 = xbVar;
        C91648b bVar10 = new C91648b(lVar, xbVar);
        C91727k kVar = this.f255318t;
        C91534h hVar = this.f255320v;
        CardRenderingContext cardRenderingContext = r1;
        CardRenderingContext cardRenderingContext2 = new CardRenderingContext(C60866ct.f164955a, new Bundle());
        C91901c cVar2 = r1;
        C91901c cVar3 = new C91901c();
        C91739b bVar11 = r1;
        C91739b bVar12 = new C91739b();
        C58836b bVar13 = C58836b.f156633a;
        C91715c cVar4 = cVar;
        C91538l lVar2 = r1;
        C91538l lVar3 = new C91538l(this);
        C91692g y = C91692g.m150163y(dVar, bVar9, kVar, cVar4, hVar, cardRenderingContext, cVar2, bVar11, bVar13, lVar2, bVar13, bVar13, this.f255323y, false, false, false, xbVar2, this.f255311j, bVar13, bVar13, C58833ax.m90834k(bVar7), intExtra, axVar2, axVar);
        C58833ax.m90834k(this.f255309h);
        C91702q qVar = new C91702q(this.f255310i, hjVar, y);
        C89290a aVar3 = this.f255321w;
        aVar3.f242094d = this.f255317s;
        qVar.f255791d = aVar3;
        qVar.mo86200g(adVar);
        return i;
    }

    /* renamed from: h */
    public final void mo85921h(int i, boolean z) {
        if (z) {
            C91520be beVar = this.f255304c;
            C58976aa aaVar = C58975e.f156826a;
            if (i != 65571) {
                beVar.mo85861c(i);
                return;
            }
            return;
        }
        this.f255304c.mo85861c(i);
    }
}
