package com.google.android.apps.gsa.staticplugins.p7645cd;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Telephony;
import androidx.core.app.C1806aw;
import androidx.core.app.C1811ba;
import androidx.core.app.C1831r;
import androidx.core.app.C1832s;
import androidx.core.app.C1837x;
import androidx.core.app.C1839z;
import androidx.core.content.C1878d;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.bo;
import com.google.android.apps.gsa.notificationlistener.C83395k;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6598bl.C84885a;
import com.google.android.apps.gsa.search.core.p6519al.p6727dt.C85459c;
import com.google.android.apps.gsa.search.core.p6519al.p6727dt.C85460d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.core.state.p6864a.C86800o;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.notificationlistening.collection.C90360a;
import com.google.android.apps.gsa.shared.notificationlistening.collection.C90394ab;
import com.google.android.apps.gsa.shared.notificationlistening.collection.C90410q;
import com.google.android.apps.gsa.shared.notificationlistening.collection.C90414u;
import com.google.android.apps.gsa.shared.notificationlistening.collection.NotificationParseConfigs;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90364ac;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90371e;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90374h;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.apps.gsa.shared.p6974ae.C89092a;
import com.google.android.apps.gsa.shared.p6974ae.C89095d;
import com.google.android.apps.gsa.shared.p6974ae.C89097f;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.proactive.C36335p;
import com.google.android.libraries.search.assistant.proactive.C36336q;
import com.google.assistant.p3897e.p3921j.acu;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4537i.C59294s;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.cd.e */
/* compiled from: PG */
public final class C97540e extends C86734a implements C84885a {

    /* renamed from: b */
    private static final C59071e f272452b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cd.e");

    /* renamed from: c */
    private static final C89097f f272453c;

    /* renamed from: a */
    public SettableFuture f272454a = new SettableFuture();

    /* renamed from: f */
    private final Context f272455f;

    /* renamed from: g */
    private final C89656k f272456g;

    /* renamed from: h */
    private final C86800o f272457h;

    /* renamed from: i */
    private final C86124t f272458i;

    /* renamed from: j */
    private final SharedPreferences f272459j;

    /* renamed from: k */
    private final C21370a f272460k;

    /* renamed from: l */
    private final bo f272461l;

    /* renamed from: m */
    private final C22871g f272462m;

    /* renamed from: n */
    private final C86610af f272463n;

    /* renamed from: o */
    private final C89097f f272464o;

    /* renamed from: p */
    private final C90374h f272465p;

    /* renamed from: q */
    private final C85460d f272466q;

    /* renamed from: r */
    private final String f272467r;

    /* renamed from: s */
    private final C90364ac f272468s;

    /* renamed from: t */
    private SettableFuture f272469t = new SettableFuture();

    /* renamed from: u */
    private SettableFuture f272470u = new SettableFuture();

    /* renamed from: v */
    private boolean f272471v;

    /* renamed from: w */
    private String f272472w = BuildConfig.FLAVOR;

    /* renamed from: x */
    private final C91123v f272473x;

