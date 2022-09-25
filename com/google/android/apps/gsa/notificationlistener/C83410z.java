package com.google.android.apps.gsa.notificationlistener;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.core.app.C1791ah;
import androidx.core.app.C1832s;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89632c;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89641l;
import com.google.android.apps.gsa.shared.notificationlistening.collection.NotificationParseConfigs;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90435p;
import com.google.android.apps.gsa.shared.notificationlistening.common.StandardNotification;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90952r;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.notificationlistener.z */
/* compiled from: PG */
public final class C83410z implements C83382ab {

    /* renamed from: j */
    private static final C59071e f227304j = C59071e.m91332i("com.google.android.apps.gsa.notificationlistener.z");

    /* renamed from: a */
    public final Context f227305a;

    /* renamed from: b */
    public final C83387d f227306b;

    /* renamed from: c */
    public final C37215b f227307c;

    /* renamed from: d */
    public C83405u f227308d = C83405u.f227299a;

    /* renamed from: e */
    public NotificationParseConfigs f227309e = NotificationParseConfigs.f252367m;

    /* renamed from: f */
    public String f227310f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f227311g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f227312h = true;

    /* renamed from: i */
    public int f227313i = 1;

    /* renamed from: k */
    private final C88483e f227314k;

    /* renamed from: l */
    private final C22871g f227315l;

    /* renamed from: m */
    private final C91142g f227316m;

    /* renamed from: n */
    private final C21370a f227317n;

    /* renamed from: o */
    private final C83396l f227318o;

    public C83410z(Context context, C88483e eVar, C83387d dVar, C83396l lVar, C22871g gVar, C91142g gVar2, C37215b bVar, C21370a aVar) {
        this.f227305a = context;
        this.f227314k = eVar;
        this.f227306b = dVar;
        this.f227318o = lVar;
        this.f227315l = gVar;
        this.f227316m = gVar2;
        this.f227307c = bVar;
        this.f227317n = aVar;
    }

    /* renamed from: i */
    private final void m132757i(C87739bu buVar, Bundle bundle) {
        C88489j jVar = new C88489j(buVar);
        jVar.mo82015c(bundle);
        ClientEventData a = jVar.mo82013a();
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.OPA_ANDROID;
        gVar.f239204f = "notifications";
        this.f227315l.mo28211k(this.f227314k.mo82004b(new ClientConfig(gVar), a, 50000), "GNLS#processGenericClientEvent", new C90952r("GsaOnDemandAccessHelper", "Get active notifications", "failure"));
    }

    /* renamed from: j */
    private static final StatusBarNotification[] m132758j() {
        StatusBarNotification[] e = C83387d.m132715e(Optional.empty());
        if (e != null) {
            return e;
        }
        C59104x c = f227304j.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GsaOnDemandAccessHelper");
        ((C59052c) ((C59052c) c).mo56372aa(6661)).mo56386p("Failed to retrieve active notifications");
        return new StatusBarNotification[0];
    }

    /* renamed from: b */
    public final void mo76704b(String str, boolean z) {
        C1832s sVar;
        C58976aa aaVar = C58975e.f156826a;
        StatusBarNotification[] j = m132758j();
        int length = j.length;
        int i = 0;
        while (true) {
            if (i < length) {
                StatusBarNotification statusBarNotification = j[i];
                if (statusBarNotification != null && statusBarNotification.getKey() != null && statusBarNotification.getKey().equals(str)) {
                    sVar = C90366ae.m146963b(statusBarNotification.getNotification());
                    break;
                }
                i++;
            } else {
                sVar = null;
                break;
            }
        }
        if (sVar != null) {
            try {
                PendingIntent pendingIntent = sVar.f5662i;
                if (pendingIntent != null) {
                    pendingIntent.send();
                }
            } catch (PendingIntent.CanceledException e) {
                C59104x c = f227304j.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GsaOnDemandAccessHelper");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(6648)).mo56386p("MarkAsRead intent send failed");
                return;
            }
        }
        if (z) {
            C83387d.m132716f(str);
        }
    }

