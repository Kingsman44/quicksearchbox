package com.google.android.apps.gsa.staticplugins.opa.morris2.p8384e;

import android.content.Context;
import android.os.Bundle;
import android.provider.Telephony;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.notificationlistener.C83390g;
import com.google.android.apps.gsa.notificationlistener.C83396l;
import com.google.android.apps.gsa.notificationlistener.C83400p;
import com.google.android.apps.gsa.notificationlistener.C83401q;
import com.google.android.apps.gsa.notificationlistener.C83404t;
import com.google.android.apps.gsa.notificationlistener.C83405u;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.C89622at;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90364ac;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36599b;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

@Deprecated
/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.e.g */
/* compiled from: PG */
public final class C109517g implements C36599b {

    /* renamed from: a */
    public static final C59071e f305025a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.e.g");

    /* renamed from: b */
    public final C21370a f305026b;

    /* renamed from: c */
    public final Object f305027c = new Object();

    /* renamed from: d */
    public final C89622at f305028d;

    /* renamed from: e */
    public final C91142g f305029e;

    /* renamed from: f */
    public final Context f305030f;

    /* renamed from: g */
    public long f305031g;

    /* renamed from: h */
    public final C83396l f305032h;

    /* renamed from: i */
    private final C60888db f305033i;

    /* renamed from: j */
    private final C60888db f305034j;

    /* renamed from: k */
    private final C60836bq f305035k = new C60836bq();

    /* renamed from: l */
    private final C88483e f305036l;

    /* renamed from: m */
    private final List f305037m;

    public C109517g(Context context, C21370a aVar, C89622at atVar, C60888db dbVar, C60888db dbVar2, C88483e eVar, C91142g gVar, C90364ac acVar, C83396l lVar) {
        ArrayList arrayList = new ArrayList();
        this.f305037m = arrayList;
        this.f305031g = 0;
        this.f305026b = aVar;
        this.f305028d = atVar;
        this.f305033i = dbVar;
        this.f305034j = dbVar2;
        this.f305036l = eVar;
        this.f305029e = gVar;
        this.f305032h = lVar;
        this.f305030f = context;
        C83400p b = C83405u.m132748b();
        b.mo76679b().mo55395g(new C83401q(new String[]{"call", "msg"}));
        arrayList.add(b.mo76678a());
        HashSet g = C58758qx.m90649g(1);
        Collections.addAll(g, new String[]{"com.whatsapp"});
        if (gVar.mo85405j(C90051dc.f248894bw)) {
            C58976aa aaVar = C58975e.f156826a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(C89988b.m146551d(gVar.mo85403h(C90014bt.f247368fo)));
            linkedHashSet.addAll(C89988b.m146551d(gVar.mo85403h(C90014bt.f247367fn)));
            if (linkedHashSet.isEmpty()) {
                linkedHashSet.addAll(acVar.f252391c.keySet());
            }
            if (Telephony.Sms.getDefaultSmsPackage(context) != null) {
                linkedHashSet.add(Telephony.Sms.getDefaultSmsPackage(context));
            }
            g.addAll(linkedHashSet);
        }
        C83400p b2 = C83405u.m132748b();
        b2.mo76679b().mo55395g(new C83404t((String[]) g.toArray(new String[g.size()])));
        arrayList.add(b2.mo76678a());
    }

    /* renamed from: k */
    private final StatusBarNotification[] m182252k(StatusBarNotification[] statusBarNotificationArr) {
        StatusBarNotification[] statusBarNotificationArr2;
        if (statusBarNotificationArr == null || statusBarNotificationArr.length == 0) {
            return new StatusBarNotification[0];
        }
        synchronized (this.f305027c) {
            long j = this.f305031g;
            List<C83405u> list = this.f305037m;
            NotificationListenerService.RankingMap b = this.f305028d.mo83487b();
            ArrayList arrayList = new ArrayList();
            for (C83405u c : list) {
                arrayList.addAll(c.mo76699c(Arrays.asList(statusBarNotificationArr)));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                StatusBarNotification statusBarNotification = (StatusBarNotification) it.next();
                if (b != null) {
                    NotificationListenerService.Ranking ranking = new NotificationListenerService.Ranking();
                    if (b.getRanking(statusBarNotification.getKey(), ranking) && ranking.isSuspended()) {
                        it.remove();
                    }
                }
            }
            if (arrayList.isEmpty()) {
                statusBarNotificationArr2 = new StatusBarNotification[0];
            } else if (j == 0) {
                statusBarNotificationArr2 = new StatusBarNotification[arrayList.size()];
                arrayList.toArray(statusBarNotificationArr2);
            } else {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    StatusBarNotification statusBarNotification2 = (StatusBarNotification) arrayList.get(i);
                    if (statusBarNotification2.getPostTime() >= j) {
                        arrayList2.add(statusBarNotification2);
                    }
                }
                statusBarNotificationArr2 = (StatusBarNotification[]) arrayList2.toArray(new StatusBarNotification[0]);
            }
            C58976aa aaVar = C58975e.f156826a;
        }
        return statusBarNotificationArr2;
    }

    /* renamed from: a */
    public final void mo21529a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f305028d.mo83488c();
    }

    /* renamed from: b */
    public final void mo21530b(boolean z) {
        this.f305033i.execute(new C109513c(this, z));
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
        this.f305033i.execute(new C109512b(this, statusBarNotification));
    }

    /* renamed from: f */
    public final void mo21534f(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        this.f305033i.execute(new C109515e(this, statusBarNotification));
    }

    /* renamed from: g */
    public final void mo21535g(C83390g gVar) {
        this.f305033i.execute(new C109514d(this, gVar));
    }

    /* renamed from: h */
    public final void mo97881h(C87739bu buVar, String str, StatusBarNotification... statusBarNotificationArr) {
        StatusBarNotification[] k = m182252k(statusBarNotificationArr);
        if (k != null && k.length != 0) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(str, k);
            mo97883j(buVar, bundle);
        }
    }

    /* renamed from: i */
    public final void mo97882i(C87739bu buVar, StatusBarNotification... statusBarNotificationArr) {
        StatusBarNotification[] k = m182252k(statusBarNotificationArr);
        if (k != null && k.length != 0) {
            C60856cj.m92911t(this.f305035k.mo57304a(new C109509a(this, k), this.f305034j), new C109516f(this, buVar), this.f305033i);
        }
    }

    /* renamed from: j */
    public final void mo97883j(C87739bu buVar, Bundle bundle) {
        C88489j jVar = new C88489j(buVar);
        jVar.mo82015c(bundle);
        ClientEventData a = jVar.mo82013a();
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.OPA_ANDROID;
        gVar.f239204f = "morris";
        this.f305036l.mo82004b(new ClientConfig(gVar), a, 50000);
    }
}