    static {
        C89092a aVar = new C89092a();
        aVar.mo83061c();
        aVar.mo83060b();
        aVar.mo83063e();
        aVar.mo83062d();
        f272453c = aVar.mo83059a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97540e(Context context, C89656k kVar, C86800o oVar, C86124t tVar, C21370a aVar, SharedPreferences sharedPreferences, bo boVar, C22871g gVar, C86610af afVar, C58833ax axVar, C90374h hVar, C85460d dVar, String str, C91123v vVar, C90364ac acVar) {
        super(C118575h.WORKER_NOTIFICATION, "notification");
        this.f272455f = context;
        this.f272456g = kVar;
        this.f272457h = oVar;
        this.f272458i = tVar;
        this.f272460k = aVar;
        this.f272459j = sharedPreferences;
        this.f272461l = boVar;
        this.f272462m = gVar;
        this.f272463n = afVar;
        C58833ax axVar2 = axVar;
        this.f272464o = (C89097f) axVar.mo56109e(f272453c);
        this.f272465p = hVar;
        this.f272466q = dVar;
        this.f272467r = str;
        this.f272473x = vVar;
        this.f272468s = acVar;
        this.f272471v = false;
    }

    /* renamed from: a */
    public final C60870cx mo78559a() {
        Intent intent;
        this.f272471v = false;
        this.f272454a = new SettableFuture();
        if (this.f272458i.mo79746e(C90014bt.f247541jB)) {
            intent = new Intent("com.google.android.googlequicksearchbox.GET_PARSED_NOTIFICATIONS");
            C90410q m = NotificationParseConfigs.m146935m();
            C90360a aVar = (C90360a) m;
            aVar.f252368a = C58485gu.m89842j(this.f272458i.mo79745c(C90014bt.f247367fn));
            aVar.f252369b = C58485gu.m89842j(this.f272458i.mo79745c(C90014bt.f247504iR));
            aVar.f252370c = C58485gu.m89842j(this.f272458i.mo79745c(C90014bt.f247620kb));
            m.mo84069f(this.f272458i.mo79746e(C90014bt.f247502iP));
            m.mo84068e(this.f272458i.mo79746e(C90014bt.f247267dt));
            m.mo84067d(this.f272458i.mo79746e(C90014bt.f247266ds));
            m.mo84066c(this.f272458i.mo79746e(C90025cd.f248157o));
            m.mo84065b(true);
            m.mo84070g(true);
            m.mo84071h(this.f272458i.mo79746e(C90014bt.f247528ip));
            m.mo84072i((int) this.f272458i.mo79743a(C90014bt.f247508iV));
            aVar.f252371d = C58485gu.m89842j(this.f272458i.mo79745c(C90025cd.f248168z));
            intent.putExtra("notification_parse_configs", m.mo84064a());
        } else {
            intent = new Intent("com.google.android.googlequicksearchbox.GET_ACTIVE_NOTIFICATIONS");
        }
        intent.setPackage(this.f272467r);
        intent.setComponent(new ComponentName(this.f272467r, "com.google.android.apps.gsa.notificationlistener.NotificationListenerBroadcastReceiver"));
        intent.setFlags(268435456);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f272458i.mo79745c(C90014bt.f247368fo));
        hashSet.addAll(this.f272458i.mo79745c(C90014bt.f247367fn));
        if (hashSet.isEmpty()) {
            hashSet.addAll(this.f272468s.f252391c.keySet());
        }
        if (Telephony.Sms.getDefaultSmsPackage(this.f272455f) != null) {
            hashSet.add(Telephony.Sms.getDefaultSmsPackage(this.f272455f));
        }
        if (!this.f272458i.mo79746e(C90014bt.f247541jB)) {
            intent.putExtra("target_packages", (String[]) hashSet.toArray(new String[0]));
        }
        this.f272455f.sendBroadcast(intent);
        return this.f272454a;
    }

    /* renamed from: b */
    public final C60870cx mo78560b() {
        this.f272469t.cancel(true);
        this.f272469t = new SettableFuture();
        Intent intent = new Intent("com.google.android.googlequicksearchbox.GET_APP_NOTIFICATIONS");
        intent.setPackage(this.f272467r);
        intent.setComponent(new ComponentName(this.f272467r, "com.google.android.apps.gsa.notificationlistener.NotificationListenerBroadcastReceiver"));
        intent.setFlags(268435456);
        intent.putExtra("category_messages", (String[]) C58528ij.m90015O("alarm", "service", "email", "event", "progress", "promo", "reminder", "social", "status", "sys", "navigation", "recommendation", "err", "transport").toArray(new String[0]));
        this.f272455f.sendBroadcast(intent);
        return this.f272469t;
    }

    /* renamed from: c */
    public final C60870cx mo78561c(acu acu) {
        this.f272469t.cancel(true);
        this.f272469t = new SettableFuture();
        Intent intent = new Intent("com.google.android.googlequicksearchbox.GET_APP_NOTIFICATIONS");
        intent.setPackage(this.f272467r);
        intent.setComponent(new ComponentName(this.f272467r, "com.google.android.apps.gsa.notificationlistener.NotificationListenerBroadcastReceiver"));
        intent.setFlags(268435456);
        if (!acu.f134852a.isEmpty()) {
            intent.putExtra("target_packages", (String[]) new C58759qy(acu.f134852a).toArray(new String[0]));
        }
        this.f272455f.sendBroadcast(intent);
        return this.f272469t;
    }

    /* renamed from: e */
    public final C60870cx mo78562e() {
        C86775r rVar = this.f272463n.f233977l;
        if (rVar == null) {
            return C60856cj.m92899h(new IllegalStateException("attachedClient is missing"));
        }
        this.f272471v = true;
        this.f272454a = new SettableFuture();
        rVar.f234383e.mo80379b(new C87684al(C88244um.NOTIFICATIONS_FROM_ALTERNATIVE_SOURCE_REQUESTED).mo81964a());
        return this.f272454a;
    }

