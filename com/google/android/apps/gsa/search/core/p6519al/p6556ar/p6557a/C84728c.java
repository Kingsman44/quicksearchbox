package com.google.android.apps.gsa.search.core.p6519al.p6556ar.p6557a;

import com.google.android.apps.gsa.handsfree.notifications.RemoteNotification;
import com.google.android.apps.gsa.search.core.p6519al.p6556ar.C84725a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86727g;
import com.google.android.apps.gsa.search.shared.service.p6935b.aaj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.al.ar.a.c */
/* compiled from: PG */
public final class C84728c implements C84725a {

    /* renamed from: a */
    private final C68214a f230362a;

    public C84728c(C68214a aVar) {
        this.f230362a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo78443a(aaj aaj) {
        C84727b bVar = new C84727b(aaj);
        ((C86727g) this.f230362a.mo27525b()).mo80313b(bVar);
        return bVar;
    }

    /* renamed from: b */
    public final void mo78444b(RemoteNotification remoteNotification) {
        ((C86727g) this.f230362a.mo27525b()).mo80313b(new C84726a(remoteNotification));
    }

    /* renamed from: c */
    public final void mo78445c() {
        ((C86727g) this.f230362a.mo27525b()).mo80313b(new C84729d());
    }
}
