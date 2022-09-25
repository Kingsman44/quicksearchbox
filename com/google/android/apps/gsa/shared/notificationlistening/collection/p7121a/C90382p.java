package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.p */
/* compiled from: PG */
public final class C90382p {

    /* renamed from: a */
    public static final C59071e f252430a = C59071e.m91332i("com.google.android.apps.gsa.shared.notificationlistening.collection.a.p");

    /* renamed from: b */
    static final long f252431b = TimeUnit.SECONDS.toMillis(6);

    /* renamed from: c */
    static final long f252432c = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: d */
    public boolean f252433d;

    /* renamed from: e */
    public String f252434e;

    /* renamed from: f */
    public final TreeSet f252435f = new TreeSet(C90380n.f252420a);

    /* renamed from: g */
    private final C21370a f252436g;

    public C90382p(Context context, C89656k kVar, C21370a aVar, C90367af afVar) {
        this.f252436g = aVar;
        mo84085a(context, kVar, afVar);
    }

    /* renamed from: c */
    public static boolean m146986c(StatusBarNotification statusBarNotification) {
        if (statusBarNotification.getNotification().sound == null && statusBarNotification.getNotification().vibrate == null && (statusBarNotification.getNotification().defaults & 1) == 0 && (statusBarNotification.getNotification().defaults & 2) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo84085a(Context context, C89656k kVar, C90367af afVar) {
        C90381o oVar = new C90381o(this, context, kVar, afVar);
        C58976aa aaVar = C58975e.f156826a;
        this.f252434e = C90366ae.m146966e(afVar.f252393a);
        this.f252435f.add(oVar);
        mo84086b();
    }

    /* renamed from: b */
    public final void mo84086b() {
        long b = this.f252436g.mo26870b() - f252431b;
        C58976aa aaVar = C58975e.f156826a;
        Iterator it = this.f252435f.iterator();
        this.f252435f.size();
        while (it.hasNext() && this.f252435f.size() != 1 && ((C90381o) it.next()).f252421a < b) {
            it.remove();
        }
    }

    public final String toString() {
        String str = "Group: isChimeClaimed=" + this.f252433d + ", mostRecentSystemNotificationKey=" + this.f252434e + ", # versions=" + this.f252435f.size() + System.lineSeparator();
        Iterator it = this.f252435f.iterator();
        while (it.hasNext()) {
            str = str + "  " + ((C90381o) it.next()).toString() + System.lineSeparator();
        }
        return str;
    }
}