    /* renamed from: c */
    public final void mo76705c(String str, String str2) {
        C1832s sVar;
        C58976aa aaVar = C58975e.f156826a;
        StatusBarNotification[] j = m132758j();
        int length = j.length;
        int i = 0;
        while (true) {
            if (i < length) {
                StatusBarNotification statusBarNotification = j[i];
                if (statusBarNotification != null && statusBarNotification.getKey() != null && statusBarNotification.getKey().equals(str)) {
                    int a = C1791ah.m4933a(statusBarNotification.getNotification());
                    int i2 = 0;
                    while (true) {
                        if (i2 >= a) {
                            sVar = C90366ae.m146964c(statusBarNotification.getNotification());
                            break;
                        }
                        sVar = C1791ah.m4934b(statusBarNotification.getNotification().actions[i2]);
                        if (sVar.f5656c && C89632c.m145883a(sVar)) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    i++;
                }
            } else {
                sVar = null;
                break;
            }
        }
        if (sVar == null) {
            mo76710h(str, false, "Failed to find the notification or its reply action.");
        } else {
            C89632c.m145884b(this.f227305a, sVar, str2, new C83409y(this, str));
        }
    }

    /* renamed from: d */
    public final void mo76706d() {
        C83387d.m132714d(this);
        this.f227306b.mo76689a();
    }

    /* renamed from: e */
    public final void mo76707e(C83405u uVar) {
        StatusBarNotification[] j = m132758j();
        C58976aa aaVar = C58975e.f156826a;
        StatusBarNotification[] statusBarNotificationArr = (StatusBarNotification[]) uVar.mo76699c(Arrays.asList(j)).toArray(new StatusBarNotification[0]);
        int length = statusBarNotificationArr.length;
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("active_notifications", statusBarNotificationArr);
        m132757i(C87739bu.DELIVER_ACTIVE_NOTIFICATIONS, bundle);
        C83387d.m132713c();
    }

    /* renamed from: f */
    public final void mo76708f(C83405u uVar) {
        StatusBarNotification[] j = m132758j();
        C58976aa aaVar = C58975e.f156826a;
        List<StatusBarNotification> c = uVar.mo76699c(Arrays.asList(j));
        ArrayList arrayList = new ArrayList();
        if (!c.isEmpty()) {
            for (StatusBarNotification statusBarNotification : c) {
                Context context = this.f227305a;
                C21370a aVar = this.f227317n;
                String packageName = statusBarNotification.getPackageName();
                String b = C89641l.m145913b(context, packageName, context.getString(R.string.unknown_app_name));
                Bundle bundle = statusBarNotification.getNotification().extras;
                Object obj = bundle.get("android.text");
                Object obj2 = bundle.get("android.title");
                StandardNotification standardNotification = null;
                if (!(b == null || obj == null || obj2 == null)) {
                    C90435p pVar = new C90435p(aVar);
                    pVar.f252646r = obj.toString();
                    pVar.f252645q = obj2.toString();
                    pVar.f252575l = packageName;
                    pVar.f252565b = b;
                    pVar.f252576m = Long.valueOf(statusBarNotification.getPostTime());
                    pVar.f252573j = statusBarNotification.getKey();
                    standardNotification = new StandardNotification(pVar);
                }
                if (standardNotification != null) {
                    arrayList.add(standardNotification);
                }
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("app_notifications", arrayList);
        m132757i(C87739bu.DELIVER_APP_NOTIFICATIONS, bundle2);
        C83387d.m132713c();
    }

    /* renamed from: g */
    public final void mo76709g(C83405u uVar, NotificationParseConfigs notificationParseConfigs) {
        StatusBarNotification[] j = m132758j();
        C58976aa aaVar = C58975e.f156826a;
        ArrayList arrayList = new ArrayList(this.f227318o.mo76695a(uVar.mo76699c(Arrays.asList(j)), notificationParseConfigs));
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("parsed_notifications", arrayList);
        if (this.f227316m.mo85405j(C90025cd.f248161s)) {
            m132757i(C87739bu.DELIVER_PARSED_NOTIFICATIONS, bundle);
            this.f227315l.mo28211k(this.f227315l.mo28207g("Dumping audio content in notification if any", new C83407w(this, arrayList)), "Done dumping all audio contents", new C83408x());
            return;
        }
        m132757i(C87739bu.DELIVER_PARSED_NOTIFICATIONS, bundle);
        C83387d.m132713c();
    }

    /* renamed from: h */
    public final void mo76710h(String str, boolean z, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("notification_reply_notification", str);
        bundle.putBoolean("notification_reply_result", z);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("notification_reply_result", str2);
        }
        m132757i(C87739bu.NOTIFICATION_REPLY_RESULT, bundle);
        C83387d.m132713c();
    }

    /* renamed from: a */
    public final void mo40164a() {
        int i = this.f227313i;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                mo76707e(this.f227308d);
            } else if (i2 == 2) {
                mo76708f(this.f227308d);
            } else if (i2 == 3) {
                mo76709g(this.f227308d, this.f227309e);
            } else if (i2 == 4) {
                mo76705c(this.f227310f, this.f227311g);
            } else if (i2 == 5) {
                mo76704b(this.f227310f, this.f227312h);
            }
            this.f227313i = 1;
            this.f227308d = C83405u.f227299a;
            this.f227310f = BuildConfig.FLAVOR;
            this.f227311g = BuildConfig.FLAVOR;
            this.f227312h = true;
            C83387d.m132717g(this);
            return;
        }
        throw null;
    }
}
