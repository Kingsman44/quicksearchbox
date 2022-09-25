package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i;

import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95174a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.c */
/* compiled from: PG */
public final class C95679c implements C95174a {

    /* renamed from: a */
    final /* synthetic */ List f267844a;

    /* renamed from: b */
    final /* synthetic */ C95688l f267845b;

    /* renamed from: c */
    final /* synthetic */ C95680d f267846c;

    public C95679c(C95680d dVar, List list, C95688l lVar) {
        this.f267846c = dVar;
        this.f267844a = list;
        this.f267845b = lVar;
    }

    /* renamed from: a */
    public final void mo89085a() {
    }

    /* renamed from: b */
    public final void mo89086b() {
        C95680d dVar = this.f267846c;
        List list = this.f267844a;
        C95688l lVar = this.f267845b;
        String a = dVar.mo89634a();
        if (a != null && !list.isEmpty()) {
            dVar.f267848b.mo28212l("play-prompt", new C95678b(dVar, lVar, a));
        }
    }
}
