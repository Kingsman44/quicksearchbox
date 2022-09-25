package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6676cv.C85225a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.bs */
/* compiled from: PG */
public final class C117251bs extends C86734a implements C85225a {

    /* renamed from: a */
    public static final C59071e f325490a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchwidget.bs");

    /* renamed from: b */
    public final Context f325491b;

    /* renamed from: c */
    public final Object f325492c = new Object();

    /* renamed from: f */
    public C117250br f325493f = null;

    /* renamed from: g */
    public final C117204as f325494g;

    /* renamed from: h */
    private final C90931ca f325495h;

    /* renamed from: i */
    private final C22871g f325496i;

    /* renamed from: j */
    private final C22871g f325497j;

    /* renamed from: k */
    private final C89257aa f325498k;

    public C117251bs(Context context, C90931ca caVar, C22871g gVar, C117204as asVar, C89257aa aaVar, C22871g gVar2) {
        super(C118575h.WORKER_SEARCH_WIDGET, "searchwidget");
        this.f325491b = context;
        this.f325495h = caVar;
        this.f325496i = gVar;
        this.f325494g = asVar;
        this.f325498k = aaVar;
        this.f325497j = gVar2;
    }

    /* renamed from: a */
    public final C60870cx mo78803a() {
        return this.f325497j.mo28201a("isRequestPinAppWidgetSupported", new C117248bp(this));
    }

    /* renamed from: b */
    public final C60870cx mo78804b(Intent intent) {
        C59052c cVar = (C59052c) f325490a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "SearchWidgetFlow");
        ((C59052c) cVar.mo56372aa(32757)).mo56389s("SearchWidgetWorker:handleIntent(%s) started", intent);
        return this.f325495h.mo85141f(this.f325496i.mo28202b("handleIntentStatus", new C117245bm(this, intent)), new C117249bq(intent));
    }

    /* renamed from: c */
    public final C60870cx mo78805c() {
        ComponentName componentName;
        if (!this.f325498k.mo83220l() || this.f325498k.mo83221m()) {
            componentName = C89257aa.m145190b();
        } else {
            componentName = C89257aa.m145189a();
        }
        return C118826c.m197213c(this.f325497j.mo28201a("requestPinAppWidget", new C117244bl(this, componentName)));
    }

    /* renamed from: d */
    public final C60870cx mo78806d() {
        return this.f325496i.mo28209i(this.f325496i.mo28202b("searchWidgetRefresh", new C117246bn(this)), "WidgetRefreshDone", C117247bo.f325485a);
    }

    /* renamed from: e */
    public final void mo78807e(String str) {
        synchronized (this.f325492c) {
            C117250br brVar = this.f325493f;
            if (brVar == null) {
                C117250br brVar2 = new C117250br(this, str);
                this.f325493f = brVar2;
                this.f325495h.mo85137b(brVar2, 1000);
            } else {
                brVar.f325488a = str;
            }
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
