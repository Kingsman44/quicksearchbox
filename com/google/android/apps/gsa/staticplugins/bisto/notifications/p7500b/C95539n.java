package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95209x;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95311q;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.n */
/* compiled from: PG */
public final /* synthetic */ class C95539n implements C95284n {

    /* renamed from: a */
    public final /* synthetic */ C95541p f267367a;

    /* renamed from: b */
    public final /* synthetic */ C95285o f267368b;

    /* renamed from: c */
    public final /* synthetic */ C95209x f267369c;

    /* renamed from: d */
    public final /* synthetic */ C95284n f267370d;

    /* renamed from: e */
    public final /* synthetic */ MessageNotification f267371e;

    public /* synthetic */ C95539n(C95541p pVar, C95285o oVar, C95209x xVar, C95284n nVar, MessageNotification messageNotification) {
        this.f267367a = pVar;
        this.f267368b = oVar;
        this.f267369c = xVar;
        this.f267370d = nVar;
        this.f267371e = messageNotification;
    }

    /* renamed from: a */
    public final void mo88601a() {
        C95541p pVar = this.f267367a;
        C95285o oVar = this.f267368b;
        C95209x xVar = this.f267369c;
        C95284n nVar = this.f267370d;
        MessageNotification messageNotification = this.f267371e;
        C58976aa aaVar = C58975e.f156826a;
        int c = oVar.mo89203c(xVar, nVar);
        C95311q.m157570d(pVar.f267277k, c);
        if (c != 0) {
            pVar.mo89441M(messageNotification);
        }
    }
}