    /* renamed from: f */
    public final C60870cx mo78563f(String str, boolean z) {
        Intent intent = new Intent("com.google.android.googlequicksearchbox.MARK_AS_READ_NOTIFICATION");
        intent.setPackage(this.f272467r);
        intent.setComponent(new ComponentName(this.f272467r, "com.google.android.apps.gsa.notificationlistener.NotificationListenerBroadcastReceiver"));
        intent.setFlags(268435456);
        intent.putExtra("notification_key", str);
        intent.putExtra("dismiss_msg_notification", z);
        this.f272455f.sendBroadcast(intent);
        ((C59052c) ((C59052c) f272452b.mo56224b()).mo56372aa(21915)).mo56386p("MarkAsRead intent fired");
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: g */
    public final C60870cx mo78564g(BundledMessageNotification bundledMessageNotification) {
        C1832s sVar;
        PendingIntent pendingIntent;
        MessageNotification c = bundledMessageNotification.mo84112c();
        if (c == null) {
            sVar = null;
        } else {
            sVar = c.f252531A;
        }
        if (sVar == null || (pendingIntent = sVar.f5662i) == null) {
            return C60856cj.m92899h(new RuntimeException("Notification doesn't have a properly set up mark as read action"));
        }
        try {
            pendingIntent.send();
            return C60856cj.m92900i(C118826c.f331422a);
        } catch (PendingIntent.CanceledException unused) {
            return C60856cj.m92899h(new RuntimeException("Failed to send mark as read directly"));
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("NotificationWorker");
    }

    /* renamed from: h */
    public final C60870cx mo78565h(List list) {
        return this.f272462m.mo28201a("parsing and setting notifications", new C97536b(this, list));
    }

    /* renamed from: i */
    public final C60870cx mo78566i(List list) {
        return this.f272462m.mo28201a("parsing notifications", new C97538c(this, list));
    }

    /* renamed from: j */
    public final C60870cx mo78567j(ClientEventData clientEventData) {
        Bundle bundle = (Bundle) clientEventData.mo81912b(Bundle.class);
        if (!bundle.getString("notification_reply_notification", BuildConfig.FLAVOR).equals(this.f272472w)) {
            return C60856cj.m92899h(new RuntimeException("key does't match the pending reply Notification key"));
        }
        if (bundle.getBoolean("notification_reply_result")) {
            this.f272470u.mo57356n(C118826c.f331422a);
        } else {
            this.f272470u.mo57357o(new RuntimeException(bundle.getString("notification_reply_result")));
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: k */
    public final C60870cx mo78568k(String str, String str2) {
        if (C90394ab.m147004b(str)) {
            C60870cx cxVar = this.f272465p.f252405a;
            cxVar.getClass();
            return C60922j.m93045h(C60922j.m93044g(cxVar, new C90371e(str), C60826bg.f164896a), new C97534a(this, str2), C60826bg.f164896a);
        }
        this.f272470u = new SettableFuture();
        this.f272472w = str;
        Intent intent = new Intent("com.google.android.googlequicksearchbox.REPLY_NOTIFICATION");
        intent.setPackage(this.f272467r);
        intent.setComponent(new ComponentName(this.f272467r, "com.google.android.apps.gsa.notificationlistener.NotificationListenerBroadcastReceiver"));
        intent.setFlags(268435456);
        intent.putExtra("notification_key", str);
        intent.putExtra("reply_message", str2);
        this.f272455f.sendBroadcast(intent);
        return this.f272470u;
    }

    /* renamed from: l */
    public final C60870cx mo78569l(BundledMessageNotification bundledMessageNotification, String str) {
        C1832s sVar;
        C1811ba[] baVarArr;
        PendingIntent pendingIntent;
        MessageNotification c = bundledMessageNotification.mo84112c();
        if (c == null) {
            sVar = null;
        } else {
            sVar = c.f252548y;
        }
        if (sVar == null || (baVarArr = sVar.f5655b) == null || (pendingIntent = sVar.f5662i) == null) {
            return C60856cj.m92899h(new RuntimeException("Notification doesn't have a properly set up reply action"));
        }
        C1811ba baVar = baVarArr[0];
        Bundle bundle = new Bundle();
        bundle.putCharSequence(baVar.f5636a, str);
        Intent intent = new Intent();
        C1806aw.m4969c(C1811ba.m4980a(new C1811ba[]{baVar}), intent, bundle);
        try {
            pendingIntent.send(this.f272455f, 0, intent);
            return C60856cj.m92900i(C118826c.f331422a);
        } catch (PendingIntent.CanceledException unused) {
            return C60856cj.m92899h(new RuntimeException("Failed to send reply directly"));
        }
    }

    /* renamed from: m */
    public final C60870cx mo78570m(BundledMessageNotification bundledMessageNotification, String str) {
        Iterable iterable;
        MessageNotification c = bundledMessageNotification.mo84112c();
        if (c != null && (iterable = c.f252542s) != null) {
            return this.f272466q.mo78985a(C85459c.m137059a((String[]) C58557jl.m90142w(iterable, String.class), str));
        }
        ((C59052c) ((C59052c) f272452b.mo56226d()).mo56372aa(21921)).mo56386p("XmsNotification: notification or group members are null. Can't reply.");
        return C60856cj.m92899h(new RuntimeException("XmsNotification: notification or group members are null. Can't reply."));
    }

    /* renamed from: n */
    public final C60870cx mo78571n(List list) {
        this.f272469t.mo57356n(list);
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }

    /* renamed from: p */
    public final void mo78572p() {
        if (!this.f272457h.mo80494a() && this.f272461l.s(true, 3)) {
            this.f272461l.x(2, 3);
        }
    }

    /* renamed from: q */
    public final void mo78573q(Context context) {
        C36335p pVar = C36335p.OPA_MISC;
        C1839z a = C89095d.m144923a(context, pVar.name());
        a.f5679J.icon = R.drawable.opa_logo;
        a.f5670A = C1878d.m5128a(context, R.color.google_blue);
        a.f5685e = C1839z.m5037c(context.getString(this.f272464o.mo83065b()));
        a.f5686f = C1839z.m5037c(context.getString(this.f272464o.mo83064a()));
        C1837x xVar = new C1837x();
        xVar.f5669a = C1839z.m5037c(context.getString(this.f272464o.mo83064a()));
        a.mo5022k(xVar);
        a.f5690j = C36336q.m64827a(pVar.f94900j);
        a.mo5015d(16, true);
        if (!this.f272473x.mo85390b()) {
            a.f5694n = C1839z.m5037c(context.getString(R.string.notification_assistant));
        }
        Intent b = C83395k.m132731b(context);
        if (b != null) {
            PendingIntent activity = PendingIntent.getActivity(context, 0, b, 67108864);
            C1832s a2 = new C1831r(0, context.getString(R.string.notification_settings), activity).mo5008a();
            a.f5687g = activity;
            a.mo5017f(a2);
        }
        ((NotificationManager) context.getSystemService("notification")).notify(C59294s.m92134d().mo56759a("Messaging2.0Notification", Charset.forName("UTF-8")).mo56771a(), a.mo5013a());
    }

    /* renamed from: r */
    public final void mo78574r(List list) {
        this.f272454a.mo57356n(list);
    }

    /* renamed from: u */
    public final List mo90739u(List list) {
        return C90414u.m147052a(this.f272455f, this.f272456g, this.f272460k, list, this.f272458i.mo79745c(C90014bt.f247367fn), this.f272458i.mo79745c(C90014bt.f247504iR), this.f272458i.mo79746e(C90014bt.f247502iP), this.f272458i.mo79745c(C90014bt.f247620kb), this.f272458i.mo79746e(C90014bt.f247267dt), this.f272458i.mo79746e(C90014bt.f247266ds), this.f272458i.mo79746e(C90025cd.f248157o), true, true, !this.f272471v, (int) this.f272458i.mo79743a(C90014bt.f247508iV), this.f272458i.mo79746e(C90014bt.f247528ip), this.f272458i.mo79745c(C90025cd.f248168z));
    }

    /* renamed from: s */
    public final C60870cx mo78575s(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            this.f272459j.edit().putInt("hands_free_hotword_retraining_notification_state", 3).apply();
            this.f272459j.edit().remove("hands_free_hotword_retraining_notification_source").apply();
        } else if (i2 == 2) {
            this.f272459j.edit().putInt("trusted_voice_paused_notification_state", 3).apply();
        } else if (i2 == 4) {
            this.f272461l.x(3, 1);
        } else if (i2 != 5) {
            ((C59052c) ((C59052c) f272452b.mo56226d()).mo56372aa(21917)).mo56386p("Worker received dismissal about unknown notification type.");
            int i3 = C90755l.f253831a;
        } else {
            this.f272459j.edit().putInt("assistant_language_reconfiguring_notification_state", 3).apply();
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }
}
